package org.chromium.net.impl;

import android.net.Network;
import android.net.http.BidirectionalStream;
import android.net.http.HttpEngine;
import android.net.http.UrlRequest;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.CronetExceptionTranslationUtils;
import org.chromium.net.impl.VersionSafeCallbacks;
import xsna.go9;

/* loaded from: classes8.dex */
class AndroidHttpEngineWrapper extends CronetEngineBase {
    private static final String TAG = "HttpEngineWrapper";
    private static boolean sGlobalMetricsUnsupportedLogged;
    private static boolean sNetlogUnsupportedLogged;
    private final HttpEngine mBackend;
    private final Map<RequestFinishedInfo.Listener, VersionSafeCallbacks.RequestFinishedInfoListener> mFinishedListenerMap = Collections.synchronizedMap(new HashMap());

    public AndroidHttpEngineWrapper(HttpEngine httpEngine) {
        this.mBackend = httpEngine;
    }

    private Network getNetwork(long j) {
        if (j == -1) {
            return null;
        }
        return Network.fromNetworkHandle(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ URLConnection lambda$openConnection$0(URL url) throws IOException {
        URLConnection openConnection;
        openConnection = this.mBackend.openConnection(url);
        return openConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$reportRequestFinished$1(VersionSafeCallbacks.RequestFinishedInfoListener requestFinishedInfoListener, RequestFinishedInfo requestFinishedInfo) {
        try {
            requestFinishedInfoListener.onRequestFinished(requestFinishedInfo);
        } catch (Exception e) {
            Log.e(TAG, "Exception thrown from observation task", e);
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.mFinishedListenerMap.put(listener, new VersionSafeCallbacks.RequestFinishedInfoListener(listener));
    }

    @Override // org.chromium.net.CronetEngine
    public void bindToNetwork(long j) {
        this.mBackend.bindToNetwork(getNetwork(j));
    }

    @Override // org.chromium.net.impl.CronetEngineBase
    public ExperimentalBidirectionalStream createBidirectionalStream(String str, BidirectionalStream.Callback callback, Executor executor, String str2, List<Map.Entry<String, String>> list, int i, boolean z, Collection<Object> collection, boolean z2, int i2, boolean z3, int i3, long j) {
        BidirectionalStream.Builder newBidirectionalStreamBuilder;
        android.net.http.BidirectionalStream build;
        AndroidBidirectionalStreamCallbackWrapper androidBidirectionalStreamCallbackWrapper = new AndroidBidirectionalStreamCallbackWrapper(callback);
        newBidirectionalStreamBuilder = this.mBackend.newBidirectionalStreamBuilder(str, executor, androidBidirectionalStreamCallbackWrapper);
        newBidirectionalStreamBuilder.setHttpMethod(str2);
        for (Map.Entry<String, String> entry : list) {
            newBidirectionalStreamBuilder.addHeader(entry.getKey(), entry.getValue());
        }
        newBidirectionalStreamBuilder.setPriority(i);
        newBidirectionalStreamBuilder.setDelayRequestHeadersUntilFirstFlushEnabled(z);
        if (z2) {
            newBidirectionalStreamBuilder.setTrafficStatsTag(i2);
        }
        if (z3) {
            newBidirectionalStreamBuilder.setTrafficStatsUid(i3);
        }
        build = newBidirectionalStreamBuilder.build();
        return AndroidBidirectionalStreamWrapper.createAndAddToCallback(build, androidBidirectionalStreamCallbackWrapper, this, str, collection);
    }

    @Override // org.chromium.net.impl.CronetEngineBase
    public ExperimentalUrlRequest createRequest(String str, UrlRequest.Callback callback, Executor executor, int i, Collection<Object> collection, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, @Nullable RequestFinishedInfo.Listener listener, int i4, long j, String str2, ArrayList<Map.Entry<String, String>> arrayList, UploadDataProvider uploadDataProvider, Executor executor2, byte[] bArr, ByteBuffer byteBuffer, @NonNull String str3) {
        UrlRequest.Builder newUrlRequestBuilder;
        android.net.http.UrlRequest build;
        AndroidUrlRequestCallbackWrapper androidUrlRequestCallbackWrapper = new AndroidUrlRequestCallbackWrapper(callback);
        newUrlRequestBuilder = this.mBackend.newUrlRequestBuilder(str, executor, androidUrlRequestCallbackWrapper);
        newUrlRequestBuilder.setPriority(i);
        if (z) {
            newUrlRequestBuilder.setCacheDisabled(z);
        }
        if (z3) {
            newUrlRequestBuilder.setDirectExecutorAllowed(z3);
        }
        if (z4) {
            newUrlRequestBuilder.setTrafficStatsTag(i2);
        }
        if (z5) {
            newUrlRequestBuilder.setTrafficStatsTag(i3);
        }
        newUrlRequestBuilder.bindToNetwork(getNetwork(j));
        newUrlRequestBuilder.setHttpMethod(str2);
        Iterator<Map.Entry<String, String>> it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            newUrlRequestBuilder.addHeader(next.getKey(), next.getValue());
        }
        if (uploadDataProvider != null) {
            newUrlRequestBuilder.setUploadDataProvider(new AndroidUploadDataProviderWrapper(uploadDataProvider), executor2);
        }
        build = newUrlRequestBuilder.build();
        return AndroidUrlRequestWrapper.createAndAddToCallback(build, androidUrlRequestCallbackWrapper, this, str, collection, listener);
    }

    @Override // org.chromium.net.CronetEngine
    public URLStreamHandlerFactory createURLStreamHandlerFactory() {
        URLStreamHandlerFactory createUrlStreamHandlerFactory;
        createUrlStreamHandlerFactory = this.mBackend.createUrlStreamHandlerFactory();
        return createUrlStreamHandlerFactory;
    }

    @Override // org.chromium.net.CronetEngine
    public byte[] getGlobalMetricsDeltas() {
        if (!sGlobalMetricsUnsupportedLogged) {
            sGlobalMetricsUnsupportedLogged = true;
        }
        return new byte[0];
    }

    @Override // org.chromium.net.CronetEngine
    public String getVersionString() {
        String versionString;
        versionString = HttpEngine.getVersionString();
        return versionString;
    }

    @Override // org.chromium.net.impl.CronetEngineBase, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public /* bridge */ /* synthetic */ UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return super.newUrlRequestBuilder(str, callback, executor);
    }

    @Override // org.chromium.net.CronetEngine
    public URLConnection openConnection(final URL url) throws IOException {
        return (URLConnection) CronetExceptionTranslationUtils.executeTranslatingCronetExceptions(new CronetExceptionTranslationUtils.CronetWork() { // from class: org.chromium.net.impl.b
            @Override // org.chromium.net.impl.CronetExceptionTranslationUtils.CronetWork
            public final Object run() {
                URLConnection lambda$openConnection$0;
                lambda$openConnection$0 = AndroidHttpEngineWrapper.this.lambda$openConnection$0(url);
                return lambda$openConnection$0;
            }
        }, IOException.class);
    }

    @Override // org.chromium.net.CronetEngine
    public void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.mFinishedListenerMap.remove(listener);
    }

    public void reportRequestFinished(final RequestFinishedInfo requestFinishedInfo, VersionSafeCallbacks.RequestFinishedInfoListener requestFinishedInfoListener) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mFinishedListenerMap) {
            arrayList.addAll(this.mFinishedListenerMap.values());
        }
        if (requestFinishedInfoListener != null) {
            arrayList.add(requestFinishedInfoListener);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final VersionSafeCallbacks.RequestFinishedInfoListener requestFinishedInfoListener2 = (VersionSafeCallbacks.RequestFinishedInfoListener) it.next();
            try {
                requestFinishedInfoListener2.getExecutor().execute(new Runnable() { // from class: org.chromium.net.impl.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidHttpEngineWrapper.lambda$reportRequestFinished$1(VersionSafeCallbacks.RequestFinishedInfoListener.this, requestFinishedInfo);
                    }
                });
            } catch (RejectedExecutionException e) {
                Log.e(TAG, "Exception posting task to executor", e);
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void shutdown() {
        this.mBackend.shutdown();
    }

    @Override // org.chromium.net.CronetEngine
    public void startNetLogToFile(String str, boolean z) {
        if (sNetlogUnsupportedLogged) {
            return;
        }
        sNetlogUnsupportedLogged = true;
    }

    @Override // org.chromium.net.impl.CronetEngineBase, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new BidirectionalStreamBuilderImpl(str, callback, executor, this);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public URLConnection openConnection(URL url, Proxy proxy) throws IOException {
        if (proxy.type() != Proxy.Type.DIRECT) {
            throw new UnsupportedOperationException();
        }
        String protocol = url.getProtocol();
        if ("http".equals(protocol) || HttpRequest.DEFAULT_SCHEME.equals(protocol)) {
            return openConnection(url);
        }
        throw new UnsupportedOperationException(go9.b("Unexpected protocol:", protocol));
    }

    @Override // org.chromium.net.CronetEngine
    public void stopNetLog() {
    }
}
