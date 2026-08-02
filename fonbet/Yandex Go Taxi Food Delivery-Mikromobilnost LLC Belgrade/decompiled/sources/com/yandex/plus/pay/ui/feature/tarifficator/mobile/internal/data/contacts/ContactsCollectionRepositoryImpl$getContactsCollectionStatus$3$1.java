package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts;

import com.yandex.plus.pay.internal.model.PlusPayWebCollectContactsParams;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/plus/pay/internal/model/PlusPayWebCollectContactsResult;", "<anonymous>", "(Ltse;)Lcom/yandex/plus/pay/internal/model/PlusPayWebCollectContactsResult;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.data.contacts.ContactsCollectionRepositoryImpl$getContactsCollectionStatus$3$1", f = "ContactsCollectionRepositoryImpl.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ContactsCollectionRepositoryImpl$getContactsCollectionStatus$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ PlusPayWebCollectContactsParams $params;
    final /* synthetic */ a $this_runSuspendCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsCollectionRepositoryImpl$getContactsCollectionStatus$3$1(a aVar, PlusPayWebCollectContactsParams plusPayWebCollectContactsParams, Continuation continuation) {
        super(2, continuation);
        this.$this_runSuspendCatching = aVar;
        this.$params = plusPayWebCollectContactsParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ContactsCollectionRepositoryImpl$getContactsCollectionStatus$3$1(this.$this_runSuspendCatching, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ContactsCollectionRepositoryImpl$getContactsCollectionStatus$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        com.yandex.plus.pay.internal.feature.contacts.b bVar = (com.yandex.plus.pay.internal.feature.contacts.b) ((com.yandex.plus.pay.internal.b) this.$this_runSuspendCatching.a).k.getValue();
        PlusPayWebCollectContactsParams plusPayWebCollectContactsParams = this.$params;
        this.label = 1;
        Object a = bVar.a(plusPayWebCollectContactsParams, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
