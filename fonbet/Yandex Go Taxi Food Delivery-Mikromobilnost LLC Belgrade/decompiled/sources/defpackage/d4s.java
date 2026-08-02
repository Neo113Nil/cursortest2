package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class d4s {
    public final p1f a;
    public final q1f b;

    public d4s(p1f p1fVar, q1f q1fVar) {
        this.a = p1fVar;
        this.b = q1fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4s)) {
            return false;
        }
        d4s d4sVar = (d4s) obj;
        return jl40.l(this.a, d4sVar.a) && jl40.l(this.b, d4sVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FormCouponDependencies(repository=" + this.a + ", router=" + this.b + Extension.C_BRAKE;
    }
}
