package com.yandex.messaging.domain.contacts;

import defpackage.cl21;
import defpackage.d9g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcl21;", "", "<anonymous>", "(Lcl21;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.contacts.ClearPhoneContactsUseCase$execute$2", f = "ClearPhoneContactsUseCase.kt", l = {13}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ClearPhoneContactsUseCase$execute$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ClearPhoneContactsUseCase$execute$2 clearPhoneContactsUseCase$execute$2 = new ClearPhoneContactsUseCase$execute$2(2, continuation);
        clearPhoneContactsUseCase$execute$2.L$0 = obj;
        return clearPhoneContactsUseCase$execute$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ClearPhoneContactsUseCase$execute$2) create((cl21) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.messaging.contacts.sync.a aVar = (com.yandex.messaging.contacts.sync.a) ((d9g) ((cl21) this.L$0)).J0.get();
        this.label = 1;
        Object a = aVar.a(this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
