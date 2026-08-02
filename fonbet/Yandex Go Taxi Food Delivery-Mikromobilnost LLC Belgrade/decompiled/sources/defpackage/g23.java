package defpackage;

import android.net.Uri;
import com.yandex.div.state.db.StateEntry;
import com.yandex.fintechsdk.flows.applink.payment.internal.activity.paymentform.deeplink.ApplinkPaymentDeeplinkAction;
import java.util.LinkedHashMap;

/* loaded from: classes15.dex */
public final class g23 {
    public static h0w a(String str) {
        Uri parse = Uri.parse(str);
        if (!jl40.l(parse.getScheme(), "yandexpay")) {
            return null;
        }
        String host = parse.getHost();
        String path = parse.getPath();
        for (ApplinkPaymentDeeplinkAction applinkPaymentDeeplinkAction : ApplinkPaymentDeeplinkAction.a()) {
            if (jl40.l(applinkPaymentDeeplinkAction.getStringValue(), host)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (path != null) {
                    linkedHashMap.put(StateEntry.COLUMN_PATH, path);
                }
                for (String str2 : parse.getQueryParameterNames()) {
                    String queryParameter = parse.getQueryParameter(str2);
                    if (queryParameter != null) {
                        linkedHashMap.put(str2, queryParameter);
                    }
                }
                return new h0w(13, applinkPaymentDeeplinkAction, linkedHashMap);
            }
        }
        return null;
    }
}
