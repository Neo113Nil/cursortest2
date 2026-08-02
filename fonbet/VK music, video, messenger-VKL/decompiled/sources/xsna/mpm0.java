package xsna;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import xsna.er9;

/* compiled from: AndroidOverscroll.android.kt */
/* loaded from: classes11.dex */
public final class mpm0 extends ytl implements lio {
    public final d82 r;
    public final iyo s;
    public RenderNode t;

    public mpm0(xkn0 xkn0Var, d82 d82Var, iyo iyoVar) {
        this.r = d82Var;
        this.s = iyoVar;
        i2(xkn0Var);
    }

    public static boolean l2(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final RenderNode m2() {
        RenderNode renderNode = this.t;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode b = g660.b();
        this.t = b;
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f8  */
    @Override // xsna.lio
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(toy toyVar) {
        RecordingCanvas beginRecording;
        boolean z;
        boolean z2;
        char c;
        float f;
        d52 d52Var;
        azl b;
        LayoutDirection c2;
        yq9 a;
        long d;
        mdu mduVar;
        float f2;
        float f3;
        boolean z3;
        er9 er9Var = toyVar.b;
        long d2 = er9Var.d();
        d82 d82Var = this.r;
        d82Var.k(d2);
        yq9 a2 = er9Var.c.a();
        Canvas canvas = e52.a;
        Canvas canvas2 = ((d52) a2).a;
        ((zak0) d82Var.d).getValue();
        if (mxj0.d(er9Var.d())) {
            toyVar.s1();
            return;
        }
        boolean isHardwareAccelerated = canvas2.isHardwareAccelerated();
        iyo iyoVar = this.s;
        if (!isHardwareAccelerated) {
            EdgeEffect edgeEffect = iyoVar.d;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = iyoVar.e;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            EdgeEffect edgeEffect3 = iyoVar.f;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = iyoVar.g;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            EdgeEffect edgeEffect5 = iyoVar.h;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = iyoVar.i;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            EdgeEffect edgeEffect7 = iyoVar.j;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = iyoVar.k;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            toyVar.s1();
            return;
        }
        float I0 = toyVar.I0(ubd.a);
        boolean z4 = iyo.f(iyoVar.d) || iyo.g(iyoVar.h) || iyo.f(iyoVar.e) || iyo.g(iyoVar.i);
        boolean z5 = iyo.f(iyoVar.f) || iyo.g(iyoVar.j) || iyo.f(iyoVar.g) || iyo.g(iyoVar.k);
        if (z4 && z5) {
            m2().setPosition(0, 0, canvas2.getWidth(), canvas2.getHeight());
        } else if (z4) {
            m2().setPosition(0, 0, (an10.b(I0) * 2) + canvas2.getWidth(), canvas2.getHeight());
        } else {
            if (!z5) {
                toyVar.s1();
                return;
            }
            m2().setPosition(0, 0, canvas2.getWidth(), (an10.b(I0) * 2) + canvas2.getHeight());
        }
        beginRecording = m2().beginRecording();
        if (iyo.g(iyoVar.j)) {
            EdgeEffect edgeEffect9 = iyoVar.j;
            if (edgeEffect9 == null) {
                edgeEffect9 = iyoVar.a(Orientation.Horizontal);
                iyoVar.j = edgeEffect9;
            }
            l2(90.0f, edgeEffect9, beginRecording);
            edgeEffect9.finish();
        }
        if (iyo.f(iyoVar.f)) {
            EdgeEffect c3 = iyoVar.c();
            z2 = l2(270.0f, c3, beginRecording);
            if (iyo.g(iyoVar.f)) {
                z = z5;
                float intBitsToFloat = Float.intBitsToFloat((int) (d82Var.e() & 4294967295L));
                EdgeEffect edgeEffect10 = iyoVar.j;
                if (edgeEffect10 == null) {
                    edgeEffect10 = iyoVar.a(Orientation.Horizontal);
                    iyoVar.j = edgeEffect10;
                }
                int i = Build.VERSION.SDK_INT;
                float b2 = i >= 31 ? uw2.b(c3) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float f4 = 1 - intBitsToFloat;
                if (i >= 31) {
                    uw2.c(edgeEffect10, b2, f4);
                } else {
                    edgeEffect10.onPull(b2, f4);
                }
            } else {
                z = z5;
            }
        } else {
            z = z5;
            z2 = false;
        }
        if (iyo.g(iyoVar.h)) {
            EdgeEffect edgeEffect11 = iyoVar.h;
            if (edgeEffect11 == null) {
                edgeEffect11 = iyoVar.a(Orientation.Vertical);
                iyoVar.h = edgeEffect11;
            }
            l2(180.0f, edgeEffect11, beginRecording);
            edgeEffect11.finish();
        }
        try {
            try {
                if (iyo.f(iyoVar.d)) {
                    EdgeEffect e = iyoVar.e();
                    z2 = l2(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e, beginRecording) || z2;
                    if (iyo.g(iyoVar.d)) {
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (d82Var.e() >> 32));
                        EdgeEffect edgeEffect12 = iyoVar.h;
                        if (edgeEffect12 == null) {
                            edgeEffect12 = iyoVar.a(Orientation.Vertical);
                            iyoVar.h = edgeEffect12;
                        }
                        c = ' ';
                        int i2 = Build.VERSION.SDK_INT;
                        float b3 = i2 >= 31 ? uw2.b(e) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        if (i2 >= 31) {
                            uw2.c(edgeEffect12, b3, intBitsToFloat2);
                        } else {
                            edgeEffect12.onPull(b3, intBitsToFloat2);
                        }
                        if (iyo.g(iyoVar.k)) {
                            EdgeEffect edgeEffect13 = iyoVar.k;
                            if (edgeEffect13 == null) {
                                edgeEffect13 = iyoVar.a(Orientation.Horizontal);
                                iyoVar.k = edgeEffect13;
                            }
                            l2(270.0f, edgeEffect13, beginRecording);
                            edgeEffect13.finish();
                        }
                        if (iyo.f(iyoVar.g)) {
                            EdgeEffect d3 = iyoVar.d();
                            z2 = l2(90.0f, d3, beginRecording) || z2;
                            if (iyo.g(iyoVar.g)) {
                                float intBitsToFloat3 = Float.intBitsToFloat((int) (d82Var.e() & 4294967295L));
                                EdgeEffect edgeEffect14 = iyoVar.k;
                                if (edgeEffect14 == null) {
                                    edgeEffect14 = iyoVar.a(Orientation.Horizontal);
                                    iyoVar.k = edgeEffect14;
                                }
                                int i3 = Build.VERSION.SDK_INT;
                                float b4 = i3 >= 31 ? uw2.b(d3) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                if (i3 >= 31) {
                                    uw2.c(edgeEffect14, b4, intBitsToFloat3);
                                } else {
                                    edgeEffect14.onPull(b4, intBitsToFloat3);
                                }
                            }
                        }
                        if (iyo.g(iyoVar.i)) {
                            EdgeEffect edgeEffect15 = iyoVar.i;
                            if (edgeEffect15 == null) {
                                edgeEffect15 = iyoVar.a(Orientation.Vertical);
                                iyoVar.i = edgeEffect15;
                            }
                            l2(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, edgeEffect15, beginRecording);
                            edgeEffect15.finish();
                        }
                        if (iyo.f(iyoVar.e)) {
                            EdgeEffect b5 = iyoVar.b();
                            boolean z6 = l2(180.0f, b5, beginRecording) || z2;
                            if (iyo.g(iyoVar.e)) {
                                z3 = z6;
                                float intBitsToFloat4 = Float.intBitsToFloat((int) (d82Var.e() >> c));
                                EdgeEffect edgeEffect16 = iyoVar.i;
                                if (edgeEffect16 == null) {
                                    edgeEffect16 = iyoVar.a(Orientation.Vertical);
                                    iyoVar.i = edgeEffect16;
                                }
                                int i4 = Build.VERSION.SDK_INT;
                                float b6 = i4 >= 31 ? uw2.b(b5) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                float f5 = 1 - intBitsToFloat4;
                                if (i4 >= 31) {
                                    uw2.c(edgeEffect16, b6, f5);
                                } else {
                                    edgeEffect16.onPull(b6, f5);
                                }
                            } else {
                                z3 = z6;
                            }
                            z2 = z3;
                        }
                        if (z2) {
                            d82Var.f();
                        }
                        f = !z ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : I0;
                        if (z4) {
                            I0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                        LayoutDirection layoutDirection = toyVar.getLayoutDirection();
                        d52Var = new d52();
                        d52Var.a = beginRecording;
                        long d4 = er9Var.d();
                        b = er9Var.c.b();
                        c2 = er9Var.c.c();
                        a = er9Var.c.a();
                        d = er9Var.c.d();
                        er9.b bVar = er9Var.c;
                        mduVar = bVar.b;
                        bVar.f(toyVar);
                        bVar.g(layoutDirection);
                        bVar.e(d52Var);
                        bVar.h(d4);
                        bVar.b = null;
                        d52Var.e();
                        er9Var.c.a.l(f, I0);
                        toyVar.s1();
                        d52Var.a();
                        er9.b bVar2 = er9Var.c;
                        bVar2.f(b);
                        bVar2.g(c2);
                        bVar2.e(a);
                        bVar2.h(d);
                        bVar2.b = mduVar;
                        m2().endRecording();
                        int save = canvas2.save();
                        canvas2.translate(f2, f3);
                        canvas2.drawRenderNode(m2());
                        canvas2.restoreToCount(save);
                        return;
                    }
                }
                toyVar.s1();
                d52Var.a();
                er9.b bVar22 = er9Var.c;
                bVar22.f(b);
                bVar22.g(c2);
                bVar22.e(a);
                bVar22.h(d);
                bVar22.b = mduVar;
                m2().endRecording();
                int save2 = canvas2.save();
                canvas2.translate(f2, f3);
                canvas2.drawRenderNode(m2());
                canvas2.restoreToCount(save2);
                return;
            } finally {
                er9Var.c.a.l(-f, -I0);
            }
            er9Var.c.a.l(f, I0);
        } catch (Throwable th) {
            d52Var.a();
            er9.b bVar3 = er9Var.c;
            bVar3.f(b);
            bVar3.g(c2);
            bVar3.e(a);
            bVar3.h(d);
            bVar3.b = mduVar;
            throw th;
        }
        c = ' ';
        if (iyo.g(iyoVar.k)) {
        }
        if (iyo.f(iyoVar.g)) {
        }
        if (iyo.g(iyoVar.i)) {
        }
        if (iyo.f(iyoVar.e)) {
        }
        if (z2) {
        }
        if (!z) {
        }
        if (z4) {
        }
        LayoutDirection layoutDirection2 = toyVar.getLayoutDirection();
        d52Var = new d52();
        d52Var.a = beginRecording;
        long d42 = er9Var.d();
        b = er9Var.c.b();
        c2 = er9Var.c.c();
        a = er9Var.c.a();
        d = er9Var.c.d();
        er9.b bVar4 = er9Var.c;
        mduVar = bVar4.b;
        bVar4.f(toyVar);
        bVar4.g(layoutDirection2);
        bVar4.e(d52Var);
        bVar4.h(d42);
        bVar4.b = null;
        d52Var.e();
    }
}
