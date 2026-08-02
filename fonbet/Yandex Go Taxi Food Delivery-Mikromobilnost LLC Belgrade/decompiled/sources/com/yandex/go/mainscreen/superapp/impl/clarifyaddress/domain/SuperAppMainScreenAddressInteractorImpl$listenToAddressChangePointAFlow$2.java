package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import com.yandex.go.address.models.Address;
import com.yandex.go.clarify_address.AddressClarificationReason;
import defpackage.d6z;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lpv0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.SuperAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$2", f = "SuperAppMainScreenAddressInteractorImpl.kt", l = {189, 195, 196}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SuperAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$2(v vVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$2 superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$2 = new SuperAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$2(this.this$0, continuation);
        superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$2.L$0 = obj;
        return superAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
    
        if (r11 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        pv0 pv0Var;
        pv0 pv0Var2;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            v vVar = this.this$0;
            if (!vVar.s) {
                kr0 kr0Var = vVar.j;
                this.L$0 = vprVar;
                this.label = 1;
                obj = ((com.yandex.go.clarify_address.a) kr0Var).b(this);
            }
            return zy11Var;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            pv0Var = (pv0) this.L$2;
            pv0Var2 = (pv0) this.L$1;
            kotlin.b.b(obj);
            if (!((Boolean) obj).booleanValue()) {
                this.L$0 = null;
                this.L$1 = pv0Var2;
                this.L$2 = null;
                this.label = 3;
                if (vprVar.emit(pv0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11Var;
        }
        kotlin.b.b(obj);
        if (!((Boolean) obj).booleanValue() && (pv0Var = (pv0) this.this$0.a.i().orElse(null)) != null) {
            Address address = pv0Var.a;
            v vVar2 = this.this$0;
            vVar2.h.getClass();
            if (d6z.L(address)) {
                ((com.yandex.go.clarify_address.a) vVar2.j).c(true, AddressClarificationReason.Suggest);
                return zy11Var;
            }
            this.L$0 = vprVar;
            this.L$1 = pv0Var;
            this.L$2 = pv0Var;
            this.label = 2;
            obj = vVar2.n.a(address.getRequestTime(), this);
            if (obj != coroutineSingletons) {
                pv0Var2 = pv0Var;
                if (!((Boolean) obj).booleanValue()) {
                }
            }
            return coroutineSingletons;
        }
        return zy11Var;
    }
}
