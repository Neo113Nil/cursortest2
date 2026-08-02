package defpackage;

import defpackage.pqo;

/* loaded from: classes10.dex */
public final class k64 extends pqo.a {
    public byte[] a;
    public byte[] b;

    public final l64 a() {
        return new l64(this.a, this.b);
    }

    public final k64 b(byte[] bArr) {
        this.a = bArr;
        return this;
    }

    public final k64 c(byte[] bArr) {
        this.b = bArr;
        return this;
    }
}
