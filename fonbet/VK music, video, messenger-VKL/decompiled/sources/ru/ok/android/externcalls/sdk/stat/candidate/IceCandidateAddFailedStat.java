package ru.ok.android.externcalls.sdk.stat.candidate;

import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.ice.IceCandidateAddFailedEvent;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: IceCandidateAddFailedStat.kt */
/* loaded from: classes9.dex */
public final class IceCandidateAddFailedStat {
    private final gzs<CallEventualStatSender> getEventualStatSender;

    /* JADX WARN: Multi-variable type inference failed */
    public IceCandidateAddFailedStat(gzs<? extends CallEventualStatSender> gzsVar) {
        this.getEventualStatSender = gzsVar;
    }

    public final void report(IceCandidateAddFailedEvent iceCandidateAddFailedEvent) {
        CallEventualStatSender invoke = this.getEventualStatSender.invoke();
        if (invoke != null) {
            EventItemValue eventItemValue = EventItemValueKt.toEventItemValue(iceCandidateAddFailedEvent.getCode());
            EventItemsMap eventItemsMap = new EventItemsMap();
            eventItemsMap.set("string_value", iceCandidateAddFailedEvent.getDescription());
            eventItemsMap.set(StatCustomFieldKey.REMOTE_URL, iceCandidateAddFailedEvent.getRemoteIceCandidate());
            s3q0 s3q0Var = s3q0.a;
            invoke.send(CallEventualStatName.ICE_CANDIDATE_ADD_FAILED, eventItemValue, eventItemsMap);
        }
    }
}
