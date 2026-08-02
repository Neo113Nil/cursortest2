package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.onboarding.VkOnboarding$GraffitiAlignment;
import com.vk.core.tool.onboarding.VkOnboarding$HighlighterMarkerType;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.g7v0;
import xsna.q630;
import xsna.ty6;
import xsna.us2;
import xsna.v5v;

/* compiled from: VkOnboardingBanner.kt */
/* loaded from: classes17.dex */
public final class o7v0 {
    public static final void a(final String str, final f7v0 f7v0Var, final VkOnboarding$TintColor vkOnboarding$TintColor, final VkOnboarding$HighlighterMarkerType vkOnboarding$HighlighterMarkerType, final l5g l5gVar, VkOnboardingStat$Delegate vkOnboardingStat$Delegate, final q630 q630Var, final gzs gzsVar, final gzs gzsVar2, androidx.compose.runtime.a aVar, final int i) {
        String str2;
        int i2;
        final VkOnboardingStat$Delegate vkOnboardingStat$Delegate2;
        androidx.compose.runtime.a aVar2;
        int i3;
        a.C0011a.C0012a c0012a;
        uog0 uog0Var;
        Throwable th;
        v5v v5vVar;
        l5g l5gVar2;
        final wh50 wh50Var;
        gzs gzsVar3;
        int i4;
        androidx.compose.runtime.a M = aVar.M(1977655776);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (M.J(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(f7v0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.o(vkOnboarding$TintColor.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.o(vkOnboarding$HighlighterMarkerType.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(l5gVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(vkOnboardingStat$Delegate) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.J(q630Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= M.y(gzsVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= M.y(gzsVar2) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= M.J(null) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if (M.t(i2 & 1, (306783379 & i2) != 306783378)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1977655776, i2, -1, "com.vk.core.tool.compose.onboarding.BannerBody (VkOnboardingBanner.kt:179)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                bpn0 bpn0Var = v5v.c;
                x = v5v.a.a(str2);
                M.R(x);
            }
            v5v v5vVar2 = (v5v) x;
            boolean s = wlb0.h(M).s();
            long j = wlb0.h(M).l().F0;
            Object x2 = M.x();
            if (x2 == c0012a2) {
                x2 = androidx.compose.runtime.k.b(new us2.b(v5vVar2.a).n());
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            uog0 b = vog0.b(10);
            Boolean valueOf = Boolean.valueOf(wlb0.h(M).s());
            boolean l = ((i2 & 57344) == 16384) | M.l(s) | ((i2 & 896) == 256) | M.p(j);
            Object x3 = M.x();
            if (l || x3 == c0012a2) {
                i3 = i2;
                c0012a = c0012a2;
                uog0Var = b;
                th = null;
                l7v0 l7v0Var = new l7v0(v5vVar2, l5gVar, s, vkOnboarding$TintColor, j, wh50Var2, null);
                v5vVar = v5vVar2;
                wh50Var2 = wh50Var2;
                l5gVar2 = l5gVar;
                M.R(l7v0Var);
                x3 = l7v0Var;
            } else {
                l5gVar2 = l5gVar;
                i3 = i2;
                c0012a = c0012a2;
                uog0Var = b;
                v5vVar = v5vVar2;
                th = null;
            }
            bap.f(valueOf, l5gVar2, (wzs) x3, M, (i3 >> 9) & 112);
            M.K(-2143245229);
            q630 m = hr80.m(rte0.d(q630Var, uog0Var), wlb0.h(M).getBackground().x, androidx.compose.ui.graphics.e.a);
            y18 a = aqw.a((float) 0.33d, wlb0.h(M).getImage().a);
            q630 b2 = r18.b(a.a, a.b, m, uog0Var);
            if (gzsVar != null) {
                Object x4 = M.x();
                if (x4 == c0012a) {
                    x4 = ir.h(M);
                }
                wh50Var = wh50Var2;
                q630 g = b2.g(ojc.b(q630.a.a, (sg50) x4, qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false), true, new plg0(0), gzsVar, 8));
                if (g != null) {
                    b2 = g;
                }
            } else {
                wh50Var = wh50Var2;
            }
            M.j();
            float f = kqu0.v;
            q630 D = s200.D(b2, f);
            dt1.a.getClass();
            ty6.b bVar = dt1.a.k;
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(f), bVar, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw th;
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
            k9q0.w(M, D2, eVar);
            Integer valueOf2 = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf2, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, true);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(kqu0.t), dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, xpyVar);
            if (M.N() == null) {
                n34.r();
                throw th;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar);
            int i5 = i3 << 3;
            d8v0.a(v5vVar.b, null, vkOnboarding$HighlighterMarkerType, vkOnboarding$TintColor, false, false, false, null, kai.c(-823741578, new zzs() { // from class: xsna.h7v0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    izs izsVar = (izs) obj;
                    ((Boolean) obj2).getClass();
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar4.y(izsVar) ? 4 : 2;
                    }
                    if (aVar4.t(intValue & 1, (intValue & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-823741578, intValue, -1, "com.vk.core.tool.compose.onboarding.BannerBody.<anonymous>.<anonymous>.<anonymous> (VkOnboardingBanner.kt:241)");
                        }
                        us2 us2Var = (us2) wh50.this.getValue();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        }
                        wuv0 wuv0Var = (wuv0) aVar4.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        frv0 frv0Var = wuv0Var.p;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar4.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        yqv0.d(us2Var, null, ylu0Var.getText().m, 0, null, 0, false, 0, izsVar, null, frv0Var, aVar4, 0, (intValue << 3) & 112, 6138);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i3 >> 3) & 896) | 805306374 | (i5 & 7168), 498);
            if (f7v0Var == null) {
                M.K(-1404911736);
                M.j();
                vkOnboardingStat$Delegate2 = vkOnboardingStat$Delegate;
            } else {
                M.K(-1707887719);
                vkOnboardingStat$Delegate2 = vkOnboardingStat$Delegate;
                f7v0Var.a(vkOnboardingStat$Delegate2, M, (i5 & 896) | ((i3 >> 12) & 112) | 6);
                M.j();
                s3q0 s3q0Var = s3q0.a;
            }
            M.G();
            if (gzsVar2 == null) {
                M.K(-1221696324);
                Object x5 = M.x();
                if (x5 == c0012a) {
                    x5 = new a7p0(6);
                    M.R(x5);
                }
                M.j();
                gzsVar3 = (gzs) x5;
            } else {
                M.K(930421363);
                M.j();
                gzsVar3 = gzsVar2;
            }
            boolean z = gzsVar2 != null;
            gor0 gor0Var = new gor0(bVar);
            float f2 = 24;
            if (androidx.compose.runtime.b.d()) {
                i4 = 0;
                androidx.compose.runtime.b.f(1243383292, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel24> (VkSdkIcons.kt:226)");
            } else {
                i4 = 0;
            }
            lg90 b3 = or.b(M, 1833859693, R.drawable.vk_icon_cancel_24, M, i4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            nzu0.c(gzsVar3, b3, d370.N(R.string.vk_accessibility_onboarding_banner_dismiss, i4, M), gor0Var, f2, wlb0.h(M).getIcon().l, false, null, z, null, null, M, 24640, 1728);
            aVar2 = M;
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            vkOnboardingStat$Delegate2 = vkOnboardingStat$Delegate;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s2 = aVar2.s();
        if (s2 != null) {
            s2.d = new wzs() { // from class: xsna.i7v0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o7v0.a(str, f7v0Var, vkOnboarding$TintColor, vkOnboarding$HighlighterMarkerType, l5gVar, vkOnboardingStat$Delegate2, q630Var, gzsVar, gzsVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(g7v0 g7v0Var, VkOnboarding$TintColor vkOnboarding$TintColor, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> e7cVar;
        lg90 a;
        androidx.compose.runtime.a M = aVar.M(605539208);
        int i2 = (M.J(g7v0Var) ? 4 : 2) | i | (M.o(vkOnboarding$TintColor.ordinal()) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(605539208, i2, -1, "com.vk.core.tool.compose.onboarding.Graffiti (VkOnboardingBanner.kt:271)");
            }
            boolean z = g7v0Var instanceof g7v0.c;
            if (z) {
                M.K(756110092);
                ((g7v0.c) g7v0Var).b.invoke(new l5g(j0t.a(vkOnboarding$TintColor, M, (i2 >> 3) & 14)), M, 0);
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s == null) {
                    return;
                } else {
                    e7cVar = new o21(g7v0Var, vkOnboarding$TintColor, i, 9);
                }
            } else {
                M.K(745291898);
                M.j();
                if (epx.f(g7v0Var, g7v0.f.b)) {
                    M.K(2102606112);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1328368062, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-OnboardingGraffitiArrow1> (VkIcons.kt:8232)");
                    }
                    a = pg90.a(R.drawable.vk_icon_onboarding_graffiti_arrow_1, 0, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else if (epx.f(g7v0Var, g7v0.b.b)) {
                    M.K(2102608576);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1336383394, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-OnboardingGraffitiArrow2> (VkIcons.kt:8236)");
                    }
                    a = pg90.a(R.drawable.vk_icon_onboarding_graffiti_arrow_2, 0, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else if (epx.f(g7v0Var, g7v0.e.b)) {
                    M.K(2102610879);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(841007884, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-OnboardingGraffitiShake> (VkIcons.kt:8244)");
                    }
                    a = pg90.a(R.drawable.vk_icon_onboarding_graffiti_shake, 0, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else if (epx.f(g7v0Var, g7v0.d.b)) {
                    M.K(2102613184);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(156019938, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-OnboardingGraffitiKitten> (VkIcons.kt:8240)");
                    }
                    a = pg90.a(R.drawable.vk_icon_onboarding_graffiti_kitten, 0, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                } else {
                    if (!z) {
                        throw alb0.c(2102604188, M);
                    }
                    if (oq.h(756566164, M)) {
                        androidx.compose.runtime.b.e();
                    }
                    s = M.s();
                    if (s == null) {
                        return;
                    } else {
                        e7cVar = new wbi(g7v0Var, vkOnboarding$TintColor, i, 13);
                    }
                }
                pzu0.b(a, null, null, j0t.a(vkOnboarding$TintColor, M, (i2 >> 3) & 14), M, 56, 4);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            s.d = e7cVar;
        }
        M.h();
        s = M.s();
        if (s != null) {
            e7cVar = new e7c(g7v0Var, vkOnboarding$TintColor, i, 9);
            s.d = e7cVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final String str, final f7v0 f7v0Var, q630 q630Var, final g7v0 g7v0Var, VkOnboarding$GraffitiAlignment vkOnboarding$GraffitiAlignment, VkOnboarding$TintColor vkOnboarding$TintColor, VkOnboarding$HighlighterMarkerType vkOnboarding$HighlighterMarkerType, l5g l5gVar, final gzs gzsVar, final gzs gzsVar2, float f, VkOnboardingStat$Delegate vkOnboardingStat$Delegate, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        int i4;
        l5g l5gVar2;
        char c;
        int i5;
        final q630 q630Var2;
        final VkOnboarding$GraffitiAlignment vkOnboarding$GraffitiAlignment2;
        final VkOnboarding$HighlighterMarkerType vkOnboarding$HighlighterMarkerType2;
        final float f2;
        final VkOnboardingStat$Delegate vkOnboardingStat$Delegate2;
        final l5g l5gVar3;
        final VkOnboarding$TintColor vkOnboarding$TintColor2;
        androidx.compose.runtime.f s;
        VkOnboarding$TintColor vkOnboarding$TintColor3;
        VkOnboarding$HighlighterMarkerType vkOnboarding$HighlighterMarkerType3;
        VkOnboarding$TintColor vkOnboarding$TintColor4;
        l5g l5gVar4;
        VkOnboarding$GraffitiAlignment vkOnboarding$GraffitiAlignment3;
        int i6;
        androidx.compose.runtime.a M = aVar.M(-1797769795);
        if ((i & 6) == 0) {
            i4 = (M.J(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= M.J(f7v0Var) ? 32 : 16;
        }
        int i7 = i4 | 384;
        if ((i & 3072) == 0) {
            i7 |= (i & 4096) == 0 ? M.J(g7v0Var) : M.y(g7v0Var) ? 2048 : 1024;
        }
        int i8 = i3 & 16;
        if (i8 != 0) {
            i7 |= 24576;
        } else if ((i & 24576) == 0) {
            i7 |= M.o(vkOnboarding$GraffitiAlignment == null ? -1 : vkOnboarding$GraffitiAlignment.ordinal()) ? 16384 : 8192;
        }
        int i9 = i3 & 32;
        if (i9 != 0) {
            i7 |= 196608;
        } else if ((i & 196608) == 0) {
            i7 |= M.o(vkOnboarding$TintColor == null ? -1 : vkOnboarding$TintColor.ordinal()) ? 131072 : 65536;
        }
        int i10 = i3 & 64;
        if (i10 != 0) {
            i7 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i7 |= M.o(vkOnboarding$HighlighterMarkerType != null ? vkOnboarding$HighlighterMarkerType.ordinal() : -1) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i11 = i3 & 128;
        if (i11 != 0) {
            i7 |= 12582912;
            l5gVar2 = l5gVar;
        } else {
            l5gVar2 = l5gVar;
            if ((i & 12582912) == 0) {
                i7 |= M.J(l5gVar2) ? 8388608 : 4194304;
            }
        }
        if ((i & 100663296) == 0) {
            c = 2;
            i7 |= M.y(gzsVar) ? 67108864 : 33554432;
        } else {
            c = 2;
        }
        if ((i & 805306368) == 0) {
            i7 |= M.y(gzsVar2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i12 = i2 | 6;
        int i13 = i3 & 2048;
        if (i13 != 0) {
            i12 = i2 | 54;
            i5 = i13;
        } else if ((i2 & 48) == 0) {
            i5 = i13;
            i12 |= M.n(f) ? 32 : 16;
        } else {
            i5 = i13;
        }
        int i14 = i12;
        int i15 = i3 & 4096;
        if (i15 != 0) {
            i14 |= 384;
        } else if ((i2 & 384) == 0) {
            i14 |= M.J(vkOnboardingStat$Delegate) ? 256 : 128;
            if (M.t(i7 & 1, (i7 & 306783379) == 306783378 || (i14 & 147) != 146)) {
                M.h();
                q630Var2 = q630Var;
                vkOnboarding$GraffitiAlignment2 = vkOnboarding$GraffitiAlignment;
                vkOnboarding$HighlighterMarkerType2 = vkOnboarding$HighlighterMarkerType;
                f2 = f;
                vkOnboardingStat$Delegate2 = vkOnboardingStat$Delegate;
                l5gVar3 = l5gVar2;
                vkOnboarding$TintColor2 = vkOnboarding$TintColor;
            } else {
                VkOnboarding$GraffitiAlignment vkOnboarding$GraffitiAlignment4 = i8 != 0 ? VkOnboarding$GraffitiAlignment.Start : vkOnboarding$GraffitiAlignment;
                VkOnboarding$TintColor vkOnboarding$TintColor5 = i9 != 0 ? VkOnboarding$TintColor.Lime : vkOnboarding$TintColor;
                if (i10 != 0) {
                    vkOnboarding$TintColor3 = vkOnboarding$TintColor5;
                    vkOnboarding$HighlighterMarkerType3 = VkOnboarding$HighlighterMarkerType.Type4;
                } else {
                    vkOnboarding$TintColor3 = vkOnboarding$TintColor5;
                    vkOnboarding$HighlighterMarkerType3 = vkOnboarding$HighlighterMarkerType;
                }
                if (i11 != 0) {
                    vkOnboarding$TintColor4 = vkOnboarding$TintColor3;
                    l5gVar4 = null;
                } else {
                    l5g l5gVar5 = l5gVar2;
                    vkOnboarding$TintColor4 = vkOnboarding$TintColor3;
                    l5gVar4 = l5gVar5;
                }
                float f3 = i5 != 0 ? 24 : f;
                VkOnboarding$TintColor vkOnboarding$TintColor6 = vkOnboarding$TintColor4;
                VkOnboardingStat$Delegate vkOnboardingStat$Delegate3 = i15 != 0 ? null : vkOnboardingStat$Delegate;
                if (androidx.compose.runtime.b.d()) {
                    i6 = 0;
                    vkOnboarding$GraffitiAlignment3 = vkOnboarding$GraffitiAlignment4;
                    androidx.compose.runtime.b.f(-1797769795, i7, i14, "com.vk.core.tool.compose.onboarding.VkOnboardingBanner (VkOnboardingBanner.kt:68)");
                } else {
                    vkOnboarding$GraffitiAlignment3 = vkOnboarding$GraffitiAlignment4;
                    i6 = 0;
                }
                int i16 = (i14 & 896) == 256 ? 1 : i6;
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (i16 != 0 || x == c0012a) {
                    x = new n7b0(vkOnboardingStat$Delegate3, 29);
                    M.R(x);
                }
                q630.a aVar2 = q630.a.a;
                q630 f4 = bu00.f(aVar2, (izs) x);
                int i17 = i14;
                jai c2 = kai.c(17003228, new fc1(6, f7v0Var, vkOnboardingStat$Delegate3), M);
                VkOnboarding$GraffitiAlignment vkOnboarding$GraffitiAlignment5 = vkOnboarding$GraffitiAlignment3;
                float f5 = f3;
                jai c3 = kai.c(-642062853, new gkk(str, f7v0Var, vkOnboarding$TintColor6, vkOnboarding$HighlighterMarkerType3, l5gVar4, vkOnboardingStat$Delegate3, gzsVar, gzsVar2), M);
                jai c4 = kai.c(-1301128934, new nz1(11, g7v0Var, vkOnboarding$TintColor6), M);
                wzs[] wzsVarArr = new wzs[3];
                wzsVarArr[i6] = c2;
                wzsVarArr[1] = c3;
                wzsVarArr[c] = c4;
                List l = e43.l(wzsVarArr);
                int i18 = ((i7 & 57344) == 16384 ? 1 : i6) | ((i17 & 112) != 32 ? i6 : 1);
                Object x2 = M.x();
                if (i18 != 0 || x2 == c0012a) {
                    x2 = new n7v0(vkOnboarding$GraffitiAlignment5, f5);
                    M.R(x2);
                }
                b540 b540Var = (b540) x2;
                jai b = joy.b(l);
                boolean J = M.J(b540Var);
                Object x3 = M.x();
                if (J || x3 == c0012a) {
                    x3 = new c540(b540Var);
                    M.R(x3);
                }
                cp10 cp10Var = (cp10) x3;
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c5 = qri.c(M, f4);
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
                k9q0.w(M, cp10Var, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c5, cri.a.d);
                if (er.f(i6, M, b)) {
                    androidx.compose.runtime.b.e();
                }
                vkOnboarding$HighlighterMarkerType2 = vkOnboarding$HighlighterMarkerType3;
                l5gVar3 = l5gVar4;
                vkOnboardingStat$Delegate2 = vkOnboardingStat$Delegate3;
                vkOnboarding$GraffitiAlignment2 = vkOnboarding$GraffitiAlignment5;
                f2 = f5;
                vkOnboarding$TintColor2 = vkOnboarding$TintColor6;
                q630Var2 = aVar2;
            }
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.k7v0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int I = ne7.I(i | 1);
                        int I2 = ne7.I(i2);
                        o7v0.c(str, f7v0Var, q630Var2, g7v0Var, vkOnboarding$GraffitiAlignment2, vkOnboarding$TintColor2, vkOnboarding$HighlighterMarkerType2, l5gVar3, gzsVar, gzsVar2, f2, vkOnboardingStat$Delegate2, (androidx.compose.runtime.a) obj, I, I2, i3);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        if (M.t(i7 & 1, (i7 & 306783379) == 306783378 || (i14 & 147) != 146)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final String str, q630 q630Var, VkOnboarding$TintColor vkOnboarding$TintColor, final VkOnboarding$HighlighterMarkerType vkOnboarding$HighlighterMarkerType, l5g l5gVar, final gzs gzsVar, VkOnboardingStat$Delegate vkOnboardingStat$Delegate, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        int i5;
        int i6;
        int i7;
        VkOnboardingStat$Delegate vkOnboardingStat$Delegate2;
        androidx.compose.runtime.a aVar2;
        final VkOnboarding$TintColor vkOnboarding$TintColor2;
        final l5g l5gVar2;
        final VkOnboardingStat$Delegate vkOnboardingStat$Delegate3;
        final q630 q630Var3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-1837529770);
        if ((i & 6) == 0) {
            i3 = (M.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= M.o(vkOnboarding$TintColor == null ? -1 : vkOnboarding$TintColor.ordinal()) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= M.o(vkOnboarding$HighlighterMarkerType == null ? -1 : vkOnboarding$HighlighterMarkerType.ordinal()) ? 2048 : 1024;
            }
            i5 = i2 & 16;
            if (i5 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= M.J(l5gVar) ? 16384 : 8192;
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    i3 |= M.y(null) ? 131072 : 65536;
                }
                if ((1572864 & i) == 0) {
                    i3 |= M.y(gzsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                }
                i6 = 12582912 | i3;
                i7 = i2 & 256;
                if (i7 != 0) {
                    i6 = 113246208 | i3;
                } else if ((100663296 & i) == 0) {
                    vkOnboardingStat$Delegate2 = vkOnboardingStat$Delegate;
                    i6 |= M.J(vkOnboardingStat$Delegate2) ? 67108864 : 33554432;
                    if (M.t(i6 & 1, (i6 & 38347923) == 38347922)) {
                        aVar2 = M;
                        aVar2.h();
                        vkOnboarding$TintColor2 = vkOnboarding$TintColor;
                        l5gVar2 = l5gVar;
                        vkOnboardingStat$Delegate3 = vkOnboardingStat$Delegate2;
                        q630Var3 = q630Var2;
                    } else {
                        q630 q630Var4 = i8 != 0 ? q630.a.a : q630Var2;
                        VkOnboarding$TintColor vkOnboarding$TintColor3 = i4 != 0 ? VkOnboarding$TintColor.Lime : vkOnboarding$TintColor;
                        l5g l5gVar3 = i5 != 0 ? null : l5gVar;
                        VkOnboardingStat$Delegate vkOnboardingStat$Delegate4 = i7 != 0 ? null : vkOnboardingStat$Delegate2;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1837529770, i6, -1, "com.vk.core.tool.compose.onboarding.VkOnboardingBanner (VkOnboardingBanner.kt:143)");
                        }
                        int i9 = 234881024 & i6;
                        boolean z = i9 == 67108864;
                        Object x = M.x();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (z || x == c0012a) {
                            x = new c3k0(vkOnboardingStat$Delegate4, 17);
                            M.R(x);
                        }
                        q630 f = bu00.f(q630Var4, (izs) x);
                        boolean z2 = (i9 == 67108864) | ((i6 & 458752) == 131072);
                        Object x2 = M.x();
                        if (z2 || x2 == c0012a) {
                            x2 = new kg(28, vkOnboardingStat$Delegate4, null);
                            M.R(x2);
                        }
                        gzs gzsVar2 = (gzs) x2;
                        boolean z3 = (i9 == 67108864) | ((3670016 & i6) == 1048576);
                        Object x3 = M.x();
                        if (z3 || x3 == c0012a) {
                            x3 = new yk(15, vkOnboardingStat$Delegate4, gzsVar);
                            M.R(x3);
                        }
                        aVar2 = M;
                        a(str, null, vkOnboarding$TintColor3, vkOnboarding$HighlighterMarkerType, l5gVar3, vkOnboardingStat$Delegate4, f, gzsVar2, (gzs) x3, aVar2, (i6 & 14) | 48 | (i6 & 896) | (i6 & 7168) | (57344 & i6) | ((i6 >> 9) & 458752) | (1879048192 & (i6 << 6)));
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630Var3 = q630Var4;
                        vkOnboarding$TintColor2 = vkOnboarding$TintColor3;
                        l5gVar2 = l5gVar3;
                        vkOnboardingStat$Delegate3 = vkOnboardingStat$Delegate4;
                    }
                    s = aVar2.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.j7v0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                o7v0.d(str, q630Var3, vkOnboarding$TintColor2, vkOnboarding$HighlighterMarkerType, l5gVar2, gzsVar, vkOnboardingStat$Delegate3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                vkOnboardingStat$Delegate2 = vkOnboardingStat$Delegate;
                if (M.t(i6 & 1, (i6 & 38347923) == 38347922)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
            if ((i2 & 32) != 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i6 = 12582912 | i3;
            i7 = i2 & 256;
            if (i7 != 0) {
            }
            vkOnboardingStat$Delegate2 = vkOnboardingStat$Delegate;
            if (M.t(i6 & 1, (i6 & 38347923) == 38347922)) {
            }
            s = aVar2.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i & 3072) == 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i6 = 12582912 | i3;
        i7 = i2 & 256;
        if (i7 != 0) {
        }
        vkOnboardingStat$Delegate2 = vkOnboardingStat$Delegate;
        if (M.t(i6 & 1, (i6 & 38347923) == 38347922)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}
