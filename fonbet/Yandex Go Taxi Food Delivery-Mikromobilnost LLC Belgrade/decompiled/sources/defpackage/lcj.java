package defpackage;

import android.net.Uri;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.plus.core.network.api.exceptions.OfflineModeEnabledException;
import defpackage.e6d0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.net.ssl.SSLException;

/* loaded from: classes8.dex */
public final class lcj implements m6d0 {
    public final uho a;
    public final o1k0 b;

    public lcj(uho uhoVar, o1k0 o1k0Var) {
        this.a = uhoVar;
        this.b = o1k0Var;
    }

    @Override // defpackage.m6d0
    public final void a(e6d0 e6d0Var) {
        EvgenDiagnostic$NetworkErrorType evgenDiagnostic$NetworkErrorType;
        EvgenDiagnostic$NetworkErrorType evgenDiagnostic$NetworkErrorType2;
        String str;
        n1k0 a;
        if (e6d0Var instanceof e6d0.a) {
            e6d0.a aVar = (e6d0.a) e6d0Var;
            Uri parse = Uri.parse(aVar.getB().b);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (aVar instanceof e6d0.a.AbstractC0093a) {
                e6d0.a.AbstractC0093a abstractC0093a = (e6d0.a.AbstractC0093a) e6d0Var;
                if (abstractC0093a instanceof e6d0.a.AbstractC0093a.b) {
                    evgenDiagnostic$NetworkErrorType = EvgenDiagnostic$NetworkErrorType.Http;
                } else {
                    if (!(abstractC0093a instanceof e6d0.a.AbstractC0093a.C0094a)) {
                        w511.b();
                        return;
                    }
                    evgenDiagnostic$NetworkErrorType = EvgenDiagnostic$NetworkErrorType.Backend;
                }
                linkedHashMap.put(AuthSdkActivity.RESPONSE_TYPE_CODE, String.valueOf(abstractC0093a.getB()));
                linkedHashMap.put(Constants.KEY_MESSAGE, abstractC0093a.getC());
                String d = abstractC0093a.getD();
                if (d == null) {
                    d = "";
                }
                linkedHashMap.put("error_body", d);
            } else if (aVar instanceof e6d0.a.d) {
                evgenDiagnostic$NetworkErrorType = EvgenDiagnostic$NetworkErrorType.Parsing;
                String message = ((e6d0.a.d) e6d0Var).getB().getMessage();
                if (message == null) {
                    message = "";
                }
                linkedHashMap.put(Constants.KEY_MESSAGE, message);
            } else if (aVar instanceof e6d0.a.b) {
                e6d0.a.b bVar = (e6d0.a.b) e6d0Var;
                IOException b = bVar.getB();
                if (b instanceof OfflineModeEnabledException) {
                    return;
                }
                evgenDiagnostic$NetworkErrorType = b instanceof SSLException ? EvgenDiagnostic$NetworkErrorType.Ssl : EvgenDiagnostic$NetworkErrorType.Connection;
                String message2 = bVar.getB().getMessage();
                if (message2 == null) {
                    message2 = "";
                }
                linkedHashMap.put(Constants.KEY_MESSAGE, message2);
            } else {
                if (!(aVar instanceof e6d0.a.c)) {
                    w511.b();
                    return;
                }
                evgenDiagnostic$NetworkErrorType = EvgenDiagnostic$NetworkErrorType.Unknown;
                String message3 = ((e6d0.a.c) e6d0Var).getB().getMessage();
                if (message3 == null) {
                    message3 = "";
                }
                linkedHashMap.put(Constants.KEY_MESSAGE, message3);
            }
            String str2 = (String) aVar.getB().c.get("X-Request-Id");
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("request_id", str2);
            String host = parse.getHost();
            if (host == null) {
                host = "";
            }
            String path = parse.getPath();
            String str3 = path != null ? path : "";
            String str4 = aVar.getB().a;
            uho uhoVar = this.a;
            uhoVar.getClass();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("base_url", host);
            linkedHashMap2.put("endpoint", str3);
            linkedHashMap2.put("method", str4);
            linkedHashMap2.put("error_type", evgenDiagnostic$NetworkErrorType.getEventValue());
            linkedHashMap2.put("additional_params", linkedHashMap);
            linkedHashMap2.put("_meta", uho.b(new HashMap()));
            uhoVar.c("Error.Network.Rest", linkedHashMap2);
            Map map = aVar.getB().c;
            String str5 = aVar.getB().a;
            o1k0 o1k0Var = this.b;
            o1k0Var.getClass();
            String str6 = (String) map.get("X-Plus-Retry-Context");
            Object obj = null;
            n1k0 a2 = str6 != null ? o1k0Var.a(str6) : null;
            if (a2 == null) {
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        evgenDiagnostic$NetworkErrorType2 = evgenDiagnostic$NetworkErrorType;
                        break;
                    }
                    Object next = it.next();
                    evgenDiagnostic$NetworkErrorType2 = evgenDiagnostic$NetworkErrorType;
                    Iterator it2 = it;
                    if (cvu0.t((String) ((Map.Entry) next).getKey(), "X-Plus-Retry-Context", true)) {
                        obj = next;
                        break;
                    } else {
                        it = it2;
                        evgenDiagnostic$NetworkErrorType = evgenDiagnostic$NetworkErrorType2;
                    }
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry == null || (str = (String) entry.getValue()) == null || (a = o1k0Var.a(str)) == null || a.a != a.b) {
                    return;
                }
            } else if (a2.a != a2.b) {
                return;
            } else {
                evgenDiagnostic$NetworkErrorType2 = evgenDiagnostic$NetworkErrorType;
            }
            LinkedHashMap y = g8e.y("base_url", host, "endpoint", str3);
            y.put("method", str5);
            y.put("error_type", evgenDiagnostic$NetworkErrorType2.getEventValue());
            y.put("additional_params", linkedHashMap);
            y.put("_meta", uho.b(new HashMap()));
            uhoVar.c("Error.Retries.Exhausted.Rest", y);
        }
    }
}
