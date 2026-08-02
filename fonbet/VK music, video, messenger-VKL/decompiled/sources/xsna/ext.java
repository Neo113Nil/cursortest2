package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.android.billingclient.api.BillingClient;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.X3;
import com.vk.api.generated.tabbar.dto.TabbarGetResponseDto;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.preference.Preference;
import com.vk.dto.menu.a;
import com.vk.dto.specials.SpecialEvents;
import com.vk.dto.user.BirthDateVisibility;
import com.vk.internal.api.GsonHolder;
import com.vk.log.L;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.json.JSONObject;
import xsna.ky6;

/* compiled from: GetWallInfo.java */
/* loaded from: classes4.dex */
public final class ext extends awi<b> {
    public static final String[] t = {"audio_ads", "audio_background_limit", "country", "discover_design_version", "discover_preload", "discover_preload_not_seen", "gif_autoplay", "https_required", "inline_comments", "intro", "lang", "menu_intro", "money_clubs_p2p", "money_p2p", "money_p2p_params", "music_intro", "audio_restrictions", "profiler_settings", "raise_to_record_enabled", "stories", "masks", BillingClient.FeatureType.SUBSCRIPTIONS, "support_url", "video_autoplay", "video_player", "vklive_app", "community_comments", "webview_authorization", "story_replies", "animated_stickers", "live_section", "podcasts_section", "playlists_download", "calls", "security_issue", "eu_user", "wallet", "vkui_community_create", "vkui_profile_edit", "vkui_community_manage", "vk_apps", "stories_photo_duration", "stories_reposts", "live_streaming", "live_masks", "camera_pingpong", "role", "video_discover", "vk_identity", "clickable_stickers", "phone_verify", "bugs", "link_redirects", "qr_promotion", "valid_from", "send_common_network_stats_until", "send_images_network_stats_until", "send_audio_network_stats_until", "comment_restriction", "shopping_params", "is_topic_expert", "cache", "page_size", "newsfeed", "vk_pay_endpoint", "invite_link", "market_orders", "js_injections", "menu_ads_easy_promote", "phone", "subscription_combo_allowed", "stories", "im_user_name_type", "messages_counter_settings", "messages_recommendation_list_hidden", "side_menu_custom_items", "obscene_text_filter", "market_adult_18plus", "can_change_password", "feed_preloading", "feed_applovin_unit_id", "user_id_hash", "feed_yandex_ads_unit_id"};
    public static final String[] u = {"photo_base", "exports", "country", "sex", "status", "bdate", "first_name_gen", "last_name_gen", "verified", "trending", "is_verified", X3.j.D, "followers_count", "image_status", "bdate_visibility", "is_nft", "is_followers_mode_on", "joined"};
    public final boolean s;

    /* compiled from: GetWallInfo.java */
    public static class a extends Exception {
    }

    /* compiled from: GetWallInfo.java */
    public static class b {
        public m6r0 a;
        public TabbarGetResponseDto b;
        public String c;
        public String d;

        public b() {
            new tp();
        }
    }

