package com.yandex.go.taxi.summary.interactor;

import com.yandex.go.taxi.summary.api.state.SummaryUiState$Type;
import defpackage.b1h0;
import defpackage.bms;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oa31;
import defpackage.qgv0;
import defpackage.wgv0;
import defpackage.xgv0;
import defpackage.ygv0;
import defpackage.yqv0;
import defpackage.za31;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/yandex/taxi/address/experiment/e;", "redesignConfig", "Lyqv0;", "summaryUiState", "Lqgv0;", "trail", "Lzgv0;", "<anonymous>", "(Lru/yandex/taxi/address/experiment/e;Lyqv0;Lqgv0;)Lzgv0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.interactor.SummaryHeaderUIStateInteractor$trapHeader$2", f = "SummaryHeaderUIStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SummaryHeaderUIStateInteractor$trapHeader$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryHeaderUIStateInteractor$trapHeader$2(g gVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = gVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SummaryHeaderUIStateInteractor$trapHeader$2 summaryHeaderUIStateInteractor$trapHeader$2 = new SummaryHeaderUIStateInteractor$trapHeader$2(this.this$0, (Continuation) obj4);
        summaryHeaderUIStateInteractor$trapHeader$2.L$0 = (ru.yandex.taxi.address.experiment.e) obj;
        summaryHeaderUIStateInteractor$trapHeader$2.L$1 = (yqv0) obj2;
        summaryHeaderUIStateInteractor$trapHeader$2.L$2 = (qgv0) obj3;
        return summaryHeaderUIStateInteractor$trapHeader$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        xgv0 xgv0Var;
        Object obj2;
        String str;
        ru.yandex.taxi.address.experiment.e eVar = (ru.yandex.taxi.address.experiment.e) this.L$0;
        yqv0 yqv0Var = (yqv0) this.L$1;
        qgv0 qgv0Var = (qgv0) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ygv0 ygv0Var = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.getClass();
        if (eVar != null && (str = eVar.h) != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                xgv0Var = new xgv0(str, qgv0Var);
                if (xgv0Var == null) {
                    return xgv0Var;
                }
                g gVar = this.this$0;
                gVar.getClass();
                if (yqv0Var.a == SummaryUiState$Type.TRAP) {
                    Iterator it = ((com.yandex.go.taxi.tariffs.internal.repository.k) gVar.e).j().a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (jl40.l(((za31) obj2).a.a, yqv0Var.b)) {
                            break;
                        }
                    }
                    za31 za31Var = (za31) obj2;
                    if (za31Var != null) {
                        oa31 oa31Var = za31Var.a;
                        if (oa31Var.d.length() != 0) {
                            ygv0Var = new ygv0(oa31Var.d, gVar.c.a(oa31Var.j), b1h0.ic_vertical_header_default, qgv0Var, oa31Var.d);
                        }
                    }
                }
                return ygv0Var == null ? wgv0.a : ygv0Var;
            }
        }
        xgv0Var = null;
        if (xgv0Var == null) {
        }
    }
}
