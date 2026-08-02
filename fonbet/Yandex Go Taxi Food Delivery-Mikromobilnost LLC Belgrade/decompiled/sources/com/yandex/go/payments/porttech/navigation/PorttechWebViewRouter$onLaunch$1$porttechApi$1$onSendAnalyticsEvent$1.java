package com.yandex.go.payments.porttech.navigation;

import defpackage.aq80;
import defpackage.g8e;
import defpackage.k52;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sh41;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.analytics.j;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.porttech.navigation.PorttechWebViewRouter$onLaunch$1$porttechApi$1$onSendAnalyticsEvent$1", f = "PorttechWebViewRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PorttechWebViewRouter$onLaunch$1$porttechApi$1$onSendAnalyticsEvent$1 extends SuspendLambda implements wls {
    final /* synthetic */ k52 $event;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PorttechWebViewRouter$onLaunch$1$porttechApi$1$onSendAnalyticsEvent$1(d dVar, k52 k52Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$event = k52Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PorttechWebViewRouter$onLaunch$1$porttechApi$1$onSendAnalyticsEvent$1(this.this$0, this.$event, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PorttechWebViewRouter$onLaunch$1$porttechApi$1$onSendAnalyticsEvent$1 porttechWebViewRouter$onLaunch$1$porttechApi$1$onSendAnalyticsEvent$1 = (PorttechWebViewRouter$onLaunch$1$porttechApi$1$onSendAnalyticsEvent$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        porttechWebViewRouter$onLaunch$1$porttechApi$1$onSendAnalyticsEvent$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        aq80 aq80Var = this.this$0.M;
        k52 k52Var = this.$event;
        sh41 sh41Var = (sh41) aq80Var.a;
        kotlinx.serialization.json.b bVar = k52Var.b;
        boolean z = bVar instanceof kotlinx.serialization.json.c;
        String str = k52Var.a;
        if (z) {
            ((j) sh41Var).u(new k52(g8e.o("Porttech.", str), bVar));
        } else {
            ((j) sh41Var).u(new k52(g8e.o("Porttech.", str), k52Var.b));
        }
        return zy11.a;
    }
}
