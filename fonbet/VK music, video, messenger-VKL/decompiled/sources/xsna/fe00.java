package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.attachments.impl.publish.geolocation.presentation.j;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: MainContent.kt */
/* loaded from: classes16.dex */
public final class fe00 {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-466180044);
        int i2 = (M.J(q630Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-466180044, i2, -1, "com.vk.clips.attachments.impl.publish.geolocation.presentation.view.EmptyView (MainContent.kt:159)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            String N = d370.N(R.string.clips_geolocation_picker_empty_result, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.e0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(N, ra8.a.b(s200.E(q630.a.a, 16, 32), dt1.a.f), ylu0Var.getText().r, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 0, 0, 8184);
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
            s.d = new td00(q630Var, i, 0);
        }
    }

    public static final void b(j.a aVar, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar2.M(494548458);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(494548458, i2, -1, "com.vk.clips.attachments.impl.publish.geolocation.presentation.view.GeoItem (MainContent.kt:176)");
            }
            String str = aVar.a;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new kdw(3);
                M.R(x);
            }
            com.vk.core.compose.component.cell.content.h1 a = Cell$Middle.d.b.a(str, null, null, 0, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), null, M, 12582912, 94);
            String str2 = aVar.b;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new wr0(29);
                M.R(x2);
            }
            com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(a, Cell$Middle.c.b.b(str2, 0, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, 12582912, 94), null, null, M, 196608, 28);
            q630.a aVar3 = q630.a.a;
            wiu0.b(ahn.E(txj0.j(58, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, ojc.c(aVar3, false, null, null, gzsVar, 15)), "geo_picker_item"), false, null, a2, null, null, null, M, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new w70(aVar, gzsVar, q630Var2, i, 6);
        }
    }

    public static final void c(String str, List list, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-2022279916);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2022279916, i3, -1, "com.vk.clips.attachments.impl.publish.geolocation.presentation.view.MainContent (MainContent.kt:64)");
            }
            i160 I = dz5.I(0, 1, M, false);
            q630.a aVar2 = q630.a.a;
            q630 E = ahn.E(n34.t(aVar2, I, null), "geo_picker_items_list");
            boolean z = ((i3 & 14) == 4) | ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new l2e(list, str, izsVar, 2);
                M.R(x);
            }
            q630Var2 = aVar2;
            lqy.a(E, null, null, null, null, null, false, null, (izs) x, M, 0, 510);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mys(str, list, izsVar, q630Var2, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f0, code lost:
    
        if (r12 == r10) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(int i, androidx.compose.runtime.a aVar, String str, gzs gzsVar, izs izsVar, q630 q630Var) {
        q630 q630Var2;
        a.C0011a.C0012a c0012a;
        spj spjVar;
        androidx.compose.runtime.a M = aVar.M(-269972267);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | 3072;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-269972267, i2, -1, "com.vk.clips.attachments.impl.publish.geolocation.presentation.view.SearchItem (MainContent.kt:116)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                x = or.a(str, 0L, 6, M);
            }
            wh50 wh50Var = (wh50) x;
            rc8 a = wc8.a(M);
            Object x2 = M.x();
            if (x2 == c0012a2) {
                x2 = new rwr();
                M.R(x2);
            }
            rwr rwrVar = (rwr) x2;
            Object x3 = M.x();
            if (x3 == c0012a2) {
                x3 = ir.h(M);
            }
            sg50 sg50Var = (sg50) x3;
            tho0 tho0Var = (tho0) wh50Var.getValue();
            boolean z = (i2 & 112) == 32;
            Object x4 = M.x();
            if (z || x4 == c0012a2) {
                x4 = new od00(izsVar, 0);
                M.R(x4);
            }
            izs izsVar2 = (izs) x4;
            Object x5 = M.x();
            if (x5 == c0012a2) {
                x5 = bap.j(EmptyCoroutineContext.b, M);
                M.R(x5);
            }
            yvj yvjVar = (yvj) x5;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1600759418, 0, -1, "com.vk.clips.attachments.impl.publish.geolocation.presentation.view.useDebounce (MainContent.kt:203)");
            }
            wh50 c = androidx.compose.runtime.k.c(tho0Var, M, 0);
            T value = c.getValue();
            boolean y = M.y(yvjVar) | M.p(300L) | M.J(izsVar2) | M.J(c);
            Object x6 = M.x();
            if (y) {
                c0012a = c0012a2;
            } else {
                c0012a = c0012a2;
            }
            x6 = new sc5(yvjVar, izsVar2, c);
            M.R(x6);
            bap.c(value, (izs) x6, M, 0);
            c.getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.clips_geolocaiton_picker_modal_search_hint, 0, M);
            tho0 tho0Var2 = (tho0) wh50Var.getValue();
            q630.a aVar2 = q630.a.a;
            q630 d = jvi.d(qri.a(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), a5x.a, new sc8(a, 0)), rwrVar);
            Object x7 = M.x();
            if (x7 == c0012a) {
                x7 = new f1s(7);
                M.R(x7);
            }
            com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(null, (izs) x7, 3);
            Object x8 = M.x();
            if (x8 == c0012a) {
                x8 = new pd00(0, wh50Var);
                M.R(x8);
            }
            izs izsVar3 = (izs) x8;
            Object x9 = M.x();
            if (x9 == c0012a) {
                x9 = new qd00(0, wh50Var);
                M.R(x9);
            }
            a.C0011a.C0012a c0012a3 = c0012a;
            q630Var2 = aVar2;
            fiv0.a(N, tho0Var2, izsVar3, d, null, null, null, sg50Var, (gzs) x9, null, null, false, a2, false, false, M, 113443200, 0, 28240);
            M = M;
            boolean z2 = (i2 & 896) == 256;
            Object x10 = M.x();
            if (z2 || x10 == c0012a3) {
                spjVar = null;
                x10 = new zd00(sg50Var, gzsVar, rwrVar, null);
                M.R(x10);
            } else {
                spjVar = null;
            }
            bap.g(sg50Var, (wzs) x10, M, 6);
            Boolean valueOf = Boolean.valueOf(drm0.N(((tho0) wh50Var.getValue()).a.c));
            boolean y2 = M.y(a);
            Object x11 = M.x();
            if (y2 || x11 == c0012a3) {
                x11 = new ae00(a, spjVar);
                M.R(x11);
            }
            bap.g(valueOf, (wzs) x11, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new y1k(str, izsVar, gzsVar, q630Var2, i, 2);
        }
    }
}
