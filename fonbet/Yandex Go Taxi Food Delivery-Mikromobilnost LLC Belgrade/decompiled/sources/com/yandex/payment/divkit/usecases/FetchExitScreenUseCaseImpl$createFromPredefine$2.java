package com.yandex.payment.divkit.usecases;

import defpackage.abe;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ryh0;
import defpackage.tse;
import defpackage.wls;
import defpackage.wmo;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lorg/json/JSONObject;", "<anonymous>", "(Ltse;)Lorg/json/JSONObject;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.usecases.FetchExitScreenUseCaseImpl$createFromPredefine$2", f = "FetchExitScreenUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class FetchExitScreenUseCaseImpl$createFromPredefine$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isPaymentContext;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchExitScreenUseCaseImpl$createFromPredefine$2(g gVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$isPaymentContext = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FetchExitScreenUseCaseImpl$createFromPredefine$2(this.this$0, this.$isPaymentContext, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FetchExitScreenUseCaseImpl$createFromPredefine$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        JSONObject a = this.this$0.a.a("exit_screen.json");
        g gVar = this.this$0;
        boolean z = this.$isPaymentContext;
        JSONArray jSONArray = a.getJSONObject("card").getJSONArray("states").getJSONObject(0).getJSONObject("div").getJSONArray("items");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            Object obj2 = jSONArray.get(i2);
            if (obj2 instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj2;
                if (i2 == 2) {
                    abe abeVar = gVar.b;
                    wmo wmoVar = gVar.c;
                    if (z) {
                        wmoVar.getClass();
                        i = ryh0.paymentsdk_cancel_payment_title;
                    } else {
                        wmoVar.getClass();
                        i = ryh0.paymentsdk_exit_title;
                    }
                    jSONObject.put("text", abeVar.a.getString(i));
                } else if (i2 == 3) {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("items");
                    int length2 = jSONArray2.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        Object obj3 = jSONArray2.get(i3);
                        if (obj3 instanceof JSONObject) {
                            JSONObject jSONObject2 = (JSONObject) obj3;
                            if (i3 == 0) {
                                abe abeVar2 = gVar.b;
                                gVar.c.getClass();
                                jSONObject2.put("buttonText", abeVar2.a.getString(ryh0.paymentsdk_confirm_exit_accept));
                            } else if (i3 == 1) {
                                abe abeVar3 = gVar.b;
                                gVar.c.getClass();
                                jSONObject2.put("buttonText", abeVar3.a.getString(ryh0.paymentsdk_confirm_exit_decline));
                            }
                        }
                    }
                }
            }
        }
        return a;
    }
}
