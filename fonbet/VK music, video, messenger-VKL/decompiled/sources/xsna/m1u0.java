package xsna;

import android.view.animation.Interpolator;

/* compiled from: ViewTransition.java */
/* loaded from: classes11.dex */
public final class m1u0 implements Interpolator {
    public final /* synthetic */ guo a;

    public m1u0(guo guoVar) {
        this.a = guoVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) this.a.a(f);
    }
}
