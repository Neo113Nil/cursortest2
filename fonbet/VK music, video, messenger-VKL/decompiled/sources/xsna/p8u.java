package xsna;

import com.vk.dto.common.GoodAlbum;
import com.vk.profile.community.impl.ui.profile.state.MarketInfoBlockModel;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CommunityProfileContentItem.kt */
/* loaded from: classes5.dex */
public final class p8u extends CommunityProfileContentItem {
    public final a9u j;
    public final List<GoodAlbum> k;
    public final CommunityProfileContentItem.ContentType l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final String q;
    public final MarketInfoBlockModel r;
    public final e11 s;
    public final String t;
    public final CommunityProfileContentItem.b u;
    public final CommunityProfileContentItem.c v;
    public final CommunityProfileContentItem.State w;
    public final CommunityProfileContentItem.State x;
    public final CommunityProfileContentItem.d y;

    /* JADX WARN: Multi-variable type inference failed */
    public p8u(a9u a9uVar, List<? extends GoodAlbum> list, CommunityProfileContentItem.ContentType contentType, boolean z, boolean z2, boolean z3, boolean z4, String str, MarketInfoBlockModel marketInfoBlockModel, e11 e11Var, String str2, CommunityProfileContentItem.b bVar, CommunityProfileContentItem.c cVar, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2, CommunityProfileContentItem.d dVar) {
        super(new ContentTab.Goods(0), a9uVar != null ? a9uVar.a.size() : 0, bVar, cVar, state, dVar, state2, 12, null, 1536);
        this.j = a9uVar;
        this.k = list;
        this.l = contentType;
        this.m = z;
        this.n = z2;
        this.o = z3;
        this.p = z4;
        this.q = str;
        this.r = marketInfoBlockModel;
        this.s = e11Var;
        this.t = str2;
        this.u = bVar;
        this.v = cVar;
        this.w = state;
        this.x = state2;
        this.y = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static p8u i(p8u p8uVar, a9u a9uVar, ArrayList arrayList, CommunityProfileContentItem.ContentType contentType, boolean z, boolean z2, String str, MarketInfoBlockModel marketInfoBlockModel, e11 e11Var, String str2, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2, CommunityProfileContentItem.d dVar, int i) {
        a9u a9uVar2 = (i & 1) != 0 ? p8uVar.j : a9uVar;
        List list = (i & 2) != 0 ? p8uVar.k : arrayList;
        CommunityProfileContentItem.ContentType contentType2 = (i & 4) != 0 ? p8uVar.l : contentType;
        boolean z3 = p8uVar.m;
        boolean z4 = p8uVar.n;
        boolean z5 = (i & 32) != 0 ? p8uVar.o : z;
        boolean z6 = (i & 64) != 0 ? p8uVar.p : z2;
        String str3 = (i & 128) != 0 ? p8uVar.q : str;
        MarketInfoBlockModel marketInfoBlockModel2 = (i & 256) != 0 ? p8uVar.r : marketInfoBlockModel;
        e11 e11Var2 = (i & 512) != 0 ? p8uVar.s : e11Var;
        String str4 = (i & 1024) != 0 ? p8uVar.t : str2;
        CommunityProfileContentItem.b bVar = p8uVar.u;
        CommunityProfileContentItem.c cVar = p8uVar.v;
        CommunityProfileContentItem.State state3 = (i & 8192) != 0 ? p8uVar.w : state;
        CommunityProfileContentItem.State state4 = (i & 16384) != 0 ? p8uVar.x : state2;
        CommunityProfileContentItem.d dVar2 = (i & 32768) != 0 ? p8uVar.y : dVar;
        p8uVar.getClass();
        return new p8u(a9uVar2, list, contentType2, z3, z4, z5, z6, str3, marketInfoBlockModel2, e11Var2, str4, bVar, cVar, state3, state4, dVar2);
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.b a() {
        return this.u;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.c b() {
        return this.v;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.d c() {
        return this.y;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.State d() {
        return this.x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8u)) {
            return false;
        }
        p8u p8uVar = (p8u) obj;
        return epx.f(this.j, p8uVar.j) && epx.f(this.k, p8uVar.k) && this.l == p8uVar.l && this.m == p8uVar.m && this.n == p8uVar.n && this.o == p8uVar.o && this.p == p8uVar.p && epx.f(this.q, p8uVar.q) && epx.f(this.r, p8uVar.r) && epx.f(this.s, p8uVar.s) && epx.f(this.t, p8uVar.t) && epx.f(this.u, p8uVar.u) && epx.f(this.v, p8uVar.v) && this.w == p8uVar.w && this.x == p8uVar.x && epx.f(this.y, p8uVar.y);
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.State f() {
        return this.w;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final int h() {
        int h = super.h() * 31;
        a9u a9uVar = this.j;
        return h + (a9uVar != null ? a9uVar.hashCode() : 0);
    }

    public final int hashCode() {
        a9u a9uVar = this.j;
        int hashCode = (a9uVar == null ? 0 : a9uVar.hashCode()) * 31;
        List<GoodAlbum> list = this.k;
        int b = qoy.b(qoy.b(qoy.b(qoy.b((this.l.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p);
        String str = this.q;
        int hashCode2 = (b + (str == null ? 0 : str.hashCode())) * 31;
        MarketInfoBlockModel marketInfoBlockModel = this.r;
        int hashCode3 = (hashCode2 + (marketInfoBlockModel == null ? 0 : marketInfoBlockModel.hashCode())) * 31;
        e11 e11Var = this.s;
        int hashCode4 = (hashCode3 + (e11Var == null ? 0 : e11Var.hashCode())) * 31;
        String str2 = this.t;
        int a = io.reactivex.rxjava3.internal.operators.mixed.j.a(this.x, io.reactivex.rxjava3.internal.operators.mixed.j.a(this.w, shy.a(this.v.a, (this.u.hashCode() + ((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31), 31), 31);
        CommunityProfileContentItem.d dVar = this.y;
        return a + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "Goods(goods=" + this.j + ", goodAlbums=" + this.k + ", contentType=" + this.l + ", canAdd=" + this.m + ", showMore=" + this.n + ", hasMore=" + this.o + ", hasMoreMixedAlbums=" + this.p + ", editUrl=" + this.q + ", infoBlock=" + this.r + ", adsMarketPromote=" + this.s + ", nextFrom=" + this.t + ", empty=" + this.u + ", error=" + this.v + ", state=" + this.w + ", loadMoreState=" + this.x + ", fabState=" + this.y + ')';
    }
}
