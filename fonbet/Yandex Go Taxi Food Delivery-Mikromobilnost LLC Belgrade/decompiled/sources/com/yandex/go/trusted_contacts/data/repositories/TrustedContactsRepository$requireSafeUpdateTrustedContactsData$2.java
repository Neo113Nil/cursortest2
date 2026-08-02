package com.yandex.go.trusted_contacts.data.repositories;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.og11;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Log11;", "<anonymous>", "()Log11;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.trusted_contacts.data.repositories.TrustedContactsRepository$requireSafeUpdateTrustedContactsData$2", f = "TrustedContactsRepository.kt", l = {298}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TrustedContactsRepository$requireSafeUpdateTrustedContactsData$2 extends SuspendLambda implements tls {
    final /* synthetic */ og11 $this_requireSafeUpdateTrustedContactsData;
    final /* synthetic */ wls $updater;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrustedContactsRepository$requireSafeUpdateTrustedContactsData$2(wls wlsVar, og11 og11Var, Continuation continuation) {
        super(1, continuation);
        this.$updater = wlsVar;
        this.$this_requireSafeUpdateTrustedContactsData = og11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TrustedContactsRepository$requireSafeUpdateTrustedContactsData$2(this.$updater, this.$this_requireSafeUpdateTrustedContactsData, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((TrustedContactsRepository$requireSafeUpdateTrustedContactsData$2) create((Continuation) obj)).invokeSuspend(zy11.a);
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
        wls wlsVar = this.$updater;
        og11 og11Var = this.$this_requireSafeUpdateTrustedContactsData;
        if (og11Var == null) {
            ny61.g("TrustedContactsInfo cannot be null after deleting");
            return null;
        }
        this.label = 1;
        Object invoke = wlsVar.invoke(og11Var, this);
        return invoke == coroutineSingletons ? coroutineSingletons : invoke;
    }
}
