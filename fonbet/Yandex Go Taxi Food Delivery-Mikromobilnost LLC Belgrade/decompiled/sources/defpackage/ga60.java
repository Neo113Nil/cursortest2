package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.NfcSuccessPlusPointsConfig;

/* loaded from: classes9.dex */
public abstract class ga60 {
    public static final dfr a;

    static {
        byte[] bArr = tje.I;
        byte[] bArr2 = new byte[35];
        for (int i = 0; i < 35; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, NfcSuccessPlusPointsConfig.class), new CommonExperiment(new NfcSuccessPlusPointsConfig(false, false, ""), ExperimentApplyType.LATEST));
    }
}
