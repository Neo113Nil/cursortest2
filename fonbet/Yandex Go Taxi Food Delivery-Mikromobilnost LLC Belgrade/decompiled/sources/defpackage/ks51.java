package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.YbMobileCommonAnimationsImpl;
import kotlin.collections.b;

/* loaded from: classes6.dex */
public abstract class ks51 {
    public static final dfr a;

    static {
        byte[] bArr = tje.t3;
        byte[] bArr2 = new byte[29];
        for (int i = 0; i < 29; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, YbMobileCommonAnimationsImpl.class), new CommonExperiment(new YbMobileCommonAnimationsImpl(b.f()), ExperimentApplyType.LATEST));
    }

    public static final dfr a() {
        return a;
    }
}
