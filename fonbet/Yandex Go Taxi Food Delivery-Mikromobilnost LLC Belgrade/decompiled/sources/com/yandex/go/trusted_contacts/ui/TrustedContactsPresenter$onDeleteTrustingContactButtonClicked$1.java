package com.yandex.go.trusted_contacts.ui;

import com.yandex.go.trusted_contacts.analytics.ContactType;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sh11;
import defpackage.tse;
import defpackage.wls;
import defpackage.zg11;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.trusted_contacts.ui.TrustedContactsPresenter$onDeleteTrustingContactButtonClicked$1", f = "TrustedContactsPresenter.kt", l = {167}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TrustedContactsPresenter$onDeleteTrustingContactButtonClicked$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ sh11 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrustedContactsPresenter$onDeleteTrustingContactButtonClicked$1(sh11 sh11Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sh11Var;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrustedContactsPresenter$onDeleteTrustingContactButtonClicked$1(this.this$0, this.$id, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrustedContactsPresenter$onDeleteTrustingContactButtonClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.z.s(this.$id, ContactType.TRUSTING);
            zg11 zg11Var = this.this$0.y;
            String str = this.$id;
            this.label = 1;
            if (zg11Var.a.g(str, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
