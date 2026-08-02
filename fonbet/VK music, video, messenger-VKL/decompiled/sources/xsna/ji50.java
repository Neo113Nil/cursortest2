package xsna;

import androidx.compose.animation.core.MutatePriority;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: InternalMutatorMutex.kt */
/* loaded from: classes11.dex */
public final class ji50 {
    public final AtomicReference<a> a = new AtomicReference<>(null);
    public final wi50 b = bay.a();

    /* compiled from: InternalMutatorMutex.kt */
    public static final class a {
        public final MutatePriority a;
        public final eyx b;

        public a(MutatePriority mutatePriority, eyx eyxVar) {
            this.a = mutatePriority;
            this.b = eyxVar;
        }
    }

    public static Object a(ji50 ji50Var, izs izsVar, spj spjVar) {
        MutatePriority mutatePriority = MutatePriority.Default;
        ji50Var.getClass();
        return zvj.d(new li50(mutatePriority, ji50Var, izsVar, null), spjVar);
    }
}
