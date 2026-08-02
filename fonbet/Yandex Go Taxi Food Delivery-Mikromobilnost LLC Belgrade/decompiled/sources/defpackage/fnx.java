package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.KycOnlinePhotoConfig;
import com.ybsdk.rconfig.configs.KycOnlinePhotoImagesConfig;
import com.ybsdk.rconfig.configs.KycOnlinePhotoLandscapeConfig;
import com.ybsdk.rconfig.model.ThemedImage;
import java.lang.reflect.ParameterizedType;

/* loaded from: classes9.dex */
public abstract class fnx {
    public static final dfr a;
    public static final dfr b;
    public static final dfr c;

    static {
        String q = tje.q(tje.N2);
        ParameterizedType newParameterizedType = Types.newParameterizedType(CommonExperiment.class, KycOnlinePhotoConfig.class);
        KycOnlinePhotoConfig kycOnlinePhotoConfig = new KycOnlinePhotoConfig("ybapp://deeplink/close", 60000, 30000, 1080, 1920, 85, null, Boolean.FALSE);
        ExperimentApplyType experimentApplyType = ExperimentApplyType.LATEST;
        a = new dfr(q, newParameterizedType, new CommonExperiment(kycOnlinePhotoConfig, experimentApplyType));
        b = new dfr(tje.q(tje.X2), Types.newParameterizedType(CommonExperiment.class, KycOnlinePhotoImagesConfig.class), new CommonExperiment(new KycOnlinePhotoImagesConfig(null, null, null, new ThemedImage("https://avatars.mds.yandex.net/get-fintech/6059143/yb_kyc_guide_main_left.png", "https://avatars.mds.yandex.net/get-fintech/6059143/yb_kyc_guide_main_left.png"), new ThemedImage("https://avatars.mds.yandex.net/get-fintech/6059143/yb_kyc_guide_main_righ.png", "https://avatars.mds.yandex.net/get-fintech/6059143/yb_kyc_guide_main_righ.png"), new ThemedImage("https://avatars.mds.yandex.net/get-fintech/5411389/yb_kyc_guide_selfie.png", "https://avatars.mds.yandex.net/get-fintech/5411389/yb_kyc_guide_selfie.png")), experimentApplyType));
        c = new dfr(tje.q(tje.d), Types.newParameterizedType(CommonExperiment.class, KycOnlinePhotoLandscapeConfig.class), new CommonExperiment(new KycOnlinePhotoLandscapeConfig(false, Boolean.TRUE, false, false), experimentApplyType));
    }
}
