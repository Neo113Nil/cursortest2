package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.SpoilersOnboardingV2;

/* loaded from: classes9.dex */
public abstract class mwt0 {
    public static final dfr a;

    static {
        byte[] bArr = tje.Z1;
        byte[] bArr2 = new byte[26];
        for (int i = 0; i < 26; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, SpoilersOnboardingV2.class), new CommonExperiment(new SpoilersOnboardingV2(true, new ThemedParameter("https://s3.mds.yandex.net/marketing-resources/spoilers/hand_balances_v1_1.mp4", "https://s3.mds.yandex.net/marketing-resources/spoilers/hand_balances_v1_1.mp4"), null, null, null, null, null), ExperimentApplyType.LATEST));
    }
}
