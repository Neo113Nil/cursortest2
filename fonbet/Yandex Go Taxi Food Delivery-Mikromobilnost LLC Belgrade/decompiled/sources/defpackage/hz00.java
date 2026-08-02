package defpackage;

import android.net.Uri;
import androidx.media3.exoplayer.offline.DownloadService;
import com.yandex.go.deeplinks.generated.masstransit_payment_ble.MasstransitPaymentBleExitBehavior;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import io.appmetrica.analytics.rtm.internal.Constants;

/* loaded from: classes.dex */
public final class hz00 implements h0h {
    public final /* synthetic */ int a;
    public static final hz00 b = new hz00(0);
    public static final hz00 c = new hz00(1);
    public static final hz00 d = new hz00(2);
    public static final hz00 e = new hz00(3);
    public static final hz00 f = new hz00(4);
    public static final hz00 g = new hz00(5);
    public static final hz00 h = new hz00(6);
    public static final hz00 i = new hz00(7);
    public static final hz00 j = new hz00(8);
    public static final hz00 k = new hz00(9);
    public static final hz00 l = new hz00(10);
    public static final hz00 m = new hz00(11);
    public static final hz00 n = new hz00(12);
    public static final hz00 o = new hz00(13);
    public static final hz00 p = new hz00(14);
    public static final hz00 q = new hz00(15);
    public static final hz00 r = new hz00(16);
    public static final hz00 s = new hz00(17);
    public static final hz00 t = new hz00(18);
    public static final hz00 u = new hz00(19);
    public static final hz00 v = new hz00(20);
    public static final hz00 w = new hz00(21);
    public static final hz00 x = new hz00(22);
    public static final hz00 y = new hz00(23);
    public static final hz00 z = new hz00(24);
    public static final hz00 A = new hz00(25);
    public static final hz00 B = new hz00(26);
    public static final hz00 C = new hz00(27);
    public static final hz00 D = new hz00(28);
    public static final hz00 E = new hz00(29);

    public /* synthetic */ hz00(int i2) {
        this.a = i2;
    }

    @Override // defpackage.h0h
    public final String a() {
        switch (this.a) {
            case 0:
                return "masstransit-line";
            case 1:
                return "masstransit_order";
            case 2:
                return "masstransit-payment-qr";
            case 3:
                return "masstransit-route";
            case 4:
                return "masstransit-schedule";
            case 5:
                return "masstransit-station-search";
            case 6:
                return "masstransit-stop";
            case 7:
                return "masstransit-transport-cards";
            case 8:
                return "masstransit-vehicle";
            case 9:
                return "masstransit-payment-ble";
            case 10:
                return "mobility_hub";
            case 11:
                return "mobility_hub_route_details";
            case 12:
                return "multimodal_route";
            case 13:
                return "navigator";
            case 14:
                return "open_url_for_identifier";
            case 15:
                return "order_history";
            case 16:
                return "partners";
            case 17:
                return "pay_debt";
            case 18:
                return "paymentmethods";
            case 19:
                return "phonish_upgrade";
            case 20:
                return "plusburns";
            case 21:
                return "plus-home-sdk";
            case 22:
                return "porttech";
            case 23:
                return "promocode";
            case 24:
                return "push_settings";
            case 25:
                return "qr_scanner";
            case 26:
                return "receipt";
            case 27:
                return "referral";
            case 28:
                return "requirement";
            default:
                return "route";
        }
    }

