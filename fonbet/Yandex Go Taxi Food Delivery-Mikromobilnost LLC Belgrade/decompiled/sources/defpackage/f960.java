package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.NfcPinsConfig;
import com.ybsdk.rconfig.configs.NfcPinsEnvironment;
import java.util.Collections;

/* loaded from: classes9.dex */
public abstract class f960 {
    public static final dfr a;

    static {
        byte[] bArr = tje.R1;
        byte[] bArr2 = new byte[29];
        for (int i = 0; i < 29; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, NfcPinsConfig.class), new CommonExperiment(new NfcPinsConfig(new NfcPinsEnvironment(Collections.singletonList("wSWEI2qwkMB5etT7ssFYgfACmtzqaNX8rKKLsY+NUmc="), Collections.singletonList("+irXAeso/8swoAv/+eHi6GOJcRlGbZMEopuRLGmycZI=")), new NfcPinsEnvironment(Collections.singletonList("oRZfJTLSW4mneS28+YCheMOaxvDz5IZOKvLxyuNXmtQ="), Collections.singletonList("h+nWnUhKD5SP7ttZLDjNBbzu6ITHWjTiM0Z5I9zGEUc="))), ExperimentApplyType.LATEST));
    }
}
