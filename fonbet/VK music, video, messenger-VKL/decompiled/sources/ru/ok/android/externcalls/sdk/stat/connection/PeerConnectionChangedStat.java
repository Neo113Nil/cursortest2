package ru.ok.android.externcalls.sdk.stat.connection;

import java.util.Locale;
import org.webrtc.PeerConnection;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: PeerConnectionChangedStat.kt */
/* loaded from: classes9.dex */
public final class PeerConnectionChangedStat {
    private final gzs<CallEventualStatSender> getEventualStatSender;

    /* JADX WARN: Multi-variable type inference failed */
    public PeerConnectionChangedStat(gzs<? extends CallEventualStatSender> gzsVar) {
        this.getEventualStatSender = gzsVar;
    }

    public final void onStateChanged(PeerConnection.PeerConnectionState peerConnectionState, boolean z) {
        CallEventualStatSender invoke = this.getEventualStatSender.invoke();
        if (invoke != null) {
            EventItemsMap eventItemsMap = new EventItemsMap();
            eventItemsMap.set(StatCustomFieldKey.CONNECTION_STATE, EventItemValueKt.toEventItemValue(peerConnectionState.name().toLowerCase(Locale.ROOT)));
            eventItemsMap.set(StatCustomFieldKey.P2P_RELAY, String.valueOf(z));
            s3q0 s3q0Var = s3q0.a;
            CallEventualStatSender.send$default(invoke, CallEventualStatName.CONNECTION_STATE_CHANGED, null, eventItemsMap, 2, null);
        }
    }
}
