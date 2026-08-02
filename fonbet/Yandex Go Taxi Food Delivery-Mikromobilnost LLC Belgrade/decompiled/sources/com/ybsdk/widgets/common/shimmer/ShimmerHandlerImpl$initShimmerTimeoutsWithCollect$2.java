package com.ybsdk.widgets.common.shimmer;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.bms;
import defpackage.kur0;
import defpackage.lur0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lvpr;", "Llur0;", ClidProvider.STATE, "", "hasError", "Lzy11;", "<anonymous>", "(Lvpr;Llur0;Z)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.widgets.common.shimmer.ShimmerHandlerImpl$initShimmerTimeoutsWithCollect$2", f = "ShimmerHandlerImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShimmerHandlerImpl$initShimmerTimeoutsWithCollect$2 extends SuspendLambda implements bms {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShimmerHandlerImpl$initShimmerTimeoutsWithCollect$2(b bVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        ShimmerHandlerImpl$initShimmerTimeoutsWithCollect$2 shimmerHandlerImpl$initShimmerTimeoutsWithCollect$2 = new ShimmerHandlerImpl$initShimmerTimeoutsWithCollect$2(this.this$0, (Continuation) obj4);
        shimmerHandlerImpl$initShimmerTimeoutsWithCollect$2.L$0 = (vpr) obj;
        shimmerHandlerImpl$initShimmerTimeoutsWithCollect$2.L$1 = (lur0) obj2;
        shimmerHandlerImpl$initShimmerTimeoutsWithCollect$2.Z$0 = booleanValue;
        return shimmerHandlerImpl$initShimmerTimeoutsWithCollect$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            lur0 lur0Var = (lur0) this.L$1;
            if (this.Z$0) {
                kur0 kur0Var = new kur0(this.this$0.a);
                this.L$0 = null;
                this.label = 1;
            } else {
                this.L$0 = null;
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
