package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerStatus;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$DoubleRef;
import kotlin.jvm.internal.Ref$LongRef;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ir20;
import xsna.us2;
import xsna.uuf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class brf implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ brf(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
    
        if (((xsna.us2.d) r8.getValue()) != null) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        View view;
        View view2;
        long j;
        char c;
        wh50 wh50Var;
        aa2 aa2Var;
        oio oioVar;
        oio oioVar2;
        oio oioVar3;
        float f;
        float intBitsToFloat;
        RecordingCanvas beginRecording;
        us2.d dVar;
        int i = this.b;
        us2.d dVar2 = null;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                c48 c48Var = (c48) obj5;
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) obj4;
                l7p0 l7p0Var = (l7p0) obj3;
                uuf.c.b bVar = (uuf.c.b) obj2;
                wuf wufVar = (wuf) obj;
                int i2 = ClipsWrapperFragment.Q0;
                clipsWrapperFragment.requireContext();
                wufVar.f(c48Var.b() + 10);
                if (wufVar.c().getVisibility() != 0) {
                    d3m.c(wufVar.c(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                wufVar.n(l7p0Var.a(clipsWrapperFragment));
                wufVar.i(c48Var.a(clipsWrapperFragment));
                d6e s = wufVar.s();
                if (s != null && (view2 = s.getView()) != null) {
                    wufVar.g().addView(view2);
                    if (bVar.e()) {
                        d3m.c(wufVar.g(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                }
                d6e j2 = wufVar.j();
                if (j2 != null && (view = j2.getView()) != null) {
                    wufVar.m().addView(view);
                    if (bVar.e()) {
                        d3m.c(wufVar.m(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                }
                clipsWrapperFragment.requireContext();
                wufVar.p(c48Var.b());
                return s3q0.a;
            case 1:
                wh50 wh50Var2 = (wh50) obj5;
                aa2 aa2Var2 = (aa2) obj4;
                Bitmap bitmap = aa2Var2.a;
                wh50 wh50Var3 = (wh50) obj3;
                wh50 wh50Var4 = (wh50) obj2;
                oio oioVar4 = (oio) obj;
                v2k v2kVar = (v2k) wh50Var2.getValue();
                if (v2kVar == null) {
                    j = 4294967295L;
                    c = ' ';
                    long floatToRawIntBits = (Float.floatToRawIntBits(bitmap.getWidth()) << 32) | (Float.floatToRawIntBits(bitmap.getHeight()) & 4294967295L);
                    int r0 = oioVar4.r0(d3k.a);
                    aa2Var = aa2Var2;
                    zhf0 e = p490.e((Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), floatToRawIntBits);
                    float f2 = 2;
                    float intBitsToFloat2 = (Float.intBitsToFloat((int) (oioVar4.d() & 4294967295L)) - ((Float.intBitsToFloat((int) (oioVar4.d() >> 32)) - (r0 * 2)) / 1.7777778f)) / f2;
                    oioVar = oioVar4;
                    long floatToRawIntBits2 = Float.floatToRawIntBits(r0);
                    int floatToRawIntBits3 = Float.floatToRawIntBits(intBitsToFloat2);
                    wh50Var = wh50Var2;
                    zhf0 e2 = p490.e((floatToRawIntBits3 & 4294967295L) | (floatToRawIntBits2 << 32), (Float.floatToRawIntBits(r12) & 4294967295L) | (Float.floatToRawIntBits(r5) << 32));
                    float f3 = e2.b;
                    float f4 = e2.a;
                    float[] a = en10.a();
                    int i3 = (int) (floatToRawIntBits >> 32);
                    int i4 = (int) (floatToRawIntBits & 4294967295L);
                    boolean z = Float.intBitsToFloat(i3) / Float.intBitsToFloat(i4) < 1.7777778f;
                    if (z) {
                        f = e2.c - f4;
                        intBitsToFloat = Float.intBitsToFloat(i3);
                    } else {
                        f = e2.d - f3;
                        intBitsToFloat = Float.intBitsToFloat(i4);
                    }
                    float f5 = f / intBitsToFloat;
                    if (z) {
                        en10.i(f4, (Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)) - (Float.intBitsToFloat(i4) * f5)) / f2, a);
                    } else {
                        en10.i((Float.intBitsToFloat((int) (oioVar.d() >> 32)) - (Float.intBitsToFloat(i3) * f5)) / f2, f3, a);
                    }
                    en10.f(f5, f5, a);
                    v2kVar = new v2k(e, e2, new en10(a));
                } else {
                    j = 4294967295L;
                    c = ' ';
                    wh50Var = wh50Var2;
                    aa2Var = aa2Var2;
                    oioVar = oioVar4;
                }
                if (wh50Var.getValue() == 0) {
                    wh50Var.setValue(v2kVar);
                }
                if (fco0.e(((en10) wh50Var4.getValue()).a)) {
                    float[] a2 = en10.a();
                    en10.g(a2, v2kVar.c.a);
                    wh50Var4.setValue(new en10(a2));
                }
                l9x I = d370.I(en10.c(((en10) wh50Var4.getValue()).a, v2kVar.a));
                try {
                    oioVar3 = oioVar;
                } catch (Throwable th) {
                    th = th;
                    oioVar2 = oioVar;
                }
                try {
                    oio.B0(oioVar3, aa2Var, 0L, 0L, I.c(), (I.d() << c) | (I.b() & j), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 0, 0, 998);
                    oioVar2 = oioVar3;
                } catch (Throwable th2) {
                    th = th2;
                    oioVar2 = oioVar3;
                    if (wh50Var3.getValue() == 0) {
                        wh50Var3.setValue(th);
                    }
                    float f6 = I.a;
                    float f7 = I.b;
                    float f8 = I.c;
                    float f9 = I.d;
                    zhf0 zhf0Var = v2kVar.b;
                    float f10 = zhf0Var.b;
                    float max = Math.max(f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    float min = Math.min(f8, Float.intBitsToFloat((int) (oioVar2.d() >> c)));
                    float max2 = Math.max(f7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    float min2 = Math.min(f9, Float.intBitsToFloat((int) (oioVar2.d() & j)));
                    long j3 = d3k.b;
                    float f11 = min - max;
                    oio.P(oioVar2, j3, (Float.floatToRawIntBits(max) << c) | (Float.floatToRawIntBits(max2) & j), (Float.floatToRawIntBits(f11) << c) | (Float.floatToRawIntBits(f10 - max2) & j), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                    float f12 = zhf0Var.d;
                    oio.P(oioVar2, j3, (Float.floatToRawIntBits(max) << c) | (Float.floatToRawIntBits(f12) & j), (Float.floatToRawIntBits(f11) << c) | (Float.floatToRawIntBits(min2 - f12) & j), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                    float f13 = f12 - f10;
                    oio.P(oioVar2, j3, (Float.floatToRawIntBits(max) << c) | (Float.floatToRawIntBits(f10) & j), (Float.floatToRawIntBits(zhf0Var.a - max) << c) | (Float.floatToRawIntBits(f13) & j), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                    float f14 = zhf0Var.c;
                    oio.P(oioVar2, j3, (Float.floatToRawIntBits(f14) << c) | (Float.floatToRawIntBits(f10) & j), (Float.floatToRawIntBits(min - f14) << c) | (Float.floatToRawIntBits(f13) & j), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                    return s3q0.a;
                }
                float f62 = I.a;
                float f72 = I.b;
                float f82 = I.c;
                float f92 = I.d;
                zhf0 zhf0Var2 = v2kVar.b;
                float f102 = zhf0Var2.b;
                float max3 = Math.max(f62, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                float min3 = Math.min(f82, Float.intBitsToFloat((int) (oioVar2.d() >> c)));
                float max22 = Math.max(f72, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                float min22 = Math.min(f92, Float.intBitsToFloat((int) (oioVar2.d() & j)));
                long j32 = d3k.b;
                float f112 = min3 - max3;
                oio.P(oioVar2, j32, (Float.floatToRawIntBits(max3) << c) | (Float.floatToRawIntBits(max22) & j), (Float.floatToRawIntBits(f112) << c) | (Float.floatToRawIntBits(f102 - max22) & j), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                float f122 = zhf0Var2.d;
                oio.P(oioVar2, j32, (Float.floatToRawIntBits(max3) << c) | (Float.floatToRawIntBits(f122) & j), (Float.floatToRawIntBits(f112) << c) | (Float.floatToRawIntBits(min22 - f122) & j), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                float f132 = f122 - f102;
                oio.P(oioVar2, j32, (Float.floatToRawIntBits(max3) << c) | (Float.floatToRawIntBits(f102) & j), (Float.floatToRawIntBits(zhf0Var2.a - max3) << c) | (Float.floatToRawIntBits(f132) & j), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                float f142 = zhf0Var2.c;
                oio.P(oioVar2, j32, (Float.floatToRawIntBits(f142) << c) | (Float.floatToRawIntBits(f102) & j), (Float.floatToRawIntBits(min3 - f142) << c) | (Float.floatToRawIntBits(f132) & j), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 120);
                return s3q0.a;
            case 2:
                yg5 yg5Var = (yg5) obj4;
                gr20 gr20Var = (gr20) obj3;
                ir20.b bVar2 = (ir20.b) obj2;
                com.vk.libvideo.autoplay.a a3 = ((nit0) obj5).c.a();
                yg5Var.z0(gr20Var.u.getDisplayView(), a3, null);
                yg5Var.a0(a3);
                cty ctyVar = gr20Var.g.a;
                boolean d = com.vk.video.ui.discovery.minimizable.player.b.d(((MiniPlayerControllersWrapper) ctyVar.c).v.g.b);
                boolean z2 = ((MiniPlayerControllersWrapper) ctyVar.c).v.g.b instanceof VideoPlayerStatus.Completed;
                if ((d || z2) && !bVar2.a.f) {
                    yg5Var.f();
                }
                return s3q0.a;
            case 3:
                mdu mduVar = (mdu) obj5;
                RenderNode renderNode = (RenderNode) obj4;
                RenderEffect renderEffect = (RenderEffect) obj3;
                ir9 ir9Var = (ir9) obj2;
                oio oioVar5 = (oio) obj;
                if (mduVar != null) {
                    renderNode.setRenderEffect(renderEffect);
                    renderNode.setPosition(0, 0, (int) Float.intBitsToFloat((int) (oioVar5.d() >> 32)), (int) Float.intBitsToFloat((int) (4294967295L & oioVar5.d())));
                    yq9 a4 = oioVar5.a0().a();
                    beginRecording = renderNode.beginRecording();
                    d52 d52Var = ir9Var.a;
                    Canvas canvas = d52Var.a;
                    d52Var.a = beginRecording;
                    oioVar5.a0().e(d52Var);
                    qdu.a(oioVar5, mduVar);
                    oioVar5.a0().e(a4);
                    ir9Var.a.a = canvas;
                    renderNode.endRecording();
                    Canvas canvas2 = e52.a;
                    ((d52) a4).a.drawRenderNode(renderNode);
                }
                return s3q0.a;
            case 4:
                Ref$DoubleRef ref$DoubleRef = (Ref$DoubleRef) obj5;
                rv4 rv4Var = (rv4) obj4;
                Ref$LongRef ref$LongRef = (Ref$LongRef) obj3;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                Ref$DoubleRef ref$DoubleRef2 = (Ref$DoubleRef) obj2;
                Number number = (Number) obj;
                double d2 = ref$DoubleRef.element;
                if (d2 != ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    number = (Number) rv4Var.invoke(Double.valueOf(d2), number);
                }
                ref$DoubleRef.element = number.doubleValue();
                r6 = SystemClock.uptimeMillis() - ref$LongRef.element < timeUnit.toMillis(200L);
                if (!r6) {
                    ref$LongRef.element = SystemClock.uptimeMillis();
                    ref$DoubleRef2.element = ref$DoubleRef.element;
                    ref$DoubleRef.element = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                }
                return Boolean.valueOf(r6);
            default:
                wh50 wh50Var5 = (wh50) obj5;
                us2 us2Var = (us2) obj4;
                izs izsVar = (izs) obj3;
                wh50 wh50Var6 = (wh50) obj2;
                long floatToRawIntBits4 = (4294967295L & Float.floatToRawIntBits(r0.getY())) | (Float.floatToRawIntBits(r0.getX()) << 32);
                int action = ((MotionEvent) obj).getAction();
                if (action == 0) {
                    ljo0 ljo0Var = (ljo0) wh50Var5.getValue();
                    if (ljo0Var != null) {
                        int h = ljo0Var.b.h(floatToRawIntBits4);
                        dVar2 = (us2.d) j5g.a0(us2Var.b(h, h));
                    }
                    wh50Var6.setValue(dVar2);
                    break;
                } else {
                    if (action == 1) {
                        ljo0 ljo0Var2 = (ljo0) wh50Var5.getValue();
                        if (ljo0Var2 != null) {
                            int h2 = ljo0Var2.b.h(floatToRawIntBits4);
                            dVar = (us2.d) j5g.a0(us2Var.b(h2, h2));
                        } else {
                            dVar = null;
                        }
                        if (dVar == null || !dVar.equals((us2.d) wh50Var6.getValue())) {
                            wh50Var6.setValue(null);
                        } else {
                            izsVar.invoke(dVar);
                        }
                    }
                    r6 = false;
                }
                return Boolean.valueOf(r6);
        }
    }

    public /* synthetic */ brf(Ref$DoubleRef ref$DoubleRef, rv4 rv4Var, Ref$LongRef ref$LongRef, Ref$DoubleRef ref$DoubleRef2) {
        this.b = 4;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.c = ref$DoubleRef;
        this.d = rv4Var;
        this.e = ref$LongRef;
        this.f = ref$DoubleRef2;
    }
}
