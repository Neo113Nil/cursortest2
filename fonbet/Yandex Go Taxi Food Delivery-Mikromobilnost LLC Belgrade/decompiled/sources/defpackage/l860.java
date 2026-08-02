package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.NfcGracePeriodConfig;

/* loaded from: classes9.dex */
public abstract class l860 {
    public static final dfr a = new dfr("yb_mobile_nfc_external_tokens_grace_period", Types.newParameterizedType(CommonExperiment.class, NfcGracePeriodConfig.class), new CommonExperiment(new NfcGracePeriodConfig(false, 0), ExperimentApplyType.LATEST));
}
