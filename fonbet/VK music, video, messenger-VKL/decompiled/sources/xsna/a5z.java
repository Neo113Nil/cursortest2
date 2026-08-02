package xsna;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: LifecycleLifecycle.java */
/* loaded from: classes12.dex */
public final class a5z implements x3z, e5z {

    @NonNull
    public final HashSet b = new HashSet();

    @NonNull
    public final Lifecycle c;

    public a5z(Lifecycle lifecycle) {
        this.c = lifecycle;
        lifecycle.addObserver(this);
    }

    @Override // xsna.x3z
    public final void i(@NonNull c5z c5zVar) {
        this.b.add(c5zVar);
        Lifecycle lifecycle = this.c;
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            c5zVar.onDestroy();
        } else if (lifecycle.getCurrentState().a(Lifecycle.State.STARTED)) {
            c5zVar.onStart();
        } else {
            c5zVar.onStop();
        }
    }

    @Override // xsna.x3z
    public final void j(@NonNull c5z c5zVar) {
        this.b.remove(c5zVar);
    }

    @androidx.lifecycle.o(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(@NonNull f5z f5zVar) {
        Iterator it = s2r0.e(this.b).iterator();
        while (it.hasNext()) {
            ((c5z) it.next()).onDestroy();
        }
        f5zVar.getLifecycle().removeObserver(this);
    }

    @androidx.lifecycle.o(Lifecycle.Event.ON_START)
    public void onStart(@NonNull f5z f5zVar) {
        Iterator it = s2r0.e(this.b).iterator();
        while (it.hasNext()) {
            ((c5z) it.next()).onStart();
        }
    }

    @androidx.lifecycle.o(Lifecycle.Event.ON_STOP)
    public void onStop(@NonNull f5z f5zVar) {
        Iterator it = s2r0.e(this.b).iterator();
        while (it.hasNext()) {
            ((c5z) it.next()).onStop();
        }
    }
}
