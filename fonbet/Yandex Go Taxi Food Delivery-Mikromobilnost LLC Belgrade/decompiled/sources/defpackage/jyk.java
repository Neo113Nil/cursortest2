package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.DivKitTransactionsLimitFeature;

/* loaded from: classes9.dex */
public abstract class jyk {
    public static final dfr a;

    static {
        byte[] bArr = tje.g;
        byte[] bArr2 = new byte[38];
        for (int i = 0; i < 38; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, DivKitTransactionsLimitFeature.class), new CommonExperiment(new DivKitTransactionsLimitFeature(25, 50, 100), ExperimentApplyType.LATEST));
    }
}
