package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: Trimmer.kt */
/* loaded from: classes2.dex */
public final class trp0 {
    public static final float a = 16;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final xrp0 xrp0Var, final krp0 krp0Var, q630 q630Var, final gzs gzsVar, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        wh50 wh50Var;
        androidx.compose.runtime.a M = aVar.M(-13919149);
        int i2 = i | (M.J(xrp0Var) ? 4 : 2) | (M.J(krp0Var) ? 32 : 16) | 384 | (M.y(gzsVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-13919149, i2, -1, "com.vk.libvideo.design.compose.base.trimmer.Trimmer (Trimmer.kt:81)");
            }
            azl azlVar = (azl) M.r(uvi.h);
            float I0 = azlVar.I0(wrp0.e);
            final float I02 = azlVar.I0((a + irp0.d) * 2);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(null);
                M.R(x);
            }
            wh50 wh50Var2 = (wh50) x;
            Float f = (Float) wh50Var2.getValue();
            if (f == null || f.floatValue() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f = null;
            }
            wh50 u = nr2.u(xrp0Var.d, M);
            boolean J = M.J(f);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                if (f == null) {
                    wh50Var = wh50Var2;
                    x2 = null;
                } else {
                    float floatValue = f.floatValue();
                    q500 q500Var = xrp0Var.a;
                    r500 r500Var = new r500(q500Var.b, q500Var.c);
                    q500 q500Var2 = xrp0Var.b;
                    wh50Var = wh50Var2;
                    x2 = new lrp0(floatValue, r500Var, new r500(q500Var2.b, q500Var2.c), xrp0Var.c, u, xrp0Var.g, I0);
                }
                M.R(x2);
            } else {
                wh50Var = wh50Var2;
            }
            lrp0 lrp0Var = (lrp0) x2;
            q630.a aVar2 = q630.a.a;
            q630 h = txj0.h(txj0.f(aVar2, 1.0f), Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE);
            int i3 = i2 & 14;
            boolean n = M.n(I02) | (i3 == 4);
            Object x3 = M.x();
            if (n || x3 == c0012a) {
                final wh50 wh50Var3 = wh50Var;
                x3 = new izs() { // from class: xsna.mrp0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        wh50Var3.setValue(Float.valueOf(xrp0Var.b.c / (((int) (((q9x) obj).a >> 32)) - I02)));
                        return s3q0.a;
                    }
                };
                M.R(x3);
            }
            q630 z = sv1.z(h, (izs) x3);
            boolean J2 = M.J(lrp0Var) | ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
            Object x4 = M.x();
            if (J2 || x4 == c0012a) {
                x4 = new rrp0(lrp0Var, krp0Var, gzsVar);
                M.R(x4);
            }
            q630 a2 = eqn0.a(skn0.b(z, lrp0Var, (PointerInputEventHandler) x4));
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, a2);
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
            if (lrp0Var != null) {
                mtk0<jrp0> mtk0Var = lrp0Var.f;
                M.K(505434496);
                int i4 = lrp0Var.h;
                boolean J3 = M.J(lrp0Var);
                Object x5 = M.x();
                if (J3 || x5 == c0012a) {
                    n8 n8Var = new n8(1, lrp0Var, lrp0.class, "getThumbPositionMs", "getThumbPositionMs(I)J", 0, 10);
                    M.R(n8Var);
                    x5 = n8Var;
                }
                d(xrp0Var, mtk0Var, i4, (izs) ((fcy) x5), null, M, i3);
                b(mtk0Var, null, M, 0);
                c(lrp0Var.g, mtk0Var, null, M, 0);
            } else {
                M.K(499497717);
            }
            M.j();
            M.G();
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
            s.d = new wzs(krp0Var, q630Var2, gzsVar, i) { // from class: xsna.orp0
                public final /* synthetic */ krp0 c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ gzs e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    trp0.a(xrp0.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(mtk0 mtk0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1285081794);
        int i2 = (M.J(mtk0Var) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1285081794, i2, -1, "com.vk.libvideo.design.compose.base.trimmer.TrimmerBounds (Trimmer.kt:160)");
            }
            wjo0 a2 = xjo0.a(6, 0, M);
            lqr lqrVar = ((jrp0) mtk0Var.getValue()).b;
            float f = ((jrp0) mtk0Var.getValue()).c;
            final lqr lqrVar2 = new lqr(lqrVar.a + f, lqrVar.b + f);
            nmo0 nmo0Var = wlb0.l(M).C0.a;
            final long j = wlb0.h(M).getText().d;
            final long j2 = wlb0.h(M).j().b;
            final ljo0 a3 = wjo0.a(a2, (String) ((jrp0) mtk0Var.getValue()).f.getValue(), nmo0Var, 1, 0L, 1004);
            final long j3 = wlb0.h(M).q().a;
            final long j4 = wlb0.h(M).getIcon().c;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1167190318, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronLeft16> (VkSdkIcons.kt:440)");
            }
            final lg90 a4 = pg90.a(R.drawable.vk_icon_chevron_left_16, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2112191392, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Chevron16> (VkSdkIcons.kt:408)");
            }
            final lg90 a5 = pg90.a(R.drawable.vk_icon_chevron_16, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean J = M.J(lqrVar2) | M.y(a3) | M.p(j2) | M.p(j) | M.p(j3) | M.y(a4) | M.y(a5) | M.p(j4);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                izs izsVar = new izs() { // from class: xsna.qrp0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        float f2;
                        float f3;
                        int i3;
                        ColorFilter porterDuffColorFilter;
                        ColorFilter porterDuffColorFilter2;
                        lg90 lg90Var = a4;
                        lg90 lg90Var2 = a5;
                        oio oioVar = (oio) obj;
                        float I0 = oioVar.I0(wrp0.d);
                        long j5 = wrp0.a;
                        float f4 = wrp0.b;
                        float I02 = oioVar.I0(f4);
                        lqr lqrVar3 = lqr.this;
                        float f5 = lqrVar3.a;
                        float f6 = wrp0.e;
                        float I03 = oioVar.I0(f6);
                        oio.P(oioVar, j5, (Float.floatToRawIntBits(I0) << 32) | (Float.floatToRawIntBits(I02) & 4294967295L), (Float.floatToRawIntBits(I03) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                        float f7 = lqrVar3.b;
                        float I04 = oioVar.I0(f4);
                        long floatToRawIntBits = (Float.floatToRawIntBits(I04) & 4294967295L) | (Float.floatToRawIntBits(I0 + f7) << 32);
                        float f8 = 2;
                        float intBitsToFloat = (Float.intBitsToFloat((int) (oioVar.d() >> 32)) - f7) - (I0 * f8);
                        float I05 = oioVar.I0(f6);
                        oio.P(oioVar, j5, floatToRawIntBits, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(I05) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                        float f9 = trp0.a;
                        float f10 = irp0.f + f9;
                        float I06 = oioVar.I0(f10) + f5;
                        float f11 = irp0.c;
                        float I07 = oioVar.I0(42 + f11);
                        ljo0 ljo0Var = a3;
                        float I08 = oioVar.I0(8) + ((int) (ljo0Var.c >> 32));
                        float I09 = oioVar.I0(14);
                        float I010 = oioVar.I0(4);
                        oio oioVar2 = oioVar;
                        oio.C1(oioVar2, j2, (Float.floatToRawIntBits(I06) << 32) | (Float.floatToRawIntBits(I07) & 4294967295L), (Float.floatToRawIntBits(I08) << 32) | (Float.floatToRawIntBits(I09) & 4294967295L), (Float.floatToRawIntBits(I010) << 32) | (Float.floatToRawIntBits(I010) & 4294967295L), null, PsExtractor.VIDEO_STREAM_MASK);
                        dko0.a(oioVar2, ljo0Var, j, (Float.floatToRawIntBits(oioVar2.I0(r11) + I06) << 32) | (Float.floatToRawIntBits(I07) & 4294967295L));
                        androidx.compose.ui.graphics.a a6 = androidx.compose.ui.graphics.b.a();
                        float I011 = oioVar2.I0(f9) + f5;
                        float I012 = oioVar2.I0(f11);
                        float I013 = oioVar2.I0(f10) + f5;
                        float f12 = f11 + irp0.g;
                        float I014 = oioVar2.I0(f12);
                        float f13 = irp0.b;
                        float I015 = oioVar2.I0(f13);
                        long floatToRawIntBits2 = (Float.floatToRawIntBits(I015) << 32) | (Float.floatToRawIntBits(I015) & 4294967295L);
                        float I016 = oioVar2.I0(f13);
                        a6.q(new aog0(I011, I012, I013, I014, floatToRawIntBits2, 0L, 0L, (Float.floatToRawIntBits(I016) << 32) | (Float.floatToRawIntBits(I016) & 4294967295L), 96), Path.Direction.CounterClockwise);
                        androidx.compose.ui.graphics.a a7 = androidx.compose.ui.graphics.b.a();
                        float f14 = irp0.d;
                        float f15 = f9 + f14;
                        float I017 = oioVar2.I0(f15) + f5;
                        float f16 = irp0.a;
                        float f17 = f11 + f16;
                        float I018 = oioVar2.I0(f17);
                        float I019 = oioVar2.I0(f10) + f5;
                        float f18 = f12 - f16;
                        float I020 = oioVar2.I0(f18);
                        float I021 = oioVar2.I0(f13);
                        float I022 = oioVar2.I0(f13);
                        a7.q(new aog0(I017, I018, I019, I020, (Float.floatToRawIntBits(I021) << 32) | (Float.floatToRawIntBits(I021) & 4294967295L), 0L, 0L, (Float.floatToRawIntBits(I022) << 32) | (Float.floatToRawIntBits(I022) & 4294967295L), 96), Path.Direction.CounterClockwise);
                        androidx.compose.ui.graphics.a a8 = androidx.compose.ui.graphics.b.a();
                        a8.x(a6, a7, 0);
                        long j6 = j3;
                        oio.C0(oioVar2, a8, j6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 60);
                        float I023 = oioVar2.I0(f9) + f5;
                        float f19 = 24 + f11;
                        float I024 = oioVar2.I0(f19);
                        oioVar2.a0().a.l(I023, I024);
                        try {
                            long i4 = lg90Var.i();
                            try {
                                int i5 = Build.VERSION.SDK_INT;
                                long j7 = j4;
                                try {
                                    if (i5 >= 29) {
                                        se7.b();
                                        i3 = 5;
                                        porterDuffColorFilter = re7.b(f870.H(j7), z42.a(5));
                                    } else {
                                        i3 = 5;
                                        porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j7), z42.b(5));
                                    }
                                    f3 = I023;
                                    f2 = I024;
                                    try {
                                        lg90.h(lg90Var, oioVar2, i4, new oe7(j7, i3, porterDuffColorFilter), 2);
                                        oioVar2.a0().a.l(-f3, -f2);
                                        androidx.compose.ui.graphics.a a9 = androidx.compose.ui.graphics.b.a();
                                        float f20 = irp0.e;
                                        float f21 = f15 - f20;
                                        float I025 = oioVar2.I0(f21) + f7;
                                        float I026 = oioVar2.I0(f11);
                                        float I027 = oioVar2.I0((f14 * f8) + f9) + f7;
                                        float I028 = oioVar2.I0(f12);
                                        float I029 = oioVar2.I0(f13);
                                        long floatToRawIntBits3 = (Float.floatToRawIntBits(I029) << 32) | (Float.floatToRawIntBits(I029) & 4294967295L);
                                        float I030 = oioVar2.I0(f13);
                                        a9.q(new aog0(I025, I026, I027, I028, 0L, floatToRawIntBits3, (Float.floatToRawIntBits(I030) << 32) | (Float.floatToRawIntBits(I030) & 4294967295L), 0L, 144), Path.Direction.CounterClockwise);
                                        androidx.compose.ui.graphics.a a10 = androidx.compose.ui.graphics.b.a();
                                        float I031 = oioVar2.I0(f21) + f7;
                                        float I032 = oioVar2.I0(f17);
                                        float I033 = oioVar2.I0(f15) + f7;
                                        float I034 = oioVar2.I0(f18);
                                        float I035 = oioVar2.I0(f13);
                                        long floatToRawIntBits4 = (Float.floatToRawIntBits(I035) << 32) | (Float.floatToRawIntBits(I035) & 4294967295L);
                                        float I036 = oioVar2.I0(f13);
                                        a10.q(new aog0(I031, I032, I033, I034, 0L, floatToRawIntBits4, (Float.floatToRawIntBits(I036) << 32) | (Float.floatToRawIntBits(I036) & 4294967295L), 0L, 144), Path.Direction.CounterClockwise);
                                        androidx.compose.ui.graphics.a a11 = androidx.compose.ui.graphics.b.a();
                                        a11.x(a9, a10, 0);
                                        oio.C0(oioVar2, a11, j6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 60);
                                        float I037 = oioVar2.I0(f15) + f7;
                                        float I038 = oioVar2.I0(f19);
                                        oioVar2.a0().a.l(I037, I038);
                                        try {
                                            long i6 = lg90Var2.i();
                                            if (i5 >= 29) {
                                                se7.b();
                                                porterDuffColorFilter2 = re7.b(f870.H(j7), z42.a(5));
                                            } else {
                                                porterDuffColorFilter2 = new PorterDuffColorFilter(f870.H(j7), z42.b(5));
                                            }
                                            try {
                                                lg90.h(lg90Var2, oioVar2, i6, new oe7(j7, 5, porterDuffColorFilter2), 2);
                                                oioVar2.a0().a.l(-I037, -I038);
                                                float I039 = (oioVar2.I0(f10) + f5) - 1;
                                                float floatValue = (((Number) lqrVar3.c.getValue()).floatValue() - oioVar2.I0(f20 * f8)) + f8;
                                                float I040 = oioVar2.I0(f11);
                                                long floatToRawIntBits5 = (Float.floatToRawIntBits(I040) & 4294967295L) | (Float.floatToRawIntBits(I039) << 32);
                                                float I041 = oioVar2.I0(f16);
                                                oio.P(oioVar2, j6, floatToRawIntBits5, (Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(I041) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                                                float I042 = oioVar2.I0(f18);
                                                long floatToRawIntBits6 = (Float.floatToRawIntBits(I039) << 32) | (Float.floatToRawIntBits(I042) & 4294967295L);
                                                float I043 = oioVar2.I0(f16);
                                                oio.P(oioVar2, j6, floatToRawIntBits6, (Float.floatToRawIntBits(I043) & 4294967295L) | (Float.floatToRawIntBits(floatValue) << 32), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                                                return s3q0.a;
                                            } catch (Throwable th) {
                                                th = th;
                                                oioVar2 = oioVar2;
                                                oioVar2.a0().a.l(-I037, -I038);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        oioVar2.a0().a.l(-f3, -f2);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    f2 = I024;
                                    f3 = I023;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                f3 = I023;
                                f2 = I024;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            f2 = I024;
                            f3 = I023;
                        }
                    }
                };
                M.R(izsVar);
                x = izsVar;
            }
            q630Var2 = q630.a.a;
            f9t.e(txj0.d(bu00.c(q630Var2, (izs) x), 1.0f), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sy5(mtk0Var, q630Var2, i, 3);
        }
    }

    public static final void c(mtk0 mtk0Var, mtk0 mtk0Var2, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-206146193);
        int i2 = i | (M.J(mtk0Var) ? 4 : 2) | (M.J(mtk0Var2) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-206146193, i2, -1, "com.vk.libvideo.design.compose.base.trimmer.TrimmerSlider (Trimmer.kt:209)");
            }
            wjo0 a2 = xjo0.a(6, 0, M);
            final float f = ((vrp0) mtk0Var.getValue()).b + ((jrp0) mtk0Var2.getValue()).c;
            final long j = wlb0.h(M).m().c;
            final long j2 = wlb0.h(M).r().b;
            nmo0 nmo0Var = wlb0.l(M).i0.a;
            final long j3 = wlb0.h(M).getText().d;
            final ljo0 a3 = wjo0.a(a2, (String) ((vrp0) mtk0Var.getValue()).c.getValue(), nmo0Var, 1, 0L, 1004);
            boolean n = M.n(f) | M.p(j) | M.p(j2) | M.y(a3) | M.p(j3);
            Object x = M.x();
            if (n || x == a.C0011a.a) {
                izs izsVar = new izs() { // from class: xsna.nrp0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        oio oioVar = (oio) obj;
                        float f2 = urp0.a;
                        float f3 = trp0.a + irp0.d;
                        float f4 = urp0.a;
                        float f5 = f4 / 2;
                        float I0 = oioVar.I0(f3 - f5) + f;
                        float I02 = oioVar.I0(f5);
                        float I03 = oioVar.I0(f5) + I0;
                        float I04 = oioVar.I0(103);
                        long floatToRawIntBits = (Float.floatToRawIntBits(I03) << 32) | (Float.floatToRawIntBits(I04) & 4294967295L);
                        long j4 = j;
                        oio.V1(oioVar, j4, I02, floatToRawIntBits, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                        float f6 = 24;
                        float I05 = oioVar.I0(f6);
                        float I06 = oioVar.I0(f4);
                        float I07 = oioVar.I0(79);
                        oio.P(oioVar, j4, (Float.floatToRawIntBits(I0) << 32) | (Float.floatToRawIntBits(I05) & 4294967295L), (Float.floatToRawIntBits(I07) & 4294967295L) | (Float.floatToRawIntBits(I06) << 32), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                        ljo0 ljo0Var = a3;
                        float I08 = oioVar.I0(16) + ((int) (ljo0Var.c >> 32));
                        float I09 = oioVar.I0(f6);
                        float I010 = oioVar.I0(12);
                        oio.C1(oioVar, j2, (Float.floatToRawIntBits(I0 - oioVar.I0(r2)) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (Float.floatToRawIntBits(I08) << 32) | (Float.floatToRawIntBits(I09) & 4294967295L), (Float.floatToRawIntBits(I010) << 32) | (Float.floatToRawIntBits(I010) & 4294967295L), new frm0(oioVar.I0(1), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30), 224);
                        float f7 = 4;
                        float I011 = I0 - oioVar.I0(f7);
                        float I012 = oioVar.I0(f7);
                        dko0.a(oioVar, ljo0Var, j3, (Float.floatToRawIntBits(I011) << 32) | (Float.floatToRawIntBits(I012) & 4294967295L));
                        return s3q0.a;
                    }
                };
                M.R(izsVar);
                x = izsVar;
            }
            q630.a aVar2 = q630.a.a;
            f9t.e(bu00.c(aVar2, (izs) x), M, 0);
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
            s.d = new fc0(mtk0Var, mtk0Var2, q630Var2, i, 5);
        }
    }

    public static final void d(xrp0 xrp0Var, final mtk0 mtk0Var, final int i, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        xrp0 xrp0Var2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1989362240);
        if ((i2 & 6) == 0) {
            i3 = (M.J(xrp0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(mtk0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.o(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.y(izsVar) ? 2048 : 1024;
        }
        int i4 = i3 | 24576;
        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1989362240, i4, -1, "com.vk.libvideo.design.compose.base.trimmer.TrimmerThumbs (Trimmer.kt:247)");
            }
            jgh0 x = p490.x(M);
            int i5 = -an10.b(((jrp0) mtk0Var.getValue()).c);
            Integer valueOf = Integer.valueOf(i5);
            boolean J = M.J(x) | M.o(i5);
            Object x2 = M.x();
            Object obj = a.C0011a.a;
            if (J || x2 == obj) {
                x2 = new srp0(x, i5, null);
                M.R(x2);
            }
            bap.g(valueOf, (wzs) x2, M, 0);
            float f = wrp0.d;
            float f2 = wrp0.b;
            float f3 = wrp0.c;
            q630.a aVar2 = q630.a.a;
            q630 d = rte0.d(s200.G(aVar2, f, f2, f, f3), vog0.b(8));
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            k9q0.w(M, d2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf2 = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf2, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630 r = p490.r(aVar2, x, 12);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, r);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            M.K(-1374509720);
            int i6 = 0;
            while (i6 < i) {
                Object x3 = M.x();
                if (x3 == obj) {
                    x3 = new azt(29);
                    M.R(x3);
                }
                izs izsVar2 = (izs) x3;
                q630 v = txj0.v(txj0.c(aVar2, 1.0f), wrp0.e);
                boolean o = ((i4 & 14) == 4) | ((i4 & 7168) == 2048) | M.o(i6);
                Object x4 = M.x();
                if (o || x4 == obj) {
                    x4 = new jng(xrp0Var, izsVar, i6, 3);
                    M.R(x4);
                }
                ae2.a(54, 0, M, izsVar2, (izs) x4, v);
                i6++;
                aVar2 = aVar2;
            }
            xrp0Var2 = xrp0Var;
            q630.a aVar4 = aVar2;
            M.j();
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar4;
        } else {
            xrp0Var2 = xrp0Var;
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final xrp0 xrp0Var3 = xrp0Var2;
            s.d = new wzs() { // from class: xsna.prp0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    trp0.d(xrp0.this, mtk0Var, i, izsVar, q630Var2, (androidx.compose.runtime.a) obj2, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
