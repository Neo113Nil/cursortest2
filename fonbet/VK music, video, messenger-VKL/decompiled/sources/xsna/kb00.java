package xsna;

import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.graphics.BlendModeCompat;
import com.ironsource.X2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.music.player.domain.state.LyricsScrollMode;
import com.vk.music.stickyplayer.domain.lyrics.TabLyricsMode;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.dz40;
import xsna.q630;
import xsna.ty6;
import xsna.u700;
import xsna.yk8;

/* compiled from: LyricsPage.kt */
/* loaded from: classes3.dex */
public final class kb00 {
    public static final float a = 100;
    public static final frv0 b = new frv0(new nmo0(0, l2l0.l(24), b6s.e, u4s.b, 0, null, null, 0, l2l0.l(34), null, null, 0, 16646105), false);

    /* compiled from: LyricsPage.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TabLyricsMode.values().length];
            try {
                iArr[TabLyricsMode.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TabLyricsMode.CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TabLyricsMode.PLACEHOLDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TabLyricsMode.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(qa8 qa8Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1960572393);
        if ((i & 6) == 0) {
            i2 = (M.J(qa8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1960572393, i2, -1, "com.vk.music.stickyplayer.presentation.components.AdPlaceHolder (LyricsPage.kt:530)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.c0;
            long c = l5g.c(14, l5g.d, 0.6f);
            String N = d370.N(R.string.music_player_lyrics_ad_placeholder, 0, M);
            dt1.a.getClass();
            aVar2 = M;
            yqv0.c(N, qa8Var.b(q630.a.a, dt1.a.f), c, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 384, 0, 8184);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new v9q(qa8Var, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final va8 va8Var, final dz40.j jVar, final xvy xvyVar, final x17 x17Var, final List list, final Object obj, final izs izsVar, final mtk0 mtk0Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        float f;
        int i3;
        int i4;
        LyricsScrollMode lyricsScrollMode;
        androidx.compose.runtime.a M = aVar.M(1635966054);
        if ((i & 6) == 0) {
            i2 = (M.J(va8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(jVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(xvyVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(x17Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(list) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(obj) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.y(izsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= M.J(mtk0Var) ? 8388608 : 4194304;
        }
        if (M.t(i2 & 1, (i2 & 4793491) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1635966054, i2, -1, "com.vk.music.stickyplayer.presentation.components.ContentLyrics (LyricsPage.kt:147)");
            }
            float a2 = (int) (wa8.a(va8Var) >> 32);
            float b2 = (int) (wa8.b(0, 0, va8Var.f()) & 4294967295L);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            int i5 = jVar.d;
            LyricsScrollMode lyricsScrollMode2 = jVar.a;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(null);
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            q630 f2 = txj0.f(q630.a.a, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f2);
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
            k9q0.w(M, a3, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            tg50 tg50Var = xvyVar.g;
            int i6 = i2 & 896;
            boolean z = i6 == 256;
            Object x3 = M.x();
            if (z || x3 == c0012a) {
                x3 = new fb00(xvyVar, wh50Var, null);
                M.R(x3);
            }
            bap.g(tg50Var, (wzs) x3, M, 0);
            Boolean bool = (Boolean) wh50Var.getValue();
            bool.getClass();
            int i7 = i2;
            boolean z2 = (i6 == 256) | ((i2 & 3670016) == 1048576);
            Object x4 = M.x();
            if (z2 || x4 == c0012a) {
                f = b2;
                i3 = i7;
                i4 = 131072;
                gb00 gb00Var = new gb00(xvyVar, izsVar, wh50Var, wh50Var2, null);
                M.R(gb00Var);
                x4 = gb00Var;
            } else {
                f = b2;
                i3 = i7;
                i4 = 131072;
            }
            bap.f(xvyVar, bool, (wzs) x4, M, (i3 >> 6) & 14);
            Integer valueOf = Integer.valueOf(i5);
            boolean o = M.o(lyricsScrollMode2.ordinal()) | M.o(i5) | (i6 == 256) | ((i3 & 57344) == 16384);
            Object x5 = M.x();
            if (o || x5 == c0012a) {
                lyricsScrollMode = lyricsScrollMode2;
                x5 = new hb00(lyricsScrollMode, i5, xvyVar, list, null);
                M.R(x5);
            } else {
                lyricsScrollMode = lyricsScrollMode2;
            }
            bap.f(valueOf, lyricsScrollMode, (wzs) x5, M, 0);
            int i8 = i3 >> 3;
            aVar2 = M;
            i(xvyVar, jVar, x17Var, mtk0Var, izsVar, a2, f, aVar2, (i8 & 458752) | (i8 & 112) | 6 | ((i3 << 3) & 896) | (i3 & 7168) | ((i3 >> 9) & 57344));
            aVar2.G();
            ((mzp0) obj).e((View) aVar2.r(AndroidCompositionLocals_androidKt.f));
            s3q0 s3q0Var = s3q0.a;
            boolean z3 = (i3 & 458752) == i4;
            Object x6 = aVar2.x();
            if (z3 || x6 == c0012a) {
                x6 = new ib00(obj, null);
                aVar2.R(x6);
            }
            bap.g(s3q0Var, (wzs) x6, aVar2, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.cb00
                /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    kb00.b(va8.this, jVar, xvyVar, x17Var, list, obj, izsVar, mtk0Var, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(2141115162);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2141115162, i, -1, "com.vk.music.stickyplayer.presentation.components.ContentPlaceHolder (LyricsPage.kt:511)");
            }
            q630.a aVar3 = q630.a.a;
            q630 c = txj0.c(txj0.f(aVar3, 1.0f), 0.5f);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.c0;
            aVar2 = M;
            yqv0.c(d370.N(R.string.music_player_lyrics_content_placeholder, 0, M), ra8.a.b(aVar3, dt1.a.f), l5g.c(14, l5g.d, 0.6f), null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 384, 0, 8184);
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
            s.d = new a9b(i, 4);
        }
    }

    public static final void d(final String str, final long j, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-308072851);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.p(j) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-308072851, i2, -1, "com.vk.music.stickyplayer.presentation.components.CreditsLine (LyricsPage.kt:471)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(str, q630Var, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.Y, aVar2, (i2 & 14) | ((i2 >> 3) & 112) | ((i2 << 3) & 896), 0, 8184);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(str, j, q630Var, i) { // from class: xsna.ya00
                public final /* synthetic */ String b;
                public final /* synthetic */ long c;
                public final /* synthetic */ q630 d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    kb00.d(this.b, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(izs<? super sx40, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(2056161482);
        int i2 = (M.y(izsVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2056161482, i2, -1, "com.vk.music.stickyplayer.presentation.components.ErrorContent (LyricsPage.kt:543)");
            }
            dt1.a.getClass();
            ty6.a aVar3 = dt1.a.o;
            a.c cVar = androidx.compose.foundation.layout.a.e;
            q630.a aVar4 = q630.a.a;
            q630 F = s200.F(32, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.c(txj0.f(aVar4, 1.0f), 0.5f));
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(cVar, aVar3, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.l1;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().m;
            com.vk.core.utils.newtork.b.a.getClass();
            yqv0.c(d370.N(com.vk.core.utils.newtork.b.d() ? R.string.music_player_lyrics_try_again : R.string.music_player_lyrics_check_your_internet_connection, 0, M), null, j, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, M, 0, 0, 8122);
            f9t.e(txj0.h(aVar4, 24), M, 6);
            ButtonSize buttonSize = ButtonSize.Medium;
            ButtonStyle buttonStyle = ButtonStyle.Secondary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
            String N = d370.N(R.string.music_player_retry, 0, M);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new o2h(izsVar, 4);
                M.R(x);
            }
            bhu0.e(z3r0.d(0, 1, M, (gzs) x), buttonSize, buttonStyle, buttonAppearance, null, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, M, X2.b.f, 0, 0, 4190192);
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
            s.d = new db00(izsVar, i);
        }
    }

