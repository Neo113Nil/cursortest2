package androidx.lifecycle;

import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;

/* loaded from: classes.dex */
public abstract class o implements tse {
    public abstract Lifecycle a();

    public final void b(wls wlsVar) {
        tje.N(this, null, null, new LifecycleCoroutineScope$launchWhenCreated$1(this, wlsVar, null), 3);
    }

    public final pzt0 c(wls wlsVar) {
        return tje.N(this, null, null, new LifecycleCoroutineScope$launchWhenResumed$1(this, wlsVar, null), 3);
    }

    public final void d(wls wlsVar) {
        tje.N(this, null, null, new LifecycleCoroutineScope$launchWhenStarted$1(this, wlsVar, null), 3);
    }
}
