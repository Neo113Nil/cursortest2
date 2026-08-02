package xsna;

import xsna.ma5;

/* compiled from: VideoPage.kt */
/* loaded from: classes5.dex */
public final class u95 {
    public final ma5.b a;
    public final q1t0 b;
    public final r1t0 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public u95(ma5.b bVar, q1t0 q1t0Var, r1t0 r1t0Var, boolean z, boolean z2, boolean z3) {
        this.a = bVar;
        this.b = q1t0Var;
        this.c = r1t0Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u95)) {
            return false;
        }
        u95 u95Var = (u95) obj;
        return epx.f(this.a, u95Var.a) && epx.f(this.b, u95Var.b) && epx.f(this.c, u95Var.c) && this.d == u95Var.d && this.e == u95Var.e && this.f == u95Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b(qoy.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorHeaderLiveCoverPlayerState(item=");
        sb.append(this.a);
        sb.append(", playbackController=");
        sb.append(this.b);
        sb.append(", uiState=");
        sb.append(this.c);
        sb.append(", isExpanded=");
        sb.append(this.d);
        sb.append(", shouldAutoAdvance=");
        sb.append(this.e);
        sb.append(", replayOnSamePage=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
