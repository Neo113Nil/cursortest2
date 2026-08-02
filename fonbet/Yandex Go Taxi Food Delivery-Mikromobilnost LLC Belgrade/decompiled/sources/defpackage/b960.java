package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.NfcPaymentScreenPromosConfig;
import com.ybsdk.rconfig.configs.NfcPaymentScreenPromosEnabledConfig;
import java.lang.reflect.ParameterizedType;

/* loaded from: classes9.dex */
public abstract class b960 {
    public static final dfr a;
    public static final dfr b;

    static {
        String q = tje.q(tje.F0);
        ParameterizedType newParameterizedType = Types.newParameterizedType(CommonExperiment.class, NfcPaymentScreenPromosEnabledConfig.class);
        NfcPaymentScreenPromosEnabledConfig nfcPaymentScreenPromosEnabledConfig = new NfcPaymentScreenPromosEnabledConfig(false, false, false, false);
        ExperimentApplyType experimentApplyType = ExperimentApplyType.LATEST;
        a = new dfr(q, newParameterizedType, new CommonExperiment(nfcPaymentScreenPromosEnabledConfig, experimentApplyType));
        b = new dfr(tje.q(tje.w1), Types.newParameterizedType(CommonExperiment.class, NfcPaymentScreenPromosConfig.class), new CommonExperiment(new NfcPaymentScreenPromosConfig(null, null, null, null), experimentApplyType));
    }
}
