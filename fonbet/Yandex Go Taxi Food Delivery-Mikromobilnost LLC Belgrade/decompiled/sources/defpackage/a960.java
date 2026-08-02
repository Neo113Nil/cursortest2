package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.NfcPaymentScreenGradients;

/* loaded from: classes9.dex */
public abstract class a960 {
    public static final dfr a;

    static {
        byte[] bArr = tje.U1;
        byte[] bArr2 = new byte[40];
        for (int i = 0; i < 40; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, NfcPaymentScreenGradients.class), new CommonExperiment(new NfcPaymentScreenGradients(new ThemedParameter(scc.g("#FFEB4679", "#FF7565BB", "#FF7D68C2", "#7FA67AE9", "#29BB85FF", "#00C48B09"), scc.g("#FFEB4679", "#FF7565BB", "#FF7D68C2", "#7FA67AE9", "#29BB85FF", "#00C48B09")), new ThemedParameter(scc.g("#FFFFCD00", "#FFEFD45F", "#FFEED56C", "#7FE5D8A3", "#29DFDBBD", "#00DCDCC8"), scc.g("#FFFFCD00", "#FFEFD45F", "#FFEED56C", "#7FE5D8A3", "#29DFDBBD", "#00DCDCC8")), new ThemedParameter(scc.g("#FF54D38E", "#FF89DAB6", "#FF8FDABA", "#7FACDDD0", "#29BDDFDE", "#00C4E0E4"), scc.g("#FF54D38E", "#FF89DAB6", "#FF8FDABA", "#7FACDDD0", "#29BDDFDE", "#00C4E0E4")), null), ExperimentApplyType.LATEST));
    }
}
