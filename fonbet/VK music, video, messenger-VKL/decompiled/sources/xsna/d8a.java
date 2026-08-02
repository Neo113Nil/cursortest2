package xsna;

import androidx.compose.runtime.a;
import com.vk.catalog.mvi.block.BlockId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a8a;

/* compiled from: CatalogLazyItemScopeImpl.kt */
/* loaded from: classes16.dex */
public final class d8a implements a8a {
    public final ksy a;
    public final xvy b;

    public d8a(ksy ksyVar, xvy xvyVar) {
        this.a = ksyVar;
        this.b = xvyVar;
    }

    @Override // xsna.a8a
    public final q630 a(q630 q630Var) {
        return this.a.a(q630Var);
    }

    @Override // xsna.a8a
    public final q630 b(q630 q630Var) {
        return this.a.b(q630Var);
    }

    @Override // xsna.a8a
    public final q630 c(q630 q630Var, final BlockId.Simple simple, final float f) {
        return qri.a(q630Var, a5x.a, new yzs() { // from class: xsna.b8a
            @Override // xsna.yzs
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                q630 b;
                q630 q630Var2 = (q630) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                aVar.K(1728171394);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1728171394, intValue, -1, "com.vk.catalog.mvi.section.impl.ui.view.CatalogLazyItemScopeImpl.fillVisiblePartOfLazyList.<anonymous> (CatalogLazyItemScopeImpl.kt:52)");
                }
                final azl azlVar = (azl) aVar.r(uvi.h);
                final d8a d8aVar = d8a.this;
                boolean J = aVar.J(d8aVar.b);
                Object x = aVar.x();
                if (J || x == a.C0011a.a) {
                    final BlockId.Simple simple2 = simple;
                    final float f2 = f;
                    x = bbk0.b(new gzs() { // from class: xsna.c8a
                        @Override // xsna.gzs
                        public final Object invoke() {
                            fvy j = d8aVar.b.j();
                            int a = (int) (j.a() & 4294967295L);
                            List<xuy> f3 = j.f();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj4 : f3) {
                                if (!epx.f(((xuy) obj4).getKey(), simple2)) {
                                    arrayList.add(obj4);
                                }
                            }
                            Iterator it = arrayList.iterator();
                            int i = 0;
                            while (it.hasNext()) {
                                i += ((xuy) it.next()).getSize();
                            }
                            float j1 = azl.this.j1(a - i);
                            pco pcoVar = new pco(j1);
                            if (pco.a(j1, f2) > 0) {
                                return pcoVar;
                            }
                            return null;
                        }
                    });
                    aVar.R(x);
                }
                pco pcoVar = (pco) ((mtk0) x).getValue();
                if (pcoVar == null || (b = txj0.h(q630Var2, pcoVar.b)) == null) {
                    b = d8aVar.b(q630Var2);
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                return b;
            }
        });
    }

    @Override // xsna.a8a
    public final ksr<a8a.a> f(r2a r2aVar) {
        return nr2.M(new n0(7, this, r2aVar));
    }
}
