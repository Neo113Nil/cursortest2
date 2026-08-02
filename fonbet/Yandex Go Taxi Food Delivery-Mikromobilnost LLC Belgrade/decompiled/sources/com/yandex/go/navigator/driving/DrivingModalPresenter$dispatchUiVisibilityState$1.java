package com.yandex.go.navigator.driving;

import com.yandex.go.navigator.domain.FocusMode;
import defpackage.ems;
import defpackage.lu11;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.yjm;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lyjm;", "drivingViewState", "", "showUserInterface", "Lcom/yandex/go/navigator/domain/FocusMode;", "focusMode", "isInOverviewMode", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Llu11;", "<anonymous>", "(Lyjm;ZLcom/yandex/go/navigator/domain/FocusMode;ZLru/yandex/taxi/theme/ThemeType;)Llu11;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.driving.DrivingModalPresenter$dispatchUiVisibilityState$1", f = "DrivingModalPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DrivingModalPresenter$dispatchUiVisibilityState$1 extends SuspendLambda implements ems {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    public DrivingModalPresenter$dispatchUiVisibilityState$1(Continuation continuation) {
        super(6, continuation);
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj4).booleanValue();
        DrivingModalPresenter$dispatchUiVisibilityState$1 drivingModalPresenter$dispatchUiVisibilityState$1 = new DrivingModalPresenter$dispatchUiVisibilityState$1((Continuation) obj6);
        drivingModalPresenter$dispatchUiVisibilityState$1.L$0 = (yjm) obj;
        drivingModalPresenter$dispatchUiVisibilityState$1.Z$0 = booleanValue;
        drivingModalPresenter$dispatchUiVisibilityState$1.L$1 = (FocusMode) obj3;
        drivingModalPresenter$dispatchUiVisibilityState$1.Z$1 = booleanValue2;
        return drivingModalPresenter$dispatchUiVisibilityState$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yjm yjmVar = (yjm) this.L$0;
        boolean z = this.Z$0;
        FocusMode focusMode = (FocusMode) this.L$1;
        boolean z2 = this.Z$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean z3 = true;
        boolean z4 = (z && yjmVar.a.a) ? false : true;
        boolean z5 = z || z2;
        if (focusMode != FocusMode.FREE && !z) {
            z3 = false;
        }
        return new lu11(z5, z4, z3);
    }
}
