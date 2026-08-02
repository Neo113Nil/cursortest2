package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.DashboardV3Feature;

/* loaded from: classes9.dex */
public abstract class jr51 {
    public static final dfr a;

    static {
        byte[] bArr = tje.w0;
        byte[] bArr2 = new byte[25];
        for (int i = 0; i < 25; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, DashboardV3Feature.class), new CommonExperiment(new DashboardV3Feature(scc.g("wallet", "pro", "credit_limit", "split"), true), ExperimentApplyType.LATEST));
    }
}
