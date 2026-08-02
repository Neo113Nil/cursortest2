package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.ShakeConfiguration;

/* loaded from: classes9.dex */
public abstract class ahr0 {
    public static final dfr a;

    static {
        byte[] bArr = tje.f1;
        byte[] bArr2 = new byte[24];
        for (int i = 0; i < 24; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, ShakeConfiguration.class), new CommonExperiment(new ShakeConfiguration(9, 1000, 250, 500, 4), ExperimentApplyType.LATEST));
    }
}
