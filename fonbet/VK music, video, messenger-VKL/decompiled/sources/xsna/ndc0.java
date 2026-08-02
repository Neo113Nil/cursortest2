package xsna;

/* compiled from: PostingConfig.kt */
/* loaded from: classes4.dex */
public final class ndc0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Boolean f;

    public ndc0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Boolean bool) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndc0)) {
            return false;
        }
        ndc0 ndc0Var = (ndc0) obj;
        return this.a == ndc0Var.a && this.b == ndc0Var.b && this.c == ndc0Var.c && this.d == ndc0Var.d && this.e == ndc0Var.e && this.f.equals(ndc0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, false), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingConfig(isCropZoomEnabled=");
        sb.append(this.a);
        sb.append(", isOuterLinkAttachRedesign=");
        sb.append(this.b);
        sb.append(", needShowLayoutSwitch=false, isPostingRedesignV2=");
        sb.append(this.c);
        sb.append(", isSuggestedHashTags=");
        sb.append(this.d);
        sb.append(", isChannelsMethodsEnabled=");
        sb.append(this.e);
        sb.append(", isGrid=");
        return tn.a(sb, this.f, ')');
    }
}
