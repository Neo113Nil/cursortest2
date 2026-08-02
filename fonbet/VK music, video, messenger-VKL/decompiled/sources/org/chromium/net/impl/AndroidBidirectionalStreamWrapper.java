package org.chromium.net.impl;

import android.net.http.BidirectionalStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalBidirectionalStream;

/* loaded from: classes8.dex */
class AndroidBidirectionalStreamWrapper extends ExperimentalBidirectionalStream {
    private final Collection<Object> mAnnotations;
    private final BidirectionalStream mBackend;
    private final AndroidHttpEngineWrapper mEngine;
    private final String mInitialUrl;

    public AndroidBidirectionalStreamWrapper(BidirectionalStream bidirectionalStream, AndroidHttpEngineWrapper androidHttpEngineWrapper, String str, Collection<Object> collection) {
        this.mBackend = bidirectionalStream;
        this.mEngine = androidHttpEngineWrapper;
        this.mInitialUrl = str;
        this.mAnnotations = collection;
    }

    public static AndroidBidirectionalStreamWrapper createAndAddToCallback(BidirectionalStream bidirectionalStream, AndroidBidirectionalStreamCallbackWrapper androidBidirectionalStreamCallbackWrapper, AndroidHttpEngineWrapper androidHttpEngineWrapper, String str, Collection<Object> collection) {
        AndroidBidirectionalStreamWrapper androidBidirectionalStreamWrapper = new AndroidBidirectionalStreamWrapper(bidirectionalStream, androidHttpEngineWrapper, str, collection);
        androidBidirectionalStreamCallbackWrapper.setStream(androidBidirectionalStreamWrapper);
        return androidBidirectionalStreamWrapper;
    }

    @Override // org.chromium.net.BidirectionalStream
    public void cancel() {
        this.mBackend.cancel();
    }

    @Override // org.chromium.net.BidirectionalStream
    public void flush() {
        this.mBackend.flush();
    }

    @Override // org.chromium.net.BidirectionalStream
    public boolean isDone() {
        boolean isDone;
        isDone = this.mBackend.isDone();
        return isDone;
    }

    public void maybeReportMetrics(int i, AndroidUrlResponseInfoWrapper androidUrlResponseInfoWrapper, CronetException cronetException) {
        AndroidRequestFinishedInfoWrapper.reportFinished(this.mEngine, this.mInitialUrl, this.mAnnotations, null, i, androidUrlResponseInfoWrapper, cronetException);
    }

    @Override // org.chromium.net.BidirectionalStream
    public void read(ByteBuffer byteBuffer) {
        this.mBackend.read(byteBuffer);
    }

    @Override // org.chromium.net.BidirectionalStream
    public void start() {
        this.mBackend.start();
    }

    @Override // org.chromium.net.BidirectionalStream
    public void write(ByteBuffer byteBuffer, boolean z) {
        this.mBackend.write(byteBuffer, z);
    }
}
