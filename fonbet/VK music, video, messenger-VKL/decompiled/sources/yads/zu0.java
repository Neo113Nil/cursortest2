package yads;

import android.location.Location;
import android.net.Uri;
import com.ironsource.B5;
import com.ironsource.O6;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.builders.MapBuilder;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import xsna.bpn0;
import xsna.j5g;
import xsna.rn00;
import xsna.uki0;

/* loaded from: classes10.dex */
public final class zu0 {
    public final k9 a;
    public final um0 b;
    public final uki0 c;
    public final uki0 d;
    public final Lazy e;

    public zu0(vu0 vu0Var) {
        k9 k9Var = new k9();
        this.a = k9Var;
        this.b = new um0();
        MapBuilder mapBuilder = new MapBuilder();
        a(mapBuilder, "ad_unit_id", vu0Var.c());
        a(mapBuilder, "width", vu0Var.o0());
        a(mapBuilder, "height", vu0Var.B());
        a(mapBuilder, "ad_size_type", vu0Var.a());
        a(mapBuilder, X3.i.n, vu0Var.K());
        a(mapBuilder, "ads_count", vu0Var.f());
        a(mapBuilder, CommonUrlParts.SCREEN_WIDTH, vu0Var.a0());
        a(mapBuilder, CommonUrlParts.SCREEN_HEIGHT, vu0Var.Z());
        a(mapBuilder, CommonUrlParts.SCALE_FACTOR, vu0Var.X());
        a(mapBuilder, "ad_type", vu0Var.b());
        a(mapBuilder, StatCustomFieldKey.NETWORK_TYPE, vu0Var.H());
        a(mapBuilder, O6.R0, vu0Var.m());
        a((Map) mapBuilder, "dnt", vu0Var.z());
        a((Map) mapBuilder, "gaid_reset", vu0Var.v());
        a((Map) mapBuilder, "huawei_dnt", vu0Var.C());
        a(mapBuilder, "image_sizes", vu0Var.D());
        a(mapBuilder, "response_ad_format", vu0Var.S());
        a(mapBuilder, "debug_uid", vu0Var.s());
        a(mapBuilder, "open_bidding_data", vu0Var.I());
        a(mapBuilder, "session_random", vu0Var.e0());
        a(mapBuilder, B5.N, vu0Var.n());
        a(mapBuilder, k9Var.b(), vu0Var.u());
        a(mapBuilder, k9Var.f(), vu0Var.L());
        a(mapBuilder, k9Var.g(), vu0Var.M());
        a(mapBuilder, k9Var.d(), vu0Var.F());
        a(mapBuilder, k9Var.e(), vu0Var.G());
        a((Map) mapBuilder, k9Var.c(), vu0Var.p0());
        a(mapBuilder, "locale", vu0Var.E());
        a(mapBuilder, "content_language", vu0Var.i());
        List O = vu0Var.O();
        a(mapBuilder, "device_languages", O != null ? j5g.g0(O, StringUtils.PROCESS_POSTFIX_DELIMITER, null, null, 0, null, 62) : null);
        a(mapBuilder, "app_id", vu0Var.h());
        a(mapBuilder, "app_version_code", vu0Var.k());
        a(mapBuilder, CommonUrlParts.APP_VERSION, vu0Var.l());
        a(mapBuilder, "appmetrica_version", vu0Var.j());
        a(mapBuilder, CommonUrlParts.SCREEN_DPI, Integer.valueOf(vu0Var.Y()));
        a(mapBuilder, "safe_area_inset_left", Float.valueOf(vu0Var.U()));
        a(mapBuilder, "safe_area_inset_top", Float.valueOf(vu0Var.W()));
        a(mapBuilder, "safe_area_inset_right", Float.valueOf(vu0Var.V()));
        a(mapBuilder, "safe_area_inset_bottom", Float.valueOf(vu0Var.T()));
        a(mapBuilder, "cutout_safe_area_inset_top", Float.valueOf(vu0Var.r()));
        a(mapBuilder, "cutout_safe_area_inset_bottom", Float.valueOf(vu0Var.q()));
        a((Map) mapBuilder, "user_consent", vu0Var.j0());
        a(mapBuilder, "gdpr", vu0Var.w());
        a(mapBuilder, "gdpr_consent", vu0Var.x());
        a((Map) mapBuilder, "cmp_present", Boolean.valueOf(vu0Var.o()));
        a(mapBuilder, "parsed_purpose_consents", vu0Var.R());
        a(mapBuilder, "parsed_vendor_consents", vu0Var.k0());
        a(mapBuilder, "addtl_consent", vu0Var.d());
        a(mapBuilder, "bidding_data", vu0Var.A());
        a(mapBuilder, "prefetched_mediation_data", vu0Var.Q());
        a(mapBuilder, "connected_network_ids", vu0Var.p());
        a(mapBuilder, "sdk_version", vu0Var.b0());
        a(mapBuilder, "sdk_version_name", vu0Var.c0());
        a(mapBuilder, "sdk_vendor", "yandex");
        a(mapBuilder, "preferred_theme", vu0Var.P());
        a(mapBuilder, "device_theme", vu0Var.t());
        a((Map) mapBuilder, "age_restricted_user", vu0Var.g());
        a(mapBuilder, "view_size_info", vu0Var.l0());
        a((Map) mapBuilder, "web_view_available", vu0Var.n0());
        a(mapBuilder, "startup_version", vu0Var.g0());
        a(mapBuilder, "session-data", vu0Var.d0());
        a(mapBuilder, "user-agent", vu0Var.i0());
        a(mapBuilder, "stub_reason", vu0Var.h0());
        a((Map) mapBuilder, "gms_available", vu0Var.y());
        a((Map) mapBuilder, "opt_out", vu0Var.J());
        a((Map) mapBuilder, "vpn_enabled", vu0Var.m0());
        a(mapBuilder, vu0Var.f0());
        a(mapBuilder, vu0Var.N());
        a(mapBuilder, vu0Var);
        b(mapBuilder, vu0Var);
        this.c = rn00.w(mapBuilder.h());
        MapBuilder mapBuilder2 = new MapBuilder();
        for (Map.Entry entry : vu0Var.e().entrySet()) {
            a(mapBuilder2, (String) entry.getKey(), entry.getValue());
        }
        this.d = rn00.w(mapBuilder2.h());
        this.e = new bpn0(new yu0(this));
    }

