package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.NfcFailAction;
import com.ybsdk.rconfig.configs.NfcFailButtonData;
import com.ybsdk.rconfig.configs.NfcFailButtonsConfig;
import com.ybsdk.rconfig.configs.NfcFailScreenData;
import java.lang.reflect.ParameterizedType;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public abstract class m860 {
    public static final dfr a;
    public static final dfr b;

    static {
        NfcFailAction nfcFailAction = NfcFailAction.CLOSE;
        Boolean bool = Boolean.FALSE;
        NfcFailButtonData nfcFailButtonData = new NfcFailButtonData(nfcFailAction, null, null, null, bool);
        NfcFailButtonData nfcFailButtonData2 = new NfcFailButtonData(NfcFailAction.RETRY, null, null, null, bool);
        NfcFailScreenData nfcFailScreenData = new NfcFailScreenData(null, null, nfcFailButtonData, null);
        NfcFailScreenData nfcFailScreenData2 = new NfcFailScreenData(null, null, nfcFailButtonData2, null);
        byte[] bArr = tje.G0;
        byte[] bArr2 = new byte[35];
        for (int i = 0; i < 35; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        String str = new String(bArr2, uza.a);
        ParameterizedType newParameterizedType = Types.newParameterizedType(CommonExperiment.class, NfcFailButtonsConfig.class);
        NfcFailButtonsConfig nfcFailButtonsConfig = new NfcFailButtonsConfig(b.i(new Pair("CARD_INITIALIZATION_ERROR", nfcFailScreenData), new Pair("NO_DEFAULT_CARD", nfcFailScreenData), new Pair("DISCONNECT_LINK_LOSS", nfcFailScreenData2), new Pair("DISCONNECT_DESELECTED", nfcFailScreenData2), new Pair("PERMANENT_ERROR", nfcFailScreenData), new Pair("TEMP_ERROR", nfcFailScreenData), new Pair("NO_PIN_ERROR", nfcFailScreenData), new Pair("UNKNOWN", nfcFailScreenData)));
        ExperimentApplyType experimentApplyType = ExperimentApplyType.LATEST;
        a = new dfr(str, newParameterizedType, new CommonExperiment(nfcFailButtonsConfig, experimentApplyType));
        b = new dfr("yb_mobile_nfc_shortcut_fail_buttons_config", Types.newParameterizedType(CommonExperiment.class, NfcFailButtonsConfig.class), new CommonExperiment(new NfcFailButtonsConfig(b.f()), experimentApplyType));
    }
}
