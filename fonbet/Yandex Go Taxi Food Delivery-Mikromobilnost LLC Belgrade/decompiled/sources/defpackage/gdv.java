package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class gdv extends aas {
    public final idv[] w;
    public final int x;
    public final int y;

    public gdv(jdv jdvVar, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2) {
        super(jdvVar);
        this.w = new idv[]{new fdv(i, byteBuffer), new fdv(byteBuffer2, i), new fdv(byteBuffer3, i)};
        this.x = i;
        this.y = i2;
    }

    @Override // defpackage.aas, defpackage.jdv
    public final int getHeight() {
        return this.y;
    }

    @Override // defpackage.aas, defpackage.jdv
    public final int getWidth() {
        return this.x;
    }

    @Override // defpackage.aas, defpackage.jdv
    public final idv[] i0() {
        return this.w;
    }
}
