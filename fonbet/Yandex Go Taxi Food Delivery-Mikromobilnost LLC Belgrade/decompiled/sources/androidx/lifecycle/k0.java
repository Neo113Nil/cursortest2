package androidx.lifecycle;

import defpackage.do91;
import defpackage.jse;
import defpackage.tls;
import defpackage.zy11;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes.dex */
public final class k0 implements tls {
    public final /* synthetic */ jse a;
    public final /* synthetic */ Lifecycle b;
    public final /* synthetic */ l0 c;

    public k0(jse jseVar, Lifecycle lifecycle, l0 l0Var) {
        this.a = jseVar;
        this.b = lifecycle;
        this.c = l0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        jse jseVar = this.a;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.a;
        boolean G = jseVar.G(emptyCoroutineContext);
        l0 l0Var = this.c;
        Lifecycle lifecycle = this.b;
        if (G) {
            jseVar.o(emptyCoroutineContext, new do91(17, lifecycle, l0Var));
        } else {
            lifecycle.d(l0Var);
        }
        return zy11.a;
    }
}