    @Override // defpackage.h0h
    public final Object d(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        String queryParameter10;
        String queryParameter11;
        MasstransitPaymentBleExitBehavior masstransitPaymentBleExitBehavior = null;
        switch (this.a) {
            case 0:
                if (b(uri) && (queryParameter = uri.getQueryParameter("line_id")) != null) {
                    return new gz00(queryParameter, uri.getQueryParameter("utm_source"), uri.getQueryParameter("utm_medium"));
                }
                return null;
            case 1:
                if (b(uri)) {
                    return new i010(uri.getQueryParameter("id"));
                }
                return null;
            case 2:
                if (b(uri)) {
                    return new s010();
                }
                return null;
            case 3:
                if (!b(uri) || (queryParameter2 = uri.getQueryParameter("stop_id")) == null || (queryParameter3 = uri.getQueryParameter("line_id")) == null || (queryParameter4 = uri.getQueryParameter("thread_id")) == null) {
                    return null;
                }
                return new v010(queryParameter2, queryParameter3, queryParameter4, uri.getQueryParameter("utm_source"), uri.getQueryParameter("utm_medium"));
            case 4:
                if (b(uri)) {
                    return new y010(uri.getQueryParameter("starting_stop_id"), uri.getQueryParameter("destination_stop_id"), uri.getQueryParameter("utm_source"), uri.getQueryParameter("utm_medium"), uri.getQueryParameter("origin"));
                }
                return null;
            case 5:
                if (b(uri)) {
                    return new a110(uri.getQueryParameter("origin"));
                }
                return null;
            case 6:
                if (!b(uri) || (queryParameter5 = uri.getQueryParameter("stop_id")) == null) {
                    return null;
                }
                String queryParameter12 = uri.getQueryParameter("lat");
                Double i2 = queryParameter12 != null ? avu0.i(queryParameter12) : null;
                String queryParameter13 = uri.getQueryParameter("lon");
                return new e110(queryParameter5, i2, queryParameter13 != null ? avu0.i(queryParameter13) : null, uri.getQueryParameter("name"), uri.getQueryParameter("utm_source"), uri.getQueryParameter("utm_medium"));
            case 7:
                if (b(uri)) {
                    return new q110(uri);
                }
                return null;
            case 8:
                if (!b(uri) || (queryParameter6 = uri.getQueryParameter("vehicle_id")) == null || (queryParameter7 = uri.getQueryParameter("line_id")) == null) {
                    return null;
                }
                return new t110(queryParameter6, queryParameter7, uri.getQueryParameter("utm_source"), uri.getQueryParameter("utm_medium"));
            case 9:
                if (!b(uri)) {
                    return null;
                }
                String queryParameter14 = uri.getQueryParameter("exit_behavior");
                if (queryParameter14 != null) {
                    MasstransitPaymentBleExitBehavior.Companion.getClass();
                    masstransitPaymentBleExitBehavior = t310.a(queryParameter14);
                }
                return new r310(masstransitPaymentBleExitBehavior, uri.getQueryParameter("utm_source"), uri.getQueryParameter("utm_medium"));
            case 10:
                return e(uri);
            case 11:
                if (!b(uri) || (queryParameter8 = uri.getQueryParameter("transport_type")) == null || (queryParameter9 = uri.getQueryParameter("route_uri")) == null) {
                    return null;
                }
                return new wv20(queryParameter8, queryParameter9);
            case 12:
                if (!b(uri) || (queryParameter10 = uri.getQueryParameter("id")) == null || (queryParameter11 = uri.getQueryParameter("route_type")) == null) {
                    return null;
                }
                return new gs40(queryParameter10, queryParameter11);
            case 13:
                if (!b(uri)) {
                    return null;
                }
                String queryParameter15 = uri.getQueryParameter("dst_lat");
                String queryParameter16 = uri.getQueryParameter("dst_lon");
                String queryParameter17 = uri.getQueryParameter("utm");
                String queryParameter18 = uri.getQueryParameter("entry_point");
                String queryParameter19 = uri.getQueryParameter("payload");
                String queryParameter20 = uri.getQueryParameter("route_stops");
                String queryParameter21 = uri.getQueryParameter("start_route_on_redirect");
                Boolean j0 = queryParameter21 != null ? evu0.j0(queryParameter21) : null;
                String queryParameter22 = uri.getQueryParameter("propose_finish_on_exit");
                return new ib50(j0, queryParameter22 != null ? evu0.j0(queryParameter22) : null, queryParameter15, queryParameter16, queryParameter17, queryParameter18, queryParameter19, queryParameter20);
            case 14:
                if (b(uri)) {
                    return new b970(uri);
                }
                return null;
            case 15:
                if (b(uri)) {
                    return new gx70(uri);
                }
                return null;
            case 16:
                if (b(uri)) {
                    return new vi90(uri.getQueryParameter("zone"));
                }
                return null;
            case 17:
                if (b(uri)) {
                    return new ws90();
                }
                return null;
            case 18:
                if (b(uri)) {
                    return new z9a0(uri, uri.getQueryParameter(Constants.KEY_SERVICE), uri.getQueryParameter("type"));
                }
                return null;
            case 19:
                if (!b(uri)) {
                    return null;
                }
                String queryParameter23 = uri.getQueryParameter("required");
                return new ggb0(queryParameter23 != null ? evu0.j0(queryParameter23) : null);
            case 20:
                if (b(uri)) {
                    return new h1d0(uri);
                }
                return null;
            case 21:
                if (b(uri)) {
                    return new j4d0(uri);
                }
                return null;
            case 22:
                if (b(uri)) {
                    return new pbe0(uri);
                }
                return null;
            case 23:
                if (b(uri)) {
                    return new drf0(uri, uri.getQueryParameter(AuthSdkActivity.RESPONSE_TYPE_CODE));
                }
                return null;
            case 24:
                if (b(uri)) {
                    return new h3g0();
                }
                return null;
            case 25:
                if (b(uri)) {
                    return new efg0();
                }
                return null;
            case 26:
                if (b(uri)) {
                    return new rfi0();
                }
                return null;
            case 27:
                if (b(uri)) {
                    return new oni0(uri);
                }
                return null;
            case 28:
                return f(uri);
            default:
                return g(uri);
        }
    }

