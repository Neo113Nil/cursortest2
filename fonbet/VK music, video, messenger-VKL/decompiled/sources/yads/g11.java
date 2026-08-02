package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public abstract class g11 extends nn implements f4 {
    public final z9 c;

    public g11(Context context, v9 v9Var) {
        this(context, v9Var, new z9());
    }

    @Override // yads.nn
    public final synchronized void b() {
        this.c.a(null);
    }

    public g11(Context context, v9 v9Var, z9 z9Var) {
        super(context, v9Var);
        this.c = z9Var;
        z9Var.a(this);
    }
}
