package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: VKAvatarFactory.kt */
/* loaded from: classes2.dex */
public final class y9r0 implements b780 {
    public final /* synthetic */ z9r0 b;
    public final /* synthetic */ Ref$ObjectRef<Bitmap> c;
    public final /* synthetic */ CountDownLatch d;

    public y9r0(z9r0 z9r0Var, Ref$ObjectRef<Bitmap> ref$ObjectRef, CountDownLatch countDownLatch) {
        this.b = z9r0Var;
        this.c = ref$ObjectRef;
        this.d = countDownLatch;
    }

    @Override // xsna.b780
    public final void b(String str, Throwable th) {
        this.d.countDown();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r5v3, types: [T, android.graphics.Bitmap] */
    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
        z9r0 z9r0Var = this.b;
        z9r0Var.measure(i, i2);
        z9r0Var.layout(0, 0, i, i2);
        ?? d = kd7.d(i, i2);
        Ref$ObjectRef<Bitmap> ref$ObjectRef = this.c;
        ref$ObjectRef.element = d;
        if (d != 0) {
            Canvas canvas = new Canvas(ref$ObjectRef.element);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            z9r0Var.draw(canvas);
        }
        if (i != i2) {
            int min = Math.min(i, i2);
            ref$ObjectRef.element = kd7.b(ref$ObjectRef.element, min, min, false, false);
        }
        this.d.countDown();
    }

    @Override // xsna.b780
    public final void g(String str) {
    }

    @Override // xsna.b780
    public final void onCancel(String str) {
    }
}
