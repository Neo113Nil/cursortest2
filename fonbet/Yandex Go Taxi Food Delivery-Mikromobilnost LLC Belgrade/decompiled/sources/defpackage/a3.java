package defpackage;

import java.io.IOException;

/* loaded from: classes9.dex */
public abstract class a3 extends n2 {
    public static a3 m(byte[] bArr) {
        i2 i2Var = new i2(bArr);
        try {
            a3 k = i2Var.k();
            if (i2Var.available() == 0) {
                return k;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            ny61.v("cannot recognise object in stream");
            return null;
        }
    }

    @Override // defpackage.n2
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z1) && h(((z1) obj).toASN1Primitive());
    }

    public abstract boolean h(a3 a3Var);

    @Override // defpackage.n2
    public abstract int hashCode();

    public abstract void i(g191 g191Var, boolean z);

    public abstract boolean j();

    public abstract int k(boolean z);

    public final boolean l(a3 a3Var) {
        return this == a3Var || h(a3Var);
    }

    public a3 n() {
        return this;
    }

    public a3 o() {
        return this;
    }

    @Override // defpackage.z1
    public final a3 toASN1Primitive() {
        return this;
    }
}
