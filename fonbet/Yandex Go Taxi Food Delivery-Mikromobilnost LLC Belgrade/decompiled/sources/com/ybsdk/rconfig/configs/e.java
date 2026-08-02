package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.PollingStrategyConfig;
import defpackage.dfr;

/* loaded from: classes9.dex */
public abstract class e {
    public static final dfr a = new dfr("yb_mobile_common_polling_interval_type", Types.newParameterizedType(CommonExperiment.class, PollingStrategyConfig.class), new CommonExperiment(new PollingStrategyConfig(PollingStrategyConfig.IntervalType.CONST), ExperimentApplyType.LATEST));
}
