package xsna;

import android.view.Choreographer;
import android.view.View;
import android.widget.ProgressBar;
import kotlin.LazyThreadSafetyMode;

/* compiled from: AnimatedSnappedProgressDelegate.kt */
/* loaded from: classes2.dex */
public final class vl2 implements p7f0<ProgressBar, Integer>, View.OnAttachStateChangeListener {
    public final pod0 b;
    public long c;
    public boolean f;
    public int d = -1;
    public int e = -1;
    public final Object g = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.ui.o0(3));
    public final ul2 h = new ul2(this);

    public vl2(pod0 pod0Var) {
        this.b = pod0Var;
    }

    @Override // xsna.i7f0
    public final Object getValue(Object obj, qcy qcyVar) {
        return Integer.valueOf(this.d);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f) {
            this.f = false;
            ((Choreographer) this.g.getValue()).removeFrameCallback(this.h);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.p7f0
    public final void setValue(ProgressBar progressBar, qcy qcyVar, Integer num) {
        ProgressBar progressBar2 = progressBar;
        int intValue = num.intValue();
        if (this.d < 0) {
            this.d = progressBar2.getProgress();
        }
        this.e = intValue;
        if (this.f) {
            return;
        }
        this.f = true;
        this.c = System.nanoTime();
        ((Choreographer) this.g.getValue()).postFrameCallback(this.h);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
