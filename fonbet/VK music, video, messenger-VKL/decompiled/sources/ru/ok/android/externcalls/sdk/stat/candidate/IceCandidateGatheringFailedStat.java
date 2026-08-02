package ru.ok.android.externcalls.sdk.stat.candidate;

import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.ice.IceCandidateGatheringFailedEvent;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: IceCandidateGatheringFailedStat.kt */
/* loaded from: classes9.dex */
public final class IceCandidateGatheringFailedStat {
    private final gzs<CallEventualStatSender> getEventualStatSender;

    /* JADX WARN: Multi-variable type inference failed */
    public IceCandidateGatheringFailedStat(gzs<? extends CallEventualStatSender> gzsVar) {
        this.getEventualStatSender = gzsVar;
    }

    public final void report(IceCandidateGatheringFailedEvent iceCandidateGatheringFailedEvent) {
        CallEventualStatSender invoke = this.getEventualStatSender.invoke();
        if (invoke != null) {
            EventItemValue eventItemValue = EventItemValueKt.toEventItemValue(iceCandidateGatheringFailedEvent.getCode());
            EventItemsMap eventItemsMap = new EventItemsMap();
            eventItemsMap.set("string_value", iceCandidateGatheringFailedEvent.getDescription());
            eventItemsMap.set(StatCustomFieldKey.LOCAL_ADDRESS, iceCandidateGatheringFailedEvent.getLocalAddress());
            eventItemsMap.set(StatCustomFieldKey.REMOTE_URL, iceCandidateGatheringFailedEvent.getRemoteUrl());
            String transportType = iceCandidateGatheringFailedEvent.getTransportType();
            if (transportType != null) {
                eventItemsMap.set("transport", transportType);
            }
            s3q0 s3q0Var = s3q0.a;
            invoke.send(CallEventualStatName.ICE_CANDIDATE_GATHERING_FAILED, eventItemValue, eventItemsMap);
        }
    }
}
