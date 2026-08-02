package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import xsna.d3h;

/* compiled from: CommunityProfileItemsViewDelegate.kt */
/* loaded from: classes5.dex */
public final class pph implements d3h.a {
    public final /* synthetic */ mph a;
    public final /* synthetic */ CommunityProfileViewState.Data.c b;

    public pph(mph mphVar, CommunityProfileViewState.Data.c cVar) {
        this.a = mphVar;
        this.b = cVar;
    }

    @Override // xsna.d3h.a
    public final void a() {
        this.a.l.invoke(new CommunityProfileAction.s(new t8q0(false)));
    }

    @Override // xsna.d3h.a
    public final void b(String str) {
        this.a.l.invoke(new CommunityProfileAction.e.a.b(str));
    }

    @Override // xsna.d3h.a
    public final void c() {
        this.a.l.invoke(CommunityProfileAction.e.AbstractC1583e.l.b);
    }

    @Override // xsna.d3h.a
    public final void d() {
        this.a.l.invoke(new CommunityProfileAction.o(true));
    }

    @Override // xsna.d3h.a
    public final void e(ExtendedCommunityProfile extendedCommunityProfile) {
        this.a.l.invoke(new CommunityProfileAction.w(0, extendedCommunityProfile));
    }

    @Override // xsna.d3h.a
    public final void f(UserId userId) {
        this.a.l.invoke(new CommunityProfileAction.e.c.b(userId));
    }

    @Override // xsna.d3h.a
    public final void g() {
        this.a.l.invoke(CommunityProfileAction.k.b);
    }

    @Override // xsna.d3h.a
    public final void h() {
        this.a.l.invoke(CommunityProfileAction.e.c.a.b);
    }

    @Override // xsna.d3h.a
    public final void i() {
        this.a.l.invoke(CommunityProfileAction.e.AbstractC1583e.k.b);
    }

    @Override // xsna.d3h.a
    public final String j() {
        return !(this.b instanceof CommunityProfileViewState.Data.c.b) ? "without_cover" : this.a.c.f.f.b != null ? "opened_live_cover" : "live_cover";
    }

    @Override // xsna.d3h.a
    public final void k(ExtendedCommunityProfile extendedCommunityProfile, String str) {
        this.a.l.invoke(new CommunityProfileAction.e.AbstractC1583e.c(extendedCommunityProfile, str));
    }

    @Override // xsna.d3h.a
    public final void l(String str, String str2) {
        this.a.l.invoke(new CommunityProfileAction.e.a.C1576a(str, str2));
    }

    @Override // xsna.d3h.a
    public final void m(io.reactivex.rxjava3.disposables.c cVar) {
        this.a.g.b(cVar);
    }

    @Override // xsna.d3h.a
    public final void n() {
        this.a.l.invoke(CommunityProfileAction.e.f.b);
    }
}
