package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.graphics.BlendModeCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.u700;

/* compiled from: AnimatedIcon.kt */
/* loaded from: classes3.dex */
public final class nk2 {
    public static final void a(final String str, final long j, final q630 q630Var, long j2, float f, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        final long j3;
        final float f2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1633837924);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.p(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        int i4 = i2 | 27648;
        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1633837924, i4, -1, "com.vk.music.stickyplayer.presentation.components.AnimatedIcon (AnimatedIcon.kt:361)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b("");
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            t700 c = guf0.c(new u700.f(str), M, 0);
            l800 x2 = qxm0.x(new n800[]{qxm0.y(t800.I, pe7.a(f870.H(j), BlendModeCompat.SRC_ATOP), new String[]{"**"}, M), qxm0.y(t800.j, new b5h0(), new String[]{"**"}, M)}, M);
            float d = 1.0f / b3r0.d((Context) M.r(AndroidCompositionLocals_androidKt.b));
            s600 a = y600.a(M);
            int i5 = i4 & 14;
            boolean J = (i5 == 4) | ((i4 & 7168) == 2048) | M.J(a) | M.J(c) | M.n(d);
            Object x3 = M.x();
            if (J || x3 == c0012a) {
                i3 = i5;
                kk2 kk2Var = new kk2(str, 100L, a, d, wh50Var, c, null);
                M.R(kk2Var);
                x3 = kk2Var;
            } else {
                i3 = i5;
            }
            bap.g(str, (wzs) x3, M, i3);
            i700 i700Var = (i700) c.getValue();
            boolean J2 = M.J(a);
            Object x4 = M.x();
            if (J2 || x4 == c0012a) {
                x4 = new ic(a, 5);
                M.R(x4);
            }
            aVar2 = M;
            z600.a(i700Var, (gzs) x4, q630Var, false, false, false, false, null, false, x2, null, null, false, false, null, null, false, aVar2, (i4 & 896) | 1073741824, 384, 126456);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j3 = 100;
            f2 = 1.0f;
        } else {
            aVar2 = M;
            aVar2.h();
            j3 = j2;
            f2 = f;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ek2
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nk2.a(str, j, q630Var, j3, f2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final long j, final boolean z, final gzs gzsVar, final q630 q630Var, final long j2, final float f, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        t700 t700Var;
        int i2;
        a.C0011a.C0012a c0012a;
        i700 i700Var;
        l800 l800Var;
        Boolean bool;
        androidx.compose.runtime.a M = aVar.M(-1555009690);
        int i3 = i | (M.o(R.raw.add_hearts_60h) ? 4 : 2) | (M.p(j) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192);
        if (M.t(i3 & 1, (599187 & i3) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1555009690, i3, -1, "com.vk.music.stickyplayer.presentation.components.AnimatedIcon (AnimatedIcon.kt:311)");
            }
            t700 c = guf0.c(new u700.e(R.raw.add_hearts_60h), M, 0);
            l800 x = qxm0.x(new n800[]{qxm0.y(t800.I, pe7.a(f870.H(j), BlendModeCompat.SRC_ATOP), new String[]{"**"}, M)}, M);
            float d = f / b3r0.d((Context) M.r(AndroidCompositionLocals_androidKt.b));
            s600 a = y600.a(M);
            i700 i700Var2 = (i700) c.getValue();
            Boolean valueOf = Boolean.valueOf(z);
            boolean J = ((i3 & 896) == 256) | M.J(a) | M.J(c) | M.n(d) | ((i3 & 7168) == 2048);
            Object x2 = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (J || x2 == c0012a2) {
                t700Var = c;
                i2 = i3;
                c0012a = c0012a2;
                i700Var = i700Var2;
                l800Var = x;
                bool = valueOf;
                ik2 ik2Var = new ik2(j2, z, a, d, gzsVar, t700Var, null);
                M.R(ik2Var);
                x2 = ik2Var;
            } else {
                t700Var = c;
                i2 = i3;
                c0012a = c0012a2;
                i700Var = i700Var2;
                l800Var = x;
                bool = valueOf;
            }
            bap.f(i700Var, bool, (wzs) x2, M, (i2 >> 3) & 112);
            i700 i700Var3 = (i700) t700Var.getValue();
            boolean J2 = M.J(a);
            Object x3 = M.x();
            if (J2 || x3 == c0012a) {
                x3 = new j70(a, 2);
                M.R(x3);
            }
            aVar2 = M;
            z600.a(i700Var3, (gzs) x3, q630Var, false, false, false, false, null, false, l800Var, null, null, false, false, null, null, false, aVar2, ((i2 >> 6) & 896) | 1073741824, 0, 130552);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(j, z, gzsVar, q630Var, j2, f, i) { // from class: xsna.dk2
                public final /* synthetic */ long b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ q630 e;
                public final /* synthetic */ long f;
                public final /* synthetic */ float g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1769473);
                    nk2.b(this.b, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final int i, final long j, final q630 q630Var, float f, final boolean z, final gzs gzsVar, final Integer num, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a aVar2;
        final float f2;
        androidx.compose.runtime.a M = aVar.M(-1463744635);
        if ((i2 & 6) == 0) {
            i3 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.p(j) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(q630Var) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            i4 |= M.l(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= M.y(gzsVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= M.J(num) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i4 & 1, (599187 & i4) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1463744635, i4, -1, "com.vk.music.stickyplayer.presentation.components.AnimatedIconButton (AnimatedIcon.kt:122)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.i.a(0);
                M.R(x);
            }
            rg50 rg50Var = (rg50) x;
            plg0 plg0Var = new plg0(0);
            boolean z2 = (i4 & 458752) == 131072;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new xy0(1, gzsVar, rg50Var);
                M.R(x2);
            }
            aVar2 = M;
            jk2.a(i, j, ojc.c(q630Var, z, null, plg0Var, (gzs) x2, 10), 1.0f, Integer.valueOf(rg50Var.getIntValue()), num, false, aVar2, (i4 & 7294) | ((i4 >> 3) & 458752), 64);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            f2 = 1.0f;
        } else {
            aVar2 = M;
            aVar2.h();
            f2 = f;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.zj2
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nk2.c(i, j, q630Var, f2, z, gzsVar, num, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final long j, final boolean z, final q630 q630Var, final boolean z2, final Integer num, float f, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        final float f2;
        String f3;
        float d;
        s600 s600Var;
        String str;
        Object obj;
        if2 if2Var;
        t700 t700Var;
        t700 t700Var2;
        wh50 wh50Var;
        q630 k;
        androidx.compose.runtime.a M = aVar.M(-2063518551);
        int i2 = i | (M.o(R.raw.add_to_done_hearts_60h) ? 4 : 2) | (M.o(R.raw.done_to_add_hearts_50x84) ? 32 : 16) | (M.p(j) ? 256 : 128) | (M.l(z) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192) | (M.l(z2) ? 131072 : 65536) | (M.J(num) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | 12582912;
        if (M.t(i2 & 1, (4793491 & i2) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2063518551, i2, -1, "com.vk.music.stickyplayer.presentation.components.TwoWayAnimatedIcon (AnimatedIcon.kt:152)");
            }
            Object x = M.x();
            Object obj2 = a.C0011a.a;
            if (x == obj2) {
                x = io.reactivex.rxjava3.internal.operators.mixed.j.d(!z, M);
            }
            wh50 wh50Var2 = (wh50) x;
            t700 c = guf0.c(new u700.e(R.raw.add_to_done_hearts_60h), M, 0);
            t700 c2 = guf0.c(new u700.e(R.raw.done_to_add_hearts_50x84), M, 0);
            l800 x2 = qxm0.x(new n800[]{qxm0.y(t800.I, pe7.a(f870.H(j), BlendModeCompat.SRC_ATOP), new String[]{"**"}, M)}, M);
            if (num == null) {
                M.K(-413208583);
                M.j();
                f3 = null;
            } else {
                f3 = l4.f(M, -413208582, num, M, 0);
            }
            if (z2) {
                M.K(-413067470);
                M.j();
                d = Float.POSITIVE_INFINITY;
            } else {
                M.K(-413021900);
                d = 1.0f / b3r0.d((Context) M.r(AndroidCompositionLocals_androidKt.b));
                M.j();
            }
            s600 a = y600.a(M);
            Object x3 = M.x();
            if (x3 == obj2) {
                x3 = qf2.a(1.0f);
                M.R(x3);
            }
            if2 if2Var2 = (if2) x3;
            i700 i700Var = (i700) c.getValue();
            i700 i700Var2 = (i700) c2.getValue();
            Boolean valueOf = Boolean.valueOf(z);
            String str2 = f3;
            boolean J = ((i2 & 7168) == 2048) | M.J(c) | M.J(c2) | M.y(if2Var2) | M.J(a) | M.n(d);
            Object x4 = M.x();
            if (J || x4 == obj2) {
                s600Var = a;
                str = str2;
                obj = obj2;
                lk2 lk2Var = new lk2(z, if2Var2, s600Var, d, wh50Var2, c, c2, null);
                if2Var = if2Var2;
                t700Var = c;
                t700Var2 = c2;
                wh50Var = wh50Var2;
                M.R(lk2Var);
                x4 = lk2Var;
            } else {
                str = str2;
                t700Var2 = c2;
                obj = obj2;
                s600Var = a;
                if2Var = if2Var2;
                t700Var = c;
                wh50Var = wh50Var2;
            }
            s600 s600Var2 = s600Var;
            aVar2 = M;
            bap.e(i700Var, i700Var2, valueOf, (wzs) x4, aVar2, (i2 >> 3) & 896);
            if (((Boolean) wh50Var.getValue()).booleanValue()) {
                k = q630Var;
            } else {
                float f4 = 84;
                k = txj0.k(txj0.p(q630.a.a, f4), f4);
            }
            q630 c3 = rdu.c(k, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Number) if2Var.d()).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 524283);
            boolean J2 = aVar2.J(str);
            Object x5 = aVar2.x();
            if (J2 || x5 == obj) {
                x5 = new wj2(str, 0);
                aVar2.R(x5);
            }
            q630 b = egi0.b(c3, false, (izs) x5);
            i700 i700Var3 = ((Boolean) wh50Var.getValue()).booleanValue() ? (i700) t700Var.getValue() : (i700) t700Var2.getValue();
            boolean J3 = aVar2.J(s600Var2);
            Object x6 = aVar2.x();
            if (J3 || x6 == obj) {
                x6 = new ac(s600Var2, 6);
                aVar2.R(x6);
            }
            z600.a(i700Var3, (gzs) x6, b, false, false, false, false, null, false, x2, null, null, false, false, null, null, false, aVar2, 1073741824, 0, 130552);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            f2 = 1.0f;
        } else {
            aVar2 = M;
            aVar2.h();
            f2 = f;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(j, z, q630Var, z2, num, f2, i) { // from class: xsna.bk2
                public final /* synthetic */ long b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ Integer f;
                public final /* synthetic */ float g;

                @Override // xsna.wzs
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int I = ne7.I(1);
                    nk2.d(this.b, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj3, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(final int i, final boolean z, final lg90 lg90Var, final boolean z2, long j, float f, final izs izsVar, androidx.compose.runtime.a aVar, final int i2) {
        final long j2;
        androidx.compose.runtime.a aVar2;
        final float f2;
        String str;
        long j3;
        int i3;
        float f3;
        float d;
        Boolean bool;
        a.C0011a.C0012a c0012a;
        long j4;
        s600 s600Var;
        String str2;
        wh50 wh50Var;
        i700 i700Var;
        int i4;
        long j5;
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar.M(-347205764);
        int i5 = i2 | (M.o(R.raw.heart_add_to_collection_reaction) ? 4 : 2) | (M.o(R.raw.heart_remove_collection_reaction) ? 32 : 16) | (M.o(i) ? 256 : 128) | (M.l(z) ? 2048 : 1024) | (M.y(lg90Var) ? 16384 : 8192) | (M.l(z2) ? 131072 : 65536) | C.DEFAULT_VIDEO_BUFFER_SIZE;
        if (M.t(i5 & 1, (38347923 & i5) != 38347922)) {
            M.V();
            float f4 = 1.0f;
            if ((i2 & 1) == 0 || M.i()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                j3 = ylu0Var.getBackground().m;
                i3 = i5 & (-3670017);
                f3 = 1.0f;
            } else {
                M.h();
                i3 = i5 & (-3670017);
                f3 = f;
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                j3 = j;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-347205764, i3, -1, "com.vk.music.stickyplayer.presentation.components.TwoWayStaticToAnimationIcon (AnimatedIcon.kt:231)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                x = io.reactivex.rxjava3.internal.operators.mixed.j.d(z, M);
            }
            wh50 wh50Var2 = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a2) {
                x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x2);
            }
            wh50 wh50Var3 = (wh50) x2;
            i700 i700Var2 = z ? (i700) guf0.c(new u700.e(R.raw.heart_add_to_collection_reaction), M, 0).getValue() : (i700) guf0.c(new u700.e(R.raw.heart_remove_collection_reaction), M, 0).getValue();
            if (z2) {
                M.K(814348595);
                M.j();
                d = Float.POSITIVE_INFINITY;
            } else {
                M.K(1342740337);
                d = f3 / b3r0.d((Context) M.r(AndroidCompositionLocals_androidKt.b));
                M.j();
            }
            s600 a = y600.a(M);
            Boolean valueOf = Boolean.valueOf(z);
            Boolean valueOf2 = Boolean.valueOf(z2);
            boolean J = ((i3 & 7168) == 2048) | M.J(a) | M.y(i700Var2) | M.n(d) | ((458752 & i3) == 131072);
            Object x3 = M.x();
            if (J || x3 == c0012a2) {
                bool = valueOf2;
                float f5 = d;
                c0012a = c0012a2;
                j4 = j3;
                s600Var = a;
                str2 = str;
                wh50Var = wh50Var3;
                i700Var = i700Var2;
                i4 = i3;
                mk2 mk2Var = new mk2(z, izsVar, s600Var, i700Var, f5, z2, wh50Var2, wh50Var, null);
                M.R(mk2Var);
                x3 = mk2Var;
            } else {
                c0012a = c0012a2;
                j4 = j3;
                bool = valueOf2;
                s600Var = a;
                str2 = str;
                wh50Var = wh50Var3;
                i700Var = i700Var2;
                i4 = i3;
            }
            int i6 = i4 >> 12;
            bap.f(valueOf, bool, (wzs) x3, M, ((i4 >> 9) & 14) | (i6 & 112));
            boolean z3 = z || ((Boolean) wh50Var.getValue()).booleanValue();
            if (((Boolean) wh50Var.getValue()).booleanValue()) {
                f4 = s600Var.getProgress();
            } else if (!z) {
                f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            float f6 = f4;
            String N = d370.N(i, (i4 >> 6) & 14, M);
            M.K(1342777824);
            q630.a aVar4 = q630.a.a;
            q630 q = txj0.q(aVar4, 44);
            boolean J2 = M.J(N);
            Object x4 = M.x();
            if (J2 || x4 == c0012a) {
                x4 = new fk2(N);
                M.R(x4);
            }
            q630 b = egi0.b(q, false, (izs) x4);
            long j6 = j4;
            if (!((Boolean) wh50Var.getValue()).booleanValue()) {
                boolean p = M.p(j6);
                Object x5 = M.x();
                if (p || x5 == c0012a) {
                    x5 = new gk2(j6, 0);
                    M.R(x5);
                }
                b = b.g(bu00.e(aVar4, (izs) x5));
            }
            M.j();
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            ra8 ra8Var = ra8.a;
            if (z3) {
                M.K(-1494272786);
                float f7 = Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE;
                q630 b2 = ra8Var.b(txj0.k(txj0.p(aVar4, f7), f7), dt1.a.f);
                boolean n = M.n(f6);
                Object x6 = M.x();
                if (n || x6 == c0012a) {
                    x6 = new a8o(f6);
                    M.R(x6);
                }
                j5 = j6;
                z600.a(i700Var, (gzs) x6, b2, false, false, false, false, null, false, null, null, null, false, false, null, null, false, M, 0, 0, 131064);
                aVar3 = M;
                aVar3.j();
            } else {
                j5 = j6;
                aVar3 = M;
                aVar3.K(-1493963654);
                q630 b3 = ra8Var.b(txj0.q(aVar4, 28), dt1.a.f);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, str2);
                }
                ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                pzu0.b(lg90Var, null, b3, ylu0Var2.getIcon().c, aVar3, 56 | (i6 & 14), 0);
                aVar3.j();
            }
            aVar3.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = aVar3;
            f2 = f3;
            j2 = j5;
        } else {
            M.h();
            j2 = j;
            aVar2 = M;
            f2 = f;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(i, z, lg90Var, z2, j2, f2, izsVar, i2) { // from class: xsna.hk2
                public final /* synthetic */ int b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ lg90 d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ long f;
                public final /* synthetic */ float g;
                public final /* synthetic */ izs h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(100696065);
                    nk2.e(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
