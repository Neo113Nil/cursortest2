package com.yandex.fintechsdk.flows.payment.kit.internal.model;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.yandex.fintechsdk.flows.payment.kit.api.model.AdditionalSettings;
import com.yandex.fintechsdk.flows.payment.kit.api.model.ConsoleLoggingMode;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Merchant;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Payer;
import com.yandex.fintechsdk.flows.payment.kit.api.model.PaymentKitEnvironment;
import com.yandex.fintechsdk.flows.payment.kit.internal.activity.PaymentKitActivity;
import com.yandex.fintechsdk.flows.payment.kit.internal.model.Scenario;
import defpackage.a351;
import defpackage.bvu0;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.ffx;
import defpackage.h011;
import defpackage.h5g;
import defpackage.i0p;
import defpackage.i5m;
import defpackage.jl40;
import defpackage.k8n;
import defpackage.kyj;
import defpackage.l8n;
import defpackage.m8n;
import defpackage.mcq0;
import defpackage.n8n;
import defpackage.o8n;
import defpackage.p8n;
import defpackage.t111;
import defpackage.tcc;
import defpackage.uza;
import defpackage.x351;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.b;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class a {
    public static final kyj i = new kyj();
    public static final t111 j = new t111();
    public static final i0p k = new i0p();
    public static final a351 l = new a351();
    public static final mcq0 m = new mcq0();
    public static final ConcurrentHashMap n = new ConcurrentHashMap();
    public final AdditionalSettings a;
    public final ConsoleLoggingMode b;
    public final Context c;
    public final PaymentKitEnvironment d;
    public final Merchant e;
    public final Payer f;
    public final String g;
    public final h5g h;

    public a(AdditionalSettings additionalSettings, ConsoleLoggingMode consoleLoggingMode, Context context, PaymentKitEnvironment paymentKitEnvironment, Merchant merchant, Payer payer) {
        this.a = additionalSettings;
        this.b = consoleLoggingMode;
        this.c = context;
        this.d = paymentKitEnvironment;
        this.e = merchant;
        this.f = payer;
        String uuid = UUID.randomUUID().toString();
        this.g = uuid;
        n0 c = ffx.c(0, 0, null, 7);
        h5g h5gVar = new h5g();
        h5gVar.a = i5m.b(h011.a);
        h5gVar.b = i5m.b(x351.a);
        this.h = h5gVar;
        j.a.put(uuid, c);
        kyj kyjVar = i;
        kyjVar.getClass();
        kyjVar.a.put(uuid, ffx.b(1, 1, BufferOverflow.DROP_OLDEST));
        n.put(uuid, h5gVar);
    }

    public final Intent a(Scenario scenario) {
        Intent intent = new Intent(this.c, (Class<?>) PaymentKitActivity.class);
        intent.addFlags(536870912);
        intent.putExtra("PAYMENT_KIT.SCENARIO", scenario);
        intent.putExtra("PAYMENT_KIT.PAYER_DATA", this.f);
        intent.putExtra("PAYMENT_KIT.MERCHANT_DATA", this.e);
        intent.putExtra("PAYMENT_KIT.ENVIRONMENT", (Parcelable) this.d);
        intent.putExtra("PAYMENT_KIT.ADDITIONAL_SETTINGS", this.a);
        intent.putExtra("PAYMENT_KIT.CONSOLE_LOGGING_MODE", (Parcelable) this.b);
        intent.putExtra("PAYMENT_KIT.SESSION_ID", UUID.randomUUID().toString());
        intent.putExtra("PAYMENT_KIT.API_INSTANCE_ID", this.g);
        return intent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x0112, code lost:
    
        if (kotlin.Result.a(r0) == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0199, code lost:
    
        if (kotlin.Result.a(r0) == null) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0239 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x023a  */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r10v2, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.Result$Failure] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Intent b(String str) {
        Object failure;
        String scheme;
        String host;
        o8n o8nVar;
        List<String> W;
        String failure2;
        ?? failure3;
        String failure4;
        n8n l8nVar;
        List W2;
        Set set = p8n.a;
        if (!evu0.J(str)) {
            try {
                failure = Uri.parse(str);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            Uri uri = (Uri) failure;
            if (uri != null && (scheme = uri.getScheme()) != null) {
                if (scheme.length() <= 0) {
                    scheme = null;
                }
                if (scheme != null) {
                    Set set2 = p8n.a;
                    Locale locale = Locale.ROOT;
                    if (set2.contains(scheme.toLowerCase(locale)) && (host = uri.getHost()) != null && host.length() != 0) {
                        String path = uri.getPath();
                        if (path == null) {
                            path = "";
                        }
                        String lowerCase = path.toLowerCase(locale);
                        if (p8n.b.h(lowerCase) && !p8n.c.a(lowerCase)) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            String query = uri.getQuery();
                            if (query != null) {
                                ArrayList arrayList = new ArrayList();
                                W = evu0.W(query, new String[]{"&"}, (r2 & 4) != 0 ? 0 : 2);
                                for (String str2 : W) {
                                    int G = evu0.G(str2, '=', 0, 6);
                                    if (G >= 0) {
                                        arrayList.add(new Pair(str2.substring(0, G), str2.substring(G + 1)));
                                    }
                                }
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    Pair pair = (Pair) it.next();
                                    String str3 = (String) pair.getFirst();
                                    String str4 = (String) pair.getSecond();
                                    if (str4.length() != 0) {
                                        try {
                                            failure2 = URLDecoder.decode(str4, uza.a.name());
                                        } catch (Throwable th2) {
                                            failure2 = new Result.Failure(th2);
                                        }
                                        if (Result.a(failure2) == null) {
                                            str4 = failure2;
                                        }
                                        String str5 = str4;
                                        if (cvu0.x(str5, "{", false)) {
                                            try {
                                                failure3 = p8n.f(new JSONObject(str5));
                                            } catch (Throwable th3) {
                                                failure3 = new Result.Failure(th3);
                                            }
                                        } else {
                                            if (cvu0.x(str5, "[", false)) {
                                                if (!cvu0.s(str5, "]", false) || evu0.y(str5, "\"", false)) {
                                                    try {
                                                        failure3 = p8n.d(new JSONArray(str5));
                                                    } catch (Throwable th4) {
                                                        failure3 = new Result.Failure(th4);
                                                    }
                                                } else {
                                                    W2 = evu0.W(evu0.T(str5, "[", "]"), new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
                                                    List list = W2;
                                                    ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
                                                    Iterator it2 = list.iterator();
                                                    while (it2.hasNext()) {
                                                        arrayList2.add(evu0.k0((String) it2.next()).toString());
                                                    }
                                                    failure3 = new ArrayList();
                                                    Iterator it3 = arrayList2.iterator();
                                                    while (it3.hasNext()) {
                                                        Object next = it3.next();
                                                        if (((String) next).length() > 0) {
                                                            failure3.add(next);
                                                        }
                                                    }
                                                }
                                                str5 = failure3;
                                            }
                                            try {
                                                failure4 = URLDecoder.decode(str3, uza.a.name());
                                            } catch (Throwable th5) {
                                                failure4 = new Result.Failure(th5);
                                            }
                                            if (Result.a(failure4) == null) {
                                                str3 = failure4;
                                            }
                                            String str6 = str3;
                                            ArrayList arrayList3 = new ArrayList();
                                            int i2 = 0;
                                            while (i2 < str6.length()) {
                                                if (str6.charAt(i2) != '.') {
                                                    if (str6.charAt(i2) == '[') {
                                                        int G2 = evu0.G(str6, ']', i2, 4);
                                                        if (G2 >= 0) {
                                                            String substring = str6.substring(i2 + 1, G2);
                                                            if (substring.length() == 0) {
                                                                l8nVar = k8n.a;
                                                            } else {
                                                                Integer l2 = bvu0.l(10, substring);
                                                                l8nVar = new l8n(l2 != null ? l2.intValue() : 0);
                                                            }
                                                            arrayList3.add(l8nVar);
                                                            i2 = G2 + 1;
                                                        }
                                                    } else {
                                                        int i3 = i2;
                                                        while (i3 < str6.length() && str6.charAt(i3) != '.' && str6.charAt(i3) != '[') {
                                                            i3++;
                                                        }
                                                        arrayList3.add(new m8n(str6.substring(i2, i3)));
                                                        i2 = i3;
                                                    }
                                                }
                                                i2++;
                                            }
                                            p8n.i(linkedHashMap, arrayList3, str5);
                                        }
                                    }
                                }
                            }
                            o8nVar = new o8n(path, linkedHashMap);
                            if (o8nVar != null) {
                                return null;
                            }
                            LinkedHashMap linkedHashMap2 = o8nVar.b;
                            return a(new Scenario.DynamicLinkFlow(str, o8nVar.a, p8n.h(b.j("present_type", linkedHashMap2)).toString())).putExtra("PAYMENT_KIT.IS_BOTTOM_SHEET", !jl40.l(linkedHashMap2.get("present_type") != null ? r4.toString() : null, "fullscreen"));
                        }
                    }
                }
            }
        }
        o8nVar = null;
        if (o8nVar != null) {
        }
    }
}
