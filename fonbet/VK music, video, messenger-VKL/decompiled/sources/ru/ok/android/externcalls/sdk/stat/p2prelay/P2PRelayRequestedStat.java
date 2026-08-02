package ru.ok.android.externcalls.sdk.stat.p2prelay;

import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import xsna.gzs;

/* compiled from: P2PRelayRequestedStat.kt */
/* loaded from: classes9.dex */
public final class P2PRelayRequestedStat {
    private final gzs<CallEventualStatSender> getEventualStatSender;

    /* JADX WARN: Multi-variable type inference failed */
    public P2PRelayRequestedStat(gzs<? extends CallEventualStatSender> gzsVar) {
        this.getEventualStatSender = gzsVar;
    }

    public final void onP2PRelayRequested(P2PRelayRequestReason p2PRelayRequestReason) {
        CallEventualStatSender invoke = this.getEventualStatSender.invoke();
        if (invoke != null) {
            CallEventualStatSender.send$default(invoke, CallEventualStatName.CLIENT_REQUESTED_P2P_RELAY, EventItemValueKt.toEventItemValue(p2PRelayRequestReason.asStatString()), null, 4, null);
        }
    }
}
