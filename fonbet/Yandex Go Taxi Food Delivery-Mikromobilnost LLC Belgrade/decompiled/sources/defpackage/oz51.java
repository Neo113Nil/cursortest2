package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.WebViewRedirectStallRetryConfig;

/* loaded from: classes9.dex */
public abstract class oz51 {
    public static final dfr a = new dfr("yb_webview_redirect_stall_retry", Types.newParameterizedType(CommonExperiment.class, WebViewRedirectStallRetryConfig.class), new CommonExperiment(new WebViewRedirectStallRetryConfig(false, 3000, 15000L, 16L, 0), ExperimentApplyType.LATEST));
}
