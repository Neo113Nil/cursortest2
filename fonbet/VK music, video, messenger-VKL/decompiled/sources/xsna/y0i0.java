package xsna;

import com.vk.im.engine.models.sync.ImBgSyncMode;
import com.vk.im.engine.models.sync.SyncStartCause;
import com.vk.im.engine.models.sync.SyncStopCause;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import xsna.hg1;

/* compiled from: SecondaryMessagesSynchronizerImpl.kt */
/* loaded from: classes.dex */
public final class y0i0 implements w0i0 {
    public final a1w a;
    public io.reactivex.rxjava3.disposables.c b = EmptyDisposable.INSTANCE;
    public ImBgSyncMode c = ImBgSyncMode.FULL;

    public y0i0(a1w a1wVar) {
        this.a = a1wVar;
    }

    @Override // xsna.w0i0
    public final void a(SyncStopCause syncStopCause) {
        a1w a1wVar = this.a;
        if (a1wVar.r().h.i()) {
            this.b.dispose();
            this.b = EmptyDisposable.INSTANCE;
            a1wVar.A(syncStopCause.getId());
        }
    }

    @Override // xsna.w0i0
    public final void b(ImBgSyncMode imBgSyncMode, SyncStartCause syncStartCause) {
        this.c = imBgSyncMode;
        a1w a1wVar = this.a;
        if (a1wVar.r().h.i()) {
            if (this.b.h()) {
                this.b = new io.reactivex.rxjava3.internal.operators.observable.i0(a1wVar.l.a(), new hg1.q3()).U(new hg1.p3()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new k460(new ezc0(this, 1), 2), new c340(new x0i0(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 2));
            }
            if (a1wVar.u()) {
                a1wVar.z(this.c, syncStartCause.getId());
            }
        }
    }
}
