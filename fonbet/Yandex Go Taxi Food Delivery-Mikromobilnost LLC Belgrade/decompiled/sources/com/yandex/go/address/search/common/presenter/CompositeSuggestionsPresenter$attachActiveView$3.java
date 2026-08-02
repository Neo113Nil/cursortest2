package com.yandex.go.address.search.common.presenter;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vsd;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.search.address.view.PointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.search.common.presenter.CompositeSuggestionsPresenter$attachActiveView$3", f = "CompositeSuggestionsPresenter.kt", l = {245}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CompositeSuggestionsPresenter$attachActiveView$3 extends SuspendLambda implements wls {
    final /* synthetic */ PointType $activePoint;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositeSuggestionsPresenter$attachActiveView$3(a aVar, PointType pointType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$activePoint = pointType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CompositeSuggestionsPresenter$attachActiveView$3(this.this$0, this.$activePoint, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CompositeSuggestionsPresenter$attachActiveView$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String zh;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.address.search.perf.c cVar = this.this$0.O;
            this.label = 1;
            obj = cVar.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            int i2 = vsd.a[this.$activePoint.ordinal()];
            if (i2 == 1) {
                d dVar = this.this$0.x;
                if (dVar.I0 && dVar.Eg()) {
                    dVar.I0 = false;
                    String zh2 = dVar.zh();
                    if (zh2 == null || zh2.length() == 0) {
                        dVar.vh();
                    } else {
                        dVar.showProgress();
                        dVar.Sg(dVar.x.b(zh2));
                    }
                }
            } else {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                b bVar = this.this$0.y;
                if (bVar.u0 && bVar.Eg() && bVar.s0 == null && ((zh = bVar.zh()) == null || zh.length() == 0)) {
                    bVar.u0 = false;
                    bVar.Ah();
                    com.yandex.go.coroutines.b.g(bVar.Jg(), null, null, new SuggestedDestinationsPresenter$startZeroSuggest$1(bVar.Hh(), bVar, null), 3);
                }
            }
        }
        return zy11.a;
    }
}
