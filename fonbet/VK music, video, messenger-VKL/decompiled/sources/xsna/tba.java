package xsna;

import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.lists.c;
import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: CatalogPaginationListPresenter.kt */
/* loaded from: classes16.dex */
public abstract class tba<T> implements c.m<T>, c.l<T> {
    public mzp0 b;
    public CatalogPaginatedListViewHolder c;
    public com.vk.lists.c d;
    public final io.reactivex.rxjava3.disposables.b e = new io.reactivex.rxjava3.disposables.b();
    public io.reactivex.rxjava3.disposables.c f;

    public static /* synthetic */ io.reactivex.rxjava3.core.q j(tba tbaVar, String str, int i) {
        boolean z = (i & 1) == 0;
        if ((i & 2) != 0) {
            str = null;
        }
        return tbaVar.i(null, str, z);
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<T> O9(String str, com.vk.lists.c cVar) {
        return j(this, str, 5);
    }

    public abstract void b(CatalogPaginatedListViewHolder catalogPaginatedListViewHolder);

    public abstract void c();

    public abstract void d(CatalogPaginatedListViewHolder catalogPaginatedListViewHolder);

    public final void e() {
        io.reactivex.rxjava3.disposables.c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f = null;
        this.e.e();
    }

    public abstract String f();

    public boolean g() {
        return this.c != null;
    }

    public boolean h() {
        return false;
    }

    @Override // com.vk.lists.c.k
    public io.reactivex.rxjava3.core.q<T> hj(com.vk.lists.c cVar, boolean z) {
        if (!z) {
            return j(this, null, 7);
        }
        io.reactivex.rxjava3.core.q j = j(this, null, 6);
        tf tfVar = new tf(new ay0(this, 16), 8);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return j.E(tfVar, lVar, kVar, kVar);
    }

    public abstract io.reactivex.rxjava3.core.q i(Integer num, String str, boolean z);

    public abstract io.reactivex.rxjava3.disposables.c m(io.reactivex.rxjava3.core.q<T> qVar, boolean z, com.vk.lists.c cVar);

    public void o() {
        com.vk.lists.c cVar = this.d;
        if (cVar != null) {
            cVar.p(false);
        }
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<T> ui(int i, com.vk.lists.c cVar) {
        return i(Integer.valueOf(i), null, false);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<T> qVar, boolean z, com.vk.lists.c cVar) {
        io.reactivex.rxjava3.disposables.c m = m(qVar, z, cVar);
        this.f = m;
        this.e.b(m);
    }

    public void l() {
    }

    public void n() {
    }
}
