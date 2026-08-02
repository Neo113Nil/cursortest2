package xsna;

import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import xsna.cvd0;

/* compiled from: Narratives.kt */
/* loaded from: classes5.dex */
public final class uu50 extends CommunityProfileContentItem {
    public final cvd0.b j;
    public final boolean k;
    public final String l;
    public final CommunityProfileContentItem.b m;
    public final CommunityProfileContentItem.c n;
    public final CommunityProfileContentItem.State o;
    public final CommunityProfileContentItem.d p;
    public final CommunityProfileContentItem.State q;
    public final boolean r;
    public final boolean s;
    public final CommunityProfileContentItem.e t;

    public /* synthetic */ uu50(CommunityProfileContentItem.b bVar, CommunityProfileContentItem.c cVar, CommunityProfileContentItem.State state, CommunityProfileContentItem.d dVar, CommunityProfileContentItem.State state2, boolean z, boolean z2, int i) {
        this(null, false, null, bVar, cVar, state, dVar, state2, (i & 256) != 0 ? false : z, (i & 512) != 0 ? false : z2, null);
    }

    public static uu50 i(uu50 uu50Var, cvd0.b bVar, boolean z, String str, CommunityProfileContentItem.b bVar2, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2, boolean z2, int i) {
        if ((i & 1) != 0) {
            bVar = uu50Var.j;
        }
        cvd0.b bVar3 = bVar;
        boolean z3 = (i & 2) != 0 ? uu50Var.k : z;
        String str2 = (i & 4) != 0 ? uu50Var.l : str;
        CommunityProfileContentItem.b bVar4 = (i & 8) != 0 ? uu50Var.m : bVar2;
        CommunityProfileContentItem.c cVar = uu50Var.n;
        CommunityProfileContentItem.State state3 = (i & 32) != 0 ? uu50Var.o : state;
        CommunityProfileContentItem.d dVar = uu50Var.p;
        CommunityProfileContentItem.State state4 = (i & 128) != 0 ? uu50Var.q : state2;
        boolean z4 = uu50Var.r;
        boolean z5 = (i & 512) != 0 ? uu50Var.s : z2;
        CommunityProfileContentItem.e eVar = (i & 1024) != 0 ? uu50Var.t : null;
        uu50Var.getClass();
        return new uu50(bVar3, z3, str2, bVar4, cVar, state3, dVar, state4, z4, z5, eVar);
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.b a() {
        return this.m;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.c b() {
        return this.n;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.d c() {
        return this.p;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.State d() {
        return this.q;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.e e() {
        return this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu50)) {
            return false;
        }
        uu50 uu50Var = (uu50) obj;
        return epx.f(this.j, uu50Var.j) && this.k == uu50Var.k && epx.f(this.l, uu50Var.l) && epx.f(this.m, uu50Var.m) && epx.f(this.n, uu50Var.n) && this.o == uu50Var.o && epx.f(this.p, uu50Var.p) && this.q == uu50Var.q && this.r == uu50Var.r && this.s == uu50Var.s && epx.f(this.t, uu50Var.t);
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.State f() {
        return this.o;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final boolean g() {
        return this.r;
    }

    public final int hashCode() {
        cvd0.b bVar = this.j;
        int b = qoy.b((bVar == null ? 0 : bVar.hashCode()) * 31, 31, this.k);
        String str = this.l;
        int a = io.reactivex.rxjava3.internal.operators.mixed.j.a(this.o, shy.a(this.n.a, (this.m.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31);
        CommunityProfileContentItem.d dVar = this.p;
        int b2 = qoy.b(qoy.b(io.reactivex.rxjava3.internal.operators.mixed.j.a(this.q, (a + (dVar == null ? 0 : dVar.hashCode())) * 31, 31), 31, this.r), 31, this.s);
        CommunityProfileContentItem.e eVar = this.t;
        return b2 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "Narratives(narratives=" + this.j + ", hasMore=" + this.k + ", nextFrom=" + this.l + ", empty=" + this.m + ", error=" + this.n + ", state=" + this.o + ", fabState=" + this.p + ", loadMoreState=" + this.q + ", isPinned=" + this.r + ", shouldOpenStoriesWhenEmpty=" + this.s + ", onboardingState=" + this.t + ')';
    }

    public uu50(cvd0.b bVar, boolean z, String str, CommunityProfileContentItem.b bVar2, CommunityProfileContentItem.c cVar, CommunityProfileContentItem.State state, CommunityProfileContentItem.d dVar, CommunityProfileContentItem.State state2, boolean z2, boolean z3, CommunityProfileContentItem.e eVar) {
        super(new ContentTab.Narrative(z2, 2), bVar != null ? bVar.a.size() : 0, bVar2, cVar, state, dVar, state2, 5, eVar, 512);
        this.j = bVar;
        this.k = z;
        this.l = str;
        this.m = bVar2;
        this.n = cVar;
        this.o = state;
        this.p = dVar;
        this.q = state2;
        this.r = z2;
        this.s = z3;
        this.t = eVar;
    }
}