    public static final void f(final int i, final long j, final izs izsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(446512641);
        if ((i2 & 6) == 0) {
            i3 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.p(j) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(446512641, i3, -1, "com.vk.music.stickyplayer.presentation.components.InterludeIcon (LyricsPage.kt:434)");
            }
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-548911394, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-SongOutline32> (VkIcons.kt:10110)");
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_song_outline_32, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f = 32;
            boolean z = ((i3 & 14) == 4) | ((i3 & 896) == 256);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new kor(izsVar, i, 1);
                M.R(x);
            }
            aVar2 = M;
            nzu0.c(z3r0.d(0, 1, M, (gzs) x), a2, null, q630Var, f, j, false, null, false, null, null, aVar2, (i3 & 7168) | 25024 | ((i3 << 12) & 458752), 1984);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.xa00
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kb00.f(i, j, izsVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void g(final int i, final long j, final boolean z, final q630 q630Var, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1053480659);
        int i3 = i2 | (M.o(i) ? 4 : 2) | (M.p(j) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1053480659, i3, -1, "com.vk.music.stickyplayer.presentation.components.LoadingAnimation (LyricsPage.kt:486)");
            }
            aVar2 = M;
            z600.b((i700) guf0.c(new u700.e(i), M, 0).getValue(), q630Var, z, false, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Integer.MAX_VALUE, false, false, false, false, null, false, false, qxm0.x(new n800[]{qxm0.y(t800.I, pe7.a(f870.H(j), BlendModeCompat.SRC_ATOP), new String[]{"**"}, M)}, M), null, null, false, false, null, false, null, aVar2, ((i3 >> 6) & 112) | 1572864 | (i3 & 896), 32768, 0, 4177848);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(i, j, z, q630Var, i2) { // from class: xsna.ta00
                public final /* synthetic */ int b;
                public final /* synthetic */ long c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ q630 e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    kb00.g(this.b, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void h(List list, androidx.compose.runtime.a aVar, int i) {
        Object obj;
        androidx.compose.runtime.a M = aVar.M(1561686484);
        int i2 = (M.J(list) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1561686484, i2, -1, "com.vk.music.stickyplayer.presentation.components.LoadingLyrics (LyricsPage.kt:309)");
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((ja00) obj) instanceof na00) {
                        break;
                    }
                }
            }
            na00 na00Var = obj instanceof na00 ? (na00) obj : null;
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(txj0.c(aVar2, 0.5f), 1.0f);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.f;
            cp10 d = ja8.d(ty6Var, false);
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
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            g(R.raw.dotes, ylu0Var.getText().m, na00Var != null ? na00Var.e : true, ra8.a.b(txj0.v(aVar2, 32), ty6Var), M, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jd4(list, i, 10);
        }
    }

    public static final void i(final xvy xvyVar, final dz40.j jVar, final x17 x17Var, final mtk0 mtk0Var, final izs izsVar, final float f, final float f2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        mtk0 mtk0Var2;
        float f3;
        androidx.compose.runtime.a aVar2;
        int i3;
        a.C0011a.C0012a c0012a;
        final kg50 kg50Var;
        int i4;
        q630.a aVar3;
        int i5;
        dz40.j jVar2;
        androidx.compose.runtime.a M = aVar.M(400949061);
        int i6 = i & 6;
        r9g r9gVar = r9g.a;
        if (i6 == 0) {
            i2 = (M.J(r9gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(xvyVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(jVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(x17Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            mtk0Var2 = mtk0Var;
            i2 |= M.J(mtk0Var2) ? 16384 : 8192;
        } else {
            mtk0Var2 = mtk0Var;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(izsVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            f3 = f;
            i2 |= M.n(f3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            f3 = f;
        }
        if ((i & 12582912) == 0) {
            i2 |= M.n(f2) ? 8388608 : 4194304;
        }
        if (M.t(i2 & 1, (i2 & 4793491) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(400949061, i2, -1, "com.vk.music.stickyplayer.presentation.components.LyricsContentList (LyricsPage.kt:228)");
            }
            final LyricsScrollMode lyricsScrollMode = jVar.a;
            int i7 = i2 & 112;
            boolean z = i7 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z || x == c0012a2) {
                x = bbk0.b(new myh(xvyVar, 29));
                M.R(x);
            }
            final mtk0 mtk0Var3 = (mtk0) x;
            boolean z2 = i7 == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a2) {
                x2 = bbk0.b(new flu(xvyVar, 11));
                M.R(x2);
            }
            final mtk0 mtk0Var4 = (mtk0) x2;
            Object x3 = M.x();
            if (x3 == c0012a2) {
                x3 = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                M.R(x3);
            }
            kg50 kg50Var2 = (kg50) x3;
            final float I0 = ((azl) M.r(uvi.h)).I0(a);
            q630.a aVar4 = q630.a.a;
            q630 a2 = q9g.a(aVar4, 1.0f);
            int i8 = i2 & 896;
            boolean n = ((i2 & 57344) == 16384) | M.n(I0) | ((29360128 & i2) == 8388608) | M.J(mtk0Var3) | M.o(lyricsScrollMode.ordinal()) | (i8 == 256) | ((i2 & 3670016) == 1048576) | M.J(mtk0Var4) | (i7 == 32);
            Object x4 = M.x();
            if (n || x4 == c0012a2) {
                i3 = i2;
                c0012a = c0012a2;
                kg50Var = kg50Var2;
                final mtk0 mtk0Var5 = mtk0Var2;
                final float f4 = f3;
                i4 = i7;
                aVar3 = aVar4;
                i5 = 256;
                izs izsVar2 = new izs() { // from class: xsna.eb00
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        mtk0 mtk0Var6 = mtk0.this;
                        l5g l5gVar = new l5g(((l5g) mtk0Var6.getValue()).a);
                        long j = l5g.j;
                        List l = e43.l(l5gVar, new l5g(j));
                        final float f5 = I0;
                        final y7z g = yk8.a.g(l, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5, 8);
                        List l2 = e43.l(new l5g(j), new l5g(((l5g) mtk0Var6.getValue()).a));
                        final float f6 = f2;
                        final kg50 kg50Var3 = kg50Var;
                        final y7z g2 = yk8.a.g(l2, (f6 - f5) - kg50Var3.getFloatValue(), f6 - kg50Var3.getFloatValue(), 8);
                        final LyricsScrollMode lyricsScrollMode2 = lyricsScrollMode;
                        final dz40.j jVar3 = jVar;
                        final float f7 = f4;
                        final xvy xvyVar2 = xvyVar;
                        final mtk0 mtk0Var7 = mtk0Var3;
                        final mtk0 mtk0Var8 = mtk0Var4;
                        return ((kw8) obj).e(new izs() { // from class: xsna.ua00
                            @Override // xsna.izs
                            public final Object invoke(Object obj2) {
                                ggj ggjVar = (ggj) obj2;
                                ggjVar.s1();
                                int intValue = ((Number) mtk0Var7.getValue()).intValue();
                                float f8 = f7;
                                float f9 = f5;
                                if (intValue > 0) {
                                    if (LyricsScrollMode.this == LyricsScrollMode.MANUAL || jVar3.e) {
                                        oio.x1(ggjVar, g, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f9) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 3, 56);
                                    }
                                }
                                if (((Number) mtk0Var8.getValue()).intValue() < xvyVar2.j().d() - 1) {
                                    float floatValue = (f6 - f9) - kg50Var3.getFloatValue();
                                    oio.x1(ggjVar, g2, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(floatValue) & 4294967295L), (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f9) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 3, 56);
                                }
                                return s3q0.a;
                            }
                        });
                    }
                };
                jVar2 = jVar;
                M.R(izsVar2);
                x4 = izsVar2;
            } else {
                jVar2 = jVar;
                i3 = i2;
                c0012a = c0012a2;
                kg50Var = kg50Var2;
                i4 = i7;
                aVar3 = aVar4;
                i5 = 256;
            }
            q630 e = bu00.e(a2, (izs) x4);
            boolean z3 = (i8 == i5) | ((i3 & 458752) == 131072);
            Object x5 = M.x();
            a.C0011a.C0012a c0012a3 = c0012a;
            if (z3 || x5 == c0012a3) {
                x5 = new nm1(17, jVar2, izsVar);
                M.R(x5);
            }
            aVar2 = M;
            kg50 kg50Var3 = kg50Var;
            lqy.a(e, xvyVar, null, null, null, null, false, null, (izs) x5, aVar2, i4, IronSourceError.ERROR_CODE_INIT_FAILED);
            q630 f5 = txj0.f(aVar3, 1.0f);
            dt1.a.getClass();
            q630 b2 = r9gVar.b(f5, dt1.a.o);
            Object x6 = aVar2.x();
            if (x6 == c0012a3) {
                x6 = new l2i(kg50Var3, 25);
                aVar2.R(x6);
            }
            q630 H = s200.H(egi.o(b2, (izs) x6), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32, 7);
            int i9 = i3 >> 9;
            w17.a(x17Var, 16, izsVar, H, aVar2, (i9 & 14) | 48 | (i9 & 896));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.sa00
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kb00.i(xvy.this, jVar, x17Var, mtk0Var, izsVar, f, f2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void j(Object obj, izs<? super sx40, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        izs<? super sx40, s3q0> izsVar2;
        androidx.compose.runtime.a M = aVar.M(1189738294);
        int i2 = (M.J(obj) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1189738294, i2, -1, "com.vk.music.stickyplayer.presentation.components.LyricsLineItem (LyricsPage.kt:332)");
            }
            ja00 ja00Var = (ja00) obj;
            long j = wlb0.h(M).getText().c;
            long c = l5g.c(14, wlb0.h(M).getText().c, 0.4f);
            if (ja00Var.a()) {
                c = j;
            }
            q630.a aVar2 = q630.a.a;
            q630 E = s200.E(aVar2, 20, 12);
            if (ja00Var instanceof ka00) {
                M.K(1423973322);
                d(((ka00) ja00Var).a, c, E, M, 0);
                M.j();
                izsVar2 = izsVar;
            } else {
                long j2 = c;
                if (ja00Var instanceof ma00) {
                    M.K(1424175070);
                    f(((ma00) ja00Var).a, j2, izsVar, E, M, (i2 << 3) & 896);
                    M = M;
                    M.j();
                } else if (ja00Var instanceof pa00) {
                    M.K(1424419195);
                    l(((pa00) ja00Var).a, j, E, M, 0);
                    M = M;
                    M.j();
                } else if (ja00Var instanceof qa00) {
                    M.K(1424639357);
                    qa00 qa00Var = (qa00) ja00Var;
                    m(qa00Var.a, qa00Var.b, j2, izsVar, E, M, (i2 << 6) & 7168);
                    izsVar2 = izsVar;
                    M.j();
                } else {
                    izsVar2 = izsVar;
                    if (ja00Var instanceof na00) {
                        M.K(1424938848);
                        q630 f = txj0.f(txj0.h(aVar2, 80), 1.0f);
                        dt1.a.getClass();
                        cp10 d = ja8.d(dt1.a.b, false);
                        int hashCode = Long.hashCode(n34.n(M));
                        sy90 D = M.D();
                        q630 c2 = qri.c(M, f);
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
                        k9q0.w(M, c2, cri.a.d);
                        na00 na00Var = (na00) ja00Var;
                        boolean z = na00Var.e;
                        boolean z2 = na00Var.c;
                        ra8 ra8Var = ra8.a;
                        if (z2) {
                            g(R.raw.dotes_num, gub0.a(M, 1410495417, M).m, !z, ra8Var.b(txj0.v(aVar2, 32), dt1.a.f), M, 0);
                            M.j();
                        } else {
                            if (na00Var.b) {
                                M.K(1396166256);
                            } else {
                                g(R.raw.dotes, gub0.a(M, 1410923837, M).m, !z, ra8Var.b(txj0.v(aVar2, 32), dt1.a.f), M, 0);
                            }
                            M.j();
                        }
                        M.G();
                        M.j();
                    } else {
                        M.K(1425954470);
                        M.j();
                    }
                }
                izsVar2 = izsVar;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new do7(obj, izsVar2, i, 4);
        }
    }

    public static final void k(final x17 x17Var, final String str, final dz40.j jVar, final boolean z, final Object obj, final izs izsVar, final q630 q630Var, final mtk0 mtk0Var, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1361422170);
        int i2 = (M.l(z2) ? 67108864 : 33554432) | i | (M.J(x17Var) ? 4 : 2) | (M.J(str) ? 32 : 16) | (M.J(jVar) ? 256 : 128) | (M.l(z) ? 2048 : 1024) | (M.J(obj) ? 16384 : 8192) | (M.y(izsVar) ? 131072 : 65536) | (M.J(q630Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.J(mtk0Var) ? 8388608 : 4194304);
        if (M.t(i2 & 1, (38347923 & i2) != 38347922)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1361422170, i2, -1, "com.vk.music.stickyplayer.presentation.components.LyricsPage (LyricsPage.kt:101)");
            }
            xvy a2 = zvy.a(0, 3, M);
            Boolean valueOf = Boolean.valueOf(z2);
            boolean J = ((234881024 & i2) == 67108864) | ((458752 & i2) == 131072) | M.J(a2);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new jb00(z2, izsVar, a2, null);
                M.R(x);
            }
            bap.f(str, valueOf, (wzs) x, M, ((i2 >> 3) & 14) | ((i2 >> 21) & 112));
            aVar2 = M;
            ua8.a(q630Var, null, false, kai.c(-1924365060, new ab00(jVar, z, a2, x17Var, obj, izsVar, mtk0Var), M), aVar2, ((i2 >> 18) & 14) | 3072, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(str, jVar, z, obj, izsVar, q630Var, mtk0Var, z2, i) { // from class: xsna.bb00
                public final /* synthetic */ String c;
                public final /* synthetic */ dz40.j d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ Object f;
                public final /* synthetic */ izs g;
                public final /* synthetic */ q630 h;
                public final /* synthetic */ mtk0 i;
                public final /* synthetic */ boolean j;

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(1);
                    kb00.k(x17.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void l(final String str, final long j, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1619006755);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.p(j) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1619006755, i2, -1, "com.vk.music.stickyplayer.presentation.components.StaticLine (LyricsPage.kt:419)");
            }
            aVar2 = M;
            yqv0.c(str, q630Var, j, null, null, 0, 0, null, 0, false, 0, 0, null, b, aVar2, (i2 & 14) | ((i2 >> 3) & 112) | ((i2 << 3) & 896), 3072, 8184);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(str, j, q630Var, i) { // from class: xsna.za00
                public final /* synthetic */ String b;
                public final /* synthetic */ long c;
                public final /* synthetic */ q630 d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    kb00.l(this.b, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void m(final String str, final int i, final long j, final izs izsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1695578649);
        if ((i2 & 6) == 0) {
            i3 = (M.J(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.p(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.y(izsVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1695578649, i3, -1, "com.vk.music.stickyplayer.presentation.components.TimeCodeLine (LyricsPage.kt:454)");
            }
            boolean z = ((i3 & 7168) == 2048) | ((i3 & 112) == 32);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new q4u(izsVar, i, 1);
                M.R(x);
            }
            aVar2 = M;
            yqv0.c(str, qri.a(q630Var, a5x.a, new m0r((gzs) x, 3)), j, null, null, 0, 0, null, 0, false, 0, 0, null, b, aVar2, i3 & 910, 3072, 8184);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.wa00
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kb00.m(str, i, j, izsVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
