package xsna;

import androidx.annotation.NonNull;

/* compiled from: BytesResource.java */
/* loaded from: classes12.dex */
public final class qu8 implements hag0<byte[]> {
    public final byte[] b;

    public qu8(byte[] bArr) {
        nr2.r(bArr, "Argument must not be null");
        this.b = bArr;
    }

    @Override // xsna.hag0
    @NonNull
    public final Class<byte[]> b() {
        return byte[].class;
    }

    @Override // xsna.hag0
    @NonNull
    public final byte[] get() {
        return this.b;
    }

    @Override // xsna.hag0
    public final int getSize() {
        return this.b.length;
    }

    @Override // xsna.hag0
    public final void a() {
    }
}
