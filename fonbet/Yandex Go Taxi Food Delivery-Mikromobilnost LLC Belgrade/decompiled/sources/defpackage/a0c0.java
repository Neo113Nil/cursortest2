package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class a0c0 implements f0c0 {
    public static final a0c0 c = new a0c0("—", null);
    public final String a;
    public final Integer b;

    public a0c0(String str, Integer num) {
        this.a = str;
        this.b = num;
    }

    public final String a() {
        return this.a;
    }

    public final Integer b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0c0)) {
            return false;
        }
        a0c0 a0c0Var = (a0c0) obj;
        return jl40.l(this.a, a0c0Var.a) && jl40.l(this.b, a0c0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "Eta(displayableEta=" + this.a + ", eta=" + this.b + Extension.C_BRAKE;
    }
}
