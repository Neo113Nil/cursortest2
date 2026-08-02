package xsna;

import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;

/* compiled from: Archive.kt */
/* loaded from: classes5.dex */
public final class hg3 extends CommunityProfileContentItem {
    public final CommunityProfileContentItem.b j;
    public final CommunityProfileContentItem.c k;
    public final CommunityProfileContentItem.State l;
    public final boolean m;
    public final CommunityProfileContentItem.e n;

    public hg3(CommunityProfileContentItem.b bVar, CommunityProfileContentItem.c cVar, CommunityProfileContentItem.State state, boolean z, CommunityProfileContentItem.e eVar) {
        super(new ContentTab.Archive(z, 2), 0, bVar, cVar, state, null, CommunityProfileContentItem.State.LOADED, 16, eVar, 512);
        this.j = bVar;
        this.k = cVar;
        this.l = state;
        this.m = z;
        this.n = eVar;
    }

    public static hg3 i(hg3 hg3Var, CommunityProfileContentItem.State state, int i) {
        CommunityProfileContentItem.b bVar = hg3Var.j;
        CommunityProfileContentItem.c cVar = hg3Var.k;
        if ((i & 4) != 0) {
            state = hg3Var.l;
        }
        CommunityProfileContentItem.State state2 = state;
        boolean z = hg3Var.m;
        CommunityProfileContentItem.e eVar = (i & 16) != 0 ? hg3Var.n : null;
        hg3Var.getClass();
        return new hg3(bVar, cVar, state2, z, eVar);
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.b a() {
        return this.j;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.c b() {
        return this.k;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.e e() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg3)) {
            return false;
        }
        hg3 hg3Var = (hg3) obj;
        return epx.f(this.j, hg3Var.j) && epx.f(this.k, hg3Var.k) && this.l == hg3Var.l && this.m == hg3Var.m && epx.f(this.n, hg3Var.n);
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.State f() {
        return this.l;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final boolean g() {
        return this.m;
    }

    public final int hashCode() {
        int b = qoy.b(io.reactivex.rxjava3.internal.operators.mixed.j.a(this.l, shy.a(this.k.a, this.j.hashCode() * 31, 31), 31), 31, this.m);
        CommunityProfileContentItem.e eVar = this.n;
        return b + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "Archive(empty=" + this.j + ", error=" + this.k + ", state=" + this.l + ", isPinned=" + this.m + ", onboardingState=" + this.n + ')';
    }
}