    public final void a(Map map, vu0 vu0Var) {
        if (!vu0Var.g || vu0Var.f) {
            a(map, "uuid", vu0Var.u);
        }
        if (vu0Var.g) {
            return;
        }
        a(map, "age", vu0Var.y0);
        a(map, "gender", vu0Var.z0);
        a(map, "context_query", vu0Var.U);
        a(map, "context_taglist", vu0Var.V);
        a(map, "google_aid", vu0Var.P);
        a(map, CommonUrlParts.APP_SET_ID, vu0Var.l);
        a(map, "huawei_oaid", vu0Var.R);
        a(map, "mauid", vu0Var.m);
        a(map, this.a.a(), vu0Var.q0);
        a(map, "mcc", vu0Var.F);
        a(map, "mnc", vu0Var.G);
        a(map, "cellid", vu0Var.K);
        a(map, "lac", vu0Var.L);
        a(map, "wifi", vu0Var.M);
        a(map, "battery_charge", vu0Var.S);
        a(map, "server_side_client_ip", vu0Var.L0);
        a(map, "ipv6", vu0Var.M0);
    }

    public final void b(Map map, vu0 vu0Var) {
        Location location;
        if (vu0Var.a) {
            return;
        }
        g9 g9Var = vu0Var.J;
        if (g9Var == null || (location = g9Var.f) == null) {
            location = vu0Var.B;
        }
        if (location == null || !gx2.a().a()) {
            return;
        }
        a(map, O6.s, String.valueOf(location.getLatitude()));
        a(map, "lon", String.valueOf(location.getLongitude()));
        a(map, "location_timestamp", String.valueOf(location.getTime()));
        a(map, "precision", String.valueOf((int) location.getAccuracy()));
    }

    public final String toString() {
        return (String) this.e.getValue();
    }

    public final void a(Map map, String str, Boolean bool) {
        if (bool != null) {
            a(map, str, Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
    }

    public final void a(Map map, String str, Object obj) {
        String encode;
        if (obj != null) {
            String encode2 = Uri.encode(str);
            if (!this.b.a.contains(str)) {
                encode = Uri.encode(obj.toString());
            } else {
                encode = Uri.encode(obj.toString(), StringUtils.PROCESS_POSTFIX_DELIMITER);
            }
            map.put(encode2, encode);
        }
    }

    public final void a(Map map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            a(map, (String) entry.getKey(), (String) entry.getValue());
        }
    }
}
