package xsna;

import androidx.lifecycle.Lifecycle;
import com.vk.search.ui.api.SearchQuery;
import xsna.vrh0;
import xsna.wqh0;

/* compiled from: SearchFeatureQueryViewDelegateBinding.kt */
/* loaded from: classes5.dex */
public final class zrh0 implements gm50, vrh0.a {
    public final vrh0 b;
    public final vqh0 c;
    public final vgn d;
    public SearchQuery e;
    public boolean f;

    public zrh0(vrh0 vrh0Var, vqh0 vqh0Var, f5z f5zVar) {
        this.b = vrh0Var;
        this.c = vqh0Var;
        this.d = new vgn(f5zVar);
    }

    @Override // xsna.vrh0.a
    public final void a() {
        this.c.C(wqh0.g.b);
    }

    @Override // xsna.vrh0.a
    public final void b(SearchQuery searchQuery) {
        if (searchQuery.equals(this.e)) {
            return;
        }
        this.c.C(new wqh0.l(searchQuery));
    }

    @Override // xsna.vrh0.a
    public final void c(SearchQuery searchQuery) {
        this.c.C(new wqh0.t(searchQuery));
    }

    @Override // xsna.vrh0.a
    public final void d() {
        this.c.C(wqh0.j.b);
    }

    @Override // xsna.vrh0.a
    public final void e(SearchQuery searchQuery) {
        this.c.C(new wqh0.s(searchQuery));
    }

    @Override // xsna.vrh0.a
    public final void f() {
        this.f = true;
        vgn vgnVar = this.d;
        vgnVar.b.removeObserver(vgnVar.d);
        vgnVar.c.e(Lifecycle.State.DESTROYED);
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.d;
    }
}
