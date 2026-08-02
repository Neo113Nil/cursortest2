package com.yandex.go.scooters.offers.v2.domain;

import defpackage.l4o0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o4o0;
import defpackage.q4o0;
import defpackage.u4o0;
import defpackage.ubn0;
import defpackage.v4o0;
import defpackage.vbn0;
import defpackage.w511;
import defpackage.w5n0;
import defpackage.x5n0;
import defpackage.y5n0;
import defpackage.z5n0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lz5n0;", "cardState", "Lw4o0;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lz5n0;)Lw4o0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.domain.ScootersOnParkingInteractor$listenToScootersOnParking$1", f = "ScootersOnParkingInteractor.kt", l = {24}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersOnParkingInteractor$listenToScootersOnParking$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOnParkingInteractor$listenToScootersOnParking$1(h hVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = hVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersOnParkingInteractor$listenToScootersOnParking$1 scootersOnParkingInteractor$listenToScootersOnParking$1 = new ScootersOnParkingInteractor$listenToScootersOnParking$1(this.this$0, (Continuation) obj3);
        scootersOnParkingInteractor$listenToScootersOnParking$1.L$0 = (z5n0) obj2;
        return scootersOnParkingInteractor$listenToScootersOnParking$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        z5n0 z5n0Var = (z5n0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.go.scooters.offers.v2.domain.mapper.b bVar = this.this$0.b;
        this.L$0 = null;
        this.label = 1;
        q4o0 q4o0Var = bVar.c;
        if (z5n0Var instanceof x5n0) {
            obj2 = q4o0Var.a() instanceof l4o0 ? new u4o0(true) : new u4o0(false);
        } else {
            boolean z = z5n0Var instanceof y5n0;
            v4o0 v4o0Var = v4o0.a;
            if (z) {
                vbn0 vbn0Var = ((y5n0) z5n0Var).j;
                o4o0 a = q4o0Var.a();
                l4o0 l4o0Var = a instanceof l4o0 ? (l4o0) a : null;
                if (vbn0Var instanceof ubn0) {
                    obj2 = bVar.a((ubn0) vbn0Var, l4o0Var != null ? l4o0Var.e : false, this);
                }
            } else if (!(z5n0Var instanceof w5n0)) {
                w511.b();
                return null;
            }
            obj2 = v4o0Var;
        }
        return obj2 == coroutineSingletons ? coroutineSingletons : obj2;
    }
}
