package com.yandex.go.telemetry.domain;

import com.yandex.mob.p;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.slc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.telemetry.domain.TraceRouteInteractor$traceRoute$2", f = "TraceRouteInteractor.kt", l = {18}, m = "invokeSuspend", v = 2)
/* loaded from: classes15.dex */
final class TraceRouteInteractor$traceRoute$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $hostName;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TraceRouteInteractor$traceRoute$2(String str, Continuation continuation) {
        super(2, continuation);
        this.$hostName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TraceRouteInteractor$traceRoute$2(this.$hostName, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TraceRouteInteractor$traceRoute$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                String str = this.$hostName;
                this.label = 1;
                obj = p.a(str, this);
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
            return ((slc) obj).b;
        } catch (Throwable th) {
            String message = th.getMessage();
            return message == null ? "" : message;
        }
    }
}
