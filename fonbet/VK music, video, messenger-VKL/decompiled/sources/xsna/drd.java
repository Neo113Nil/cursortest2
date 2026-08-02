package xsna;

import android.content.Context;
import one.video.exo.diskcache.Action;
import xsna.bx8;

/* compiled from: ClipsDiskCacheStorage.kt */
/* loaded from: classes3.dex */
public final class drd implements Runnable {
    public final /* synthetic */ Context b;
    public final /* synthetic */ dbn c;

    public drd(Context context, dbn dbnVar) {
        this.b = context;
        this.c = dbnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z0d0 z0d0Var = frd.b;
        if (z0d0Var == null || !z0d0Var.d) {
            return;
        }
        z0d0Var.c.obtainMessage(Action.DOWNLOAD.ordinal(), new h8o(this.b, this.c, new bx8.a(frd.d.a))).sendToTarget();
    }
}
