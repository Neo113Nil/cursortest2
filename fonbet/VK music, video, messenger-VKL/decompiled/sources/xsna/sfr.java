package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.impl.filtersbottomsheet.FilterBottomSheetState;
import com.vk.catalog.mvi.section.domain.CatalogFilterOptionDo;
import com.vkontakte.android.R;
import java.util.Iterator;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: FiltersBottomSheetView.kt */
/* loaded from: classes16.dex */
public final class sfr {
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d5, code lost:
    
        if (r14 == androidx.compose.runtime.a.C0011a.a) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(FilterBottomSheetState filterBottomSheetState, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        Object obj;
        androidx.compose.runtime.a M = aVar.M(2054219633);
        int i2 = 32;
        int i3 = i | (M.J(filterBottomSheetState) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        int i4 = 1;
        int i5 = 0;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2054219633, i3, -1, "com.vk.catalog.mvi.block.impl.filtersbottomsheet.FilterBottomSheetView (FiltersBottomSheetView.kt:29)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            M.K(-634816621);
            Iterator it = filterBottomSheetState.b.iterator();
            androidx.compose.runtime.a aVar4 = M;
            while (it.hasNext()) {
                CatalogFilterOptionDo catalogFilterOptionDo = (CatalogFilterOptionDo) it.next();
                q630.a aVar5 = q630.a.a;
                q630 f = txj0.f(aVar5, 1.0f);
                int i6 = ((i3 & 112) == i2 ? i4 : i5) | (aVar4.y(catalogFilterOptionDo) ? 1 : 0);
                Object x = aVar4.x();
                if (i6 == 0) {
                    obj = x;
                }
                yk ykVar = new yk(9, izsVar, catalogFilterOptionDo);
                aVar4.R(ykVar);
                obj = ykVar;
                q630 c2 = ojc.c(f, false, null, null, (gzs) obj, 15);
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g, dt1.a.l, aVar4, 54);
                int hashCode2 = Long.hashCode(n34.n(aVar4));
                sy90 D2 = aVar4.D();
                q630 c3 = qri.c(aVar4, c2);
                cri.h7.getClass();
                LayoutNode.a aVar6 = cri.a.b;
                if (aVar4.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar4.H();
                if (aVar4.L()) {
                    aVar4.I(aVar6);
                } else {
                    aVar4.f();
                }
                k9q0.w(aVar4, a2, cri.a.f);
                k9q0.w(aVar4, D2, cri.a.e);
                k9q0.w(aVar4, Integer.valueOf(hashCode2), cri.a.g);
                k9q0.t(aVar4, cri.a.h);
                k9q0.w(aVar4, c3, cri.a.d);
                androidx.compose.runtime.a aVar7 = aVar4;
                int i7 = i5;
                int i8 = i4;
                int i9 = i3;
                Iterator it2 = it;
                yqv0.c(catalogFilterOptionDo.b, s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14, i4, aVar5), wlb0.h(aVar4).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar4).X, aVar7, 48, 0, 8184);
                androidx.compose.runtime.a aVar8 = aVar7;
                if (catalogFilterOptionDo.c) {
                    aVar8.K(965318840);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(521903826, i7, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CheckCircleOn24> (VkSdkIcons.kt:360)");
                    }
                    lg90 a3 = pg90.a(R.drawable.vk_icon_check_circle_on_24, i7, aVar8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pzu0.b(a3, null, txj0.q(aVar5, 20), wlb0.h(aVar8).getIcon().a, aVar8, 440, 0);
                } else {
                    aVar8.K(963451493);
                }
                aVar8.j();
                aVar8.G();
                i5 = i7;
                i2 = 32;
                i3 = i9;
                i4 = i8;
                it = it2;
                aVar4 = aVar8;
            }
            boolean d = gp.d(aVar4);
            aVar2 = aVar4;
            if (d) {
                androidx.compose.runtime.b.e();
                aVar2 = aVar4;
            }
        } else {
            M.h();
            aVar2 = M;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new t3g(i, 1, filterBottomSheetState, izsVar, q630Var);
        }
    }
}
