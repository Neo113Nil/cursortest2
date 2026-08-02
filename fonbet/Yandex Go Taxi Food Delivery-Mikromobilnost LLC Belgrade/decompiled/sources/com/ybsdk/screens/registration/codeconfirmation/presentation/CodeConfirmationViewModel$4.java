package com.ybsdk.screens.registration.codeconfirmation.presentation;

import com.ybsdk.common.repositiories.auth.f;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ppp0;
import defpackage.pz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.ws51;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationViewModel$4", f = "CodeConfirmationViewModel.kt", l = {113, 114}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CodeConfirmationViewModel$4 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodeConfirmationViewModel$4(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CodeConfirmationViewModel$4(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CodeConfirmationViewModel$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        if (r15 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0053  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object g;
        c cVar;
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0.G;
            this.label = 1;
            obj = fVar.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cVar = (c) this.L$0;
                kotlin.b.b(obj);
                g = ((Result) obj).getValue();
                if (!(g instanceof Result.Failure)) {
                    ws51 ws51Var = (ws51) g;
                    pz40 Y = cVar.Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, a.a((a) value, null, 0L, 0L, 0, null, null, ws51Var, false, null, 15871)));
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        Long l = (Long) obj;
        if (l != null) {
            c cVar2 = this.this$0;
            long longValue = l.longValue();
            ppp0 ppp0Var = cVar2.F;
            this.L$0 = cVar2;
            this.label = 2;
            g = ((com.ybsdk.feature.passport.impl.a) ppp0Var).g(longValue, this);
            if (g != coroutineSingletons) {
                cVar = cVar2;
                if (!(g instanceof Result.Failure)) {
                }
            }
            return coroutineSingletons;
        }
        return zy11.a;
    }
}
