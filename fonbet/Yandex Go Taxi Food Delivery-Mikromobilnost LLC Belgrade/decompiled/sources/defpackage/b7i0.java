package defpackage;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.squareup.moshi.Types;
import com.ybsdk.core.utils.StorePackages;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.RateAppFeature;
import java.util.Collections;

/* loaded from: classes9.dex */
public abstract class b7i0 {
    public static final dfr a;

    static {
        byte[] bArr = tje.s2;
        byte[] bArr2 = new byte[29];
        for (int i = 0; i < 29; i++) {
            bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
        }
        a = new dfr(new String(bArr2, uza.a), Types.newParameterizedType(CommonExperiment.class, RateAppFeature.class), new CommonExperiment(new RateAppFeature(false, 1, 3, SubsamplingScaleImageView.ORIENTATION_180, unr0.h(Text.Companion, dzh0.ybsdk_rate_app_rate_app_title), new Text.Resource(dzh0.ybsdk_rate_app_rate_app_subtitle), new Text.Resource(dzh0.ybsdk_rate_app_rate_app_like_button_title), new Text.Resource(dzh0.ybsdk_rate_app_rate_app_dislike_button_title), new Text.Resource(dzh0.ybsdk_rate_app_discuss_app_title), new Text.Resource(dzh0.ybsdk_rate_app_discuss_app_subtitle), new Text.Resource(dzh0.ybsdk_rate_app_discuss_app_agree_button_title), new Text.Resource(dzh0.ybsdk_rate_app_discuss_app_disagree_button_title), Collections.singletonList(StorePackages.GOOGLE.getPackageName())), ExperimentApplyType.LATEST));
    }
}
