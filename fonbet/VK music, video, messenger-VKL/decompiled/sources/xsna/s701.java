package xsna;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzhf;
import com.google.android.gms.internal.measurement.zzhq;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.chromium.base.TimeUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
@VisibleForTesting
/* loaded from: classes13.dex */
public final class s701 {
    public static final r701 A;
    public static final r701 B;
    public static final r701 C;
    public static final r701 D;
    public static final r701 E;
    public static final r701 F;
    public static final r701 G;
    public static final r701 H;
    public static final r701 I;
    public static final r701 J;
    public static final r701 K;
    public static final r701 L;
    public static final r701 M;
    public static final r701 N;
    public static final r701 O;
    public static final r701 P;
    public static final r701 Q;
    public static final r701 R;
    public static final r701 S;
    public static final r701 T;
    public static final r701 U;
    public static final r701 V;
    public static final r701 W;
    public static final r701 X;
    public static final r701 Y;
    public static final r701 Z;
    public static final r701 a0;
    public static final r701 b0;
    public static final r701 c0;
    public static final r701 d;
    public static final r701 d0;
    public static final r701 e;
    public static final r701 e0;
    public static final r701 f;
    public static final r701 f0;
    public static final r701 g;
    public static final r701 g0;
    public static final r701 h;
    public static final r701 h0;
    public static final r701 i;
    public static final r701 i0;
    public static final r701 j;
    public static final r701 j0;
    public static final r701 k;
    public static final r701 k0;
    public static final r701 l;
    public static final r701 l0;
    public static final r701 m;
    public static final r701 m0;
    public static final r701 n;
    public static final r701 n0;
    public static final r701 o;
    public static final r701 o0;
    public static final r701 p;
    public static final r701 p0;
    public static final r701 q;
    public static final r701 r;
    public static final r701 s;
    public static final r701 t;
    public static final r701 u;
    public static final r701 v;
    public static final r701 w;
    public static final r701 x;
    public static final r701 y;
    public static final r701 z;
    public static final List a = dez0.b();
    public static final Set b = Collections.synchronizedSet(new HashSet());
    public static final r701 c = a("measurement.ad_id_cache_time", 10000L, 10000L, f9t.k);

