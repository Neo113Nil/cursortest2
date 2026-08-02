package xsna;

import android.view.animation.Interpolator;

/* compiled from: MotionController.java */
/* loaded from: classes11.dex */
public final class da30 implements Interpolator {
    public final /* synthetic */ guo a;

    public da30(guo guoVar) {
        this.a = guoVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) this.a.a(f);
    }
}
