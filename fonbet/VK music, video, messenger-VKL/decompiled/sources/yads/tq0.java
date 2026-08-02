package yads;

import android.content.Context;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public final class tq0 implements uq0 {
    public final Context a;
    public final th2 b;
    public final uh2 c;

    public tq0(Context context, th2 th2Var, uh2 uh2Var) {
        this.a = context;
        this.b = th2Var;
        this.c = uh2Var;
    }

    @Override // yads.uq0
    public final Parcelable getValue() {
        uh2 uh2Var = this.c;
        Context context = this.a;
        th2 th2Var = this.b;
        uh2Var.getClass();
        return uh2.a(context, th2Var);
    }
}
