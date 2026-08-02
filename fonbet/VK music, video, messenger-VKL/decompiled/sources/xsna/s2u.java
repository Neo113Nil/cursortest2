package xsna;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: AndroidOverscroll.android.kt */
/* loaded from: classes11.dex */
public final class s2u extends ytl implements lio {
    public final d82 r;
    public final iyo s;
    public final s890 t;

    public s2u(xkn0 xkn0Var, d82 d82Var, iyo iyoVar, s890 s890Var) {
        this.r = d82Var;
        this.s = iyoVar;
        this.t = s890Var;
        i2(xkn0Var);
    }

    public static boolean l2(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // xsna.lio
    public final void v(toy toyVar) {
        boolean z;
        char c;
        long j;
        er9 er9Var = toyVar.b;
        long d = er9Var.d();
        d82 d82Var = this.r;
        d82Var.k(d);
        if (mxj0.d(er9Var.d())) {
            toyVar.s1();
            return;
        }
        toyVar.s1();
        ((zak0) d82Var.d).getValue();
        yq9 a = er9Var.c.a();
        Canvas canvas = e52.a;
        Canvas canvas2 = ((d52) a).a;
        iyo iyoVar = this.s;
        boolean f = iyo.f(iyoVar.f);
        s890 s890Var = this.t;
        if (f) {
            EdgeEffect c2 = iyoVar.c();
            float f2 = -Float.intBitsToFloat((int) (er9Var.d() & 4294967295L));
            z = l2(270.0f, (Float.floatToRawIntBits(toyVar.I0(s890Var.c(toyVar.getLayoutDirection()))) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), c2, canvas2);
        } else {
            z = false;
        }
        if (iyo.f(iyoVar.d)) {
            c = ' ';
            j = 4294967295L;
            z = l2(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (((long) Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) << 32) | (((long) Float.floatToRawIntBits(toyVar.I0(s890Var.d()))) & 4294967295L), iyoVar.e(), canvas2) || z;
        } else {
            c = ' ';
            j = 4294967295L;
        }
        if (iyo.f(iyoVar.g)) {
            z = l2(90.0f, (((long) Float.floatToRawIntBits(toyVar.I0(s890Var.a(toyVar.getLayoutDirection())) + (-((float) an10.b(Float.intBitsToFloat((int) (er9Var.d() >> c))))))) & j) | (((long) Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) << c), iyoVar.d(), canvas2) || z;
        }
        if (iyo.f(iyoVar.e)) {
            EdgeEffect b = iyoVar.b();
            z = l2(180.0f, (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (er9Var.d() & j))) + toyVar.I0(s890Var.b()))) & j) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (er9Var.d() >> c)))) << c), b, canvas2) || z;
        }
        if (z) {
            d82Var.f();
        }
    }
}
