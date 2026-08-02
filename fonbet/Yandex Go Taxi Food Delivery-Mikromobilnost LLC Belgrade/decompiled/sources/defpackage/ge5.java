package defpackage;

import java.io.OutputStream;
import org.bouncycastle.cert.ocsp.OCSPException;

/* loaded from: classes4.dex */
public final class ge5 {
    public final he5 a;
    public final bwj0 b;

    public ge5(he5 he5Var) {
        this.a = he5Var;
        bwj0 bwj0Var = he5Var.a;
        this.b = bwj0Var;
        gzo.n(bwj0Var.y);
    }

    public final qgn0[] a() {
        i3 i3Var = this.b.x;
        int size = i3Var.size();
        qgn0[] qgn0VarArr = new qgn0[size];
        for (int i = 0; i != size; i++) {
            ths0 m = ths0.m(i3Var.A(i));
            qgn0 qgn0Var = new qgn0();
            qgn0Var.b = m;
            m.getClass();
            qgn0VarArr[i] = qgn0Var;
        }
        return qgn0VarArr;
    }

    public final boolean b(yie yieVar) {
        he5 he5Var = this.a;
        try {
            xie xieVar = yieVar.get(he5Var.b);
            OutputStream outputStream = xieVar.getOutputStream();
            outputStream.write(he5Var.a.getEncoded("DER"));
            outputStream.close();
            byte[] bArr = he5Var.c.a;
            if (bArr[0] == 0) {
                return xieVar.verify(rza1.d(bArr.length, bArr));
            }
            throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
        } catch (Exception e) {
            throw new OCSPException("exception processing sig: " + e, e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ge5) {
            return this.a.equals(((ge5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
