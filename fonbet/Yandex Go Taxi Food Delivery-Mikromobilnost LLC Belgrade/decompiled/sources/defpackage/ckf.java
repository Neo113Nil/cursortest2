package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.CustomInsetsHandlingConfig;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public abstract class ckf {
    public static final dfr a = new dfr("yb_custom_insets_handling", Types.newParameterizedType(CommonExperiment.class, CustomInsetsHandlingConfig.class), new CommonExperiment(new CustomInsetsHandlingConfig(true, EmptyList.a, false), ExperimentApplyType.HOT_START));
}
