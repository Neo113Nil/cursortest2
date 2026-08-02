package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class nbv implements rbv {
    public final int a;
    public final tev b;

    public nbv(int i, tev tevVar) {
        this.a = i;
        this.b = tevVar;
        v4b1.f(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbv)) {
            return false;
        }
        nbv nbvVar = (nbv) obj;
        return this.a == nbvVar.a && jl40.l(this.b, nbvVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        tev tevVar = this.b;
        return hashCode + (tevVar == null ? 0 : tevVar.hashCode());
    }

    public final String toString() {
        return "Resource(resId=" + this.a + ", size=" + this.b + Extension.C_BRAKE;
    }

    public /* synthetic */ nbv(int i) {
        this(i, null);
    }
}
