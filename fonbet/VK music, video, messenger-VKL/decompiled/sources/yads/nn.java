package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public abstract class nn implements mu {
    public final Context a;
    public final v9 b;

    public nn(Context context, v9 v9Var) {
        this.a = context;
        this.b = v9Var;
    }

    @Override // yads.mu
    public final synchronized boolean a() {
        return false;
    }

    public abstract void b();

    public void c() {
        b();
        getClass().toString();
    }
}
