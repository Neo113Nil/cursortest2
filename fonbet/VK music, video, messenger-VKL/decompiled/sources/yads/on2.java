package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class on2 {
    public final lg0 a;
    public final Context b;

    public /* synthetic */ on2(Context context) {
        this(context, new lg0());
    }

    public final mm1 a() {
        return kg0.d == this.a.a(this.b) ? new mm1(1920, 1080, 6800) : new mm1(854, 480, 1000);
    }

    public on2(Context context, lg0 lg0Var) {
        this.a = lg0Var;
        this.b = context.getApplicationContext();
    }
}
