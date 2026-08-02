package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.DashboardV3Products;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public abstract class kr51 {
    public static final dfr a;

    static {
        byte[] bArr = tje.J1;
        byte[] bArr2 = new byte[33];
        for (int i = 0; i < 33; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, DashboardV3Products.class), new CommonExperiment(new DashboardV3Products(EmptyList.a), ExperimentApplyType.LATEST));
    }
}
