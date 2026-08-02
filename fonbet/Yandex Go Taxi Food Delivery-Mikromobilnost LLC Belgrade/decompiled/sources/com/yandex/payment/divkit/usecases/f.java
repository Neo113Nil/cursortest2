package com.yandex.payment.divkit.usecases;

import android.content.Context;
import defpackage.abe;
import defpackage.jl40;
import defpackage.m93;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tyh0;
import defpackage.uyj;
import defpackage.vnf;
import kotlin.coroutines.Continuation;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class f {
    public final com.yandex.payment.divkit.repository.a a;
    public final m93 b;
    public final abe c;

    public f(com.yandex.payment.divkit.repository.a aVar, m93 m93Var, abe abeVar) {
        this.a = aVar;
        this.b = m93Var;
        this.c = abeVar;
    }

    public final Object a(vnf vnfVar, Continuation continuation) {
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new FetchCvvConfirmUseCaseImpl$fetchJson$2(this, vnfVar, null), continuation);
    }

    public final JSONObject b(vnf vnfVar) {
        Context context = this.c.a;
        JSONObject a = this.b.a("cvv_screen.json");
        JSONArray jSONArray = a.getJSONObject("card").getJSONArray("variables");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jl40.l(jSONObject.getString("name"), "screen_title")) {
                jSONObject.put("value", context.getString(tyh0.paymentsdk_prebuilt_cvv_screen_title));
            }
            if (jl40.l(jSONObject.getString("name"), "disableButtonText")) {
                jSONObject.put("value", context.getString(tyh0.paymentsdk_divkit_input_cvv_code));
            }
            if (jl40.l(jSONObject.getString("name"), "enableButtonText")) {
                jSONObject.put("value", context.getString(tyh0.paymentsdk_prebuilt_confirm_cvv));
            }
            if (jl40.l(jSONObject.getString("name"), "card_title")) {
                jSONObject.put("value", vnfVar.a + " •• " + vnfVar.b);
            }
        }
        return a;
    }
}
