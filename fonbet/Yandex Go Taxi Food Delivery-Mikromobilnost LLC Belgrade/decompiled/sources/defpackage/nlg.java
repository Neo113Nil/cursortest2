package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.cache.DashboardSingleProductCacheSchema;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public abstract class nlg {
    public static final dfr a = new dfr("yb_mobile_cache_dashboard", Types.newParameterizedType(CommonExperiment.class, DashboardSingleProductCacheSchema.class), new CommonExperiment(new DashboardSingleProductCacheSchema(EmptyList.a, 1, 3500, Boolean.FALSE), ExperimentApplyType.LATEST));
}
