package com.yandex.go.scooters.offers.v2.domain;

import defpackage.e5n0;
import defpackage.f5n0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tan0;
import defpackage.tls;
import defpackage.tse;
import defpackage.umm0;
import defpackage.v45;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lg5n0;", "<anonymous>", "(Ltse;)Lg5n0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.domain.ScootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$2", f = "ScootersBehaviourStateHeightsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$2 extends SuspendLambda implements wls {
    final /* synthetic */ tan0 $componentsHeightTree;
    final /* synthetic */ int $visibleNumberOfOptions;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$2(b bVar, tan0 tan0Var, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$componentsHeightTree = tan0Var;
        this.$visibleNumberOfOptions = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$2(this.this$0, this.$componentsHeightTree, this.$visibleNumberOfOptions, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersBehaviourStateHeightsInteractor$calculateBehaviourStateHeights$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        tan0 tan0Var = this.$componentsHeightTree;
        int i = this.$visibleNumberOfOptions;
        int i2 = b.h;
        bVar.getClass();
        tls umm0Var = i == 0 ? new umm0(27) : i == 1 ? new ScootersBehaviourStateHeightsInteractor$createIsDesiredComponentOptionIdPredicate$2(1, bVar, b.class, "isComponentOptionId", "isComponentOptionId(I)Z", 0) : new v45(bVar, new Ref$IntRef(), i, 4);
        tan0Var.getClass();
        int[] iArr = new int[1];
        tan0.a(iArr, tan0Var, umm0Var);
        int i3 = iArr[0];
        int[] iArr2 = new int[1];
        tan0.a(iArr2, tan0Var, new umm0(25));
        int i4 = iArr2[0];
        int[] iArr3 = new int[1];
        tan0.a(iArr3, tan0Var, new umm0(26));
        int i5 = iArr3[0];
        int i6 = i3 == 0 ? bVar.d : bVar.g + i3;
        if (i4 == 0) {
            i4 = bVar.e;
        }
        return Math.abs(i5 - i6) >= bVar.f ? new f5n0(i6, i4) : new e5n0(i4);
    }
}
