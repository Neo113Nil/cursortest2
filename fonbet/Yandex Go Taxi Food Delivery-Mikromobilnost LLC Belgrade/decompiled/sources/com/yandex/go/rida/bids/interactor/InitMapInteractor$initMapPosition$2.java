package com.yandex.go.rida.bids.interactor;

import com.yandex.mapkit.geometry.Point;
import defpackage.fh00;
import defpackage.gh00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.bids.interactor.InitMapInteractor$initMapPosition$2", f = "InitMapInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class InitMapInteractor$initMapPosition$2 extends SuspendLambda implements wls {
    final /* synthetic */ Point $sourcePoint;
    int label;
    final /* synthetic */ t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitMapInteractor$initMapPosition$2(t tVar, Point point, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tVar;
        this.$sourcePoint = point;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InitMapInteractor$initMapPosition$2(this.this$0, this.$sourcePoint, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        InitMapInteractor$initMapPosition$2 initMapInteractor$initMapPosition$2 = (InitMapInteractor$initMapPosition$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        initMapInteractor$initMapPosition$2.invokeSuspend(zy11Var);
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
        gh00 gh00Var = (gh00) this.this$0.a;
        gh00Var.q(new fh00(gh00Var, this.$sourcePoint, 17.0f));
        return zy11.a;
    }
}
