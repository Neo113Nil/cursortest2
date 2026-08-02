package org.chromium.net.impl;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.base.metrics.ScopedSysTraceEvent;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
import org.chromium.net.impl.JavaUploadDataSinkBase;
import org.chromium.net.impl.JavaUrlRequestUtils;
import org.chromium.net.impl.VersionSafeCallbacks;
import xsna.a72;
import xsna.ac3;
import xsna.cc3;
import xsna.lhg;
import xsna.q7;
import xsna.tt0;

/* loaded from: classes8.dex */
public abstract class JavaUploadDataSinkBase extends UploadDataSink {
    public static final int DEFAULT_UPLOAD_BUFFER_SIZE = 8192;
    private ByteBuffer mBuffer;
    private final Executor mExecutor;
    private int mReadCount;
    private final AtomicInteger mSinkState = new AtomicInteger(3);
    private long mTotalBytes;
    private final VersionSafeCallbacks.UploadDataProviderWrapper mUploadProvider;
    private final Executor mUserUploadExecutor;
    private long mWrittenBytes;

    @Retention(RetentionPolicy.SOURCE)
    public @interface SinkState {
        public static final int AWAITING_READ_RESULT = 0;
        public static final int AWAITING_REWIND_RESULT = 1;
        public static final int NOT_STARTED = 3;
        public static final int UPLOADING = 2;
    }

    public JavaUploadDataSinkBase(final Executor executor, Executor executor2, UploadDataProvider uploadDataProvider) {
        this.mUserUploadExecutor = new Executor(this) { // from class: org.chromium.net.impl.JavaUploadDataSinkBase.1
            final /* synthetic */ JavaUploadDataSinkBase this$0;

            {
                this.this$0 = this;
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e) {
                    this.this$0.processUploadError(e);
                }
            }
        };
        this.mExecutor = executor2;
        this.mUploadProvider = new VersionSafeCallbacks.UploadDataProviderWrapper(uploadDataProvider);
    }

    private void executeOnExecutor(Runnable runnable, String str) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("JavaUploadDataSinkBase#executeOnExecutor " + str);
        try {
            this.mExecutor.execute(new cc3(2, (Object) str, (Object) runnable));
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

    private void executeOnUploadExecutor(JavaUrlRequestUtils.CheckedRunnable checkedRunnable, String str) {
        try {
            ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("Cronet JavaUploadDataSinkBase#executeOnUploadExecutor " + str);
            try {
                this.mUserUploadExecutor.execute(new ac3(2, this, checkedRunnable, str));
                if (scoped != null) {
                    scoped.close();
                }
            } finally {
            }
        } catch (RejectedExecutionException e) {
            processUploadError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$executeOnExecutor$4(String str, Runnable runnable) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("JavaUploadDataSinkBase#executeOnExecutor " + str + " running callback");
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
    public /* synthetic */ void lambda$executeOnUploadExecutor$5(String str, JavaUrlRequestUtils.CheckedRunnable checkedRunnable) {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("Cronet JavaUploadDataSinkBase#executeOnUploadExecutor " + str + " running callback");
        try {
            getUploadErrorSettingRunnable(checkedRunnable).run();
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
    public /* synthetic */ void lambda$onReadSucceeded$0(boolean z) throws Exception {
        long j = this.mTotalBytes;
        if (j != -1 && j - this.mWrittenBytes < this.mBuffer.remaining()) {
            processUploadError(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(this.mWrittenBytes + this.mBuffer.remaining()), Long.valueOf(this.mTotalBytes))));
            return;
        }
        if (this.mBuffer.remaining() == 0 && !z) {
            processUploadError(new IllegalStateException("Bytes read can't be zero except for last chunk!"));
            return;
        }
        long processSuccessfulRead = this.mWrittenBytes + processSuccessfulRead(this.mBuffer);
        this.mWrittenBytes = processSuccessfulRead;
        long j2 = this.mTotalBytes;
        if (processSuccessfulRead < j2 || (j2 == -1 && !z)) {
            this.mSinkState.set(0);
            readFromProvider();
        } else if (j2 == -1) {
            finish();
        } else if (j2 == processSuccessfulRead) {
            finish();
        } else {
            processUploadError(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(this.mWrittenBytes), Long.valueOf(this.mTotalBytes))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$readFromProvider$2() {
        this.mReadCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$readFromProvider$3() throws Exception {
        this.mUploadProvider.read(this, this.mBuffer);
        this.mExecutor.execute(new a72(this, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$6(boolean z) throws Exception {
        long length = this.mUploadProvider.getLength();
        this.mTotalBytes = length;
        if (length == 0) {
            finish();
            return;
        }
        if (length <= 0 || length >= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
            this.mBuffer = ByteBuffer.allocateDirect(8192);
        } else {
            this.mBuffer = ByteBuffer.allocateDirect(((int) length) + 1);
        }
        initializeStart(this.mTotalBytes);
        if (z) {
            startRead();
        } else {
            this.mSinkState.set(1);
            this.mUploadProvider.rewind(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startRead$1() throws Exception {
        initializeRead();
        this.mSinkState.set(0);
        readFromProvider();
    }

    private void readFromProvider() {
        executeOnUploadExecutor(new q7(this, 27), "readFromProvider");
    }

    private void startRead() {
        executeOnExecutor(getErrorSettingRunnable(new tt0(this, 26)), "startRead");
    }

    public abstract void finish() throws IOException;

    public abstract Runnable getErrorSettingRunnable(JavaUrlRequestUtils.CheckedRunnable checkedRunnable);

    public int getReadCount() {
        return this.mReadCount;
    }

    public abstract Runnable getUploadErrorSettingRunnable(JavaUrlRequestUtils.CheckedRunnable checkedRunnable);

    public abstract void initializeRead() throws IOException;

    public abstract void initializeStart(long j);

    @Override // org.chromium.net.UploadDataSink
    public void onReadError(Exception exc) {
        processUploadError(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public void onReadSucceeded(final boolean z) {
        if (!this.mSinkState.compareAndSet(0, 2)) {
            throw new IllegalStateException(lhg.a(this.mSinkState.get(), "onReadSucceeded() called when not awaiting a read result; in state: "));
        }
        executeOnExecutor(getErrorSettingRunnable(new JavaUrlRequestUtils.CheckedRunnable() { // from class: xsna.xxx
            @Override // org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable
            public final void run() {
                JavaUploadDataSinkBase.this.lambda$onReadSucceeded$0(z);
            }
        }), "onReadSucceeded");
    }

    @Override // org.chromium.net.UploadDataSink
    public void onRewindError(Exception exc) {
        processUploadError(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public void onRewindSucceeded() {
        if (!this.mSinkState.compareAndSet(1, 2)) {
            throw new IllegalStateException(lhg.a(this.mSinkState.get(), "onRewindSucceeded() called when not awaiting a rewind; in state: "));
        }
        startRead();
    }

    public abstract int processSuccessfulRead(ByteBuffer byteBuffer) throws IOException;

    public abstract void processUploadError(Throwable th);

    public void start(final boolean z) {
        executeOnUploadExecutor(new JavaUrlRequestUtils.CheckedRunnable() { // from class: xsna.wxx
            @Override // org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable
            public final void run() {
                JavaUploadDataSinkBase.this.lambda$start$6(z);
            }
        }, "start");
    }
}
