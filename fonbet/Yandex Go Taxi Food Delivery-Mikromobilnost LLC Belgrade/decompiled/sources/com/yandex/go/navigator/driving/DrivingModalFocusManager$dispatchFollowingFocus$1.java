package com.yandex.go.navigator.driving;

import android.graphics.Rect;
import com.yandex.mapkit.ScreenPoint;
import defpackage.ah00;
import defpackage.akm;
import defpackage.bms;
import defpackage.gh00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ofp0;
import defpackage.wb50;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "<unused var>", "Lakm;", "contentSizes", "isInOverviewMode", "Lzy11;", "<anonymous>", "(ZLakm;Z)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.driving.DrivingModalFocusManager$dispatchFollowingFocus$1", f = "DrivingModalFocusManager.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DrivingModalFocusManager$dispatchFollowingFocus$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrivingModalFocusManager$dispatchFollowingFocus$1(f fVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = fVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Boolean) obj).booleanValue();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        DrivingModalFocusManager$dispatchFollowingFocus$1 drivingModalFocusManager$dispatchFollowingFocus$1 = new DrivingModalFocusManager$dispatchFollowingFocus$1(this.this$0, (Continuation) obj4);
        drivingModalFocusManager$dispatchFollowingFocus$1.L$0 = (akm) obj2;
        drivingModalFocusManager$dispatchFollowingFocus$1.Z$0 = booleanValue;
        zy11 zy11Var = zy11.a;
        drivingModalFocusManager$dispatchFollowingFocus$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        akm akmVar = (akm) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        f fVar = this.this$0;
        wb50 wb50Var = fVar.c;
        int i = akmVar.d + akmVar.e + akmVar.f + akmVar.b;
        int i2 = ofp0.b;
        int i3 = ofp0.c;
        ScreenPoint screenPoint = new ScreenPoint(i2 / 2.0f, (i3 - ((Number) fVar.k.getValue()).floatValue()) - i);
        if (z) {
            wb50Var.f(null, 0L);
        } else if (fVar.l) {
            wb50Var.f(screenPoint, 1000L);
            fVar.l = false;
            fVar.m = true;
        } else if (fVar.m) {
            wb50Var.f(screenPoint, 1000L);
        } else {
            wb50Var.g(screenPoint);
            fVar.m = true;
        }
        int i4 = akmVar.c;
        int i5 = akmVar.a;
        wb50Var.getClass();
        ah00 ah00Var = wb50Var.a;
        Rect rect = new Rect(i4, i5, i2 - i4, i3 - i);
        if (!rect.equals(((gh00) ah00Var).a.b())) {
            ((gh00) ah00Var).z(wb50Var, ru.yandex.taxi.map.utils.a.A(rect), false, 0L);
        }
        return zy11.a;
    }
}
