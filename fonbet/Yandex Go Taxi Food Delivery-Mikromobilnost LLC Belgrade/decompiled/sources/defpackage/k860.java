package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.NfcExternalSkinsSyncConfig;

/* loaded from: classes9.dex */
public abstract class k860 {
    public static final dfr a = new dfr("yb_mobile_nfc_external_skins_sync_config", Types.newParameterizedType(CommonExperiment.class, NfcExternalSkinsSyncConfig.class), new CommonExperiment(new NfcExternalSkinsSyncConfig(false, 1), ExperimentApplyType.LATEST));
}
