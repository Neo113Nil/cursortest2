package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ho1 {
    public final String a;
    public final Boolean b;
    public final String c;

    public ho1(String str, String str2, Boolean bool) {
        this.a = str;
        this.b = bool;
        this.c = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final Boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho1)) {
            return false;
        }
        ho1 ho1Var = (ho1) obj;
        return jl40.l(this.a, ho1Var.a) && jl40.l(this.b, ho1Var.b) && jl40.l(this.c, ho1Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AiWidgetEvaluationDeeplink(batchId=");
        sb.append(this.a);
        sb.append(", showOnboarding=");
        sb.append(this.b);
        sb.append(", origin=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    public ho1() {
        this(null, null, null);
    }
}
