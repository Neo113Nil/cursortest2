package defpackage;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.yandex.go.places.api.navigation.CardRevealing;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import java.util.List;
import kotlin.collections.a;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes8.dex */
public final class dl80 {
    public static dm80 a(Uri uri, boolean z, boolean z2) {
        ti80 i;
        je80 a;
        u370 u370Var = vvb1.H;
        u370 u370Var2 = l76.I;
        String queryParameter = uri.getQueryParameter("action");
        List<String> pathSegments = uri.getPathSegments();
        String queryParameter2 = uri.getQueryParameter(LaunchBrowserActivity.KEY_URI);
        String queryParameter3 = uri.getQueryParameter("oid");
        String queryParameter4 = uri.getQueryParameter("metrica_source");
        svj p = queryParameter4 != null ? r501.p(kuj.b, queryParameter4) : jl40.l(queryParameter, "payments_checkout") ? rvj.b : fuj.b;
        i = bei.i(queryParameter2, queryParameter3, null);
        String queryParameter5 = uri.getQueryParameter("presentation_mode");
        u370 u370Var3 = null;
        if (queryParameter5 != null) {
            if (queryParameter5.equals(Constants.PUSH)) {
                u370Var3 = u370Var2;
            } else if (queryParameter5.equals("modally")) {
                u370Var3 = u370Var;
            } else {
                pkf.f(queryParameter5);
            }
        }
        String queryParameter6 = uri.getQueryParameter("mode");
        if (!jl40.l(queryParameter, "card") || i == null) {
            if (jl40.l(queryParameter, "search")) {
                return new cm80(p, j76.k(queryParameter6), u370Var3 == null ? u370Var2 : u370Var3, null, null, false, false, 120);
            }
            if (jl40.l(queryParameter, "payments_checkout")) {
                lg80 k = j76.k(queryParameter6);
                String queryParameter7 = uri.getQueryParameter("booking_id");
                return new zl80(p, k, queryParameter7 != null ? queryParameter7 : "");
            }
            if (jl40.l(a.R(pathSegments), "list")) {
                String queryParameter8 = uri.getQueryParameter("placeholder");
                return new yl80(FormattedText.Companion.c(queryParameter8 != null ? queryParameter8 : ""), uri.getQueryParameter("suggest_reqid"), p, j76.k(queryParameter6), uri.getQueryParameter("geosearch_context"), uri.getQueryParameter("context"), u370Var3 == null ? u370Var2 : u370Var3, false, 128);
            }
            if (jl40.l(a.R(pathSegments), "flex")) {
                String queryParameter9 = uri.getQueryParameter("screen_id");
                if (queryParameter9 != null) {
                    return new ul80(p, j76.k(queryParameter6), queryParameter9, uri.getQueryParameter("query"));
                }
                lg80 k2 = j76.k(queryParameter6);
                if (u370Var3 != null) {
                    u370Var = u370Var3;
                }
                return new vl80(p, k2, u370Var);
            }
            if (jl40.l(a.R(pathSegments), "publish")) {
                lg80 k3 = j76.k(queryParameter6);
                if (u370Var3 != null) {
                    u370Var = u370Var3;
                }
                return new bm80(p, k3, u370Var);
            }
            lg80 k4 = j76.k(queryParameter6);
            if (u370Var3 != null) {
                u370Var = u370Var3;
            }
            return new vl80(p, k4, u370Var);
        }
        boolean parseBoolean = Boolean.parseBoolean(uri.getQueryParameter("disable_map"));
        boolean parseBoolean2 = Boolean.parseBoolean(uri.getQueryParameter("open_as_modal"));
        boolean parseBoolean3 = Boolean.parseBoolean(uri.getQueryParameter("with_multiple_media_cards"));
        if (parseBoolean) {
            he80 he80Var = new he80();
            he80Var.p();
            he80Var.d(z);
            he80Var.o(parseBoolean3);
            he80Var.h(z2);
            a = he80Var.a();
        } else if (parseBoolean2) {
            he80 he80Var2 = new he80();
            String queryParameter10 = uri.getQueryParameter("modal_anchor_percent");
            if (queryParameter10 != null) {
                he80Var2.c(Float.parseFloat(queryParameter10));
            }
            he80Var2.d(z);
            he80Var2.o(parseBoolean3);
            he80Var2.h(z2);
            a = he80Var2.a();
        } else {
            he80 he80Var3 = new he80();
            he80Var3.e();
            he80Var3.f();
            he80Var3.i();
            he80Var3.k();
            he80Var3.d(z);
            he80Var3.m(CardRevealing.EXPANDED);
            he80Var3.o(parseBoolean3);
            he80Var3.h(z2);
            a = he80Var3.a();
        }
        return new xl80(p, i, j76.k(queryParameter6), null, null, !parseBoolean2, null, null, a, null, null, null, null, 7896);
    }
}
