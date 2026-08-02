package xsna;

/* compiled from: CollapsableHeaderViewState.kt */
/* loaded from: classes6.dex */
public final class w7b0 {
    public final pbx0 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public w7b0(pbx0 pbx0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = pbx0Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7b0)) {
            return false;
        }
        w7b0 w7b0Var = (w7b0) obj;
        return epx.f(this.a, w7b0Var.a) && this.b == w7b0Var.b && this.c == w7b0Var.c && this.d == w7b0Var.d && this.e == w7b0Var.e && this.f == w7b0Var.f && this.g == w7b0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistButtonsViewState(watchButton=");
        sb.append(this.a);
        sb.append(", hasShuffleBtn=");
        sb.append(this.b);
        sb.append(", hasSubscribeBtn=");
        sb.append(this.c);
        sb.append(", hasAddVideosBtn=");
        sb.append(this.d);
        sb.append(", isSubscribed=");
        sb.append(this.e);
        sb.append(", showOnCover=");
        sb.append(this.f);
        sb.append(", isShuffleToggleEnabled=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
