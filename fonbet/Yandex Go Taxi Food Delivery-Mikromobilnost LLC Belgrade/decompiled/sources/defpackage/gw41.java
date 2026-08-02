package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.a;
import com.ybsdk.core.analytics.generated.delegates.WebviewEvents$TechWebviewUnauthErrorHandleResultResult;
import java.util.LinkedHashMap;
import java.util.List;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes8.dex */
public final class gw41 {
    public final a a;

    public gw41(a aVar) {
        this.a = aVar;
    }

    public static void d(gw41 gw41Var, String str, String str2, Boolean bool, String str3, int i) {
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        LinkedHashMap w = g8e.w(4, DatabaseHelper.OttTrackingTable.COLUMN_EVENT, str);
        if (str2 != null) {
            w.put("url", str2);
        }
        if (bool != null) {
            w.put("is_for_main_frame", bool);
        }
        if (str3 != null) {
            w.put("pending_redirect_url", str3);
        }
        gw41Var.a.a("tech.webview.page_event", w);
    }

    public static void f(gw41 gw41Var, String str, Boolean bool, String str2, int i) {
        String str3 = (i & 2) != 0 ? null : "v2_disabled_or_no_domains";
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        LinkedHashMap w = g8e.w(6, DatabaseHelper.OttTrackingTable.COLUMN_EVENT, str);
        if (str3 != null) {
            w.put(CRLReasonCodeExtension.REASON, str3);
        }
        if (bool != null) {
            w.put("v2_enabled", bool);
        }
        if (str2 != null) {
            w.put("domains", str2);
        }
        gw41Var.a.a("tech.webview.warm_up", w);
    }

    public final void a(String str, List list, List list2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put("url", str);
        linkedHashMap.put("cookies", list);
        linkedHashMap.put("headers", list2);
        this.a.a("tech.webview.cookie_storage", linkedHashMap);
    }

    public final void b(String str) {
        this.a.a("tech.webview.history.cleared", g8e.w(1, "source", str));
    }

    public final void c(String str, String str2, Boolean bool) {
        LinkedHashMap w = g8e.w(3, DatabaseHelper.OttTrackingTable.COLUMN_EVENT, str);
        if (str2 != null) {
            w.put("url", str2);
        }
        if (bool != null) {
            w.put("is_set_session", bool);
        }
        this.a.a("tech.webview.load_url", w);
    }

    public final void e(WebviewEvents$TechWebviewUnauthErrorHandleResultResult webviewEvents$TechWebviewUnauthErrorHandleResultResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, webviewEvents$TechWebviewUnauthErrorHandleResultResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("tech.webview.unauth_error_handle.result", linkedHashMap);
    }
}
