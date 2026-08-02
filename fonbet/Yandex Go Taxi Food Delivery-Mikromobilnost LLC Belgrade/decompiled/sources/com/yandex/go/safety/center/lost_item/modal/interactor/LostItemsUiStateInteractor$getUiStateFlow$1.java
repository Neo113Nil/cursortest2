package com.yandex.go.safety.center.lost_item.modal.interactor;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.dqk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.orz;
import defpackage.ppl0;
import defpackage.qrz;
import defpackage.tpr;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Ljrz;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.lost_item.modal.interactor.LostItemsUiStateInteractor$getUiStateFlow$1", f = "LostItemsUiStateInteractor.kt", l = {47, 49, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class LostItemsUiStateInteractor$getUiStateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ dqk0 $orderId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LostItemsUiStateInteractor$getUiStateFlow$1(c cVar, dqk0 dqk0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$orderId = dqk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LostItemsUiStateInteractor$getUiStateFlow$1 lostItemsUiStateInteractor$getUiStateFlow$1 = new LostItemsUiStateInteractor$getUiStateFlow$1(this.this$0, this.$orderId, continuation);
        lostItemsUiStateInteractor$getUiStateFlow$1.L$0 = obj;
        return lostItemsUiStateInteractor$getUiStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LostItemsUiStateInteractor$getUiStateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b2, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r11, r0, r10) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (r11 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r0.emit(defpackage.irz.a, r10) == r1) goto L23;
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
            ppl0 ppl0Var = this.this$0.f;
            String str = this.$orderId.a;
            ppl0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("order_id", str);
            ppl0Var.a.a("SafetyCenter.LostItemsModalCardContent.LoadingStarted", hashMap, 1, new HashMap());
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
            qrz qrzVar = (qrz) obj;
            if (qrzVar instanceof orz) {
                ppl0 ppl0Var2 = this.this$0.f;
                String str2 = this.$orderId.a;
                ppl0Var2.getClass();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("order_id", str2);
                ppl0Var2.a.a("SafetyCenter.LostItemsModalCardContent.Loaded", hashMap2, 1, new HashMap());
            }
            c cVar = this.this$0;
            b bVar = new b(cVar.e.a(), cVar, qrzVar);
            cVar.h.getClass();
            tpr F = e.F(bVar, uyj.a);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        c cVar2 = this.this$0;
        dqk0 dqk0Var = this.$orderId;
        this.L$0 = vprVar;
        this.label = 2;
        obj = c.a(cVar2, dqk0Var, this);
    }
}
