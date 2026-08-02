package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.d16;
import xsna.us2;

/* compiled from: CheckoutBanner.kt */
/* loaded from: classes18.dex */
public final class z2c {
    public static final void a(x2c x2cVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a aVar3;
        d16.c a;
        String str = x2cVar.d;
        String str2 = x2cVar.e;
        androidx.compose.runtime.a M = aVar.M(-1264440635);
        if ((i & 6) == 0) {
            i2 = (M.J(x2cVar) ? 4 : 2) | i;
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
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1264440635, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.item.CheckoutBanner (CheckoutBanner.kt:23)");
            }
            q630 F = s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var);
            if (str != null) {
                M.K(-2087382468);
                a = d16.c.b.a.a(str, null, M, 384, 2);
                M.j();
                aVar3 = M;
            } else {
                M.K(-2087226135);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getText().m;
                boolean p = M.p(j) | M.J(str2);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (p || x == c0012a) {
                    us2.b bVar = new us2.b();
                    int m = bVar.m(new hik0(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    try {
                        bVar.g(str2);
                        s3q0 s3q0Var = s3q0.a;
                        bVar.k(m);
                        x = bVar.n();
                        M.R(x);
                    } catch (Throwable th) {
                        bVar.k(m);
                        throw th;
                    }
                }
                us2 us2Var = (us2) x;
                boolean z = !x2cVar.f;
                boolean z2 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    x2 = new cg1(6, izsVar, x2cVar);
                    M.R(x2);
                }
                aVar3 = M;
                a = d16.c.a.C2698a.a(us2Var, z, (gzs) x2, d370.N(R.string.ecomm_checkout_show_more, 0, M), 3, null, 0L, 0L, null, aVar3, 1597440, 1952);
                aVar3.j();
            }
            androidx.compose.runtime.a aVar4 = aVar3;
            beu0.a(d16.b.a(null, null, a, null, null, null, null, null, aVar3, 100663296, 250), F, null, null, null, null, null, null, null, null, null, null, aVar4, 0, 0, 4092);
            aVar2 = aVar4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new y2c(i, 0, x2cVar, izsVar, q630Var);
        }
    }
}
