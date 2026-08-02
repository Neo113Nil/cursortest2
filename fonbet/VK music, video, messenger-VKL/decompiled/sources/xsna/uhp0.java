package xsna;

import android.content.Context;

/* compiled from: Trackers.kt */
/* loaded from: classes.dex */
public final class uhp0 {
    public final Context a;
    public final jv6 b;
    public final nv6 c;
    public final v560 d;
    public final khl0 e;

    public uhp0() {
        throw null;
    }

    public uhp0(Context context, hwx0 hwx0Var) {
        jv6 jv6Var = new jv6(context.getApplicationContext(), hwx0Var);
        nv6 nv6Var = new nv6(context.getApplicationContext(), hwx0Var);
        Context applicationContext = context.getApplicationContext();
        String str = w560.a;
        v560 v560Var = new v560(applicationContext, hwx0Var);
        khl0 khl0Var = new khl0(context.getApplicationContext(), hwx0Var);
        this.a = context;
        this.b = jv6Var;
        this.c = nv6Var;
        this.d = v560Var;
        this.e = khl0Var;
    }
}
