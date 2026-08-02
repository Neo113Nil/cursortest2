package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.CreditDepositHiddenNumPadScenariosConfig;
import java.lang.reflect.ParameterizedType;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public abstract class naf {
    public static final dfr a;

    static {
        byte[] bArr = tje.y2;
        byte[] bArr2 = new byte[43];
        for (int i = 0; i < 43; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        String str = new String(bArr2, uza.a);
        ParameterizedType newParameterizedType = Types.newParameterizedType(CommonExperiment.class, CreditDepositHiddenNumPadScenariosConfig.class);
        EmptyList emptyList = EmptyList.a;
        a = new dfr(str, newParameterizedType, new CommonExperiment(new CreditDepositHiddenNumPadScenariosConfig(emptyList, emptyList, emptyList, emptyList), ExperimentApplyType.LATEST));
    }
}
