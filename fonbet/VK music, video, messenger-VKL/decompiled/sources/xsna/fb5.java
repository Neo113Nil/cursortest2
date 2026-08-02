package xsna;

/* compiled from: AuthorHeaderPicturePager.kt */
/* loaded from: classes5.dex */
public final class fb5 {
    public final float a;
    public final wkj b;
    public final lja0 c;
    public final kja0 d;
    public final boolean e;
    public final Long f;
    public final boolean g;
    public final boolean h;

    public fb5(float f, wkj wkjVar, lja0 lja0Var, kja0 kja0Var, boolean z, Long l, boolean z2, boolean z3) {
        this.a = f;
        this.b = wkjVar;
        this.c = lja0Var;
        this.d = kja0Var;
        this.e = z;
        this.f = l;
        this.g = z2;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb5)) {
            return false;
        }
        fb5 fb5Var = (fb5) obj;
        return pco.b(this.a, fb5Var.a) && this.b.equals(fb5Var.b) && epx.f(this.c, fb5Var.c) && epx.f(this.d, fb5Var.d) && this.e == fb5Var.e && epx.f(this.f, fb5Var.f) && this.g == fb5Var.g && this.h == fb5Var.h;
    }

    public final int hashCode() {
        int b = qoy.b((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31)) * 31)) * 31, 31, this.e);
        Long l = this.f;
        return Boolean.hashCode(this.h) + qoy.b(bh10.a((b + (l == null ? 0 : l.hashCode())) * 31, 31, 6000L), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorHeaderPicturePagerPresentation(picturePaneHeightDp=");
        oq.f(this.a, ", contentScale=", sb);
        sb.append(this.b);
        sb.append(", pictureClickExcludedBounds=");
        sb.append(this.c);
        sb.append(", pictureClickCenter=");
        sb.append(this.d);
        sb.append(", isInfinitePager=");
        sb.append(this.e);
        sb.append(", autoSwitchDurationMillis=");
        sb.append(this.f);
        sb.append(", scaleAnimationDurationMillis=6000, isExpanded=");
        sb.append(this.g);
        sb.append(", isManualVideoPlaybackActive=");
        return defpackage.q0.a(sb, this.h, ')');
    }
}
