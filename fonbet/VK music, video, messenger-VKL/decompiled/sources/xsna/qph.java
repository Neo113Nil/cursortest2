package xsna;

import android.view.View;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.tag.CommunityActionTags;
import xsna.f8h;
import xsna.j8h;

/* compiled from: CommunityProfileItemsViewDelegate.kt */
/* loaded from: classes5.dex */
public final class qph implements j8h.a {
    public final /* synthetic */ mph a;
    public final /* synthetic */ d3h b;

    /* compiled from: CommunityProfileItemsViewDelegate.kt */
    public static final class a implements f8h.a {
        public final /* synthetic */ mph a;

        public a(mph mphVar) {
            this.a = mphVar;
        }

        @Override // xsna.f8h.a
        public final void a() {
            this.a.b.c().q();
        }

        @Override // xsna.f8h.a
        public final void b() {
            this.a.b.c().r();
        }
    }

    public qph(mph mphVar, d3h d3hVar) {
        this.a = mphVar;
        this.b = d3hVar;
    }

    @Override // xsna.qsg.a
    public final void a() {
        this.a.l.invoke(CommunityProfileAction.e.AbstractC1583e.n.b);
    }

    @Override // xsna.qsg.a
    public final void b() {
        this.a.l.invoke(CommunityProfileAction.e.AbstractC1583e.a.b);
    }

    @Override // xsna.qsg.a
    public final void c(String str, View view, boolean z) {
        this.a.l.invoke(new CommunityProfileAction.e.AbstractC1583e.q(str, view, z));
    }

    @Override // xsna.qsg.a
    public final void d() {
        this.a.l.invoke(CommunityProfileAction.e.AbstractC1583e.d.b);
    }

    @Override // xsna.qsg.a
    public final void e() {
        this.a.l.invoke(CommunityProfileAction.e.AbstractC1583e.b.b);
    }

    @Override // xsna.qsg.a
    public final void f() {
        this.a.l.invoke(CommunityProfileAction.e.AbstractC1583e.f.b);
    }

    @Override // xsna.qsg.a
    public final void g(boolean z) {
        this.a.l.invoke(new CommunityProfileAction.e.AbstractC1583e.o(z));
    }

    @Override // xsna.qsg.a
    public final void h() {
        this.a.l.invoke(CommunityProfileAction.e.AbstractC1583e.s.b);
    }

    @Override // xsna.j8h.a
    public final void i(f8h f8hVar) {
        znh znhVar = this.a.c.f.f;
        znhVar.b = f8hVar;
        f8hVar.i = new ew3(5, znhVar, f8hVar);
        ww50 v = s200.v(znhVar.a);
        if (v != null) {
            v.S(f8hVar);
        }
    }

    @Override // xsna.qsg.a
    public final void j(View view, CommunityActionTags communityActionTags) {
        this.b.f(view, communityActionTags);
    }

    @Override // xsna.qsg.a
    public final void k() {
        this.a.l.invoke(CommunityProfileAction.e.AbstractC1583e.r.b);
    }

    @Override // xsna.qsg.a
    public final void l() {
        this.a.l.invoke(CommunityProfileAction.e.AbstractC1583e.m.b);
    }

    @Override // xsna.j8h.a
    public final int m() {
        return this.a.f.b.b.getHeight();
    }

    @Override // xsna.j8h.a
    public final f8h.a n() {
        return new a(this.a);
    }

    @Override // xsna.j8h.a
    public final void o() {
        this.a.l.invoke(new CommunityProfileAction.g.b(true));
    }
}
