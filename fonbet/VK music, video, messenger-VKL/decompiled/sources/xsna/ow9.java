package xsna;

import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: CartErrorScreen.kt */
/* loaded from: classes18.dex */
public final class ow9 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final mw9 mw9Var, final gzs<s3q0> gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        q630 q630Var2;
        final q630 q630Var3;
        androidx.compose.runtime.f s;
        Pair pair;
        q630 q630Var4;
        androidx.compose.runtime.a M = aVar.M(-1138822046);
        int i3 = (M.J(mw9Var) ? 4 : 2) | i | (M.y(gzsVar) ? 32 : 16);
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 256 : 128;
            if (M.t(i3 & 1, (i3 & 147) == 146)) {
                M.h();
                q630Var3 = q630Var2;
            } else {
                q630 q630Var5 = i4 != 0 ? q630.a.a : q630Var2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1138822046, i3, -1, "com.vk.ecomm.cart.impl.common.ui.compose.Error (CartErrorScreen.kt:26)");
                }
                if (mw9Var.a) {
                    M.K(-700712366);
                    pair = new Pair(pg90.a(R.drawable.vk_icon_illustration_antenna_light_56, 0, M), new l5g(l5g.k));
                    M.j();
                } else {
                    M.K(-700598286);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1223610404, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ErrorOutline56> (VkSdkIcons.kt:814)");
                    }
                    lg90 a = pg90.a(R.drawable.vk_icon_error_outline_56, 0, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pair = new Pair(a, new l5g(ylu0Var.getIcon().l));
                    M.j();
                }
                lg90 lg90Var = (lg90) pair.d();
                long j = ((l5g) pair.g()).a;
                q630 D = p490.D(q630Var5, p490.x(M), 14);
                t8p0 a2 = csa0.a(lg90Var, j, 0L, d370.N(R.string.ecomm_cart_error_abstract, 0, M), null, M, 196616, 20);
                y48 y48Var = null;
                vl20 a3 = zra0.a.a(kq01.g(mw9Var.b, M), null, kq01.g(mw9Var.c, M), null, M, 196608, 26);
                tlo0 tlo0Var = mw9Var.d;
                if (tlo0Var == null) {
                    M.K(-700008667);
                    M.j();
                    q630Var4 = q630Var5;
                } else {
                    M.K(-700008666);
                    int i5 = (i3 & 112) | 28032;
                    q630Var4 = q630Var5;
                    r48 a4 = wra0.a.C3954a.a(kq01.g(tlo0Var, M), gzsVar, ButtonSize.Medium, ButtonStyle.Tertiary, ButtonAppearance.Accent, false, null, null, null, null, null, null, false, false, null, null, M, i5, 12582912, 131040);
                    M = M;
                    y48Var = wra0.b.a(a4, null, null, M, 14);
                    M.j();
                }
                ldv0.d(D, a2, a3, y48Var, null, null, false, M, 0, 112);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var3 = q630Var4;
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.nw9
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ow9.a(mw9.this, gzsVar, q630Var3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if (M.t(i3 & 1, (i3 & 147) == 146)) {
        }
        s = M.s();
        if (s == null) {
        }
    }
}
