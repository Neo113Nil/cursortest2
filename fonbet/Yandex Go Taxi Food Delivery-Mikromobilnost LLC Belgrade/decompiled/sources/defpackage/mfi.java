package defpackage;

import android.net.Uri;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.yandex.div.state.db.StateEntry;
import com.yandex.go.deeplinks.generated.city_mode.IntercityMode;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import java.util.Set;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes.dex */
public final class mfi implements h0h {
    public final /* synthetic */ int a;
    public static final mfi b = new mfi(0);
    public static final mfi c = new mfi(1);
    public static final mfi d = new mfi(2);
    public static final mfi e = new mfi(3);
    public static final mfi f = new mfi(4);
    public static final mfi g = new mfi(5);
    public static final mfi h = new mfi(6);
    public static final mfi i = new mfi(7);
    public static final mfi j = new mfi(8);
    public static final mfi k = new mfi(9);
    public static final mfi l = new mfi(10);
    public static final mfi m = new mfi(11);
    public static final mfi n = new mfi(12);
    public static final mfi o = new mfi(13);
    public static final mfi p = new mfi(14);
    public static final mfi q = new mfi(15);
    public static final mfi r = new mfi(16);
    public static final mfi s = new mfi(17);
    public static final mfi t = new mfi(18);
    public static final mfi u = new mfi(19);
    public static final mfi v = new mfi(20);
    public static final mfi w = new mfi(21);
    public static final mfi x = new mfi(22);
    public static final mfi y = new mfi(23);
    public static final mfi z = new mfi(24);
    public static final mfi A = new mfi(25);
    public static final mfi B = new mfi(26);
    public static final mfi C = new mfi(27);
    public static final mfi D = new mfi(28);
    public static final mfi E = new mfi(29);

    public /* synthetic */ mfi(int i2) {
        this.a = i2;
    }

    @Override // defpackage.h0h
    public final String a() {
        switch (this.a) {
            case 0:
                return "delivery_order_details";
            case 1:
                return "delivery_order_form";
            case 2:
                return "deliverypoint";
            case 3:
                return "discovery";
            case 4:
                return TariffOrderFlow.ORDER_FLOW_DRIVE_KEY;
            case 5:
                return "driver_instructions_on_summary";
            case 6:
                return "dump_tech_info";
            case 7:
                return "editusername";
            case 8:
                return "email";
            case 9:
                return "agreement";
            case 10:
                return "external";
            case 11:
                return "favorites";
            case 12:
                return "feed";
            case 13:
                return "fintechweb";
            case 14:
                return "flex";
            case 15:
                return "hire_driver";
            case 16:
                return "inapp_call_resume";
            case 17:
                return "inapp_call_update";
            case 18:
                return "information";
            case 19:
                return "intercity_main";
            case 20:
                return "city-mode";
            case 21:
                return "linkedorder";
            case 22:
                return "lostitems";
            case 23:
                return "loyalty_selector";
            case 24:
                return "maas-ride";
            case 25:
                return "main";
            case 26:
                return "main_menu";
            case 27:
                return "marketplace";
            case 28:
                return "masstransit-checkout";
            default:
                return "masstransit";
        }
    }

