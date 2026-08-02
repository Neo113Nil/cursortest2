package defpackage;

import com.yandex.go.payments.shared.business.accountcreation.corp.factory.InputFieldType;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final class ej6 {
    public final o61 a;
    public final o61 b;
    public final b1 c;
    public final pj d;

    public ej6(o61 o61Var, o61 o61Var2, b1 b1Var, pj pjVar) {
        this.a = o61Var;
        this.b = o61Var2;
        this.c = b1Var;
        this.d = pjVar;
    }

    public final void a(SharedPaymentsOpenReason sharedPaymentsOpenReason, String str, int i, String str2) {
        String analyticsName = sharedPaymentsOpenReason.getAnalyticsName();
        Integer valueOf = Integer.valueOf(i);
        o61 o61Var = this.b;
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        if (analyticsName != null) {
            hashMap.put("open_reason", analyticsName);
        }
        if (str != null) {
            hashMap.put("app_language", str);
        }
        hashMap.put("number_cities_loaded", valueOf);
        if (str2 != null) {
            hashMap.put("query", str2);
        }
        o61Var.a.a("CitySuggestScreen.CityLoaded", hashMap, 1, new HashMap());
    }

    public final void b(SharedPaymentsOpenReason sharedPaymentsOpenReason, InputFieldType inputFieldType) {
        String analyticsName = sharedPaymentsOpenReason.getAnalyticsName();
        String analyticsName2 = inputFieldType.getAnalyticsName();
        o61 o61Var = this.a;
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        if (analyticsName != null) {
            hashMap.put("open_reason", analyticsName);
        }
        if (analyticsName2 != null) {
            hashMap.put("field", analyticsName2);
        }
        o61Var.a.a("CreateCorpScreen.FieldTextFocused", hashMap, 1, new HashMap());
    }

    public final void c(SharedPaymentsOpenReason sharedPaymentsOpenReason, int i) {
        String analyticsName = sharedPaymentsOpenReason.getAnalyticsName();
        Integer valueOf = Integer.valueOf(i);
        o61 o61Var = this.a;
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        if (analyticsName != null) {
            hashMap.put("open_reason", analyticsName);
        }
        hashMap.put("error_code", valueOf);
        o61Var.a.a("CreateCorpScreen.SubmitErrorShown", hashMap, 1, new HashMap());
    }
}
