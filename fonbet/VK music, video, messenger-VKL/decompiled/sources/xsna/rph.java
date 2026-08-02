package xsna;

import android.view.View;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import xsna.j8h;

/* compiled from: CommunityProfileItemsViewDelegate.kt */
/* loaded from: classes5.dex */
public final class rph implements j8h.c {
    public final /* synthetic */ mph a;
    public final /* synthetic */ CommunityProfileViewState.Data.c b;

    public rph(mph mphVar, CommunityProfileViewState.Data.c cVar) {
        this.a = mphVar;
        this.b = cVar;
    }

    @Override // xsna.j8h.c
    public final ysg0<gqh> a() {
        return this.a.c.d;
    }

    @Override // xsna.j8h.c
    public final c8h b() {
        if (c() != null) {
            return new c8h(this.a.l);
        }
        return null;
    }

    @Override // xsna.j8h.c
    public final r8h c() {
        CommunityProfileViewState.Data.c cVar = this.b;
        CommunityProfileViewState.Data.c.b bVar = cVar instanceof CommunityProfileViewState.Data.c.b ? (CommunityProfileViewState.Data.c.b) cVar : null;
        if (bVar != null) {
            return bVar.a;
        }
        return null;
    }

    @Override // xsna.j8h.c
    public final View d() {
        return this.a.f.a.f();
    }

    @Override // xsna.j8h.c
    public final f8h e() {
        return this.a.c.f.f.b;
    }
}
