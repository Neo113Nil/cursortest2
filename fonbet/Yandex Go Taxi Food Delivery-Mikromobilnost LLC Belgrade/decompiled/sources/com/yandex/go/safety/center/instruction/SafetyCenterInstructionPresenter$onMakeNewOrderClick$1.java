package com.yandex.go.safety.center.instruction;

import defpackage.jst;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.instruction.SafetyCenterInstructionPresenter$onMakeNewOrderClick$1", f = "SafetyCenterInstructionPresenter.kt", l = {303}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class SafetyCenterInstructionPresenter$onMakeNewOrderClick$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterInstructionPresenter$onMakeNewOrderClick$1(h hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterInstructionPresenter$onMakeNewOrderClick$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterInstructionPresenter$onMakeNewOrderClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        h hVar;
        h hVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar3 = this.this$0;
                try {
                    hVar3.F.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    SafetyCenterInstructionPresenter$onMakeNewOrderClick$1$1$1 safetyCenterInstructionPresenter$onMakeNewOrderClick$1$1$1 = new SafetyCenterInstructionPresenter$onMakeNewOrderClick$1$1$1(hVar3, null);
                    this.L$0 = hVar3;
                    this.L$1 = hVar3;
                    this.label = 1;
                    if (tje.k0(mdhVar, safetyCenterInstructionPresenter$onMakeNewOrderClick$1$1$1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    hVar2 = hVar3;
                    hVar = hVar2;
                } catch (Throwable th) {
                    th = th;
                    hVar = hVar3;
                    hVar.getClass();
                    jst.e.k(th, "Can not order cancel by accident");
                    hVar.Ng();
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hVar = (h) this.L$1;
                hVar2 = (h) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    hVar.getClass();
                    jst.e.k(th, "Can not order cancel by accident");
                    hVar.Ng();
                    return zy11.a;
                }
            }
            hVar2.Ng();
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
