package xsna;

import xsna.mih0;

/* compiled from: ClipsFeedItemPrimaryBadgesModel.kt */
/* loaded from: classes17.dex */
public final class h7e {
    public final mih0.j a;
    public final mih0.q b;
    public final int c;

    public h7e() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7e)) {
            return false;
        }
        h7e h7eVar = (h7e) obj;
        return epx.f(this.a, h7eVar.a) && epx.f(this.b, h7eVar.b) && this.c == h7eVar.c;
    }

    public final int hashCode() {
        mih0.j jVar = this.a;
        int hashCode = (jVar == null ? 0 : jVar.hashCode()) * 31;
        mih0.q qVar = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (qVar != null ? qVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsFeedItemPrimaryBadgesModel(musicTemplateBadge=");
        sb.append(this.a);
        sb.append(", trendingHashtagBadge=");
        sb.append(this.b);
        sb.append(", badgesLimit=");
        return vu5.b(sb, this.c, ')');
    }

    public /* synthetic */ h7e(int i) {
        this(null, null, Integer.MAX_VALUE);
    }

    public h7e(mih0.j jVar, mih0.q qVar, int i) {
        this.a = jVar;
        this.b = qVar;
        this.c = i;
    }
}
