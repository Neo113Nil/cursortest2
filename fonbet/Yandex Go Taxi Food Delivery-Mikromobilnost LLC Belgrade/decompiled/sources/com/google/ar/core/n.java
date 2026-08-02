package com.google.ar.core;

import defpackage.yx61;
import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
final class n extends com.google.ar.core.dependencies.a {
    final /* synthetic */ ArImage a;
    private final long b;
    private final int c;

    public n(ArImage arImage, long j, int i) {
        this.a = arImage;
        this.b = j;
        this.c = i;
    }

    @Override // android.media.Image.Plane
    public final ByteBuffer getBuffer() {
        ArImage arImage = this.a;
        return arImage.c(arImage.d().nativeWrapperHandle, this.b, this.c).asReadOnlyBuffer();
    }

    @Override // android.media.Image.Plane
    public final int getPixelStride() {
        ArImage arImage = this.a;
        int b = arImage.b(arImage.d().nativeWrapperHandle, this.b, this.c);
        if (b != -1) {
            return b;
        }
        yx61.f("Unknown error in ArImage.Plane.getPixelStride().");
        return 0;
    }

    @Override // android.media.Image.Plane
    public final int getRowStride() {
        ArImage arImage = this.a;
        int a = arImage.a(arImage.d().nativeWrapperHandle, this.b, this.c);
        if (a != -1) {
            return a;
        }
        yx61.f("Unknown error in ArImage.Plane.getRowStride().");
        return 0;
    }
}
