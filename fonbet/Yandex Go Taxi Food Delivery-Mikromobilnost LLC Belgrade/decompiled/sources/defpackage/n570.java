package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class n570 {
    public final Throwable a;
    public final boolean b;

    public n570(Throwable th, boolean z) {
        this.a = th;
        this.b = z;
    }

    public static n570 a(n570 n570Var, Throwable th, int i) {
        if ((i & 1) != 0) {
            th = n570Var.a;
        }
        boolean z = (i & 2) != 0 ? n570Var.b : true;
        n570Var.getClass();
        return new n570(th, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n570)) {
            return false;
        }
        n570 n570Var = (n570) obj;
        return jl40.l(this.a, n570Var.a) && this.b == n570Var.b;
    }

    public final int hashCode() {
        Throwable th = this.a;
        return Boolean.hashCode(this.b) + ((th == null ? 0 : th.hashCode()) * 31);
    }

    public final String toString() {
        return "OpenEsiaState(error=" + this.a + ", firstAttachHappen=" + this.b + Extension.C_BRAKE;
    }
}
