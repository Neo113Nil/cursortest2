package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ProductCardCallAvailablePeriodModalBottomSheet.kt */
/* loaded from: classes18.dex */
public final class wjd0 {
    public static final void a(int i, androidx.compose.runtime.a aVar, gzs gzsVar, gzs gzsVar2, q630 q630Var) {
        int i2;
        gzs gzsVar3;
        gzs gzsVar4;
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        float f;
        androidx.compose.runtime.a aVar3;
        int i3;
        q630.a aVar4;
        androidx.compose.runtime.a M = aVar.M(1211353641);
        if ((i & 6) == 0) {
            i2 = i | (M.y(gzsVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1211353641, i4, -1, "com.vk.ecomm.market.good.ui.dialog.ButtonsGroup (ProductCardCallAvailablePeriodModalBottomSheet.kt:131)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.v);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar5 = q630.a.a;
            q630 c = qri.c(M, aVar5);
            cri.h7.getClass();
            LayoutNode.a aVar6 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar6);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (gzsVar != null) {
                M.K(-1780474275);
                i3 = i4;
                aVar4 = aVar5;
                f = 1.0f;
                bhu0.e(gzsVar, ButtonSize.Large, ButtonStyle.Primary, ButtonAppearance.Accent, txj0.f(aVar5, 1.0f), null, false, false, null, null, null, d370.N(R.string.market_write_seller_button, 0, M), null, null, null, null, false, null, null, null, M, (i4 & 14) | 28080, 0, 0, 4190176);
                aVar3 = M;
            } else {
                f = 1.0f;
                aVar3 = M;
                i3 = i4;
                aVar4 = aVar5;
                aVar3.K(-1784885265);
            }
            aVar3.j();
            q630.a aVar7 = aVar4;
            aVar2 = aVar3;
            gzsVar4 = gzsVar2;
            gzsVar3 = gzsVar;
            bhu0.e(gzsVar4, ButtonSize.Large, ButtonStyle.Link, ButtonAppearance.Accent, txj0.f(aVar7, f), null, false, false, null, null, null, d370.N(R.string.market_call_later_button, 0, aVar3), null, null, null, null, false, null, null, null, aVar2, ((i3 >> 3) & 14) | 28080, 0, 0, 4190176);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar7;
        } else {
            gzsVar3 = gzsVar;
            gzsVar4 = gzsVar2;
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ph00(i, gzsVar3, gzsVar4, q630Var2);
        }
    }

    public static final void b(final String str, final String str2, final gzs gzsVar, final gzs gzsVar2, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-476090782);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | (M.y(gzsVar2) ? 2048 : 1024) | 24576;
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-476090782, i2, -1, "com.vk.ecomm.market.good.ui.dialog.CallPeriodModalBottomSheetContent (ProductCardCallAvailablePeriodModalBottomSheet.kt:81)");
            }
            float f = kqu0.v;
            q630Var2 = q630.a.a;
            q630 H = s200.H(q630Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            a.j g = androidx.compose.foundation.layout.a.g(32);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            c(i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, M, str, str2, null);
            a((i2 >> 6) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, M, gzsVar, gzsVar2, null);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final q630 q630Var3 = q630Var2;
            s.d = new wzs(str, str2, gzsVar, gzsVar2, q630Var3, i) { // from class: xsna.vjd0
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ gzs e;
                public final /* synthetic */ q630 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    wjd0.b(this.b, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar, String str, String str2, q630 q630Var) {
        String str3;
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1232484550);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = i | (M.J(str3) ? 4 : 2);
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str2) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1232484550, i3, -1, "com.vk.ecomm.market.good.ui.dialog.TitleGroup (ProductCardCallAvailablePeriodModalBottomSheet.kt:103)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.t);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
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
            yqv0.c(str3, null, wlb0.h(M).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).C, M, i3 & 14, 0, 8122);
            M = M;
            if (str2 != null) {
                yqv0.c(str2, null, gub0.a(M, 304338388, M).r, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).i0, M, (i3 >> 3) & 14, 0, 8122);
            } else {
                M.K(300547646);
            }
            M.j();
            M.G();
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
            s.d = new de1(i, 3, str, str2, q630Var2);
        }
    }
}
