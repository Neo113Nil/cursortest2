package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.NonYbProductDetailsFlags;

/* loaded from: classes9.dex */
public abstract class oe60 {
    public static final dfr a = new dfr("yb_mobile_non_yb_product_details_screen_config", Types.newParameterizedType(CommonExperiment.class, NonYbProductDetailsFlags.class), new CommonExperiment(new NonYbProductDetailsFlags(false, false), ExperimentApplyType.LATEST));
}
