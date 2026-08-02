package org.chromium.net.impl;

import android.net.http.UrlRequest;
import java.nio.ByteBuffer;
import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.VersionSafeCallbacks;

/* loaded from: classes8.dex */
class AndroidUrlRequestWrapper extends ExperimentalUrlRequest {
    private final Collection<Object> mAnnotations;
    private final UrlRequest mBackend;
    private final AndroidHttpEngineWrapper mEngine;
    private final String mInitialUrl;
    private final VersionSafeCallbacks.RequestFinishedInfoListener mRequestFinishedInfoListener;

    public AndroidUrlRequestWrapper(UrlRequest urlRequest, AndroidHttpEngineWrapper androidHttpEngineWrapper, String str, Collection<Object> collection, RequestFinishedInfo.Listener listener) {
        this.mBackend = urlRequest;
        this.mEngine = androidHttpEngineWrapper;
        this.mInitialUrl = str;
        this.mAnnotations = collection;
        this.mRequestFinishedInfoListener = listener == null ? null : new VersionSafeCallbacks.RequestFinishedInfoListener(listener);
    }

    public static AndroidUrlRequestWrapper createAndAddToCallback(UrlRequest urlRequest, AndroidUrlRequestCallbackWrapper androidUrlRequestCallbackWrapper, AndroidHttpEngineWrapper androidHttpEngineWrapper, String str, Collection<Object> collection, RequestFinishedInfo.Listener listener) {
        AndroidUrlRequestWrapper androidUrlRequestWrapper = new AndroidUrlRequestWrapper(urlRequest, androidHttpEngineWrapper, str, collection, listener);
        androidUrlRequestCallbackWrapper.setRequest(androidUrlRequestWrapper);
        return androidUrlRequestWrapper;
    }

    @Override // org.chromium.net.UrlRequest
    public void cancel() {
        this.mBackend.cancel();
    }

    @Override // org.chromium.net.UrlRequest
    public void followRedirect() {
        this.mBackend.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest
    public void getStatus(UrlRequest.StatusListener statusListener) {
        this.mBackend.getStatus(new AndroidUrlRequestStatusListenerWrapper(statusListener));
    }

    @Override // org.chromium.net.UrlRequest
    public boolean isDone() {
        boolean isDone;
        isDone = this.mBackend.isDone();
        return isDone;
    }

    public void maybeReportMetrics(int i, AndroidUrlResponseInfoWrapper androidUrlResponseInfoWrapper, CronetException cronetException) {
        AndroidRequestFinishedInfoWrapper.reportFinished(this.mEngine, this.mInitialUrl, this.mAnnotations, this.mRequestFinishedInfoListener, i, androidUrlResponseInfoWrapper, cronetException);
    }

    @Override // org.chromium.net.UrlRequest
    public void read(ByteBuffer byteBuffer) {
        this.mBackend.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest
    public void start() {
        this.mBackend.start();
    }
}
