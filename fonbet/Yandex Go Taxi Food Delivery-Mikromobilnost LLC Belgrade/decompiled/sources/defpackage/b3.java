package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public abstract class b3 extends o2 {
    public static b3 r(byte[] bArr) {
        j2 j2Var = new j2(bArr);
        try {
            b3 n = j2Var.n();
            if (j2Var.available() == 0) {
                return n;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            ny61.v("cannot recognise object in stream");
            return null;
        }
    }

    @Override // defpackage.o2
    public final void encodeTo(OutputStream outputStream, String str) {
        int i = 5;
        (str.equals("DER") ? new fqf(i, outputStream) : str.equals("DL") ? new vvf(i, outputStream) : new ryh(i, outputStream)).N(this);
    }

    @Override // defpackage.o2
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a2) && m(((a2) obj).toASN1Primitive());
    }

    @Override // defpackage.o2
    public abstract int hashCode();

    public abstract boolean m(b3 b3Var);

    public abstract void n(ryh ryhVar, boolean z);

    public abstract boolean o();

    public abstract int p(boolean z);

    public final boolean q(b3 b3Var) {
        return this == b3Var || m(b3Var);
    }

    public b3 s() {
        return this;
    }

    public b3 t() {
        return this;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        return this;
    }

    @Override // defpackage.o2
    public final void encodeTo(OutputStream outputStream) {
        n(new ryh(5, outputStream), true);
    }
}
