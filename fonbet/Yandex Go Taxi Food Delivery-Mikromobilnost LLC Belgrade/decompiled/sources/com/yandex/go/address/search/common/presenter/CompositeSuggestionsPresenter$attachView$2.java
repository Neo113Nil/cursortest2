package com.yandex.go.address.search.common.presenter;

import com.yandex.go.address.search.common.presenter.a;
import defpackage.bjd;
import defpackage.ike;
import defpackage.kvh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qsd;
import defpackage.tje;
import defpackage.tls;
import defpackage.tsd;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xsd;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.search.address.view.PointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.search.common.presenter.CompositeSuggestionsPresenter$attachView$2", f = "CompositeSuggestionsPresenter.kt", l = {157}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CompositeSuggestionsPresenter$attachView$2 extends SuspendLambda implements wls {
    final /* synthetic */ PointType $activePoint;
    final /* synthetic */ bjd $mvpView;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositeSuggestionsPresenter$attachView$2(a aVar, PointType pointType, bjd bjdVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$activePoint = pointType;
        this.$mvpView = bjdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CompositeSuggestionsPresenter$attachView$2(this.this$0, this.$activePoint, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CompositeSuggestionsPresenter$attachView$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        final int i2 = 1;
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
            int i3 = xsd.a[this.$activePoint.ordinal()];
            if (i3 == 1) {
                this.this$0.y.u0 = true;
            } else {
                if (i3 != 2) {
                    w511.b();
                    return null;
                }
                this.this$0.x.I0 = true;
            }
        }
        a aVar = this.this$0;
        aVar.x.eh((tsd) aVar.S.getValue());
        qsd xh = this.this$0.xh();
        b bVar = this.this$0.y;
        a aVar2 = xh.d;
        bVar.eh(aVar2.yh());
        aVar2.Ch();
        aVar2.Bh();
        final a aVar3 = this.this$0;
        bjd bjdVar = this.$mvpView;
        ru.yandex.taxi.styling.f fVar = aVar3.A;
        tje.N(aVar3.Jg(), null, null, new CompositeSuggestionsPresenter$initSubscriptions$$inlined$safeCollectIn$1(com.yandex.go.coroutines.b.d(fVar.d(null), new CompositeSuggestionsPresenter$initSubscriptions$$inlined$start$1(fVar.c(fVar.d.a().c), null)), null, bjdVar), 3);
        tje.N(aVar3.Jg(), null, null, new CompositeSuggestionsPresenter$initSubscriptions$$inlined$safeCollectIn$2(bjdVar, kotlinx.coroutines.flow.e.X(aVar3.x.B0.a, new CompositeSuggestionsPresenter$initSubscriptions$$inlined$flatMapLatest$1(null, bjdVar, aVar3)), aVar3, null), 3);
        tje.N(aVar3.Jg(), null, null, new CompositeSuggestionsPresenter$initSubscriptions$$inlined$safeCollectIn$3(bjdVar, kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(aVar3.y.q0.e, new CompositeSuggestionsPresenter$initSubscriptions$$inlined$flatMapLatest$2(null, bjdVar, aVar3))), aVar3, null), 3);
        kvh kvhVar = aVar3.N;
        tse Jg = aVar3.Jg();
        PointType pointType = PointType.DESTINATION;
        final int i4 = 0;
        kvhVar.a((ike) Jg, bjdVar.q8(pointType), pointType, new tls() { // from class: msd
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                int i5 = i4;
                zy11 zy11Var = zy11.a;
                a aVar4 = aVar3;
                x9v0 x9v0Var = (x9v0) obj2;
                switch (i5) {
                    case 0:
                        aVar4.y.ih(x9v0Var);
                        break;
                    default:
                        aVar4.x.ih(x9v0Var);
                        break;
                }
                return zy11Var;
            }
        });
        kvh kvhVar2 = aVar3.M;
        tse Jg2 = aVar3.Jg();
        PointType pointType2 = PointType.SOURCE;
        kvhVar2.a((ike) Jg2, bjdVar.q8(pointType2), pointType2, new tls() { // from class: msd
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                int i5 = i2;
                zy11 zy11Var = zy11.a;
                a aVar4 = aVar3;
                x9v0 x9v0Var = (x9v0) obj2;
                switch (i5) {
                    case 0:
                        aVar4.y.ih(x9v0Var);
                        break;
                    default:
                        aVar4.x.ih(x9v0Var);
                        break;
                }
                return zy11Var;
            }
        });
        return zy11.a;
    }
}
