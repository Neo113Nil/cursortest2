package defpackage;

import android.content.Context;
import android.view.Choreographer;
import android.view.animation.LinearInterpolator;

/* loaded from: classes15.dex */
public final class aaz0 {
    public final Context a;
    public final qbz0 b;
    public long e;
    public float f;
    public boolean h;
    public final Choreographer c = Choreographer.getInstance();
    public final esb d = new esb(2, this);
    public final LinearInterpolator g = new LinearInterpolator();

    public aaz0(Context context, qbz0 qbz0Var) {
        this.a = context;
        this.b = qbz0Var;
    }
}
