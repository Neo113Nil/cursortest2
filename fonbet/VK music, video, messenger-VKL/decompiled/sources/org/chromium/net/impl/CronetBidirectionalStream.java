package org.chromium.net.impl;

import android.os.Process;
import internal.org.jni_zero.CalledByNative;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.time.Duration;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.base.Log;
import org.chromium.base.metrics.ScopedSysTraceEvent;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.impl.CronetLogger;
import org.chromium.net.impl.UrlResponseInfoImpl;
import org.chromium.net.impl.VersionSafeCallbacks;
import xsna.go9;
import xsna.ls2;
import xsna.o4;
import xsna.sl9;
import xsna.tgw;

/* loaded from: classes8.dex */
public class CronetBidirectionalStream extends ExperimentalBidirectionalStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final VersionSafeCallbacks.BidirectionalStreamCallback mCallback;
    private final boolean mDelayRequestHeadersUntilFirstFlush;
    private boolean mEndOfStreamWritten;
    private CronetException mException;
    private final Executor mExecutor;
    private boolean mFinalUserCallbackThrew;
    private int mFlushCount;
    private RefCountDelegate mInflightDoneCallbackCount;
    private final String mInitialMethod;
    private final int mInitialPriority;
    private final String mInitialUrl;
    private final CronetLogger mLogger;
    private CronetMetrics mMetrics;
    private long mNativeStream;
    private final long mNetworkHandle;
    private int mNonfinalUserCallbackExceptionCount;
    private Runnable mOnDestroyedCallbackForTesting;
    private OnReadCompletedRunnable mOnReadCompletedTask;
    private boolean mQuicConnectionMigrationAttempted;
    private boolean mQuicConnectionMigrationSuccessful;
    private int mReadCount;
    private final Collection<Object> mRequestAnnotations;
    private final CronetUrlRequestContext mRequestContext;
    private final String[] mRequestHeaders;
    private boolean mRequestHeadersSent;
    private UrlResponseInfoImpl mResponseInfo;
    private final int mTrafficStatsTag;
    private final boolean mTrafficStatsTagSet;
    private final int mTrafficStatsUid;
    private final boolean mTrafficStatsUidSet;
    private final Object mNativeStreamLock = new Object();
    private int mReadState = 0;
    private int mWriteState = 0;
    private final LinkedList<ByteBuffer> mPendingData = new LinkedList<>();
    private final LinkedList<ByteBuffer> mFlushData = new LinkedList<>();

    public interface Natives {
        long createBidirectionalStream(CronetBidirectionalStream cronetBidirectionalStream, long j, boolean z, boolean z2, int i, boolean z3, int i2, long j2);

        void destroy(long j, boolean z);

        boolean readData(long j, ByteBuffer byteBuffer, int i, int i2);

        void sendRequestHeaders(long j);

        int start(long j, String str, int i, String str2, String[] strArr, boolean z);

        boolean writevData(long j, ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z);
    }

    public final class OnReadCompletedRunnable implements Runnable {
        ByteBuffer mByteBuffer;
        boolean mEndOfStream;

        public /* synthetic */ OnReadCompletedRunnable(CronetBidirectionalStream cronetBidirectionalStream, int i) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ByteBuffer byteBuffer = this.mByteBuffer;
                this.mByteBuffer = null;
                synchronized (CronetBidirectionalStream.this.mNativeStreamLock) {
                    try {
                        if (CronetBidirectionalStream.this.isDoneLocked()) {
                            return;
                        }
                        boolean z = false;
                        if (this.mEndOfStream) {
                            CronetBidirectionalStream.this.mReadState = 4;
                            if (CronetBidirectionalStream.this.mWriteState == 10) {
                                z = true;
                            }
                        } else {
                            CronetBidirectionalStream.this.mReadState = 2;
                        }
                        VersionSafeCallbacks.BidirectionalStreamCallback bidirectionalStreamCallback = CronetBidirectionalStream.this.mCallback;
                        CronetBidirectionalStream cronetBidirectionalStream = CronetBidirectionalStream.this;
                        bidirectionalStreamCallback.onReadCompleted(cronetBidirectionalStream, cronetBidirectionalStream.mResponseInfo, byteBuffer, this.mEndOfStream);
                        if (z) {
                            CronetBidirectionalStream.this.maybeOnSucceededOnExecutor();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                CronetBidirectionalStream.this.onNonfinalCallbackException(e);
            }
        }

        private OnReadCompletedRunnable() {
        }
    }

    public final class OnWriteCompletedRunnable implements Runnable {
        private ByteBuffer mByteBuffer;
        private final boolean mEndOfStream;

        public OnWriteCompletedRunnable(ByteBuffer byteBuffer, boolean z) {
            this.mByteBuffer = byteBuffer;
            this.mEndOfStream = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ByteBuffer byteBuffer = this.mByteBuffer;
                this.mByteBuffer = null;
                synchronized (CronetBidirectionalStream.this.mNativeStreamLock) {
                    try {
                        if (CronetBidirectionalStream.this.isDoneLocked()) {
                            return;
                        }
                        boolean z = false;
                        if (this.mEndOfStream) {
                            CronetBidirectionalStream.this.mWriteState = 10;
                            if (CronetBidirectionalStream.this.mReadState == 4) {
                                z = true;
                            }
                        }
                        VersionSafeCallbacks.BidirectionalStreamCallback bidirectionalStreamCallback = CronetBidirectionalStream.this.mCallback;
                        CronetBidirectionalStream cronetBidirectionalStream = CronetBidirectionalStream.this;
                        bidirectionalStreamCallback.onWriteCompleted(cronetBidirectionalStream, cronetBidirectionalStream.mResponseInfo, byteBuffer, this.mEndOfStream);
                        if (z) {
                            CronetBidirectionalStream.this.maybeOnSucceededOnExecutor();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                CronetBidirectionalStream.this.onNonfinalCallbackException(e);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
        public static final int CANCELED = 5;
        public static final int ERROR = 6;
        public static final int NOT_STARTED = 0;
        public static final int READING = 3;
        public static final int READING_DONE = 4;
        public static final int STARTED = 1;
        public static final int SUCCESS = 7;
        public static final int WAITING_FOR_FLUSH = 8;
        public static final int WAITING_FOR_READ = 2;
        public static final int WRITING = 9;
        public static final int WRITING_DONE = 10;
    }

    public CronetBidirectionalStream(CronetUrlRequestContext cronetUrlRequestContext, String str, int i, BidirectionalStream.Callback callback, Executor executor, String str2, List<Map.Entry<String, String>> list, boolean z, Collection<Object> collection, boolean z2, int i2, boolean z3, int i3, long j) {
        this.mRequestContext = cronetUrlRequestContext;
        this.mInitialUrl = str;
        this.mInitialPriority = convertStreamPriority(i);
        this.mCallback = new VersionSafeCallbacks.BidirectionalStreamCallback(callback);
        this.mExecutor = executor;
        this.mInitialMethod = str2;
        this.mRequestHeaders = stringsFromHeaderList(list);
        this.mDelayRequestHeadersUntilFirstFlush = z;
        this.mRequestAnnotations = collection;
        this.mTrafficStatsTagSet = z2;
        this.mTrafficStatsTag = i2;
        this.mTrafficStatsUidSet = z3;
        this.mTrafficStatsUid = i3;
        this.mNetworkHandle = j;
        this.mLogger = cronetUrlRequestContext.getCronetLogger();
    }

    private CronetLogger.CronetTrafficInfo buildCronetTrafficInfo(int i, boolean z, boolean z2) {
        Map<String, List<String>> map;
        String str;
        boolean z3;
        int i2;
        long estimateHeadersSizeInBytes;
        long max;
        long estimateHeadersSizeInBytes2;
        long max2;
        CronetLogger.CronetTrafficInfo.RequestFailureReason requestFailureReason;
        int i3;
        int quicDetailedErrorCode;
        int connectionCloseSource;
        UrlResponseInfoImpl urlResponseInfoImpl = this.mResponseInfo;
        if (urlResponseInfoImpl != null) {
            map = urlResponseInfoImpl.getAllHeaders();
            str = this.mResponseInfo.getNegotiatedProtocol();
            int httpStatusCode = this.mResponseInfo.getHttpStatusCode();
            z3 = this.mResponseInfo.wasCached();
            i2 = httpStatusCode;
        } else {
            map = Collections.EMPTY_MAP;
            str = "";
            z3 = false;
            i2 = 0;
        }
        String str2 = str;
        long longValue = this.mMetrics.getSentByteCount().longValue();
        if (z3 && longValue == 0) {
            max = 0;
            estimateHeadersSizeInBytes = 0;
        } else {
            estimateHeadersSizeInBytes = CronetRequestCommon.estimateHeadersSizeInBytes(this.mRequestHeaders);
            max = Math.max(0L, longValue - estimateHeadersSizeInBytes);
        }
        long longValue2 = this.mMetrics.getReceivedByteCount().longValue();
        if (z3 && longValue2 == 0) {
            max2 = 0;
            estimateHeadersSizeInBytes2 = 0;
        } else {
            estimateHeadersSizeInBytes2 = CronetRequestCommon.estimateHeadersSizeInBytes(map);
            max2 = Math.max(0L, longValue2 - estimateHeadersSizeInBytes2);
        }
        Duration ofSeconds = (this.mMetrics.getRequestStart() == null || this.mMetrics.getResponseStart() == null) ? Duration.ofSeconds(0L) : Duration.ofMillis(this.mMetrics.getResponseStart().getTime() - this.mMetrics.getRequestStart().getTime());
        Duration ofSeconds2 = (this.mMetrics.getRequestStart() == null || this.mMetrics.getRequestEnd() == null) ? Duration.ofSeconds(0L) : Duration.ofMillis(this.mMetrics.getRequestEnd().getTime() - this.mMetrics.getRequestStart().getTime());
        CronetLogger.CronetTrafficInfo.RequestFailureReason requestFailureReason2 = CronetLogger.CronetTrafficInfo.RequestFailureReason.UNKNOWN;
        CronetException cronetException = this.mException;
        if (cronetException instanceof NetworkExceptionImpl) {
            i3 = ((NetworkExceptionImpl) cronetException).getCronetInternalErrorCode();
            requestFailureReason = CronetLogger.CronetTrafficInfo.RequestFailureReason.NETWORK;
        } else {
            if (cronetException instanceof QuicExceptionImpl) {
                QuicExceptionImpl quicExceptionImpl = (QuicExceptionImpl) cronetException;
                i3 = quicExceptionImpl.getCronetInternalErrorCode();
                quicDetailedErrorCode = quicExceptionImpl.getQuicDetailedErrorCode();
                connectionCloseSource = quicExceptionImpl.getConnectionCloseSource();
                requestFailureReason = CronetLogger.CronetTrafficInfo.RequestFailureReason.NETWORK;
                return new CronetLogger.CronetTrafficInfo(estimateHeadersSizeInBytes, max, estimateHeadersSizeInBytes2, max2, i2, ofSeconds, ofSeconds2, str2, z, z2, CronetRequestCommon.finishedReasonToCronetTrafficInfoRequestTerminalState(i), this.mNonfinalUserCallbackExceptionCount, this.mReadCount, this.mFlushCount, true, this.mFinalUserCallbackThrew, Process.myUid(), i3, quicDetailedErrorCode, connectionCloseSource, requestFailureReason, this.mMetrics.getSocketReused(), ImplVersion.getCronetVersion(), NativeCronetEngineBuilderImpl.getCronetSource());
            }
            if (cronetException != null) {
                requestFailureReason2 = CronetLogger.CronetTrafficInfo.RequestFailureReason.OTHER;
            }
            requestFailureReason = requestFailureReason2;
            i3 = 0;
        }
        quicDetailedErrorCode = 0;
        connectionCloseSource = 0;
        return new CronetLogger.CronetTrafficInfo(estimateHeadersSizeInBytes, max, estimateHeadersSizeInBytes2, max2, i2, ofSeconds, ofSeconds2, str2, z, z2, CronetRequestCommon.finishedReasonToCronetTrafficInfoRequestTerminalState(i), this.mNonfinalUserCallbackExceptionCount, this.mReadCount, this.mFlushCount, true, this.mFinalUserCallbackThrew, Process.myUid(), i3, quicDetailedErrorCode, connectionCloseSource, requestFailureReason, this.mMetrics.getSocketReused(), ImplVersion.getCronetVersion(), NativeCronetEngineBuilderImpl.getCronetSource());
    }

    private static int convertStreamPriority(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        throw new IllegalArgumentException("Invalid stream priority.");
    }

    private void destroyNativeStreamLocked(boolean z) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetBidirectionalStream#destroyNativeStreamLocked");
        try {
            Log.i(CronetUrlRequestContext.LOG_TAG, "destroyNativeStreamLocked " + toString());
            if (this.mNativeStream == 0) {
                if (scoped != null) {
                    scoped.close();
                    return;
                }
                return;
            }
            CronetBidirectionalStreamJni.get().destroy(this.mNativeStream, z);
            if (this.mReadState != 0) {
                this.mRequestContext.onRequestDestroyed();
            }
            this.mNativeStream = 0L;
            Runnable runnable = this.mOnDestroyedCallbackForTesting;
            if (runnable != null) {
                runnable.run();
            }
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean doesMethodAllowWriteData(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    private void failWithException(final CronetException cronetException) {
        postTaskToExecutor(new Runnable(this) { // from class: org.chromium.net.impl.CronetBidirectionalStream.5
            final /* synthetic */ CronetBidirectionalStream this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.failWithExceptionOnExecutor(cronetException);
            }
        }, "failWithException");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void failWithExceptionOnExecutor(CronetException cronetException) {
        this.mException = cronetException;
        synchronized (this.mNativeStreamLock) {
            try {
                if (isDoneLocked()) {
                    return;
                }
                this.mWriteState = 6;
                this.mReadState = 6;
                destroyNativeStreamLocked(false);
                try {
                    this.mCallback.onFailed(this, this.mResponseInfo, cronetException);
                } catch (Exception e) {
                    onFinalCallbackException("onFailed", e);
                }
                this.mInflightDoneCallbackCount.decrement();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private int getFinishedReason() {
        int i = this.mReadState;
        if (i != this.mWriteState) {
            throw new IllegalStateException(sl9.c(this.mReadState, this.mWriteState, "Cronet bidirectional stream read state is ", " which is different from write state ", "!"));
        }
        if (i == 5) {
            return 2;
        }
        if (i == 6) {
            return 1;
        }
        if (i == 7) {
            return 0;
        }
        throw new IllegalStateException(tgw.b(this.mReadState, "Cronet bidirectional stream read state is ", " which is not a valid finished state!"));
    }

    private static ArrayList<Map.Entry<String, String>> headersListFromStrings(String[] strArr) {
        ArrayList<Map.Entry<String, String>> arrayList = new ArrayList<>(strArr.length / 2);
        for (int i = 0; i < strArr.length; i += 2) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry(strArr[i], strArr[i + 1]));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDoneLocked() {
        return this.mReadState != 0 && this.mNativeStream == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$postTaskToExecutor$0(String str, Runnable runnable) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetBidirectionalStream#postTaskToExecutor " + str + " running callback");
        try {
            runnable.run();
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeOnSucceededOnExecutor() {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetBidirectionalStream#maybeOnSucceededOnExecutor");
        try {
            synchronized (this.mNativeStreamLock) {
                if (isDoneLocked()) {
                    if (scoped != null) {
                        scoped.close();
                        return;
                    }
                    return;
                }
                if (this.mWriteState == 10 && this.mReadState == 4) {
                    this.mWriteState = 7;
                    this.mReadState = 7;
                    destroyNativeStreamLocked(false);
                    try {
                        this.mCallback.onSucceeded(this, this.mResponseInfo);
                    } catch (Exception e) {
                        onFinalCallbackException("onSucceeded", e);
                    }
                    this.mInflightDoneCallbackCount.decrement();
                    if (scoped != null) {
                        scoped.close();
                        return;
                    }
                    return;
                }
                if (scoped != null) {
                    scoped.close();
                }
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @CalledByNative
    private void onCanceled() {
        postTaskToExecutor(new Runnable() { // from class: org.chromium.net.impl.CronetBidirectionalStream.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    VersionSafeCallbacks.BidirectionalStreamCallback bidirectionalStreamCallback = CronetBidirectionalStream.this.mCallback;
                    CronetBidirectionalStream cronetBidirectionalStream = CronetBidirectionalStream.this;
                    bidirectionalStreamCallback.onCanceled(cronetBidirectionalStream, cronetBidirectionalStream.mResponseInfo);
                } catch (Exception e) {
                    CronetBidirectionalStream.this.onFinalCallbackException("onCanceled", e);
                }
                CronetBidirectionalStream.this.mInflightDoneCallbackCount.decrement();
            }
        }, "onCanceled");
    }

    @CalledByNative
    private void onError(int i, int i2, int i3, int i4, String str, long j) {
        UrlResponseInfoImpl urlResponseInfoImpl = this.mResponseInfo;
        if (urlResponseInfoImpl != null) {
            urlResponseInfoImpl.setReceivedByteCount(j);
        }
        if (i == 10 || i3 != 0) {
            failWithException(new QuicExceptionImpl(go9.b("Exception in BidirectionalStream: ", str), i, i2, i3, i4));
        } else {
            failWithException(new BidirectionalStreamNetworkException(go9.b("Exception in BidirectionalStream: ", str), i, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFinalCallbackException(String str, Exception exc) {
        this.mFinalUserCallbackThrew = true;
        Log.e(CronetUrlRequestContext.LOG_TAG, "Exception in " + str + " method", (Throwable) exc);
    }

    @CalledByNative
    private void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15, boolean z2, boolean z3) {
        try {
            if (this.mMetrics != null) {
                throw new IllegalStateException("Metrics collection should only happen once.");
            }
            CronetMetrics cronetMetrics = new CronetMetrics(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z, j14, j15);
            this.mMetrics = cronetMetrics;
            this.mQuicConnectionMigrationAttempted = z2;
            this.mQuicConnectionMigrationSuccessful = z3;
            this.mRequestContext.reportRequestFinished(new RequestFinishedInfoImpl(this.mInitialUrl, this.mRequestAnnotations, cronetMetrics, getFinishedReason(), this.mResponseInfo, this.mException), this.mInflightDoneCallbackCount, null);
        } finally {
            this.mInflightDoneCallbackCount.decrement();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNonfinalCallbackException(Exception exc) {
        this.mNonfinalUserCallbackExceptionCount++;
        CallbackExceptionImpl callbackExceptionImpl = new CallbackExceptionImpl("CalledByNative method has thrown an exception", exc);
        Log.e(CronetUrlRequestContext.LOG_TAG, "Exception in CalledByNative method", (Throwable) exc);
        failWithExceptionOnExecutor(callbackExceptionImpl);
    }

    @CalledByNative
    private void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        int i4;
        this.mResponseInfo.setReceivedByteCount(j);
        if (byteBuffer.position() != i2 || byteBuffer.limit() != i3) {
            failWithException(new CronetExceptionImpl("ByteBuffer modified externally during read", null));
            return;
        }
        if (i < 0 || (i4 = i2 + i) > i3) {
            failWithException(new CronetExceptionImpl("Invalid number of bytes read", null));
            return;
        }
        OnReadCompletedRunnable onReadCompletedRunnable = this.mOnReadCompletedTask;
        onReadCompletedRunnable.mByteBuffer = byteBuffer;
        onReadCompletedRunnable.mEndOfStream = i == 0;
        postTaskToExecutor(onReadCompletedRunnable, "onReadCompleted");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onRequestFinished() {
        this.mLogger.logCronetTrafficInfo(this.mRequestContext.getLogId(), buildCronetTrafficInfo(getFinishedReason(), this.mQuicConnectionMigrationAttempted, this.mQuicConnectionMigrationSuccessful));
        this.mRequestContext.onRequestFinished();
    }

    @CalledByNative
    private void onResponseHeadersReceived(int i, String str, String[] strArr, long j) {
        try {
            try {
                this.mResponseInfo = prepareResponseInfoOnNetworkThread(i, str, strArr, j);
                postTaskToExecutor(new Runnable() { // from class: org.chromium.net.impl.CronetBidirectionalStream.2
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (CronetBidirectionalStream.this.mNativeStreamLock) {
                            try {
                                if (CronetBidirectionalStream.this.isDoneLocked()) {
                                    return;
                                }
                                CronetBidirectionalStream.this.mReadState = 2;
                                try {
                                    VersionSafeCallbacks.BidirectionalStreamCallback bidirectionalStreamCallback = CronetBidirectionalStream.this.mCallback;
                                    CronetBidirectionalStream cronetBidirectionalStream = CronetBidirectionalStream.this;
                                    bidirectionalStreamCallback.onResponseHeadersReceived(cronetBidirectionalStream, cronetBidirectionalStream.mResponseInfo);
                                } catch (Exception e) {
                                    CronetBidirectionalStream.this.onNonfinalCallbackException(e);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }, "onResponseHeadersReceived");
            } catch (Exception unused) {
                failWithException(new CronetExceptionImpl("Cannot prepare ResponseInfo", null));
            }
        } catch (Exception unused2) {
        }
    }

    @CalledByNative
    private void onResponseTrailersReceived(String[] strArr) {
        final UrlResponseInfoImpl.HeaderBlockImpl headerBlockImpl = new UrlResponseInfoImpl.HeaderBlockImpl(headersListFromStrings(strArr));
        postTaskToExecutor(new Runnable(this) { // from class: org.chromium.net.impl.CronetBidirectionalStream.3
            final /* synthetic */ CronetBidirectionalStream this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (this.this$0.mNativeStreamLock) {
                    try {
                        if (this.this$0.isDoneLocked()) {
                            return;
                        }
                        try {
                            VersionSafeCallbacks.BidirectionalStreamCallback bidirectionalStreamCallback = this.this$0.mCallback;
                            CronetBidirectionalStream cronetBidirectionalStream = this.this$0;
                            bidirectionalStreamCallback.onResponseTrailersReceived(cronetBidirectionalStream, cronetBidirectionalStream.mResponseInfo, headerBlockImpl);
                        } catch (Exception e) {
                            this.this$0.onNonfinalCallbackException(e);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }, "onResponseTrailersReceived");
    }

    @CalledByNative
    private void onStreamReady(final boolean z) {
        postTaskToExecutor(new Runnable(this) { // from class: org.chromium.net.impl.CronetBidirectionalStream.1
            final /* synthetic */ CronetBidirectionalStream this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (this.this$0.mNativeStreamLock) {
                    try {
                        if (this.this$0.isDoneLocked()) {
                            return;
                        }
                        this.this$0.mRequestHeadersSent = z;
                        this.this$0.mReadState = 2;
                        if (CronetBidirectionalStream.doesMethodAllowWriteData(this.this$0.mInitialMethod) || !this.this$0.mRequestHeadersSent) {
                            this.this$0.mWriteState = 8;
                        } else {
                            this.this$0.mWriteState = 10;
                        }
                        try {
                            this.this$0.mCallback.onStreamReady(this.this$0);
                        } catch (Exception e) {
                            this.this$0.onNonfinalCallbackException(e);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }, "onStreamReady");
    }

    @CalledByNative
    private void onWritevCompleted(ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z) {
        boolean z2;
        synchronized (this.mNativeStreamLock) {
            try {
                if (isDoneLocked()) {
                    return;
                }
                this.mWriteState = 8;
                if (!this.mFlushData.isEmpty()) {
                    sendFlushDataLocked();
                }
                for (int i = 0; i < byteBufferArr.length; i++) {
                    ByteBuffer byteBuffer = byteBufferArr[i];
                    if (byteBuffer.position() != iArr[i] || byteBuffer.limit() != iArr2[i]) {
                        failWithException(new CronetExceptionImpl("ByteBuffer modified externally during write", null));
                        return;
                    }
                    if (z) {
                        z2 = true;
                        if (i == byteBufferArr.length - 1) {
                            postTaskToExecutor(new OnWriteCompletedRunnable(byteBuffer, z2), "onWritevCompleted");
                        }
                    }
                    z2 = false;
                    postTaskToExecutor(new OnWriteCompletedRunnable(byteBuffer, z2), "onWritevCompleted");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void postTaskToExecutor(Runnable runnable, String str) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetBidirectionalStream#postTaskToExecutor " + str);
        try {
            try {
                this.mExecutor.execute(new ls2(2, str, runnable));
            } catch (RejectedExecutionException e) {
                Log.e(CronetUrlRequestContext.LOG_TAG, "Exception posting task to executor", (Throwable) e);
                synchronized (this.mNativeStreamLock) {
                    this.mWriteState = 6;
                    this.mReadState = 6;
                    destroyNativeStreamLocked(false);
                }
            }
            if (scoped != null) {
                scoped.close();
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private UrlResponseInfoImpl prepareResponseInfoOnNetworkThread(int i, String str, String[] strArr, long j) {
        return new UrlResponseInfoImpl(Arrays.asList(this.mInitialUrl), i, "", headersListFromStrings(strArr), false, str, null, j);
    }

    private void sendFlushDataLocked() {
        int size = this.mFlushData.size();
        ByteBuffer[] byteBufferArr = new ByteBuffer[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        for (int i = 0; i < size; i++) {
            ByteBuffer poll = this.mFlushData.poll();
            byteBufferArr[i] = poll;
            iArr[i] = poll.position();
            iArr2[i] = poll.limit();
        }
        this.mWriteState = 9;
        this.mRequestHeadersSent = true;
        Natives natives = CronetBidirectionalStreamJni.get();
        boolean z = false;
        long j = this.mNativeStream;
        if (this.mEndOfStreamWritten && this.mPendingData.isEmpty()) {
            z = true;
        }
        if (natives.writevData(j, byteBufferArr, iArr, iArr2, z)) {
            return;
        }
        this.mWriteState = 8;
        throw new IllegalArgumentException("Unable to call native writev.");
    }

    private static String[] stringsFromHeaderList(List<Map.Entry<String, String>> list) {
        String[] strArr = new String[list.size() * 2];
        int i = 0;
        for (Map.Entry<String, String> entry : list) {
            int i2 = i + 1;
            strArr[i] = entry.getKey();
            i += 2;
            strArr[i2] = entry.getValue();
        }
        return strArr;
    }

    @Override // org.chromium.net.BidirectionalStream
    public void cancel() {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetBidirectionalStream#cancel");
        try {
            synchronized (this.mNativeStreamLock) {
                if (!isDoneLocked() && this.mReadState != 0) {
                    this.mWriteState = 5;
                    this.mReadState = 5;
                    destroyNativeStreamLocked(true);
                    if (scoped != null) {
                        scoped.close();
                        return;
                    }
                    return;
                }
                if (scoped != null) {
                    scoped.close();
                }
            }
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public void flush() {
        int i;
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetBidirectionalStream#flush");
        try {
            synchronized (this.mNativeStreamLock) {
                try {
                    if (!isDoneLocked() && ((i = this.mWriteState) == 8 || i == 9)) {
                        if (this.mPendingData.isEmpty() && this.mFlushData.isEmpty()) {
                            if (!this.mRequestHeadersSent) {
                                this.mRequestHeadersSent = true;
                                CronetBidirectionalStreamJni.get().sendRequestHeaders(this.mNativeStream);
                                if (!doesMethodAllowWriteData(this.mInitialMethod)) {
                                    this.mWriteState = 10;
                                }
                            }
                            if (scoped != null) {
                                scoped.close();
                                return;
                            }
                            return;
                        }
                        if (!this.mPendingData.isEmpty()) {
                            this.mFlushData.addAll(this.mPendingData);
                            this.mPendingData.clear();
                        }
                        if (this.mWriteState == 9) {
                            if (scoped != null) {
                                scoped.close();
                                return;
                            }
                            return;
                        } else {
                            sendFlushDataLocked();
                            this.mFlushCount++;
                            if (scoped != null) {
                                scoped.close();
                                return;
                            }
                            return;
                        }
                    }
                    if (scoped != null) {
                        scoped.close();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public List<ByteBuffer> getFlushDataForTesting() {
        LinkedList linkedList;
        synchronized (this.mNativeStreamLock) {
            try {
                linkedList = new LinkedList();
                Iterator<ByteBuffer> it = this.mFlushData.iterator();
                while (it.hasNext()) {
                    linkedList.add(it.next().asReadOnlyBuffer());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedList;
    }

    public List<ByteBuffer> getPendingDataForTesting() {
        LinkedList linkedList;
        synchronized (this.mNativeStreamLock) {
            try {
                linkedList = new LinkedList();
                Iterator<ByteBuffer> it = this.mPendingData.iterator();
                while (it.hasNext()) {
                    linkedList.add(it.next().asReadOnlyBuffer());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedList;
    }

    @Override // org.chromium.net.BidirectionalStream
    public boolean isDone() {
        boolean isDoneLocked;
        synchronized (this.mNativeStreamLock) {
            isDoneLocked = isDoneLocked();
        }
        return isDoneLocked;
    }

    @Override // org.chromium.net.BidirectionalStream
    public void read(ByteBuffer byteBuffer) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetBidirectionalStream#read");
        try {
            synchronized (this.mNativeStreamLock) {
                Preconditions.checkHasRemaining(byteBuffer);
                Preconditions.checkDirect(byteBuffer);
                if (this.mReadState != 2) {
                    throw new IllegalStateException("Unexpected read attempt.");
                }
                if (isDoneLocked()) {
                    if (scoped != null) {
                        scoped.close();
                        return;
                    }
                    return;
                }
                if (this.mOnReadCompletedTask == null) {
                    this.mOnReadCompletedTask = new OnReadCompletedRunnable(this, 0);
                }
                this.mReadState = 3;
                if (!CronetBidirectionalStreamJni.get().readData(this.mNativeStream, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                    this.mReadState = 2;
                    throw new IllegalArgumentException("Unable to call native read");
                }
                this.mReadCount++;
                if (scoped != null) {
                    scoped.close();
                }
            }
        } catch (Throwable th) {
            if (scoped == null) {
                throw th;
            }
            try {
                scoped.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public void setOnDestroyedCallbackForTesting(Runnable runnable) {
        this.mOnDestroyedCallbackForTesting = runnable;
    }

    @Override // org.chromium.net.BidirectionalStream
    public void start() {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetBidirectionalStream#start");
        try {
            synchronized (this.mNativeStreamLock) {
                if (this.mReadState != 0) {
                    throw new IllegalStateException("Stream is already started.");
                }
                try {
                    this.mNativeStream = CronetBidirectionalStreamJni.get().createBidirectionalStream(this, this.mRequestContext.getUrlRequestContextAdapter(), !this.mDelayRequestHeadersUntilFirstFlush, this.mTrafficStatsTagSet, this.mTrafficStatsTag, this.mTrafficStatsUidSet, this.mTrafficStatsUid, this.mNetworkHandle);
                    int start = CronetBidirectionalStreamJni.get().start(this.mNativeStream, this.mInitialUrl, this.mInitialPriority, this.mInitialMethod, this.mRequestHeaders, !doesMethodAllowWriteData(r5));
                    if (start == -1) {
                        throw new IllegalArgumentException("Invalid http method " + this.mInitialMethod);
                    }
                    if (start > 0) {
                        throw new IllegalArgumentException("Invalid header with headername: " + this.mRequestHeaders[start - 1]);
                    }
                    this.mRequestContext.onRequestStarted();
                    RefCountDelegate refCountDelegate = new RefCountDelegate(new o4(this, 8));
                    this.mInflightDoneCallbackCount = refCountDelegate;
                    refCountDelegate.increment();
                    this.mWriteState = 1;
                    this.mReadState = 1;
                } catch (RuntimeException e) {
                    destroyNativeStreamLocked(false);
                    throw e;
                }
            }
            if (scoped != null) {
                scoped.close();
            }
        } finally {
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public void write(ByteBuffer byteBuffer, boolean z) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("CronetBidirectionalStream#write");
        try {
            synchronized (this.mNativeStreamLock) {
                try {
                    Preconditions.checkDirect(byteBuffer);
                    if (!byteBuffer.hasRemaining() && !z) {
                        throw new IllegalArgumentException("Empty buffer before end of stream.");
                    }
                    if (this.mEndOfStreamWritten) {
                        throw new IllegalArgumentException("Write after writing end of stream.");
                    }
                    if (isDoneLocked()) {
                        if (scoped != null) {
                            scoped.close();
                        }
                    } else {
                        this.mPendingData.add(byteBuffer);
                        if (z) {
                            this.mEndOfStreamWritten = true;
                        }
                        if (scoped != null) {
                            scoped.close();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
