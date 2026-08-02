package com.yandex.go.places.impl.navigation.search;

import defpackage.evu0;
import defpackage.guj;
import defpackage.itp0;
import defpackage.juj;
import defpackage.kn80;
import defpackage.l76;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.puj;
import defpackage.s7c0;
import defpackage.sls;
import defpackage.sn80;
import defpackage.tse;
import defpackage.u3m;
import defpackage.u9c0;
import defpackage.vvb1;
import defpackage.wls;
import defpackage.wsp0;
import defpackage.yl80;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.navigation.search.SearchCardModalViewRouter$InnerNavigator$openOrganizationsList$1", f = "SearchCardModalViewRouter.kt", l = {106}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SearchCardModalViewRouter$InnerNavigator$openOrganizationsList$1 extends SuspendLambda implements wls {
    final /* synthetic */ wsp0 $actionType;
    final /* synthetic */ sls $doOnGoBack;
    final /* synthetic */ boolean $keepSearchInStack;
    final /* synthetic */ boolean $resetMapFocus;
    Object L$0;
    int label;
    final /* synthetic */ itp0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchCardModalViewRouter$InnerNavigator$openOrganizationsList$1(wsp0 wsp0Var, itp0 itp0Var, boolean z, boolean z2, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.$actionType = wsp0Var;
        this.this$0 = itp0Var;
        this.$keepSearchInStack = z;
        this.$resetMapFocus = z2;
        this.$doOnGoBack = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchCardModalViewRouter$InnerNavigator$openOrganizationsList$1(this.$actionType, this.this$0, this.$keepSearchInStack, this.$resetMapFocus, this.$doOnGoBack, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchCardModalViewRouter$InnerNavigator$openOrganizationsList$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yl80 yl80Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            wsp0 wsp0Var = this.$actionType;
            yl80 yl80Var2 = new yl80(wsp0Var.c, wsp0Var.b, this.this$0.J.a() instanceof guj ? juj.b : puj.b, this.this$0.I.a(), wsp0Var.a, null, this.$keepSearchInStack ? l76.I : vvb1.H, this.$resetMapFocus, 32);
            kn80 kn80Var = this.this$0.K;
            this.L$0 = yl80Var2;
            this.label = 1;
            obj = kn80Var.a.b(u9c0.b, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            yl80Var = yl80Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yl80Var = (yl80) this.L$0;
            b.b(obj);
        }
        u3m u3mVar = (u3m) obj;
        if (u3mVar != null) {
            String str = u3mVar.b;
            String str2 = u3mVar.d;
            this.this$0.E.f(new sn80(new s7c0(str, evu0.J(str2) ? null : str2, 2), yl80Var.c, yl80Var.e, yl80Var.g, yl80Var.d, yl80Var.a, yl80Var.b, yl80Var.h), this.$keepSearchInStack, this.$doOnGoBack);
        } else {
            this.this$0.E.d(yl80Var, this.$keepSearchInStack, this.$doOnGoBack);
        }
        return zy11.a;
    }
}
