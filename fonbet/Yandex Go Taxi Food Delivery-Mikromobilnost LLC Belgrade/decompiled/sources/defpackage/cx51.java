package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class cx51 implements ex51 {
    public final mv51 a;
    public final mv51 b;
    public final mv51 c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final Boolean h;

    public cx51(mv51 mv51Var, mv51 mv51Var2, mv51 mv51Var3, boolean z, String str, String str2, String str3, Boolean bool) {
        this.a = mv51Var;
        this.b = mv51Var2;
        this.c = mv51Var3;
        this.d = z;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx51)) {
            return false;
        }
        cx51 cx51Var = (cx51) obj;
        return this.a.equals(cx51Var.a) && this.b.equals(cx51Var.b) && jl40.l(this.c, cx51Var.c) && this.d == cx51Var.d && this.e.equals(cx51Var.e) && this.f.equals(cx51Var.f) && this.g.equals(cx51Var.g) && this.h.equals(cx51Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        mv51 mv51Var = this.c;
        return this.h.hashCode() + unr0.b(unr0.b(unr0.b(unr0.e((hashCode + (mv51Var == null ? 0 : mv51Var.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SplitAvailable(baseLimit=");
        sb.append(this.a);
        sb.append(", remainingLimit=");
        sb.append(this.b);
        sb.append(", totalDebt=");
        sb.append(this.c);
        sb.append(", splitUpgraded=");
        sb.append(this.d);
        sb.append(", onboardingUrl=");
        g8e.D(sb, this.e, ", accountUrl=", this.f, ", futurePaymentsUrl=");
        sb.append(this.g);
        sb.append(", hasActiveSplit=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
