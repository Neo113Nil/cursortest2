package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.YbBiometrySuggestScreenRetryConfig;

/* loaded from: classes9.dex */
public abstract class pp51 {
    public static final dfr a;

    static {
        byte[] bArr = tje.r1;
        byte[] bArr2 = new byte[41];
        for (int i = 0; i < 41; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, YbBiometrySuggestScreenRetryConfig.class), new CommonExperiment(new YbBiometrySuggestScreenRetryConfig(1), ExperimentApplyType.LATEST));
    }
}
