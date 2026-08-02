package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.j18;
import defpackage.pey;
import defpackage.sls;
import kotlin.Result;

/* loaded from: classes.dex */
public final class l0 implements q {
    public final /* synthetic */ Lifecycle.State a;
    public final /* synthetic */ Lifecycle b;
    public final /* synthetic */ j18 c;
    public final /* synthetic */ sls w;

    public l0(Lifecycle.State state, Lifecycle lifecycle, j18 j18Var, sls slsVar) {
        this.a = state;
        this.b = lifecycle;
        this.c = j18Var;
        this.w = slsVar;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        Object failure;
        Lifecycle.Event.Companion.getClass();
        Lifecycle.Event c = l.c(this.a);
        j18 j18Var = this.c;
        Lifecycle lifecycle = this.b;
        if (event != c) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                lifecycle.d(this);
                j18Var.resumeWith(new Result.Failure(new LifecycleDestroyedException()));
                return;
            }
            return;
        }
        lifecycle.d(this);
        try {
            failure = this.w.invoke();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        j18Var.resumeWith(failure);
    }
}
