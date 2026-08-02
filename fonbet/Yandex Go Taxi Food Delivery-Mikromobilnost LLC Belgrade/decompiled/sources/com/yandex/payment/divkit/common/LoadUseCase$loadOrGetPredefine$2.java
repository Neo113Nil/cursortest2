package com.yandex.payment.divkit.common;

import defpackage.a5j0;
import defpackage.iho;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rwo;
import defpackage.tls;
import defpackage.tmk;
import defpackage.tse;
import defpackage.wls;
import defpackage.y22;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ltmk;", "<anonymous>", "(Ltse;)Ltmk;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.common.LoadUseCase$loadOrGetPredefine$2", f = "LoadUseCase.kt", l = {31, 40}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class LoadUseCase$loadOrGetPredefine$2 extends SuspendLambda implements wls {
    final /* synthetic */ iho $event;
    final /* synthetic */ tls $predefineFun;
    final /* synthetic */ a5j0 $request;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadUseCase$loadOrGetPredefine$2(a aVar, a5j0 a5j0Var, iho ihoVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$request = a5j0Var;
        this.$event = ihoVar;
        this.$predefineFun = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LoadUseCase$loadOrGetPredefine$2(this.this$0, this.$request, this.$event, this.$predefineFun, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LoadUseCase$loadOrGetPredefine$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        if (r7 != r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Exception e) {
            rwo rwoVar = this.this$0.b;
            iho ihoVar = this.$event;
            String message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            ((y22) rwoVar).a(iho.b(ihoVar, message, 2));
            tls tlsVar = this.$predefineFun;
            this.L$0 = null;
            this.label = 2;
            obj = tlsVar.invoke(this);
        }
        if (i == 0) {
            b.b(obj);
            com.yandex.payment.divkit.repository.a aVar = this.this$0.a;
            JSONObject a = this.$request.a();
            this.label = 1;
            obj = aVar.a(a, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return (tmk) obj;
            }
            b.b(obj);
        }
        a aVar2 = this.this$0;
        iho ihoVar2 = this.$event;
        JSONObject jSONObject = (JSONObject) obj;
        ((y22) aVar2.b).a(ihoVar2.d(null));
        return new tmk(jSONObject.getJSONObject("templates"), jSONObject.getJSONObject("card"));
    }
}
