package ru.ok.android.externcalls.sdk.api;

import io.reactivex.rxjava3.core.x;
import java.util.Set;
import ru.ok.android.externcalls.sdk.ml.config.ns.NSFeatureConfigProvider;
import xsna.izi0;
import xsna.rl3;

/* compiled from: RemoteSettings.kt */
/* loaded from: classes9.dex */
public interface RemoteSettings {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String KEY_BITRATE_DUMP = "android.dump.bitrate";
    public static final String KEY_ML_FEATURES = "android.mlfeatures.%s";
    public static final String KEY_RATING_LIMITS = "android.rating.limits";
    public static final String KEY_WEBRTC_STAT = "android.webrtc.stats";
    public static final String P2P_RELAY_SWITCH_CONFIG = "android.p2prelay.config";

    static Set<String> getKeys() {
        return Companion.getKeys();
    }

    x<String> get(String str);

    void release();

    /* compiled from: RemoteSettings.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String KEY_BITRATE_DUMP = "android.dump.bitrate";
        public static final String KEY_ML_FEATURES = "android.mlfeatures.%s";
        private static final String KEY_PLATFORM = "android";
        public static final String KEY_RATING_LIMITS = "android.rating.limits";
        public static final String KEY_WEBRTC_STAT = "android.webrtc.stats";
        public static final String P2P_RELAY_SWITCH_CONFIG = "android.p2prelay.config";

        private Companion() {
        }

        public final Set<String> getKeys() {
            return izi0.j(rl3.y0(new String[]{"android.dump.bitrate", "android.rating.limits", "android.p2prelay.config", "android.webrtc.stats"}), NSFeatureConfigProvider.Companion.getFeatureKeys());
        }

        public static /* synthetic */ void getKeys$annotations() {
        }
    }
}
