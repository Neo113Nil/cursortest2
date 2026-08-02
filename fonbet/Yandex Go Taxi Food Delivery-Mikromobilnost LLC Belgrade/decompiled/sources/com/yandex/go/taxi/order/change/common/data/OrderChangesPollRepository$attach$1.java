package com.yandex.go.taxi.order.change.common.data;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.a3y0;
import defpackage.hst;
import defpackage.io70;
import defpackage.ist;
import defpackage.jst;
import defpackage.ke00;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.tb9;
import defpackage.tse;
import defpackage.v4r0;
import defpackage.wls;
import defpackage.ye60;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i0;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.common.data.OrderChangesPollRepository$attach$1", f = "OrderChangesPollRepository.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, 82}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderChangesPollRepository$attach$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lnoh;", "Lio70;", "it", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.change.common.data.OrderChangesPollRepository$attach$1$3", f = "OrderChangesPollRepository.kt", l = {71, 72}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.change.common.data.OrderChangesPollRepository$attach$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(d dVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((List) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x008e, code lost:
        
            if (com.yandex.go.taxi.order.change.common.data.d.b(r6, r0, r9) != r1) goto L7;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008e -> B:6:0x0028). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            d dVar;
            Iterator it;
            d dVar2;
            Iterator it2;
            io70 io70Var;
            Object value;
            List list = (List) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                dVar = this.this$0;
                it = list.iterator();
                if (it.hasNext()) {
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    io70Var = (io70) this.L$6;
                    it2 = (Iterator) this.L$3;
                    dVar2 = (d) this.L$2;
                    kotlin.b.b(obj);
                    dVar = dVar2;
                    tb9 payload = io70Var.getPayload();
                    dVar.i.remove(payload.b);
                    r0 r0Var = dVar.h;
                    do {
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, v4r0.f((Set) value, payload)));
                    it = it2;
                    if (it.hasNext()) {
                        return zy11.a;
                    }
                    noh nohVar = (noh) it.next();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = dVar;
                    this.L$3 = it;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.label = 1;
                    Object k = nohVar.k(this);
                    if (k != coroutineSingletons) {
                        dVar2 = dVar;
                        obj = k;
                        it2 = it;
                        io70Var = (io70) obj;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = dVar2;
                        this.L$3 = it2;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = io70Var;
                        this.label = 2;
                    }
                    return coroutineSingletons;
                }
                it = (Iterator) this.L$3;
                d dVar3 = (d) this.L$2;
                kotlin.b.b(obj);
                dVar2 = dVar3;
                it2 = it;
                io70Var = (io70) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = dVar2;
                this.L$3 = it2;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = io70Var;
                this.label = 2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderChangesPollRepository$attach$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OrderChangesPollRepository$attach$1 orderChangesPollRepository$attach$1 = new OrderChangesPollRepository$attach$1(this.this$0, continuation);
        orderChangesPollRepository$attach$1.L$0 = obj;
        return orderChangesPollRepository$attach$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderChangesPollRepository$attach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0032, code lost:
    
        if (com.yandex.go.taxi.order.change.common.data.d.a(r14, r13) == r1) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            this.L$0 = tseVar;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        String Hg = this.this$0.c.Hg();
        if (Hg == null || Hg.length() == 0) {
            a3y0 a3y0Var = this.this$0.f;
            String l = a3y0Var.l(new String[]{"attach"});
            hst hstVar = jst.e;
            String str = a3y0Var.a;
            hstVar.getClass();
            ist m = hstVar.m(l);
            ke00 a = m.b.a();
            if (a != null && a.b(15)) {
                a.a(15, str, null, "launch_id is required to poll /changes", m.a);
            }
            return zy11Var;
        }
        d dVar2 = this.this$0;
        c cVar = new c(dVar2.h, dVar2, tseVar, Hg);
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(dVar2, null);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        Object collect = cVar.collect(new i0(ye60.a, anonymousClass3), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
