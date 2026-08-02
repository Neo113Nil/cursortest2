package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.catalog.mvi.block.music.impl.filters.MusicTabsFiltersView;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.cri;
import xsna.dt1;

/* compiled from: CatalogTabsFiltersView.kt */
/* loaded from: classes16.dex */
public final class qha {
    public static final void a(MusicTabsFiltersView.f fVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        ArrayList arrayList = fVar.c;
        androidx.compose.runtime.a M = aVar.M(550427332);
        if ((i & 6) == 0) {
            i2 = (M.J(fVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            int i3 = -1;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(550427332, i2, -1, "com.vk.catalog.mvi.block.music.impl.filters.ui.CatalogTabFilterView (CatalogTabsFiltersView.kt:23)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            boolean J = M.J(arrayList);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                Iterator it = arrayList.iterator();
                int i4 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((MusicTabsFiltersView.e) it.next()).c) {
                        i3 = i4;
                        break;
                    }
                    i4++;
                }
                x = Integer.valueOf(i3 >= 0 ? i3 : 0);
                M.R(x);
            }
            aVar2 = M;
            ziv0.b(((Number) x).intValue(), kai.c(-1873589274, new oha(0, fVar, izsVar), M), null, 0L, true ^ fVar.d, null, null, null, false, aVar2, 48, 492);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new pha(fVar, izsVar, q630Var, i, 0);
        }
    }
}
