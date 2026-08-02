package xsna;

import xsna.mih0;

/* compiled from: ClipsFeedItemSecondaryBadgesModel.kt */
/* loaded from: classes17.dex */
public final class j7e {
    public final mih0.k a;
    public final mih0.n b;
    public final mih0.p c;
    public final mih0.i d;
    public final mih0.m e;
    public final mih0.l f;
    public final mih0.d<mih0.a> g;
    public final mih0.c h;
    public final mih0.d<mih0.f> i;
    public final mih0.d<mih0.f> j;
    public final mih0.b k;
    public final int l;

    public j7e() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7e)) {
            return false;
        }
        j7e j7eVar = (j7e) obj;
        return epx.f(this.a, j7eVar.a) && epx.f(this.b, j7eVar.b) && epx.f(this.c, j7eVar.c) && epx.f(this.d, j7eVar.d) && epx.f(this.e, j7eVar.e) && epx.f(this.f, j7eVar.f) && epx.f(this.g, j7eVar.g) && epx.f(this.h, j7eVar.h) && epx.f(this.i, j7eVar.i) && epx.f(this.j, j7eVar.j) && epx.f(this.k, j7eVar.k) && this.l == j7eVar.l;
    }

    public final int hashCode() {
        mih0.k kVar = this.a;
        int hashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
        mih0.n nVar = this.b;
        int hashCode2 = (hashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        mih0.p pVar = this.c;
        int hashCode3 = (hashCode2 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        mih0.i iVar = this.d;
        int hashCode4 = (hashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        mih0.m mVar = this.e;
        int hashCode5 = (hashCode4 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        mih0.l lVar = this.f;
        int hashCode6 = (hashCode5 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        mih0.d<mih0.a> dVar = this.g;
        int hashCode7 = (hashCode6 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        mih0.c cVar = this.h;
        int hashCode8 = (hashCode7 + (cVar == null ? 0 : cVar.i.hashCode())) * 31;
        mih0.d<mih0.f> dVar2 = this.i;
        int hashCode9 = (hashCode8 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        mih0.d<mih0.f> dVar3 = this.j;
        int hashCode10 = (hashCode9 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        mih0.b bVar = this.k;
        return Integer.hashCode(this.l) + ((hashCode10 + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsFeedItemSecondaryBadgesModel(newsMonothemeBadge=");
        sb.append(this.a);
        sb.append(", productsBadge=");
        sb.append(this.b);
        sb.append(", shopsMoreBadge=");
        sb.append(this.c);
        sb.append(", musicBadge=");
        sb.append(this.d);
        sb.append(", privacyInfoBadge=");
        sb.append(this.e);
        sb.append(", playlistsBadge=");
        sb.append(this.f);
        sb.append(", compilationBadge=");
        sb.append(this.g);
        sb.append(", geoPlaceBadge=");
        sb.append(this.h);
        sb.append(", effectsBadge=");
        sb.append(this.i);
        sb.append(", masksBadge=");
        sb.append(this.j);
        sb.append(", duetBadge=");
        sb.append(this.k);
        sb.append(", badgesLimit=");
        return vu5.b(sb, this.l, ')');
    }

    public /* synthetic */ j7e(int i) {
        this(null, null, null, null, null, null, null, null, null, null, null, Integer.MAX_VALUE);
    }

    public j7e(mih0.k kVar, mih0.n nVar, mih0.p pVar, mih0.i iVar, mih0.m mVar, mih0.l lVar, mih0.d<mih0.a> dVar, mih0.c cVar, mih0.d<mih0.f> dVar2, mih0.d<mih0.f> dVar3, mih0.b bVar, int i) {
        this.a = kVar;
        this.b = nVar;
        this.c = pVar;
        this.d = iVar;
        this.e = mVar;
        this.f = lVar;
        this.g = dVar;
        this.h = cVar;
        this.i = dVar2;
        this.j = dVar3;
        this.k = bVar;
        this.l = i;
    }
}
