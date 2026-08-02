package com.yandex.fintechsdk.flows.payment.kit.internal.di.paymentkit.features.bdui.action;

import defpackage.hh5;
import defpackage.i0p;
import defpackage.i3a0;
import defpackage.lz40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v2a0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.flows.payment.kit.internal.di.paymentkit.features.bdui.action.BduiActionsDelegateImpl$sendExternalEvent$2", f = "BduiActionsDelegateImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class BduiActionsDelegateImpl$sendExternalEvent$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $eventName;
    final /* synthetic */ Map<String, String> $params;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BduiActionsDelegateImpl$sendExternalEvent$2(a aVar, String str, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$eventName = str;
        this.$params = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BduiActionsDelegateImpl$sendExternalEvent$2(this.this$0, this.$eventName, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        BduiActionsDelegateImpl$sendExternalEvent$2 bduiActionsDelegateImpl$sendExternalEvent$2 = (BduiActionsDelegateImpl$sendExternalEvent$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        bduiActionsDelegateImpl$sendExternalEvent$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        hh5 hh5Var = this.this$0.d;
        i3a0 i3a0Var = new i3a0(this.$eventName, this.$params);
        hh5Var.getClass();
        i0p i0pVar = com.yandex.fintechsdk.flows.payment.kit.internal.model.a.k;
        lz40 lz40Var = (lz40) i0pVar.a.get(((v2a0) hh5Var.b).a);
        if (lz40Var != null) {
            lz40Var.g(i3a0Var);
        }
        return zy11.a;
    }
}
