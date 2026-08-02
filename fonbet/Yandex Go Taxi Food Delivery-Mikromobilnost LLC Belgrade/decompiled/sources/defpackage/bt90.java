package defpackage;

import android.os.Build;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.plus.core.user.SubscriptionStatus;
import com.yandex.plus.pay.reporter.api.PlusPayEvent$Type;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes.dex */
public final class bt90 {
    public final cot a;
    public final ct90 b;
    public final vit c;

    public bt90(cot cotVar, ct90 ct90Var, vit vitVar) {
        this.a = cotVar;
        this.b = ct90Var;
        this.c = vitVar;
    }

    public static HashMap b(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("version", 1);
        hashMap2.put(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, hashMap3);
        hashMap2.put("interfaces", hashMap);
        return hashMap2;
    }

    public final void a(String str, String str2, String str3, PayEvgenDiagnostic$PlusPayEvgenResponseErrorType payEvgenDiagnostic$PlusPayEvgenResponseErrorType, String str4, String str5, String str6) {
        LinkedHashMap y = g8e.y("requestHost", str, "requestName", str2);
        y.put("requestId", str3);
        y.put("type", payEvgenDiagnostic$PlusPayEvgenResponseErrorType.getEventValue());
        y.put(AuthSdkActivity.RESPONSE_TYPE_CODE, str4);
        y.put(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str5);
        y.put("additionalData", str6);
        y.put("_meta", b(new HashMap()));
        c("Error.Api.RequestFailed", y);
    }

    public final void c(String str, LinkedHashMap linkedHashMap) {
        String str2;
        String str3;
        String str4;
        HashMap hashMap = new HashMap();
        hashMap.putAll(linkedHashMap);
        ct90 ct90Var = this.b;
        ueo ueoVar = ct90Var.e;
        n4u0 n4u0Var = ct90Var.f;
        String a = ct90Var.h.a();
        String str5 = "no_value";
        if (a == null) {
            a = "no_value";
        }
        String str6 = Build.VERSION.RELEASE;
        String language = ((Locale) ct90Var.k.invoke()).getLanguage();
        String language2 = ((Locale) ct90Var.l.invoke()).getLanguage();
        String valueOf = String.valueOf(ct90Var.j.invoke());
        String str7 = ct90Var.a;
        String str8 = ct90Var.b;
        String str9 = ct90Var.c;
        String str10 = (String) ct90Var.d.invoke();
        Long id = ((lj) n4u0Var.getValue()).getId();
        if (id == null || (str2 = id.toString()) == null) {
            str2 = "no_value";
        }
        k2d0 k2d0Var = (k2d0) ueoVar.invoke();
        if (k2d0Var == null || (str3 = k2d0Var.a) == null) {
            str3 = "no_value";
        }
        k2d0 k2d0Var2 = (k2d0) ueoVar.invoke();
        if (k2d0Var2 != null && (str4 = k2d0Var2.b) != null) {
            str5 = str4;
        }
        String name = ct90Var.i.name();
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        SubscriptionStatus subscriptionStatus = (SubscriptionStatus) ct90Var.g.invoke();
        hashMap.putAll(b.i(new Pair("deviceId", a), new Pair("osVersion", str6), new Pair("deviceLanguage", language), new Pair("devicePreferredLanguage", language2), new Pair("deviceRegion", valueOf), new Pair("clientAppPackage", str7), new Pair("clientAppVersion", str8), new Pair(Constants.KEY_SERVICE, str9), new Pair("sdkVersion", "110.0.2"), new Pair("logSessionId", str10), new Pair("puid", str2), new Pair("testIds", str3), new Pair("triggeredTestIds", str5), new Pair("brand", lowerCase), new Pair("userStatus", (n4u0Var.getValue() instanceof jj ? PayEvgenSubscriptionState.NotLoggedIn : subscriptionStatus == SubscriptionStatus.NO_SUBSCRIPTION ? PayEvgenSubscriptionState.NoSubscription : subscriptionStatus == SubscriptionStatus.SUBSCRIPTION_PLUS ? PayEvgenSubscriptionState.Active : PayEvgenSubscriptionState.Unknown).name().toLowerCase(locale)), new Pair("buildOrigin", ((Boolean) ct90Var.m.invoke()).booleanValue() ? "store" : "testService")));
        hashMap.putAll(((gko) this.c.b).a);
        ((ped0) ((hzk) this.a.b).b).b(new tbd0(PlusPayEvent$Type.DIAGNOSTIC, str, hashMap, (Throwable) null));
    }
}
