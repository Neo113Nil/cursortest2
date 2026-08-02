package xsna;

import android.os.Build;
import android.view.ViewConfiguration;

/* compiled from: AndroidViewConfiguration.android.kt */
/* loaded from: classes11.dex */
public final class ud2 implements rut0 {
    public final ViewConfiguration a;

    public ud2(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // xsna.rut0
    public final float a() {
        int scaledHandwritingGestureLineMargin;
        if (Build.VERSION.SDK_INT < 34) {
            return 16.0f;
        }
        scaledHandwritingGestureLineMargin = this.a.getScaledHandwritingGestureLineMargin();
        return scaledHandwritingGestureLineMargin;
    }

    @Override // xsna.rut0
    public final long b() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // xsna.rut0
    public final long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // xsna.rut0
    public final float d() {
        int scaledHandwritingSlop;
        if (Build.VERSION.SDK_INT < 34) {
            return 2.0f;
        }
        scaledHandwritingSlop = this.a.getScaledHandwritingSlop();
        return scaledHandwritingSlop;
    }

    @Override // xsna.rut0
    public final float e() {
        return this.a.getScaledTouchSlop();
    }

    @Override // xsna.rut0
    public final float f() {
        return this.a.getScaledMinimumFlingVelocity();
    }

    @Override // xsna.rut0
    public final float h() {
        return this.a.getScaledMaximumFlingVelocity();
    }
}
