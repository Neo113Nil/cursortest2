package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.NfcAutoContinueConfig;

/* loaded from: classes9.dex */
public abstract class o760 {
    public static final dfr a;

    static {
        byte[] bArr = tje.i3;
        byte[] bArr2 = new byte[29];
        for (int i = 0; i < 29; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, NfcAutoContinueConfig.class), new CommonExperiment(new NfcAutoContinueConfig(5), ExperimentApplyType.LATEST));
    }
}