    public ext(boolean z) {
        this.s = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c6 A[Catch: Exception -> 0x00d4, TryCatch #0 {Exception -> 0x00d4, blocks: (B:3:0x0003, B:5:0x004c, B:7:0x0053, B:8:0x005c, B:10:0x008b, B:13:0x0094, B:15:0x00c6, B:16:0x00d9, B:18:0x00e1, B:19:0x00f3, B:23:0x00d6, B:25:0x005a), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e1 A[Catch: Exception -> 0x00d4, TryCatch #0 {Exception -> 0x00d4, blocks: (B:3:0x0003, B:5:0x004c, B:7:0x0053, B:8:0x005c, B:10:0x008b, B:13:0x0094, B:15:0x00c6, B:16:0x00d9, B:18:0x00e1, B:19:0x00f3, B:23:0x00d6, B:25:0x005a), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d6 A[Catch: Exception -> 0x00d4, TryCatch #0 {Exception -> 0x00d4, blocks: (B:3:0x0003, B:5:0x004c, B:7:0x0053, B:8:0x005c, B:10:0x008b, B:13:0x0094, B:15:0x00c6, B:16:0x00d9, B:18:0x00e1, B:19:0x00f3, B:23:0x00d6, B:25:0x005a), top: B:2:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b F0(@NonNull JSONObject jSONObject) {
        boolean z;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        try {
            Preference.C("NavigationUtils", "cached_is_enabled");
            Preference.C("NavigationUtils", "cached_source");
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            JSONObject jSONObject3 = jSONObject2.getJSONObject(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
            JSONObject jSONObject4 = jSONObject2.getJSONObject("info");
            b bVar = new b();
            m6r0 m6r0Var = new m6r0();
            bVar.a = m6r0Var;
            m6r0Var.j(jSONObject2);
            bVar.a.f(m6r0.o, jSONObject3.optString("bdate", ""));
            m6r0 m6r0Var2 = bVar.a;
            int optInt = jSONObject3.optInt("bdate_visibility");
            BirthDateVisibility.Companion.getClass();
            BirthDateVisibility birthDateVisibility = (optInt < 0 || optInt >= BirthDateVisibility.values().length) ? BirthDateVisibility.SHOW : BirthDateVisibility.values()[optInt];
            m6r0Var2.getClass();
            m6r0Var2.f(m6r0.p, Integer.valueOf(birthDateVisibility.h()));
            bVar.a.f(m6r0.i1, Long.valueOf(jSONObject3.optLong("joined", 0L)));
            a.C0910a c0910a = bVar.a.s().c;
            if (c0910a != null) {
                z = true;
                if (c0910a.c()) {
                    Preference.I("NavigationUtils", "synced_is_enabled", z);
                    bVar.c = jSONObject4.optString("security_issue");
                    bVar.d = f370.A("exchange_token", jSONObject2);
                    jSONObject4.optString("phone");
                    jSONObject4.optString("phone_verify_sid");
                    jSONObject4.optInt("phone_verify_delay");
                    fjk0 P = hd60.a().P();
                    optJSONObject = jSONObject2.optJSONObject("special_events");
                    if (optJSONObject == null) {
                        pro0.e(new dxt(0, P, SpecialEvents.e(optJSONObject)));
                    } else {
                        P.a();
                    }
                    optJSONObject2 = jSONObject2.optJSONObject("navigation_tabbar");
                    if (optJSONObject2 != null) {
                        bVar.b = (TabbarGetResponseDto) GsonHolder.a().fromJson(optJSONObject2.toString(), TabbarGetResponseDto.class);
                    }
                    ky6.a aVar = (ky6.a) Preference.j().edit();
                    aVar.putLong("get_wall_info_last_update", System.currentTimeMillis());
                    aVar.a();
                    return bVar;
                }
            }
            z = false;
            Preference.I("NavigationUtils", "synced_is_enabled", z);
            bVar.c = jSONObject4.optString("security_issue");
            bVar.d = f370.A("exchange_token", jSONObject2);
            jSONObject4.optString("phone");
            jSONObject4.optString("phone_verify_sid");
            jSONObject4.optInt("phone_verify_delay");
            fjk0 P2 = hd60.a().P();
            optJSONObject = jSONObject2.optJSONObject("special_events");
            if (optJSONObject == null) {
            }
            optJSONObject2 = jSONObject2.optJSONObject("navigation_tabbar");
            if (optJSONObject2 != null) {
            }
            ky6.a aVar2 = (ky6.a) Preference.j().edit();
            aVar2.putLong("get_wall_info_last_update", System.currentTimeMillis());
            aVar2.a();
            return bVar;
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(new a(e));
            L.E(e, new Object[0]);
            return null;
        }
    }

    public static boolean H0() {
        c63 c63Var = c63.a;
        Activity b2 = c63.b();
        if (b2 != null) {
            HashSet hashSet = iah0.a;
            return fnj.d(b2);
        }
        Context context = e43.a;
        if (context == null) {
            return false;
        }
        HashSet hashSet2 = iah0.a;
        return fnj.b(context);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        return F0(jSONObject);
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) throws InterruptedException, IOException, VKApiException {
        String supportedFeatures = q7n0.a().R().getSupportedFeatures();
        List asList = Arrays.asList(u);
        List asList2 = Arrays.asList(t);
        boolean z = this.s;
        long currentTimeMillis = System.currentTimeMillis();
        SimpleTimeZone simpleTimeZone = pvo0.a;
        TimeZone timeZone = TimeZone.getDefault();
        Date date = new Date();
        int rawOffset = TimeZone.getDefault().getRawOffset();
        if (timeZone.inDaylightTime(date)) {
            rawOffset += timeZone.getDSTSavings();
        }
        int i = (int) ((currentTimeMillis + rawOffset) / 1000);
        boolean z2 = !H0();
        boolean H0 = H0();
        List list = (List) Stream.of(supportedFeatures).collect(Collectors.toList());
        tfx tfxVar = new tfx("users.getUserInfo", new pq(24), new iun0(4));
        if (asList != null) {
            tfxVar.i("profile_fields", asList);
        }
        if (asList2 != null) {
            tfxVar.i("account_fields", asList2);
        }
        tfxVar.j("needExchangeToken", z);
        tfx.l(tfxVar, "visible_time", i, 0, 0, 12);
        tfxVar.j("load_tabbar_navigation", z2);
        tfxVar.j("wide", H0);
        if (list != null) {
            tfxVar.i("supported_features", list);
        }
        hz2 z3 = yfb.z(tfxVar, new ci7(25));
        z3.c = true;
        String str = this.l;
        String str2 = this.m;
        z3.l = str;
        z3.m = str2;
        return (b) z3.f(l7r0Var);
    }
}
