package yads;

import com.ironsource.C4572u;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes10.dex */
public enum dp2 {
    c("ad_loading_result"),
    d("ad_rendering_result"),
    e("adapter_auto_refresh"),
    f("adapter_invalid"),
    g("adapter_request"),
    h("adapter_response"),
    i("adapter_bidder_token_request"),
    j("adtune"),
    k("ad_request"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("ad_response"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("vast_request"),
    /* JADX INFO: Fake field, exist only in values array */
    EF12("vast_response"),
    /* JADX INFO: Fake field, exist only in values array */
    EF13("vast_wrapper_request"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("vast_wrapper_response"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("video_ad_start"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("video_ad_complete"),
    l("video_ad_player_error"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("vmap_request"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("vmap_response"),
    m("rendering_start"),
    n("dsp_rendering_start"),
    o("impression_tracking_start"),
    p("impression_tracking_success"),
    q("impression_tracking_failure"),
    r("forced_impression_tracking_failure"),
    s("adapter_action"),
    t("click"),
    u(CampaignEx.JSON_NATIVE_VIDEO_CLOSE),
    v("feedback"),
    w("deeplink"),
    x("bound_assets"),
    y("rendered_assets"),
    z("rebind"),
    A("binding_failure"),
    B("expected_view_missing"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("returned_to_app"),
    C(C4572u.j),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("video_ad_rendering_result"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("multibanner_event"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("ad_view_size_info"),
    D("dsp_impression_tracking_start"),
    E("dsp_impression_tracking_success"),
    F("dsp_impression_tracking_failure"),
    G("dsp_forced_impression_tracking_failure"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("log"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("open_bidding_token_generation_result"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("sdk_configuration_success"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("sdk_configuration_failure"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("tracking_event"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("ad_verification_result"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("sdk_configuration_request"),
    H("activity_result_opened"),
    I("client_bidding_loading_result"),
    /* JADX INFO: Fake field, exist only in values array */
    EF731("activity_action");

    public final String b;

    dp2(String str) {
        this.b = str;
    }

    public final String a() {
        return this.b;
    }
}
