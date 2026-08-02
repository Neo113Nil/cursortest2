package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.YbWebPerformanceLogIds;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public abstract class cj41 {
    public static final dfr a;

    static {
        byte[] bArr = tje.v2;
        byte[] bArr2 = new byte[28];
        for (int i = 0; i < 28; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, YbWebPerformanceLogIds.class), new CommonExperiment(new YbWebPerformanceLogIds(b.f()), ExperimentApplyType.LATEST));
    }
}
