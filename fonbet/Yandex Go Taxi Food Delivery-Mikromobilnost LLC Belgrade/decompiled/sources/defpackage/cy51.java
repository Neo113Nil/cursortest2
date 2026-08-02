package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.YbUiStatEventConfig;

/* loaded from: classes9.dex */
public abstract class cy51 {
    public static final dfr a = new dfr("yb_mobile_ui_stat_event_config", Types.newParameterizedType(CommonExperiment.class, YbUiStatEventConfig.class), new CommonExperiment(new YbUiStatEventConfig(500, 1000), ExperimentApplyType.HOT_START));
}
