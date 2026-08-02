package xsna;

import android.view.Choreographer;
import java.util.concurrent.TimeUnit;

/* compiled from: AnimatedSnappedProgressDelegate.kt */
/* loaded from: classes2.dex */
public final class ul2 implements Choreographer.FrameCallback {
    public final /* synthetic */ vl2 b;

    public ul2(vl2 vl2Var) {
        this.b = vl2Var;
    }

    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        vl2 vl2Var = this.b;
        pod0 pod0Var = vl2Var.b;
        if (vl2Var.f) {
            long j2 = j - vl2Var.c;
            vl2Var.c = j;
            float millis = TimeUnit.NANOSECONDS.toMillis(j2) / 50;
            int i = vl2Var.e;
            int i2 = vl2Var.d;
            float f = i - i2;
            if (millis > 1.0f) {
                millis = 1.0f;
            }
            int b = an10.b(f * millis) + i2;
            vl2Var.d = b;
            pod0Var.invoke(Integer.valueOf(b));
            if (Math.abs(vl2Var.d - vl2Var.e) >= 5) {
                ((Choreographer) vl2Var.g.getValue()).postFrameCallback(this);
                return;
            }
            int i3 = vl2Var.e;
            vl2Var.d = i3;
            pod0Var.invoke(Integer.valueOf(i3));
            vl2Var.f = false;
        }
    }
}
