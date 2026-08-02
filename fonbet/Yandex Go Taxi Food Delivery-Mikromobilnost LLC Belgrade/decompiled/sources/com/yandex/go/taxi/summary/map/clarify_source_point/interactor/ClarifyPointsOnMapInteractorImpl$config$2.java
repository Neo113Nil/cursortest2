package com.yandex.go.taxi.summary.map.clarify_source_point.interactor;

import com.yandex.go.taxi.summary.api.map.model.PointsVisiblePriority;
import com.yandex.go.taxi.summary.map.clarify_source_point.experiments.ClarifyPointsOnMapExperiment;
import com.yandex.go.taxi.summary.map.clarify_source_point.experiments.PinStateDto;
import com.yandex.go.taxi.summary.map.clarify_source_point.experiments.TariffOverride;
import defpackage.g0c0;
import defpackage.iyb;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zyb;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Liyb;", "<anonymous>", "(Ltse;)Liyb;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.map.clarify_source_point.interactor.ClarifyPointsOnMapInteractorImpl$config$2", f = "ClarifyPointsOnMapInteractorImpl.kt", l = {41, 42}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ClarifyPointsOnMapInteractorImpl$config$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $tariffClass;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClarifyPointsOnMapInteractorImpl$config$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$tariffClass = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ClarifyPointsOnMapInteractorImpl$config$2(this.this$0, this.$tariffClass, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ClarifyPointsOnMapInteractorImpl$config$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ClarifyPointsOnMapExperiment clarifyPointsOnMapExperiment;
        Object obj2;
        PointsVisiblePriority pointsVisiblePriority;
        PinStateDto pinStateDto;
        Float f;
        TariffOverride tariffOverride;
        PinStateDto pinStateDto2;
        g0c0 g0c0Var;
        TariffOverride tariffOverride2;
        Float f2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Object b = this.this$0.c.b();
            if (!((ClarifyPointsOnMapExperiment) b).b) {
                b = null;
            }
            clarifyPointsOnMapExperiment = (ClarifyPointsOnMapExperiment) b;
            if (clarifyPointsOnMapExperiment == null || clarifyPointsOnMapExperiment.h.contains(this.$tariffClass)) {
                return null;
            }
            a aVar = this.this$0;
            String str = this.$tariffClass;
            aVar.getClass();
            Iterator it = clarifyPointsOnMapExperiment.i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((TariffOverride) obj2).a.contains(str)) {
                    break;
                }
            }
            TariffOverride tariffOverride3 = (TariffOverride) obj2;
            Float f3 = clarifyPointsOnMapExperiment.d;
            this.this$0.getClass();
            int i2 = zyb.a[clarifyPointsOnMapExperiment.e.ordinal()];
            if (i2 == 1) {
                pointsVisiblePriority = PointsVisiblePriority.SOURCE;
            } else if (i2 == 2) {
                pointsVisiblePriority = PointsVisiblePriority.DESTINATION;
            } else {
                if (i2 != 3) {
                    w511.b();
                    return null;
                }
                pointsVisiblePriority = PointsVisiblePriority.BOTH;
            }
            a aVar2 = this.this$0;
            aVar2.getClass();
            if (tariffOverride3 == null || (pinStateDto = tariffOverride3.b) == null) {
                pinStateDto = clarifyPointsOnMapExperiment.f;
            }
            this.L$0 = clarifyPointsOnMapExperiment;
            this.L$1 = tariffOverride3;
            this.L$2 = f3;
            this.L$3 = pointsVisiblePriority;
            this.label = 1;
            Object a = a.a(aVar2, clarifyPointsOnMapExperiment, pinStateDto, this);
            if (a != coroutineSingletons) {
                f = f3;
                obj = a;
                tariffOverride = tariffOverride3;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g0c0 g0c0Var2 = (g0c0) this.L$4;
            pointsVisiblePriority = (PointsVisiblePriority) this.L$3;
            Float f4 = (Float) this.L$2;
            tariffOverride2 = (TariffOverride) this.L$1;
            b.b(obj);
            g0c0Var = g0c0Var2;
            f2 = f4;
            return new iyb(f2, pointsVisiblePriority, g0c0Var, (g0c0) obj, tariffOverride2 == null && tariffOverride2.d);
        }
        pointsVisiblePriority = (PointsVisiblePriority) this.L$3;
        f = (Float) this.L$2;
        tariffOverride = (TariffOverride) this.L$1;
        clarifyPointsOnMapExperiment = (ClarifyPointsOnMapExperiment) this.L$0;
        b.b(obj);
        g0c0 g0c0Var3 = (g0c0) obj;
        a aVar3 = this.this$0;
        int i3 = a.d;
        aVar3.getClass();
        if (tariffOverride == null || (pinStateDto2 = tariffOverride.c) == null) {
            pinStateDto2 = clarifyPointsOnMapExperiment.g;
        }
        this.L$0 = null;
        this.L$1 = tariffOverride;
        this.L$2 = f;
        this.L$3 = pointsVisiblePriority;
        this.L$4 = g0c0Var3;
        this.label = 2;
        Object a2 = a.a(aVar3, clarifyPointsOnMapExperiment, pinStateDto2, this);
        if (a2 != coroutineSingletons) {
            g0c0Var = g0c0Var3;
            tariffOverride2 = tariffOverride;
            obj = a2;
            f2 = f;
            return new iyb(f2, pointsVisiblePriority, g0c0Var, (g0c0) obj, tariffOverride2 == null && tariffOverride2.d);
        }
        return coroutineSingletons;
    }
}
