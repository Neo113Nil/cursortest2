package com.yandex.go.places.impl.ui.location_permission;

import defpackage.a60;
import defpackage.jaz;
import defpackage.laz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.v7j0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.location_permission.LocationPermissionRequestPresenter$requestPermission$1", f = "LocationPermissionRequestPresenter.kt", l = {42}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class LocationPermissionRequestPresenter$requestPermission$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ jaz this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationPermissionRequestPresenter$requestPermission$1(jaz jazVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jazVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocationPermissionRequestPresenter$requestPermission$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationPermissionRequestPresenter$requestPermission$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            jaz jazVar = this.this$0;
            jazVar.D = true;
            v7j0 v7j0Var = jazVar.C;
            this.label = 1;
            obj = ((com.yandex.go.permission.b) v7j0Var).d(1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        jaz jazVar2 = this.this$0;
        if (booleanValue) {
            ((laz) jazVar2.A.a).r(new qu(9));
        } else {
            ((a60) jazVar2.B).d();
        }
        return zy11.a;
    }
}
