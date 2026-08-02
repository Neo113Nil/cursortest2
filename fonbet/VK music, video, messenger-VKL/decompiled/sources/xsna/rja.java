package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import xsna.q630;

/* compiled from: CategoriesHeader.kt */
/* loaded from: classes18.dex */
public final class rja {
    public static final void a(String str, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        String str2;
        gzs<s3q0> gzsVar2;
        androidx.compose.runtime.a M = aVar.M(542913528);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(542913528, i2, -1, "com.vk.ecomm.categories.impl.presentation.ui.CategoriesHeader (CategoriesHeader.kt:11)");
            }
            q630 E = ahn.E(q630.a.a, "toolbar");
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(str, null, null, null, null, M, (i2 & 14) | 196608, 30), null, null, null, M, 14);
            M = M;
            gzsVar2 = gzsVar;
            str2 = str;
            muv0.h(a, E, null, null, e.a.a(gzsVar2, null, null, null, null, M, ((i2 >> 3) & 14) | 196608, 30), null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 48, 0, 8172);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            str2 = str;
            gzsVar2 = gzsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new e3(str2, gzsVar2, i, 5);
        }
    }
}
