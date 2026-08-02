package defpackage;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;

/* loaded from: classes11.dex */
public abstract class a710 {
    public final PathInterpolator a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
    public final View b;
    public final int c;
    public final int d;
    public final int e;
    public je4 f;

    public a710(View view) {
        this.b = view;
        Context context = view.getContext();
        this.c = kp50.O(context, eng0.motionDurationMedium2, 300);
        this.d = kp50.O(context, eng0.motionDurationShort3, 150);
        this.e = kp50.O(context, eng0.motionDurationShort2, 100);
    }
}
