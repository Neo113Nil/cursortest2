package xsna;

import com.vk.dto.gift.GiftItem;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Gifts.kt */
/* loaded from: classes5.dex */
public final class mzt extends CommunityProfileContentItem {
    public final List<GiftItem> j;
    public final boolean k;
    public final int l;
    public final String m;
    public final CommunityProfileContentItem.b n;
    public final CommunityProfileContentItem.c o;
    public final CommunityProfileContentItem.State p;
    public final CommunityProfileContentItem.d q;
    public final CommunityProfileContentItem.State r;
    public final boolean s;

    /* JADX WARN: Multi-variable type inference failed */
    public mzt(List<? extends GiftItem> list, boolean z, int i, String str, CommunityProfileContentItem.b bVar, CommunityProfileContentItem.c cVar, CommunityProfileContentItem.State state, CommunityProfileContentItem.d dVar, CommunityProfileContentItem.State state2, boolean z2) {
        super(new ContentTab.Gift(z2, 2), list != 0 ? list.size() : 0, bVar, cVar, state, dVar, state2, 18, null, 1536);
        this.j = list;
        this.k = z;
        this.l = i;
        this.m = str;
        this.n = bVar;
        this.o = cVar;
        this.p = state;
        this.q = dVar;
        this.r = state2;
        this.s = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static mzt i(mzt mztVar, ArrayList arrayList, boolean z, int i, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2, int i2) {
        List list = arrayList;
        if ((i2 & 1) != 0) {
            list = mztVar.j;
        }
        List list2 = list;
        if ((i2 & 2) != 0) {
            z = mztVar.k;
        }
        boolean z2 = z;
        int i3 = (i2 & 4) != 0 ? mztVar.l : i;
        String str = (i2 & 8) != 0 ? mztVar.m : null;
        CommunityProfileContentItem.b bVar = mztVar.n;
        CommunityProfileContentItem.c cVar = mztVar.o;
        CommunityProfileContentItem.State state3 = (i2 & 64) != 0 ? mztVar.p : state;
        CommunityProfileContentItem.d dVar = mztVar.q;
        CommunityProfileContentItem.State state4 = (i2 & 256) != 0 ? mztVar.r : state2;
        boolean z3 = mztVar.s;
        mztVar.getClass();
        return new mzt(list2, z2, i3, str, bVar, cVar, state3, dVar, state4, z3);
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.b a() {
        return this.n;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.c b() {
        return this.o;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.d c() {
        return this.q;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.State d() {
        return this.r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzt)) {
            return false;
        }
        mzt mztVar = (mzt) obj;
        return epx.f(this.j, mztVar.j) && this.k == mztVar.k && this.l == mztVar.l && epx.f(this.m, mztVar.m) && epx.f(this.n, mztVar.n) && epx.f(this.o, mztVar.o) && this.p == mztVar.p && epx.f(this.q, mztVar.q) && this.r == mztVar.r && this.s == mztVar.s;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.State f() {
        return this.p;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final boolean g() {
        return this.s;
    }

    public final int hashCode() {
        List<GiftItem> list = this.j;
        int a = shy.a(this.l, qoy.b((list == null ? 0 : list.hashCode()) * 31, 31, this.k), 31);
        String str = this.m;
        int a2 = io.reactivex.rxjava3.internal.operators.mixed.j.a(this.p, shy.a(this.o.a, (this.n.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31);
        CommunityProfileContentItem.d dVar = this.q;
        return Boolean.hashCode(this.s) + io.reactivex.rxjava3.internal.operators.mixed.j.a(this.r, (a2 + (dVar != null ? dVar.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Gifts(gifts=");
        sb.append(this.j);
        sb.append(", hasMore=");
        sb.append(this.k);
        sb.append(", totalCount=");
        sb.append(this.l);
        sb.append(", nextFrom=");
        sb.append(this.m);
        sb.append(", empty=");
        sb.append(this.n);
        sb.append(", error=");
        sb.append(this.o);
        sb.append(", state=");
        sb.append(this.p);
        sb.append(", fabState=");
        sb.append(this.q);
        sb.append(", loadMoreState=");
        sb.append(this.r);
        sb.append(", isPinned=");
        return defpackage.q0.a(sb, this.s, ')');
    }
}
