package org.chromium.net.impl;

import android.net.http.BidirectionalStream$Callback;
import android.net.http.HeaderBlock;
import android.net.http.HttpException;
import android.net.http.UrlResponseInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.Objects;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;

/* loaded from: classes8.dex */
class AndroidBidirectionalStreamCallbackWrapper implements BidirectionalStream$Callback {
    private final BidirectionalStream.Callback mBackend;
    private AndroidBidirectionalStreamWrapper mWrappedStream;

    public AndroidBidirectionalStreamCallbackWrapper(BidirectionalStream.Callback callback) {
        Objects.requireNonNull(callback, "Callback is required.");
        this.mBackend = callback;
    }

    public void onCanceled(@NonNull android.net.http.BidirectionalStream bidirectionalStream, @Nullable UrlResponseInfo urlResponseInfo) {
        AndroidUrlResponseInfoWrapper createForBidirectionalStream = AndroidUrlResponseInfoWrapper.createForBidirectionalStream(urlResponseInfo);
        try {
            this.mBackend.onCanceled(this.mWrappedStream, createForBidirectionalStream);
        } finally {
            this.mWrappedStream.maybeReportMetrics(2, createForBidirectionalStream, null);
        }
    }

    public void onFailed(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, HttpException httpException) {
        AndroidUrlResponseInfoWrapper createForBidirectionalStream = AndroidUrlResponseInfoWrapper.createForBidirectionalStream(urlResponseInfo);
        CronetException translateCheckedAndroidCronetException = CronetExceptionTranslationUtils.translateCheckedAndroidCronetException(httpException);
        try {
            this.mBackend.onFailed(this.mWrappedStream, createForBidirectionalStream, translateCheckedAndroidCronetException);
        } finally {
            this.mWrappedStream.maybeReportMetrics(1, createForBidirectionalStream, translateCheckedAndroidCronetException);
        }
    }

    public void onReadCompleted(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        this.mBackend.onReadCompleted(this.mWrappedStream, AndroidUrlResponseInfoWrapper.createForBidirectionalStream(urlResponseInfo), byteBuffer, z);
    }

    public void onResponseHeadersReceived(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        this.mBackend.onResponseHeadersReceived(this.mWrappedStream, AndroidUrlResponseInfoWrapper.createForBidirectionalStream(urlResponseInfo));
    }

    public void onResponseTrailersReceived(@NonNull android.net.http.BidirectionalStream bidirectionalStream, @NonNull UrlResponseInfo urlResponseInfo, @NonNull HeaderBlock headerBlock) {
        this.mBackend.onResponseTrailersReceived(this.mWrappedStream, AndroidUrlResponseInfoWrapper.createForBidirectionalStream(urlResponseInfo), new AndroidHeaderBlockWrapper(headerBlock));
    }

    public void onStreamReady(android.net.http.BidirectionalStream bidirectionalStream) {
        this.mBackend.onStreamReady(this.mWrappedStream);
    }

    public void onSucceeded(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        AndroidUrlResponseInfoWrapper createForBidirectionalStream = AndroidUrlResponseInfoWrapper.createForBidirectionalStream(urlResponseInfo);
        try {
            this.mBackend.onSucceeded(this.mWrappedStream, createForBidirectionalStream);
        } finally {
            this.mWrappedStream.maybeReportMetrics(0, createForBidirectionalStream, null);
        }
    }

    public void onWriteCompleted(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        this.mBackend.onWriteCompleted(this.mWrappedStream, AndroidUrlResponseInfoWrapper.createForBidirectionalStream(urlResponseInfo), byteBuffer, z);
    }

    public void setStream(AndroidBidirectionalStreamWrapper androidBidirectionalStreamWrapper) {
        this.mWrappedStream = androidBidirectionalStreamWrapper;
    }
}
