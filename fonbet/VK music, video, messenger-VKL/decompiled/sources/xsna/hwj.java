package xsna;

import android.os.CancellationSignal;

/* compiled from: CoroutinesRoom.android.kt */
/* loaded from: classes12.dex */
public final class hwj implements izs<Throwable, s3q0> {
    public final /* synthetic */ CancellationSignal b;
    public final /* synthetic */ yok0 c;

    public hwj(CancellationSignal cancellationSignal, yok0 yok0Var) {
        this.b = cancellationSignal;
        this.c = yok0Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Throwable th) {
        CancellationSignal cancellationSignal = this.b;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        this.c.b(null);
        return s3q0.a;
    }
}
