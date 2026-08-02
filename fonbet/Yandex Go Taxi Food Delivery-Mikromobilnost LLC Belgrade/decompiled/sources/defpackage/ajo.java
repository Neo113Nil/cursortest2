package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class ajo {
    public final String a;
    public final fu90 b;

    public ajo(String str, fu90 fu90Var) {
        this.a = str;
        this.b = fu90Var;
    }

    public final void a(long j, String str, String str2) {
        fu90 fu90Var = this.b;
        fu90Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_url", str);
        linkedHashMap.put("webViewName", this.a);
        linkedHashMap.put("additionalData", "no_value");
        linkedHashMap.put("timeOutMillis", String.valueOf(j));
        linkedHashMap.put(Constants.KEY_MESSAGE, str2);
        linkedHashMap.put("_meta", fu90.c(new HashMap()));
        fu90Var.d("Error.WebView.Messaging.Timeout", linkedHashMap);
    }

    public final void b(String str, String str2) {
        PayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType payUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType = PayUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType.Unhandled;
        fu90 fu90Var = this.b;
        fu90Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_url", str);
        linkedHashMap.put("webViewName", this.a);
        linkedHashMap.put("additionalData", "no_value");
        linkedHashMap.put("type", payUIEvgenDiagnostic$PlusPayEvgenWebViewMessageErrorType.getEventValue());
        linkedHashMap.put(Constants.KEY_MESSAGE, str2);
        linkedHashMap.put("_meta", fu90.c(new HashMap()));
        fu90Var.d("Error.WebView.Messaging.Failed", linkedHashMap);
    }
}
