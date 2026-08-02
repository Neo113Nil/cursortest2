package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fp0 implements gp0 {
    public final bc1 a;
    public final zzs b;

    public fp0(bc1 bc1Var, zzs zzsVar) {
        this.a = bc1Var;
        this.b = zzsVar;
    }

    public final zzs a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp0)) {
            return false;
        }
        fp0 fp0Var = (fp0) obj;
        return this.a.equals(fp0Var.a) && this.b.equals(fp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowScreen(data=" + this.a + ", point=" + this.b + Extension.C_BRAKE;
    }
}
