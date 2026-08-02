package xsna;

import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CommunityProfileContentItem.kt */
/* loaded from: classes5.dex */
public final class tan extends CommunityProfileContentItem {
    public final List<ii7> j;
    public final boolean k;
    public final String l;
    public final CommunityProfileContentItem.b m;
    public final CommunityProfileContentItem.c n;
    public final CommunityProfileContentItem.State o;
    public final CommunityProfileContentItem.d p;
    public final CommunityProfileContentItem.State q;

    public tan(List<ii7> list, boolean z, String str, CommunityProfileContentItem.b bVar, CommunityProfileContentItem.c cVar, CommunityProfileContentItem.State state, CommunityProfileContentItem.d dVar, CommunityProfileContentItem.State state2) {
        super(new ContentTab.Discussion(0), list != null ? list.size() : 0, bVar, cVar, state, dVar, state2, 3, null, 1536);
        this.j = list;
        this.k = z;
        this.l = str;
        this.m = bVar;
        this.n = cVar;
        this.o = state;
        this.p = dVar;
        this.q = state2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static tan i(tan tanVar, ArrayList arrayList, boolean z, String str, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = tanVar.j;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            z = tanVar.k;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str = tanVar.l;
        }
        CommunityProfileContentItem.b bVar = tanVar.m;
        CommunityProfileContentItem.c cVar = tanVar.n;
        CommunityProfileContentItem.d dVar = tanVar.p;
        tanVar.getClass();
        return new tan(list2, z2, str, bVar, cVar, state, dVar, state2);
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tan)) {
            return false;
        }
        tan tanVar = (tan) obj;
        return epx.f(this.j, tanVar.j) && this.k == tanVar.k && epx.f(this.l, tanVar.l) && epx.f(this.m, tanVar.m) && epx.f(this.n, tanVar.n) && this.o == tanVar.o && epx.f(this.p, tanVar.p) && this.q == tanVar.q;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.State f() {
        return this.o;
    }

    public final int hashCode() {
        List<ii7> list = this.j;
        int b = qoy.b((list == null ? 0 : list.hashCode()) * 31, 31, this.k);
        String str = this.l;
        int a = io.reactivex.rxjava3.internal.operators.mixed.j.a(this.o, shy.a(this.n.a, (this.m.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31);
        CommunityProfileContentItem.d dVar = this.p;
        return this.q.hashCode() + ((a + (dVar != null ? dVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Discussions(discussions=" + this.j + ", hasMore=" + this.k + ", nextFrom=" + this.l + ", empty=" + this.m + ", error=" + this.n + ", state=" + this.o + ", fabState=" + this.p + ", loadMoreState=" + this.q + ')';
    }
}
