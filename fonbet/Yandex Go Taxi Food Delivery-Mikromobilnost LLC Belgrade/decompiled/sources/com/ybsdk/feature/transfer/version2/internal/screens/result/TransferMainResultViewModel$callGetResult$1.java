package com.ybsdk.feature.transfer.version2.internal.screens.result;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qk01;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.result.TransferMainResultViewModel$callGetResult$1", f = "TransferMainResultViewModel.kt", l = {318, 318}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransferMainResultViewModel$callGetResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $transferId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferMainResultViewModel$callGetResult$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$transferId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransferMainResultViewModel$callGetResult$1 transferMainResultViewModel$callGetResult$1 = new TransferMainResultViewModel$callGetResult$1(this.this$0, this.$transferId, continuation);
        transferMainResultViewModel$callGetResult$1.L$0 = obj;
        return transferMainResultViewModel$callGetResult$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransferMainResultViewModel$callGetResult$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        if (((defpackage.tpr) r9).collect(r4, r8) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r9 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tse tseVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tseVar = (tse) this.L$0;
            a aVar = this.this$0;
            com.ybsdk.feature.transfer.version2.internal.domain.b bVar = aVar.N;
            String str = this.$transferId;
            boolean z = aVar.P;
            String referrer = aVar.B.getReferrer();
            this.L$0 = tseVar;
            this.label = 1;
            obj = bVar.b(str, referrer, this, z);
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tseVar = (tse) this.L$0;
            b.b(obj);
        }
        qk01 qk01Var = new qk01(this.this$0, tseVar);
        this.L$0 = null;
        this.label = 2;
    }
}
