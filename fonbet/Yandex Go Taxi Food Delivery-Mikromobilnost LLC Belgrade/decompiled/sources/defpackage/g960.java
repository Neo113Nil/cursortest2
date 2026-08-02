package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.NfcProductSkinV3Config;
import com.ybsdk.rconfig.configs.NfcProductSkinsV3Config;

/* loaded from: classes9.dex */
public abstract class g960 {
    public static final dfr a;

    static {
        byte[] bArr = tje.l0;
        byte[] bArr2 = new byte[40];
        for (int i = 0; i < 40; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, NfcProductSkinsV3Config.class), new CommonExperiment(new NfcProductSkinsV3Config(new NfcProductSkinV3Config(new ThemedParameter(scc.g("#FFEB4679", "#FF7565BB", "#FF7D68C2", "#7FA67AE9", "#29BB85FF", "#00C48B09"), scc.g("#FFEB4679", "#FF7565BB", "#FF7D68C2", "#7FA67AE9", "#29BB85FF", "#00C48B09")), null, null, null, null, null, new ThemedParameter("#99D96AE1", "#99D96AE1"), null, null, null, 958, null), new NfcProductSkinV3Config(new ThemedParameter(scc.g("#FFFFCD00", "#FFEFD45F", "#FFEED56C", "#7FE5D8A3", "#29DFDBBD", "#00DCDCC8"), scc.g("#FFFFCD00", "#FFEFD45F", "#FFEED56C", "#7FE5D8A3", "#29DFDBBD", "#00DCDCC8")), null, null, null, null, null, new ThemedParameter("#99FFCD00", "#99FFCD00"), null, null, null, 958, null), new NfcProductSkinV3Config(new ThemedParameter(scc.g("#FF54D38E", "#FF89DAB6", "#FF8FDABA", "#7FACDDD0", "#29BDDFDE", "#00C4E0E4"), scc.g("#FF54D38E", "#FF89DAB6", "#FF8FDABA", "#7FACDDD0", "#29BDDFDE", "#00C4E0E4")), null, null, null, null, null, new ThemedParameter("#99CEFFEB", "#99CEFFEB"), null, null, null, 958, null), new NfcProductSkinV3Config(new ThemedParameter(scc.g("#FFFF7197", "#FFFF80A2", "#FFFF8FAD", "#7FFF9EB8", "#29FFADC3", "#00FFBDCE"), scc.g("#FFFF7197", "#FFFF80A2", "#FFFF8FAD", "#7FFF9EB8", "#29FFADC3", "#00FFBDCE")), null, null, null, null, null, new ThemedParameter("#99FF7197", "#99FF7197"), null, null, null, 958, null)), ExperimentApplyType.LATEST));
    }
}
