package ru.ok.android.externcalls.sdk.stat.candidate;

import org.json.JSONObject;
import org.webrtc.CandidatePairChangeEvent;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import ru.ok.android.webrtc.utils.MiscHelper;
import xsna.gzs;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: IceCandidatePairChangedStat.kt */
/* loaded from: classes9.dex */
public final class IceCandidatePairChangedStat {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String KEY_LAST_DATA_RECEIVED_MS = "lastDataReceivedMs";

    @Deprecated
    public static final String KEY_REASON = "reason";
    private final gzs<CallEventualStatSender> getEventualStatSender;

    /* compiled from: IceCandidatePairChangedStat.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IceCandidatePairChangedStat(gzs<? extends CallEventualStatSender> gzsVar) {
        this.getEventualStatSender = gzsVar;
    }

    public final void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_LAST_DATA_RECEIVED_MS, candidatePairChangeEvent.lastDataReceivedMs);
        jSONObject.put("reason", candidatePairChangeEvent.reason);
        jSONObject.put("local", new JSONObject().put("sdp", candidatePairChangeEvent.local.sdp));
        jSONObject.put("remote", new JSONObject().put("sdp", candidatePairChangeEvent.remote.sdp));
        CallEventualStatSender invoke = this.getEventualStatSender.invoke();
        if (invoke != null) {
            EventItemValue eventItemValue = EventItemValueKt.toEventItemValue(jSONObject.toString());
            EventItemsMap eventItemsMap = new EventItemsMap();
            eventItemsMap.set(StatCustomFieldKey.LOCAL_ADDRESS, MiscHelper.getAddressFromIceCandidate(candidatePairChangeEvent.local));
            String addressFromIceCandidate = MiscHelper.getAddressFromIceCandidate(candidatePairChangeEvent.remote);
            if (addressFromIceCandidate == null) {
                addressFromIceCandidate = "";
            }
            eventItemsMap.set(StatCustomFieldKey.REMOTE_ADDRESS, addressFromIceCandidate);
            s3q0 s3q0Var = s3q0.a;
            invoke.send(CallEventualStatName.ICE_CANDIDATES_CHANGED, eventItemValue, eventItemsMap);
        }
    }
}
