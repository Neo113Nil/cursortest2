package xsna;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutationInterruptedException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MutatorMutex.kt */
/* loaded from: classes11.dex */
public final class ni50 {
    public final AtomicReference<a> a = new AtomicReference<>(null);
    public final wi50 b = bay.a();

    /* compiled from: MutatorMutex.kt */
    public static final class a {
        public final MutatePriority a;
        public final eyx b;

        public a(MutatePriority mutatePriority, eyx eyxVar) {
            this.a = mutatePriority;
            this.b = eyxVar;
        }
    }

    public static final void a(ni50 ni50Var, a aVar) {
        AtomicReference<a> atomicReference = ni50Var.a;
        while (true) {
            a aVar2 = atomicReference.get();
            if (aVar2 != null && aVar.a.compareTo(aVar2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(aVar2, aVar)) {
                if (atomicReference.get() != aVar2) {
                    break;
                }
            }
            if (aVar2 != null) {
                aVar2.b.b(new MutationInterruptedException());
                return;
            }
            return;
        }
    }

    public final Object b(MutatePriority mutatePriority, izs izsVar, ContinuationImpl continuationImpl) {
        return zvj.d(new ki50(mutatePriority, this, izsVar, null), continuationImpl);
    }

    public final Object c(Object obj, MutatePriority mutatePriority, wzs wzsVar, SuspendLambda suspendLambda) {
        return zvj.d(new mi50(mutatePriority, this, wzsVar, obj, null), suspendLambda);
    }
}
