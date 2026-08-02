package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.QrReaderScanningConfigSchema;

/* loaded from: classes9.dex */
public abstract class gcg0 {
    public static final dfr a;

    static {
        byte[] bArr = tje.V1;
        byte[] bArr2 = new byte[37];
        for (int i = 0; i < 37; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, QrReaderScanningConfigSchema.class), new CommonExperiment(new QrReaderScanningConfigSchema(Boolean.FALSE, 80), ExperimentApplyType.LATEST));
    }
}
