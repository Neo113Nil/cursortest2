package com.yandex.go.navigator.driving;

import com.yandex.go.navigator.domain.FocusMode;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import defpackage.ho21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xb50;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.driving.DrivingModalFocusManager$focusOnRoute$1", f = "DrivingModalFocusManager.kt", l = {149}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DrivingModalFocusManager$focusOnRoute$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrivingModalFocusManager$focusOnRoute$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DrivingModalFocusManager$focusOnRoute$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DrivingModalFocusManager$focusOnRoute$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.i.l(Boolean.TRUE);
            this.this$0.d.a(FocusMode.FREE);
            this.this$0.b.b();
            com.yandex.go.navigator.repository.o oVar = this.this$0.b;
            ho21 ho21Var = oVar.a;
            ho21Var.a = false;
            ho21Var.b.b();
            oVar.c = true;
            kotlinx.coroutines.flow.m0 m0Var = this.this$0.b.f;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.y(m0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        xb50 xb50Var = this.this$0.h;
        DrivingRoute a = xb50Var.b.a();
        if (a != null) {
            xb50Var.a(a, true);
        }
        return zy11.a;
    }
}
