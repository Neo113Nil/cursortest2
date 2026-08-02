package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.ShimmersConfigImpl;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public abstract class lpc {
    public static final dfr a;

    static {
        byte[] bArr = tje.P2;
        byte[] bArr2 = new byte[27];
        for (int i = 0; i < 27; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, ShimmersConfigImpl.class), new CommonExperiment(new ShimmersConfigImpl(b.f()), ExperimentApplyType.LATEST));
    }
}
