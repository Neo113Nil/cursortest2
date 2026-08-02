package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.SpoilersOnboarding;

/* loaded from: classes9.dex */
public abstract class lwt0 {
    public static final dfr a;

    static {
        byte[] bArr = tje.W1;
        byte[] bArr2 = new byte[23];
        for (int i = 0; i < 23; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, SpoilersOnboarding.class), new CommonExperiment(new SpoilersOnboarding(new ThemedParameter("https://avatars.mds.yandex.net/get-fintech/6146621/balance_hidden_icon_v2.png", "https://avatars.mds.yandex.net/get-fintech/6146621/balance_hidden_icon_v2.png")), ExperimentApplyType.LATEST));
    }
}
