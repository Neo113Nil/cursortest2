package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.cart.impl.checkout.ui.compose.item.CheckoutCell$State;
import com.vk.ecomm.cart.impl.checkout.ui.compose.item.CheckoutCell$Type;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CheckoutPriceRow.kt */
/* loaded from: classes18.dex */
public final class p7c {

    /* compiled from: CheckoutPriceRow.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CheckoutCell$Type.values().length];
            try {
                iArr[CheckoutCell$Type.Base.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckoutCell$Type.Total.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CheckoutCell$State.values().length];
            try {
                iArr2[CheckoutCell$State.Normal.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CheckoutCell$State.Negative.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void a(CheckoutCell$Type checkoutCell$Type, CheckoutCell$State checkoutCell$State, String str, String str2, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        frv0 frv0Var;
        long j;
        androidx.compose.runtime.a M = aVar.M(-226641015);
        int i2 = i | (M.o(checkoutCell$Type.ordinal()) ? 4 : 2) | (M.o(checkoutCell$State.ordinal()) ? 32 : 16) | (M.J(str) ? 256 : 128) | (M.J(str2) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-226641015, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.item.CheckoutCell (CheckoutPriceRow.kt:56)");
            }
            q630 F = s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            int i3 = a.$EnumSwitchMapping$0[checkoutCell$Type.ordinal()];
            if (i3 == 1) {
                M.K(604197769);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var.T;
                M.j();
            } else {
                if (i3 != 2) {
                    throw alb0.c(604195646, M);
                }
                M.K(604199790);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0Var = wuv0Var2.J;
                M.j();
            }
            frv0 frv0Var2 = frv0Var;
            q630.a aVar4 = q630.a.a;
            q630 E = ahn.E(aVar4, "checkout_price_row_title");
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            float f = 11;
            yqv0.c(str, s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 1, defpackage.j0.d(1.0f, E, true)), wlb0.h(M).getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var2, M, ((i2 >> 6) & 14) | 100663296, 48, 5880);
            q630 E2 = ahn.E(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 1, aVar4), "checkout_price_row_value");
            int i4 = a.$EnumSwitchMapping$1[checkoutCell$State.ordinal()];
            if (i4 == 1) {
                j = gub0.a(M, 604223344, M).m;
                M.j();
            } else {
                if (i4 != 2) {
                    throw alb0.c(604220958, M);
                }
                j = gub0.a(M, 604225873, M).k;
                M.j();
            }
            aVar2 = M;
            yqv0.c(str2, E2, j, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var2, aVar2, ((i2 >> 9) & 14) | 100663344, 48, 5880);
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
            s.d = new ao7(checkoutCell$Type, checkoutCell$State, str, str2, q630Var, i, 1);
        }
    }

    public static final void b(n7c n7cVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-449488583);
        if ((i & 6) == 0) {
            i2 = (M.J(n7cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-449488583, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.item.CheckoutPriceRow (CheckoutPriceRow.kt:23)");
            }
            a(n7cVar.h ? CheckoutCell$Type.Total : CheckoutCell$Type.Base, n7cVar.g ? CheckoutCell$State.Negative : CheckoutCell$State.Normal, n7cVar.d, n7cVar.f, txj0.f(ahn.E(q630.a.a, "checkout_price_row_".concat(n7cVar.b.c)).g(q630Var), 1.0f), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new o7c(n7cVar, q630Var, i, 0);
        }
    }
}
