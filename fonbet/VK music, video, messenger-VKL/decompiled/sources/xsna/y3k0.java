package xsna;

import android.animation.TimeInterpolator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class y3k0 implements TimeInterpolator {
    public final /* synthetic */ b4k0 a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return 0.5f - (((float) Math.cos(f * 3.1415927f)) * 0.5f);
    }
}
