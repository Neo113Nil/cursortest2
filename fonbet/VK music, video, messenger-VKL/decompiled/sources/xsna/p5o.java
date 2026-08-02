package xsna;

import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;

/* compiled from: CommunityProfileContentItem.kt */
/* loaded from: classes5.dex */
public final class p5o extends CommunityProfileContentItem {
    public final CommunityProfileContentItem.b j;
    public final CommunityProfileContentItem.c k;
    public final CommunityProfileContentItem.State l;
    public final boolean m;

    public p5o(CommunityProfileContentItem.b bVar, CommunityProfileContentItem.c cVar, CommunityProfileContentItem.State state, boolean z) {
        super(new ContentTab.DonutWall(), 0, bVar, cVar, state, null, CommunityProfileContentItem.State.LOADED, 11, null, 1536);
        this.j = bVar;
        this.k = cVar;
        this.l = state;
        this.m = z;
    }

    public static p5o i(p5o p5oVar, CommunityProfileContentItem.State state) {
        CommunityProfileContentItem.b bVar = p5oVar.j;
        CommunityProfileContentItem.c cVar = p5oVar.k;
        boolean z = p5oVar.m;
        p5oVar.getClass();
        return new p5o(bVar, cVar, state, z);
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.b a() {
        return this.j;
    }

    @Override // com.vk.profile.core.tabs.state.CommunityProfileContentItem
    public final CommunityProfileContentItem.c b() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5o)) {
            return false;
        }
        p5o p5oVar = (p5o) obj;
        return epx.f(this.j, p5oVar.j) && epx.f(this.k, p5oVar.k) && this.l == p5oVar.l && this.m == p5oVar.m;
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
        return Boolean.hashCode(this.m) + io.reactivex.rxjava3.internal.operators.mixed.j.a(this.l, shy.a(this.k.a, this.j.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutWall(empty=");
        sb.append(this.j);
        sb.append(", error=");
        sb.append(this.k);
        sb.append(", state=");
        sb.append(this.l);
        sb.append(", isPinned=");
        return defpackage.q0.a(sb, this.m, ')');
    }
}
