package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class dd2 implements xp31 {
    public final ViewConfiguration a;

    public dd2(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.xp31
    public final long a() {
        return 40L;
    }

    @Override // defpackage.xp31
    public final float b() {
        if (Build.VERSION.SDK_INT >= 34) {
            return hwa1.d(this.a);
        }
        return 2.0f;
    }

    @Override // defpackage.xp31
    public final float c() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.xp31
    public final float d() {
        if (Build.VERSION.SDK_INT >= 34) {
            return hwa1.c(this.a);
        }
        return 16.0f;
    }

    @Override // defpackage.xp31
    public final long e() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.xp31
    public final long f() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.xp31
    public final float g() {
        return this.a.getScaledMinimumFlingVelocity();
    }

    @Override // defpackage.xp31
    public final float i() {
        return this.a.getScaledMaximumFlingVelocity();
    }
}
