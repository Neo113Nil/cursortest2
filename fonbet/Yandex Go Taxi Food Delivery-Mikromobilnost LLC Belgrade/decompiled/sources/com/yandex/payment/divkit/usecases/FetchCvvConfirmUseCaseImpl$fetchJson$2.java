package com.yandex.payment.divkit.usecases;

import android.content.Context;
import com.yandex.xplat.payment.sdk.DivCardForAnalytics;
import defpackage.abe;
import defpackage.iho;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv90;
import defpackage.sv90;
import defpackage.tse;
import defpackage.tyh0;
import defpackage.vnf;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lorg/json/JSONObject;", "<anonymous>", "(Ltse;)Lorg/json/JSONObject;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.usecases.FetchCvvConfirmUseCaseImpl$fetchJson$2", f = "FetchCvvConfirmUseCase.kt", l = {53, 56}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class FetchCvvConfirmUseCaseImpl$fetchJson$2 extends SuspendLambda implements wls {
    final /* synthetic */ vnf $cardInfo;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchCvvConfirmUseCaseImpl$fetchJson$2(f fVar, vnf vnfVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$cardInfo = vnfVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FetchCvvConfirmUseCaseImpl$fetchJson$2(this.this$0, this.$cardInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FetchCvvConfirmUseCaseImpl$fetchJson$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cd, code lost:
    
        if (r13 != r0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        iho ihoVar = this.label;
        try {
        } catch (Throwable th) {
            iho.b(ihoVar, th.getMessage(), 2).c();
            f fVar = this.this$0;
            vnf vnfVar = this.$cardInfo;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            obj = fVar.b(vnfVar);
        }
        if (ihoVar == 0) {
            kotlin.b.b(obj);
            sv90 sv90Var = qv90.a;
            DivCardForAnalytics divCardForAnalytics = DivCardForAnalytics.CVV;
            sv90Var.getClass();
            iho f0 = sv90.f0(divCardForAnalytics);
            f0.c();
            JSONObject put = new JSONObject().put("template", "CvvConfirmFragment").put("lang", Locale.getDefault().getLanguage());
            JSONObject jSONObject = new JSONObject();
            f fVar2 = this.this$0;
            vnf vnfVar2 = this.$cardInfo;
            abe abeVar = fVar2.c;
            Context context = abeVar.a;
            jSONObject.put("enableButtonText", abeVar.a.getString(tyh0.paymentsdk_prebuilt_confirm_cvv));
            jSONObject.put("disableButtonText", context.getString(tyh0.paymentsdk_divkit_input_cvv_code));
            jSONObject.put("headerText", context.getString(tyh0.paymentsdk_prebuilt_cvv_screen_title));
            jSONObject.put("cardSystem", vnfVar2.a);
            jSONObject.put("cardSuffix", vnfVar2.b);
            JSONObject put2 = put.put(Constants.KEY_DATA, jSONObject);
            com.yandex.payment.divkit.repository.a aVar = this.this$0.a;
            this.L$0 = f0;
            this.L$1 = null;
            this.label = 1;
            obj = aVar.a(put2, this);
            ihoVar = f0;
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (ihoVar != 1) {
                if (ihoVar != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return (JSONObject) obj;
            }
            iho ihoVar2 = (iho) this.L$0;
            kotlin.b.b(obj);
            ihoVar = ihoVar2;
        }
        return (JSONObject) obj;
    }
}
