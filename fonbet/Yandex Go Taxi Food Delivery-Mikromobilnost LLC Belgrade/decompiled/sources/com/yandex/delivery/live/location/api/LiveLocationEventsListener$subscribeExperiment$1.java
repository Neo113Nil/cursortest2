package com.yandex.delivery.live.location.api;

import defpackage.ha2;
import defpackage.hvy;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhvy;", "experiment", "Lzy11;", "<anonymous>", "(Lhvy;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "com.yandex.delivery.live.location.api.LiveLocationEventsListener$subscribeExperiment$1", f = "LiveLocationEventsListener.kt", l = {MSException.ERROR_INVALID_PARAMETER, 90}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class LiveLocationEventsListener$subscribeExperiment$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveLocationEventsListener$subscribeExperiment$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LiveLocationEventsListener$subscribeExperiment$1 liveLocationEventsListener$subscribeExperiment$1 = new LiveLocationEventsListener$subscribeExperiment$1(this.this$0, continuation);
        liveLocationEventsListener$subscribeExperiment$1.L$0 = obj;
        return liveLocationEventsListener$subscribeExperiment$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LiveLocationEventsListener$subscribeExperiment$1) create((hvy) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r7.a(true, r6) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        if (r7 == r1) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        hvy hvyVar = (hvy) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ha2 ha2Var = this.this$0.a.b;
            this.L$0 = hvyVar;
            this.label = 1;
            obj = e.y(ha2Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11.a;
            }
            b.b(obj);
        }
        Boolean bool = (Boolean) obj;
        if (hvyVar.a && bool == null && this.this$0.d.d()) {
            com.yandex.delivery.live.location.impl.repository.b bVar = this.this$0.a;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
        }
        return zy11.a;
    }
}
