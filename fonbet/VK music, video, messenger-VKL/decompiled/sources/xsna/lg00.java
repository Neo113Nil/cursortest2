package xsna;

import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;

/* compiled from: CommunityProfileContentItem.kt */
/* loaded from: classes5.dex */
public final class lg00 extends CommunityProfileContentItem {
    public final CommunityProfileContentItem.b j;
    public final CommunityProfileContentItem.c k;
    public final CommunityProfileContentItem.State l;
    public final boolean m;
    public final CommunityProfileContentItem.e n;

    public lg00(CommunityProfileContentItem.b bVar, CommunityProfileContentItem.c cVar, CommunityProfileContentItem.State state, boolean z, CommunityProfileContentItem.e eVar) {
        super(new ContentTab.MainWall(z, 2), 0, bVar, cVar, state, null, CommunityProfileContentItem.State.LOADED, 17, eVar, 512);
        this.j = bVar;
        this.k = cVar;
        this.l = state;
        this.m = z;
        this.n = eVar;
    }

    public static lg00 i(lg00 lg00Var, CommunityProfileContentItem.State state, int i) {
        CommunityProfileContentItem.b bVar = lg00Var.j;
        CommunityProfileContentItem.c cVar = lg00Var.k;
        if ((i & 4) != 0) {
            state = lg00Var.l;
        }
        CommunityProfileContentItem.State state2 = state;
        boolean z = lg00Var.m;
        CommunityProfileContentItem.e eVar = (i & 16) != 0 ? lg00Var.n : null;
        lg00Var.getClass();
        return new lg00(bVar, cVar, state2, z, eVar);
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
        if (!(obj instanceof lg00)) {
            return false;
        }
        lg00 lg00Var = (lg00) obj;
        return epx.f(this.j, lg00Var.j) && epx.f(this.k, lg00Var.k) && this.l == lg00Var.l && this.m == lg00Var.m && epx.f(this.n, lg00Var.n);
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
        return "MainWall(empty=" + this.j + ", error=" + this.k + ", state=" + this.l + ", isPinned=" + this.m + ", onboardingState=" + this.n + ')';
    }
}
