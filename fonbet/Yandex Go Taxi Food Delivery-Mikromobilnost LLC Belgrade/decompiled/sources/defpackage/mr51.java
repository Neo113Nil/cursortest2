package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.YbDeeplinksForUrls;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public abstract class mr51 {
    public static final dfr a;

    static {
        byte[] bArr = tje.b1;
        byte[] bArr2 = new byte[23];
        for (int i = 0; i < 23; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, YbDeeplinksForUrls.class), new CommonExperiment(new YbDeeplinksForUrls(EmptyList.a), ExperimentApplyType.LATEST));
    }
}
