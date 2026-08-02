package com.yandex.go.order.external.tracking;

import defpackage.cne0;
import defpackage.dsg;
import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qrq0;
import defpackage.ren;
import defpackage.tse;
import defpackage.vms;
import defpackage.wls;
import defpackage.y7u;
import defpackage.zy11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.order.external.tracking.ExternalServiceOrdersTrackingRepositoryImpl$updateOrders$1", f = "ExternalServiceOrdersTrackingRepositoryImpl.kt", l = {245, HProv.PP_SECURITY_LEVEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ExternalServiceOrdersTrackingRepositoryImpl$updateOrders$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $activeOrdersChanged;
    final /* synthetic */ boolean $orderRemoved;
    final /* synthetic */ List<ren> $orders;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    boolean Z$1;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalServiceOrdersTrackingRepositoryImpl$updateOrders$1(h hVar, List list, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$orders = list;
        this.$activeOrdersChanged = z;
        this.$orderRemoved = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExternalServiceOrdersTrackingRepositoryImpl$updateOrders$1(this.this$0, this.$orders, this.$activeOrdersChanged, this.$orderRemoved, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExternalServiceOrdersTrackingRepositoryImpl$updateOrders$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
    
        if (r1.a(r10) == r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b6 A[Catch: all -> 0x001d, TRY_ENTER, TryCatch #1 {all -> 0x001d, blocks: (B:7:0x0019, B:8:0x007d, B:11:0x00b6, B:13:0x00bd), top: B:6:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00bd A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #1 {all -> 0x001d, blocks: (B:7:0x0019, B:8:0x007d, B:11:0x00b6, B:13:0x00bd), top: B:6:0x0019 }] */
    /* JADX WARN: Type inference failed for: r8v3, types: [g050] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        h hVar;
        kotlinx.coroutines.sync.a aVar;
        List<ren> list;
        boolean z;
        boolean z2;
        g050 g050Var;
        h hVar2;
        boolean z3;
        boolean z4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                hVar = this.this$0;
                aVar = hVar.n;
                list = this.$orders;
                z = this.$activeOrdersChanged;
                z2 = this.$orderRemoved;
                this.L$0 = aVar;
                this.L$1 = hVar;
                this.L$2 = list;
                this.Z$0 = z;
                this.Z$1 = z2;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z3 = this.Z$1;
                    z4 = this.Z$0;
                    hVar2 = (h) this.L$1;
                    g050Var = (g050) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        List list2 = (List) obj;
                        hVar2.d.b(list2);
                        hVar2.h.a(list2);
                        hVar2.o.l(list2);
                        qrq0 qrq0Var = y7u.b;
                        ArrayList g = vms.g(list2, new dsg(18));
                        cne0 cne0Var = hVar2.k.a;
                        cne0Var.u("eats", true ^ g.isEmpty());
                        cne0Var.r("eats_statuses", vms.e("eats", g));
                        zy11 zy11Var = zy11.a;
                        if (z4) {
                            hVar2.p.g(zy11Var);
                        }
                        if (z3) {
                            hVar2.q.g(zy11Var);
                        }
                        g050Var.d(null);
                        return zy11Var;
                    } catch (Throwable th) {
                        th = th;
                        g050Var.d(null);
                        throw th;
                    }
                }
                boolean z5 = this.Z$1;
                z = this.Z$0;
                list = (List) this.L$2;
                h hVar3 = (h) this.L$1;
                ?? r8 = (g050) this.L$0;
                kotlin.b.b(obj);
                hVar = hVar3;
                z2 = z5;
                aVar = r8;
            }
            com.yandex.go.order.external.b bVar = hVar.i;
            List b = hVar.j.b(list);
            this.L$0 = aVar;
            this.L$1 = hVar;
            this.L$2 = null;
            this.Z$0 = z;
            this.Z$1 = z2;
            this.label = 2;
            Serializable a = bVar.a(b, this);
            if (a != coroutineSingletons) {
                hVar2 = hVar;
                z3 = z2;
                obj = a;
                g050Var = aVar;
                z4 = z;
                List list22 = (List) obj;
                hVar2.d.b(list22);
                hVar2.h.a(list22);
                hVar2.o.l(list22);
                qrq0 qrq0Var2 = y7u.b;
                ArrayList g2 = vms.g(list22, new dsg(18));
                cne0 cne0Var2 = hVar2.k.a;
                cne0Var2.u("eats", true ^ g2.isEmpty());
                cne0Var2.r("eats_statuses", vms.e("eats", g2));
                zy11 zy11Var2 = zy11.a;
                if (z4) {
                }
                if (z3) {
                }
                g050Var.d(null);
                return zy11Var2;
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            g050Var = aVar;
            g050Var.d(null);
            throw th;
        }
    }
}
