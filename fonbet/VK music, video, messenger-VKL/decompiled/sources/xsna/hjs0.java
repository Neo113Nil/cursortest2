package xsna;

import java.util.List;

/* compiled from: VideoEpisodesContentState.kt */
/* loaded from: classes2.dex */
public final class hjs0 {
    public final List<atp> a;
    public final boolean b;
    public final izs<atp, s3q0> c;
    public final izs<atp, s3q0> d;

    public hjs0(List list, boolean z, izs izsVar, izs izsVar2) {
        this.a = list;
        this.b = z;
        this.c = izsVar;
        this.d = izsVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjs0)) {
            return false;
        }
        hjs0 hjs0Var = (hjs0) obj;
        return epx.f(this.a, hjs0Var.a) && this.b == hjs0Var.b && epx.f(this.c, hjs0Var.c) && epx.f(this.d, hjs0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dq.c(qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, true), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEpisodesContentState(episodes=");
        sb.append(this.a);
        sb.append(", isSystemAnimationsEnabled=");
        sb.append(this.b);
        sb.append(", showShareButton=true, onEpisodeClick=");
        sb.append(this.c);
        sb.append(", onShareClick=");
        return up.c(sb, this.d, ')');
    }
}
