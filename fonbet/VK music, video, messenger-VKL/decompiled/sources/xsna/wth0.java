package xsna;

import com.vk.search.integration.friends.api.SearchFriendsDelegate$ViewCallback$SearchState;
import com.vk.search.ui.api.SearchQuery;
import xsna.vrh0;
import xsna.vth0;

/* compiled from: SearchFriendsDelegateImpl.kt */
/* loaded from: classes5.dex */
public final class wth0 implements vrh0 {
    public final /* synthetic */ emg b;
    public final /* synthetic */ emg c;
    public final /* synthetic */ vth0 d;

    public wth0(emg emgVar, vth0 vth0Var) {
        this.c = emgVar;
        this.d = vth0Var;
        this.b = emgVar;
    }

    @Override // xsna.vrh0
    public final void P1(String str) {
        this.b.P1(null);
    }

    @Override // xsna.vrh0
    public final void a(vrh0.a aVar) {
        this.b.a(aVar);
    }

    @Override // xsna.vrh0
    public final boolean b() {
        return this.b.b();
    }

    @Override // xsna.vrh0
    public final void d(boolean z) {
        this.b.d(z);
    }

    @Override // xsna.vrh0
    public final void d0() {
        this.b.d0();
    }

    @Override // xsna.vrh0
    public final void e(boolean z) {
        this.b.e(z);
    }

    @Override // xsna.vrh0
    public final void f(boolean z) {
        this.b.f(z);
    }

    @Override // xsna.vrh0
    public final void g(SearchQuery searchQuery) {
        this.c.g(searchQuery);
        vth0.a aVar = this.d.h;
        String str = searchQuery.b;
        aVar.getClass();
        boolean N = drm0.N(str);
        aVar.a = N;
        aVar.b = N ? SearchFriendsDelegate$ViewCallback$SearchState.EXPANDED : SearchFriendsDelegate$ViewCallback$SearchState.ACTIVE;
        aVar.a();
    }

    @Override // xsna.vrh0
    public final SearchQuery i() {
        return this.b.i();
    }

    @Override // xsna.vrh0
    public final void k() {
        this.b.k();
    }
}
