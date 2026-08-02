package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class mwp0 extends nwp0 {
    public final CharSequence a;
    public final g1z b;

    public mwp0(CharSequence charSequence) {
        g1z g1zVar = new g1z(0);
        this.a = charSequence;
        this.b = g1zVar;
    }

    @Override // defpackage.nwp0
    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwp0)) {
            return false;
        }
        mwp0 mwp0Var = (mwp0) obj;
        return jl40.l(this.a, mwp0Var.a) && jl40.l(this.b, mwp0Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GlobalLoading(input=" + ((Object) this.a) + ", state=" + this.b + Extension.C_BRAKE;
    }
}
