package com.yandex.go.places.impl.ui.filters;

import defpackage.jm80;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rm80;
import defpackage.tse;
import defpackage.um80;
import defpackage.wls;
import defpackage.xx20;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.filters.OrganizationsFiltersPresenter$attachView$1", f = "OrganizationsFiltersPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationsFiltersPresenter$attachView$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ rm80 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationsFiltersPresenter$attachView$1(rm80 rm80Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rm80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationsFiltersPresenter$attachView$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OrganizationsFiltersPresenter$attachView$1 organizationsFiltersPresenter$attachView$1 = (OrganizationsFiltersPresenter$attachView$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        organizationsFiltersPresenter$attachView$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        rm80 rm80Var = this.this$0;
        um80 um80Var = rm80Var.z;
        xx20 xx20Var = rm80Var.B;
        jm80 jm80Var = um80Var.b;
        jm80Var.a.l(xx20Var.a);
        return zy11.a;
    }
}
