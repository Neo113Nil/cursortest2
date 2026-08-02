package defpackage;

import android.net.Uri;
import androidx.media3.exoplayer.offline.DownloadService;
import com.yandex.go.deeplinks.generated.scooters.ScootersAutoselectSection;
import com.yandex.go.deeplinks.generated.scooters.ScootersBiometricAuthorizationSection;
import com.yandex.go.deeplinks.generated.scooters.ScootersIgnitionSection;
import com.yandex.go.deeplinks.generated.scooters.ScootersMosRuAuthorizationSection;
import com.yandex.go.deeplinks.generated.scooters.ScootersOrderSection;
import com.yandex.go.deeplinks.generated.scooters.ScootersPassesSection;
import com.yandex.go.deeplinks.generated.scooters.ScootersPaymentMethodsSection;
import com.yandex.go.deeplinks.generated.scooters.ScootersPersonalGoalsSection;
import com.yandex.go.deeplinks.generated.scooters.ScootersPhotocheckSection;
import com.yandex.go.deeplinks.generated.scooters.ScootersPromocodesSection;
import com.yandex.go.deeplinks.generated.scooters.ScootersQrScootersQrSection;
import com.yandex.go.deeplinks.generated.scooters.ScootersSubscriptionSection;
import com.yandex.go.deeplinks.generated.scooters.ScootersUpdateUserPdDataSection;
import com.yandex.go.deeplinks.generated.summary.SummarySection;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes.dex */
public final class frl0 implements h0h {
    public final /* synthetic */ int a;
    public static final frl0 b = new frl0(0);
    public static final frl0 c = new frl0(1);
    public static final frl0 d = new frl0(2);
    public static final frl0 e = new frl0(3);
    public static final frl0 f = new frl0(4);
    public static final frl0 g = new frl0(5);
    public static final frl0 h = new frl0(6);
    public static final frl0 i = new frl0(7);
    public static final frl0 j = new frl0(8);
    public static final frl0 k = new frl0(9);
    public static final frl0 l = new frl0(10);
    public static final frl0 m = new frl0(11);
    public static final frl0 n = new frl0(12);
    public static final frl0 o = new frl0(13);
    public static final frl0 p = new frl0(14);
    public static final frl0 q = new frl0(15);
    public static final frl0 r = new frl0(16);
    public static final frl0 s = new frl0(17);
    public static final frl0 t = new frl0(18);
    public static final frl0 u = new frl0(19);
    public static final frl0 v = new frl0(20);
    public static final frl0 w = new frl0(21);
    public static final frl0 x = new frl0(22);
    public static final frl0 y = new frl0(23);
    public static final frl0 z = new frl0(24);
    public static final frl0 A = new frl0(25);
    public static final frl0 B = new frl0(26);
    public static final frl0 C = new frl0(27);
    public static final frl0 D = new frl0(28);
    public static final frl0 E = new frl0(29);

    public /* synthetic */ frl0(int i2) {
        this.a = i2;
    }

    @Override // defpackage.h0h
    public final String a() {
        switch (this.a) {
            case 0:
                return "safetycenter";
            case 1:
                return "safety_center_instructions";
            case 2:
                return "save_ride";
            case 3:
                return "savetofavorites";
            case 4:
                return "sbpbindcompletion";
            case 5:
                return "scanned_qr";
            case 6:
                return "scheduleride";
            case 7:
                return "scooters";
            case 8:
                return "scooters";
            case 9:
                return "scooters";
            case 10:
                return "scooters";
            case 11:
                return "scooters";
            case 12:
                return "scooters";
            case 13:
                return "scooters";
            case 14:
                return "scooters";
            case 15:
                return "scooters";
            case 16:
                return "scooters";
            case 17:
                return "scooters";
            case 18:
                return "scooters";
            case 19:
                return "scooters";
            case 20:
                return "select_copter_city_tour";
            case 21:
                return "settings";
            case 22:
                return "coopaccount";
            case 23:
                return "something_wrong_screen";
            case 24:
                return "special_needs";
            case 25:
                return "story";
            case 26:
                return "address_input";
            case 27:
                return "summary";
            case 28:
                return "superapp_cart";
            default:
                return "superapp_discovery_map";
        }
    }

