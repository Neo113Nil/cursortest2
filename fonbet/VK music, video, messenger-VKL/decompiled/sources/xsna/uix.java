package xsna;

import androidx.compose.foundation.MutatePriority;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: InternalMutatorMutex.kt */
/* loaded from: classes17.dex */
public final class uix {
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
}
