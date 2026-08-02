package xsna;

import com.vk.api.base.Document;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CommunityProfileContentItem.kt */
/* loaded from: classes5.dex */
public final class sun extends CommunityProfileContentItem {
    public final List<Document> j;
    public final boolean k;
    public final String l;
    public final CommunityProfileContentItem.b m;
    public final CommunityProfileContentItem.c n;
    public final CommunityProfileContentItem.State o;
    public final CommunityProfileContentItem.d p;
    public final CommunityProfileContentItem.State q;

    /* JADX WARN: Multi-variable type inference failed */
    public sun(List<? extends Document> list, boolean z, String str, CommunityProfileContentItem.b bVar, CommunityProfileContentItem.c cVar, CommunityProfileContentItem.State state, CommunityProfileContentItem.d dVar, CommunityProfileContentItem.State state2) {
        super(new ContentTab.Document(0), list != 0 ? list.size() : 0, bVar, cVar, state, dVar, state2, 9, null, 1536);
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
    public static sun i(sun sunVar, ArrayList arrayList, boolean z, String str, CommunityProfileContentItem.State state, CommunityProfileContentItem.State state2, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = sunVar.j;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            z = sunVar.k;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str = sunVar.l;
        }
        CommunityProfileContentItem.b bVar = sunVar.m;
        CommunityProfileContentItem.c cVar = sunVar.n;
        CommunityProfileContentItem.d dVar = sunVar.p;
        sunVar.getClass();
        return new sun(list2, z2, str, bVar, cVar, state, dVar, state2);
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
        if (!(obj instanceof sun)) {
            return false;
        }
        sun sunVar = (sun) obj;
        return epx.f(this.j, sunVar.j) && this.k == sunVar.k && epx.f(this.l, sunVar.l) && epx.f(this.m, sunVar.m) && epx.f(this.n, sunVar.n) && this.o == sunVar.o && epx.f(this.p, sunVar.p) && this.q == sunVar.q;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.State f() {
        return this.o;
    }

    public final int hashCode() {
        List<Document> list = this.j;
        int b = qoy.b((list == null ? 0 : list.hashCode()) * 31, 31, this.k);
        String str = this.l;
        int a = io.reactivex.rxjava3.internal.operators.mixed.j.a(this.o, shy.a(this.n.a, (this.m.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31);
        CommunityProfileContentItem.d dVar = this.p;
        return this.q.hashCode() + ((a + (dVar != null ? dVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Documents(docs=" + this.j + ", hasMore=" + this.k + ", nextFrom=" + this.l + ", empty=" + this.m + ", error=" + this.n + ", state=" + this.o + ", fabState=" + this.p + ", loadMoreState=" + this.q + ')';
    }
}
