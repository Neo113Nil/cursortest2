package androidx.compose.foundation;

import defpackage.bvf0;
import defpackage.c050;
import defpackage.gtq0;
import defpackage.tls;
import defpackage.wls;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes10.dex */
public final class j {
    public final AtomicReference a = new AtomicReference(null);
    public final kotlinx.coroutines.sync.a b = gtq0.a();

    public static final void a(j jVar, c050 c050Var) {
        AtomicReference atomicReference = jVar.a;
        while (true) {
            c050 c050Var2 = (c050) atomicReference.get();
            if (c050Var2 != null && c050Var.a.compareTo(c050Var2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(c050Var2, c050Var)) {
                if (atomicReference.get() != c050Var2) {
                    break;
                }
            }
            if (c050Var2 != null) {
                c050Var2.b.a(new MutationInterruptedException());
                return;
            }
            return;
        }
    }

    public final Object b(MutatePriority mutatePriority, tls tlsVar, Continuation continuation) {
        return bvf0.n(new MutatorMutex$mutate$2(mutatePriority, this, tlsVar, null), continuation);
    }

    public final Object c(Object obj, MutatePriority mutatePriority, wls wlsVar, SuspendLambda suspendLambda) {
        return bvf0.n(new MutatorMutex$mutateWith$2(mutatePriority, this, wlsVar, obj, null), suspendLambda);
    }
}
