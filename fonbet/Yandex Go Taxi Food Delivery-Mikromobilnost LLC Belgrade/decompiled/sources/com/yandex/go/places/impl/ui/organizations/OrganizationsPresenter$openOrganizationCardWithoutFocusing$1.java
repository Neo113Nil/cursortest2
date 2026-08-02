package com.yandex.go.places.impl.ui.organizations;

import defpackage.huj;
import defpackage.juj;
import defpackage.kq;
import defpackage.lg80;
import defpackage.mvg;
import defpackage.nuj;
import defpackage.ny61;
import defpackage.puj;
import defpackage.svj;
import defpackage.t9c0;
import defpackage.ti80;
import defpackage.tse;
import defpackage.u3m;
import defpackage.wls;
import defpackage.yuj;
import defpackage.zuj;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.organizations.OrganizationsPresenter$openOrganizationCardWithoutFocusing$1", f = "OrganizationsPresenter.kt", l = {236}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationsPresenter$openOrganizationCardWithoutFocusing$1 extends SuspendLambda implements wls {
    final /* synthetic */ kq $action;
    final /* synthetic */ boolean $isModalViewExpanded;
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationsPresenter$openOrganizationCardWithoutFocusing$1(d dVar, boolean z, kq kqVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$isModalViewExpanded = z;
        this.$action = kqVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationsPresenter$openOrganizationCardWithoutFocusing$1(this.this$0, this.$isModalViewExpanded, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationsPresenter$openOrganizationCardWithoutFocusing$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        svj svjVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            kotlin.b.b(obj);
            svj a = this.this$0.T.a();
            if (a.equals(zuj.b)) {
                a = puj.b;
            } else if (a.equals(yuj.b)) {
                a = nuj.b;
            } else if (a.equals(juj.b)) {
                a = huj.b;
            }
            com.yandex.go.places.experiments.flex.b bVar = this.this$0.V;
            this.L$0 = a;
            this.label = 1;
            b = bVar.b(t9c0.b, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            svjVar = a;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            svj svjVar2 = (svj) this.L$0;
            kotlin.b.b(obj);
            b = obj;
            svjVar = svjVar2;
        }
        u3m u3mVar = (u3m) b;
        if ((u3mVar == null || !u3mVar.c) && !this.$isModalViewExpanded) {
            z = false;
        }
        boolean z2 = z;
        d dVar = this.this$0;
        com.yandex.go.places.impl.navigation.common.navigator.internal.b bVar2 = dVar.S;
        kq kqVar = this.$action;
        ti80 ti80Var = kqVar.a;
        lg80 lg80Var = kqVar.b;
        if (lg80Var == null) {
            lg80Var = dVar.U.a();
        }
        kq kqVar2 = this.$action;
        com.yandex.go.places.impl.navigation.common.navigator.internal.b.c(bVar2, svjVar, ti80Var, lg80Var, kqVar2.c, kqVar2.d, true, true, null, false, false, z2, false, false, null, null, 30720);
        return zy11.a;
    }
}