    @Override // defpackage.h0h
    public final Object d(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        Double i2;
        Double i3;
        String queryParameter5;
        int i4 = this.a;
        List<String> list = EmptyList.a;
        switch (i4) {
            case 0:
                if (b(uri)) {
                    return new erl0(uri.getQueryParameter("order_id"));
                }
                return null;
            case 1:
                if (b(uri)) {
                    return new hsl0(uri.getQueryParameter("order_id"), uri.getQueryParameter("instruction_id"));
                }
                return null;
            case 2:
                if (!b(uri) || (queryParameter = uri.getQueryParameter("id")) == null || (queryParameter2 = uri.getQueryParameter("source_name")) == null || (queryParameter3 = uri.getQueryParameter("destination_name")) == null) {
                    return null;
                }
                String queryParameter6 = uri.getQueryParameter("type_id");
                String queryParameter7 = uri.getQueryParameter("source_image");
                String queryParameter8 = uri.getQueryParameter("destination_image");
                String queryParameter9 = uri.getQueryParameter("ride_name");
                List<String> queryParameters = uri.getQueryParameters("ride_name_recommendations");
                if (queryParameters == null) {
                    queryParameters = list;
                }
                List<String> queryParameters2 = uri.getQueryParameters(DownloadService.KEY_REQUIREMENTS);
                if (queryParameters2 != null) {
                    list = queryParameters2;
                }
                String queryParameter10 = uri.getQueryParameter("is_editable");
                return new t0m0(uri, queryParameter, queryParameter2, queryParameter3, queryParameter6, queryParameter7, queryParameter8, queryParameter9, queryParameters, list, queryParameter10 != null ? evu0.j0(queryParameter10) : null);
            case 3:
                if (!b(uri) || (queryParameter4 = uri.getQueryParameter("lat")) == null || (i2 = avu0.i(queryParameter4)) == null) {
                    return null;
                }
                double doubleValue = i2.doubleValue();
                String queryParameter11 = uri.getQueryParameter("lon");
                if (queryParameter11 == null || (i3 = avu0.i(queryParameter11)) == null) {
                    return null;
                }
                double doubleValue2 = i3.doubleValue();
                String queryParameter12 = uri.getQueryParameter("full_text");
                if (queryParameter12 == null) {
                    return null;
                }
                List<String> queryParameters3 = uri.getQueryParameters("available_types");
                if (queryParameters3 != null) {
                    list = queryParameters3;
                }
                List<String> list2 = list;
                if (list2.isEmpty()) {
                    return null;
                }
                return new z0m0(doubleValue, doubleValue2, queryParameter12, list2, uri.getQueryParameter("source"), uri.getQueryParameter("key_set"));
            case 4:
                if (b(uri)) {
                    return new xem0();
                }
                return null;
            case 5:
                if (b(uri) && (queryParameter5 = uri.getQueryParameter("url")) != null) {
                    return new zlm0(queryParameter5);
                }
                return null;
            case 6:
                if (b(uri)) {
                    return new inm0(uri.getQueryParameter("continuation"), uri.getQueryParameter("tariffClass"));
                }
                return null;
            case 7:
                return e(uri);
            case 8:
                return f(uri);
            case 9:
                return g(uri);
            case 10:
                return h(uri);
            case 11:
                return i(uri);
            case 12:
                return j(uri);
            case 13:
                return k(uri);
            case 14:
                return l(uri);
            case 15:
                return m(uri);
            case 16:
                return n(uri);
            case 17:
                return o(uri);
            case 18:
                return p(uri);
            case 19:
                return q(uri);
            case 20:
                if (b(uri)) {
                    return new kbq0();
                }
                return null;
            case 21:
                if (b(uri)) {
                    return new l7r0();
                }
                return null;
            case 22:
                if (b(uri)) {
                    return new kmr0(uri);
                }
                return null;
            case 23:
                if (b(uri)) {
                    return new h8t0();
                }
                return null;
            case 24:
                if (b(uri)) {
                    return new mot0();
                }
                return null;
            case 25:
                if (b(uri)) {
                    return new qou0(uri.getQueryParameter("id"));
                }
                return null;
            case 26:
                if (b(uri)) {
                    return new u4v0(uri);
                }
                return null;
            case 27:
                return r(uri);
            case 28:
                if (b(uri)) {
                    return new ksv0(uri.getQueryParameter("search_session_id"));
                }
                return null;
            default:
                if (b(uri)) {
                    return new ltv0(uri.getQueryParameter("context"));
                }
                return null;
        }
    }

    public tzm0 e(Uri uri) {
        List<String> pathSegments;
        if (!b(uri) || (pathSegments = uri.getPathSegments()) == null || pathSegments.size() < 1) {
            return null;
        }
        uzm0 uzm0Var = ScootersAutoselectSection.Companion;
        String str = (String) a.S(0, pathSegments);
        if (str == null) {
            return null;
        }
        uzm0Var.getClass();
        ScootersAutoselectSection a = uzm0.a(str);
        if (a == null) {
            return null;
        }
        return new tzm0(a);
    }

