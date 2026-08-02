package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.YbWebCookieDomainsPrepareConfig;

/* loaded from: classes9.dex */
public abstract class iz51 {
    public static final dfr a;

    static {
        byte[] bArr = tje.B2;
        byte[] bArr2 = new byte[34];
        for (int i = 0; i < 34; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, YbWebCookieDomainsPrepareConfig.class), new CommonExperiment(new YbWebCookieDomainsPrepareConfig(true, true, scc.g("yandex.ru", "yandex.uz")), ExperimentApplyType.LATEST));
    }
}
