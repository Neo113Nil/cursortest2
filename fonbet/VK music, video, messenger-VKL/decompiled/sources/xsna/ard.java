package xsna;

import one.video.exo.diskcache.Action;

/* compiled from: ClipsDiskCacheStorage.kt */
/* loaded from: classes3.dex */
public final class ard implements Runnable {
    public final /* synthetic */ dbn b;

    public ard(dbn dbnVar) {
        this.b = dbnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z0d0 z0d0Var;
        io.reactivex.rxjava3.subjects.e eVar = frd.a;
        if (frd.a() && (z0d0Var = frd.b) != null && z0d0Var.d) {
            z0d0Var.c.obtainMessage(Action.CANCEL.ordinal(), this.b.d).sendToTarget();
        }
    }
}
