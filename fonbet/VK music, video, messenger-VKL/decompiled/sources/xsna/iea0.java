package xsna;

import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import xsna.cvd0;

/* compiled from: Photos.kt */
/* loaded from: classes5.dex */
public final class iea0 extends CommunityProfileContentItem {
    public final cvd0.d j;
    public final cvd0.c k;
    public final CommunityProfileContentItem.ContentType l;
    public final String m;
    public final boolean n;
    public final boolean o;
    public final String p;
    public final CommunityProfileContentItem.b q;
    public final CommunityProfileContentItem.c r;
    public final CommunityProfileContentItem.State s;
    public final CommunityProfileContentItem.d t;
    public final CommunityProfileContentItem.State u;
    public final boolean v;
    public final CommunityProfileContentItem.e w;

    public /* synthetic */ iea0(CommunityProfileContentItem.ContentType contentType, CommunityProfileContentItem.b bVar, CommunityProfileContentItem.c cVar, CommunityProfileContentItem.State state, CommunityProfileContentItem.d dVar, CommunityProfileContentItem.State state2, boolean z, int i) {
        this(null, null, contentType, null, false, false, null, bVar, cVar, state, dVar, state2, (i & 4096) != 0 ? false : z, null);
    }

    public static iea0 i(iea0 iea0Var, cvd0.d dVar, cvd0.c cVar, CommunityProfileContentItem.ContentType contentType, String str, boolean z, boolean z2, String str2, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2, int i) {
        cvd0.d dVar2 = (i & 1) != 0 ? iea0Var.j : dVar;
        cvd0.c cVar2 = (i & 2) != 0 ? iea0Var.k : cVar;
        CommunityProfileContentItem.ContentType contentType2 = (i & 4) != 0 ? iea0Var.l : contentType;
        String str3 = (i & 8) != 0 ? iea0Var.m : str;
        boolean z3 = (i & 16) != 0 ? iea0Var.n : z;
        boolean z4 = (i & 32) != 0 ? iea0Var.o : z2;
        String str4 = (i & 64) != 0 ? iea0Var.p : str2;
        CommunityProfileContentItem.b bVar = iea0Var.q;
        CommunityProfileContentItem.c cVar3 = iea0Var.r;
        CommunityProfileContentItem.State state3 = (i & 512) != 0 ? iea0Var.s : state;
        CommunityProfileContentItem.d dVar3 = iea0Var.t;
        CommunityProfileContentItem.State state4 = (i & 2048) != 0 ? iea0Var.u : state2;
        boolean z5 = iea0Var.v;
        CommunityProfileContentItem.e eVar = (i & 8192) != 0 ? iea0Var.w : null;
        iea0Var.getClass();
        return new iea0(dVar2, cVar2, contentType2, str3, z3, z4, str4, bVar, cVar3, state3, dVar3, state4, z5, eVar);
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.b a() {
        return this.q;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.c b() {
        return this.r;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.d c() {
        return this.t;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.State d() {
        return this.u;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.e e() {
        return this.w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iea0)) {
            return false;
        }
        iea0 iea0Var = (iea0) obj;
        return epx.f(this.j, iea0Var.j) && epx.f(this.k, iea0Var.k) && this.l == iea0Var.l && epx.f(this.m, iea0Var.m) && this.n == iea0Var.n && this.o == iea0Var.o && epx.f(this.p, iea0Var.p) && epx.f(this.q, iea0Var.q) && epx.f(this.r, iea0Var.r) && this.s == iea0Var.s && epx.f(this.t, iea0Var.t) && this.u == iea0Var.u && this.v == iea0Var.v && epx.f(this.w, iea0Var.w);
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.State f() {
        return this.s;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final boolean g() {
        return this.v;
    }

    public final int hashCode() {
        cvd0.d dVar = this.j;
        int hashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        cvd0.c cVar = this.k;
        int hashCode2 = (this.l.hashCode() + ((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31;
        String str = this.m;
        int b = qoy.b(qoy.b((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.n), 31, this.o);
        String str2 = this.p;
        int a = io.reactivex.rxjava3.internal.operators.mixed.j.a(this.s, shy.a(this.r.a, (this.q.hashCode() + ((b + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31), 31);
        CommunityProfileContentItem.d dVar2 = this.t;
        int b2 = qoy.b(io.reactivex.rxjava3.internal.operators.mixed.j.a(this.u, (a + (dVar2 == null ? 0 : dVar2.hashCode())) * 31, 31), 31, this.v);
        CommunityProfileContentItem.e eVar = this.w;
        return b2 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "Photos(photos=" + this.j + ", albums=" + this.k + ", contentType=" + this.l + ", albumNextFrom=" + this.m + ", hasMore=" + this.n + ", hasMoreMixedAlbums=" + this.o + ", nextFrom=" + this.p + ", empty=" + this.q + ", error=" + this.r + ", state=" + this.s + ", fabState=" + this.t + ", loadMoreState=" + this.u + ", isPinned=" + this.v + ", onboardingState=" + this.w + ')';
    }

    public iea0(cvd0.d dVar, cvd0.c cVar, CommunityProfileContentItem.ContentType contentType, String str, boolean z, boolean z2, String str2, CommunityProfileContentItem.b bVar, CommunityProfileContentItem.c cVar2, CommunityProfileContentItem.State state, CommunityProfileContentItem.d dVar2, CommunityProfileContentItem.State state2, boolean z3, CommunityProfileContentItem.e eVar) {
        super(new ContentTab.Photo(z3, 2), dVar != null ? dVar.a.size() : 0, bVar, cVar2, state, dVar2, state2, 1, eVar, 512);
        this.j = dVar;
        this.k = cVar;
        this.l = contentType;
        this.m = str;
        this.n = z;
        this.o = z2;
        this.p = str2;
        this.q = bVar;
        this.r = cVar2;
        this.s = state;
        this.t = dVar2;
        this.u = state2;
        this.v = z3;
        this.w = eVar;
    }
}
