package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.DeeplinksGeneratorConfig;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public abstract class f4h {
    public static final dfr a = new dfr("yb_deeplinks_generator", Types.newParameterizedType(CommonExperiment.class, DeeplinksGeneratorConfig.class), new CommonExperiment(new DeeplinksGeneratorConfig(EmptyList.a), ExperimentApplyType.LATEST));
}
