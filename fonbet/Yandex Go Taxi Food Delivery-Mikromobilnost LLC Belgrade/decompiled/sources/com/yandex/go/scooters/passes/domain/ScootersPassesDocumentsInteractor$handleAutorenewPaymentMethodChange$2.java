package com.yandex.go.scooters.passes.domain;

import com.yandex.go.scooters.passes.data.model.actions.ScootersChangeAutorenewPaymentMethod;
import defpackage.dvw;
import defpackage.j18;
import defpackage.jeo0;
import defpackage.m6a0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.si3;
import defpackage.tls;
import defpackage.uem;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.domain.ScootersPassesDocumentsInteractor$handleAutorenewPaymentMethodChange$2", f = "ScootersPassesDocumentsInteractor.kt", l = {186, 187}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassesDocumentsInteractor$handleAutorenewPaymentMethodChange$2 extends SuspendLambda implements tls {
    final /* synthetic */ ScootersChangeAutorenewPaymentMethod $action;
    Object L$0;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassesDocumentsInteractor$handleAutorenewPaymentMethodChange$2(h hVar, ScootersChangeAutorenewPaymentMethod scootersChangeAutorenewPaymentMethod, Continuation continuation) {
        super(1, continuation);
        this.this$0 = hVar;
        this.$action = scootersChangeAutorenewPaymentMethod;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ScootersPassesDocumentsInteractor$handleAutorenewPaymentMethodChange$2(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ScootersPassesDocumentsInteractor$handleAutorenewPaymentMethodChange$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r12 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            h hVar = this.this$0;
            this.label = 1;
            hVar.getClass();
            j18 j18Var = new j18(1, dvw.b(this));
            j18Var.u();
            hVar.k.a(new jeo0(new si3(j18Var, 14), new uem(j18Var, 9)));
            obj = j18Var.s();
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        m6a0 m6a0Var = (m6a0) obj;
        if (m6a0Var != null) {
            h hVar2 = this.this$0;
            String str = this.$action.a;
            String str2 = m6a0Var.b;
            if (str2 != null) {
                String code = m6a0Var.a.getCode();
                boolean a = m6a0Var.a();
                this.L$0 = null;
                this.label = 2;
                if (h.a(hVar2, str, str2, code, a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return zy11Var;
    }
}