    public a1n0 f(Uri uri) {
        List<String> pathSegments;
        if (!b(uri) || (pathSegments = uri.getPathSegments()) == null || pathSegments.size() < 1) {
            return null;
        }
        b1n0 b1n0Var = ScootersBiometricAuthorizationSection.Companion;
        String str = (String) a.S(0, pathSegments);
        if (str == null) {
            return null;
        }
        b1n0Var.getClass();
        ScootersBiometricAuthorizationSection a = b1n0.a(str);
        if (a == null) {
            return null;
        }
        return new a1n0(a, uri.getQueryParameter("story_id"), uri.getQueryParameter("flow"));
    }

    public yqn0 g(Uri uri) {
        List<String> pathSegments;
        if (!b(uri) || (pathSegments = uri.getPathSegments()) == null || pathSegments.size() < 1) {
            return null;
        }
        lsn0 lsn0Var = ScootersIgnitionSection.Companion;
        String str = (String) a.S(0, pathSegments);
        if (str == null) {
            return null;
        }
        lsn0Var.getClass();
        ScootersIgnitionSection a = lsn0.a(str);
        if (a == null) {
            return null;
        }
        return new yqn0(a);
    }

    public dzn0 h(Uri uri) {
        List<String> pathSegments;
        if (!b(uri) || (pathSegments = uri.getPathSegments()) == null || pathSegments.size() < 1) {
            return null;
        }
        ezn0 ezn0Var = ScootersMosRuAuthorizationSection.Companion;
        String str = (String) a.S(0, pathSegments);
        if (str == null) {
            return null;
        }
        ezn0Var.getClass();
        ScootersMosRuAuthorizationSection a = ezn0.a(str);
        if (a == null) {
            return null;
        }
        return new dzn0(a);
    }

    public c6o0 i(Uri uri) {
        List<String> pathSegments;
        if (b(uri) && (pathSegments = uri.getPathSegments()) != null && pathSegments.size() >= 1) {
            o6o0 o6o0Var = ScootersOrderSection.Companion;
            String str = (String) a.S(0, pathSegments);
            if (str != null) {
                o6o0Var.getClass();
                ScootersOrderSection a = o6o0.a(str);
                if (a != null) {
                    String queryParameter = uri.getQueryParameter("id");
                    String queryParameter2 = uri.getQueryParameter("end_lat");
                    Double i2 = queryParameter2 != null ? avu0.i(queryParameter2) : null;
                    String queryParameter3 = uri.getQueryParameter("end_lon");
                    Double i3 = queryParameter3 != null ? avu0.i(queryParameter3) : null;
                    String queryParameter4 = uri.getQueryParameter(DRMInfoProvider.MediaDRMKeys.VENDOR);
                    List<String> queryParameters = uri.getQueryParameters("scooters_source");
                    if (queryParameters == null) {
                        queryParameters = EmptyList.a;
                    }
                    List<String> list = queryParameters;
                    String queryParameter5 = uri.getQueryParameter("source");
                    String queryParameter6 = uri.getQueryParameter("success_completion_radius_m");
                    return new c6o0(a, queryParameter, i2, i3, queryParameter4, list, queryParameter5, queryParameter6 != null ? bvu0.l(10, queryParameter6) : null, uri.getQueryParameter("multimodal_offer_id"));
                }
            }
        }
        return null;
    }

    public ado0 j(Uri uri) {
        List<String> pathSegments;
        if (!b(uri) || (pathSegments = uri.getPathSegments()) == null || pathSegments.size() < 1) {
            return null;
        }
        hgo0 hgo0Var = ScootersPassesSection.Companion;
        String str = (String) a.S(0, pathSegments);
        if (str == null) {
            return null;
        }
        hgo0Var.getClass();
        ScootersPassesSection a = hgo0.a(str);
        if (a == null) {
            return null;
        }
        return new ado0(a, uri.getQueryParameter("id"), uri.getQueryParameter("open_reason"));
    }

    public pgo0 k(Uri uri) {
        List<String> pathSegments;
        if (!b(uri) || (pathSegments = uri.getPathSegments()) == null || pathSegments.size() < 1) {
            return null;
        }
        qgo0 qgo0Var = ScootersPaymentMethodsSection.Companion;
        String str = (String) a.S(0, pathSegments);
        if (str == null) {
            return null;
        }
        qgo0Var.getClass();
        ScootersPaymentMethodsSection a = qgo0.a(str);
        if (a == null) {
            return null;
        }
        return new pgo0(a);
    }

    public vgo0 l(Uri uri) {
        List<String> pathSegments;
        if (!b(uri) || (pathSegments = uri.getPathSegments()) == null || pathSegments.size() < 1) {
            return null;
        }
        fho0 fho0Var = ScootersPersonalGoalsSection.Companion;
        String str = (String) a.S(0, pathSegments);
        if (str == null) {
            return null;
        }
        fho0Var.getClass();
        ScootersPersonalGoalsSection a = fho0.a(str);
        if (a == null) {
            return null;
        }
        return new vgo0(a);
    }

