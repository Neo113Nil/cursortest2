package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.DeeplinksOverridesConfig;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public abstract class h4h {
    public static final dfr a;

    static {
        byte[] bArr = tje.F1;
        byte[] bArr2 = new byte[31];
        for (int i = 0; i < 31; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, DeeplinksOverridesConfig.class), new CommonExperiment(new DeeplinksOverridesConfig(b.f()), ExperimentApplyType.LATEST));
    }
}
