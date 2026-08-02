package yads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* loaded from: classes10.dex */
public final class gq0 {
    public final View a;
    public final dq0 b;
    public final lb2 c;
    public final Handler d;
    public fq0 e;

    public gq0(Handler handler, ix1 ix1Var, dq0 dq0Var, lb2 lb2Var) {
        this.a = ix1Var;
        this.b = dq0Var;
        this.c = lb2Var;
        this.d = handler;
    }

    public /* synthetic */ gq0(ix1 ix1Var, dq0 dq0Var, lb2 lb2Var) {
        this(new Handler(Looper.getMainLooper()), ix1Var, dq0Var, lb2Var);
    }
}
