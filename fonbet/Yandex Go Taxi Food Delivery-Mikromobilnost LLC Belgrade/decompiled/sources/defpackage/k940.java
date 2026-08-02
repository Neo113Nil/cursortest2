package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class k940 implements m940 {
    public final String a;
    public final q6o b;

    public k940(String str, q6o q6oVar) {
        this.a = str;
        this.b = q6oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k940)) {
            return false;
        }
        k940 k940Var = (k940) obj;
        return jl40.l(this.a, k940Var.a) && this.b.equals(k940Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(orderId=" + this.a + ", errorContentState=" + this.b + Extension.C_BRAKE;
    }
}
