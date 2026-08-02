package defpackage;

import android.os.Build;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.plus.core.user.SubscriptionStatus;
import com.yandex.plus.experiments.impl.providers.a;
import com.yandex.plus.pay.reporter.api.PlusPayEvent$Type;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.b;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes2.dex */
public final class fu90 {
    public final gym a;
    public final jln b;
    public final mum c;

    public fu90(gym gymVar, jln jlnVar, mum mumVar) {
        this.a = gymVar;
        this.b = jlnVar;
        this.c = mumVar;
    }

    public static void a(fu90 fu90Var, String str, String str2, String str3, PayUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType payUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType, String str4) {
        fu90Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_url", str);
        linkedHashMap.put("webViewName", str2);
        linkedHashMap.put("additionalData", "no_value");
        linkedHashMap.put("resource_url", str3);
        linkedHashMap.put("type", payUIEvgenDiagnostic$PlusPayEvgenWebViewErrorType.getEventValue());
        linkedHashMap.put(AuthSdkActivity.RESPONSE_TYPE_CODE, str4);
        linkedHashMap.put("_meta", c(new HashMap()));
        fu90Var.d("Error.WebView.Loading.Failed", linkedHashMap);
    }

    public static void b(fu90 fu90Var, String str, String str2) {
        fu90Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_url", str);
        linkedHashMap.put("webViewName", str2);
        linkedHashMap.put("additionalData", "no_value");
        linkedHashMap.put("navigation_type", "initial_page");
        linkedHashMap.put("_meta", c(new HashMap()));
        fu90Var.d("Error.WebView.Loading.Whitelist", linkedHashMap);
    }

    public static HashMap c(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("version", 1);
        hashMap2.put(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, hashMap3);
        hashMap2.put("interfaces", hashMap);
        return hashMap2;
    }

    public final void d(String str, LinkedHashMap linkedHashMap) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(linkedHashMap);
        yho yhoVar = (yho) this.b.b;
        x75 x75Var = yhoVar.k;
        a aVar = yhoVar.h;
        n4u0 n4u0Var = yhoVar.f;
        p5z p5zVar = yhoVar.i;
        String a = x75Var.a();
        if (a == null) {
            a = "no_value";
        }
        String str2 = Build.VERSION.RELEASE;
        String v = q5z.v(p5zVar);
        String v2 = q5z.v(p5zVar);
        String valueOf = String.valueOf(yhoVar.j.a());
        String str3 = yhoVar.d;
        String str4 = yhoVar.e;
        String str5 = yhoVar.a;
        String uuid = ((ndd0) yhoVar.n).a.toString();
        Long id = ((lj) n4u0Var.getValue()).getId();
        String l = id != null ? id.toString() : null;
        if (l == null) {
            l = "no_value";
        }
        Object h = aVar.h();
        if (h instanceof Result.Failure) {
            h = null;
        }
        k2d0 k2d0Var = (k2d0) h;
        String str6 = k2d0Var != null ? k2d0Var.a : null;
        if (str6 == null) {
            str6 = "no_value";
        }
        Object h2 = aVar.h();
        if (h2 instanceof Result.Failure) {
            h2 = null;
        }
        k2d0 k2d0Var2 = (k2d0) h2;
        String str7 = k2d0Var2 != null ? k2d0Var2.b : null;
        String str8 = str7 == null ? "no_value" : str7;
        String name = yhoVar.c.name();
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        SubscriptionStatus subscriptionStatus = (SubscriptionStatus) yhoVar.g.invoke();
        hashMap.putAll(b.i(new Pair("deviceId", a), new Pair("osVersion", str2), new Pair("deviceLanguage", v), new Pair("devicePreferredLanguage", v2), new Pair("deviceRegion", valueOf), new Pair("clientAppPackage", str3), new Pair("clientAppVersion", str4), new Pair(Constants.KEY_SERVICE, str5), new Pair("sdkVersion", "110.0.2"), new Pair("logSessionId", uuid), new Pair("puid", l), new Pair("testIds", str6), new Pair("triggeredTestIds", str8), new Pair("brand", lowerCase), new Pair("userStatus", (n4u0Var.getValue() instanceof jj ? PayUIEvgenSubscriptionState.NotLoggedIn : subscriptionStatus == SubscriptionStatus.NO_SUBSCRIPTION ? PayUIEvgenSubscriptionState.NoSubscription : subscriptionStatus == SubscriptionStatus.SUBSCRIPTION_PLUS ? PayUIEvgenSubscriptionState.Active : PayUIEvgenSubscriptionState.Unknown).name().toLowerCase(locale)), new Pair("buildOrigin", ((Boolean) yhoVar.l.invoke()).booleanValue() ? "store" : "testService")));
        hashMap.putAll(((uxd) this.c.a).a);
        ((yho) this.a.a).m.b(new tbd0(PlusPayEvent$Type.DIAGNOSTIC, str, hashMap, (Throwable) null));
    }
}
