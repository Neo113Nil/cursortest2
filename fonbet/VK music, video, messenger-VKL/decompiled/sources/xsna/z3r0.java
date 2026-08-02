package xsna;

import android.content.Context;
import android.graphics.Paint;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.Thumb;
import kotlin.Pair;
import xsna.chs;
import xsna.q630;
import xsna.us2;
import xsna.zw3;

/* compiled from: Utils.kt */
/* loaded from: classes3.dex */
public final class z3r0 {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-851828801);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-851828801, i2, -1, "com.vk.music.stickyplayer.presentation.components.ExplicitSmallIcon (Utils.kt:75)");
            }
            q630.a aVar2 = q630.a.a;
            q630 E = ahn.E(s200.H(aVar2, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), "explicitSmallIcon");
            qzu0.a.getClass();
            pzu0.b(qzu0.N(M), null, E, l5g.k, M, 3128, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new oxs(q630Var, i, 1);
        }
    }

    public static final void b(final q630 q630Var, final boolean z, androidx.compose.runtime.a aVar, final int i, final int i2) {
        lg90 P;
        androidx.compose.runtime.a M = aVar.M(1996943982);
        int i3 = i | 6;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 = i | 54;
        } else if ((i & 48) == 0) {
            i3 |= M.l(z) ? 32 : 16;
        }
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                z = false;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1996943982, i3, -1, "com.vk.music.stickyplayer.presentation.components.ExplicitTransparentIcon (Utils.kt:87)");
            }
            q630.a aVar2 = q630.a.a;
            q630 H = s200.H(aVar2, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            if (z) {
                M.K(1366365884);
                qzu0.a.getClass();
                P = qzu0.O(M);
                M.j();
            } else {
                M.K(1366427388);
                qzu0.a.getClass();
                P = qzu0.P(M);
                M.j();
            }
            pzu0.b(P, null, H, l5g.k, M, 3128, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.p3r0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    z3r0.b(q630Var, z, (androidx.compose.runtime.a) obj, I, i2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final efj c(String str, wzs wzsVar, yzs yzsVar, androidx.compose.runtime.a aVar) {
        efj efjVar;
        i60 i60Var = new i60(12);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(94116330, 0, -1, "com.vk.music.stickyplayer.presentation.components.coverContent (Utils.kt:126)");
        }
        Pair m = fwu0.m(null, str, null, null, null, null, aVar, 0, 125);
        chs chsVar = (chs) m.d();
        lg90 lg90Var = (lg90) m.g();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1330194644, 0, -1, "com.vk.core.compose.image.asset.rememberAssetPainter (rememberAssetPainter.kt:16)");
        }
        Context context = (Context) aVar.r(AndroidCompositionLocals_androidKt.b);
        zw3.c cVar = zw3.c.a;
        boolean J = aVar.J(str) | aVar.y(context);
        Object x = aVar.x();
        Object obj = a.C0011a.a;
        if (J || x == obj) {
            x = new utf0(context, str, null);
            aVar.R(x);
        }
        wzs wzsVar2 = (wzs) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1928268701, 6, -1, "androidx.compose.runtime.produceState (ProduceState.kt:107)");
        }
        Object x2 = aVar.x();
        if (x2 == obj) {
            x2 = androidx.compose.runtime.k.b(cVar);
            aVar.R(x2);
        }
        wh50 wh50Var = (wh50) x2;
        boolean y = aVar.y(wzsVar2);
        Object x3 = aVar.x();
        if (y || x3 == obj) {
            x3 = new dbk0(wzsVar2, wh50Var, null);
            aVar.R(x3);
        }
        bap.g(str, (wzs) x3, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        zw3 zw3Var = (zw3) wh50Var.getValue();
        if (epx.f(zw3Var, cVar)) {
            aVar.K(251496474);
            efjVar = (efj) i60Var.invoke(aVar, 0);
            aVar.j();
        } else if (zw3Var instanceof zw3.b) {
            aVar.K(251498279);
            efjVar = (efj) yzsVar.invoke(((zw3.b) zw3Var).a, aVar, 8);
            aVar.j();
        } else {
            if (!(zw3Var instanceof zw3.a)) {
                throw alb0.c(251494590, aVar);
            }
            aVar.K(-793415091);
            if (chsVar instanceof chs.c) {
                aVar.K(251502714);
                efjVar = (efj) i60Var.invoke(aVar, 0);
                aVar.j();
            } else if (chsVar instanceof chs.b) {
                aVar.K(251504568);
                efjVar = (efj) wzsVar.invoke(aVar, 0);
                aVar.j();
            } else {
                aVar.K(251505703);
                efjVar = (efj) yzsVar.invoke(lg90Var, aVar, 8);
                aVar.j();
            }
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return efjVar;
    }

    public static final gzs d(int i, int i2, androidx.compose.runtime.a aVar, gzs gzsVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1568559081, i, -1, "com.vk.music.stickyplayer.presentation.components.debouncedClick (Utils.kt:52)");
        }
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (x == c0012a) {
            x = androidx.compose.runtime.k.b(0L);
            aVar.R(x);
        }
        wh50 wh50Var = (wh50) x;
        boolean z = ((((i & 14) ^ 6) > 4 && aVar.p(500L)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && aVar.J(gzsVar)) || (i & 48) == 32);
        Object x2 = aVar.x();
        if (z || x2 == c0012a) {
            x2 = new ykl(500L, gzsVar, wh50Var);
            aVar.R(x2);
        }
        gzs gzsVar2 = (gzs) x2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return gzsVar2;
    }

    public static final String e(Object obj, float f, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1174596577, 0, -1, "com.vk.music.stickyplayer.presentation.components.getForSizeOrEmpty (Utils.kt:144)");
        }
        String f2 = f((Thumb) obj, f, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f2;
    }

    public static final String f(Thumb thumb, float f, androidx.compose.runtime.a aVar, int i) {
        String str;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-718142871, i, -1, "com.vk.music.stickyplayer.presentation.components.getForSizeOrEmpty (Utils.kt:148)");
        }
        azl azlVar = (azl) aVar.r(uvi.h);
        if (thumb != null) {
            int I0 = (int) azlVar.I0(f);
            Serializer.c<Thumb> cVar = Thumb.CREATOR;
            str = thumb.Ab(I0, false);
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return str;
    }

    public static final us2 g(String str, String str2, androidx.compose.runtime.a aVar, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1409233712, 0, -1, "com.vk.music.stickyplayer.presentation.components.getTitleAnnotatedString (Utils.kt:105)");
        }
        us2.b b = xga0.b(-1358894807, aVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
        }
        wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        hik0 hik0Var = wuv0Var.g.a.a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        b.h(zs2.a(str, hik0.a(hik0Var, ylu0Var.getText().d, 65534)));
        if (str2 != null) {
            s0x.a(b, str2, "�");
        }
        us2 n = b.n();
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return n;
    }

    public static q630 h(q630 q630Var, final float f, final long j, final uog0 uog0Var, long j2, int i) {
        final float f2 = 0;
        if ((i & 16) != 0) {
            j2 = 0;
        }
        final long j3 = j2;
        return bu00.e(q630Var, new izs() { // from class: xsna.q3r0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                kw8 kw8Var = (kw8) obj;
                float density = kw8Var.getDensity() * f;
                boolean z = density > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                va2 va2Var = new va2();
                long j4 = j;
                va2Var.d(j4);
                Paint paint = va2Var.a;
                paint.setDither(true);
                paint.setAntiAlias(true);
                long j5 = j3;
                if (z) {
                    paint.setShadowLayer(density, kw8Var.getDensity() * rco.a(j5), kw8Var.getDensity() * rco.b(j5), f870.H(j4));
                }
                return kw8Var.c(new qzl0(new r3r0(z, j5, f2, uog0Var.a(kw8Var.b.d(), LayoutDirection.Rtl, kw8Var), va2Var), 12));
            }
        });
    }
}
