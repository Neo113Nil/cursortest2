package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class a6a0 implements c6a0 {
    public final tsj0 a;
    public final lea0 b;

    public a6a0(tsj0 tsj0Var, lea0 lea0Var) {
        this.a = tsj0Var;
        this.b = lea0Var;
    }

    public final tsj0 a() {
        return this.a;
    }

    public final lea0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6a0)) {
            return false;
        }
        a6a0 a6a0Var = (a6a0) obj;
        return this.a.equals(a6a0Var.a) && jl40.l(this.b, a6a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowInfoModal(modalDescription=" + this.a + ", paymentModel=" + this.b + Extension.C_BRAKE;
    }
}
