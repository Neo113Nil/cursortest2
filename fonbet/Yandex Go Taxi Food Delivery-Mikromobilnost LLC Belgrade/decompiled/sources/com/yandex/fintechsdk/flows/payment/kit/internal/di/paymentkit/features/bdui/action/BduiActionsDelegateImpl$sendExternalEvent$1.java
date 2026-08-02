package com.yandex.fintechsdk.flows.payment.kit.internal.di.paymentkit.features.bdui.action;

import defpackage.lz40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.u011;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.flows.payment.kit.internal.di.paymentkit.features.bdui.action.BduiActionsDelegateImpl$sendExternalEvent$1", f = "BduiActionsDelegateImpl.kt", l = {202}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class BduiActionsDelegateImpl$sendExternalEvent$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $eventName;
    final /* synthetic */ Map<String, String> $params;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BduiActionsDelegateImpl$sendExternalEvent$1(a aVar, String str, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$eventName = str;
        this.$params = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BduiActionsDelegateImpl$sendExternalEvent$1(this.this$0, this.$eventName, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BduiActionsDelegateImpl$sendExternalEvent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            lz40 lz40Var = this.this$0.g;
            u011 u011Var = new u011(this.$eventName, this.$params);
            this.label = 1;
            if (lz40Var.emit(u011Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
