package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.YbCommonBackoffPollingStrategyConfig;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public abstract class fr51 {
    public static final dfr a = new dfr("yb_mobile_common_polling_strategy_config", Types.newParameterizedType(CommonExperiment.class, YbCommonBackoffPollingStrategyConfig.class), new CommonExperiment(new YbCommonBackoffPollingStrategyConfig(b.f()), ExperimentApplyType.LATEST));
}
