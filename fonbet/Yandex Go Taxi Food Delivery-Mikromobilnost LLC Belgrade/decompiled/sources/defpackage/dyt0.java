package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.SslTrustConfig;
import com.ybsdk.rconfig.configs.SslTrustMode;

/* loaded from: classes9.dex */
public abstract class dyt0 {
    public static final dfr a;

    static {
        byte[] bArr = tje.n2;
        byte[] bArr2 = new byte[25];
        for (int i = 0; i < 25; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, SslTrustConfig.class), new CommonExperiment(new SslTrustConfig(SslTrustMode.SYSTEM_AND_YANDEX), ExperimentApplyType.LATEST));
    }
}
