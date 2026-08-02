package com.yandex.go.superapp.unified_polling;

import com.yandex.go.superapp.unified_polling.data.dto.SuperAppOrdersPayloadDto;
import defpackage.fmt;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.ycw0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lycw0;", "<anonymous>", "(Ltse;)Lycw0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.unified_polling.UnifiedPollingRepositoryImpl$parseResponse$2", f = "UnifiedPollingRepositoryImpl.kt", l = {175, 176, 177, 178, 179}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class UnifiedPollingRepositoryImpl$parseResponse$2 extends SuspendLambda implements wls {
    final /* synthetic */ SuperAppOrdersPayloadDto $payload;
    final /* synthetic */ fmt $response;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedPollingRepositoryImpl$parseResponse$2(k kVar, SuperAppOrdersPayloadDto superAppOrdersPayloadDto, fmt fmtVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$payload = superAppOrdersPayloadDto;
        this.$response = fmtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UnifiedPollingRepositoryImpl$parseResponse$2 unifiedPollingRepositoryImpl$parseResponse$2 = new UnifiedPollingRepositoryImpl$parseResponse$2(this.this$0, this.$payload, this.$response, continuation);
        unifiedPollingRepositoryImpl$parseResponse$2.L$0 = obj;
        return unifiedPollingRepositoryImpl$parseResponse$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UnifiedPollingRepositoryImpl$parseResponse$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016f  */
    /* JADX WARN: Type inference failed for: r3v15, types: [noh] */
    /* JADX WARN: Type inference failed for: r7v8, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        qoh h2;
        noh h3;
        Object s;
        noh nohVar;
        Object k;
        noh nohVar2;
        List list;
        Object k2;
        List list2;
        List list3;
        noh nohVar3;
        Object k3;
        List list4;
        List list5;
        List list6;
        Object k4;
        List list7;
        List list8;
        List list9;
        List list10;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h4 = tje.h(tseVar, null, null, new UnifiedPollingRepositoryImpl$parseResponse$2$eatsOrders$1(this.this$0, this.$payload, null), 3);
            h = tje.h(tseVar, null, null, new UnifiedPollingRepositoryImpl$parseResponse$2$scootersOrders$1(this.this$0, this.$payload, null), 3);
            qoh h5 = tje.h(tseVar, null, null, new UnifiedPollingRepositoryImpl$parseResponse$2$chargerOrders$1(this.this$0, this.$response, null), 3);
            h2 = tje.h(tseVar, null, null, new UnifiedPollingRepositoryImpl$parseResponse$2$driveOrders$1(this.this$0, this.$payload, null), 3);
            h3 = tje.h(tseVar, null, null, new UnifiedPollingRepositoryImpl$parseResponse$2$deliveryOrders$1(this.this$0, this.$payload, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = h5;
            this.L$4 = h2;
            this.L$5 = h3;
            this.label = 1;
            s = h4.s(this);
            if (s != coroutineSingletons) {
                nohVar = h5;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                list = (List) this.L$6;
                nohVar2 = (noh) this.L$5;
                ?? r7 = (noh) this.L$4;
                nohVar = (noh) this.L$3;
                kotlin.b.b(obj);
                h2 = r7;
                k = obj;
                List list11 = (List) k;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = nohVar;
                this.L$4 = null;
                this.L$5 = nohVar2;
                this.L$6 = list;
                this.L$7 = list11;
                this.label = 3;
                k2 = h2.k(this);
                if (k2 != coroutineSingletons) {
                    noh nohVar4 = nohVar2;
                    list2 = list;
                    list3 = list11;
                    nohVar3 = nohVar4;
                    List list12 = (List) k2;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = nohVar3;
                    this.L$6 = list2;
                    this.L$7 = list3;
                    this.L$8 = list12;
                    this.label = 4;
                    k3 = nohVar.k(this);
                    if (k3 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i == 3) {
                list3 = (List) this.L$7;
                list2 = (List) this.L$6;
                noh nohVar5 = (noh) this.L$5;
                noh nohVar6 = (noh) this.L$3;
                kotlin.b.b(obj);
                nohVar = nohVar6;
                nohVar3 = nohVar5;
                k2 = obj;
                List list122 = (List) k2;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = nohVar3;
                this.L$6 = list2;
                this.L$7 = list3;
                this.L$8 = list122;
                this.label = 4;
                k3 = nohVar.k(this);
                if (k3 != coroutineSingletons) {
                    List list13 = list2;
                    list4 = list3;
                    list5 = list122;
                    list6 = list13;
                    List list14 = (List) k3;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = list6;
                    this.L$7 = list4;
                    this.L$8 = list5;
                    this.L$9 = list14;
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
                List list15 = (List) this.L$9;
                List list16 = (List) this.L$8;
                List list17 = (List) this.L$7;
                List list18 = (List) this.L$6;
                kotlin.b.b(obj);
                k4 = obj;
                list10 = list16;
                list9 = list18;
                list7 = list17;
                list8 = list15;
                return new ycw0(list9, list8, list7, list10, (List) k4);
            }
            list5 = (List) this.L$8;
            list4 = (List) this.L$7;
            List list19 = (List) this.L$6;
            noh nohVar7 = (noh) this.L$5;
            kotlin.b.b(obj);
            nohVar3 = nohVar7;
            list6 = list19;
            k3 = obj;
            List list142 = (List) k3;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = list6;
            this.L$7 = list4;
            this.L$8 = list5;
            this.L$9 = list142;
            this.label = 5;
            k4 = nohVar3.k(this);
            if (k4 != coroutineSingletons) {
                list7 = list4;
                list8 = list142;
                list9 = list6;
                list10 = list5;
                return new ycw0(list9, list8, list7, list10, (List) k4);
            }
            return coroutineSingletons;
        }
        h3 = (noh) this.L$5;
        ?? r3 = (noh) this.L$4;
        nohVar = (noh) this.L$3;
        h = (noh) this.L$2;
        kotlin.b.b(obj);
        h2 = r3;
        s = obj;
        List list20 = (List) s;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = nohVar;
        this.L$4 = h2;
        this.L$5 = h3;
        this.L$6 = list20;
        this.label = 2;
        k = h.k(this);
        if (k != coroutineSingletons) {
            nohVar2 = h3;
            list = list20;
            List list112 = (List) k;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = nohVar;
            this.L$4 = null;
            this.L$5 = nohVar2;
            this.L$6 = list;
            this.L$7 = list112;
            this.label = 3;
            k2 = h2.k(this);
            if (k2 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
