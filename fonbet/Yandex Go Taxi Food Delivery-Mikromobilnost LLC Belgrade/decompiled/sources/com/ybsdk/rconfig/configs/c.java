package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.TransfersContactsFuzzySearchConfig;
import defpackage.dfr;
import defpackage.scc;

/* loaded from: classes9.dex */
public abstract class c {
    public static final dfr a = new dfr("yb_mobile_transfers_contacts_fuzzy_search", Types.newParameterizedType(CommonExperiment.class, TransfersContactsFuzzySearchConfig.class), new CommonExperiment(new TransfersContactsFuzzySearchConfig(false, new TransfersContactsFuzzySearchConfig.Name(3, scc.g(new TransfersContactsFuzzySearchConfig.Rule(0, 0), new TransfersContactsFuzzySearchConfig.Rule(4, 1), new TransfersContactsFuzzySearchConfig.Rule(7, 2), new TransfersContactsFuzzySearchConfig.Rule(11, 3), new TransfersContactsFuzzySearchConfig.Rule(15, 4))), new TransfersContactsFuzzySearchConfig.Phone(5, scc.g(new TransfersContactsFuzzySearchConfig.Rule(0, 0), new TransfersContactsFuzzySearchConfig.Rule(6, 1))), new TransfersContactsFuzzySearchConfig.Normalization(1, 2, 1, true), 1), ExperimentApplyType.LATEST));
}
