package xsna;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* compiled from: DrawablePainter.kt */
/* loaded from: classes2.dex */
public final class zjo extends lg90 implements huf0, Drawable.Callback {
    public final Drawable g;
    public final rg50 h = androidx.compose.runtime.i.a(0);

    public zjo(Drawable drawable) {
        this.g = drawable;
    }

    @Override // xsna.huf0
    public final void d() {
        f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.huf0
    public final void e() {
        Drawable drawable = this.g;
        drawable.setCallback(this);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.huf0
    public final void f() {
        Drawable drawable = this.g;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setCallback(null);
    }

    @Override // xsna.lg90
    public final long i() {
        return 9205357640488583168L;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        rg50 rg50Var = this.h;
        ((wak0) rg50Var).C(((wak0) rg50Var).getIntValue() + 1);
    }

    @Override // xsna.lg90
    public final void j(oio oioVar) {
        ((wak0) this.h).getIntValue();
        yq9 a = oioVar.a0().a();
        int intBitsToFloat = (int) Float.intBitsToFloat((int) (oioVar.d() >> 32));
        int intBitsToFloat2 = (int) Float.intBitsToFloat((int) (oioVar.d() & 4294967295L));
        Drawable drawable = this.g;
        drawable.setBounds(0, 0, intBitsToFloat, intBitsToFloat2);
        try {
            a.e();
            Canvas canvas = e52.a;
            drawable.draw(((d52) a).a);
        } finally {
            a.a();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }
}
