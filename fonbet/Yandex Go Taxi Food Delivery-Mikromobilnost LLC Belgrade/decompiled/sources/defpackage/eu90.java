package defpackage;

import com.yandex.plus.core.user.SubscriptionStatus;
import com.yandex.plus.experiments.impl.providers.a;
import com.yandex.plus.pay.reporter.api.PlusPayEvent$Type;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.b;
import ru.yandex.common.startup.StartupRequest;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes12.dex */
public final class eu90 {
    public final mum a;
    public final jln b;
    public final mum c;

    public eu90(mum mumVar, jln jlnVar, mum mumVar2) {
        this.a = mumVar;
        this.b = jlnVar;
        this.c = mumVar2;
    }

    public static HashMap c(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("version", 1);
        hashMap2.put(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, hashMap3);
        hashMap2.put("interfaces", hashMap);
        return hashMap2;
    }

    public final void a(String str, String str2, String str3, PayUIEvgenAnalytics$CollectingContactsCloseSource payUIEvgenAnalytics$CollectingContactsCloseSource) {
        LinkedHashMap y = g8e.y("purchase_session_id", str, "url", str2);
        y.put("skipButtonText", str3);
        y.put("source", payUIEvgenAnalytics$CollectingContactsCloseSource.getEventValue());
        y.put("_meta", c(new HashMap()));
        f("CollectingContacts.Close.Clicked", y);
    }

    public final void b(String str, String str2, String str3, PayUIEvgenAnalytics$FamilyInviteCloseSource payUIEvgenAnalytics$FamilyInviteCloseSource) {
        LinkedHashMap y = g8e.y("purchase_session_id", str, "url", str2);
        y.put("skipButtonText", str3);
        y.put("source", payUIEvgenAnalytics$FamilyInviteCloseSource.getEventValue());
        y.put("_meta", c(new HashMap()));
        f("FamilyInvite.Close.Clicked", y);
    }

    public final void d(String str, String str2, ArrayList arrayList, boolean z, List list) {
        LinkedHashMap y = g8e.y("purchase_session_id", str, "product_id", str2);
        xvz.A(y, "options_id", arrayList, true, "is_tarifficator");
        y.put("card_linked", String.valueOf(z));
        y.put("payment_method_ids", list);
        y.put("_meta", c(new HashMap()));
        f("PaymentMethods.Shown", y);
    }

    public final void e(String str, String str2, ArrayList arrayList, PayUIEvgenAnalytics$PaymentOption payUIEvgenAnalytics$PaymentOption, String str3, String str4, String str5, String str6, PayUIEvgenAnalytics$SourceType payUIEvgenAnalytics$SourceType, boolean z) {
        LinkedHashMap y = g8e.y("purchase_session_id", str, "product_id", str2);
        xvz.A(y, "options_id", arrayList, true, "is_tarifficator");
        xvz.x(payUIEvgenAnalytics$PaymentOption, y, "payment_option", "payment_method_id", str3);
        y.put("fail_reason", str4);
        y.put(Constants.KEY_PAGE, str5);
        y.put("place", str6);
        y.put("source_type", payUIEvgenAnalytics$SourceType.getEventValue());
        y.put("silent", String.valueOf(z));
        y.put("_meta", c(new HashMap()));
        f("PaymentProcess.Failed", y);
    }

    public final void f(String str, LinkedHashMap linkedHashMap) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(linkedHashMap);
        oho ohoVar = (oho) this.b.b;
        a aVar = ohoVar.g;
        n4u0 n4u0Var = ohoVar.e;
        Object h = aVar.h();
        if (h instanceof Result.Failure) {
            h = null;
        }
        k2d0 k2d0Var = (k2d0) h;
        String str2 = ohoVar.c;
        String str3 = ohoVar.d;
        String str4 = ohoVar.a;
        SubscriptionStatus subscriptionStatus = (SubscriptionStatus) ohoVar.f.invoke();
        PayUIEvgenSubscriptionState payUIEvgenSubscriptionState = n4u0Var.getValue() instanceof jj ? PayUIEvgenSubscriptionState.NotLoggedIn : subscriptionStatus == SubscriptionStatus.NO_SUBSCRIPTION ? PayUIEvgenSubscriptionState.NoSubscription : subscriptionStatus == SubscriptionStatus.SUBSCRIPTION_PLUS ? PayUIEvgenSubscriptionState.Active : PayUIEvgenSubscriptionState.Unknown;
        String str5 = k2d0Var != null ? k2d0Var.a : null;
        if (str5 == null) {
            str5 = "no_value";
        }
        String str6 = k2d0Var != null ? k2d0Var.b : null;
        if (str6 == null) {
            str6 = "no_value";
        }
        Long id = ((lj) n4u0Var.getValue()).getId();
        String l = id != null ? id.toString() : null;
        hashMap.putAll(b.i(new Pair(CommonUrlParts.APP_ID, str2), new Pair(StartupRequest.PARAM_APP_VERSION, str3), new Pair(Constants.KEY_SERVICE, str4), new Pair("sdk_version", "110.0.2"), new Pair("subscription_state", payUIEvgenSubscriptionState.getEventValue()), new Pair("testids", str5), new Pair("triggered_testids", str6), new Pair("puid", l != null ? l : "no_value"), new Pair("log_session_id", ((ndd0) ohoVar.j).a.toString()), new Pair("language", q5z.v(ohoVar.h).toLowerCase(Locale.ROOT))));
        hashMap.putAll(((hio) this.c.a).a);
        ((oho) this.a.a).i.b(new tbd0(PlusPayEvent$Type.CLIENT, str, hashMap, (Throwable) null));
    }
}
