package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.RotationConfiguration;

/* loaded from: classes9.dex */
public abstract class bxk0 {
    public static final dfr a;

    static {
        byte[] bArr = tje.M0;
        byte[] bArr2 = new byte[28];
        for (int i = 0; i < 28; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, RotationConfiguration.class), new CommonExperiment(new RotationConfiguration(2000, 6, 5, Boolean.FALSE, null), ExperimentApplyType.LATEST));
    }
}
