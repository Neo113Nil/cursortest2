package xsna;

import com.vk.dto.articles.Article;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Articles.kt */
/* loaded from: classes5.dex */
public final class fq3 extends CommunityProfileContentItem {
    public final List<Article> j;
    public final boolean k;
    public final String l;
    public final CommunityProfileContentItem.b m;
    public final CommunityProfileContentItem.c n;
    public final CommunityProfileContentItem.State o;
    public final CommunityProfileContentItem.State p;
    public final CommunityProfileContentItem.d q;
    public final boolean r;
    public final CommunityProfileContentItem.e s;

    public /* synthetic */ fq3(CommunityProfileContentItem.b bVar, CommunityProfileContentItem.c cVar, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2, CommunityProfileContentItem.d dVar, boolean z) {
        this(null, false, null, bVar, cVar, state, state2, dVar, z, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static fq3 i(fq3 fq3Var, ArrayList arrayList, boolean z, String str, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = fq3Var.j;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            z = fq3Var.k;
        }
        boolean z2 = z;
        fq3Var.getClass();
        String str2 = (i & 8) != 0 ? fq3Var.l : str;
        CommunityProfileContentItem.b bVar = fq3Var.m;
        CommunityProfileContentItem.c cVar = fq3Var.n;
        CommunityProfileContentItem.State state3 = (i & 64) != 0 ? fq3Var.o : state;
        CommunityProfileContentItem.State state4 = (i & 128) != 0 ? fq3Var.p : state2;
        CommunityProfileContentItem.d dVar = fq3Var.q;
        boolean z3 = fq3Var.r;
        CommunityProfileContentItem.e eVar = (i & 1024) != 0 ? fq3Var.s : null;
        fq3Var.getClass();
        return new fq3(list2, z2, str2, bVar, cVar, state3, state4, dVar, z3, eVar);
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
        return this.q;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.State d() {
        return this.p;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.e e() {
        return this.s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fq3)) {
            return false;
        }
        fq3 fq3Var = (fq3) obj;
        return epx.f(this.j, fq3Var.j) && this.k == fq3Var.k && epx.f(this.l, fq3Var.l) && epx.f(this.m, fq3Var.m) && epx.f(this.n, fq3Var.n) && this.o == fq3Var.o && this.p == fq3Var.p && epx.f(this.q, fq3Var.q) && this.r == fq3Var.r && epx.f(this.s, fq3Var.s);
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
        List<Article> list = this.j;
        int a = shy.a(0, qoy.b((list == null ? 0 : list.hashCode()) * 31, 31, this.k), 31);
        String str = this.l;
        int a2 = io.reactivex.rxjava3.internal.operators.mixed.j.a(this.p, io.reactivex.rxjava3.internal.operators.mixed.j.a(this.o, shy.a(this.n.a, (this.m.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31), 31);
        CommunityProfileContentItem.d dVar = this.q;
        int b = qoy.b((a2 + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.r);
        CommunityProfileContentItem.e eVar = this.s;
        return b + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "Articles(articles=" + this.j + ", hasMore=" + this.k + ", offset=0, nextFrom=" + this.l + ", empty=" + this.m + ", error=" + this.n + ", state=" + this.o + ", loadMoreState=" + this.p + ", fabState=" + this.q + ", isPinned=" + this.r + ", onboardingState=" + this.s + ')';
    }

    public fq3(List list, boolean z, String str, CommunityProfileContentItem.b bVar, CommunityProfileContentItem.c cVar, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2, CommunityProfileContentItem.d dVar, boolean z2, CommunityProfileContentItem.e eVar) {
        super(new ContentTab.Article(z2, 2), list != null ? list.size() : 0, bVar, cVar, state, dVar, state2, 10, eVar, 512);
        this.j = list;
        this.k = z;
        this.l = str;
        this.m = bVar;
        this.n = cVar;
        this.o = state;
        this.p = state2;
        this.q = dVar;
        this.r = z2;
        this.s = eVar;
    }
}
