package com.yandex.go.masstransit.sdk.order.impl.orders;

import defpackage.bvf0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r1e0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitOrdersRepository$requestActiveOrders$2", f = "MasstransitOrdersRepository.kt", l = {65, 66}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class MasstransitOrdersRepository$requestActiveOrders$2 extends SuspendLambda implements wls {
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasstransitOrdersRepository$requestActiveOrders$2(k kVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MasstransitOrdersRepository$requestActiveOrders$2 masstransitOrdersRepository$requestActiveOrders$2 = new MasstransitOrdersRepository$requestActiveOrders$2(this.this$0, continuation);
        masstransitOrdersRepository$requestActiveOrders$2.L$0 = obj;
        return masstransitOrdersRepository$requestActiveOrders$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MasstransitOrdersRepository$requestActiveOrders$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (kotlinx.coroutines.a.i(r6, r8) == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0066, code lost:
    
        if (r2.b != null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0049 -> B:6:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005b -> B:6:0x005e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r1e0 r1e0Var;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r1e0Var = (r1e0) this.L$1;
                kotlin.b.b(obj);
                if (bvf0.D(tseVar)) {
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
            r1e0Var = (r1e0) obj;
            if (r1e0Var != null) {
                Long l = r1e0Var.b;
                if (l != null) {
                    long longValue = l.longValue();
                    this.L$0 = tseVar;
                    this.L$1 = r1e0Var;
                    this.J$0 = longValue;
                    this.label = 2;
                }
                if (bvf0.D(tseVar)) {
                }
            }
            return zy11.a;
        }
        kotlin.b.b(obj);
        k kVar = this.this$0;
        this.L$0 = tseVar;
        this.L$1 = null;
        this.label = 1;
        kVar.getClass();
        sjh sjhVar = uyj.a;
        obj = tje.k0(mdh.b, new MasstransitOrdersRepository$requestOrders$2(kVar, null), this);
    }
}
