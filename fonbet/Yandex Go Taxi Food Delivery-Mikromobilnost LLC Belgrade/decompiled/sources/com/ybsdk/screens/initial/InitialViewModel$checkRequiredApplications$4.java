package com.ybsdk.screens.initial;

import com.ybsdk.common.repositiories.applications.poller.ApplicationStatusFailedException;
import defpackage.dwv;
import defpackage.e5z0;
import defpackage.hwv;
import defpackage.i5z0;
import defpackage.mvg;
import defpackage.n2e0;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.s2e0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Ls2e0;", "states", "Lzy11;", "<anonymous>", "(Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.initial.InitialViewModel$checkRequiredApplications$4", f = "InitialViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InitialViewModel$checkRequiredApplications$4 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitialViewModel$checkRequiredApplications$4(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InitialViewModel$checkRequiredApplications$4 initialViewModel$checkRequiredApplications$4 = new InitialViewModel$checkRequiredApplications$4(this.this$0, continuation);
        initialViewModel$checkRequiredApplications$4.L$0 = obj;
        return initialViewModel$checkRequiredApplications$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        InitialViewModel$checkRequiredApplications$4 initialViewModel$checkRequiredApplications$4 = (InitialViewModel$checkRequiredApplications$4) create((s2e0[]) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        initialViewModel$checkRequiredApplications$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s2e0 s2e0Var;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        s2e0[] s2e0VarArr = (s2e0[]) this.L$0;
        int length = s2e0VarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                s2e0Var = null;
                break;
            }
            s2e0Var = s2e0VarArr[i];
            if (s2e0Var instanceof n2e0) {
                break;
            }
            i++;
        }
        n2e0 n2e0Var = s2e0Var instanceof n2e0 ? (n2e0) s2e0Var : null;
        Throwable th = n2e0Var != null ? n2e0Var.a : null;
        ApplicationStatusFailedException applicationStatusFailedException = th instanceof ApplicationStatusFailedException ? (ApplicationStatusFailedException) th : null;
        d dVar = this.this$0;
        zy11 zy11Var = zy11.a;
        if (applicationStatusFailedException == null) {
            d.i0(dVar, null, null, null, 5);
            return zy11Var;
        }
        if (applicationStatusFailedException.getSupportUrl() != null) {
            pz40 Y = dVar.Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, new hwv(applicationStatusFailedException.getSupportUrl(), dVar.L.getShowLogOut(), "SupportApplicationStatusError")));
        } else {
            pz40 Y2 = dVar.Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
            } while (!r0Var.k(value, new dwv(new Throwable("Default PollingState.Error"))));
        }
        e5z0 e5z0Var = i5z0.a;
        e5z0Var.m("InitialViewModel");
        e5z0Var.a("Some applications were not processed successfully", new Object[0]);
        return zy11Var;
    }
}
