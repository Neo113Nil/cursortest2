package ru.ok.android.externcalls.sdk.p2prelay;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;
import ru.ok.android.externcalls.sdk.config.BaseConfigProvider;
import ru.ok.android.externcalls.sdk.ext.JsonExtKt;
import ru.ok.android.webrtc.RTCLog;
import xsna.zcl;

/* compiled from: P2PRelaySwitchConfigProviderImpl.kt */
/* loaded from: classes9.dex */
public final class P2PRelaySwitchConfigProviderImpl extends BaseConfigProvider<P2PRelaySwitchConfig> implements P2PRelaySwitchConfigProvider {
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_RTT_VIOLATION_COUNT = 1;
    private static final String LOG_TAG = "P2PRelaySwitchConfigProviderImpl";
    private static final String RTT_KEY = "rtt";
    private static final String RTT_VIOLATION_COUNT_KEY = "rtt_violation_count";

    /* compiled from: P2PRelaySwitchConfigProviderImpl.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public P2PRelaySwitchConfigProviderImpl(RemoteSettings remoteSettings, RTCLog rTCLog) {
        super(remoteSettings, rTCLog, "android.p2prelay.config", LOG_TAG);
    }

    @Override // ru.ok.android.externcalls.sdk.config.BaseConfigProvider
    public P2PRelaySwitchConfig parseConfig(String str) {
        JSONObject jSONObject = new JSONObject(str);
        Long longOrNull = JsonExtKt.getLongOrNull(jSONObject, "rtt");
        Integer intOrNull = JsonExtKt.getIntOrNull(jSONObject, RTT_VIOLATION_COUNT_KEY);
        return new P2PRelaySwitchConfig(longOrNull, intOrNull != null ? intOrNull.intValue() : 1);
    }
}
