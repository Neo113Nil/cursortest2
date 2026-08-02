package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ikt implements uhx0, e6v, lhx0 {
    public final boolean a;
    public final jmw0 b;

    public ikt(boolean z, jmw0 jmw0Var) {
        this.a = z;
        this.b = jmw0Var;
    }

    @Override // defpackage.lhx0
    public final String b() {
        return this.b.getName();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikt)) {
            return false;
        }
        ikt iktVar = (ikt) obj;
        return this.a == iktVar.a && jl40.l(this.b, iktVar.b);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.b.getName();
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "GluedRequirement(isFirstInSection=" + this.a + ", requirement=" + this.b + Extension.C_BRAKE;
    }
}
