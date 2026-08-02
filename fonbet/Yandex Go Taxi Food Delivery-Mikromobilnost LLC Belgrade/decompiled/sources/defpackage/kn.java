package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class kn extends nr {
    public final String a;
    public final jw7 b;

    public kn(String str, jw7 jw7Var) {
        this.a = str;
        this.b = jw7Var;
    }

    @Override // defpackage.nr
    public final String c() {
        return this.a;
    }

    public final jw7 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn)) {
            return false;
        }
        kn knVar = (kn) obj;
        return jl40.l(this.a, knVar.a) && this.b.equals(knVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionCancel(title=" + this.a + ", message=" + this.b + Extension.C_BRAKE;
    }
}
