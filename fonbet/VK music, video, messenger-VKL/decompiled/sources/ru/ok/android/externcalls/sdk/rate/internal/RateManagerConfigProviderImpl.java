package ru.ok.android.externcalls.sdk.rate.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;
import ru.ok.android.externcalls.sdk.config.BaseConfigProvider;
import ru.ok.android.externcalls.sdk.ext.JsonExtKt;
import ru.ok.android.externcalls.sdk.rate.RateManagerConfig;
import ru.ok.android.externcalls.sdk.rate.RateManagerConfigProvider;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;
import ru.ok.android.externcalls.sdk.rate.loss.LossHintConfig;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;
import ru.ok.android.webrtc.RTCLog;
import xsna.e43;
import xsna.zcl;

/* compiled from: RateManagerConfigProviderImpl.kt */
/* loaded from: classes9.dex */
public final class RateManagerConfigProviderImpl extends BaseConfigProvider<RateManagerConfig> implements RateManagerConfigProvider {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String KEY_DIRECT_CANDIDATE_TYPE = "candidate_type";

    @Deprecated
    public static final String KEY_SERVER_CANDIDATE_TYPE = "candidate_type_s";

    @Deprecated
    public static final String LOG_TAG = "RateManager";

    /* compiled from: RateManagerConfigProviderImpl.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public RateManagerConfigProviderImpl(RemoteSettings remoteSettings, RTCLog rTCLog) {
        super(remoteSettings, rTCLog, "android.rating.limits", "RateManager");
    }

    private final void getAndPut(Map<String, Long> map, JSONObject jSONObject, String str) {
        Long longOrNull = JsonExtKt.getLongOrNull(jSONObject, str);
        if (longOrNull != null) {
            map.put(str, Long.valueOf(longOrNull.longValue()));
        }
    }

    private final CandidateTypeHintConfig getCandidateTypeConfig(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return new CandidateTypeHintConfig(null, 1, null);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = e43.l(CandidateTypeHintConfig.TYPE_HOST, CandidateTypeHintConfig.TYPE_RELAY, CandidateTypeHintConfig.TYPE_SRFLX, CandidateTypeHintConfig.TYPE_PRFLX).iterator();
        while (it.hasNext()) {
            getAndPut(linkedHashMap, optJSONObject, (String) it.next());
        }
        return new CandidateTypeHintConfig(linkedHashMap);
    }

    @Override // ru.ok.android.externcalls.sdk.config.BaseConfigProvider
    public RateManagerConfig parseConfig(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return new RateManagerConfig(new RttRateHintConfig(JsonExtKt.getLongOrNull(jSONObject, "rtt"), 0, 2, null), new LossHintConfig(JsonExtKt.getLongOrNull(jSONObject, LossHintConfig.AUDIO_LOSS), JsonExtKt.getLongOrNull(jSONObject, LossHintConfig.VIDEO_LOSS), 0, 0, 12, null), getCandidateTypeConfig(jSONObject, KEY_DIRECT_CANDIDATE_TYPE), getCandidateTypeConfig(jSONObject, KEY_SERVER_CANDIDATE_TYPE));
    }
}
