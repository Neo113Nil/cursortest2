package com.yandex.go.chargers.passes.ui;

import com.yandex.go.chargers.passes.data.r0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "Lfka;", "Lzy11;", "it", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;V)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.passes.ui.ChargersPassesUiStateInteractor$passResultFlow$skeletonRefresh$1", f = "ChargersPassesUiStateInteractor.kt", l = {HProv.ALG_SID_GR3410_12_256, 74, 74}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersPassesUiStateInteractor$passResultFlow$skeletonRefresh$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPassesUiStateInteractor$passResultFlow$skeletonRefresh$1(d dVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChargersPassesUiStateInteractor$passResultFlow$skeletonRefresh$1 chargersPassesUiStateInteractor$passResultFlow$skeletonRefresh$1 = new ChargersPassesUiStateInteractor$passResultFlow$skeletonRefresh$1(this.this$0, (Continuation) obj3);
        chargersPassesUiStateInteractor$passResultFlow$skeletonRefresh$1.L$0 = (vpr) obj;
        return chargersPassesUiStateInteractor$passResultFlow$skeletonRefresh$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (r8 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if (r0.emit(null, r7) == r1) goto L20;
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
            this.L$0 = vprVar;
            this.label = 1;
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$1;
            kotlin.b.b(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        r0 r0Var = this.this$0.a;
        this.L$0 = null;
        this.L$1 = vprVar;
        this.label = 2;
        obj = r0Var.d(this);
    }
}
