package com.yandex.go.pin.repository;

import defpackage.e1c0;
import defpackage.f1c0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lru/yandex/taxi/widget/map/SourceOnMapControl$a;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pin.repository.MainScreenPinV2DataRepositoryImpl$stateFlow$1", f = "MainScreenPinV2DataRepositoryImpl.kt", l = {HProv.ALG_SID_KECCAK_224, HProv.ALG_SID_KECCAK_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MainScreenPinV2DataRepositoryImpl$stateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $inMoveFlow;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainScreenPinV2DataRepositoryImpl$stateFlow$1(a0 a0Var, tpr tprVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = a0Var;
        this.$inMoveFlow = tprVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MainScreenPinV2DataRepositoryImpl$stateFlow$1 mainScreenPinV2DataRepositoryImpl$stateFlow$1 = new MainScreenPinV2DataRepositoryImpl$stateFlow$1(this.this$0, this.$inMoveFlow, continuation);
        mainScreenPinV2DataRepositoryImpl$stateFlow$1.L$0 = obj;
        return mainScreenPinV2DataRepositoryImpl$stateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MainScreenPinV2DataRepositoryImpl$stateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r9, r0, r8) == r1) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a0 a0Var;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a0 a0Var2 = this.this$0;
            f1c0 f1c0Var = a0Var2.d;
            this.L$0 = null;
            this.L$1 = vprVar;
            this.L$2 = a0Var2;
            this.label = 1;
            Object a = f1c0Var.a(this);
            if (a != coroutineSingletons) {
                a0Var = a0Var2;
                obj = a;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                return zy11.a;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        a0 a0Var3 = (a0) this.L$2;
        vpr vprVar2 = (vpr) this.L$1;
        kotlin.b.b(obj);
        a0Var = a0Var3;
        vprVar = vprVar2;
        tpr tprVar = this.$inMoveFlow;
        a0Var.getClass();
        kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(tprVar, new MainScreenPinV2DataRepositoryImpl$stateFlow$$inlined$flatMapLatest$1(null, a0Var, (e1c0) obj));
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
    }
}
