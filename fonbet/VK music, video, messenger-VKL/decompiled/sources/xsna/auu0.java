package xsna;

import xsna.tlo0;

/* compiled from: VkFeedCarouselCard.kt */
/* loaded from: classes18.dex */
public final class auu0 {
    public final tlo0.h a;
    public final tlo0 b;
    public final dko c;
    public final cut0 d;
    public final tlo0 e;
    public final tlo0.h f;

    public auu0(tlo0.h hVar, tlo0.h hVar2, gko gkoVar, b8g b8gVar, tlo0.h hVar3, tlo0.h hVar4) {
        this.a = hVar;
        this.b = hVar2;
        this.c = gkoVar;
        this.d = b8gVar;
        this.e = hVar3;
        this.f = hVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof auu0)) {
            return false;
        }
        auu0 auu0Var = (auu0) obj;
        return this.a.equals(auu0Var.a) && epx.f(this.b, auu0Var.b) && epx.f(this.c, auu0Var.c) && epx.f(this.d, auu0Var.d) && epx.f(this.e, auu0Var.e) && this.f.equals(auu0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        tlo0 tlo0Var = this.b;
        int hashCode2 = (hashCode + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31;
        dko dkoVar = this.c;
        int hashCode3 = (hashCode2 + (dkoVar == null ? 0 : dkoVar.hashCode())) * 31;
        cut0 cut0Var = this.d;
        int hashCode4 = (hashCode3 + (cut0Var == null ? 0 : cut0Var.hashCode())) * 31;
        tlo0 tlo0Var2 = this.e;
        return this.f.a.hashCode() + ((hashCode4 + (tlo0Var2 != null ? tlo0Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Label(title=");
        sb.append(this.a);
        sb.append(", extraTitle=");
        sb.append(this.b);
        sb.append(", titleEndIcon=");
        sb.append(this.c);
        sb.append(", titleEndIconTint=");
        sb.append(this.d);
        sb.append(", titleEndIconDescription=");
        sb.append(this.e);
        sb.append(", subtitle=");
        return jq.c(sb, this.f, ')');
    }
}
