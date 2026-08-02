package com.google.ar.core;

import android.graphics.Rect;
import android.media.Image;
import defpackage.yx61;
import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
class ArImage extends com.google.ar.core.dependencies.b {
    long a;
    private final Session b;
    private final long c;

    public ArImage(Session session, long j) {
        this.b = session;
        this.a = j;
        this.c = session.nativeSymbolTableHandle;
    }

    private native void nativeClose(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeGetBuffer, reason: merged with bridge method [inline-methods] */
    public native ByteBuffer c(long j, long j2, int i);

    private native int nativeGetFormat(long j, long j2);

    private native int nativeGetHeight(long j, long j2);

    private native int nativeGetNumberOfPlanes(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeGetPixelStride, reason: merged with bridge method [inline-methods] */
    public native int b(long j, long j2, int i);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeGetRowStride, reason: merged with bridge method [inline-methods] */
    public native int a(long j, long j2, int i);

    private native long nativeGetTimestamp(long j, long j2);

    private native int nativeGetWidth(long j, long j2);

    public static native void nativeLoadSymbols();

    @Override // android.media.Image, java.lang.AutoCloseable
    public final void close() {
        nativeClose(this.c, this.a);
        this.a = 0L;
    }

    public final /* synthetic */ Session d() {
        return this.b;
    }

    @Override // android.media.Image
    public final Rect getCropRect() {
        return new Rect(0, 0, getWidth(), getHeight());
    }

    @Override // android.media.Image
    public final int getFormat() {
        int nativeGetFormat = nativeGetFormat(this.b.nativeWrapperHandle, this.a);
        if (nativeGetFormat != -1) {
            return nativeGetFormat;
        }
        yx61.f("Unknown error in ArImage.getFormat().");
        return 0;
    }

    @Override // android.media.Image
    public final int getHeight() {
        int nativeGetHeight = nativeGetHeight(this.b.nativeWrapperHandle, this.a);
        if (nativeGetHeight != -1) {
            return nativeGetHeight;
        }
        yx61.f("Unknown error in ArImage.getHeight().");
        return 0;
    }

    @Override // android.media.Image
    public final Image.Plane[] getPlanes() {
        int nativeGetNumberOfPlanes = nativeGetNumberOfPlanes(this.b.nativeWrapperHandle, this.a);
        if (nativeGetNumberOfPlanes == -1) {
            yx61.f("Unknown error in ArImage.getPlanes().");
            return null;
        }
        n[] nVarArr = new n[nativeGetNumberOfPlanes];
        for (int i = 0; i < nativeGetNumberOfPlanes; i++) {
            nVarArr[i] = new n(this, this.a, i);
        }
        return nVarArr;
    }

    @Override // android.media.Image
    public final long getTimestamp() {
        long nativeGetTimestamp = nativeGetTimestamp(this.b.nativeWrapperHandle, this.a);
        if (nativeGetTimestamp != -1) {
            return nativeGetTimestamp;
        }
        yx61.f("Unknown error in ArImage.getTimestamp().");
        return 0L;
    }

    @Override // android.media.Image
    public final int getWidth() {
        int nativeGetWidth = nativeGetWidth(this.b.nativeWrapperHandle, this.a);
        if (nativeGetWidth != -1) {
            return nativeGetWidth;
        }
        yx61.f("Unknown error in ArImage.getWidth().");
        return 0;
    }

    @Override // android.media.Image
    public final void setCropRect(Rect rect) {
        throw new UnsupportedOperationException("This is a read-only image.");
    }

    @Override // android.media.Image
    public final void setTimestamp(long j) {
        throw new UnsupportedOperationException("This is a read-only image.");
    }
}
