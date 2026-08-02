package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.dvw;
import defpackage.g6u;
import defpackage.j18;
import defpackage.sls;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public abstract class m0 {
    public static final Object a(Lifecycle lifecycle, Lifecycle.State state, boolean z, g6u g6uVar, sls slsVar, ContinuationImpl continuationImpl) {
        j18 j18Var = new j18(1, dvw.b(continuationImpl));
        j18Var.u();
        l0 l0Var = new l0(state, lifecycle, j18Var, slsVar);
        if (z) {
            g6uVar.o(EmptyCoroutineContext.a, new j0(lifecycle, l0Var));
        } else {
            lifecycle.a(l0Var);
        }
        j18Var.w(new k0(g6uVar, lifecycle, l0Var));
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }
}
