package com.yandex.go.safety.center.analytics;

import defpackage.abb1;
import defpackage.cmt;
import defpackage.jst;
import defpackage.kdx;
import defpackage.mvg;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.analytics.SafetyCenterEventsReporter$reportToAntifraud$1", f = "SafetyCenterEventsReporter.kt", l = {288, 298}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterEventsReporter$reportToAntifraud$1 extends SuspendLambda implements wls {
    final /* synthetic */ n20 $activeOrdersProvider;
    final /* synthetic */ SafetyCenterEventsReporter$AntifraudEvent $event;
    final /* synthetic */ String $userId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterEventsReporter$reportToAntifraud$1(n20 n20Var, SafetyCenterEventsReporter$AntifraudEvent safetyCenterEventsReporter$AntifraudEvent, String str, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$activeOrdersProvider = n20Var;
        this.$event = safetyCenterEventsReporter$AntifraudEvent;
        this.$userId = str;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterEventsReporter$reportToAntifraud$1(this.$activeOrdersProvider, this.$event, this.$userId, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterEventsReporter$reportToAntifraud$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        if (ru.yandex.taxi.network.api.a.a(r8, null, r7) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0030, code lost:
    
        if (r8 == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.l(jst.e, "SafetyCenterEventsReporter", null, th, "Can't send safety center's metrica data to backend", 2);
        }
        if (i == 0) {
            b.b(obj);
            n20 n20Var = this.$activeOrdersProvider;
            this.label = 1;
            obj = ((com.yandex.go.taxi.order.provider.a) n20Var).t(this);
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
        o2y0 o2y0Var = (o2y0) obj;
        String str = o2y0Var != null ? o2y0Var.b().a : null;
        SafetyCenterEventsReporter$AntifraudEvent safetyCenterEventsReporter$AntifraudEvent = this.$event;
        String str2 = this.$userId;
        kdx kdxVar = new kdx();
        abb1.d(kdxVar, DatabaseHelper.OttTrackingTable.COLUMN_EVENT, safetyCenterEventsReporter$AntifraudEvent.getValue());
        abb1.d(kdxVar, "user_id", str2);
        if (str != null) {
            abb1.d(kdxVar, "order_id", str);
        }
        cmt<zy11> b = this.this$0.b.b(kdxVar.a());
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
