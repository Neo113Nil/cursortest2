package xsna;

import androidx.annotation.Nullable;
import com.vk.dto.common.data.VKList;
import com.vk.lists.c;
import xsna.oap;

/* compiled from: PagedDataProviderWithPaginatedList.java */
/* loaded from: classes17.dex */
public final class na90<Item> implements c.l, c.m {
    public final int b;
    public final od90<Item> c;
    public final nd90<Item> d;
    public final io.reactivex.rxjava3.disposables.b e;

    public na90(int i, od90<Item> od90Var, @Nullable nd90<Item> nd90Var, @Nullable io.reactivex.rxjava3.disposables.b bVar) {
        this.b = i;
        this.c = od90Var;
        this.d = nd90Var;
        this.e = bVar;
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q O9(String str, com.vk.lists.c cVar) {
        return this.c.a(new oap.b(str), cVar.k());
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q hj(com.vk.lists.c cVar, boolean z) {
        oap<Integer, String> aVar;
        int i = this.b;
        if (i == 0) {
            aVar = new oap.a<>(0);
        } else {
            if (i != 1) {
                throw new IllegalStateException(lhg.a(i, "Not supported paginationType: "));
            }
            aVar = new oap.b<>(null);
        }
        return this.c.a(aVar, cVar.k());
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q ui(int i, com.vk.lists.c cVar) {
        return this.c.a(new oap.a(Integer.valueOf(i)), cVar.k());
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q qVar, final boolean z, final com.vk.lists.c cVar) {
        io.reactivex.rxjava3.disposables.c subscribe = qVar.subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.ma90
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                VKList vKList = (VKList) obj;
                na90 na90Var = na90.this;
                nd90<Item> nd90Var = na90Var.d;
                int i = na90Var.b;
                com.vk.lists.c cVar2 = cVar;
                if (i == 0) {
                    cVar2.l(vKList.i());
                } else {
                    if (i != 1) {
                        throw new IllegalStateException(lhg.a(i, "Not supported pagination type: "));
                    }
                    cVar2.s(vKList.j());
                }
                if (nd90Var != 0) {
                    if (z) {
                        nd90Var.clear();
                    }
                    nd90Var.h0(vKList);
                }
            }
        }, new c06());
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        if (bVar != null) {
            bVar.b(subscribe);
        }
    }
}
