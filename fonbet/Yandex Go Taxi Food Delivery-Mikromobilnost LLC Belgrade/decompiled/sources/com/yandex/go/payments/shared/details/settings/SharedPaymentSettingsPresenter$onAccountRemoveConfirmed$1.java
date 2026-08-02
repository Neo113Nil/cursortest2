package com.yandex.go.payments.shared.details.settings;

import com.yandex.go.payments.shared.v;
import defpackage.jst;
import defpackage.kor0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oor0;
import defpackage.tse;
import defpackage.vor0;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.details.settings.SharedPaymentSettingsPresenter$onAccountRemoveConfirmed$1", f = "SharedPaymentSettingsPresenter.kt", l = {166}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SharedPaymentSettingsPresenter$onAccountRemoveConfirmed$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $wasSaveButtonEnabled;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ kor0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPaymentSettingsPresenter$onAccountRemoveConfirmed$1(kor0 kor0Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kor0Var;
        this.$wasSaveButtonEnabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SharedPaymentSettingsPresenter$onAccountRemoveConfirmed$1(this.this$0, this.$wasSaveButtonEnabled, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedPaymentSettingsPresenter$onAccountRemoveConfirmed$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kor0 kor0Var;
        boolean z;
        kor0 kor0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                kor0Var = this.this$0;
                boolean z2 = this.$wasSaveButtonEnabled;
                try {
                    v vVar = kor0Var.x;
                    String str = kor0Var.B.b().a;
                    this.L$0 = kor0Var;
                    this.L$1 = kor0Var;
                    this.Z$0 = z2;
                    this.label = 1;
                    if (vVar.d.d(str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z = z2;
                    kor0Var2 = kor0Var;
                } catch (Throwable th) {
                    th = th;
                    z = z2;
                    jst.e.k(th, "Could not remove account");
                    kor0Var.A.a(kor0Var.y.a(th));
                    oor0 oor0Var = kor0Var.D;
                    oor0Var.f = true;
                    oor0Var.e = false;
                    oor0Var.c = z;
                    oor0Var.d = kor0Var.C.g;
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = this.Z$0;
                kor0Var = (kor0) this.L$1;
                kor0Var2 = (kor0) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    jst.e.k(th, "Could not remove account");
                    kor0Var.A.a(kor0Var.y.a(th));
                    oor0 oor0Var2 = kor0Var.D;
                    oor0Var2.f = true;
                    oor0Var2.e = false;
                    oor0Var2.c = z;
                    oor0Var2.d = kor0Var.C.g;
                    return zy11.a;
                }
            }
            vor0 vor0Var = kor0Var2.A;
            vor0Var.a.c();
            vor0Var.a.n(kor0Var2.C.o, false);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
