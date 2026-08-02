package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class la8 implements oa8 {
    public final String a;
    public final kao b;

    public la8(String str, kao kaoVar) {
        this.a = str;
        this.b = kaoVar;
    }

    public final kao a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof la8) {
            la8 la8Var = (la8) obj;
            return jl40.l(this.a, la8Var.a) && this.b == la8Var.b;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(applicationId=" + this.a + ", errorState=" + this.b + Extension.C_BRAKE;
    }
}
