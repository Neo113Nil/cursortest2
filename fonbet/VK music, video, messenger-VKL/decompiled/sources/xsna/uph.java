package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import xsna.c5i;

/* compiled from: CommunityProfileItemsViewDelegate.kt */
/* loaded from: classes5.dex */
public final class uph implements bjh {
    public final /* synthetic */ mph a;

    public uph(mph mphVar) {
        this.a = mphVar;
    }

    @Override // xsna.bjh
    public final void a(CommunityProfileContentItem communityProfileContentItem) {
        this.a.l.invoke(new CommunityProfileAction.f.n(communityProfileContentItem));
    }

    @Override // xsna.bjh
    public final void b(UserId userId) {
        this.a.l.invoke(new CommunityProfileAction.e.h(userId));
    }

    @Override // xsna.bjh
    public final void c(CommunityProfileContentItem communityProfileContentItem) {
        this.a.l.invoke(new CommunityProfileAction.f.k(communityProfileContentItem));
    }

    @Override // xsna.bjh
    public final void d(CommunityProfileContentItem communityProfileContentItem) {
        this.a.l.invoke(new CommunityProfileAction.f.a(communityProfileContentItem));
    }

    @Override // xsna.bjh
    public final void e(CommunityProfileContentItem communityProfileContentItem) {
        this.a.l.invoke(new CommunityProfileAction.f.c(communityProfileContentItem));
    }

    @Override // xsna.bjh
    public final void f(CommunityProfileContentItem communityProfileContentItem) {
        this.a.l.invoke(new CommunityProfileAction.f.b(communityProfileContentItem));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.bjh
    public final void g(CommunityProfileContentItem communityProfileContentItem) {
        ((a5i) this.a.b.C0.getValue()).b(c5i.a.a);
    }

    @Override // xsna.bjh
    public final void h(String str) {
        this.a.b.d().b(str);
    }

    @Override // xsna.bjh
    public final float i() {
        return this.a.f.a.i();
    }

    @Override // xsna.bjh
    public final void j(CommunityProfileContentItem communityProfileContentItem) {
        this.a.l.invoke(new CommunityProfileAction.f.l(communityProfileContentItem));
    }

    @Override // xsna.bjh
    public final void k(CommunityProfileContentItem communityProfileContentItem, CommunityProfileContentItem communityProfileContentItem2) {
        this.a.l.invoke(new CommunityProfileAction.f.r(communityProfileContentItem, communityProfileContentItem2));
    }

    @Override // xsna.bjh
    public final void l(CommunityProfileContentItem communityProfileContentItem, boolean z) {
        this.a.l.invoke(new CommunityProfileAction.f.o(communityProfileContentItem, z));
    }

    @Override // xsna.bjh
    public final void m(CommunityProfileContentItem communityProfileContentItem) {
        this.a.l.invoke(new CommunityProfileAction.f.j(communityProfileContentItem));
    }
}
