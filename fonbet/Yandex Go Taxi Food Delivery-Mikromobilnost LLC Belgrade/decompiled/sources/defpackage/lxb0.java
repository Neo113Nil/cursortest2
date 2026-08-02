package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.PinNfcActionButtonConfig;

/* loaded from: classes9.dex */
public abstract class lxb0 {
    public static final dfr a = new dfr("yb_mobile_pin_nfc_action_button_config", Types.newParameterizedType(CommonExperiment.class, PinNfcActionButtonConfig.class), new CommonExperiment(new PinNfcActionButtonConfig(false, null), ExperimentApplyType.LATEST));
}
