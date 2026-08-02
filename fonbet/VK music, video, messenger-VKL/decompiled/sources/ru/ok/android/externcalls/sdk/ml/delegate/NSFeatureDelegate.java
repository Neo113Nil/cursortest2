package ru.ok.android.externcalls.sdk.ml.delegate;

import android.content.Context;
import ru.ok.android.externcalls.sdk.ml.config.ns.NSFeatureConfigProvider;
import ru.ok.android.externcalls.sdk.ml.model.ExtensionRule;
import ru.ok.android.externcalls.sdk.ml.model.MLFeatureType;
import ru.ok.android.externcalls.sdk.ml.model.ModelSpec;
import ru.ok.android.externcalls.sdk.net.DownloadService;
import ru.ok.android.externcalls.sdk.stat.mldownload.MLDownloadStat;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.sharedprefs.MLFeaturesInfoDataSource;
import xsna.lhg;
import xsna.rl3;
import xsna.zcl;

/* compiled from: NSFeatureDelegate.kt */
/* loaded from: classes9.dex */
public final class NSFeatureDelegate extends MLFeatureDelegate {
    private static final String CONFIG_FILE_EXT = "cfg";
    public static final Companion Companion = new Companion(null);
    private static final String TFLITE_EXT = "tflite";
    private static final String VKMLMODEL_EXT = "vkmlmodel";

    /* compiled from: NSFeatureDelegate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final String getFeatureKeyByVersion(int i) {
            return lhg.a(i, "ns_");
        }

        private Companion() {
        }
    }

    public NSFeatureDelegate(MLFeaturesInfoDataSource mLFeaturesInfoDataSource, NSFeatureConfigProvider nSFeatureConfigProvider, DownloadService downloadService, MLDownloadStat mLDownloadStat, Context context, int i, RTCLog rTCLog) {
        super(mLFeaturesInfoDataSource, nSFeatureConfigProvider, downloadService, mLDownloadStat, MLFeatureType.NS, Companion.getFeatureKeyByVersion(i), rTCLog, context, new ModelSpec(rl3.y0(new ExtensionRule[]{new ExtensionRule.Required(CONFIG_FILE_EXT), new ExtensionRule.OneOf(rl3.y0(new String[]{VKMLMODEL_EXT, TFLITE_EXT}))}), 0L, 2, null));
    }

    public static final String getFeatureKeyByVersion(int i) {
        return Companion.getFeatureKeyByVersion(i);
    }
}
