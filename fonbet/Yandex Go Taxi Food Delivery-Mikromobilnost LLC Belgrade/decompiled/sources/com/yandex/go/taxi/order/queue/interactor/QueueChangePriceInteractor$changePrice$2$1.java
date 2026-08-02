package com.yandex.go.taxi.order.queue.interactor;

import com.yandex.go.taxi.order.queue.analytics.QueueAnalytics$Status;
import com.yandex.go.taxi.order.queue.network.QueueApi;
import com.yandex.go.taxi.order.queue.network.QueueChangePriceRequest;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.cmt;
import defpackage.fkg0;
import defpackage.gkg0;
import defpackage.ljg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.queue.interactor.QueueChangePriceInteractor$changePrice$2$1", f = "QueueChangePriceInteractor.kt", l = {53, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, 56, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class QueueChangePriceInteractor$changePrice$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ gkg0 $notificationModel;
    final /* synthetic */ o2y0 $orderHolder;
    final /* synthetic */ String $orderId;
    final /* synthetic */ QueueChangePriceRequest $request;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueueChangePriceInteractor$changePrice$2$1(e eVar, String str, QueueChangePriceRequest queueChangePriceRequest, String str2, o2y0 o2y0Var, gkg0 gkg0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$idempotencyToken = str;
        this.$request = queueChangePriceRequest;
        this.$orderId = str2;
        this.$orderHolder = o2y0Var;
        this.$notificationModel = gkg0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QueueChangePriceInteractor$changePrice$2$1(this.this$0, this.$idempotencyToken, this.$request, this.$orderId, this.$orderHolder, this.$notificationModel, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QueueChangePriceInteractor$changePrice$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r15 == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        o2y0 o2y0Var;
        e eVar;
        gkg0 gkg0Var;
        Object k0;
        Object obj2;
        String str2;
        e eVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            cmt<zy11> a = ((QueueApi) this.this$0.i.getValue()).a(this.$idempotencyToken, this.$request);
            this.label = 1;
            obj = ru.yandex.taxi.network.api.a.a(a, null, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    str2 = (String) this.L$2;
                    eVar2 = (e) this.L$1;
                    obj2 = this.L$0;
                    kotlin.b.b(obj);
                    com.yandex.go.taxi.order.queue.repository.a aVar = eVar2.e;
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 4;
                    return aVar.b(str2, this) != coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                gkg0Var = (gkg0) this.L$4;
                o2y0Var = (o2y0) this.L$3;
                str = (String) this.L$2;
                eVar = (e) this.L$1;
                Object obj3 = this.L$0;
                kotlin.b.b(obj);
                obj = obj3;
                fkg0 fkg0Var = eVar.f;
                this.L$0 = obj;
                this.L$1 = eVar;
                this.L$2 = str;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 3;
                fkg0Var.e.getClass();
                sjh sjhVar = uyj.a;
                k0 = tje.k0(o400.a, new QueueNotificationInteractor$showPriceChangedNotification$2(gkg0Var, fkg0Var, o2y0Var, null), this);
                if (k0 != coroutineSingletons) {
                    k0 = zy11Var;
                }
                if (k0 != coroutineSingletons) {
                    obj2 = obj;
                    str2 = str;
                    eVar2 = eVar;
                    com.yandex.go.taxi.order.queue.repository.a aVar2 = eVar2.e;
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 4;
                    if (aVar2.b(str2, this) != coroutineSingletons) {
                    }
                }
            }
            kotlin.b.b(obj);
        }
        e eVar3 = this.this$0;
        str = this.$orderId;
        o2y0 o2y0Var2 = this.$orderHolder;
        gkg0 gkg0Var2 = this.$notificationModel;
        ljg0 ljg0Var = eVar3.d;
        QueueAnalytics$Status queueAnalytics$Status = QueueAnalytics$Status.SUCCESS;
        ljg0Var.getClass();
        ljg0Var.b("QueueOverlay.PriceUpdated", new Pair(ACSPConstants.STATUS, queueAnalytics$Status.getStatus()), new Pair(Constants.KEY_MESSAGE, null));
        com.yandex.go.taxi.order.domain.repositories.e eVar4 = eVar3.g;
        this.L$0 = obj;
        this.L$1 = eVar3;
        this.L$2 = str;
        this.L$3 = o2y0Var2;
        this.L$4 = gkg0Var2;
        this.L$5 = null;
        this.label = 2;
        if (eVar4.b(str, this) != coroutineSingletons) {
            o2y0Var = o2y0Var2;
            eVar = eVar3;
            gkg0Var = gkg0Var2;
            fkg0 fkg0Var2 = eVar.f;
            this.L$0 = obj;
            this.L$1 = eVar;
            this.L$2 = str;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.label = 3;
            fkg0Var2.e.getClass();
            sjh sjhVar2 = uyj.a;
            k0 = tje.k0(o400.a, new QueueNotificationInteractor$showPriceChangedNotification$2(gkg0Var, fkg0Var2, o2y0Var, null), this);
            if (k0 != coroutineSingletons) {
            }
            if (k0 != coroutineSingletons) {
            }
        }
    }
}