    public uho0 m(Uri uri) {
        List<String> pathSegments;
        if (!b(uri) || (pathSegments = uri.getPathSegments()) == null || pathSegments.size() < 1) {
            return null;
        }
        vho0 vho0Var = ScootersPhotocheckSection.Companion;
        String str = (String) a.S(0, pathSegments);
        if (str == null) {
            return null;
        }
        vho0Var.getClass();
        ScootersPhotocheckSection a = vho0.a(str);
        if (a == null) {
            return null;
        }
        return new uho0(a, uri.getQueryParameter("exam_type"), uri.getQueryParameter("onboarding_id"));
    }

    public eno0 n(Uri uri) {
        List<String> pathSegments;
        if (!b(uri) || (pathSegments = uri.getPathSegments()) == null || pathSegments.size() < 1) {
            return null;
        }
        hno0 hno0Var = ScootersPromocodesSection.Companion;
        String str = (String) a.S(0, pathSegments);
        if (str == null) {
            return null;
        }
        hno0Var.getClass();
        ScootersPromocodesSection a = hno0.a(str);
        if (a == null) {
            return null;
        }
        return new eno0(a, uri.getQueryParameter(AuthSdkActivity.RESPONSE_TYPE_CODE));
    }

    public yoo0 o(Uri uri) {
        List<String> pathSegments;
        if (b(uri) && (pathSegments = uri.getPathSegments()) != null && pathSegments.size() >= 1) {
            hqo0 hqo0Var = ScootersQrScootersQrSection.Companion;
            String str = (String) a.S(0, pathSegments);
            if (str != null) {
                hqo0Var.getClass();
                ScootersQrScootersQrSection a = hqo0.a(str);
                if (a != null) {
                    String queryParameter = uri.getQueryParameter("end_lat");
                    Double i2 = queryParameter != null ? avu0.i(queryParameter) : null;
                    String queryParameter2 = uri.getQueryParameter("end_lon");
                    Double i3 = queryParameter2 != null ? avu0.i(queryParameter2) : null;
                    List<String> queryParameters = uri.getQueryParameters("scooters_source");
                    if (queryParameters == null) {
                        queryParameters = EmptyList.a;
                    }
                    List<String> list = queryParameters;
                    String queryParameter3 = uri.getQueryParameter("source");
                    String queryParameter4 = uri.getQueryParameter("success_completion_radius_m");
                    return new yoo0(a, i2, i3, list, queryParameter3, queryParameter4 != null ? bvu0.l(10, queryParameter4) : null, uri.getQueryParameter("multimodal_offer_id"));
                }
            }
        }
        return null;
    }

    public wwo0 p(Uri uri) {
        List<String> pathSegments;
        if (!b(uri) || (pathSegments = uri.getPathSegments()) == null || pathSegments.size() < 1) {
            return null;
        }
        xyo0 xyo0Var = ScootersSubscriptionSection.Companion;
        String str = (String) a.S(0, pathSegments);
        if (str == null) {
            return null;
        }
        xyo0Var.getClass();
        ScootersSubscriptionSection a = xyo0.a(str);
        if (a == null) {
            return null;
        }
        return new wwo0(a, uri.getQueryParameter("selected_offer_id"), uri.getQueryParameter("open_reason"), uri.getQueryParameter("offer_tariff_name"));
    }

    public h6p0 q(Uri uri) {
        List<String> pathSegments;
        if (!b(uri) || (pathSegments = uri.getPathSegments()) == null || pathSegments.size() < 1) {
            return null;
        }
        i6p0 i6p0Var = ScootersUpdateUserPdDataSection.Companion;
        String str = (String) a.S(0, pathSegments);
        if (str == null) {
            return null;
        }
        i6p0Var.getClass();
        ScootersUpdateUserPdDataSection a = i6p0.a(str);
        if (a == null) {
            return null;
        }
        return new h6p0(a);
    }

    public afv0 r(Uri uri) {
        List<String> pathSegments;
        if (!b(uri) || (pathSegments = uri.getPathSegments()) == null || pathSegments.size() < 1) {
            return null;
        }
        nov0 nov0Var = SummarySection.Companion;
        String str = (String) a.S(0, pathSegments);
        if (str == null) {
            return null;
        }
        nov0Var.getClass();
        SummarySection a = nov0.a(str);
        if (a == null) {
            return null;
        }
        return new afv0(a, uri.getQueryParameter("origin"));
    }
}
