package xsna;

import java.util.List;

/* compiled from: VideoEpisodesDelegate.kt */
/* loaded from: classes2.dex */
public final class btp {
    public final List<atp> a;
    public final fyo0 b;
    public final yqd0 c;
    public final boolean d;
    public final boolean e;

    public btp(List list, fyo0 fyo0Var, yqd0 yqd0Var, boolean z, boolean z2) {
        this.a = list;
        this.b = fyo0Var;
        this.c = yqd0Var;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btp)) {
            return false;
        }
        btp btpVar = (btp) obj;
        return epx.f(this.a, btpVar.a) && this.b.equals(btpVar.b) && this.c.equals(btpVar.c) && this.d == btpVar.d && this.e == btpVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EpisodeListState(items=");
        sb.append(this.a);
        sb.append(", onEpisodeClick=");
        sb.append(this.b);
        sb.append(", onShowAllClick=");
        sb.append(this.c);
        sb.append(", isSystemAnimationsEnabled=");
        sb.append(this.d);
        sb.append(", showTopDivider=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
