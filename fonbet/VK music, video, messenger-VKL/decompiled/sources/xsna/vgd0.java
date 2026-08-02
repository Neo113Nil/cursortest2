package xsna;

import androidx.lifecycle.Lifecycle;
import xsna.ha80;

/* compiled from: ProcessRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class vgd0 implements ugd0 {
    public vgd0(rte0 rte0Var) {
    }

    @Override // xsna.ugd0
    public final void a(ha80.a aVar) {
        androidx.lifecycle.m mVar = androidx.lifecycle.q.j.g;
        if (mVar.d.a(Lifecycle.State.STARTED)) {
            aVar.invoke();
        }
        mVar.addObserver(new mgd0(aVar));
    }
}
