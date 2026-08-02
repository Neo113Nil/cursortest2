package com.yandex.payment.sdk.flex.actions.ftrequestaction;

import defpackage.agr;
import defpackage.k6p;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lkvj0;", "<anonymous>", "(Ltse;)Lkvj0;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.sdk.flex.actions.ftrequestaction.FTRequestActionHandler$handle$1$response$1", f = "FTRequestActionHandler.kt", l = {HProv.PP_REBOOT}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class FTRequestActionHandler$handle$1$response$1 extends SuspendLambda implements wls {
    final /* synthetic */ agr $action;
    final /* synthetic */ k6p $endpoint;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FTRequestActionHandler$handle$1$response$1(a aVar, k6p k6pVar, agr agrVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$endpoint = k6pVar;
        this.$action = agrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FTRequestActionHandler$handle$1$response$1(this.this$0, this.$endpoint, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FTRequestActionHandler$handle$1$response$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        com.yandex.payment.sdk.network.a aVar = this.this$0.a;
        k6p k6pVar = this.$endpoint;
        agr agrVar = this.$action;
        String str = agrVar.b;
        if (str == null) {
            str = "";
        }
        Double d = new Double(agrVar.d);
        this.label = 1;
        Object a = aVar.a(k6pVar, str, d, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
