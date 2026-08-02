package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.X2;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;
import kotlin.Result;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;
import xsna.us2;

/* compiled from: ReportContent.kt */
/* loaded from: classes4.dex */
public final class j5g0 {
    public static final void a(final String str, final mtk0 mtk0Var, final gzs gzsVar, final izs izsVar, gzs gzsVar2, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        String str2;
        int i2;
        androidx.compose.runtime.a aVar2;
        gzs gzsVar3;
        final q630 q630Var2;
        Object failure;
        int i3;
        androidx.compose.runtime.a M = aVar.M(265020592);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (M.J(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(mtk0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(gzsVar2) ? 16384 : 8192;
        }
        int i4 = i2 | 196608;
        if (M.t(i4 & 1, (74899 & i4) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(265020592, i4, -1, "com.vk.overlaymenu.feature.report.Data (ReportContent.kt:212)");
            }
            boolean z = (i4 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                try {
                    failure = BitmapFactory.decodeFile(str2);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                x = androidx.compose.runtime.k.b(failure);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(aVar3, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(f, ylu0Var.getBackground().r, androidx.compose.ui.graphics.e.a);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            ty6.a aVar5 = dt1.a.o;
            q630 f2 = txj0.f(aVar3, 1.0f);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar5, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, f2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            if (wh50Var.getValue() != 0) {
                M.K(1508161489);
                f(wh50Var, gzsVar, txj0.f(aVar3, 1.0f), M, ((i4 >> 3) & 112) | 384);
                ck70.b(aVar3, 16, M, 6);
            } else {
                M.K(1499961958);
                M.j();
            }
            b(mtk0Var, izsVar, null, M, ((i4 >> 3) & 14) | ((i4 >> 6) & 112));
            M.G();
            float f3 = 16;
            f9t.e(txj0.h(aVar3, f3), M, 6);
            if (wh50Var.getValue() != 0) {
                M.K(1719397347);
                i3 = 0;
                g(null, M, 0);
                ck70.b(aVar3, f3, M, 6);
            } else {
                i3 = 0;
                M.K(1710689788);
                M.j();
            }
            String N = d370.N(R.string.overlay_menu_send, i3, M);
            ButtonSize buttonSize = ButtonSize.Medium;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            boolean z2 = !drm0.N((CharSequence) mtk0Var.getValue());
            q630 f4 = txj0.f(aVar3, 1.0f);
            int i5 = (i4 & 57344) == 16384 ? 1 : i3;
            Object x2 = M.x();
            if (i5 != 0 || x2 == c0012a) {
                gzsVar3 = gzsVar2;
                x2 = new us20(2, gzsVar3);
                M.R(x2);
            } else {
                gzsVar3 = gzsVar2;
            }
            aVar2 = M;
            bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, f4, null, false, false, null, null, null, N, null, null, null, null, z2, null, null, null, aVar2, 28080, 0, 0, 4059104);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            gzsVar3 = gzsVar2;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            final gzs gzsVar4 = gzsVar3;
            s.d = new wzs() { // from class: xsna.f5g0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j5g0.a(str, mtk0Var, gzsVar, izsVar, gzsVar4, q630Var2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(mtk0 mtk0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-618559319);
        if ((i & 6) == 0) {
            i2 = i | (M.J(mtk0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-618559319, i3, -1, "com.vk.overlaymenu.feature.report.Description (ReportContent.kt:294)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c = qri.c(M, aVar3);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            String N = d370.N(R.string.overlay_menu_specify_additional_info, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.s0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(N, new gcv(dt1.a.o), ylu0Var.getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, 0, 0, 8184);
            f9t.e(txj0.h(aVar3, 8), M, 6);
            String str = (String) mtk0Var.getValue();
            String N2 = d370.N(R.string.overlay_menu_details_placeholder, 0, M);
            rgy rgyVar = rgy.e;
            hqv0.c(str, izsVar, txj0.f(aVar3, 1.0f), N2, null, 4, 4, false, false, 0L, 0L, null, new rgy(3, rgyVar.b, rgyVar.c, rgyVar.d), null, null, null, null, null, M, (i3 & 112) | 1769856, 1044368);
            aVar2 = M;
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new y2c(i, 5, mtk0Var, izsVar, q630Var2);
        }
    }

    public static final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1755593123);
        int i2 = (M.J(q630Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1755593123, i2, -1, "com.vk.overlaymenu.feature.report.Error (ReportContent.kt:183)");
            }
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(cVar, dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            pzu0.a(slr0.b(R.drawable.vk_icon_error_outline_28, M), null, wlb0.h(M).q().b, M, 48, 4);
            f9t.e(txj0.h(q630.a.a, 16), M, 6);
            aVar2 = M;
            yqv0.c(d370.N(R.string.overlay_menu_ooops, 0, M), null, wlb0.h(M).getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).i0, aVar2, 0, 0, 8122);
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
            s.d = new ly9(q630Var, i, 2);
        }
    }

    public static final void d(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(62561111);
        int i2 = (M.J(q630Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(62561111, i2, -1, "com.vk.overlaymenu.feature.report.Loading (ReportContent.kt:143)");
            }
            q630Var2 = q630Var;
            zfr0.e(q630Var2, 0L, null, M, i2 & 14, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ryl(q630Var2, i, 3);
        }
    }

    public static final void e(final d6g0 d6g0Var, final mtk0 mtk0Var, final gzs gzsVar, final izs izsVar, final gzs gzsVar2, final gzs gzsVar3, final gzs gzsVar4, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(146978611);
        int i2 = i | (M.J(d6g0Var) ? 4 : 2) | (M.J(mtk0Var) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024) | (M.y(gzsVar2) ? 16384 : 8192) | (M.y(gzsVar3) ? 131072 : 65536) | (M.y(gzsVar4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i2 & 1, (4793491 & i2) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(146978611, i2, -1, "com.vk.overlaymenu.feature.report.ReportContent (ReportContent.kt:75)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                M.R(x);
            }
            kg50 kg50Var = (kg50) x;
            if (iah0.s((Context) M.r(AndroidCompositionLocals_androidKt.b))) {
                M.K(2068838307);
                View rootView = ((View) M.r(AndroidCompositionLocals_androidKt.f)).getRootView();
                s3q0 s3q0Var = s3q0.a;
                boolean y = M.y(rootView);
                Object x2 = M.x();
                if (y || x2 == c0012a) {
                    x2 = new h5g0(rootView, kg50Var, null);
                    M.R(x2);
                }
                bap.g(s3q0Var, (wzs) x2, M, 6);
            } else {
                M.K(2065301455);
            }
            M.j();
            jgh0 x3 = p490.x(M);
            boolean J = M.J(x3);
            Object x4 = M.x();
            if (J || x4 == c0012a) {
                x4 = new i5g0(x3, kg50Var, null);
                M.R(x4);
            }
            bap.g(kg50Var, (wzs) x4, M, 6);
            q630 D = p490.D(n34.t(xp2.a(q630Var, null, 3), dz5.I(0, 1, M, false), null), x3, 14);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D2, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            int i3 = i2 >> 15;
            TopBar$Before.d a2 = TopBar$Before.d.a.a(d370.N(R.string.accessibility_close, 0, M), gzsVar4, null, null, M, (i3 & 112) | 24576, 12);
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.overlay_menu_report_title, 0, M), null, null, null, null, M, 196608, 30), null, null, null, M, 14);
            q630.a aVar3 = q630.a.a;
            muv0.h(a3, txj0.f(aVar3, 1.0f), null, null, null, a2, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 48, 0, 8156);
            M = M;
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, aVar3);
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
            k9q0.w(M, d, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 f = txj0.f(ra8.a.b(txj0.h(aVar3, 300), dt1.a.f), 1.0f);
            if (d6g0Var.a) {
                M.K(787899216);
                d(f, M, 0);
                M.j();
            } else if (d6g0Var.b) {
                M.K(787901550);
                h(i3 & 14, M, gzsVar3, f);
                M.j();
            } else if (d6g0Var.c) {
                M.K(787906638);
                c(f, M, 0);
                M.j();
            } else {
                M.K(787908747);
                a(d6g0Var.d, mtk0Var, gzsVar, izsVar, gzsVar2, null, M, i2 & 65520);
                M = M;
                M.j();
            }
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(mtk0Var, gzsVar, izsVar, gzsVar2, gzsVar3, gzsVar4, q630Var, i) { // from class: xsna.e5g0
                public final /* synthetic */ mtk0 c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ izs e;
                public final /* synthetic */ gzs f;
                public final /* synthetic */ gzs g;
                public final /* synthetic */ gzs h;
                public final /* synthetic */ q630 i;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(12582913);
                    j5g0.e(d6g0.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(wh50 wh50Var, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        wh50 wh50Var2;
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(2031676880);
        if ((i & 6) == 0) {
            wh50Var2 = wh50Var;
            i2 = (M.J(wh50Var2) ? 4 : 2) | i;
        } else {
            wh50Var2 = wh50Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2031676880, i2, -1, "com.vk.overlaymenu.feature.report.Screenshot (ReportContent.kt:265)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            String N = d370.N(R.string.overlay_menu_click_to_edit, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.s0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i3 = i2;
            yqv0.c(N, null, ylu0Var.getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, 0, 0, 8186);
            q630.a aVar4 = q630.a.a;
            f9t.e(txj0.h(aVar4, 8), M, 6);
            T value = wh50Var2.getValue();
            if (value == 0) {
                throw new IllegalArgumentException("Required value was null.");
            }
            aa2 aa2Var = new aa2((Bitmap) value);
            q630 h = txj0.h(r18.a((float) 0.5d, l5g.b, aVar4, androidx.compose.ui.graphics.e.a), 200);
            boolean z = (i3 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new upb0(1, gzsVar);
                M.R(x);
            }
            vjw.b(aa2Var, ojc.c(h, false, null, null, (gzs) x, 15), null, M, 48, 248);
            aVar2 = M;
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
            s.d = new b6v(wh50Var2, gzsVar, q630Var, i, 2);
        }
    }

    public static final void g(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-316375400);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-316375400, i2, -1, "com.vk.overlaymenu.feature.report.ScreenshotDisclaimer (ReportContent.kt:320)");
            }
            M.K(905922396);
            us2.b bVar = new us2.b();
            M.K(905923270);
            int m = bVar.m(new hik0(wlb0.h(M).getText().k, 0L, b6s.k, null, null, null, null, 0L, null, null, null, 0L, null, null, 65530));
            try {
                bVar.f(d370.N(R.string.overlay_menu_privacy_disclaimer_warning, 0, M));
                bVar.append('\n');
                bVar.k(m);
                M.j();
                bVar.g(d370.N(R.string.overlay_menu_privacy_disclaimer_content, 0, M));
                us2 n = bVar.n();
                M.j();
                frv0 frv0Var = wlb0.l(M).s0;
                long j = wlb0.h(M).getText().p;
                q630Var2 = q630.a.a;
                yqv0.d(n, q630Var2, j, 3, null, 0, false, 0, null, null, frv0Var, M, 48, 0, 8120);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } catch (Throwable th) {
                bVar.k(m);
                throw th;
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tyl(q630Var2, i, 1);
        }
    }

    public static final void h(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a aVar2;
        gzs gzsVar2 = gzsVar;
        androidx.compose.runtime.a M = aVar.M(-830557270);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-830557270, i3, -1, "com.vk.overlaymenu.feature.report.Success (ReportContent.kt:151)");
            }
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(cVar, dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            pzu0.a(slr0.b(R.drawable.vk_icon_done_outline_24, M), null, wlb0.h(M).q().b, M, 48, 4);
            float f = 16;
            q630.a aVar4 = q630.a.a;
            f9t.e(txj0.h(aVar4, f), M, 6);
            yqv0.c(d370.N(R.string.overlay_menu_thanks_for_report, 0, M), null, wlb0.h(M).getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).i0, M, 0, 0, 8122);
            f9t.e(txj0.h(aVar4, f), M, 6);
            gzsVar2 = gzsVar;
            bhu0.e(gzsVar2, ButtonSize.Medium, ButtonStyle.Primary, ButtonAppearance.Accent, null, null, false, false, null, null, null, d370.N(R.string.overlay_menu_go_to_chat, 0, M), null, null, null, null, false, null, null, null, M, (i3 & 14) | X2.b.f, 0, 0, 4190192);
            aVar2 = M;
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
            s.d = new bo7(gzsVar2, q630Var, i, 7);
        }
    }
}
