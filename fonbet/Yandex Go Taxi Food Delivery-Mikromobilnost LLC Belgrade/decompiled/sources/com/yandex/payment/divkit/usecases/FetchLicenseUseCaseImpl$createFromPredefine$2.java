package com.yandex.payment.divkit.usecases;

import defpackage.abe;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ryh0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lorg/json/JSONObject;", "<anonymous>", "(Ltse;)Lorg/json/JSONObject;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.usecases.FetchLicenseUseCaseImpl$createFromPredefine$2", f = "FetchLicenseUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class FetchLicenseUseCaseImpl$createFromPredefine$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchLicenseUseCaseImpl$createFromPredefine$2(h hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FetchLicenseUseCaseImpl$createFromPredefine$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FetchLicenseUseCaseImpl$createFromPredefine$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        JSONObject a = this.this$0.a.a("license.json");
        h hVar = this.this$0;
        JSONArray jSONArray = a.getJSONObject("card").getJSONArray("states").getJSONObject(0).getJSONObject("div").getJSONArray("items");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj2 = jSONArray.get(i);
            if (obj2 instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj2;
                if (i == 0) {
                    abe abeVar = hVar.b;
                    hVar.d.getClass();
                    jSONObject.put("text", abeVar.a.getString(ryh0.paymentsdk_sbp_agreement_title));
                } else if (i == 1) {
                    abe abeVar2 = hVar.b;
                    hVar.d.getClass();
                    jSONObject.put("body", abeVar2.a.getString(ryh0.paymentsdk_sbp_agreement_first_point));
                } else if (i == 2) {
                    abe abeVar3 = hVar.b;
                    hVar.d.getClass();
                    jSONObject.put("body", abeVar3.a.getString(ryh0.paymentsdk_sbp_agreement_second_point));
                } else if (i == 3) {
                    abe abeVar4 = hVar.b;
                    hVar.d.getClass();
                    jSONObject.put("title", abeVar4.a.getString(ryh0.paymentsdk_close));
                }
            }
        }
        return a;
    }
}
