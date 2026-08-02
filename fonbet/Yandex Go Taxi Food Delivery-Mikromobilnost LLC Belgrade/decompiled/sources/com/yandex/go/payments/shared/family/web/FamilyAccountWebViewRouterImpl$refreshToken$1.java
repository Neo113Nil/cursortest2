package com.yandex.go.payments.shared.family.web;

import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.sls;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.family.web.FamilyAccountWebViewRouterImpl$refreshToken$1", f = "FamilyAccountWebViewRouterImpl.kt", l = {151}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class FamilyAccountWebViewRouterImpl$refreshToken$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $errorAction;
    final /* synthetic */ sls $successAction;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyAccountWebViewRouterImpl$refreshToken$1(c cVar, sls slsVar, sls slsVar2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$successAction = slsVar;
        this.$errorAction = slsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FamilyAccountWebViewRouterImpl$refreshToken$1(this.this$0, this.$successAction, this.$errorAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FamilyAccountWebViewRouterImpl$refreshToken$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        sls slsVar;
        sls slsVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar = this.this$0;
                sls slsVar3 = this.$successAction;
                sls slsVar4 = this.$errorAction;
                try {
                    cVar.I.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    FamilyAccountWebViewRouterImpl$refreshToken$1$1$1 familyAccountWebViewRouterImpl$refreshToken$1$1$1 = new FamilyAccountWebViewRouterImpl$refreshToken$1$1$1(cVar, null);
                    this.L$0 = slsVar3;
                    this.L$1 = slsVar4;
                    this.label = 1;
                    if (tje.k0(mdhVar, familyAccountWebViewRouterImpl$refreshToken$1$1$1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    slsVar2 = slsVar3;
                    slsVar = slsVar4;
                } catch (Throwable unused) {
                    slsVar = slsVar4;
                    if (slsVar != null) {
                        slsVar.invoke();
                    }
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                slsVar = (sls) this.L$1;
                slsVar2 = (sls) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable unused2) {
                    if (slsVar != null) {
                    }
                    return zy11.a;
                }
            }
            slsVar2.invoke();
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
