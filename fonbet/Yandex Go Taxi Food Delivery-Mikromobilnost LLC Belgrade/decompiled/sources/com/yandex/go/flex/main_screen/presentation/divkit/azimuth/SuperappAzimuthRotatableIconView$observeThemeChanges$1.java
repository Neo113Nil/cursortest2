package com.yandex.go.flex.main_screen.presentation.divkit.azimuth;

import defpackage.hnr0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qit0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.yqq;
import defpackage.zqq;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.r;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.main_screen.presentation.divkit.azimuth.SuperappAzimuthRotatableIconView$observeThemeChanges$1", f = "SuperappAzimuthRotatableIconView.kt", l = {HProv.PP_ENUM_CONTAINER_EXTENSION}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class SuperappAzimuthRotatableIconView$observeThemeChanges$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ SuperappAzimuthRotatableIconView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappAzimuthRotatableIconView$observeThemeChanges$1(SuperappAzimuthRotatableIconView superappAzimuthRotatableIconView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = superappAzimuthRotatableIconView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperappAzimuthRotatableIconView$observeThemeChanges$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappAzimuthRotatableIconView$observeThemeChanges$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yqq yqqVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            yqqVar = this.this$0.feedSdkThemeInteractor;
            tpr t = kotlinx.coroutines.flow.e.t(new b((hnr0) ((zqq) yqqVar).f.getValue(), this.this$0));
            qit0 qit0Var = new qit0(18, this.this$0);
            this.label = 1;
            Object collect = t.collect(new r(qit0Var, new Ref$IntRef()), this);
            if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                collect = zy11Var;
            }
            if (collect == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11Var;
    }
}
