package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.YbFullscreenLimitationsConfig;

/* loaded from: classes9.dex */
public abstract class es51 {
    public static final dfr a = new dfr("yb_mobile_fullscreen_limitations_config", Types.newParameterizedType(CommonExperiment.class, YbFullscreenLimitationsConfig.class), new CommonExperiment(new YbFullscreenLimitationsConfig(30), ExperimentApplyType.LATEST));
}