    public jv20 e(Uri uri) {
        if (!b(uri)) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("start-lat");
        Double i2 = queryParameter != null ? avu0.i(queryParameter) : null;
        String queryParameter2 = uri.getQueryParameter("start-lon");
        Double i3 = queryParameter2 != null ? avu0.i(queryParameter2) : null;
        String queryParameter3 = uri.getQueryParameter("end-lat");
        Double i4 = queryParameter3 != null ? avu0.i(queryParameter3) : null;
        String queryParameter4 = uri.getQueryParameter("end-lon");
        Double i5 = queryParameter4 != null ? avu0.i(queryParameter4) : null;
        String queryParameter5 = uri.getQueryParameter("skip_taxi_main_on_back");
        return new jv20(uri, i2, i3, i4, i5, queryParameter5 != null ? evu0.j0(queryParameter5) : null, uri.getQueryParameter("guaranteed_first_offer_type"));
    }

    public gfj0 f(Uri uri) {
        if (b(uri)) {
            return new gfj0(uri, uri.getQueryParameter("requirementId"), uri.getQueryParameter("groupId"), uri.getQueryParameter("fallbackTariffClass"), uri.getQueryParameter("fallbackVerticalId"), uri.getQueryParameter("action"));
        }
        return null;
    }

    public c2l0 g(Uri uri) {
        if (!b(uri)) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("tariffClass");
        String queryParameter2 = uri.getQueryParameter("alternative");
        String queryParameter3 = uri.getQueryParameter("vertical");
        String queryParameter4 = uri.getQueryParameter("expandingState");
        String queryParameter5 = uri.getQueryParameter("selectedClasses");
        String queryParameter6 = uri.getQueryParameter("start");
        String queryParameter7 = uri.getQueryParameter("start-lat");
        Double i2 = queryParameter7 != null ? avu0.i(queryParameter7) : null;
        String queryParameter8 = uri.getQueryParameter("start-lon");
        Double i3 = queryParameter8 != null ? avu0.i(queryParameter8) : null;
        String queryParameter9 = uri.getQueryParameter("end");
        String queryParameter10 = uri.getQueryParameter("end-lat");
        Double i4 = queryParameter10 != null ? avu0.i(queryParameter10) : null;
        String queryParameter11 = uri.getQueryParameter("end-lon");
        Double i5 = queryParameter11 != null ? avu0.i(queryParameter11) : null;
        String queryParameter12 = uri.getQueryParameter("level");
        Integer l2 = queryParameter12 != null ? bvu0.l(10, queryParameter12) : null;
        String queryParameter13 = uri.getQueryParameter("sticky");
        Boolean j0 = queryParameter13 != null ? evu0.j0(queryParameter13) : null;
        String queryParameter14 = uri.getQueryParameter("multiclass");
        Boolean j02 = queryParameter14 != null ? evu0.j0(queryParameter14) : null;
        String queryParameter15 = uri.getQueryParameter("wait_prices");
        Boolean j03 = queryParameter15 != null ? evu0.j0(queryParameter15) : null;
        String queryParameter16 = uri.getQueryParameter(DownloadService.KEY_REQUIREMENTS);
        String queryParameter17 = uri.getQueryParameter("trap_mode");
        return new c2l0(uri, queryParameter, queryParameter2, queryParameter3, queryParameter4, queryParameter5, queryParameter6, i2, i3, queryParameter9, i4, i5, l2, j0, j02, j03, queryParameter16, queryParameter17 != null ? evu0.j0(queryParameter17) : null, uri.getQueryParameter("courier_comment"), uri.getQueryParameter("src_phone_number"), uri.getQueryParameter("dest_phone_number"), uri.getQueryParameter("extra_contact_phone"), uri.getQueryParameter("continuation"), uri.getQueryParameter("marketplace_chat_id"), uri.getQueryParameter("origin_deeplink"), uri.getQueryParameter("requirement_alternative_key"), uri.getQueryParameter("analytics_event"), uri.getQueryParameter("end-id"), uri.getQueryParameter("end-type"));
    }
}
