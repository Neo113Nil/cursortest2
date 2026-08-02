package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ht3 {
    public final stz0 a;
    public final et3 b;

    public ht3(stz0 stz0Var, et3 et3Var) {
        this.a = stz0Var;
        this.b = et3Var;
    }

    public final et3 a() {
        return this.b;
    }

    public final stz0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht3)) {
            return false;
        }
        ht3 ht3Var = (ht3) obj;
        return this.a.equals(ht3Var.a) && this.b.equals(ht3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AutoPullsViewStateSuccess(toolbar=" + this.a + ", content=" + this.b + Extension.C_BRAKE;
    }
}
