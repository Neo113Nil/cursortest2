package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.OrientationAwareRecyclerConfig;

/* loaded from: classes9.dex */
public abstract class gq80 {
    public static final dfr a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        byte[] bArr = tje.Z0;
        byte[] bArr2 = new byte[38];
        for (int i = 0; i < 38; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, OrientationAwareRecyclerConfig.class), new CommonExperiment(new OrientationAwareRecyclerConfig(true, null, 2, 0 == true ? 1 : 0), ExperimentApplyType.LATEST));
    }
}
