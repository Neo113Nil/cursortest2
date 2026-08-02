package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import defpackage.cg2;

/* loaded from: classes10.dex */
public final class a extends cg2 {
    public final ObjectAnimator a;
    public final boolean b;

    public a(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        AnimatedStateListDrawableCompat.FrameInterpolator frameInterpolator = new AnimatedStateListDrawableCompat.FrameInterpolator(animationDrawable, z);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        ofInt.setAutoCancel(true);
        ofInt.setDuration(frameInterpolator.getTotalDuration());
        ofInt.setInterpolator(frameInterpolator);
        this.b = z2;
        this.a = ofInt;
    }

    @Override // defpackage.cg2
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.cg2
    public final void b() {
        this.a.reverse();
    }

    @Override // defpackage.cg2
    public final void c() {
        this.a.start();
    }

    @Override // defpackage.cg2
    public final void d() {
        this.a.cancel();
    }
}
