package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: D2DOnboardingView.kt */
/* loaded from: classes7.dex */
public final class srk {
    public static final nkk a = new nkk(0.3f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f, 1.0f);
    public static final nkk b = new nkk(0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.7f, 1.0f);
    public static final nkk c = new nkk(0.17f, 0.17f, 0.17f, 1.6f);
    public static final nkk d = new nkk(0.42f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.58f, 1.0f);

    public static final void a(final float f, final gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(245670520);
        int i2 = (M.n(f) ? 4 : 2) | i | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(245670520, i2, -1, "com.vk.video.ui.discovery.minimizable.doc2doc.onboarding.Balloon (D2DOnboardingView.kt:198)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new izs() { // from class: xsna.qrk
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        tdu tduVar = (tdu) obj;
                        tduVar.n(tduVar.I0(f + 48.0f));
                        tduVar.j(-3.0f);
                        return s3q0.a;
                    }
                };
                M.R(x);
            }
            q630.a aVar3 = q630.a.a;
            float f2 = 10;
            q630 x2 = txj0.x(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 201, 1, hr80.m(rdu.a(aVar3, (izs) x), wlb0.h(M).getBackground().r, vog0.b(f2)));
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = ir.h(M);
            }
            sg50 sg50Var = (sg50) x3;
            boolean z2 = (i2 & 112) == 32;
            Object x4 = M.x();
            if (z2 || x4 == c0012a) {
                x4 = new rrk(0, gzsVar);
                M.R(x4);
            }
            q630 b2 = ojc.b(x2, sg50Var, null, false, null, (gzs) x4, 28);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, b2);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            float f3 = 12;
            q630 G = s200.G(aVar3, f3, 8, f3, f2);
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new nj(16);
                M.R(x5);
            }
            aVar2 = M;
            yqv0.c(d370.N(R.string.video_d2d_onboarding_text, 0, M), egi0.b(G, false, (izs) x5), wlb0.h(M).getText().m, null, null, 0, 0, null, 0, false, 0, 2, null, wlb0.l(M).l0, aVar2, 0, 48, 6136);
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
            s.d = new wzs(f, i, gzsVar) { // from class: xsna.mrk
                public final /* synthetic */ float b;
                public final /* synthetic */ gzs c;

                {
                    this.c = gzsVar;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    srk.a(this.b, this.c, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final float f, final gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        boolean z;
        int i2;
        int i3;
        float f2;
        androidx.compose.runtime.a aVar3;
        Object obj;
        float f3;
        final float z2;
        float f4;
        ColorFilter porterDuffColorFilter;
        ColorFilter porterDuffColorFilter2;
        androidx.compose.runtime.a M = aVar.M(1527945610);
        int i4 = i | (M.n(f) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i4 & 1, (i4 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1527945610, i4, -1, "com.vk.video.ui.discovery.minimizable.doc2doc.onboarding.OnboardingLayout (D2DOnboardingView.kt:96)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                Float valueOf = Float.valueOf(1.0E-4f);
                z = true;
                long j = l5g.b;
                i2 = 5;
                i3 = 2;
                f2 = 1.0f;
                Pair[] pairArr = {new Pair(valueOf, new l5g(j)), new Pair(Float.valueOf(0.0157f), new l5g(l5g.c(14, j, 0.98f))), new Pair(Float.valueOf(0.0549f), new l5g(l5g.c(14, j, 0.94f))), new Pair(Float.valueOf(0.1176f), new l5g(l5g.c(14, j, 0.88f))), new Pair(Float.valueOf(0.2f), new l5g(l5g.c(14, j, 0.8f))), new Pair(Float.valueOf(0.2902f), new l5g(l5g.c(14, j, 0.71f))), new Pair(Float.valueOf(0.3922f), new l5g(l5g.c(14, j, 0.61f))), new Pair(Float.valueOf(0.502f), new l5g(l5g.c(14, j, 0.5f))), new Pair(Float.valueOf(0.6078f), new l5g(l5g.c(14, j, 0.39f))), new Pair(Float.valueOf(0.7098f), new l5g(l5g.c(14, j, 0.29f))), new Pair(Float.valueOf(0.8f), new l5g(l5g.c(14, j, 0.2f))), new Pair(Float.valueOf(0.8824f), new l5g(l5g.c(14, j, 0.12f))), new Pair(Float.valueOf(0.9451f), new l5g(l5g.c(14, j, 0.06f))), new Pair(Float.valueOf(0.9843f), new l5g(l5g.c(14, j, 0.02f))), new Pair(Float.valueOf(1.0f), new l5g(l5g.j))};
                androidx.compose.runtime.a aVar4 = M;
                aVar4.R(pairArr);
                obj = pairArr;
                aVar3 = aVar4;
            } else {
                z = true;
                i2 = 5;
                i3 = 2;
                f2 = 1.0f;
                obj = x;
                aVar3 = M;
            }
            Pair[] pairArr2 = (Pair[]) obj;
            float f5 = f2;
            float a2 = d.a(swe0.f(f / 166, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5));
            boolean z3 = f < 666.0f ? z : false;
            float f6 = 666L;
            float f7 = swe0.f(f / f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5);
            float f8 = swe0.f((f - f6) / f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5);
            float a3 = a.a(f7);
            float a4 = b.a(f8);
            float a5 = c.a(f7);
            float z4 = z3 ? q6x.z(7.0f, -6.0f, a3) : q6x.z(-6.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a4);
            final float z5 = z3 ? q6x.z(3.0f, -1.0f, a3) : q6x.z(-1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a4);
            float z6 = z3 ? q6x.z(30.0f, -10.0f, a3) : q6x.z(-10.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a4);
            final float z7 = z3 ? q6x.z(11.0f, -11.0f, a3) : q6x.z(-11.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a4);
            if (z3) {
                z2 = q6x.z(8.0f, -8.0f, a3);
                f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else {
                f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                z2 = q6x.z(-8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a4);
            }
            if (z3) {
                f3 = q6x.z(40.0f, f3, a5);
            }
            q630.a aVar5 = q630.a.a;
            q630 h = txj0.h(txj0.f(aVar5, 1.0f), Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE);
            boolean y = aVar3.y(pairArr2);
            Object x2 = aVar3.x();
            if (y || x2 == c0012a) {
                f4 = z4;
                x2 = new lrk(pairArr2, 0);
                aVar3.R(x2);
            } else {
                f4 = z4;
            }
            q630 a6 = o19.a(s200.H(bu00.e(h, (izs) x2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), a2);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.c, false);
            int hashCode = Long.hashCode(n34.n(aVar3));
            sy90 D = aVar3.D();
            q630 c2 = qri.c(aVar3, a6);
            cri.h7.getClass();
            LayoutNode.a aVar6 = cri.a.b;
            if (aVar3.N() == null) {
                n34.r();
                throw null;
            }
            aVar3.H();
            if (aVar3.L()) {
                aVar3.I(aVar6);
            } else {
                aVar3.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(aVar3, d2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(aVar3, D, eVar);
            Integer valueOf2 = Integer.valueOf(hashCode);
            final float f9 = z6;
            cri.a.b bVar = cri.a.g;
            k9q0.w(aVar3, valueOf2, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(aVar3, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(aVar3, c2, dVar);
            int i5 = i4 & 112;
            a(f3, gzsVar, aVar3, i5);
            Object x3 = aVar3.x();
            if (x3 == c0012a) {
                x3 = new od3(23);
                aVar3.R(x3);
            }
            q630 a7 = rdu.a(aVar5, (izs) x3);
            Object x4 = aVar3.x();
            if (x4 == c0012a) {
                x4 = ir.h(aVar3);
            }
            sg50 sg50Var = (sg50) x4;
            boolean z8 = i5 == 32 ? z : false;
            Object x5 = aVar3.x();
            if (z8 || x5 == c0012a) {
                x5 = new com.vk.movika.sdk.base.ui.f(gzsVar, 29);
                aVar3.R(x5);
            }
            q630 b2 = ojc.b(a7, sg50Var, null, false, null, (gzs) x5, 28);
            cp10 d3 = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(aVar3));
            sy90 D2 = aVar3.D();
            q630 c3 = qri.c(aVar3, b2);
            if (aVar3.N() == null) {
                n34.r();
                throw null;
            }
            aVar3.H();
            if (aVar3.L()) {
                aVar3.I(aVar6);
            } else {
                aVar3.f();
            }
            k9q0.w(aVar3, d3, cVar);
            k9q0.w(aVar3, D2, eVar);
            ur.d(hashCode2, aVar3, bVar, aVar3, c2678a);
            k9q0.w(aVar3, c3, dVar);
            lg90 a8 = pg90.a(R.drawable.vk_icon_marker_arrow_left_right_56, 0, aVar3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) aVar3.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = ylu0Var.q().a;
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 29) {
                se7.b();
                porterDuffColorFilter = re7.b(f870.H(j2), z42.a(i2));
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j2), z42.b(i2));
            }
            int i7 = i2;
            oe7 oe7Var = new oe7(j2, i7, porterDuffColorFilter);
            boolean n = aVar3.n(z7) | aVar3.n(z2);
            Object x6 = aVar3.x();
            if (n || x6 == c0012a) {
                x6 = new izs() { // from class: xsna.nrk
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        tdu tduVar = (tdu) obj2;
                        tduVar.o(tduVar.I0(z7 - 0.5f));
                        tduVar.n(tduVar.I0(-15.0f));
                        tduVar.j(z2);
                        return s3q0.a;
                    }
                };
                aVar3.R(x6);
            }
            float f10 = 56;
            final float f11 = f4;
            r0v0.a(a8, txj0.q(rdu.a(aVar5, (izs) x6), f10), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, oe7Var, null, null, aVar3, 8, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
            lg90 a9 = pg90.a(R.drawable.vk_icon_marker_pointer_56, 0, aVar3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) aVar3.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j3 = ylu0Var2.q().a;
            if (i6 >= 29) {
                se7.b();
                porterDuffColorFilter2 = re7.b(f870.H(j3), z42.a(i7));
            } else {
                porterDuffColorFilter2 = new PorterDuffColorFilter(f870.H(j3), z42.b(i7));
            }
            oe7 oe7Var2 = new oe7(j3, i7, porterDuffColorFilter2);
            boolean n2 = aVar3.n(f11) | aVar3.n(z5) | aVar3.n(f9);
            Object x7 = aVar3.x();
            if (n2 || x7 == c0012a) {
                x7 = new izs() { // from class: xsna.ork
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        tdu tduVar = (tdu) obj2;
                        tduVar.o(tduVar.I0(f11 + 7.5f));
                        tduVar.n(tduVar.I0(z5 + 7.0f));
                        tduVar.j(f9);
                        return s3q0.a;
                    }
                };
                aVar3.R(x7);
            }
            r0v0.a(a9, txj0.q(rdu.a(aVar5, (izs) x7), f10), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, oe7Var2, null, null, aVar3, 8, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
            boolean f12 = kr.f(aVar3);
            aVar2 = aVar3;
            if (f12) {
                androidx.compose.runtime.b.e();
                aVar2 = aVar3;
            }
        } else {
            M.h();
            aVar2 = M;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(f, i, gzsVar) { // from class: xsna.prk
                public final /* synthetic */ float b;
                public final /* synthetic */ gzs c;

                {
                    this.c = gzsVar;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(1);
                    srk.b(this.b, this.c, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }
}
