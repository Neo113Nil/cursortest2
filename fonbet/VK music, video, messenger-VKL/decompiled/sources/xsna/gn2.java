package xsna;

import android.os.SystemClock;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: AnimationChoreographer.kt */
/* loaded from: classes6.dex */
public final class gn2 implements fn2, Choreographer.FrameCallback {
    public final WeakReference<View> b;
    public boolean c;
    public long d;
    public boolean e;
    public boolean f = true;
    public long g;

    public gn2(ViewGroup viewGroup) {
        this.b = new WeakReference<>(viewGroup);
    }

    @Override // xsna.fn2
    public final void a(boolean z) {
        this.f = z;
        b();
    }

    public final void b() {
        boolean z = this.e && this.f;
        if (this.c == z) {
            return;
        }
        this.c = z;
        if (z) {
            Choreographer.getInstance().postFrameCallback(this);
        } else {
            Choreographer.getInstance().removeFrameCallback(this);
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Choreographer.getInstance().postFrameCallback(this);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.d < this.g) {
            return;
        }
        this.d = elapsedRealtime;
        View view = this.b.get();
        if (view != null) {
            view.invalidate();
        }
    }
}
