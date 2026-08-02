package defpackage;

import android.content.Context;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlin.collections.builders.ListBuilder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yads.dv0;
import yads.yo;

/* loaded from: classes7.dex */
public final class dh71 implements pv81 {
    public final a081 a;
    public final hn71 b;
    public final fb71 c;
    public final Context d;

    public dh71(Context context, ge71 ge71Var) {
        a081 a081Var;
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        hn71 hn71Var = new hn71(ge71Var);
        fb71 fb71Var = new fb71();
        this.a = a081Var2;
        this.b = hn71Var;
        this.c = fb71Var;
        this.d = context.getApplicationContext();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(42:10|11|(1:13)(1:109)|14|(1:16)(1:108)|17|(1:19)(1:107)|20|(1:22)(1:106)|23|(2:27|(31:30|31|(1:33)(1:104)|34|35|36|37|38|(1:40)|41|42|43|44|45|(1:47)|48|(1:50)(1:97)|51|(1:53)(1:96)|54|(1:56)|57|(7:59|60|61|62|63|(1:65)|66)(1:95)|67|(6:74|75|(8:86|87|88|78|3dd|81|82|83)|77|78|3dd)|91|75|(0)|77|78|3dd))|105|31|(0)(0)|34|35|36|37|38|(0)|41|42|43|44|45|(0)|48|(0)(0)|51|(0)(0)|54|(0)|57|(0)(0)|67|(8:69|71|74|75|(0)|77|78|3dd)|91|75|(0)|77|78|3dd) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0260, code lost:
    
        r5 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0244, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0245, code lost:
    
        r5 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x025f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01f8 A[Catch: JSONException -> 0x0082, TryCatch #0 {JSONException -> 0x0082, blocks: (B:11:0x0044, B:13:0x0077, B:14:0x0087, B:16:0x00c3, B:17:0x00d0, B:19:0x00ff, B:20:0x0106, B:22:0x0177, B:23:0x0184, B:25:0x0193, B:27:0x019b, B:30:0x01b1, B:31:0x01bf, B:33:0x01f8, B:34:0x0208, B:38:0x024a, B:41:0x024f, B:45:0x0265, B:48:0x026a, B:50:0x0288, B:51:0x0295, B:53:0x02a3, B:54:0x02b3, B:56:0x02fd, B:57:0x02ff, B:59:0x0343, B:63:0x0369, B:66:0x036e, B:67:0x0375, B:69:0x038a, B:71:0x0392, B:74:0x0399, B:75:0x03a3, B:78:0x03ce, B:79:0x03dd, B:80:0x03de, B:81:0x03df, B:94:0x0363, B:100:0x0260, B:103:0x0245, B:61:0x034f, B:36:0x0238, B:43:0x0253), top: B:10:0x0044, inners: #1, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0288 A[Catch: JSONException -> 0x0082, TryCatch #0 {JSONException -> 0x0082, blocks: (B:11:0x0044, B:13:0x0077, B:14:0x0087, B:16:0x00c3, B:17:0x00d0, B:19:0x00ff, B:20:0x0106, B:22:0x0177, B:23:0x0184, B:25:0x0193, B:27:0x019b, B:30:0x01b1, B:31:0x01bf, B:33:0x01f8, B:34:0x0208, B:38:0x024a, B:41:0x024f, B:45:0x0265, B:48:0x026a, B:50:0x0288, B:51:0x0295, B:53:0x02a3, B:54:0x02b3, B:56:0x02fd, B:57:0x02ff, B:59:0x0343, B:63:0x0369, B:66:0x036e, B:67:0x0375, B:69:0x038a, B:71:0x0392, B:74:0x0399, B:75:0x03a3, B:78:0x03ce, B:79:0x03dd, B:80:0x03de, B:81:0x03df, B:94:0x0363, B:100:0x0260, B:103:0x0245, B:61:0x034f, B:36:0x0238, B:43:0x0253), top: B:10:0x0044, inners: #1, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02a3 A[Catch: JSONException -> 0x0082, TryCatch #0 {JSONException -> 0x0082, blocks: (B:11:0x0044, B:13:0x0077, B:14:0x0087, B:16:0x00c3, B:17:0x00d0, B:19:0x00ff, B:20:0x0106, B:22:0x0177, B:23:0x0184, B:25:0x0193, B:27:0x019b, B:30:0x01b1, B:31:0x01bf, B:33:0x01f8, B:34:0x0208, B:38:0x024a, B:41:0x024f, B:45:0x0265, B:48:0x026a, B:50:0x0288, B:51:0x0295, B:53:0x02a3, B:54:0x02b3, B:56:0x02fd, B:57:0x02ff, B:59:0x0343, B:63:0x0369, B:66:0x036e, B:67:0x0375, B:69:0x038a, B:71:0x0392, B:74:0x0399, B:75:0x03a3, B:78:0x03ce, B:79:0x03dd, B:80:0x03de, B:81:0x03df, B:94:0x0363, B:100:0x0260, B:103:0x0245, B:61:0x034f, B:36:0x0238, B:43:0x0253), top: B:10:0x0044, inners: #1, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02fd A[Catch: JSONException -> 0x0082, TryCatch #0 {JSONException -> 0x0082, blocks: (B:11:0x0044, B:13:0x0077, B:14:0x0087, B:16:0x00c3, B:17:0x00d0, B:19:0x00ff, B:20:0x0106, B:22:0x0177, B:23:0x0184, B:25:0x0193, B:27:0x019b, B:30:0x01b1, B:31:0x01bf, B:33:0x01f8, B:34:0x0208, B:38:0x024a, B:41:0x024f, B:45:0x0265, B:48:0x026a, B:50:0x0288, B:51:0x0295, B:53:0x02a3, B:54:0x02b3, B:56:0x02fd, B:57:0x02ff, B:59:0x0343, B:63:0x0369, B:66:0x036e, B:67:0x0375, B:69:0x038a, B:71:0x0392, B:74:0x0399, B:75:0x03a3, B:78:0x03ce, B:79:0x03dd, B:80:0x03de, B:81:0x03df, B:94:0x0363, B:100:0x0260, B:103:0x0245, B:61:0x034f, B:36:0x0238, B:43:0x0253), top: B:10:0x0044, inners: #1, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0343 A[Catch: JSONException -> 0x0082, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0082, blocks: (B:11:0x0044, B:13:0x0077, B:14:0x0087, B:16:0x00c3, B:17:0x00d0, B:19:0x00ff, B:20:0x0106, B:22:0x0177, B:23:0x0184, B:25:0x0193, B:27:0x019b, B:30:0x01b1, B:31:0x01bf, B:33:0x01f8, B:34:0x0208, B:38:0x024a, B:41:0x024f, B:45:0x0265, B:48:0x026a, B:50:0x0288, B:51:0x0295, B:53:0x02a3, B:54:0x02b3, B:56:0x02fd, B:57:0x02ff, B:59:0x0343, B:63:0x0369, B:66:0x036e, B:67:0x0375, B:69:0x038a, B:71:0x0392, B:74:0x0399, B:75:0x03a3, B:78:0x03ce, B:79:0x03dd, B:80:0x03de, B:81:0x03df, B:94:0x0363, B:100:0x0260, B:103:0x0245, B:61:0x034f, B:36:0x0238, B:43:0x0253), top: B:10:0x0044, inners: #1, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03de A[Catch: JSONException -> 0x0082, DONT_GENERATE, TryCatch #0 {JSONException -> 0x0082, blocks: (B:11:0x0044, B:13:0x0077, B:14:0x0087, B:16:0x00c3, B:17:0x00d0, B:19:0x00ff, B:20:0x0106, B:22:0x0177, B:23:0x0184, B:25:0x0193, B:27:0x019b, B:30:0x01b1, B:31:0x01bf, B:33:0x01f8, B:34:0x0208, B:38:0x024a, B:41:0x024f, B:45:0x0265, B:48:0x026a, B:50:0x0288, B:51:0x0295, B:53:0x02a3, B:54:0x02b3, B:56:0x02fd, B:57:0x02ff, B:59:0x0343, B:63:0x0369, B:66:0x036e, B:67:0x0375, B:69:0x038a, B:71:0x0392, B:74:0x0399, B:75:0x03a3, B:78:0x03ce, B:79:0x03dd, B:80:0x03de, B:81:0x03df, B:94:0x0363, B:100:0x0260, B:103:0x0245, B:61:0x034f, B:36:0x0238, B:43:0x0253), top: B:10:0x0044, inners: #1, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0293  */
    @Override // defpackage.pv81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(gb81 gb81Var) {
        String str;
        qi61 qi61Var;
        JSONObject optJSONObject;
        Map map;
        Object failure;
        Object failure2;
        JSONArray optJSONArray;
        Set set;
        List d;
        ty61 ty61Var;
        JSONObject optJSONObject2;
        bo71 bo71Var;
        JSONObject optJSONObject3;
        ai81 ai81Var;
        String optString;
        Object failure3;
        JSONObject optJSONObject4;
        hn71 hn71Var = this.b;
        ((ez71) hn71Var.c).getClass();
        byte[] bArr = gb81Var.b;
        Map map2 = gb81Var.c;
        if (map2 == null) {
            map2 = b.f();
        }
        o021 o021Var = (o021) hn71Var.b;
        ((mo71) o021Var.b).getClass();
        if (bArr != null) {
            try {
                str = new String(bArr, ob71.a(map2));
            } catch (Exception unused) {
                str = new String(bArr, uza.a);
            }
        } else {
            str = null;
        }
        if (str == null || str.length() <= 0) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean optBoolean = jSONObject.optBoolean("custom_click_handling_enabled");
            boolean optBoolean2 = jSONObject.optBoolean("legacy_visibility_logic_enabled");
            boolean optBoolean3 = jSONObject.optBoolean("legacy_vast_tracking_enabled");
            boolean optBoolean4 = jSONObject.optBoolean("overlapping_view_tracking_enabled");
            boolean optBoolean5 = jSONObject.optBoolean("overlapping_window_tracking_enabled");
            boolean optBoolean6 = jSONObject.optBoolean("open_measurement_sdk_disabled");
            zcx zcxVar = xf71.a;
            Boolean valueOf = jSONObject.has("visibility_error_indicator_enabled") ? Boolean.valueOf(jSONObject.optBoolean("visibility_error_indicator_enabled")) : null;
            String optString2 = jSONObject.optString("mraid_controller", null);
            String optString3 = jSONObject.optString("open_measurement_sdk_controller", null);
            String optString4 = jSONObject.optString("click_handler_type", null);
            String optString5 = jSONObject.optString("ad_host", null);
            String optString6 = jSONObject.optString("divkit_font", null);
            String optString7 = jSONObject.optString("instream_design", null);
            boolean optBoolean7 = jSONObject.optBoolean("sensitive_mode_disabled");
            boolean optBoolean8 = jSONObject.optBoolean("hard_sensitive_mode_enabled");
            boolean optBoolean9 = jSONObject.optBoolean("encrypted_requests_enabled");
            Boolean valueOf2 = jSONObject.has("mediation_sensitive_mode_disabled") ? Boolean.valueOf(jSONObject.optBoolean("mediation_sensitive_mode_disabled")) : null;
            boolean optBoolean10 = jSONObject.optBoolean("fused_location_provider_disabled");
            boolean optBoolean11 = jSONObject.optBoolean("lock_screen_enabled");
            boolean optBoolean12 = jSONObject.optBoolean("impression_validation_on_click_enabled");
            boolean optBoolean13 = jSONObject.optBoolean("legacy_slider_impression_enabled");
            long optLong = jSONObject.optLong("reload_timeout");
            ((gf71) o021Var.c).getClass();
            long currentTimeMillis = System.currentTimeMillis() + (optLong > 0 ? optLong * 1000 : 86400000L);
            int optInt = jSONObject.optInt("ad_ids_storage_size");
            int optInt2 = jSONObject.optInt("native_web_view_pool_size");
            long optLong2 = jSONObject.optLong("max_disk_cache_size_bytes_for_video");
            long optLong3 = jSONObject.optLong("max_disk_cache_size_bytes_for_request_queue");
            Integer a = xf71.a("ad_request_max_retries", jSONObject);
            Integer a2 = xf71.a("ping_request_max_retries", jSONObject);
            boolean optBoolean14 = jSONObject.optBoolean("show_version_validation_error_log", false);
            boolean optBoolean15 = jSONObject.optBoolean("show_version_validation_error_indicator", false);
            boolean optBoolean16 = jSONObject.optBoolean("fullscreen_back_button_enabled", false);
            boolean optBoolean17 = jSONObject.optBoolean("location_consent", false);
            boolean optBoolean18 = jSONObject.optBoolean("divkit_disabled", false);
            boolean optBoolean19 = jSONObject.optBoolean("libssl_enabled", false);
            String optString8 = jSONObject.optString("light_bundle_script_url", null);
            boolean optBoolean20 = jSONObject.optBoolean("should_wait_light_bundle_script_loading_on_configuration", false);
            boolean optBoolean21 = jSONObject.optBoolean("should_start_light_bundle_script_loading_on_configuration", false);
            boolean optBoolean22 = jSONObject.optBoolean("client_bidding_startup_initialization_enabled");
            boolean optBoolean23 = jSONObject.optBoolean("header_bidding_startup_initialization_enabled");
            JSONObject optJSONObject5 = jSONObject.optJSONObject("bidding_settings");
            yo b = optJSONObject5 != null ? ((h291) o021Var.e).b(optJSONObject5) : null;
            JSONObject optJSONObject6 = jSONObject.optJSONObject("encryption");
            ((pm61) o021Var.d).getClass();
            if (optJSONObject6 != null && (optJSONObject4 = optJSONObject6.optJSONObject("rsa")) != null) {
                String optString9 = optJSONObject4.optString("public_key", "");
                Integer a3 = xf71.a("version", optJSONObject4);
                if (optString9.length() > 0 && a3 != null) {
                    qi61Var = new qi61(optString9, a3.intValue());
                    boolean optBoolean24 = jSONObject.optBoolean("legacy_impression_callback_enabled", false);
                    boolean optBoolean25 = jSONObject.optBoolean("close_fullscreen_with_adtune_disabled", false);
                    boolean optBoolean26 = jSONObject.optBoolean("render_asset_validation_enabled", false);
                    boolean optBoolean27 = jSONObject.optBoolean("automatic_sdk_initialization_delay_enabled", false);
                    boolean optBoolean28 = jSONObject.optBoolean("native_banner_enabled", false);
                    boolean optBoolean29 = jSONObject.optBoolean("use_divkit_close_action_instead_system_click", false);
                    String optString10 = jSONObject.optString("banner_size_calculation_type", null);
                    String optString11 = jSONObject.optString("startup_version", null);
                    optJSONObject = jSONObject.optJSONObject("startup_parameters");
                    if (optJSONObject == null) {
                        ((ra81) o021Var.h).getClass();
                        map = ra81.b(optJSONObject);
                    } else {
                        map = null;
                    }
                    boolean optBoolean30 = jSONObject.optBoolean("app_open_ad_preloading_enabled", false);
                    boolean optBoolean31 = jSONObject.optBoolean("interstitial_preloading_enabled", false);
                    boolean optBoolean32 = jSONObject.optBoolean("rewarded_preloading_enabled", false);
                    boolean optBoolean33 = jSONObject.optBoolean("new_false_click_tracking_enabled", false);
                    boolean optBoolean34 = jSONObject.optBoolean("varioqub_enabled", false);
                    boolean optBoolean35 = jSONObject.optBoolean("crash_tracker_enabled", false);
                    boolean optBoolean36 = jSONObject.optBoolean("error_tracker_enabled", false);
                    boolean optBoolean37 = jSONObject.optBoolean("anr_tracker_enabled", false);
                    failure = Long.valueOf(jSONObject.getLong("anr_tracker_interval"));
                    if (failure instanceof Result.Failure) {
                        failure = null;
                    }
                    Long l = (Long) failure;
                    failure2 = Long.valueOf(jSONObject.getLong("anr_tracker_threshold"));
                    if (failure2 instanceof Result.Failure) {
                        failure2 = null;
                    }
                    Long l2 = (Long) failure2;
                    boolean optBoolean38 = jSONObject.optBoolean("exit_info_anr_tracker_enabled", false);
                    Integer a4 = o021.a("exit_info_anr_tracker_max_results", jSONObject);
                    Integer a5 = o021.a("exit_info_anr_tracker_historical_threshold_days", jSONObject);
                    Boolean valueOf3 = !jSONObject.has("exit_info_anr_tracker_enriched_traces_enabled") ? Boolean.valueOf(jSONObject.optBoolean("exit_info_anr_tracker_enriched_traces_enabled")) : null;
                    boolean optBoolean39 = jSONObject.optBoolean("crash_ignore_enabled", false);
                    optJSONArray = jSONObject.optJSONArray("crash_stack_trace_exclusion_rules");
                    if (optJSONArray == null) {
                        ((zi81) o021Var.f).getClass();
                        set = zi81.b(optJSONArray);
                    } else {
                        set = null;
                    }
                    boolean optBoolean40 = jSONObject.optBoolean("time_stamping_tracking_urls_enabled", false);
                    boolean optBoolean41 = jSONObject.optBoolean("app_ad_analytics_reporting_enabled", true);
                    boolean optBoolean42 = jSONObject.optBoolean("app_metrica_easy_integration_auto_activation_disabled", false);
                    Integer a6 = o021.a("network_thread_pool_size", jSONObject);
                    Integer a7 = o021.a("image_loading_thread_pool_size", jSONObject);
                    Integer a8 = o021.a("timeout_interval_for_request", jSONObject);
                    Integer a9 = o021.a("timeout_interval_for_ping_request", jSONObject);
                    t481 t481Var = (t481) o021Var.g;
                    JSONObject optJSONObject7 = jSONObject.optJSONObject("verification_configuration");
                    t481Var.getClass();
                    jl61 a10 = t481.a(optJSONObject7);
                    boolean optBoolean43 = jSONObject.optBoolean("sdk_tracking_reporter_enabled", false);
                    d = xf71.d("fallback_hosts", jSONObject);
                    if (d == null) {
                        d = EmptyList.a;
                    }
                    List list = d;
                    boolean optBoolean44 = jSONObject.optBoolean("should_prefetch_dns", false);
                    boolean optBoolean45 = jSONObject.optBoolean("should_use_ad_rendered_web_view_callback", false);
                    boolean optBoolean46 = jSONObject.optBoolean("outstream_wrapper_video_supported", false);
                    boolean optBoolean47 = jSONObject.optBoolean("validate_click_in_web_view", false);
                    boolean optBoolean48 = jSONObject.optBoolean("pass_full_screen_height_from_sdk_enabled", false);
                    Integer a11 = o021.a("instream_qrcode_size_in_px", jSONObject);
                    boolean optBoolean49 = jSONObject.optBoolean("hide_bottom_navigation_bar", false);
                    boolean optBoolean50 = jSONObject.optBoolean("pre_warm_web_view_on_background", false);
                    boolean optBoolean51 = jSONObject.optBoolean("sdk_network_debug_enabled", false);
                    boolean optBoolean52 = jSONObject.optBoolean("support_gif", false);
                    if (jSONObject.has("font")) {
                        ty61Var = null;
                    } else {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("font");
                        zcx a12 = tje.a(sbx.d, dv0.w);
                        try {
                            String jSONObject3 = jSONObject2.toString();
                            ty61.Companion.getClass();
                            failure3 = (ty61) a12.b(rj61.a, jSONObject3);
                        } catch (Throwable th) {
                            failure3 = new Result.Failure(th);
                        }
                        if (failure3 instanceof Result.Failure) {
                            failure3 = null;
                        }
                        ty61Var = (ty61) failure3;
                    }
                    boolean optBoolean53 = jSONObject.optBoolean("force_default_player", false);
                    optJSONObject2 = jSONObject.optJSONObject("session");
                    ((yq71) o021Var.i).getClass();
                    if (optJSONObject2 != null && (optString = optJSONObject2.optString(AuthSdkActivity.RESPONSE_TYPE_TOKEN)) != null && optString.length() != 0) {
                        bo71Var = new bo71(optString);
                        optJSONObject3 = jSONObject.optJSONObject("playback_optimization_config");
                        po81 po81Var = (po81) o021Var.j;
                        po81Var.getClass();
                        if (optJSONObject3 != null) {
                            try {
                                zcx zcxVar2 = po81Var.a;
                                String jSONObject4 = optJSONObject3.toString();
                                zcxVar2.getClass();
                                ai81.Companion.getClass();
                                ai81Var = (ai81) zcxVar2.b(sb81.a, jSONObject4);
                            } catch (Exception unused2) {
                            }
                            ListBuilder b2 = o021.b(jSONObject.optJSONArray("smart_preload_blocks"));
                            dha1.f();
                            synchronized (a081.f) {
                            }
                            return new gg81(optInt, optInt2, optLong2, optLong3, currentTimeMillis, optBoolean, optBoolean10, optBoolean11, optBoolean7, optBoolean8, optBoolean2, optBoolean3, optBoolean4, optBoolean5, optBoolean12, optBoolean13, optBoolean15, optBoolean14, optBoolean16, optBoolean25, optBoolean24, optBoolean18, optBoolean6, optBoolean19, optString8, optBoolean20, optBoolean21, optBoolean9, optBoolean26, optBoolean27, optBoolean28, optBoolean29, optBoolean30, optBoolean31, optBoolean32, optBoolean33, optBoolean34, a, a2, null, dha1.f().c(), optBoolean17, valueOf, optString10, optString2, optString3, "8.0.0-beta.1", optString4, optString7, optString5, optString6, valueOf2, qi61Var, optBoolean22, optBoolean23, b, optString11, map, optBoolean35, optBoolean36, optBoolean37, l, l2, optBoolean38, a4, a5, valueOf3, optBoolean39, set, optBoolean40, optBoolean41, optBoolean42, a6, a7, a8, a9, a10, optBoolean43, list, optBoolean44, optBoolean45, optBoolean46, optBoolean47, optBoolean48, a11, optBoolean49, optBoolean50, ty61Var, optBoolean53, optBoolean52, bo71Var, ai81Var, optBoolean51, b2);
                        }
                        ai81Var = null;
                        ListBuilder b22 = o021.b(jSONObject.optJSONArray("smart_preload_blocks"));
                        dha1.f();
                        synchronized (a081.f) {
                        }
                    }
                    bo71Var = null;
                    optJSONObject3 = jSONObject.optJSONObject("playback_optimization_config");
                    po81 po81Var2 = (po81) o021Var.j;
                    po81Var2.getClass();
                    if (optJSONObject3 != null) {
                    }
                    ai81Var = null;
                    ListBuilder b222 = o021.b(jSONObject.optJSONArray("smart_preload_blocks"));
                    dha1.f();
                    synchronized (a081.f) {
                    }
                }
            }
            qi61Var = null;
            boolean optBoolean242 = jSONObject.optBoolean("legacy_impression_callback_enabled", false);
            boolean optBoolean252 = jSONObject.optBoolean("close_fullscreen_with_adtune_disabled", false);
            boolean optBoolean262 = jSONObject.optBoolean("render_asset_validation_enabled", false);
            boolean optBoolean272 = jSONObject.optBoolean("automatic_sdk_initialization_delay_enabled", false);
            boolean optBoolean282 = jSONObject.optBoolean("native_banner_enabled", false);
            boolean optBoolean292 = jSONObject.optBoolean("use_divkit_close_action_instead_system_click", false);
            String optString102 = jSONObject.optString("banner_size_calculation_type", null);
            String optString112 = jSONObject.optString("startup_version", null);
            optJSONObject = jSONObject.optJSONObject("startup_parameters");
            if (optJSONObject == null) {
            }
            boolean optBoolean302 = jSONObject.optBoolean("app_open_ad_preloading_enabled", false);
            boolean optBoolean312 = jSONObject.optBoolean("interstitial_preloading_enabled", false);
            boolean optBoolean322 = jSONObject.optBoolean("rewarded_preloading_enabled", false);
            boolean optBoolean332 = jSONObject.optBoolean("new_false_click_tracking_enabled", false);
            boolean optBoolean342 = jSONObject.optBoolean("varioqub_enabled", false);
            boolean optBoolean352 = jSONObject.optBoolean("crash_tracker_enabled", false);
            boolean optBoolean362 = jSONObject.optBoolean("error_tracker_enabled", false);
            boolean optBoolean372 = jSONObject.optBoolean("anr_tracker_enabled", false);
            failure = Long.valueOf(jSONObject.getLong("anr_tracker_interval"));
            if (failure instanceof Result.Failure) {
            }
            Long l3 = (Long) failure;
            failure2 = Long.valueOf(jSONObject.getLong("anr_tracker_threshold"));
            if (failure2 instanceof Result.Failure) {
            }
            Long l22 = (Long) failure2;
            boolean optBoolean382 = jSONObject.optBoolean("exit_info_anr_tracker_enabled", false);
            Integer a42 = o021.a("exit_info_anr_tracker_max_results", jSONObject);
            Integer a52 = o021.a("exit_info_anr_tracker_historical_threshold_days", jSONObject);
            if (!jSONObject.has("exit_info_anr_tracker_enriched_traces_enabled")) {
            }
            boolean optBoolean392 = jSONObject.optBoolean("crash_ignore_enabled", false);
            optJSONArray = jSONObject.optJSONArray("crash_stack_trace_exclusion_rules");
            if (optJSONArray == null) {
            }
            boolean optBoolean402 = jSONObject.optBoolean("time_stamping_tracking_urls_enabled", false);
            boolean optBoolean412 = jSONObject.optBoolean("app_ad_analytics_reporting_enabled", true);
            boolean optBoolean422 = jSONObject.optBoolean("app_metrica_easy_integration_auto_activation_disabled", false);
            Integer a62 = o021.a("network_thread_pool_size", jSONObject);
            Integer a72 = o021.a("image_loading_thread_pool_size", jSONObject);
            Integer a82 = o021.a("timeout_interval_for_request", jSONObject);
            Integer a92 = o021.a("timeout_interval_for_ping_request", jSONObject);
            t481 t481Var2 = (t481) o021Var.g;
            JSONObject optJSONObject72 = jSONObject.optJSONObject("verification_configuration");
            t481Var2.getClass();
            jl61 a102 = t481.a(optJSONObject72);
            boolean optBoolean432 = jSONObject.optBoolean("sdk_tracking_reporter_enabled", false);
            d = xf71.d("fallback_hosts", jSONObject);
            if (d == null) {
            }
            List list2 = d;
            boolean optBoolean442 = jSONObject.optBoolean("should_prefetch_dns", false);
            boolean optBoolean452 = jSONObject.optBoolean("should_use_ad_rendered_web_view_callback", false);
            boolean optBoolean462 = jSONObject.optBoolean("outstream_wrapper_video_supported", false);
            boolean optBoolean472 = jSONObject.optBoolean("validate_click_in_web_view", false);
            boolean optBoolean482 = jSONObject.optBoolean("pass_full_screen_height_from_sdk_enabled", false);
            Integer a112 = o021.a("instream_qrcode_size_in_px", jSONObject);
            boolean optBoolean492 = jSONObject.optBoolean("hide_bottom_navigation_bar", false);
            boolean optBoolean502 = jSONObject.optBoolean("pre_warm_web_view_on_background", false);
            boolean optBoolean512 = jSONObject.optBoolean("sdk_network_debug_enabled", false);
            boolean optBoolean522 = jSONObject.optBoolean("support_gif", false);
            if (jSONObject.has("font")) {
            }
            boolean optBoolean532 = jSONObject.optBoolean("force_default_player", false);
            optJSONObject2 = jSONObject.optJSONObject("session");
            ((yq71) o021Var.i).getClass();
            if (optJSONObject2 != null) {
                bo71Var = new bo71(optString);
                optJSONObject3 = jSONObject.optJSONObject("playback_optimization_config");
                po81 po81Var22 = (po81) o021Var.j;
                po81Var22.getClass();
                if (optJSONObject3 != null) {
                }
                ai81Var = null;
                ListBuilder b2222 = o021.b(jSONObject.optJSONArray("smart_preload_blocks"));
                dha1.f();
                synchronized (a081.f) {
                }
            }
            bo71Var = null;
            optJSONObject3 = jSONObject.optJSONObject("playback_optimization_config");
            po81 po81Var222 = (po81) o021Var.j;
            po81Var222.getClass();
            if (optJSONObject3 != null) {
            }
            ai81Var = null;
            ListBuilder b22222 = o021.b(jSONObject.optJSONArray("smart_preload_blocks"));
            dha1.f();
            synchronized (a081.f) {
            }
        } catch (JSONException e) {
            ((ge71) o021Var.a).d("Can't parse sdk configuration response", e);
            return null;
        }
    }
}
