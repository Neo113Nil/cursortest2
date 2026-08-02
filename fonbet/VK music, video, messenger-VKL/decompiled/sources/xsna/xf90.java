package xsna;

import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;

/* compiled from: PagingWithOffsetMviDelegate.kt */
/* loaded from: classes4.dex */
public final class xf90 implements c.l<Object>, vf90 {
    public com.vk.lists.c b;
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();
    public zf90 d;

    @Override // xsna.vf90
    public final void a(RecyclerPaginatedView recyclerPaginatedView, gf90 gf90Var) {
        c.h hVar = new c.h(this);
        Integer num = gf90Var.a;
        hVar.i = num != null ? num.intValue() : 30;
        Integer num2 = gf90Var.b;
        hVar.j = num2 != null ? num2.intValue() : 1073741823;
        this.b = com.vk.lists.f.a(hVar, recyclerPaginatedView);
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<Object> hj(com.vk.lists.c cVar, boolean z) {
        return ui(0, cVar);
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<Object> ui(int i, com.vk.lists.c cVar) {
        zf90 zf90Var = this.d;
        if (zf90Var != null) {
            return zf90Var.a(i, cVar.k());
        }
        return null;
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<Object> qVar, boolean z, com.vk.lists.c cVar) {
        this.c.b(itg0.m(qVar));
    }
}
