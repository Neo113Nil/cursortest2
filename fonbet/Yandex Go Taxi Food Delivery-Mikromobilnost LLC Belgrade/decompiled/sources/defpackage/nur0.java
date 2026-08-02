package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class nur0 extends u0x implements r7u, u7u {
    public final qur0 a;

    public nur0(qur0 qur0Var) {
        this.a = qur0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nur0) && jl40.l(this.a, ((nur0) obj).a);
    }

    @Override // defpackage.r7u
    public final Object g() {
        return new mur0(this.a.a);
    }

    @Override // defpackage.u7u
    public final Object getModel() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "ShimmerWidgetItem(model=" + this.a + Extension.C_BRAKE;
    }
}
