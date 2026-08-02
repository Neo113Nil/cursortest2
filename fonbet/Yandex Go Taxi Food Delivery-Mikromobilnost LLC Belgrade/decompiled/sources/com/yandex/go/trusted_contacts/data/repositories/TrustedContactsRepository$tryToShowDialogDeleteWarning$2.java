package com.yandex.go.trusted_contacts.data.repositories;

import defpackage.gsh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.og11;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Log11;", "<anonymous>", "(Log11;)Log11;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.trusted_contacts.data.repositories.TrustedContactsRepository$tryToShowDialogDeleteWarning$2", f = "TrustedContactsRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TrustedContactsRepository$tryToShowDialogDeleteWarning$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $id;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrustedContactsRepository$tryToShowDialogDeleteWarning$2(String str, Continuation continuation) {
        super(2, continuation);
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TrustedContactsRepository$tryToShowDialogDeleteWarning$2 trustedContactsRepository$tryToShowDialogDeleteWarning$2 = new TrustedContactsRepository$tryToShowDialogDeleteWarning$2(this.$id, continuation);
        trustedContactsRepository$tryToShowDialogDeleteWarning$2.L$0 = obj;
        return trustedContactsRepository$tryToShowDialogDeleteWarning$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrustedContactsRepository$tryToShowDialogDeleteWarning$2) create((og11) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        og11 og11Var = (og11) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        gsh gshVar = og11Var.g;
        String str = this.$id;
        gshVar.getClass();
        return og11.a(og11Var, null, null, null, new gsh(false, str), 63);
    }
}
