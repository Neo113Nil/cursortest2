package com.yandex.go.masstransit.sdk.ble.impl.repository;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.u26;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.ble.impl.repository.MtGeoVehiclesRepository$listenBleScanResults$1", f = "MtGeoVehiclesRepository.kt", l = {110}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MtGeoVehiclesRepository$listenBleScanResults$1 extends SuspendLambda implements wls {
    final /* synthetic */ u26 $bleScanSettings;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtGeoVehiclesRepository$listenBleScanResults$1(u26 u26Var, b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$bleScanSettings = u26Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtGeoVehiclesRepository$listenBleScanResults$1(this.$bleScanSettings, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtGeoVehiclesRepository$listenBleScanResults$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            r0 r0Var = bVar.c.g;
            a aVar = new a(bVar, this.$bleScanSettings);
            this.label = 1;
            if (r0Var.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ny61.A();
        return null;
    }
}
