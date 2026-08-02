package com.yandex.go.scooters.passes;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.ggo0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o0n0;
import defpackage.ss9;
import defpackage.tse;
import defpackage.u0n0;
import defpackage.udo0;
import defpackage.v0n0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.ScootersPassesDocumentRouter$onLaunch$3", f = "ScootersPassesDocumentRouter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassesDocumentRouter$onLaunch$3 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassesDocumentRouter$onLaunch$3(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPassesDocumentRouter$onLaunch$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPassesDocumentRouter$onLaunch$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c cVar;
        v0n0 v0n0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            kotlin.b.b(obj);
            cVar = this.this$0;
            v0n0 v0n0Var2 = cVar.G;
            com.yandex.go.scooters.passes.data.e eVar = cVar.H;
            ggo0 ggo0Var = cVar.O;
            this.L$0 = cVar;
            this.L$1 = v0n0Var2;
            this.label = 1;
            Object a = eVar.a(ggo0Var, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            v0n0Var = v0n0Var2;
            obj = a;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v0n0Var = (v0n0) this.L$1;
            cVar = (c) this.L$0;
            kotlin.b.b(obj);
        }
        ss9 a2 = v0n0Var.a((o0n0) obj);
        c cVar2 = this.this$0;
        ScootersPassesScreenRoute$Intention scootersPassesScreenRoute$Intention = cVar2.O.b;
        if (scootersPassesScreenRoute$Intention != ScootersPassesScreenRoute$Intention.PURCHASE && scootersPassesScreenRoute$Intention != ScootersPassesScreenRoute$Intention.ACTIVE) {
            z = false;
        }
        cVar.A(a2, new u0n0(z), new udo0(cVar2));
        return zy11.a;
    }
}
