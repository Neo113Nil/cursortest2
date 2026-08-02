package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class go2 extends io2 {
    public final ps50 a;
    public final fo2 b;

    public go2(ps50 ps50Var, fo2 fo2Var) {
        this.a = ps50Var;
        this.b = fo2Var;
    }

    @Override // defpackage.io2
    public final fo2 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go2)) {
            return false;
        }
        go2 go2Var = (go2) obj;
        return this.a.equals(go2Var.a) && this.b.equals(go2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Failure(networkError=" + this.a + ", extras=" + this.b + Extension.C_BRAKE;
    }
}
