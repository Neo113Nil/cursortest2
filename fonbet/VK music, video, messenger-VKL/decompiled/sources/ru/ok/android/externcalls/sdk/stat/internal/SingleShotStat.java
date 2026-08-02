package ru.ok.android.externcalls.sdk.stat.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: SingleShotStat.kt */
/* loaded from: classes9.dex */
public abstract class SingleShotStat {
    private final gzs<CallEventualStatSender> getEventualStatSender;
    private final AtomicBoolean isReported = new AtomicBoolean(false);

    /* JADX WARN: Multi-variable type inference failed */
    public SingleShotStat(gzs<? extends CallEventualStatSender> gzsVar) {
        this.getEventualStatSender = gzsVar;
    }

    public final void reportOnce(izs<? super CallEventualStatSender, s3q0> izsVar) {
        CallEventualStatSender invoke;
        if (!this.isReported.compareAndSet(false, true) || (invoke = this.getEventualStatSender.invoke()) == null) {
            return;
        }
        izsVar.invoke(invoke);
    }
}
