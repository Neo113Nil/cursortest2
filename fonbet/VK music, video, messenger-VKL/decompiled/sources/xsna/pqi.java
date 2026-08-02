package xsna;

import android.os.CancellationSignal;
import kotlin.jvm.internal.Lambda;

/* compiled from: ComposeScrollCaptureCallback.android.kt */
/* loaded from: classes11.dex */
public final class pqi extends Lambda implements izs<Throwable, s3q0> {
    final /* synthetic */ CancellationSignal $signal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqi(CancellationSignal cancellationSignal) {
        super(1);
        this.$signal = cancellationSignal;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Throwable th) {
        if (th != null) {
            this.$signal.cancel();
        }
        return s3q0.a;
    }
}
