package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.games.model.GamesAchievementLabelColor;
import com.vk.games.model.GamesAchievementState;
import com.vk.games.model.GamesAchievementType;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.p7t;
import xsna.q630;
import xsna.ty6;
import xsna.udt;

/* compiled from: GamesAchievementsBlockHolder.kt */
/* loaded from: classes17.dex */
public final class v8t {
    public static final uog0 a = vog0.b(10);

    /* compiled from: GamesAchievementsBlockHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[GamesAchievementState.values().length];
            try {
                iArr[GamesAchievementState.IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GamesAchievementLabelColor.values().length];
            try {
                iArr2[GamesAchievementLabelColor.GREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[GamesAchievementLabelColor.YELLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[GamesAchievementLabelColor.RED.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[GamesAchievementType.values().length];
            try {
                iArr3[GamesAchievementType.TIMESPENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[GamesAchievementType.VOTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final void a(String str, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(2121096884);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2121096884, i2, -1, "com.vk.games.presentation.components.sections.AccentButton (GamesAchievementsBlockHolder.kt:400)");
            }
            aVar2 = M;
            bhu0.e(gzsVar, ButtonSize.Small, ButtonStyle.Primary, ButtonAppearance.Accent, s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), null, false, false, null, null, null, str, null, null, null, null, false, null, null, null, aVar2, ((i2 >> 3) & 14) | 28080, (i2 << 6) & 896, 0, 4190176);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new f7c(str, gzsVar, i, 2);
        }
    }

    public static final void b(m8t m8tVar, izs<? super o9t, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-54966913);
        if ((i & 6) == 0) {
            i2 = (M.J(m8tVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-54966913, i2, -1, "com.vk.games.presentation.components.sections.AchievementBlockHeader (GamesAchievementsBlockHolder.kt:219)");
            }
            q630.a aVar2 = q630.a.a;
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 1, txj0.f(aVar2, 1.0f));
            a.j g = androidx.compose.foundation.layout.a.g(4);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            ut utVar = m8tVar.f;
            if (utVar == null) {
                M.K(-191666360);
            } else {
                M.K(-191666359);
                e(utVar, M, 0);
            }
            M.j();
            float f = 130;
            yqv0.c(m8tVar.a, s200.H(txj0.f(aVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), wlb0.h(M).getText().m, null, null, 0, 0, null, 2, false, 0, 2, null, wlb0.l(M).p, M, 100663344, 48, 5880);
            String str = m8tVar.b;
            if (str == null) {
                M.K(-191216581);
            } else {
                M.K(-191216580);
                yqv0.c(str, s200.H(txj0.f(aVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), wlb0.h(M).getText().p, null, null, 0, 0, null, 2, false, 0, 2, null, wlb0.l(M).s0, M, 100663344, 48, 5880);
            }
            M.j();
            int i3 = i2;
            tt ttVar = m8tVar.h;
            if (ttVar == null) {
                M.K(-190796035);
            } else {
                M.K(-190796034);
                c(m8tVar.e, ttVar, m8tVar.i, izsVar, M, (i3 << 6) & 7168);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new i7c(m8tVar, izsVar, i, 2);
        }
    }

    public static final void c(GamesAchievementState gamesAchievementState, tt ttVar, nkx0 nkx0Var, izs<? super o9t, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(837551866);
        if ((i & 6) == 0) {
            i2 = (M.o(gamesAchievementState == null ? -1 : gamesAchievementState.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(ttVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(nkx0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(837551866, i2, -1, "com.vk.games.presentation.components.sections.AchievementButton (GamesAchievementsBlockHolder.kt:271)");
            }
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new itb(ttVar, nkx0Var, izsVar, 1);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            if ((gamesAchievementState != null ? a.$EnumSwitchMapping$0[gamesAchievementState.ordinal()] : -1) == 1) {
                M.K(1728471859);
                j(ttVar.a, gzsVar, M, 0);
                M.j();
            } else {
                M.K(1728474223);
                a(ttVar.a, gzsVar, M, 0);
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
            s.d = new r8t(gamesAchievementState, ttVar, nkx0Var, izsVar, i, 0);
        }
    }

    public static final void d(String str, androidx.compose.runtime.a aVar, int i) {
        String str2;
        androidx.compose.runtime.a M = aVar.M(321097199);
        int i2 = (M.J(str) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(321097199, i2, -1, "com.vk.games.presentation.components.sections.AchievementImage (GamesAchievementsBlockHolder.kt:292)");
            }
            dt1.a.getClass();
            q630 h = txj0.h(txj0.v(s200.H(ra8.a.b(q630.a.a, dt1.a.d), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), 160), Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new bz(25);
                M.R(x);
            }
            str2 = str;
            fwu0.c(h, null, str2, null, null, (izs) x, null, rte0.b, M, ((i2 << 3) & 896) | 100859904, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            str2 = str;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.s(str2, i, 9);
        }
    }

    public static final void e(ut utVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        Pair pair;
        androidx.compose.runtime.a M = aVar.M(1433791336);
        int i2 = (M.J(utVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1433791336, i2, -1, "com.vk.games.presentation.components.sections.AchievementLabel (GamesAchievementsBlockHolder.kt:313)");
            }
            int i3 = a.$EnumSwitchMapping$1[utVar.b.ordinal()];
            if (i3 == 1) {
                M.K(-811022275);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var = rrv0.a;
                ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                l5g l5gVar = new l5g(ylu0Var.q().e);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                pair = new Pair(l5gVar, new l5g(ylu0Var2.getBackground().w));
                M.j();
            } else if (i3 == 2) {
                M.K(-811018087);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var2 = rrv0.a;
                ylu0 ylu0Var3 = (ylu0) M.r(iyk0Var2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                l5g l5gVar2 = new l5g(ylu0Var3.q().g);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var4 = (ylu0) M.r(iyk0Var2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                pair = new Pair(l5gVar2, new l5g(ylu0Var4.getBackground().D));
                M.j();
            } else if (i3 != 3) {
                M.K(-811010916);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var3 = rrv0.a;
                ylu0 ylu0Var5 = (ylu0) M.r(iyk0Var3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                l5g l5gVar3 = new l5g(ylu0Var5.getText().a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var6 = (ylu0) M.r(iyk0Var3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                pair = new Pair(l5gVar3, new l5g(ylu0Var6.getBackground().z));
                M.j();
            } else {
                M.K(-811014117);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                iyk0 iyk0Var4 = rrv0.a;
                ylu0 ylu0Var7 = (ylu0) M.r(iyk0Var4);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                l5g l5gVar4 = new l5g(ylu0Var7.q().m);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var8 = (ylu0) M.r(iyk0Var4);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                pair = new Pair(l5gVar4, new l5g(ylu0Var8.getBackground().u));
                M.j();
            }
            aVar2 = M;
            rnu0.c(ContentBadgeSize.Small, ContentBadgeMode.Secondary, new ContentBadgeAppearance.a(12, ((l5g) pair.g()).a, ((l5g) pair.d()).a, 0L), s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, 7), null, null, utVar.a, null, null, null, false, null, false, null, aVar2, 3126, 0, 16304);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new y6c(utVar, i, 4);
        }
    }

    public static final void f(final h8t h8tVar, final rha rhaVar, final izs izsVar, final xvy xvyVar, final String str, final int i, final int i2, final q630 q630Var, androidx.compose.runtime.a aVar, final int i3) {
        int i4;
        Object obj;
        int i5;
        androidx.compose.runtime.a M = aVar.M(-1506547524);
        if ((i3 & 6) == 0) {
            i4 = (M.J(h8tVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= M.J(rhaVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= M.J(xvyVar) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            obj = str;
            i4 |= M.J(obj) ? 16384 : 8192;
        } else {
            obj = str;
        }
        if ((196608 & i3) == 0) {
            i4 |= M.o(i) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= M.o(i2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= M.J(q630Var) ? 8388608 : 4194304;
        }
        if (M.t(i4 & 1, (4793491 & i4) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1506547524, i4, -1, "com.vk.games.presentation.components.sections.GameItemCell (GamesAchievementsBlockHolder.kt:189)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            i8t i8tVar = new i8t(i, i2, p7t.b.a);
            q630 z = txj0.z(txj0.f(q630.a.a, 1.0f), null, 3);
            boolean z2 = rhaVar.b;
            float f = rhaVar.c;
            int i6 = i4 & 896;
            int i7 = i4 & 14;
            boolean z3 = (i7 == 4) | (i6 == 256);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z3 || x == c0012a) {
                i5 = i4;
                x = new j4(13, izsVar, h8tVar);
                M.R(x);
            } else {
                i5 = i4;
            }
            gzs gzsVar = (gzs) x;
            boolean z4 = (i6 == 256) | (i7 == 4);
            Object x2 = M.x();
            if (z4 || x2 == c0012a) {
                x2 = new s(10, izsVar, h8tVar);
                M.R(x2);
            }
            o7t.e(h8tVar, izsVar, i8tVar, rhaVar, vbh0.f(z, z2, xvyVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, obj, gzsVar, (gzs) x2, 36), M, i7 | ((i5 >> 3) & 112) | ((i5 << 6) & 7168));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.u8t
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    v8t.f(h8t.this, rhaVar, izsVar, xvyVar, str, i, i2, q630Var, (androidx.compose.runtime.a) obj2, ne7.I(i3 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void g(udt.h.c cVar, final rha rhaVar, izs izsVar, final xvy xvyVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        udt.h.c cVar2;
        ty6 ty6Var;
        float f;
        m8t m8tVar;
        WebImage webImage;
        List<WebImageSize> list;
        WebImageSize webImageSize;
        m8t m8tVar2;
        float f2;
        int i3;
        boolean z;
        char c;
        final izs izsVar2 = izsVar;
        androidx.compose.runtime.a M = aVar.M(-1833927277);
        if ((i & 6) == 0) {
            i2 = (M.J(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(rhaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(xvyVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1833927277, i2, -1, "com.vk.games.presentation.components.sections.GamesAchievementsBlockGrid (GamesAchievementsBlockHolder.kt:103)");
            }
            m8t m8tVar3 = cVar.h;
            List list2 = cVar.g;
            int size = !list2.isEmpty() ? list2.size() + 1 : 0;
            q630 f3 = txj0.f(q630Var, 1.0f);
            dt1.a.getClass();
            ty6 ty6Var2 = dt1.a.b;
            cp10 d = ja8.d(ty6Var2, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f3);
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
            cri.a.c cVar3 = cri.a.f;
            k9q0.w(M, d, cVar3);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            q630.a aVar3 = q630.a.a;
            float f4 = 12;
            int i4 = i2;
            float f5 = 6;
            q630 d2 = rte0.d(s200.G(txj0.f(aVar3, 1.0f), f4, 14, f4, f5), a);
            if (androidx.compose.runtime.b.d()) {
                ty6Var = ty6Var2;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                ty6Var = ty6Var2;
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f6 = f5;
            q630 m = hr80.m(d2, ylu0Var.getBackground().x, androidx.compose.ui.graphics.e.a);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, m);
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
            k9q0.w(M, a2, cVar3);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            if (m8tVar3.c == null) {
                M.K(-1824822718);
                M.j();
                f = 1.0f;
            } else {
                M.K(-1824822717);
                f = 1.0f;
                i(r1.intValue() / 100.0f, m8tVar3.d, txj0.h(txj0.f(aVar3, 1.0f), f6), M, 384);
                s3q0 s3q0Var = s3q0.a;
                M.j();
            }
            q630 f7 = txj0.f(aVar3, f);
            float f8 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            q630 F = s200.F(f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, f7);
            cp10 d3 = ja8.d(ty6Var, false);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c4 = qri.c(M, F);
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
            k9q0.w(M, d3, cVar3);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            izsVar2 = izsVar;
            b(m8tVar3, izsVar2, M, (i4 >> 3) & 112);
            M.G();
            if (size > 0) {
                M.K(-1824287161);
                char c5 = '\b';
                f9t.e(txj0.h(aVar3, 8), M, 6);
                int i5 = 2;
                int i6 = (size + 2) / 3;
                int i7 = 0;
                while (i7 < i6) {
                    q630 F2 = s200.F(f6, f8, i5, m200.u(txj0.f(aVar3, 1.0f), IntrinsicSize.Min));
                    a.l lVar = androidx.compose.foundation.layout.a.a;
                    dt1.a.getClass();
                    int i8 = 0;
                    androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
                    int hashCode4 = Long.hashCode(n34.n(M));
                    sy90 D4 = M.D();
                    q630 c6 = qri.c(M, F2);
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
                    k9q0.w(M, a3, cri.a.f);
                    k9q0.w(M, D4, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode4), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c6, cri.a.d);
                    M.K(293358820);
                    boolean z2 = false;
                    while (i8 < 3) {
                        int i9 = (i7 * 3) + i8;
                        tpg0 tpg0Var = tpg0.a;
                        if (i9 < 0 || i9 >= list2.size()) {
                            m8tVar2 = m8tVar3;
                            f2 = f6;
                            i3 = i4;
                            if (i9 == list2.size()) {
                                M.K(-954870627);
                                q630 z3 = txj0.z(txj0.f(tpg0Var.b(1.0f, aVar3, true), 1.0f), null, 3);
                                boolean z4 = ((i3 & 896) == 256) | ((i3 & 14) == 4);
                                Object x = M.x();
                                if (z4 || x == a.C0011a.a) {
                                    c = '\b';
                                    x = new fy0(8, cVar, izsVar2);
                                    M.R(x);
                                } else {
                                    c = '\b';
                                }
                                k(0, M, (gzs) x, z3);
                                M.j();
                                z = false;
                            } else {
                                z = false;
                                c = '\b';
                                M.K(-954237452);
                                f9t.e(tpg0Var.b(1.0f, aVar3, true), M, 0);
                                M.j();
                            }
                        } else {
                            M.K(-955691848);
                            f2 = f6;
                            izs izsVar3 = izsVar2;
                            f((h8t) list2.get(i9), rhaVar, izsVar3, xvyVar, cVar.e, i8, i7, tpg0Var.b(1.0f, aVar3, true), M, i4 & 8176);
                            izsVar2 = izsVar3;
                            M.j();
                            m8tVar2 = m8tVar3;
                            i3 = i4;
                            z = false;
                            c = '\b';
                        }
                        i8++;
                        i4 = i3;
                        m8tVar3 = m8tVar2;
                        z2 = z;
                        c5 = c;
                        f6 = f2;
                    }
                    M.j();
                    M.G();
                    i7++;
                    m8tVar3 = m8tVar3;
                    c5 = c5;
                    f6 = f6;
                    i5 = 2;
                    f8 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                cVar2 = cVar;
                m8tVar = m8tVar3;
            } else {
                cVar2 = cVar;
                m8tVar = m8tVar3;
                M.K(-1829974421);
            }
            M.j();
            f9t.e(txj0.h(aVar3, 4), M, 6);
            M.G();
            List<WebImage> list3 = m8tVar.g;
            String str = (list3 == null || (webImage = (WebImage) j5g.a0(list3)) == null || (list = webImage.b) == null || (webImageSize = (WebImageSize) j5g.a0(list)) == null) ? null : webImageSize.b;
            if (str == null) {
                M.K(-444716238);
            } else {
                M.K(-444716237);
                d(str, M, 6);
                s3q0 s3q0Var2 = s3q0.a;
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            cVar2 = cVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final udt.h.c cVar4 = cVar2;
            s.d = new wzs() { // from class: xsna.s8t
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    v8t.g(udt.h.c.this, rhaVar, izsVar2, xvyVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void h(udt.h.c cVar, rha rhaVar, izs izsVar, xvy xvyVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        final xvy xvyVar2;
        final izs izsVar2;
        final rha rhaVar2;
        final udt.h.c cVar2;
        androidx.compose.runtime.a M = aVar.M(-1003805959);
        int i2 = (M.J(cVar) ? 4 : 2) | i | (M.J(rhaVar) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.J(xvyVar) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1003805959, i2, -1, "com.vk.games.presentation.components.sections.GamesAchievementsBlockHolder (GamesAchievementsBlockHolder.kt:86)");
            }
            g(cVar, rhaVar, izsVar, xvyVar, q630Var, M, i2 & 65534);
            cVar2 = cVar;
            rhaVar2 = rhaVar;
            izsVar2 = izsVar;
            xvyVar2 = xvyVar;
            q630Var2 = q630Var;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            xvyVar2 = xvyVar;
            izsVar2 = izsVar;
            rhaVar2 = rhaVar;
            cVar2 = cVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(rhaVar2, izsVar2, xvyVar2, q630Var2, i) { // from class: xsna.p8t
                public final /* synthetic */ rha c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ xvy e;
                public final /* synthetic */ q630 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    v8t.h(udt.h.c.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void i(final float f, final GamesAchievementType gamesAchievementType, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        List l;
        androidx.compose.runtime.a M = aVar.M(-1503604313);
        int i2 = (M.n(f) ? 4 : 2) | i | (M.o(gamesAchievementType == null ? -1 : gamesAchievementType.ordinal()) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1503604313, i2, -1, "com.vk.games.presentation.components.sections.GradientProgress (GamesAchievementsBlockHolder.kt:416)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.b().a;
            mtk0 b = hg2.b(swe0.f(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), new xmk0(1.0f, 50.0f, Float.valueOf(0.001f)), "GradientProgressAnimation", null, M, 3120, 20);
            int i3 = gamesAchievementType == null ? -1 : a.$EnumSwitchMapping$2[gamesAchievementType.ordinal()];
            if (i3 == -1) {
                l = e43.l(new l5g(f870.d(4278245704L)), new l5g(f870.d(4279074886L)));
            } else if (i3 == 1) {
                l = e43.l(new l5g(f870.d(4278245704L)), new l5g(f870.d(4279074886L)));
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                l = e43.l(new l5g(f870.d(4294941132L)), new l5g(f870.d(4293209706L)));
            }
            q630 a2 = j3e0.a(hr80.m(rte0.d(txj0.f(q630Var, 1.0f), vog0.a), j, androidx.compose.ui.graphics.e.a), ((Number) b.getValue()).floatValue());
            boolean J = M.J(b) | M.y(l);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new by5(15, l, b);
                M.R(x);
            }
            xa4.i(0, M, (izs) x, a2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(f, gamesAchievementType, q630Var, i) { // from class: xsna.q8t
                public final /* synthetic */ float b;
                public final /* synthetic */ GamesAchievementType c;
                public final /* synthetic */ q630 d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(385);
                    v8t.i(this.b, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void j(String str, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(2113923852);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2113923852, i2, -1, "com.vk.games.presentation.components.sections.InProgressButton (GamesAchievementsBlockHolder.kt:376)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.p().a;
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2112191392, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Chevron16> (VkSdkIcons.kt:408)");
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_chevron_16, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            bhu0.e(gzsVar, buttonSize, buttonStyle, buttonAppearance, r18.a((float) 0.5d, j, s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), vog0.b(8)), null, false, false, null, null, null, str, null, a2, null, null, false, null, null, null, aVar2, ((i2 >> 3) & 14) | X2.b.f, ((i2 << 6) & 896) | 32768, 0, 4173792);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new e7c(str, gzsVar, i, 2);
        }
    }

    public static final void k(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        int i2;
        ColorFilter porterDuffColorFilter;
        androidx.compose.runtime.a M = aVar.M(1205752358);
        int i3 = (M.J(q630Var) ? 4 : 2) | i | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1205752358, i3, -1, "com.vk.games.presentation.components.sections.ShowAllGamesItem (GamesAchievementsBlockHolder.kt:338)");
            }
            float f = 6;
            float f2 = 8;
            q630 G = s200.G(ojc.c(rte0.d(q630Var, a), false, null, null, gzsVar, 15), f, 4, f, f2);
            dt1.a.getClass();
            ty6.a aVar2 = dt1.a.o;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, aVar2, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, G);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630.a aVar4 = q630.a.a;
            q630 d = txj0.d(aVar4, 1.0f);
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, d);
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
            k9q0.w(M, d2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.e, aVar2, M, 54);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, aVar4);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            if (androidx.compose.runtime.b.d()) {
                i2 = 0;
                androidx.compose.runtime.b.f(-1820128868, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronRightCircle28> (VkSdkIcons.kt:506)");
            } else {
                i2 = 0;
            }
            lg90 a4 = pg90.a(R.drawable.vk_icon_chevron_right_circle_28, i2, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = wlb0.h(M).getIcon().l;
            if (Build.VERSION.SDK_INT >= 29) {
                se7.b();
                porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
            }
            vjw.a(a4, null, txj0.q(aVar4, 28), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new oe7(j, 5, porterDuffColorFilter), M, 440, 56);
            yqv0.c(d370.N(R.string.vk_games_achievements_show_all, i2, M), s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.h(M).getText().p, null, null, 0, 0, null, 0, false, 0, 1, null, wlb0.l(M).d0, M, 48, 48, 6136);
            M = M;
            M.G();
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new t8t(q630Var, gzsVar, i);
        }
    }
}