    @Override // defpackage.h0h
    public final Object d(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        switch (this.a) {
            case 0:
                if (b(uri)) {
                    return new lfi(uri.getQueryParameter("order_id"));
                }
                return null;
            case 1:
                if (b(uri)) {
                    return new xfi(uri);
                }
                return null;
            case 2:
                if (b(uri)) {
                    return new cki(uri);
                }
                return null;
            case 3:
                if (b(uri)) {
                    return new ksj(uri);
                }
                return null;
            case 4:
                if (b(uri)) {
                    return new edm(uri);
                }
                return null;
            case 5:
                if (b(uri)) {
                    return new pim();
                }
                return null;
            case 6:
                if (b(uri)) {
                    return new c3n();
                }
                return null;
            case 7:
                if (b(uri)) {
                    return new rnn();
                }
                return null;
            case 8:
                if (b(uri)) {
                    return new qrn();
                }
                return null;
            case 9:
                if (b(uri) && (queryParameter = uri.getQueryParameter("url")) != null) {
                    return new xco(uri, queryParameter);
                }
                return null;
            case 10:
                return e(uri);
            case 11:
                if (!b(uri)) {
                    return null;
                }
                String queryParameter5 = uri.getQueryParameter("lat");
                String queryParameter6 = uri.getQueryParameter("lon");
                String queryParameter7 = uri.getQueryParameter("apt");
                String queryParameter8 = uri.getQueryParameter("type");
                String queryParameter9 = uri.getQueryParameter("title");
                String queryParameter10 = uri.getQueryParameter("porch");
                String queryParameter11 = uri.getQueryParameter("floor");
                String queryParameter12 = uri.getQueryParameter("doorphone");
                String queryParameter13 = uri.getQueryParameter("isFromProfile");
                return new hip(queryParameter5, queryParameter6, queryParameter7, queryParameter8, queryParameter9, queryParameter10, queryParameter11, queryParameter12, queryParameter13 != null ? evu0.j0(queryParameter13) : null);
            case 12:
                if (b(uri)) {
                    return new eoq();
                }
                return null;
            case 13:
                if (b(uri) && (queryParameter2 = uri.getQueryParameter(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST)) != null) {
                    return new tbr(queryParameter2, uri.getQueryParameter(StateEntry.COLUMN_PATH), uri.getQueryParameter("auth_type"), uri.getQueryParameter("show_type"));
                }
                return null;
            case 14:
                if (!b(uri)) {
                    return null;
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                int d2 = gw00.d(tcc.n(queryParameterNames, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(d2 >= 16 ? d2 : 16);
                for (Object obj : queryParameterNames) {
                    String queryParameter14 = uri.getQueryParameter((String) obj);
                    if (queryParameter14 == null) {
                        queryParameter14 = "";
                    }
                    linkedHashMap.put(obj, queryParameter14);
                }
                return new eir(uri, linkedHashMap);
            case 15:
                if (!b(uri)) {
                    return null;
                }
                Set<String> queryParameterNames2 = uri.getQueryParameterNames();
                int d3 = gw00.d(tcc.n(queryParameterNames2, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(d3 >= 16 ? d3 : 16);
                for (Object obj2 : queryParameterNames2) {
                    String queryParameter15 = uri.getQueryParameter((String) obj2);
                    if (queryParameter15 == null) {
                        queryParameter15 = "";
                    }
                    linkedHashMap2.put(obj2, queryParameter15);
                }
                return new zju(linkedHashMap2);
            case 16:
                if (b(uri)) {
                    return new ajv();
                }
                return null;
            case 17:
                if (b(uri)) {
                    return new fjv();
                }
                return null;
            case 18:
                if (b(uri)) {
                    return new euv();
                }
                return null;
            case 19:
                if (b(uri)) {
                    return new bcw(uri);
                }
                return null;
            case 20:
                if (!b(uri) || (queryParameter3 = uri.getQueryParameter("mode")) == null) {
                    return null;
                }
                IntercityMode.Companion.getClass();
                IntercityMode a = gow.a(queryParameter3);
                if (a != null) {
                    return new plw(uri, a);
                }
                return null;
            case 21:
                if (b(uri)) {
                    return new uly();
                }
                return null;
            case 22:
                if (b(uri)) {
                    return new rrz(uri, uri.getQueryParameter("order_id"));
                }
                return null;
            case 23:
                if (b(uri)) {
                    return new ewz(uri.getQueryParameter("use_program"));
                }
                return null;
            case 24:
                if (b(uri) && (queryParameter4 = uri.getQueryParameter("mode")) != null) {
                    return new l000(queryParameter4, uri.getQueryParameter("coupon"), uri.getQueryParameter("vertical_id"), uri.getQueryParameter("open_reason"), uri.getQueryParameter("lat_a"), uri.getQueryParameter("lon_a"), uri.getQueryParameter("lat_b"), uri.getQueryParameter("lon_b"));
                }
                return null;
            case 25:
                if (b(uri)) {
                    return new l400();
                }
                return null;
            case 26:
                if (b(uri)) {
                    return new r500();
                }
                return null;
            case 27:
                if (b(uri)) {
                    return new wx00(uri);
                }
                return null;
            case 28:
                if (b(uri)) {
                    return new wy00(uri, uri.getQueryParameter("vehicle_id"), uri.getQueryParameter("qr_url"), uri.getQueryParameter("utm_source"), uri.getQueryParameter("utm_medium"), uri.getQueryParameter("card_link_status"));
                }
                return null;
            default:
                if (b(uri)) {
                    return new zy00(uri.getQueryParameter("utm_source"), uri.getQueryParameter("utm_medium"));
                }
                return null;
        }
    }

    public f0p e(Uri uri) {
        String queryParameter;
        if (b(uri) && (queryParameter = uri.getQueryParameter(Constants.KEY_SERVICE)) != null) {
            return new f0p(queryParameter);
        }
        return null;
    }
}
