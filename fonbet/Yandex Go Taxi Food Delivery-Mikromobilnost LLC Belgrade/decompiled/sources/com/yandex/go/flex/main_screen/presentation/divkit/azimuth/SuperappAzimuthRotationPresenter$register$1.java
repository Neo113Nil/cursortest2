package com.yandex.go.flex.main_screen.presentation.divkit.azimuth;

import android.view.View;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "degrees", "Lzy11;", "<anonymous>", "(F)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.main_screen.presentation.divkit.azimuth.SuperappAzimuthRotationPresenter$register$1", f = "SuperappAzimuthRotationPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuperappAzimuthRotationPresenter$register$1 extends SuspendLambda implements wls {
    final /* synthetic */ View $view;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappAzimuthRotationPresenter$register$1(View view, Continuation continuation) {
        super(2, continuation);
        this.$view = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperappAzimuthRotationPresenter$register$1 superappAzimuthRotationPresenter$register$1 = new SuperappAzimuthRotationPresenter$register$1(this.$view, continuation);
        superappAzimuthRotationPresenter$register$1.F$0 = ((Number) obj).floatValue();
        return superappAzimuthRotationPresenter$register$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SuperappAzimuthRotationPresenter$register$1 superappAzimuthRotationPresenter$register$1 = (SuperappAzimuthRotationPresenter$register$1) create(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        superappAzimuthRotationPresenter$register$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f = this.F$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.$view.setRotation(f);
        return zy11.a;
    }
}
