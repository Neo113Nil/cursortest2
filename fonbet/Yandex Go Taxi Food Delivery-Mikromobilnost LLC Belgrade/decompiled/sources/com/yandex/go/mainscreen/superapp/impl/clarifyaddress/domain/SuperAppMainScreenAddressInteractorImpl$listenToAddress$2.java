package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import defpackage.kr0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lpv0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.SuperAppMainScreenAddressInteractorImpl$listenToAddress$2", f = "SuperAppMainScreenAddressInteractorImpl.kt", l = {HProv.ALG_SID_SHA3_224, HProv.ALG_SID_SHA3_256, 81}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SuperAppMainScreenAddressInteractorImpl$listenToAddress$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainScreenAddressInteractorImpl$listenToAddress$2(v vVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperAppMainScreenAddressInteractorImpl$listenToAddress$2 superAppMainScreenAddressInteractorImpl$listenToAddress$2 = new SuperAppMainScreenAddressInteractorImpl$listenToAddress$2(this.this$0, continuation);
        superAppMainScreenAddressInteractorImpl$listenToAddress$2.L$0 = obj;
        return superAppMainScreenAddressInteractorImpl$listenToAddress$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppMainScreenAddressInteractorImpl$listenToAddress$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009f, code lost:
    
        if (r0.emit(r2, r8) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r9 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        pv0 pv0Var;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pv0 pv0Var2 = (pv0) this.this$0.a.i().orElse(null);
            if (pv0Var2 != null) {
                v vVar = this.this$0;
                this.L$0 = vprVar;
                this.L$1 = pv0Var2;
                this.label = 1;
                Object a = vVar.n.a(pv0Var2.a.getRequestTime(), this);
                if (a != coroutineSingletons) {
                    pv0Var = pv0Var2;
                    obj = a;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
                return coroutineSingletons;
            }
        } else if (i == 1) {
            pv0Var = (pv0) this.L$1;
            kotlin.b.b(obj);
            if (!((Boolean) obj).booleanValue()) {
                kr0 kr0Var = this.this$0.j;
                this.L$0 = vprVar;
                this.L$1 = pv0Var;
                this.label = 2;
                obj = ((com.yandex.go.clarify_address.a) kr0Var).b(this);
            }
        } else if (i == 2) {
            pv0Var = (pv0) this.L$1;
            kotlin.b.b(obj);
            if (!((Boolean) obj).booleanValue() && !this.this$0.q.a.equals(pv0Var.a.a0())) {
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
            }
        } else {
            if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
