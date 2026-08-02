package com.yandex.passport.internal.flags.presentation;

import com.yandex.passport.common.core.Environment;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.flags.presentation.ExperimentsInternalTestViewModel$onWish$1", f = "ExperimentsInternalTestViewModel.kt", l = {72}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ExperimentsInternalTestViewModel$onWish$1 extends SuspendLambda implements wls {
    final /* synthetic */ n0 $wish;
    int label;
    final /* synthetic */ o0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentsInternalTestViewModel$onWish$1(n0 n0Var, o0 o0Var, Continuation continuation) {
        super(2, continuation);
        this.$wish = n0Var;
        this.this$0 = o0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExperimentsInternalTestViewModel$onWish$1(this.$wish, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExperimentsInternalTestViewModel$onWish$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                n0 n0Var = this.$wish;
                o0 o0Var = this.this$0;
                if (n0Var instanceof e0) {
                    o0.Z(o0Var, ((e0) n0Var).a);
                } else if (n0Var instanceof g0) {
                    o0.d0(o0Var);
                } else if (n0Var instanceof f0) {
                    o0.a0(o0Var);
                } else if (n0Var instanceof k0) {
                    o0.b0(o0Var, ((k0) n0Var).a.a);
                } else if (n0Var instanceof h0) {
                    o0.W(o0Var);
                } else if (n0Var instanceof i0) {
                    o0.X(o0Var);
                } else if (n0Var instanceof m0) {
                    Environment environment = ((m0) n0Var).a;
                    this.label = 1;
                    if (o0.f0(o0Var, environment, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (n0Var instanceof l0) {
                    o0.c0(o0Var, ((l0) n0Var).a, ((l0) n0Var).b);
                } else {
                    if (!(n0Var instanceof j0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    o0.Y(o0Var);
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            failure = zy11Var;
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        o0 o0Var2 = this.this$0;
        Throwable a = Result.a(failure);
        if (a != null) {
            try {
                o0.e0(o0Var2, a);
            } catch (CancellationException e3) {
                throw e3;
            } catch (Throwable unused) {
            }
        }
        return zy11Var;
    }
}
