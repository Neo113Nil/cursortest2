package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.QrScanningUrlWhitelistConfigSchema;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public abstract class lfg0 {
    public static final dfr a;

    static {
        byte[] bArr = tje.E;
        byte[] bArr2 = new byte[30];
        for (int i = 0; i < 30; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, QrScanningUrlWhitelistConfigSchema.class), new CommonExperiment(new QrScanningUrlWhitelistConfigSchema(scc.g("^https://split\\.yandex\\.ru/order/.*", "^https://pay\\.ya\\.ru/o/.*", "^https://pay\\.ya\\.ru/tv/.*", "^https://test\\.pay\\.ya\\.ru/o/.*", "^https://test\\.pay\\.ya\\.ru/tv/.*"), EmptyList.a), ExperimentApplyType.LATEST));
    }
}
