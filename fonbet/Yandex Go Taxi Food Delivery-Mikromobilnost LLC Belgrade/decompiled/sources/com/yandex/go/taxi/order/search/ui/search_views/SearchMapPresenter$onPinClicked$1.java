package com.yandex.go.taxi.order.search.ui.search_views;

import defpackage.j380;
import defpackage.k380;
import defpackage.l380;
import defpackage.m380;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o380;
import defpackage.tje;
import defpackage.tse;
import defpackage.vup0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.search.ui.search_views.SearchMapPresenter$onPinClicked$1", f = "SearchMapPresenter.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SearchMapPresenter$onPinClicked$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ vup0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchMapPresenter$onPinClicked$1(vup0 vup0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vup0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchMapPresenter$onPinClicked$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchMapPresenter$onPinClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            m380 m380Var = o380.a((j380) this.this$0.E.a.getValue()).b;
            if (m380Var instanceof l380) {
                this.L$0 = null;
                this.label = 1;
                if (this.this$0.G.a((l380) m380Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (!m380Var.equals(k380.b) && !m380Var.equals(k380.c) && !m380Var.equals(k380.a)) {
                    w511.b();
                    return null;
                }
                vup0 vup0Var = this.this$0;
                tje.N(vup0Var.Jg(), null, null, new SearchMapPresenter$onChangeSourcePointPinClicked$1(vup0Var, null), 3);
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
