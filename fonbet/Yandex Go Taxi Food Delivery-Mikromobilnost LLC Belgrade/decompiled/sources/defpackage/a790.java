package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class a790 implements b790 {
    public final jbv a;
    public final String b;

    public a790(jbv jbvVar, String str) {
        this.a = jbvVar;
        this.b = str;
    }

    @Override // defpackage.b790
    public final rbv a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a790)) {
            return false;
        }
        a790 a790Var = (a790) obj;
        return this.a.equals(a790Var.a) && jl40.l(this.b, a790Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "Deeplink(toolbarImage=" + this.a + ", deeplink=" + this.b + Extension.C_BRAKE;
    }
}
