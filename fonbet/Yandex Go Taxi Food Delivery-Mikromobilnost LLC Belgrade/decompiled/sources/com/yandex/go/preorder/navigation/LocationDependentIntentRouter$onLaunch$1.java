package com.yandex.go.preorder.navigation;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t7z;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.xpy;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.navigation.LocationDependentIntentRouter$onLaunch$1", f = "LocationDependentIntentRouter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class LocationDependentIntentRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ t7z $model;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationDependentIntentRouter$onLaunch$1(a aVar, t7z t7zVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$model = t7zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocationDependentIntentRouter$onLaunch$1(this.this$0, this.$model, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationDependentIntentRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                a aVar2 = this.this$0;
                t7z t7zVar = this.$model;
                try {
                    this.L$0 = aVar2;
                    this.label = 1;
                    if (a.P(aVar2, t7zVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    aVar = aVar2;
                    xby.l(jst.e, "INTENT_PROCESSOR_ERROR:FAILED", null, th, "Failed to process location deeplink", 2);
                    aVar.Q(new xpy(25));
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = (a) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    xby.l(jst.e, "INTENT_PROCESSOR_ERROR:FAILED", null, th, "Failed to process location deeplink", 2);
                    aVar.Q(new xpy(25));
                    return zy11.a;
                }
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
