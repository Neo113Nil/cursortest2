package xsna;

import android.animation.TimeInterpolator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class db9 implements TimeInterpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (((float) Math.pow(9.0f, f)) - 1) / 8.0f;
    }
}
