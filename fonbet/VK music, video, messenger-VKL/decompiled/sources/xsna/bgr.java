package xsna;

import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: FiltersContent.kt */
/* loaded from: classes18.dex */
public final class bgr {
    public static final void a(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1713640362);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1713640362, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.ApplyButton (FiltersContent.kt:120)");
            }
            aVar2 = M;
            bhu0.e(gzsVar, ButtonSize.Large, ButtonStyle.Primary, ButtonAppearance.Accent, s200.E(txj0.f(q630Var, 1.0f), 16, 12), null, false, false, null, null, null, d370.N(R.string.ecomm_delivery_points_filter_show, 0, M), null, null, null, null, false, null, null, null, aVar2, (i2 & 14) | X2.b.f, 0, 0, 4190176);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new qg(gzsVar, q630Var, i, 2);
        }
    }

    public static final void b(final int i, androidx.compose.runtime.a aVar, final String str, final gzs gzsVar, final q630 q630Var, final boolean z) {
        androidx.compose.runtime.a M = aVar.M(-896478014);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.l(z) ? 32 : 16) | (M.y(gzsVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-896478014, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.FilterOption (FiltersContent.kt:108)");
            }
            eku0.d(str, gzsVar, q630Var, z, null, false, false, M, (i2 & 14) | ((i2 >> 6) & 112) | 384 | ((i2 << 6) & 7168), 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, str, gzsVar, q630Var, z) { // from class: xsna.ufr
                public final /* synthetic */ String b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ gzs e;

                {
                    this.b = str;
                    this.c = z;
                    this.d = q630Var;
                    this.e = gzsVar;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bgr.b(ne7.I(385), (androidx.compose.runtime.a) obj, this.b, this.e, this.d, this.c);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar, List list, izs izsVar) {
        androidx.compose.runtime.a M = aVar.M(1369456485);
        int i2 = (M.J(list) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1369456485, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.FiltersContent (FiltersContent.kt:34)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            Object obj = x;
            if (x == c0012a) {
                SnapshotStateList snapshotStateList = new SnapshotStateList();
                snapshotStateList.addAll(new wow(list));
                M.R(snapshotStateList);
                obj = snapshotStateList;
            }
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj;
            q630.a aVar2 = q630.a.a;
            q630 d = txj0.d(aVar2, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            d(snapshotStateList2, ahn.E(aVar2, "delivery_points_filters_list"), M, 54);
            q630 b = ra8.a.b(aVar2, dt1.a.i);
            boolean z = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new cy0(13, izsVar, snapshotStateList2);
                M.R(x2);
            }
            a(0, M, (gzs) x2, b);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new nz1(list, izsVar, i, 6);
        }
    }

    public static final void d(SnapshotStateList snapshotStateList, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1801858014);
        if (M.t(i & 1, (i & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1801858014, i, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.FiltersList (FiltersContent.kt:57)");
            }
            q630 H = s200.H(txj0.d(q630Var, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 68, 7);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new dsc(snapshotStateList, 29);
                M.R(x);
            }
            lqy.a(H, null, null, null, null, null, false, null, (izs) x, M, 0, 510);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wbi(snapshotStateList, q630Var, i, 4);
        }
    }

    public static final void e(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(2006074793);
        int i2 = i | (M.J(str) ? 4 : 2) | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2006074793, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.SectionHeader (FiltersContent.kt:94)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().r;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630.a aVar2 = q630.a.a;
            yqv0.c(str, s200.E(aVar2, 12, 16), j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.N, M, i2 & 14, 0, 8184);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vfr(str, q630Var2, i, 0);
        }
    }
}
