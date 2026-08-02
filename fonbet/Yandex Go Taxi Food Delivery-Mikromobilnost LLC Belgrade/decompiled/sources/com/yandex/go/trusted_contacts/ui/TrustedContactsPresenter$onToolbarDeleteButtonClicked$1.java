package com.yandex.go.trusted_contacts.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o7r0;
import defpackage.sh11;
import defpackage.tse;
import defpackage.wls;
import defpackage.zg11;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.trusted_contacts.ui.TrustedContactsPresenter$onToolbarDeleteButtonClicked$1", f = "TrustedContactsPresenter.kt", l = {BuildConfig.API_LEVEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TrustedContactsPresenter$onToolbarDeleteButtonClicked$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ sh11 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrustedContactsPresenter$onToolbarDeleteButtonClicked$1(sh11 sh11Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sh11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrustedContactsPresenter$onToolbarDeleteButtonClicked$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrustedContactsPresenter$onToolbarDeleteButtonClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o7r0 o7r0Var = (o7r0) this.this$0.z.c;
            o7r0Var.getClass();
            o7r0Var.a.a("TrustedContacts.DeleteContactsButtonTapped", new HashMap(), 1, new HashMap());
            zg11 zg11Var = this.this$0.y;
            this.label = 1;
            if (zg11Var.a.i(this) == coroutineSingletons) {
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
