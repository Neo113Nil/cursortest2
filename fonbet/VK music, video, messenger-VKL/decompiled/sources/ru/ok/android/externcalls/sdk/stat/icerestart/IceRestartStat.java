package ru.ok.android.externcalls.sdk.stat.icerestart;

import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import xsna.gzs;

/* compiled from: IceRestartStat.kt */
/* loaded from: classes9.dex */
public final class IceRestartStat {
    private final gzs<CallEventualStatSender> getEventualStatSender;

    /* JADX WARN: Multi-variable type inference failed */
    public IceRestartStat(gzs<? extends CallEventualStatSender> gzsVar) {
        this.getEventualStatSender = gzsVar;
    }

    public final void onIceRestart() {
        CallEventualStatSender invoke = this.getEventualStatSender.invoke();
        if (invoke != null) {
            CallEventualStatSender.send$default(invoke, CallEventualStatName.ICE_RESTART, null, null, 6, null);
        }
    }
}
