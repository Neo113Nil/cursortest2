package xsna;

import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;

/* compiled from: CommunityProfileContentItem.kt */
/* loaded from: classes5.dex */
public final class b9x0 extends CommunityProfileContentItem {
    public final CommunityProfileContentItem.b j;
    public final CommunityProfileContentItem.c k;
    public final CommunityProfileContentItem.State l;
    public final boolean m;
    public final CommunityProfileContentItem.e n;

    public /* synthetic */ b9x0(CommunityProfileContentItem.b bVar, CommunityProfileContentItem.c cVar, CommunityProfileContentItem.State state, boolean z, int i) {
        this(bVar, cVar, state, (i & 8) != 0 ? false : z, (CommunityProfileContentItem.e) null);
    }

    public static b9x0 i(b9x0 b9x0Var, CommunityProfileContentItem.State state, int i) {
        CommunityProfileContentItem.b bVar = b9x0Var.j;
        CommunityProfileContentItem.c cVar = b9x0Var.k;
        if ((i & 4) != 0) {
            state = b9x0Var.l;
        }
        CommunityProfileContentItem.State state2 = state;
        boolean z = b9x0Var.m;
        CommunityProfileContentItem.e eVar = (i & 16) != 0 ? b9x0Var.n : null;
        b9x0Var.getClass();
        return new b9x0(bVar, cVar, state2, z, eVar);
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
        if (!(obj instanceof b9x0)) {
            return false;
        }
        b9x0 b9x0Var = (b9x0) obj;
        return epx.f(this.j, b9x0Var.j) && epx.f(this.k, b9x0Var.k) && this.l == b9x0Var.l && this.m == b9x0Var.m && epx.f(this.n, b9x0Var.n);
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
        return "Wall(empty=" + this.j + ", error=" + this.k + ", state=" + this.l + ", isPinned=" + this.m + ", onboardingState=" + this.n + ')';
    }

    public b9x0(CommunityProfileContentItem.b bVar, CommunityProfileContentItem.c cVar, CommunityProfileContentItem.State state, boolean z, CommunityProfileContentItem.e eVar) {
        super(new ContentTab.Wall(z, 2), 0, bVar, cVar, state, null, CommunityProfileContentItem.State.LOADED, 0, eVar, 512);
        this.j = bVar;
        this.k = cVar;
        this.l = state;
        this.m = z;
        this.n = eVar;
    }
}
