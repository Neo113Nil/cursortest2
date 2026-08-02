package xsna;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RuntimeShader;
import android.os.Build;
import com.vk.toggle.b;
import com.vk.toggle.features.ImFeatures;
import kotlin.LazyThreadSafetyMode;
import org.json.JSONObject;

/* compiled from: Spoiler.kt */
/* loaded from: classes2.dex */
public final class amk0 {
    public final float a = 0.06f;
    public final float b = 0.15f;
    public final gzs<s3q0> c;
    public final Object d;
    public volatile boolean e;
    public final Object f;
    public final Object g;
    public final boolean h;

    public amk0(gzs gzsVar) {
        JSONObject g;
        this.c = gzsVar;
        bpc0 bpc0Var = new bpc0(4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, bpc0Var);
        this.f = msy.a(lazyThreadSafetyMode, new mqe0(this, 11));
        this.g = msy.a(lazyThreadSafetyMode, new cy20(12));
        b.d i = com.vk.toggle.b.A.i(ImFeatures.BLUR_POST);
        boolean z = false;
        if (p1p0.a(i)) {
            if ((i == null || (g = i.g()) == null) ? false : epx.f(f370.q(g, "animations_enabled"), Boolean.TRUE)) {
                z = true;
            }
        }
        this.h = z;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(Canvas canvas) {
        if (b() && this.e) {
            canvas.drawPaint((Paint) this.f.getValue());
        }
    }

    public final boolean b() {
        return this.h && Build.VERSION.SDK_INT >= 33;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void c(int i, int i2) {
        RuntimeShader a;
        if (b() && this.e && (a = efa.a(this.d.getValue())) != null) {
            a.setFloatUniform("u_Resolution", new float[]{i, i2});
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void d() {
        if (b() && !this.e) {
            int i = 1;
            this.e = true;
            RuntimeShader a = efa.a(this.d.getValue());
            if (a != null) {
                a.setFloatUniform("u_dotSize", new float[]{this.a, this.b});
            }
            ((ValueAnimator) this.g.getValue()).addUpdateListener(new oej0(this, i));
            ((ValueAnimator) this.g.getValue()).start();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void e() {
        if (b()) {
            this.e = false;
            ((ValueAnimator) this.g.getValue()).cancel();
            this.c.invoke();
        }
    }
}
