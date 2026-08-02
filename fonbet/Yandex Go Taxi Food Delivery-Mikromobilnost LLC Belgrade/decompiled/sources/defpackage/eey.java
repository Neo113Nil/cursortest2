package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.w;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class eey implements gdy, oey {
    public final HashSet a = new HashSet();
    public final Lifecycle b;

    public eey(Lifecycle lifecycle) {
        this.b = lifecycle;
        lifecycle.a(this);
    }

    @Override // defpackage.gdy
    public final void a(hey heyVar) {
        this.a.add(heyVar);
        Lifecycle lifecycle = this.b;
        if (lifecycle.b() == Lifecycle.State.DESTROYED) {
            heyVar.onDestroy();
        } else if (lifecycle.b().a(Lifecycle.State.STARTED)) {
            heyVar.onStart();
        } else {
            heyVar.onStop();
        }
    }

    @Override // defpackage.gdy
    public final void c(hey heyVar) {
        this.a.remove(heyVar);
    }

    @w(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(pey peyVar) {
        Iterator it = pw21.i(this.a).iterator();
        while (it.hasNext()) {
            ((hey) it.next()).onDestroy();
        }
        peyVar.getLifecycle().d(this);
    }

    @w(Lifecycle.Event.ON_START)
    public void onStart(pey peyVar) {
        Iterator it = pw21.i(this.a).iterator();
        while (it.hasNext()) {
            ((hey) it.next()).onStart();
        }
    }

    @w(Lifecycle.Event.ON_STOP)
    public void onStop(pey peyVar) {
        Iterator it = pw21.i(this.a).iterator();
        while (it.hasNext()) {
            ((hey) it.next()).onStop();
        }
    }
}
