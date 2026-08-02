package com.yandex.go.rida.bids.interactor;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.w511;
import defpackage.wls;
import defpackage.xr5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isExtendedUi", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.bids.interactor.BidsUiStateInteractor$settleModalWhenExtendedUiChanges$settleModalFlow$2", f = "BidsUiStateInteractor.kt", l = {54, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BidsUiStateInteractor$settleModalWhenExtendedUiChanges$settleModalFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BidsUiStateInteractor$settleModalWhenExtendedUiChanges$settleModalFlow$2(m mVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BidsUiStateInteractor$settleModalWhenExtendedUiChanges$settleModalFlow$2 bidsUiStateInteractor$settleModalWhenExtendedUiChanges$settleModalFlow$2 = new BidsUiStateInteractor$settleModalWhenExtendedUiChanges$settleModalFlow$2(this.this$0, continuation);
        bidsUiStateInteractor$settleModalWhenExtendedUiChanges$settleModalFlow$2.Z$0 = ((Boolean) obj).booleanValue();
        return bidsUiStateInteractor$settleModalWhenExtendedUiChanges$settleModalFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((BidsUiStateInteractor$settleModalWhenExtendedUiChanges$settleModalFlow$2) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r7.a.emit(defpackage.wr5.a, r6) == r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r7.a.emit(defpackage.vr5.a, r6) == r1) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (z) {
                xr5 xr5Var = this.this$0.a;
                this.Z$0 = z;
                this.label = 1;
            } else {
                if (z) {
                    w511.b();
                    return null;
                }
                xr5 xr5Var2 = this.this$0.a;
                this.Z$0 = z;
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
