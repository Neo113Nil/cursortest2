package yads;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.EmptyList;
import org.chromium.base.TimeUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.j8y;

/* loaded from: classes10.dex */
public final class hv2 implements er2 {
    public final jp2 a;
    public final er2 b;
    public final k63 c;
    public final im0 d;
    public final ip e;
    public final en0 f;
    public final u7 g;
    public final t43 h;
    public final gz2 i;
    public final pe2 j;

    public hv2(bu1 bu1Var, er2 er2Var, k63 k63Var, im0 im0Var, ip ipVar, en0 en0Var, u7 u7Var, t43 t43Var, gz2 gz2Var, pe2 pe2Var) {
        this.a = bu1Var;
        this.b = er2Var;
        this.c = k63Var;
        this.d = im0Var;
        this.e = ipVar;
        this.f = en0Var;
        this.g = u7Var;
        this.h = t43Var;
        this.i = gz2Var;
        this.j = pe2Var;
    }

    public static Integer a(String str, JSONObject jSONObject) {
        Object failure;
        if (!jSONObject.has(str)) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            failure = Integer.valueOf(jSONObject.getInt(str));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (Integer) (failure instanceof Result.Failure ? null : failure);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(43:5|6|(1:8)(1:91)|9|(1:11)(1:90)|12|(1:14)(1:89)|15|(1:17)(1:88)|18|(2:22|(32:25|26|(1:28)(1:86)|29|30|31|32|33|(1:35)|36|37|38|39|40|(1:42)|43|(1:45)(1:79)|46|(1:48)(1:78)|49|(1:51)|52|(1:54)(1:77)|55|(7:62|63|(6:71|72|73|66|67|68)|65|66|67|68)|76|63|(0)|65|66|67|68))|87|26|(0)(0)|29|30|31|32|33|(0)|36|37|38|39|40|(0)|43|(0)(0)|46|(0)(0)|49|(0)|52|(0)(0)|55|(9:57|59|62|63|(0)|65|66|67|68)|76|63|(0)|65|66|67|68) */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x022c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x022d, code lost:
    
        r4 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0211, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0212, code lost:
    
        r4 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01c7 A[Catch: JSONException -> 0x0057, TryCatch #2 {JSONException -> 0x0057, blocks: (B:6:0x0019, B:8:0x004c, B:9:0x005c, B:11:0x0098, B:12:0x00a5, B:14:0x00d2, B:15:0x00d9, B:17:0x014a, B:18:0x0155, B:20:0x0162, B:22:0x016a, B:25:0x0180, B:26:0x018e, B:28:0x01c7, B:29:0x01d5, B:33:0x0217, B:36:0x021c, B:40:0x0232, B:43:0x0237, B:45:0x0255, B:46:0x0262, B:48:0x0270, B:49:0x027e, B:51:0x02c6, B:52:0x02c8, B:54:0x0306, B:55:0x0313, B:57:0x032c, B:59:0x0334, B:62:0x033b, B:63:0x0345, B:66:0x036d, B:82:0x022d, B:85:0x0212, B:31:0x0205, B:38:0x0220), top: B:5:0x0019, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0255 A[Catch: JSONException -> 0x0057, TryCatch #2 {JSONException -> 0x0057, blocks: (B:6:0x0019, B:8:0x004c, B:9:0x005c, B:11:0x0098, B:12:0x00a5, B:14:0x00d2, B:15:0x00d9, B:17:0x014a, B:18:0x0155, B:20:0x0162, B:22:0x016a, B:25:0x0180, B:26:0x018e, B:28:0x01c7, B:29:0x01d5, B:33:0x0217, B:36:0x021c, B:40:0x0232, B:43:0x0237, B:45:0x0255, B:46:0x0262, B:48:0x0270, B:49:0x027e, B:51:0x02c6, B:52:0x02c8, B:54:0x0306, B:55:0x0313, B:57:0x032c, B:59:0x0334, B:62:0x033b, B:63:0x0345, B:66:0x036d, B:82:0x022d, B:85:0x0212, B:31:0x0205, B:38:0x0220), top: B:5:0x0019, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0270 A[Catch: JSONException -> 0x0057, TryCatch #2 {JSONException -> 0x0057, blocks: (B:6:0x0019, B:8:0x004c, B:9:0x005c, B:11:0x0098, B:12:0x00a5, B:14:0x00d2, B:15:0x00d9, B:17:0x014a, B:18:0x0155, B:20:0x0162, B:22:0x016a, B:25:0x0180, B:26:0x018e, B:28:0x01c7, B:29:0x01d5, B:33:0x0217, B:36:0x021c, B:40:0x0232, B:43:0x0237, B:45:0x0255, B:46:0x0262, B:48:0x0270, B:49:0x027e, B:51:0x02c6, B:52:0x02c8, B:54:0x0306, B:55:0x0313, B:57:0x032c, B:59:0x0334, B:62:0x033b, B:63:0x0345, B:66:0x036d, B:82:0x022d, B:85:0x0212, B:31:0x0205, B:38:0x0220), top: B:5:0x0019, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02c6 A[Catch: JSONException -> 0x0057, TryCatch #2 {JSONException -> 0x0057, blocks: (B:6:0x0019, B:8:0x004c, B:9:0x005c, B:11:0x0098, B:12:0x00a5, B:14:0x00d2, B:15:0x00d9, B:17:0x014a, B:18:0x0155, B:20:0x0162, B:22:0x016a, B:25:0x0180, B:26:0x018e, B:28:0x01c7, B:29:0x01d5, B:33:0x0217, B:36:0x021c, B:40:0x0232, B:43:0x0237, B:45:0x0255, B:46:0x0262, B:48:0x0270, B:49:0x027e, B:51:0x02c6, B:52:0x02c8, B:54:0x0306, B:55:0x0313, B:57:0x032c, B:59:0x0334, B:62:0x033b, B:63:0x0345, B:66:0x036d, B:82:0x022d, B:85:0x0212, B:31:0x0205, B:38:0x0220), top: B:5:0x0019, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0306 A[Catch: JSONException -> 0x0057, TryCatch #2 {JSONException -> 0x0057, blocks: (B:6:0x0019, B:8:0x004c, B:9:0x005c, B:11:0x0098, B:12:0x00a5, B:14:0x00d2, B:15:0x00d9, B:17:0x014a, B:18:0x0155, B:20:0x0162, B:22:0x016a, B:25:0x0180, B:26:0x018e, B:28:0x01c7, B:29:0x01d5, B:33:0x0217, B:36:0x021c, B:40:0x0232, B:43:0x0237, B:45:0x0255, B:46:0x0262, B:48:0x0270, B:49:0x027e, B:51:0x02c6, B:52:0x02c8, B:54:0x0306, B:55:0x0313, B:57:0x032c, B:59:0x0334, B:62:0x033b, B:63:0x0345, B:66:0x036d, B:82:0x022d, B:85:0x0212, B:31:0x0205, B:38:0x0220), top: B:5:0x0019, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0352 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d3  */
    @Override // yads.er2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(xq2 xq2Var) {
        hm0 hm0Var;
        JSONObject optJSONObject;
        Map map;
        Object failure;
        Object failure2;
        JSONArray optJSONArray;
        Set set;
        List b;
        JSONObject optJSONObject2;
        fz2 fz2Var;
        JSONObject optJSONObject3;
        ne2 ne2Var;
        String optString;
        JSONObject optJSONObject4;
        String str = (String) this.b.a(xq2Var);
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
            j8y j8yVar = je1.a;
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
            this.c.getClass();
            long currentTimeMillis = System.currentTimeMillis() + (optLong > 0 ? optLong * 1000 : TimeUtils.MILLISECONDS_PER_DAY);
            int optInt = jSONObject.optInt("ad_ids_storage_size");
            int optInt2 = jSONObject.optInt("native_web_view_pool_size");
            long optLong2 = jSONObject.optLong("max_disk_cache_size_bytes_for_video");
            long optLong3 = jSONObject.optLong("max_disk_cache_size_bytes_for_request_queue");
            Integer a = je1.a("ad_request_max_retries", jSONObject);
            Integer a2 = je1.a("ping_request_max_retries", jSONObject);
            boolean optBoolean14 = jSONObject.optBoolean("show_version_validation_error_log", false);
            boolean optBoolean15 = jSONObject.optBoolean("show_version_validation_error_indicator", false);
            boolean optBoolean16 = jSONObject.optBoolean("fullscreen_back_button_enabled", false);
            boolean optBoolean17 = jSONObject.optBoolean("divkit_disabled", false);
            boolean optBoolean18 = jSONObject.optBoolean("location_consent", false);
            boolean optBoolean19 = jSONObject.optBoolean("libssl_enabled", false);
            String optString8 = jSONObject.optString("light_bundle_script_url", null);
            boolean optBoolean20 = jSONObject.optBoolean("should_wait_light_bundle_script_loading_on_configuration", false);
            boolean optBoolean21 = jSONObject.optBoolean("should_start_light_bundle_script_loading_on_configuration", false);
            boolean optBoolean22 = jSONObject.optBoolean("client_bidding_startup_initialization_enabled");
            boolean optBoolean23 = jSONObject.optBoolean("header_bidding_startup_initialization_enabled");
            JSONObject optJSONObject5 = jSONObject.optJSONObject("bidding_settings");
            hp b2 = optJSONObject5 != null ? this.e.b(optJSONObject5) : null;
            JSONObject optJSONObject6 = jSONObject.optJSONObject("encryption");
            this.d.getClass();
            if (optJSONObject6 != null && (optJSONObject4 = optJSONObject6.optJSONObject("rsa")) != null) {
                String optString9 = optJSONObject4.optString("public_key", "");
                Integer a3 = je1.a("version", optJSONObject4);
                if (optString9.length() > 0 && a3 != null) {
                    hm0Var = new hm0(a3.intValue(), optString9);
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
                        this.h.getClass();
                        map = t43.a(optJSONObject);
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
                    Integer a4 = a("exit_info_anr_tracker_max_results", jSONObject);
                    Integer a5 = a("exit_info_anr_tracker_historical_threshold_days", jSONObject);
                    Boolean valueOf3 = !jSONObject.has("exit_info_anr_tracker_enriched_traces_enabled") ? Boolean.valueOf(jSONObject.optBoolean("exit_info_anr_tracker_enriched_traces_enabled")) : null;
                    boolean optBoolean39 = jSONObject.optBoolean("crash_ignore_enabled", false);
                    optJSONArray = jSONObject.optJSONArray("crash_stack_trace_exclusion_rules");
                    if (optJSONArray == null) {
                        this.f.getClass();
                        set = en0.a(optJSONArray);
                    } else {
                        set = null;
                    }
                    boolean optBoolean40 = jSONObject.optBoolean("time_stamping_tracking_urls_enabled", false);
                    boolean optBoolean41 = jSONObject.optBoolean("app_ad_analytics_reporting_enabled", true);
                    boolean optBoolean42 = jSONObject.optBoolean("app_metrica_easy_integration_auto_activation_disabled", false);
                    Integer a6 = a("network_thread_pool_size", jSONObject);
                    Integer a7 = a("image_loading_thread_pool_size", jSONObject);
                    Integer a8 = a("timeout_interval_for_request", jSONObject);
                    Integer a9 = a("timeout_interval_for_ping_request", jSONObject);
                    u7 u7Var = this.g;
                    JSONObject optJSONObject7 = jSONObject.optJSONObject("verification_configuration");
                    u7Var.getClass();
                    f8 a10 = u7.a(optJSONObject7);
                    boolean optBoolean43 = jSONObject.optBoolean("sdk_tracking_reporter_enabled", false);
                    b = je1.b("fallback_hosts", jSONObject);
                    if (b == null) {
                        b = EmptyList.b;
                    }
                    List list = b;
                    boolean optBoolean44 = jSONObject.optBoolean("should_prefetch_dns", false);
                    boolean optBoolean45 = jSONObject.optBoolean("should_use_ad_rendered_web_view_callback", false);
                    boolean optBoolean46 = jSONObject.optBoolean("outstream_wrapper_video_supported", false);
                    boolean optBoolean47 = jSONObject.optBoolean("validate_click_in_web_view", false);
                    boolean optBoolean48 = jSONObject.optBoolean("pass_full_screen_height_from_sdk_enabled", false);
                    Integer a11 = a("instream_qrcode_size_in_px", jSONObject);
                    boolean optBoolean49 = jSONObject.optBoolean("hide_bottom_navigation_bar", false);
                    boolean optBoolean50 = jSONObject.optBoolean("pre_warm_web_view_on_background", false);
                    boolean optBoolean51 = jSONObject.optBoolean("support_gif", false);
                    ww0 a12 = !jSONObject.has("font") ? yw0.a(jSONObject.getJSONObject("font")) : null;
                    boolean optBoolean52 = jSONObject.optBoolean("force_default_player", false);
                    boolean optBoolean53 = jSONObject.optBoolean("use_media3", false);
                    optJSONObject2 = jSONObject.optJSONObject("session");
                    this.i.getClass();
                    if (optJSONObject2 != null && (optString = optJSONObject2.optString("token")) != null && optString.length() != 0) {
                        fz2Var = new fz2(optString);
                        optJSONObject3 = jSONObject.optJSONObject("playback_optimization_config");
                        pe2 pe2Var = this.j;
                        pe2Var.getClass();
                        if (optJSONObject3 != null) {
                            try {
                                j8y j8yVar2 = pe2Var.a;
                                String jSONObject2 = optJSONObject3.toString();
                                j8yVar2.getClass();
                                ne2Var = (ne2) j8yVar2.a(ne2.Companion.serializer(), jSONObject2);
                            } catch (Exception unused) {
                            }
                            return new qu2(optInt, optInt2, optLong2, optLong3, currentTimeMillis, optBoolean, optBoolean10, optBoolean11, optBoolean7, optBoolean8, optBoolean2, optBoolean3, optBoolean4, optBoolean5, optBoolean12, optBoolean13, optBoolean15, optBoolean14, optBoolean16, optBoolean25, optBoolean24, optBoolean17, optBoolean6, optBoolean18, optBoolean19, optString8, optBoolean20, optBoolean21, optBoolean9, optBoolean26, optBoolean27, optBoolean28, optBoolean29, optBoolean30, optBoolean31, optBoolean32, optBoolean33, optBoolean34, a, a2, gx2.a().d(), gx2.a().b(), valueOf, optString10, optString2, optString3, "7.18.6", optString4, optString7, optString5, optString6, valueOf2, hm0Var, optBoolean22, optBoolean23, b2, optString11, map, optBoolean35, optBoolean36, optBoolean37, l, l2, optBoolean38, a4, a5, valueOf3, optBoolean39, set, optBoolean40, optBoolean41, optBoolean42, a6, a7, a8, a9, a10, optBoolean43, list, optBoolean44, optBoolean45, optBoolean46, optBoolean47, optBoolean48, a11, optBoolean49, optBoolean50, a12, optBoolean52, optBoolean53, optBoolean51, fz2Var, ne2Var);
                        }
                        ne2Var = null;
                        return new qu2(optInt, optInt2, optLong2, optLong3, currentTimeMillis, optBoolean, optBoolean10, optBoolean11, optBoolean7, optBoolean8, optBoolean2, optBoolean3, optBoolean4, optBoolean5, optBoolean12, optBoolean13, optBoolean15, optBoolean14, optBoolean16, optBoolean25, optBoolean24, optBoolean17, optBoolean6, optBoolean18, optBoolean19, optString8, optBoolean20, optBoolean21, optBoolean9, optBoolean26, optBoolean27, optBoolean28, optBoolean29, optBoolean30, optBoolean31, optBoolean32, optBoolean33, optBoolean34, a, a2, gx2.a().d(), gx2.a().b(), valueOf, optString10, optString2, optString3, "7.18.6", optString4, optString7, optString5, optString6, valueOf2, hm0Var, optBoolean22, optBoolean23, b2, optString11, map, optBoolean35, optBoolean36, optBoolean37, l, l2, optBoolean38, a4, a5, valueOf3, optBoolean39, set, optBoolean40, optBoolean41, optBoolean42, a6, a7, a8, a9, a10, optBoolean43, list, optBoolean44, optBoolean45, optBoolean46, optBoolean47, optBoolean48, a11, optBoolean49, optBoolean50, a12, optBoolean52, optBoolean53, optBoolean51, fz2Var, ne2Var);
                    }
                    fz2Var = null;
                    optJSONObject3 = jSONObject.optJSONObject("playback_optimization_config");
                    pe2 pe2Var2 = this.j;
                    pe2Var2.getClass();
                    if (optJSONObject3 != null) {
                    }
                    ne2Var = null;
                    return new qu2(optInt, optInt2, optLong2, optLong3, currentTimeMillis, optBoolean, optBoolean10, optBoolean11, optBoolean7, optBoolean8, optBoolean2, optBoolean3, optBoolean4, optBoolean5, optBoolean12, optBoolean13, optBoolean15, optBoolean14, optBoolean16, optBoolean25, optBoolean24, optBoolean17, optBoolean6, optBoolean18, optBoolean19, optString8, optBoolean20, optBoolean21, optBoolean9, optBoolean26, optBoolean27, optBoolean28, optBoolean29, optBoolean30, optBoolean31, optBoolean32, optBoolean33, optBoolean34, a, a2, gx2.a().d(), gx2.a().b(), valueOf, optString10, optString2, optString3, "7.18.6", optString4, optString7, optString5, optString6, valueOf2, hm0Var, optBoolean22, optBoolean23, b2, optString11, map, optBoolean35, optBoolean36, optBoolean37, l, l2, optBoolean38, a4, a5, valueOf3, optBoolean39, set, optBoolean40, optBoolean41, optBoolean42, a6, a7, a8, a9, a10, optBoolean43, list, optBoolean44, optBoolean45, optBoolean46, optBoolean47, optBoolean48, a11, optBoolean49, optBoolean50, a12, optBoolean52, optBoolean53, optBoolean51, fz2Var, ne2Var);
                }
            }
            hm0Var = null;
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
            Integer a42 = a("exit_info_anr_tracker_max_results", jSONObject);
            Integer a52 = a("exit_info_anr_tracker_historical_threshold_days", jSONObject);
            if (!jSONObject.has("exit_info_anr_tracker_enriched_traces_enabled")) {
            }
            boolean optBoolean392 = jSONObject.optBoolean("crash_ignore_enabled", false);
            optJSONArray = jSONObject.optJSONArray("crash_stack_trace_exclusion_rules");
            if (optJSONArray == null) {
            }
            boolean optBoolean402 = jSONObject.optBoolean("time_stamping_tracking_urls_enabled", false);
            boolean optBoolean412 = jSONObject.optBoolean("app_ad_analytics_reporting_enabled", true);
            boolean optBoolean422 = jSONObject.optBoolean("app_metrica_easy_integration_auto_activation_disabled", false);
            Integer a62 = a("network_thread_pool_size", jSONObject);
            Integer a72 = a("image_loading_thread_pool_size", jSONObject);
            Integer a82 = a("timeout_interval_for_request", jSONObject);
            Integer a92 = a("timeout_interval_for_ping_request", jSONObject);
            u7 u7Var2 = this.g;
            JSONObject optJSONObject72 = jSONObject.optJSONObject("verification_configuration");
            u7Var2.getClass();
            f8 a102 = u7.a(optJSONObject72);
            boolean optBoolean432 = jSONObject.optBoolean("sdk_tracking_reporter_enabled", false);
            b = je1.b("fallback_hosts", jSONObject);
            if (b == null) {
            }
            List list2 = b;
            boolean optBoolean442 = jSONObject.optBoolean("should_prefetch_dns", false);
            boolean optBoolean452 = jSONObject.optBoolean("should_use_ad_rendered_web_view_callback", false);
            boolean optBoolean462 = jSONObject.optBoolean("outstream_wrapper_video_supported", false);
            boolean optBoolean472 = jSONObject.optBoolean("validate_click_in_web_view", false);
            boolean optBoolean482 = jSONObject.optBoolean("pass_full_screen_height_from_sdk_enabled", false);
            Integer a112 = a("instream_qrcode_size_in_px", jSONObject);
            boolean optBoolean492 = jSONObject.optBoolean("hide_bottom_navigation_bar", false);
            boolean optBoolean502 = jSONObject.optBoolean("pre_warm_web_view_on_background", false);
            boolean optBoolean512 = jSONObject.optBoolean("support_gif", false);
            if (!jSONObject.has("font")) {
            }
            boolean optBoolean522 = jSONObject.optBoolean("force_default_player", false);
            boolean optBoolean532 = jSONObject.optBoolean("use_media3", false);
            optJSONObject2 = jSONObject.optJSONObject("session");
            this.i.getClass();
            if (optJSONObject2 != null) {
                fz2Var = new fz2(optString);
                optJSONObject3 = jSONObject.optJSONObject("playback_optimization_config");
                pe2 pe2Var22 = this.j;
                pe2Var22.getClass();
                if (optJSONObject3 != null) {
                }
                ne2Var = null;
                return new qu2(optInt, optInt2, optLong2, optLong3, currentTimeMillis, optBoolean, optBoolean10, optBoolean11, optBoolean7, optBoolean8, optBoolean2, optBoolean3, optBoolean4, optBoolean5, optBoolean12, optBoolean13, optBoolean15, optBoolean14, optBoolean16, optBoolean252, optBoolean242, optBoolean17, optBoolean6, optBoolean18, optBoolean19, optString8, optBoolean20, optBoolean21, optBoolean9, optBoolean262, optBoolean272, optBoolean282, optBoolean292, optBoolean302, optBoolean312, optBoolean322, optBoolean332, optBoolean342, a, a2, gx2.a().d(), gx2.a().b(), valueOf, optString102, optString2, optString3, "7.18.6", optString4, optString7, optString5, optString6, valueOf2, hm0Var, optBoolean22, optBoolean23, b2, optString112, map, optBoolean352, optBoolean362, optBoolean372, l3, l22, optBoolean382, a42, a52, valueOf3, optBoolean392, set, optBoolean402, optBoolean412, optBoolean422, a62, a72, a82, a92, a102, optBoolean432, list2, optBoolean442, optBoolean452, optBoolean462, optBoolean472, optBoolean482, a112, optBoolean492, optBoolean502, a12, optBoolean522, optBoolean532, optBoolean512, fz2Var, ne2Var);
            }
            fz2Var = null;
            optJSONObject3 = jSONObject.optJSONObject("playback_optimization_config");
            pe2 pe2Var222 = this.j;
            pe2Var222.getClass();
            if (optJSONObject3 != null) {
            }
            ne2Var = null;
            return new qu2(optInt, optInt2, optLong2, optLong3, currentTimeMillis, optBoolean, optBoolean10, optBoolean11, optBoolean7, optBoolean8, optBoolean2, optBoolean3, optBoolean4, optBoolean5, optBoolean12, optBoolean13, optBoolean15, optBoolean14, optBoolean16, optBoolean252, optBoolean242, optBoolean17, optBoolean6, optBoolean18, optBoolean19, optString8, optBoolean20, optBoolean21, optBoolean9, optBoolean262, optBoolean272, optBoolean282, optBoolean292, optBoolean302, optBoolean312, optBoolean322, optBoolean332, optBoolean342, a, a2, gx2.a().d(), gx2.a().b(), valueOf, optString102, optString2, optString3, "7.18.6", optString4, optString7, optString5, optString6, valueOf2, hm0Var, optBoolean22, optBoolean23, b2, optString112, map, optBoolean352, optBoolean362, optBoolean372, l3, l22, optBoolean382, a42, a52, valueOf3, optBoolean392, set, optBoolean402, optBoolean412, optBoolean422, a62, a72, a82, a92, a102, optBoolean432, list2, optBoolean442, optBoolean452, optBoolean462, optBoolean472, optBoolean482, a112, optBoolean492, optBoolean502, a12, optBoolean522, optBoolean532, optBoolean512, fz2Var, ne2Var);
        } catch (JSONException e) {
            this.a.reportError("Can't parse sdk configuration response", e);
            return null;
        }
    }
}
