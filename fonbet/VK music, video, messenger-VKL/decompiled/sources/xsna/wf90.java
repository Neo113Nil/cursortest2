package xsna;

import com.vk.lists.c;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;

/* compiled from: PagingWithOffsetMviDelegate.kt */
/* loaded from: classes5.dex */
public final class wf90 implements c.l<Object>, uf90 {
    public com.vk.lists.c b;
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();
    public yf90 d;

    @Override // xsna.uf90
    public final void a(UsableRecyclerPaginatedView usableRecyclerPaginatedView, ff90 ff90Var) {
        c.h hVar = new c.h(this);
        Integer num = ff90Var.b;
        hVar.i = num != null ? num.intValue() : 30;
        Integer num2 = ff90Var.c;
        hVar.j = num2 != null ? num2.intValue() : 1073741823;
        String str = ff90Var.a;
        if (str != null) {
            hVar.o = new d810(str, 7);
        }
        this.b = com.vk.lists.f.a(hVar, usableRecyclerPaginatedView);
    }

    public final void b() {
        this.c.e();
        com.vk.lists.c cVar = this.b;
        if (cVar != null) {
            cVar.v();
        }
        this.b = null;
        this.d = null;
    }

    public final void c() {
        com.vk.lists.c cVar = this.b;
        if (cVar != null) {
            cVar.p(false);
        }
    }

    public final void d(int i) {
        com.vk.lists.c cVar = this.b;
        if (cVar != null) {
            cVar.l(i);
        }
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<Object> hj(com.vk.lists.c cVar, boolean z) {
        return ui(0, cVar);
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<Object> ui(int i, com.vk.lists.c cVar) {
        yf90 yf90Var = this.d;
        if (yf90Var != null) {
            return yf90Var.a(i, cVar.k());
        }
        return null;
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<Object> qVar, boolean z, com.vk.lists.c cVar) {
        this.c.b(itg0.m(qVar));
    }
}
