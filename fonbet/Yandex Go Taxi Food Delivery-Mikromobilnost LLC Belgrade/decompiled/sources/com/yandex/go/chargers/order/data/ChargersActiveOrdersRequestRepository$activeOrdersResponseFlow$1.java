package com.yandex.go.chargers.order.data;

import com.yandex.go.chargers.data.f;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrdersResponse;
import defpackage.cmt;
import defpackage.fmt;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lkotlin/Result;", "Lfmt;", "Lcom/yandex/go/chargers/order/data/model/ChargersActiveOrdersResponse;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.data.ChargersActiveOrdersRequestRepository$activeOrdersResponseFlow$1", f = "ChargersActiveOrdersRequestRepository.kt", l = {32, 35, 36}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class ChargersActiveOrdersRequestRepository$activeOrdersResponseFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersActiveOrdersRequestRepository$activeOrdersResponseFlow$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersActiveOrdersRequestRepository$activeOrdersResponseFlow$1 chargersActiveOrdersRequestRepository$activeOrdersResponseFlow$1 = new ChargersActiveOrdersRequestRepository$activeOrdersResponseFlow$1(this.this$0, continuation);
        chargersActiveOrdersRequestRepository$activeOrdersResponseFlow$1.L$0 = obj;
        return chargersActiveOrdersRequestRepository$activeOrdersResponseFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersActiveOrdersRequestRepository$activeOrdersResponseFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        if (r0.emit(r2, r8) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r9 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (kotlinx.coroutines.flow.e.y(r2, r8) == r1) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            mth mthVar = new mth(this.this$0.a.a(), 6);
            this.L$0 = vprVar;
            this.label = 1;
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
            Result result = new Result((fmt) obj);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        ChargersActiveOrdersApi chargersActiveOrdersApi = (ChargersActiveOrdersApi) this.this$0.b.get();
        this.this$0.c.getClass();
        cmt<ChargersActiveOrdersResponse> a = chargersActiveOrdersApi.a(f.e());
        this.L$0 = vprVar;
        this.label = 2;
        obj = a.a(this);
    }
}
