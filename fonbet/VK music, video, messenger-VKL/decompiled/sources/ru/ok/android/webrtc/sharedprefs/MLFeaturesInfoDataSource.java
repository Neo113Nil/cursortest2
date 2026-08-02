package ru.ok.android.webrtc.sharedprefs;

import android.content.Context;
import ru.ok.android.webrtc.RTCLog;
import xsna.gzs;
import xsna.ozy0;

/* loaded from: classes9.dex */
public interface MLFeaturesInfoDataSource extends PersistentDataSource {
    public static final /* synthetic */ ozy0 Companion = ozy0.a;

    @Deprecated
    public static final String NAME = "ml_features";

    public static final class Impl extends PersistentDataSourceImpl implements MLFeaturesInfoDataSource {
        public Impl(gzs<? extends RTCLog> gzsVar, Context context) {
            super(gzsVar, context, MLFeaturesInfoDataSource.NAME);
        }
    }
}
