package xsna;

import one.video.exo.diskcache.Action;

/* compiled from: ClipsDiskCacheStorage.kt */
/* loaded from: classes3.dex */
public final class brd implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        io.reactivex.rxjava3.subjects.e eVar = frd.a;
        z0d0 z0d0Var = frd.b;
        if (z0d0Var != null) {
            z0d0Var.c.obtainMessage(Action.CANCEL_ALL.ordinal()).sendToTarget();
        }
    }
}
