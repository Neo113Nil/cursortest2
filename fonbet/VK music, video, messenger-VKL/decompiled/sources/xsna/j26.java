package xsna;

import androidx.compose.runtime.a;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.impl.banner.BannerView;
import com.vkontakte.android.R;
import xsna.d16;
import xsna.dt1;
import xsna.z06;

/* compiled from: BannerLibraryView.kt */
/* loaded from: classes16.dex */
public final class j26 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final BannerView.BannerViewState bannerViewState, boolean z, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1776470255);
        if ((i & 6) == 0) {
            i2 = (M.J(bannerViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            q630Var2 = q630Var;
            i2 |= M.J(q630Var2) ? 2048 : 1024;
        } else {
            q630Var2 = q630Var;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1776470255, i2, -1, "com.vk.catalog.mvi.block.impl.banner.view.BannerLibraryView (BannerLibraryView.kt:25)");
            }
            Object[] objArr = {new BlockId.Simple(bannerViewState.b)};
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new vi0(3);
                M.R(x);
            }
            final wh50 wh50Var = (wh50) crx0.A(objArr, (gzs) x, M, 48);
            boolean z2 = z && !((Boolean) wh50Var.getValue()).booleanValue();
            e5q f = anp.f(null, 3);
            dt1.a.getClass();
            mm2.f(z2, q630Var2, null, f.b(anp.k(null, dt1.a.k, 13)), null, kai.c(240609735, new yzs() { // from class: xsna.h26
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(240609735, intValue, -1, "com.vk.catalog.mvi.block.impl.banner.view.BannerLibraryView.<anonymous> (BannerLibraryView.kt:34)");
                    }
                    BannerView.BannerViewState bannerViewState2 = BannerView.BannerViewState.this;
                    xl20 a = d16.b.a(bannerViewState2.c, bannerViewState2.d, null, null, null, null, null, null, aVar2, 100663296, 252);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1624152604, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-DismissDark24> (VkSdkIcons.kt:656)");
                    }
                    lg90 b = or.b(aVar2, 1971505535, R.drawable.vk_icon_dismiss_dark_24, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    Object obj4 = wh50Var;
                    boolean J = aVar2.J(obj4);
                    Object obj5 = izsVar;
                    boolean J2 = J | aVar2.J(obj5) | aVar2.J(bannerViewState2);
                    Object x2 = aVar2.x();
                    Object obj6 = a.C0011a.a;
                    if (J2 || x2 == obj6) {
                        x2 = new ru1(obj5, bannerViewState2, obj4, 1);
                        aVar2.R(x2);
                    }
                    x61 a2 = z06.b.a.a((gzs) x2, null, null, b, null, null, aVar2, 1576960, 54);
                    Object x3 = aVar2.x();
                    if (x3 == obj6) {
                        x3 = new i13(2);
                        aVar2.R(x3);
                    }
                    beu0.a(a, null, null, null, null, null, null, null, a2, null, null, (gzs) x3, aVar2, 0, 48, 1790);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i2 >> 6) & 112) | 199680, 20);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new i26(i, 0, bannerViewState, izsVar, q630Var, z);
        }
    }
}
