package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.g8s;
import xsna.h8s;
import xsna.i8s;
import xsna.q630;
import xsna.s2x;

/* compiled from: ClipsPlaylistsFolderNamingContent.kt */
/* loaded from: classes16.dex */
public final class vse {
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01d4, code lost:
    
        if (r6 == r4) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final tho0 tho0Var, final String str, final boolean z, final boolean z2, boolean z3, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        String str2;
        boolean z4;
        a.C0011a.C0012a c0012a;
        final boolean z5 = z3;
        androidx.compose.runtime.a M = aVar.M(-474988083);
        if ((i & 6) == 0) {
            i2 = (M.J(tho0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= M.J(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z4 = z2;
            i2 |= M.l(z4) ? 2048 : 1024;
        } else {
            z4 = z2;
        }
        if ((i & 24576) == 0) {
            i2 |= M.l(z5) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(izsVar) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-474988083, i2, -1, "com.vk.clips.playlists.folders.naming.ui.ClipsPlaylistsFolderNamingContent (ClipsPlaylistsFolderNamingContent.kt:49)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                x = new rwr();
                M.R(x);
            }
            rwr rwrVar = (rwr) x;
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
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
            float f = 16;
            c(d370.N(R.string.clips_playlist_naming_modal_title, 0, M), s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), M, 390);
            f9t.e(txj0.h(aVar2, 12), M, 6);
            q630 d = jvi.d(txj0.f(aVar2, 1.0f), rwrVar);
            int i3 = i2 & 458752;
            boolean z6 = i3 == 131072;
            Object x2 = M.x();
            if (z6 || x2 == c0012a2) {
                x2 = new lse(izsVar, 0);
                M.R(x2);
            }
            izs izsVar2 = (izs) x2;
            boolean z7 = i3 == 131072;
            Object x3 = M.x();
            if (z7 || x3 == c0012a2) {
                x3 = new mse(izsVar, 0);
                M.R(x3);
            }
            int i4 = i2 << 6;
            int i5 = i2;
            b(tho0Var, str2, izsVar2, (gzs) x3, d, z4, z5, null, M, (i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | (i4 & 458752) | (i4 & 3670016));
            z5 = z5;
            f9t.e(txj0.h(aVar2, f), M, 6);
            String N = d370.N(R.string.clips_playlist_naming_save, 0, M);
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            q630 E = ahn.E(s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar2, 1.0f)), "PlaylistsNamingSaveButton");
            boolean z8 = i3 == 131072;
            Object x4 = M.x();
            if (z8) {
                c0012a = c0012a2;
            } else {
                c0012a = c0012a2;
            }
            x4 = new nse(izsVar, 0);
            M.R(x4);
            bhu0.e((gzs) x4, buttonSize, buttonStyle, buttonAppearance, E, null, false, false, null, null, null, N, null, null, null, null, z, null, null, null, M, 28080, (i5 << 15) & 29360128, 0, 4059104);
            M.G();
            Boolean valueOf = Boolean.valueOf(z5);
            boolean z9 = (i5 & 57344) == 16384;
            Object x5 = M.x();
            if (z9 || x5 == c0012a) {
                x5 = new sse(z5, rwrVar, null);
                M.R(x5);
            }
            bap.g(valueOf, (wzs) x5, M, (i5 >> 12) & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ose
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vse.a(tho0.this, str, z, z2, z5, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final tho0 tho0Var, final String str, final izs izsVar, final gzs gzsVar, final q630 q630Var, boolean z, final boolean z2, String str2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final boolean z3;
        final String str3;
        a.C0011a.C0012a c0012a;
        boolean y;
        Object x;
        androidx.compose.runtime.a M = aVar.M(-1482836031);
        if ((i & 6) == 0) {
            i2 = (M.J(tho0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.l(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.l(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i3 = i2 | 12582912;
        if (M.t(i3 & 1, (4793491 & i3) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1482836031, i3, -1, "com.vk.clips.playlists.folders.naming.ui.InputTextField (ClipsPlaylistsFolderNamingContent.kt:114)");
            }
            rc8 a = wc8.a(M);
            Object x2 = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x2 == c0012a2) {
                x2 = qf2.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                M.R(x2);
            }
            final if2 if2Var = (if2) x2;
            Boolean valueOf = Boolean.valueOf(z);
            int i4 = i3 & 458752;
            boolean y2 = (i4 == 131072) | M.y(if2Var) | ((i3 & 7168) == 2048);
            Object x3 = M.x();
            if (y2 || x3 == c0012a2) {
                x3 = new tse(z, if2Var, gzsVar, null);
                M.R(x3);
            }
            bap.g(valueOf, (wzs) x3, M, (i3 >> 15) & 14);
            boolean z4 = (i3 & 896) == 256;
            Object x4 = M.x();
            if (z4 || x4 == c0012a2) {
                x4 = new pse(izsVar, 0);
                M.R(x4);
            }
            izs izsVar2 = (izs) x4;
            boolean z5 = (29360128 & i3) == 8388608;
            Object x5 = M.x();
            if (z5 || x5 == c0012a2) {
                x5 = new ht(12);
                M.R(x5);
            }
            u2x a2 = g8s.b.a.a(s2x.a.C3649a.b(tho0Var, izsVar2, str, 0L, 0L, null, null, null, null, null, false, com.vk.core.compose.component.semantics.b.a(null, (izs) x5, 3), M, (i3 & 14) | ((i3 << 3) & 896), 196608, 16376), null, z2, null, M, ((i3 >> 12) & 896) | 24576, 10);
            q630 f = txj0.f(q630Var, 1.0f);
            boolean y3 = M.y(if2Var) | (i4 == 131072);
            Object x6 = M.x();
            if (y3) {
                c0012a = c0012a2;
            } else {
                c0012a = c0012a2;
                if (x6 != c0012a) {
                    z3 = z;
                    q630 a3 = qri.a(rdu.a(f, (izs) x6), a5x.a, new sc8(a, 0));
                    String N = d370.N(R.string.clips_playlist_naming_input_title, 0, M);
                    bly a4 = i8s.a.AbstractC3037a.C3038a.a(defpackage.b.e(tho0Var.a.c), 25, null, M, 3120, 4);
                    M = M;
                    nvu0.a(a2, a3, h8s.a.a(N, false, null, a4, null, M, 196608, 22), null, null, M, 0, 24);
                    s3q0 s3q0Var = s3q0.a;
                    y = M.y(a);
                    x = M.x();
                    if (!y || x == c0012a) {
                        x = new use(a, null);
                        M.R(x);
                    }
                    bap.g(s3q0Var, (wzs) x, M, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    str3 = "PlaylistsNamingInputField";
                }
            }
            z3 = z;
            x6 = new izs() { // from class: xsna.qse
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    ((tdu) obj).o(z3 ? ((Number) if2Var.d()).floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    return s3q0.a;
                }
            };
            M.R(x6);
            q630 a32 = qri.a(rdu.a(f, (izs) x6), a5x.a, new sc8(a, 0));
            String N2 = d370.N(R.string.clips_playlist_naming_input_title, 0, M);
            bly a42 = i8s.a.AbstractC3037a.C3038a.a(defpackage.b.e(tho0Var.a.c), 25, null, M, 3120, 4);
            M = M;
            nvu0.a(a2, a32, h8s.a.a(N2, false, null, a42, null, M, 196608, 22), null, null, M, 0, 24);
            s3q0 s3q0Var2 = s3q0.a;
            y = M.y(a);
            x = M.x();
            if (!y) {
            }
            x = new use(a, null);
            M.R(x);
            bap.g(s3q0Var2, (wzs) x, M, 6);
            if (androidx.compose.runtime.b.d()) {
            }
            str3 = "PlaylistsNamingInputField";
        } else {
            z3 = z;
            M.h();
            str3 = str2;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.rse
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vse.b(tho0.this, str, izsVar, gzsVar, q630Var, z3, z2, str3, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(2090615464);
        int i2 = i | (M.J(str) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2090615464, i2, -1, "com.vk.clips.playlists.folders.naming.ui.Title (ClipsPlaylistsFolderNamingContent.kt:93)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.C;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().m;
            dt1.a.getClass();
            yqv0.c(str, s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, lr.c(dt1.a.o, q630Var)), j, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, (i2 >> 3) & 14, 0, 8184);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mz1(str, q630Var, i, 4);
        }
    }
}
