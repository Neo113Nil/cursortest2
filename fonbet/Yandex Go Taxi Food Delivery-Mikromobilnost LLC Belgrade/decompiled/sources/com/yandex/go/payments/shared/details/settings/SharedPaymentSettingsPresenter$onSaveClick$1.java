package com.yandex.go.payments.shared.details.settings;

import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.v;
import defpackage.evu0;
import defpackage.il;
import defpackage.jst;
import defpackage.jz21;
import defpackage.kor0;
import defpackage.mvg;
import defpackage.nbr0;
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
import ru.yandex.taxi.exception.ValidationException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.details.settings.SharedPaymentSettingsPresenter$onSaveClick$1", f = "SharedPaymentSettingsPresenter.kt", l = {90}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SharedPaymentSettingsPresenter$onSaveClick$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ kor0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPaymentSettingsPresenter$onSaveClick$1(kor0 kor0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kor0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SharedPaymentSettingsPresenter$onSaveClick$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedPaymentSettingsPresenter$onSaveClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kor0 kor0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kor0 kor0Var2 = this.label;
        try {
            if (kor0Var2 == 0) {
                b.b(obj);
                kor0 kor0Var3 = this.this$0;
                v vVar = kor0Var3.x;
                il ilVar = kor0Var3.B;
                String str = ilVar.b().a;
                String obj2 = evu0.k0(kor0Var3.D.b).toString();
                String str2 = ilVar.b().k;
                nbr0 nbr0Var = kor0Var3.C;
                this.L$0 = kor0Var3;
                this.L$1 = kor0Var3;
                this.label = 1;
                obj = vVar.c(str, obj2, str2, nbr0Var, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                kor0Var = kor0Var3;
                kor0Var2 = kor0Var3;
            } else {
                if (kor0Var2 != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kor0 kor0Var4 = (kor0) this.L$1;
                kor0Var = (kor0) this.L$0;
                b.b(obj);
                kor0Var2 = kor0Var4;
            }
            kor0.Kg(kor0Var, (Account) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            vor0 vor0Var = kor0Var2.A;
            oor0 oor0Var = kor0Var2.D;
            jst.e.j(th);
            if (th instanceof ValidationException) {
                for (jz21 jz21Var : th.getErrors()) {
                    String str3 = jz21Var.a;
                    String str4 = jz21Var.b;
                    if (str3.equals("name")) {
                        oor0Var.g = str4;
                    } else {
                        vor0Var.a(str4);
                        jst.e.w(new IllegalStateException("Didn't expect validation error with fieldName=".concat(jz21Var.a)));
                    }
                    kor0Var2.Lg();
                }
            } else {
                vor0Var.a(kor0Var2.y.a(th));
            }
            oor0Var.e = false;
            oor0Var.c = true;
            oor0Var.f = true;
            oor0Var.d = kor0Var2.C.g;
            kor0Var2.Lg();
        }
        return zy11.a;
    }
}
