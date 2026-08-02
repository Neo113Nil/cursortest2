package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ProductCardAmountControl.kt */
/* loaded from: classes18.dex */
public final class jjd0 {
    /* JADX WARN: Removed duplicated region for block: B:101:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final int i, final boolean z, final gzs<s3q0> gzsVar, final gzs<s3q0> gzsVar2, final boolean z2, q630 q630Var, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        q630 q630Var2;
        final q630 q630Var3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(670946817);
        if ((i2 & 6) == 0) {
            i4 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.l(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= M.y(gzsVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= M.y(gzsVar2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= M.l(z2) ? 16384 : 8192;
        }
        int i5 = i3 & 32;
        if (i5 != 0) {
            i4 |= 196608;
        } else if ((196608 & i2) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 131072 : 65536;
            if (M.t(i4 & 1, (74899 & i4) == 74898)) {
                M.h();
                q630Var3 = q630Var2;
            } else {
                q630.a aVar2 = q630.a.a;
                q630 q630Var4 = i5 != 0 ? aVar2 : q630Var2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(670946817, i4, -1, "com.vk.ecomm.market.good.ui.ProductCardQuantityControl (ProductCardAmountControl.kt:50)");
                }
                ButtonSize buttonSize = ButtonSize.Large;
                ButtonStyle buttonStyle = ButtonStyle.Secondary;
                ButtonAppearance buttonAppearance = ButtonAppearance.Neutral;
                String F = d370.F(R.plurals.product_card_cart_quantity, i, new Object[]{Integer.valueOf(i)}, M, (i4 << 3) & 112);
                int i6 = i4 & 14;
                int i7 = i4 >> 3;
                int i8 = (i7 & 896) | i6 | (i7 & 112);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1138520392, i8, -1, "com.vk.ecomm.market.good.ui.accessibilityActions (ProductCardAmountControl.kt:129)");
                }
                String N = d370.N(R.string.product_card_cart_quantity_increment, 0, M);
                boolean z3 = (((i8 & 112) ^ 48) > 32 && M.J(gzsVar)) || (i8 & 48) == 32;
                Object x = M.x();
                boolean z4 = z3;
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z4 || x == c0012a) {
                    x = new f880(gzsVar, 13);
                    M.R(x);
                }
                fmk fmkVar = new fmk(N, (gzs) x);
                String a = i <= 1 ? zq.a(M, -303882056, R.string.product_card_cart_quantity_remove, M, 0) : zq.a(M, -303794667, R.string.product_card_cart_quantity_decrement, M, 0);
                boolean z5 = (((i8 & 896) ^ 384) > 256 && M.J(gzsVar2)) || (i8 & 384) == 256;
                Object x2 = M.x();
                if (z5 || x2 == c0012a) {
                    x2 = new ijd0(0, gzsVar2);
                    M.R(x2);
                }
                List l = e43.l(fmkVar, new fmk(a, (gzs) x2));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630 g = ahn.E(aVar2, "product_card_cart_quantity_control").g(q630Var4);
                boolean J = M.J(F) | M.y(l);
                Object x3 = M.x();
                if (J || x3 == c0012a) {
                    x3 = new ri0(25, F, l);
                    M.R(x3);
                }
                q630 b = txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, hr80.z().w(buttonSize, M, 6), 1, egi0.a(g, (izs) x3));
                q630 q630Var5 = q630Var4;
                y18 t = hr80.z().t(buttonStyle, buttonAppearance, true, M, 438);
                r5j0 x4 = hr80.z().x(6, M);
                lgu0 b2 = hr80.z().b(buttonStyle, buttonAppearance, M, 54);
                s890 value = hr80.z().c(buttonSize, buttonStyle, false, M, 438, 0).getValue();
                hr80.z().getClass();
                bcl f = op8.f(buttonStyle, M, 6);
                frv0 y = hr80.z().y(buttonSize, M, 6);
                Object x5 = M.x();
                if (x5 == c0012a) {
                    x5 = new wv0(29);
                    M.R(x5);
                }
                bhu0.f((gzs) x5, b, false, null, null, t, y, f, x4, b2, value, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, kai.c(2130654218, new yzs() { // from class: xsna.gjd0
                    @Override // xsna.yzs
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        float f2;
                        androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(2130654218, intValue, -1, "com.vk.ecomm.market.good.ui.ProductCardQuantityControl.<anonymous> (ProductCardAmountControl.kt:80)");
                            }
                            a.l lVar = androidx.compose.foundation.layout.a.a;
                            hr80.z().getClass();
                            op8.h();
                            float f3 = kqu0.s;
                            dt1.a.getClass();
                            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(f3, dt1.a.o), dt1.a.l, aVar3, 48);
                            int hashCode = Long.hashCode(n34.n(aVar3));
                            sy90 D = aVar3.D();
                            q630.a aVar4 = q630.a.a;
                            q630 c = qri.c(aVar3, aVar4);
                            cri.h7.getClass();
                            LayoutNode.a aVar5 = cri.a.b;
                            if (aVar3.N() == null) {
                                n34.r();
                                throw null;
                            }
                            aVar3.H();
                            if (aVar3.L()) {
                                aVar3.I(aVar5);
                            } else {
                                aVar3.f();
                            }
                            k9q0.w(aVar3, a2, cri.a.f);
                            k9q0.w(aVar3, D, cri.a.e);
                            k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                            k9q0.t(aVar3, cri.a.h);
                            k9q0.w(aVar3, c, cri.a.d);
                            int i9 = i;
                            boolean z6 = i9 > 0;
                            qzu0.a.getClass();
                            lg90 O0 = qzu0.O0(aVar3);
                            float f4 = 16;
                            long b3 = byc0.b(f4, f4);
                            boolean z7 = z2;
                            nzu0.b(gzsVar2, O0, b3, null, ahn.E(z7 ? s200.F(6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar4) : aVar4, "product_card_cart_quantity_decrement"), jjd0.b(z6, aVar3), false, null, z6, null, null, aVar3, 3520, 0, 1728);
                            String valueOf = String.valueOf(i9);
                            q630 E = ahn.E(aVar4, "product_card_cart_quantity");
                            if (z7) {
                                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            } else {
                                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                E = E.g(s200.F(2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar4));
                            }
                            yqv0.c(valueOf, xp2.a(txj0.x(22, f2, 2, E), null, 3), 0L, null, null, 0, 3, null, 0, false, 0, 0, null, null, aVar3, 0, 0, 16316);
                            lg90 a3 = qzu0.a(aVar3);
                            long b4 = byc0.b(f4, f4);
                            q630 E2 = ahn.E(z7 ? s200.F(6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar4) : aVar4, "product_card_cart_quantity_increment");
                            boolean z8 = z;
                            nzu0.b(gzsVar, a3, b4, null, E2, jjd0.b(z8, aVar3), false, null, z8, null, null, aVar3, 3520, 0, 1728);
                            aVar3.G();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar3.h();
                        }
                        return s3q0.a;
                    }
                }, M), M, 24582, 1572864, 63500);
                M = M;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var3 = q630Var5;
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.hjd0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        jjd0.a(i, z, gzsVar, gzsVar2, z2, q630Var3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1), i3);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if (M.t(i4 & 1, (74899 & i4) == 74898)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    public static final long b(boolean z, androidx.compose.runtime.a aVar) {
        long j;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-948582689, 0, -1, "com.vk.ecomm.market.good.ui.resolveTintColor (ProductCardAmountControl.kt:150)");
        }
        if (z) {
            aVar.K(1658018077);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var.getIcon().a;
            aVar.j();
        } else {
            aVar.K(1658061818);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var2.getIcon().l;
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return j;
    }
}
