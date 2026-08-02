package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.TransfersDashboardFeatureShutterSizesConfig;

/* loaded from: classes9.dex */
public abstract class fv01 {
    public static final dfr a;

    static {
        byte[] bArr = tje.C;
        byte[] bArr2 = new byte[46];
        for (int i = 0; i < 46; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, TransfersDashboardFeatureShutterSizesConfig.class), new CommonExperiment(new TransfersDashboardFeatureShutterSizesConfig(false, 0.13d, 0.5f, true, true), ExperimentApplyType.LATEST));
    }
}
