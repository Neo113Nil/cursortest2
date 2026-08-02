package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.us2;

/* compiled from: PlaylistMenuContentView.kt */
/* loaded from: classes3.dex */
public final class xab0 {
    public static final long a = l2l0.l(16);

    public static final void a(Object obj, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        ColorFilter porterDuffColorFilter;
        androidx.compose.runtime.a M = aVar.M(1530855303);
        int i2 = (M.J(obj) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1530855303, i2, -1, "com.vk.music.bottomsheets.playlist.redesigned.presentation.PlaylistImage (PlaylistMenuContentView.kt:306)");
            }
            if (obj != null) {
                M.K(1747727579);
                bc50.a(obj, q630Var, 6, null, M, (i2 & 14) | 384 | (i2 & 112), 8);
                M.j();
            } else {
                M.K(1747872504);
                q630 d = rte0.d(sua.d(1.0f, q630Var, false), vog0.b(6));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630 m = hr80.m(d, ylu0Var.getImage().b, androidx.compose.ui.graphics.e.a);
                dt1.a.getClass();
                cp10 d2 = ja8.d(dt1.a.f, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, m);
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
                k9q0.w(M, d2, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                qzu0.a.getClass();
                lg90 f1 = qzu0.f1(M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var2.l().Q;
                if (Build.VERSION.SDK_INT >= 29) {
                    se7.b();
                    porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
                } else {
                    porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
                }
                vjw.a(f1, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new oe7(j, 5, porterDuffColorFilter), M, 56, 60);
                M = M;
                M.G();
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zjm(obj, q630Var, i, 7);
        }
    }

    public static final void b(i9b0 i9b0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        com.vk.core.compose.component.cell.content.h1 h1Var;
        androidx.compose.runtime.a M = aVar.M(381248675);
        if ((i & 6) == 0) {
            i2 = i | (M.J(i9b0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(381248675, i3, -1, "com.vk.music.bottomsheets.playlist.redesigned.presentation.PlaylistMenuHeader (PlaylistMenuContentView.kt:209)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                long j = a;
                x = on00.f(new Pair("illegal_notice_type", new r0x(new esa0(j, j, 6), mji.a)));
                M.R(x);
            }
            Map map = (Map) x;
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            com.vk.core.compose.component.cell.content.j0 a2 = Cell$Left.Main.a.C0731a.a(kai.c(-770090806, new jv90(i9b0Var, 1), M), M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.N;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = ylu0Var.getText().m;
            int i4 = i3 & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1494734208, i4, -1, "com.vk.music.bottomsheets.playlist.redesigned.presentation.getTitleAnnotatedString (PlaylistMenuContentView.kt:285)");
            }
            us2.b bVar = new us2.b();
            String str = i9b0Var.b;
            boolean z = i9b0Var.d;
            bVar.h(zs2.a(str, hik0.a(frv0Var.a.a, j2, 65534)));
            if (z) {
                s0x.a(bVar, "illegal_notice_type", "�");
            }
            us2 n = bVar.n();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean z2 = i4 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new uv20(i9b0Var, 20);
                M.R(x2);
            }
            com.vk.core.compose.component.cell.content.h1 b = Cell$Middle.d.b.b(n, map, null, null, 1, 2, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), null, null, M, 221184, 6, 908);
            String N = d370.N(i9b0Var.c, 0, M);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new ow60(6);
                M.R(x3);
            }
            com.vk.core.compose.component.cell.content.h1 b2 = Cell$Middle.c.b.b(N, 1, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), M, 12583344, 88);
            if (z) {
                M.K(1888016929);
                String N2 = d370.N(R.string.music_track_age_restriction, 0, M);
                Object x4 = M.x();
                if (x4 == c0012a) {
                    x4 = new juz(10);
                    M.R(x4);
                }
                com.vk.core.compose.component.cell.content.h1 a3 = Cell$Middle.b.a.a(N2, 1, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), M, 25008, 0);
                M.j();
                h1Var = a3;
            } else {
                h1Var = null;
                M.K(1888483355);
                M.j();
            }
            wiu0.b(f, false, a2, Cell$Middle.a.a(b, b2, h1Var, null, M, 196608, 24), null, null, null, M, 0, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
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
            s.d = new at2(i9b0Var, q630Var2, i, 1);
        }
    }
}
