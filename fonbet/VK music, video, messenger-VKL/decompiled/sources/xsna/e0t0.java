package xsna;

import android.app.Activity;
import xsna.c63;

/* compiled from: VideoOfflineManagerImplOld.kt */
/* loaded from: classes.dex */
public final class e0t0 extends c63.b {
    public final /* synthetic */ io.reactivex.rxjava3.subjects.d<Boolean> b;

    public e0t0(io.reactivex.rxjava3.subjects.d<Boolean> dVar) {
        this.b = dVar;
    }

    @Override // xsna.c63.b
    public final void u() {
        this.b.onNext(Boolean.FALSE);
    }

    @Override // xsna.c63.b
    public final void x(Activity activity) {
        this.b.onNext(Boolean.TRUE);
    }
}
