package com.yandex.go.taxi.order.queue.mapper;

import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$QueueSearch;
import com.yandex.go.taxi.order.queue.presentation.QueueInitialState;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.dkg0;
import defpackage.gkg0;
import defpackage.kkg0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ldkg0;", "<anonymous>", "(Ltse;)Ldkg0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.queue.mapper.QueueInfoToModelMapper$map$2", f = "QueueInfoToModelMapper.kt", l = {47, 48, 49, 50, SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class QueueInfoToModelMapper$map$2 extends SuspendLambda implements wls {
    final /* synthetic */ SearchInfoResponse$QueueSearch.QueueInfo $info;
    final /* synthetic */ QueueInitialState $initialState;
    final /* synthetic */ o2y0 $orderHolder;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueueInfoToModelMapper$map$2(o2y0 o2y0Var, QueueInitialState queueInitialState, SearchInfoResponse$QueueSearch.QueueInfo queueInfo, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$orderHolder = o2y0Var;
        this.$initialState = queueInitialState;
        this.$info = queueInfo;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        QueueInfoToModelMapper$map$2 queueInfoToModelMapper$map$2 = new QueueInfoToModelMapper$map$2(this.$orderHolder, this.$initialState, this.$info, this.this$0, continuation);
        queueInfoToModelMapper$map$2.L$0 = obj;
        return queueInfoToModelMapper$map$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QueueInfoToModelMapper$map$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0188, code lost:
    
        if (r7 == r2) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01d1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        o2y0 o2y0Var;
        Object s;
        noh nohVar;
        noh nohVar2;
        noh nohVar3;
        QueueInitialState queueInitialState;
        kkg0 kkg0Var;
        Object k;
        Object k2;
        QueueInitialState queueInitialState2;
        kkg0 kkg0Var2;
        Object k3;
        kkg0 kkg0Var3;
        kkg0 kkg0Var4;
        kkg0 kkg0Var5;
        Object k4;
        kkg0 kkg0Var6;
        kkg0 kkg0Var7;
        kkg0 kkg0Var8;
        o2y0 o2y0Var2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new QueueInfoToModelMapper$map$2$mainScreen$1(this.this$0, this.$info, null), 3);
            h = tje.h(tseVar, null, null, new QueueInfoToModelMapper$map$2$confirmScreen$1(this.this$0, this.$info, null), 3);
            qoh h3 = tje.h(tseVar, null, null, new QueueInfoToModelMapper$map$2$updateScreen$1(this.this$0, this.$info, null), 3);
            qoh h4 = tje.h(tseVar, null, null, new QueueInfoToModelMapper$map$2$confirmErrorScreen$1(this.this$0, this.$info, null), 3);
            qoh h5 = tje.h(tseVar, null, null, new QueueInfoToModelMapper$map$2$notification$1(this.this$0, this.$info, null), 3);
            o2y0Var = this.$orderHolder;
            QueueInitialState queueInitialState3 = this.$initialState;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = h3;
            this.L$4 = h4;
            this.L$5 = h5;
            this.L$6 = o2y0Var;
            this.L$7 = queueInitialState3;
            this.label = 1;
            s = h2.s(this);
            if (s != coroutineSingletons) {
                nohVar = h3;
                nohVar2 = h4;
                nohVar3 = h5;
                queueInitialState = queueInitialState3;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                kkg0 kkg0Var9 = (kkg0) this.L$8;
                QueueInitialState queueInitialState4 = (QueueInitialState) this.L$7;
                o2y0 o2y0Var3 = (o2y0) this.L$6;
                nohVar3 = (noh) this.L$5;
                nohVar2 = (noh) this.L$4;
                nohVar = (noh) this.L$3;
                b.b(obj);
                kkg0Var = kkg0Var9;
                queueInitialState = queueInitialState4;
                o2y0Var = o2y0Var3;
                k = obj;
                kkg0 kkg0Var10 = (kkg0) k;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = nohVar2;
                this.L$5 = nohVar3;
                this.L$6 = o2y0Var;
                this.L$7 = queueInitialState;
                this.L$8 = kkg0Var;
                this.L$9 = kkg0Var10;
                this.label = 3;
                k2 = nohVar.k(this);
                if (k2 != coroutineSingletons) {
                    queueInitialState2 = queueInitialState;
                    kkg0Var2 = kkg0Var10;
                    kkg0 kkg0Var11 = (kkg0) k2;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = nohVar3;
                    this.L$6 = o2y0Var;
                    this.L$7 = queueInitialState2;
                    this.L$8 = kkg0Var;
                    this.L$9 = kkg0Var2;
                    this.L$10 = kkg0Var11;
                    this.label = 4;
                    k3 = nohVar2.k(this);
                    if (k3 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i == 3) {
                kkg0Var2 = (kkg0) this.L$9;
                kkg0Var = (kkg0) this.L$8;
                QueueInitialState queueInitialState5 = (QueueInitialState) this.L$7;
                o2y0 o2y0Var4 = (o2y0) this.L$6;
                nohVar3 = (noh) this.L$5;
                nohVar2 = (noh) this.L$4;
                b.b(obj);
                o2y0Var = o2y0Var4;
                queueInitialState2 = queueInitialState5;
                k2 = obj;
                kkg0 kkg0Var112 = (kkg0) k2;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = nohVar3;
                this.L$6 = o2y0Var;
                this.L$7 = queueInitialState2;
                this.L$8 = kkg0Var;
                this.L$9 = kkg0Var2;
                this.L$10 = kkg0Var112;
                this.label = 4;
                k3 = nohVar2.k(this);
                if (k3 != coroutineSingletons) {
                    kkg0 kkg0Var12 = kkg0Var;
                    kkg0Var3 = kkg0Var2;
                    kkg0Var4 = kkg0Var112;
                    kkg0Var5 = kkg0Var12;
                    kkg0 kkg0Var13 = (kkg0) k3;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = o2y0Var;
                    this.L$7 = queueInitialState2;
                    this.L$8 = kkg0Var5;
                    this.L$9 = kkg0Var3;
                    this.L$10 = kkg0Var4;
                    this.L$11 = kkg0Var13;
                    this.label = 5;
                    k4 = nohVar3.k(this);
                    if (k4 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i != 4) {
                if (i != 5) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kkg0 kkg0Var14 = (kkg0) this.L$11;
                kkg0 kkg0Var15 = (kkg0) this.L$10;
                kkg0Var3 = (kkg0) this.L$9;
                kkg0 kkg0Var16 = (kkg0) this.L$8;
                QueueInitialState queueInitialState6 = (QueueInitialState) this.L$7;
                o2y0Var2 = (o2y0) this.L$6;
                b.b(obj);
                kkg0Var7 = kkg0Var14;
                kkg0Var6 = kkg0Var15;
                kkg0Var8 = kkg0Var16;
                queueInitialState2 = queueInitialState6;
                k4 = obj;
                return new dkg0(o2y0Var2, queueInitialState2, kkg0Var8, kkg0Var3, kkg0Var6, kkg0Var7, (gkg0) k4, this.$info.f);
            }
            kkg0Var4 = (kkg0) this.L$10;
            kkg0Var3 = (kkg0) this.L$9;
            kkg0 kkg0Var17 = (kkg0) this.L$8;
            QueueInitialState queueInitialState7 = (QueueInitialState) this.L$7;
            o2y0 o2y0Var5 = (o2y0) this.L$6;
            nohVar3 = (noh) this.L$5;
            b.b(obj);
            o2y0Var = o2y0Var5;
            queueInitialState2 = queueInitialState7;
            kkg0Var5 = kkg0Var17;
            k3 = obj;
            kkg0 kkg0Var132 = (kkg0) k3;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = o2y0Var;
            this.L$7 = queueInitialState2;
            this.L$8 = kkg0Var5;
            this.L$9 = kkg0Var3;
            this.L$10 = kkg0Var4;
            this.L$11 = kkg0Var132;
            this.label = 5;
            k4 = nohVar3.k(this);
            if (k4 != coroutineSingletons) {
                kkg0Var6 = kkg0Var4;
                kkg0Var7 = kkg0Var132;
                kkg0Var8 = kkg0Var5;
                o2y0Var2 = o2y0Var;
                return new dkg0(o2y0Var2, queueInitialState2, kkg0Var8, kkg0Var3, kkg0Var6, kkg0Var7, (gkg0) k4, this.$info.f);
            }
            return coroutineSingletons;
        }
        queueInitialState = (QueueInitialState) this.L$7;
        o2y0 o2y0Var6 = (o2y0) this.L$6;
        nohVar3 = (noh) this.L$5;
        nohVar2 = (noh) this.L$4;
        nohVar = (noh) this.L$3;
        h = (noh) this.L$2;
        b.b(obj);
        o2y0Var = o2y0Var6;
        s = obj;
        kkg0Var = (kkg0) s;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = nohVar;
        this.L$4 = nohVar2;
        this.L$5 = nohVar3;
        this.L$6 = o2y0Var;
        this.L$7 = queueInitialState;
        this.L$8 = kkg0Var;
        this.label = 2;
        k = h.k(this);
    }
}
