package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.TransfersDashboardBottomSheetConfig;

/* loaded from: classes9.dex */
public abstract class dv01 {
    public static final dfr a;

    static {
        byte[] bArr = tje.x0;
        byte[] bArr2 = new byte[43];
        for (int i = 0; i < 43; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, TransfersDashboardBottomSheetConfig.class), new CommonExperiment(new TransfersDashboardBottomSheetConfig(null, null, null, null), ExperimentApplyType.LATEST));
    }
}
