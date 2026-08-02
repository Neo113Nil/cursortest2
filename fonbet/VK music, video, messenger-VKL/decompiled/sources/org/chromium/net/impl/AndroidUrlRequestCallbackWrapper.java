package org.chromium.net.impl;

import android.net.http.HttpException;
import android.net.http.UrlRequest$Callback;
import android.net.http.UrlResponseInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.Objects;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.CronetExceptionTranslationUtils;

/* loaded from: classes8.dex */
class AndroidUrlRequestCallbackWrapper implements UrlRequest$Callback {
    private final UrlRequest.Callback mBackend;
    private AndroidUrlRequestWrapper mWrappedRequest;

    public AndroidUrlRequestCallbackWrapper(UrlRequest.Callback callback) {
        Objects.requireNonNull(callback, "Callback is required.");
        this.mBackend = callback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onReadCompleted$2(UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) throws Exception {
        this.mBackend.onReadCompleted(this.mWrappedRequest, AndroidUrlResponseInfoWrapper.createForUrlRequest(urlResponseInfo), byteBuffer);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onRedirectReceived$0(UrlResponseInfo urlResponseInfo, String str) throws Exception {
        this.mBackend.onRedirectReceived(this.mWrappedRequest, AndroidUrlResponseInfoWrapper.createForUrlRequest(urlResponseInfo), str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onResponseStarted$1(UrlResponseInfo urlResponseInfo) throws Exception {
        this.mBackend.onResponseStarted(this.mWrappedRequest, AndroidUrlResponseInfoWrapper.createForUrlRequest(urlResponseInfo));
        return null;
    }

    public void onCanceled(@NonNull android.net.http.UrlRequest urlRequest, @Nullable UrlResponseInfo urlResponseInfo) {
        AndroidUrlResponseInfoWrapper createForUrlRequest = AndroidUrlResponseInfoWrapper.createForUrlRequest(urlResponseInfo);
        try {
            this.mBackend.onCanceled(this.mWrappedRequest, createForUrlRequest);
        } finally {
            this.mWrappedRequest.maybeReportMetrics(2, createForUrlRequest, null);
        }
    }

    public void onFailed(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, HttpException httpException) {
        AndroidUrlResponseInfoWrapper createForUrlRequest = AndroidUrlResponseInfoWrapper.createForUrlRequest(urlResponseInfo);
        CronetException translateCheckedAndroidCronetException = CronetExceptionTranslationUtils.translateCheckedAndroidCronetException(httpException);
        try {
            this.mBackend.onFailed(this.mWrappedRequest, createForUrlRequest, translateCheckedAndroidCronetException);
        } finally {
            this.mWrappedRequest.maybeReportMetrics(1, createForUrlRequest, translateCheckedAndroidCronetException);
        }
    }

    public void onReadCompleted(android.net.http.UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, final ByteBuffer byteBuffer) throws Exception {
        CronetExceptionTranslationUtils.executeTranslatingCronetExceptions(new CronetExceptionTranslationUtils.CronetWork() { // from class: org.chromium.net.impl.d
            @Override // org.chromium.net.impl.CronetExceptionTranslationUtils.CronetWork
            public final Object run() {
                Object lambda$onReadCompleted$2;
                lambda$onReadCompleted$2 = AndroidUrlRequestCallbackWrapper.this.lambda$onReadCompleted$2(urlResponseInfo, byteBuffer);
                return lambda$onReadCompleted$2;
            }
        }, Exception.class);
    }

    public void onRedirectReceived(android.net.http.UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, final String str) throws Exception {
        CronetExceptionTranslationUtils.executeTranslatingCronetExceptions(new CronetExceptionTranslationUtils.CronetWork() { // from class: org.chromium.net.impl.e
            @Override // org.chromium.net.impl.CronetExceptionTranslationUtils.CronetWork
            public final Object run() {
                Object lambda$onRedirectReceived$0;
                lambda$onRedirectReceived$0 = AndroidUrlRequestCallbackWrapper.this.lambda$onRedirectReceived$0(urlResponseInfo, str);
                return lambda$onRedirectReceived$0;
            }
        }, Exception.class);
    }

    public void onResponseStarted(android.net.http.UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo) throws Exception {
        CronetExceptionTranslationUtils.executeTranslatingCronetExceptions(new CronetExceptionTranslationUtils.CronetWork() { // from class: org.chromium.net.impl.c
            @Override // org.chromium.net.impl.CronetExceptionTranslationUtils.CronetWork
            public final Object run() {
                Object lambda$onResponseStarted$1;
                lambda$onResponseStarted$1 = AndroidUrlRequestCallbackWrapper.this.lambda$onResponseStarted$1(urlResponseInfo);
                return lambda$onResponseStarted$1;
            }
        }, Exception.class);
    }

    public void onSucceeded(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        AndroidUrlResponseInfoWrapper createForUrlRequest = AndroidUrlResponseInfoWrapper.createForUrlRequest(urlResponseInfo);
        try {
            this.mBackend.onSucceeded(this.mWrappedRequest, createForUrlRequest);
        } finally {
            this.mWrappedRequest.maybeReportMetrics(0, createForUrlRequest, null);
        }
    }

    public void setRequest(AndroidUrlRequestWrapper androidUrlRequestWrapper) {
        this.mWrappedRequest = androidUrlRequestWrapper;
    }
}