    static {
        Long valueOf = Long.valueOf(TimeUtils.MILLISECONDS_PER_DAY);
        d = a("measurement.monitoring.sample_period_millis", valueOf, valueOf, his0.b);
        e = a("measurement.config.cache_time", valueOf, 3600000L, cdi.h);
        f = a("measurement.config.url_scheme", HttpRequest.DEFAULT_SCHEME, HttpRequest.DEFAULT_SCHEME, sd9.e);
        g = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", wlb0.d);
        h = a("measurement.upload.max_bundles", 100, 100, x1o0.g);
        i = a("measurement.upload.max_batch_size", 65536, 65536, tni.d);
        j = a("measurement.upload.max_bundle_size", 65536, 65536, ne7.h);
        k = a("measurement.upload.max_events_per_bundle", 1000, 1000, ao8.g);
        l = a("measurement.upload.max_events_per_day", 100000, 100000, tci.d);
        m = a("measurement.upload.max_error_events_per_day", 1000, 1000, p490.j);
        n = a("measurement.upload.max_public_events_per_day", 50000, 50000, nr2.e);
        o = a("measurement.upload.max_conversions_per_day", 10000, 10000, xo9.h);
        p = a("measurement.upload.max_realtime_events_per_day", 10, 10, f870.e);
        q = a("measurement.store.max_stored_events_per_app", 100000, 100000, fz5.f);
        r = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", n34.f);
        s = a("measurement.upload.backoff_period", 43200000L, 43200000L, f9t.l);
        a("measurement.upload.window_interval", 3600000L, 3600000L, d370.k);
        t = a("measurement.upload.interval", 3600000L, 3600000L, xx1.d);
        u = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, qv20.d);
        v = a("measurement.upload.debug_upload_interval", 1000L, 1000L, k15.b);
        w = a("measurement.upload.minimum_delay", 500L, 500L, atv0.e);
        x = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, ad0.j);
        y = a("measurement.upload.stale_data_deletion_interval", valueOf, valueOf, f870.d);
        z = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, sni.h);
        A = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, ao8.f);
        B = a("measurement.upload.retry_time", 1800000L, 1800000L, dz5.d);
        C = a("measurement.upload.retry_count", 6, 6, fai.d);
        D = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, bhu.d);
        E = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, po40.g);
        F = a("measurement.audience.filter_result_max_count", 200, 200, i35.h);
        G = a("measurement.upload.max_public_user_properties", 25, 25, null);
        H = a("measurement.upload.max_event_name_cardinality", 500, 500, null);
        I = a("measurement.upload.max_public_event_params", 25, 25, null);
        J = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, q6x.l);
        Boolean bool = Boolean.FALSE;
        K = a("measurement.test.boolean_flag", bool, bool, edi.g);
        L = a("measurement.test.string_flag", "---", "---", o19.j);
        M = a("measurement.test.long_flag", -1L, -1L, fdi.e);
        N = a("measurement.test.int_flag", -2, -2, zjq.f);
        Double valueOf2 = Double.valueOf(-3.0d);
        O = a("measurement.test.double_flag", valueOf2, valueOf2, s490.b);
        P = a("measurement.experiment.max_ids", 50, 50, hr80.g);
        Q = a("measurement.max_bundles_per_iteration", 100, 100, up2.f);
        R = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, sv1.g);
        S = a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, sa30.c);
        Boolean bool2 = Boolean.TRUE;
        a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, egi.f);
        T = a("measurement.quality.checksum", bool, bool, null);
        U = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, q7o.d);
        V = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, rdi.i);
        W = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, skd.e);
        X = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, zq70.f);
        Y = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, sdi.e);
        Z = a("measurement.lifecycle.app_in_background_parameter", bool, bool, m200.k);
        a0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, jvi.c);
        b0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, s200.m);
        c0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, xx1.e);
        d0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, l2l0.d);
        a("measurement.collection.synthetic_data_mitigation", bool, bool, c4g0.j);
        e0 = a("measurement.service.storage_consent_support_version", 203600, 203600, gcd0.f);
        a("measurement.client.click_identifier_control.dev", bool, bool, sp.h);
        a("measurement.service.click_identifier_control", bool, bool, m4s.l);
        f0 = a("measurement.service.store_null_safelist", bool2, bool2, s101.g);
        g0 = a("measurement.service.store_safelist", bool2, bool2, qxm0.g);
        a("measurement.collection.enable_session_stitching_token.service", bool, bool, wwf0.e);
        h0 = a("measurement.collection.enable_session_stitching_token.service_new", bool2, bool2, znk0.l);
        i0 = a("measurement.collection.enable_session_stitching_token.client.dev", bool2, bool2, wp80.b);
        j0 = a("measurement.session_stitching_token_enabled", bool, bool, fto0.m);
        k0 = a("measurement.redaction.e_tag", bool2, bool2, blk.g);
        l0 = a("measurement.redaction.client_ephemeral_aiid_generation", bool2, bool2, kq01.h);
        m0 = a("measurement.redaction.retain_major_os_version", bool2, bool2, jcr.d);
        a("measurement.redaction.scion_payload_generator", bool2, bool2, xus.e);
        n0 = a("measurement.audience.dynamic_filters.oob_fix", bool2, bool2, kci.f);
        o0 = a("measurement.service.clear_global_params_on_uninstall", bool2, bool2, sni.i);
        p0 = a("measurement.sessionid.enable_client_session_id", bool2, bool2, kn4.g);
    }

    @VisibleForTesting
    public static r701 a(String str, Object obj, Object obj2, q701 q701Var) {
        r701 r701Var = new r701(str, obj, obj2, q701Var);
        a.add(r701Var);
        return r701Var;
    }

    public static Map b(Context context) {
        zzhf zza = zzhf.zza(context.getContentResolver(), zzhq.zza("com.google.android.gms.measurement"), p001.b);
        return zza == null ? Collections.EMPTY_MAP : zza.zzc();
    }
}
