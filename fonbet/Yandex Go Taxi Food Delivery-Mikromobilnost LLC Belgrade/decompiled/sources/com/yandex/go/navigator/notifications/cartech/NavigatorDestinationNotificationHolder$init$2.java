package com.yandex.go.navigator.notifications.cartech;

import com.yandex.go.navigator.driving.DrivingModeNotification;
import defpackage.e19;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.xnt;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.notifications.cartech.NavigatorDestinationNotificationHolder$init$2", f = "NavigatorDestinationNotificationHolder.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class NavigatorDestinationNotificationHolder$init$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigatorDestinationNotificationHolder$init$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NavigatorDestinationNotificationHolder$init$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NavigatorDestinationNotificationHolder$init$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pz40 pz40Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zzs zzsVar = null;
        if (i == 0) {
            kotlin.b.b(obj);
            if (this.this$0.g.getValue() == null) {
                b bVar = this.this$0;
                r0 r0Var = bVar.g;
                this.L$0 = r0Var;
                this.label = 1;
                CartechDeeplinkPayloadDto a = bVar.c.a();
                if (a != null) {
                    obj = bVar.b.c(a, this);
                    if (obj != coroutineSingletons) {
                        obj = (DrivingModeNotification) obj;
                    }
                } else {
                    obj = null;
                }
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                pz40Var = r0Var;
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        pz40Var = (pz40) this.L$0;
        kotlin.b.b(obj);
        ((r0) pz40Var).l(obj);
        b bVar2 = this.this$0;
        e19 e19Var = bVar2.d;
        String l = e19Var.b.a().l("cartech_geo_point_key", null);
        if (l != null && l.length() != 0) {
            zzsVar = (zzs) ((xnt) e19Var.a).c(l, zzs.Companion.serializer());
        }
        bVar2.f = zzsVar;
        return zy11.a;
    }
}
