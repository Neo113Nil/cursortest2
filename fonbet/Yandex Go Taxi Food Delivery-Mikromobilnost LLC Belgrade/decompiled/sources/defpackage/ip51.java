package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.YbAllowedApiCountryCodes;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public abstract class ip51 {
    public static final dfr a = new dfr("yb_allowed_api_country_codes", Types.newParameterizedType(CommonExperiment.class, YbAllowedApiCountryCodes.class), new CommonExperiment(new YbAllowedApiCountryCodes(EmptyList.a), ExperimentApplyType.LATEST));
}
