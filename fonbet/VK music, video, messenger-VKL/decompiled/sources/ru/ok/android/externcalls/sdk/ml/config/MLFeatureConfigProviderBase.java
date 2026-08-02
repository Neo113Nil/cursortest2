package ru.ok.android.externcalls.sdk.ml.config;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;
import ru.ok.android.externcalls.sdk.config.BaseConfigProvider;
import ru.ok.android.externcalls.sdk.ext.JsonExtKt;
import ru.ok.android.webrtc.RTCLog;
import xsna.zcl;

/* compiled from: MLFeatureConfigProviderBase.kt */
/* loaded from: classes9.dex */
public abstract class MLFeatureConfigProviderBase extends BaseConfigProvider<MLFeatureConfig> implements MLFeatureConfigProvider {

    @Deprecated
    public static final String CHECKSUM_KEY = "cs";
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String ENABLED_KEY = "use";

    @Deprecated
    public static final String LOG_TAG = "MLFeatureConfigProviderBase";

    @Deprecated
    public static final String URL_KEY = "url";

    /* compiled from: MLFeatureConfigProviderBase.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public MLFeatureConfigProviderBase(RemoteSettings remoteSettings, RTCLog rTCLog, String str) {
        super(remoteSettings, rTCLog, str, LOG_TAG);
    }

    @Override // ru.ok.android.externcalls.sdk.config.BaseConfigProvider
    public MLFeatureConfig parseConfig(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return new MLFeatureConfig(jSONObject.getString("url"), jSONObject.getString(CHECKSUM_KEY), JsonExtKt.getBooleanOrDefault(jSONObject, ENABLED_KEY, false));
    }
}
