package xsna;

/* compiled from: MainOverlayMappingData.kt */
/* loaded from: classes17.dex */
public final class pf00 {
    public final boolean a;
    public final hw0 b;
    public final tgg c;
    public final b21 d;
    public final j4b0 e;
    public final boolean f;
    public final ev g;
    public final boolean h;
    public final boolean i;

    public pf00(boolean z, hw0 hw0Var, tgg tggVar, b21 b21Var, j4b0 j4b0Var, boolean z2, ev evVar, boolean z3, boolean z4) {
        this.a = z;
        this.b = hw0Var;
        this.c = tggVar;
        this.d = b21Var;
        this.e = j4b0Var;
        this.f = z2;
        this.g = evVar;
        this.h = z3;
        this.i = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf00)) {
            return false;
        }
        pf00 pf00Var = (pf00) obj;
        return this.a == pf00Var.a && epx.f(this.b, pf00Var.b) && epx.f(this.c, pf00Var.c) && epx.f(this.d, pf00Var.d) && epx.f(this.e, pf00Var.e) && this.f == pf00Var.f && epx.f(this.g, pf00Var.g) && this.h == pf00Var.h && this.i == pf00Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + qoy.b((this.g.hashCode() + qoy.b((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MainOverlayMappingData(visible=");
        sb.append(this.a);
        sb.append(", clipState=");
        sb.append(this.b);
        sb.append(", adsData=");
        sb.append(this.c);
        sb.append(", adsBannerData=");
        sb.append(this.d);
        sb.append(", playerState=");
        sb.append(this.e);
        sb.append(", descriptionExpanded=");
        sb.append(this.f);
        sb.append(", actionButtonState=");
        sb.append(this.g);
        sb.append(", isVideoFocused=");
        sb.append(this.h);
        sb.append(", muteInClipFeed=");
        return defpackage.q0.a(sb, this.i, ')');
    }
}
