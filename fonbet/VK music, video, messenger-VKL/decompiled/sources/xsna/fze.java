package xsna;

import xsna.m36;

/* compiled from: ClipsPublishBannerConfig.kt */
/* loaded from: classes17.dex */
public final class fze {
    public final m36.a a;
    public final g26 b;
    public final tlo0 c;
    public final tlo0 d;
    public final tlo0 e;
    public final String f;

    public fze(m36.a aVar, g26 g26Var, tlo0 tlo0Var, tlo0 tlo0Var2, tlo0 tlo0Var3, String str) {
        this.a = aVar;
        this.b = g26Var;
        this.c = tlo0Var;
        this.d = tlo0Var2;
        this.e = tlo0Var3;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fze)) {
            return false;
        }
        fze fzeVar = (fze) obj;
        return this.a.equals(fzeVar.a) && epx.f(this.b, fzeVar.b) && epx.f(this.c, fzeVar.c) && epx.f(this.d, fzeVar.d) && epx.f(this.e, fzeVar.e) && epx.f(this.f, fzeVar.f);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a.a) * 31;
        g26 g26Var = this.b;
        int hashCode2 = (hashCode + (g26Var == null ? 0 : g26Var.hashCode())) * 31;
        tlo0 tlo0Var = this.c;
        int hashCode3 = (hashCode2 + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31;
        tlo0 tlo0Var2 = this.d;
        int hashCode4 = (hashCode3 + (tlo0Var2 == null ? 0 : tlo0Var2.hashCode())) * 31;
        tlo0 tlo0Var3 = this.e;
        return this.f.hashCode() + ((hashCode4 + (tlo0Var3 != null ? tlo0Var3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsPublishBannerConfig(type=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", buttonText=");
        sb.append(this.e);
        sb.append(", testTag=");
        return ho8.a(sb, this.f, ')');
    }
}
