package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import com.vk.core.compose.component.topbar.k;
import com.vkontakte.android.R;
import xsna.mmh0;
import xsna.q630;

/* compiled from: SearchAddressTopBar.kt */
/* loaded from: classes18.dex */
public final class qmh0 {
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0126, code lost:
    
        if (r6 == r5) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(mmh0.d dVar, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        tho0 b;
        Object obj;
        androidx.compose.runtime.a M = aVar.M(-460126756);
        if ((i & 6) == 0) {
            i2 = (M.J(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-460126756, i3, -1, "com.vk.ecomm.cart.impl.search_address.ui.compose.SearchAddressTopBar (SearchAddressTopBar.kt:31)");
            }
            String str = ((rsh0) jk50.d(dVar.a, new rsh0(0), M, 0).getValue()).a;
            Object x = M.x();
            Object obj2 = a.C0011a.a;
            if (x == obj2) {
                int length = str.length();
                x = androidx.compose.runtime.k.b(new tho0(str, jgz.c(length, length), 4));
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            if (epx.f(str, ((tho0) wh50Var.getValue()).a.c)) {
                b = tho0.b((tho0) wh50Var.getValue(), null, 0L, 7);
            } else {
                int length2 = str.length();
                b = new tho0(str, jgz.c(length2, length2), 4);
            }
            tho0 tho0Var = b;
            boolean J = M.J(str);
            Object x2 = M.x();
            if (J || x2 == obj2) {
                x2 = androidx.compose.runtime.k.b(str);
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            k.a.C0761a c0761a = k.a.C0761a.a;
            String N = d370.N(R.string.accessibility_back, 0, M);
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object x3 = M.x();
            if (z || x3 == obj2) {
                x3 = new b97(izsVar, 9);
                M.R(x3);
            }
            TopBar$Before.e a = e.a.a((gzs) x3, N, null, null, null, M, 196608, 28);
            String N2 = d370.N(R.string.ecomm_search_address_search_placeholder, 0, M);
            String N3 = d370.N(R.string.vk_talkback_ic_voice, 0, M);
            boolean z2 = i4 == 256;
            Object x4 = M.x();
            if (z2) {
                obj = obj2;
            } else {
                obj = obj2;
            }
            x4 = new wq0(izsVar, 6);
            M.R(x4);
            Object obj3 = obj;
            lkg0 a2 = vlh0.a(3072, 4, M, null, N3, (gzs) x4);
            Object x5 = M.x();
            if (x5 == obj3) {
                x5 = new svz(26);
                M.R(x5);
            }
            com.vk.core.compose.component.semantics.a a3 = com.vk.core.compose.component.semantics.b.a(null, (izs) x5, 3);
            boolean J2 = M.J(wh50Var2) | (i4 == 256);
            Object x6 = M.x();
            if (J2 || x6 == obj3) {
                x6 = new o15(izsVar, wh50Var, wh50Var2, 7);
                M.R(x6);
            }
            TopBar$Middle.b a4 = TopBar$Middle.b.a.a(N2, tho0Var, (izs) x6, a2, null, null, null, null, a3, false, null, false, M, 0, 384, 3824);
            Object x7 = M.x();
            if (x7 == obj3) {
                x7 = androidx.compose.runtime.k.b(Float.valueOf(1.0f));
                M.R(x7);
            }
            q630.a aVar2 = q630.a.a;
            muv0.h(a4, aVar2, c0761a, null, a, null, null, null, false, 0L, (wh50) x7, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, (i3 & 112) | 384, 6, 7144);
            M = M;
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
            s.d = new n1k(i, 2, (Object) dVar, izsVar, q630Var2);
        }
    }
}
