package com.yandex.go.walking.navigation.impl.ui.overlay;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)F"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.walking.navigation.impl.ui.overlay.WalkNavPlacemarksPresenter$checkIsLocationNearStartPoint$distance$1", f = "WalkNavPlacemarksPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WalkNavPlacemarksPresenter$checkIsLocationNearStartPoint$distance$1 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $startPoint;
    final /* synthetic */ zzs $userPoint;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavPlacemarksPresenter$checkIsLocationNearStartPoint$distance$1(zzs zzsVar, zzs zzsVar2, Continuation continuation) {
        super(2, continuation);
        this.$userPoint = zzsVar;
        this.$startPoint = zzsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalkNavPlacemarksPresenter$checkIsLocationNearStartPoint$distance$1(this.$userPoint, this.$startPoint, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WalkNavPlacemarksPresenter$checkIsLocationNearStartPoint$distance$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Float(ru.yandex.taxi.map.utils.a.j(this.$userPoint, this.$startPoint));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
