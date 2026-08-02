package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vkontakte.android.R;
import java.util.HashSet;
import ru.ok.gl.tf.Tensorflow;

/* compiled from: ProductPreviewTopBarContent.kt */
/* loaded from: classes18.dex */
public final class erd0 {
    public static final void a(f7u f7uVar, lbe lbeVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        TopBar$Before.e eVar;
        int i2;
        androidx.compose.runtime.a M = aVar.M(1183217079);
        int i3 = i | (M.J(f7uVar) ? 4 : 2) | (M.y(lbeVar) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1183217079, i3, -1, "com.vk.ecomm.market.goodpreview.presentation.compose.ProductPreviewTopBar (ProductPreviewTopBarContent.kt:31)");
            }
            String N = d370.N(R.string.product_preview_top_bar_search, 0, M);
            q630 f = txj0.f(q630Var, 1.0f);
            String N2 = d370.N(R.string.product_preview_top_bar_search, 0, M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new tho0((String) null, 0L, 7);
                M.R(x);
            }
            tho0 tho0Var = (tho0) x;
            Object x2 = M.x();
            int i4 = 12;
            if (x2 == c0012a) {
                x2 = new wo40(i4);
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            String N3 = d370.N(R.string.product_preview_top_bar_voice_search, 0, M);
            int i5 = i3 & 112;
            boolean z = i5 == 32;
            Object x3 = M.x();
            if (z || x3 == c0012a) {
                x3 = new b1z(lbeVar, 17);
                M.R(x3);
            }
            gzs gzsVar = (gzs) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new xpt(19);
                M.R(x4);
            }
            lkg0 a = vlh0.a(3072, 0, M, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), N3, gzsVar);
            boolean z2 = i5 == 32;
            Object x5 = M.x();
            if (z2 || x5 == c0012a) {
                x5 = new u110(lbeVar, 14);
                M.R(x5);
            }
            gzs gzsVar2 = (gzs) x5;
            boolean J = M.J(N);
            Object x6 = M.x();
            if (J || x6 == c0012a) {
                x6 = new t62(N, 3);
                M.R(x6);
            }
            TopBar$Middle.b a2 = TopBar$Middle.b.a.a(N2, tho0Var, izsVar, a, null, gzsVar2, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x6, 3), false, null, false, M, Tensorflow.FRAME_WIDTH, 384, 3792);
            int i6 = i3 >> 3;
            int i7 = i6 & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1233896751, i7, -1, "com.vk.ecomm.market.goodpreview.presentation.compose.resolveBefore (ProductPreviewTopBarContent.kt:86)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            HashSet hashSet = iah0.a;
            if (fnj.b(context)) {
                aVar2 = M;
                aVar2.K(-1606528665);
                aVar2.j();
                eVar = null;
            } else {
                M.K(-1606832899);
                String N4 = d370.N(R.string.product_preview_top_bar_back, 0, M);
                Object x7 = M.x();
                if (x7 == c0012a) {
                    x7 = new k220(16);
                    M.R(x7);
                }
                com.vk.core.compose.component.semantics.a a3 = com.vk.core.compose.component.semantics.b.a(null, (izs) x7, 3);
                boolean z3 = ((i7 ^ 6) > 4 && M.J(lbeVar)) || (i6 & 6) == 4;
                Object x8 = M.x();
                if (z3 || x8 == c0012a) {
                    x8 = new x550(lbeVar, 18);
                    M.R(x8);
                }
                TopBar$Before.e a4 = e.a.a((gzs) x8, N4, null, null, a3, M, 196608, 12);
                aVar2 = M;
                aVar2.j();
                eVar = a4;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                i2 = 0;
                androidx.compose.runtime.b.f(328482204, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ShareOutline28> (VkSdkIcons.kt:3340)");
            } else {
                i2 = 0;
            }
            lg90 b = or.b(aVar2, 1878014662, R.drawable.vk_icon_share_outline_28, aVar2, i2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N5 = d370.N(R.string.product_preview_top_bar_share, i2, aVar2);
            int i8 = i5 == 32 ? 1 : i2;
            Object x9 = aVar2.x();
            if (i8 != 0 || x9 == c0012a) {
                x9 = new in60(lbeVar, 11);
                aVar2.R(x9);
            }
            androidx.compose.runtime.a aVar3 = aVar2;
            d.c.C0760d a5 = d.c.C0760d.a.a(b, N5, (gzs) x9, null, null, null, aVar3, 1572872, 56);
            int i9 = f7uVar.a;
            int i10 = i5 == 32 ? 1 : i2;
            Object x10 = aVar3.x();
            if (i10 != 0 || x10 == c0012a) {
                x10 = new lva0(lbeVar, 8);
                aVar3.R(x10);
            }
            d.b.a a6 = zsq.a(i9, (gzs) x10, null, aVar3, 0, 4);
            int i11 = f7uVar.b;
            int i12 = i5 != 32 ? i2 : 1;
            Object x11 = aVar3.x();
            if (i12 != 0 || x11 == c0012a) {
                x11 = new su80(lbeVar, 12);
                aVar3.R(x11);
            }
            muv0.h(a2, f, null, null, eVar, null, d.a.a(a5, a6, dx9.a(i11, (gzs) x11, null, aVar3, 0, 4), null, aVar3, 24576, 8), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar3, 0, 0, 8108);
            M = aVar3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new dr3(i, 5, f7uVar, lbeVar, q630Var);
        }
    }
}
