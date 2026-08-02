package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;

/* compiled from: DefaultNameSlotImpl.kt */
/* loaded from: classes5.dex */
public final class njl implements e95 {
    public static final float f = 24;
    public static final float g = 40;
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final uog0 e = vog0.b(12);

    /* compiled from: DefaultNameSlotImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuthorHeaderConfig.Header.Main.Name.Default.Verification.values().length];
            try {
                iArr[AuthorHeaderConfig.Header.Main.Name.Default.Verification.Verified.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AuthorHeaderConfig.Header.Main.Name.Default.Verification.VkKindness.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AuthorHeaderConfig.Header.Main.Name.Default.Verification.Confirmed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AuthorHeaderConfig.Header.Main.Name.Default.Verification.ConfirmedBusiness.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AuthorHeaderConfig.Header.Main.Name.Default.Verification.NcoOrganization.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AuthorHeaderConfig.Header.Main.Name.Default.Verification.Government.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AuthorHeaderConfig.Header.Main.Name.Default.Verification.PremiumBusiness.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public njl(AuthorHeaderConfig.Header.Main.Name.Default r1, AuthorHeaderConfig.Header.Main.a aVar, boolean z, String str) {
        this.a = androidx.compose.runtime.k.b(r1);
        this.b = androidx.compose.runtime.k.b(aVar);
        this.c = androidx.compose.runtime.k.b(str);
        this.d = androidx.compose.runtime.k.b(Boolean.valueOf(z));
    }

    public static frv0 i(String str, boolean z, androidx.compose.runtime.a aVar, int i) {
        frv0 frv0Var;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1240083, i, -1, "com.vk.profile.design.compose.header.header.DefaultNameSlotImpl.resolveTextStyle (DefaultNameSlotImpl.kt:271)");
        }
        if (str.length() <= 30 || !z) {
            aVar.K(-1191711469);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0Var = wuv0Var.u;
            aVar.j();
        } else {
            aVar.K(-1191712941);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var2 = (wuv0) aVar.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0Var = wuv0Var2.z;
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return frv0Var;
    }

    @Override // xsna.e95
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1665128975);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1665128975, i2, -1, "com.vk.profile.design.compose.header.header.DefaultNameSlotImpl.Content (DefaultNameSlotImpl.kt:73)");
            }
            ua8.a(q630.a.a, null, false, kai.c(154813639, new hjl((String) ((zak0) this.c).getValue(), xjo0.a(0, 1, M), this, i(h().a, ((Boolean) ((zak0) this.d).getValue()).booleanValue(), M, (i2 << 3) & 896).a, 0), M), M, 3078, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new dd4(this, i, 2);
        }
    }

    public final void b(final String str, final String str2, final String str3, final boolean z, final AuthorHeaderConfig.Header.Main.Name.Default.Verification verification, q630 q630Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1601125896);
        int i4 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.J(str3) ? 256 : 128) | (M.l(z) ? 2048 : 1024) | (M.o(verification == null ? -1 : verification.ordinal()) ? 16384 : 8192);
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 = i4 | 196608;
        } else {
            i3 = i4 | (M.J(q630Var) ? 131072 : 65536);
        }
        int i6 = i3 | (M.J(this) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i6 & 1, (599187 & i6) != 599186)) {
            q630 q630Var3 = i5 != 0 ? q630.a.a : q630Var;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1601125896, i6, -1, "com.vk.profile.design.compose.header.header.DefaultNameSlotImpl.AuthorName (DefaultNameSlotImpl.kt:193)");
            }
            final wjo0 a2 = xjo0.a(0, 1, M);
            int i7 = i6 & 14;
            final frv0 i8 = i(str, z, M, ((i6 >> 12) & 896) | ((i6 >> 6) & 112) | i7);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            final long j = ylu0Var.getText().d;
            azl azlVar = (azl) M.r(uvi.h);
            boolean z2 = str2 != null;
            boolean z3 = verification != null;
            float I0 = azlVar.I0(f);
            float f2 = z3 ? I0 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 0.0f;
            if (z2) {
                f2 += I0;
            }
            if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f2 = azlVar.I0(8) + f2;
            }
            final float f3 = f2;
            q630 E = ahn.E(q630Var3, "author_header_title");
            boolean z4 = i7 == 4;
            Object x = M.x();
            if (z4 || x == a.C0011a.a) {
                x = new jjl(str, 0);
                M.R(x);
            }
            aVar2 = M;
            ua8.a(egi0.b(E, true, (izs) x), null, false, kai.c(1054852834, new yzs() { // from class: xsna.kjl
                /* JADX WARN: Code restructure failed: missing block: B:37:0x01da, code lost:
                
                    if (r7 >= (r1 - r7)) goto L46;
                 */
                @Override // xsna.yzs
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    va8 va8Var;
                    frv0 frv0Var;
                    ljo0 ljo0Var;
                    String str4;
                    long j2;
                    cri.a.d dVar;
                    int i9;
                    cri.a.e eVar;
                    cri.a.C2678a c2678a;
                    cri.a.b bVar;
                    q630.a aVar3;
                    LayoutNode.a aVar4;
                    androidx.compose.runtime.a aVar5;
                    float f4;
                    boolean z5;
                    kjl kjlVar;
                    va8 va8Var2 = (va8) obj;
                    androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar6.J(va8Var2) ? 4 : 2;
                    }
                    if (aVar6.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1054852834, intValue, -1, "com.vk.profile.design.compose.header.header.DefaultNameSlotImpl.AuthorName.<anonymous> (DefaultNameSlotImpl.kt:212)");
                        }
                        frv0 frv0Var2 = i8;
                        nmo0 nmo0Var = frv0Var2.a;
                        long b = s6j.b(0, o6j.i(va8Var2.f()), 0, 0, 13);
                        wjo0 wjo0Var = wjo0.this;
                        String str5 = str;
                        ljo0 a3 = wjo0.a(wjo0Var, str5, nmo0Var, 2, b, 972);
                        m540 m540Var = a3.b;
                        int i10 = m540Var.f - 1;
                        int f5 = m540Var.f(Math.min(1, i10));
                        a.m mVar = androidx.compose.foundation.layout.a.c;
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a4 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar6, 0);
                        int hashCode = Long.hashCode(n34.n(aVar6));
                        sy90 D = aVar6.D();
                        q630.a aVar7 = q630.a.a;
                        q630 c = qri.c(aVar6, aVar7);
                        cri.h7.getClass();
                        LayoutNode.a aVar8 = cri.a.b;
                        if (aVar6.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar6.H();
                        if (aVar6.L()) {
                            aVar6.I(aVar8);
                        } else {
                            aVar6.f();
                        }
                        cri.a.c cVar = cri.a.f;
                        k9q0.w(aVar6, a4, cVar);
                        cri.a.e eVar2 = cri.a.e;
                        k9q0.w(aVar6, D, eVar2);
                        Integer valueOf = Integer.valueOf(hashCode);
                        cri.a.b bVar2 = cri.a.g;
                        k9q0.w(aVar6, valueOf, bVar2);
                        cri.a.C2678a c2678a2 = cri.a.h;
                        k9q0.t(aVar6, c2678a2);
                        cri.a.d dVar2 = cri.a.d;
                        k9q0.w(aVar6, c, dVar2);
                        long j3 = j;
                        if (f5 != 0) {
                            va8Var = va8Var2;
                            aVar6.K(-1591198173);
                            frv0Var = frv0Var2;
                            j2 = j3;
                            i9 = f5;
                            aVar4 = aVar8;
                            ljo0Var = a3;
                            dVar = dVar2;
                            eVar = eVar2;
                            c2678a = c2678a2;
                            bVar = bVar2;
                            aVar3 = aVar7;
                            str4 = str5;
                            z5 = true;
                            f4 = 1.0f;
                            yqv0.c(str5.substring(0, f5), txj0.f(aVar7, 1.0f), j2, null, null, 0, 0, null, 0, false, 0, i10, null, frv0Var, aVar6, 48, 0, 6136);
                            aVar5 = aVar6;
                        } else {
                            va8Var = va8Var2;
                            frv0Var = frv0Var2;
                            ljo0Var = a3;
                            str4 = str5;
                            j2 = j3;
                            dVar = dVar2;
                            i9 = f5;
                            eVar = eVar2;
                            c2678a = c2678a2;
                            bVar = bVar2;
                            aVar3 = aVar7;
                            aVar4 = aVar8;
                            aVar5 = aVar6;
                            f4 = 1.0f;
                            z5 = true;
                            aVar5.K(-1600258698);
                        }
                        aVar5.j();
                        q630 f6 = txj0.f(aVar3, f4);
                        androidx.compose.foundation.layout.k a5 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, aVar5, 54);
                        int hashCode2 = Long.hashCode(n34.n(aVar5));
                        sy90 D2 = aVar5.D();
                        q630 c2 = qri.c(aVar5, f6);
                        if (aVar5.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar5.H();
                        if (aVar5.L()) {
                            aVar5.I(aVar4);
                        } else {
                            aVar5.f();
                        }
                        k9q0.w(aVar5, a5, cVar);
                        k9q0.w(aVar5, D2, eVar);
                        ur.d(hashCode2, aVar5, bVar, aVar5, c2678a);
                        k9q0.w(aVar5, c2, dVar);
                        String substring = str4.substring(i9);
                        if (f4 <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            szw.a("invalid weight; must be greater than zero");
                        }
                        boolean z6 = false;
                        xpy xpyVar = new xpy(f4, false);
                        int i11 = o6j.i(va8Var.f());
                        ljo0 ljo0Var2 = ljo0Var;
                        float i12 = ljo0Var2.i(i10) - ljo0Var2.h(i10);
                        if (ljo0Var2.e()) {
                            kjlVar = this;
                        } else {
                            kjlVar = this;
                        }
                        z6 = z5;
                        androidx.compose.runtime.a aVar9 = aVar5;
                        kjl kjlVar2 = kjlVar;
                        yqv0.c(substring, ajq.a(xpyVar, z6), j2, null, null, 0, 0, null, 0, false, 0, 1, null, frv0Var, aVar9, 805306368, 48, 5624);
                        this.c(str2, str3, verification, aVar9, 0);
                        if (kr.f(aVar9)) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar6.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, 3072, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(str, str2, str3, z, verification, q630Var2, i, i2) { // from class: xsna.ljl
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ AuthorHeaderConfig.Header.Main.Name.Default.Verification g;
                public final /* synthetic */ q630 h;
                public final /* synthetic */ int i;

                {
                    this.i = i2;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    njl.this.b(this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I, this.i);
                    return s3q0.a;
                }
            };
        }
    }

    public final void c(String str, String str2, AuthorHeaderConfig.Header.Main.Name.Default.Verification verification, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-242811082);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.J(str2) ? 32 : 16) | (M.o(verification == null ? -1 : verification.ordinal()) ? 256 : 128) | (M.J(this) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-242811082, i2, -1, "com.vk.profile.design.compose.header.header.DefaultNameSlotImpl.AuthorNameBadges (DefaultNameSlotImpl.kt:318)");
            }
            if (str == null && verification == null) {
                M.K(-872076148);
            } else {
                M.K(-859793297);
                float f2 = 4;
                q630 H = s200.H(q630.a.a, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(f2), dt1.a.l, M, 54);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, H);
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
                k9q0.w(M, a2, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                if (str == null) {
                    M.K(-1334968003);
                } else {
                    M.K(-1334968002);
                    d(str, str2, M, (i2 & 112) | ((i2 >> 3) & 896));
                }
                M.j();
                if (verification == null) {
                    M.K(-1334860464);
                } else {
                    M.K(-1334860463);
                    g(verification, M, (i2 >> 6) & 112);
                }
                M.j();
                M.G();
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new y1k(this, str, str2, verification, i, 1);
        }
    }

    public final void d(String str, String str2, androidx.compose.runtime.a aVar, int i) {
        lg90 l;
        String O;
        androidx.compose.runtime.a M = aVar.M(-530970206);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.J(str2) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-530970206, i2, -1, "com.vk.profile.design.compose.header.header.DefaultNameSlotImpl.ImageStatus (DefaultNameSlotImpl.kt:340)");
            }
            boolean booleanValue = ((Boolean) M.r(c5x.a)).booleanValue();
            izs izsVar = (izs) M.r(h85.a);
            q630 d = rte0.d(txj0.q(q630.a.a, 24), this.e);
            boolean J = M.J(izsVar) | ((i2 & 14) == 4);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new y4(7, izsVar, str);
                M.R(x);
            }
            q630 c = ojc.c(d, false, null, null, (gzs) x, 15);
            if (booleanValue) {
                l = or.b(M, 231655755, R.drawable.vk_icon_illustration_placeholder_kid_llama_ny_h150, M, 0);
            } else {
                M.K(231776469);
                l = fwu0.l(null, str, null, null, M, (i2 << 3) & 112, 61);
                M.j();
            }
            lg90 lg90Var = l;
            long j = l5g.k;
            if (str2 == null) {
                M.K(231942225);
                M.j();
                O = null;
            } else {
                M.K(231942226);
                O = d370.O(R.string.author_header_user_image_status_accessibility, new Object[]{str2}, M);
                M.j();
            }
            pzu0.b(lg90Var, O, c, j, M, 3080, 0);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ijl(i, 0, this, str, str2);
        }
    }

    public final void e(String str, androidx.compose.runtime.a aVar, int i) {
        lg90 b;
        androidx.compose.runtime.a M = aVar.M(-2072506838);
        int i2 = (M.J(str) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2072506838, i2, -1, "com.vk.profile.design.compose.header.header.DefaultNameSlotImpl.MiniAvatar (DefaultNameSlotImpl.kt:138)");
            }
            boolean booleanValue = ((Boolean) M.r(c5x.a)).booleanValue();
            izs izsVar = (izs) M.r(h85.a);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(zhf0.e);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            if (booleanValue) {
                b = or.b(M, -1896018717, R.drawable.vk_icon_illustration_placeholder_kid_llama_ny_h150, M, 0);
            } else if (drm0.N(str)) {
                b = or.b(M, -1895782621, R.drawable.vk_icon_illustration_placeholder_kid_llama_ny_h150, M, 0);
            } else {
                M.K(-1895871467);
                b = fwu0.l(null, str, null, null, M, (i2 << 3) & 112, 61);
                M.j();
            }
            q630 E = ahn.E(q630.a.a, "author_header_mini_avatar");
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new mjl(0, wh50Var);
                M.R(x2);
            }
            q630 o = egi.o(E, (izs) x2);
            phw a2 = phw.a.a(b, null, null, null, null, M, 196616, 30);
            boolean J = M.J(izsVar);
            Object x3 = M.x();
            if (J || x3 == c0012a) {
                x3 = new xy0(9, izsVar, wh50Var);
                M.R(x3);
            }
            ldu0.b(a2, g, o, null, null, false, null, (gzs) x3, null, M, Tensorflow.FRAME_WIDTH, 376);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new og4(this, str, i, 3);
        }
    }

    public final void f(AuthorHeaderConfig.Header.Main.a aVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a aVar3;
        String a2;
        androidx.compose.runtime.a M = aVar2.M(-2055218805);
        int i2 = (M.J(aVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2055218805, i2, -1, "com.vk.profile.design.compose.header.header.DefaultNameSlotImpl.Status (DefaultNameSlotImpl.kt:171)");
            }
            if (aVar instanceof AuthorHeaderConfig.Header.Main.a.b) {
                M.K(619691343);
                M.j();
                ((AuthorHeaderConfig.Header.Main.a.b) aVar).getClass();
                a2 = null;
            } else if (aVar instanceof AuthorHeaderConfig.Header.Main.a.c) {
                a2 = zq.a(M, 619693572, R.string.author_header_user_status_online, M, 0);
            } else {
                if (!(aVar instanceof AuthorHeaderConfig.Header.Main.a.C1654a)) {
                    throw alb0.c(619688907, M);
                }
                a2 = zq.a(M, 619697577, R.string.author_header_user_status_dead_person, M, 0);
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(a2, null, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.i0, M, 0, 0, 8186);
            aVar3 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new x78(this, aVar, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(AuthorHeaderConfig.Header.Main.Name.Default.Verification verification, androidx.compose.runtime.a aVar, int i) {
        int i2;
        Pair pair;
        Pair pair2;
        int i3;
        boolean J;
        Object x;
        androidx.compose.runtime.a M = aVar.M(1566447458);
        if ((i & 6) == 0) {
            i2 = (M.o(verification.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1566447458, i2, -1, "com.vk.profile.design.compose.header.header.DefaultNameSlotImpl.VerifyIcon (DefaultNameSlotImpl.kt:365)");
            }
            izs izsVar = (izs) M.r(h85.a);
            int[] iArr = a.$EnumSwitchMapping$0;
            switch (iArr[verification.ordinal()]) {
                case 1:
                case 2:
                    M.K(2117463542);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2477950, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-LegoVerificationLight24> (VkIcons.kt:6186)");
                    }
                    lg90 a2 = pg90.a(R.drawable.vk_icon_lego_verification_light_24, 0, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pair = new Pair(a2, new l5g(l5g.k));
                    M.j();
                    lg90 lg90Var = (lg90) pair.d();
                    long j = ((l5g) pair.g()).a;
                    switch (iArr[verification.ordinal()]) {
                        case 1:
                            i3 = R.string.author_header_user_verified_icon_talkback;
                            break;
                        case 2:
                            i3 = R.string.author_header_community_vk_kindness_icon_talkback;
                            break;
                        case 3:
                            i3 = R.string.author_header_user_confirmed_icon_talkback;
                            break;
                        case 4:
                            i3 = R.string.author_header_community_confirmed_business_icon_talkback;
                            break;
                        case 5:
                            i3 = R.string.author_header_community_nco_organization_icon_talkback;
                            break;
                        case 6:
                            i3 = R.string.author_header_community_government_icon_talkback;
                            break;
                        case 7:
                            i3 = R.string.author_header_community_premium_business_icon_talkback;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    q630 d = rte0.d(txj0.q(ahn.E(q630.a.a, "author_header_verification_badge"), 24), this.e);
                    J = M.J(izsVar) | ((i2 & 14) == 4);
                    x = M.x();
                    if (!J || x == a.C0011a.a) {
                        x = new gd0(9, izsVar, verification);
                        M.R(x);
                    }
                    pzu0.b(lg90Var, d370.N(i3, 0, M), ojc.c(d, false, null, null, (gzs) x, 15), j, M, 8, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                        break;
                    }
                    break;
                case 3:
                case 4:
                case 5:
                    M.K(2117469284);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1128424798, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-LegoVerificationDark24> (VkIcons.kt:6182)");
                    }
                    lg90 a3 = pg90.a(R.drawable.vk_icon_lego_verification_dark_24, 0, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pair2 = new Pair(a3, new l5g(ylu0Var.getIcon().c));
                    M.j();
                    pair = pair2;
                    lg90 lg90Var2 = (lg90) pair.d();
                    long j2 = ((l5g) pair.g()).a;
                    switch (iArr[verification.ordinal()]) {
                    }
                    q630 d2 = rte0.d(txj0.q(ahn.E(q630.a.a, "author_header_verification_badge"), 24), this.e);
                    J = M.J(izsVar) | ((i2 & 14) == 4);
                    x = M.x();
                    if (!J) {
                        break;
                    }
                    x = new gd0(9, izsVar, verification);
                    M.R(x);
                    pzu0.b(lg90Var2, d370.N(i3, 0, M), ojc.c(d2, false, null, null, (gzs) x, 15), j2, M, 8, 0);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    break;
                case 6:
                    M.K(2117472659);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1166682814, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-Flag16> (VkIcons.kt:2682)");
                    }
                    lg90 b = or.b(M, -1772189332, R.drawable.vk_icon_flag_16, M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pair2 = new Pair(b, new l5g(ylu0Var2.getIcon().j));
                    M.j();
                    pair = pair2;
                    lg90 lg90Var22 = (lg90) pair.d();
                    long j22 = ((l5g) pair.g()).a;
                    switch (iArr[verification.ordinal()]) {
                    }
                    q630 d22 = rte0.d(txj0.q(ahn.E(q630.a.a, "author_header_verification_badge"), 24), this.e);
                    J = M.J(izsVar) | ((i2 & 14) == 4);
                    x = M.x();
                    if (!J) {
                    }
                    x = new gd0(9, izsVar, verification);
                    M.R(x);
                    pzu0.b(lg90Var22, d370.N(i3, 0, M), ojc.c(d22, false, null, null, (gzs) x, 15), j22, M, 8, 0);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    break;
                case 7:
                    M.K(2117475698);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1435971398, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-LegoCrownVerified24> (VkIcons.kt:4662)");
                    }
                    lg90 a4 = pg90.a(R.drawable.vk_icon_lego_crown_verified_24, 0, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pair = new Pair(a4, new l5g(l5g.k));
                    M.j();
                    lg90 lg90Var222 = (lg90) pair.d();
                    long j222 = ((l5g) pair.g()).a;
                    switch (iArr[verification.ordinal()]) {
                    }
                    q630 d222 = rte0.d(txj0.q(ahn.E(q630.a.a, "author_header_verification_badge"), 24), this.e);
                    J = M.J(izsVar) | ((i2 & 14) == 4);
                    x = M.x();
                    if (!J) {
                    }
                    x = new gd0(9, izsVar, verification);
                    M.R(x);
                    pzu0.b(lg90Var222, d370.N(i3, 0, M), ojc.c(d222, false, null, null, (gzs) x, 15), j222, M, 8, 0);
                    if (androidx.compose.runtime.b.d()) {
                    }
                    break;
                default:
                    throw alb0.c(2117460921, M);
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bo7(this, verification, i, 1);
        }
    }

    public final AuthorHeaderConfig.Header.Main.Name.Default h() {
        return (AuthorHeaderConfig.Header.Main.Name.Default) ((zak0) this.a).getValue();
    }
}
