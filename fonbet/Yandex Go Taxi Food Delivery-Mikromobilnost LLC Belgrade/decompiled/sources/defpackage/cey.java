package defpackage;

import androidx.lifecycle.Lifecycle;
import java.util.Collections;

/* loaded from: classes9.dex */
public abstract class cey {
    public static final k20 a(Lifecycle lifecycle, Lifecycle.Event event, Runnable runnable) {
        zdy zdyVar = new zdy(Collections.singleton(event), runnable, lifecycle);
        lifecycle.a(zdyVar);
        return new k20(2, lifecycle, zdyVar);
    }

    public static final k20 b(Lifecycle lifecycle, Lifecycle.Event event, Runnable runnable) {
        aey aeyVar = new aey(Collections.singleton(event), runnable, lifecycle);
        lifecycle.a(aeyVar);
        return new k20(3, lifecycle, aeyVar);
    }

    public static final g18 c(Lifecycle lifecycle, Lifecycle.State state, Runnable runnable) {
        if (lifecycle.b().a(state)) {
            runnable.run();
        } else if (lifecycle.b() != Lifecycle.State.DESTROYED) {
            bey beyVar = new bey(state, runnable);
            lifecycle.a(beyVar);
            return new l30(7, lifecycle, beyVar);
        }
        return g18.u1;
    }
}
