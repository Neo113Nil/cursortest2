package com.yandex.go.scooters.passes.v2;

import com.yandex.go.scooters.passes.domain.i;
import com.yandex.go.scooters.passes.exception.ScootersNoSelectedPaymentMethodException;
import com.yandex.go.scooters.passes.model.PassType;
import defpackage.mvg;
import defpackage.n7o0;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.vj90;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.v2.ScootersPackagesPresenter$purchasePackage$2", f = "ScootersPackagesPresenter.kt", l = {HProv.PP_PASSWD_TERM}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPackagesPresenter$purchasePackage$2 extends SuspendLambda implements wls {
    final /* synthetic */ vj90 $pass;
    Object L$0;
    int label;
    final /* synthetic */ n7o0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPackagesPresenter$purchasePackage$2(n7o0 n7o0Var, vj90 vj90Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = n7o0Var;
        this.$pass = vj90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPackagesPresenter$purchasePackage$2(this.this$0, this.$pass, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPackagesPresenter$purchasePackage$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        n7o0 n7o0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                n7o0 n7o0Var2 = this.this$0;
                vj90 vj90Var = this.$pass;
                try {
                    i iVar = n7o0Var2.A;
                    String str = vj90Var.a;
                    PassType passType = vj90Var.b;
                    this.L$0 = n7o0Var2;
                    this.label = 1;
                    if (iVar.a(str, passType, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    n7o0Var = n7o0Var2;
                    if (th instanceof ScootersNoSelectedPaymentMethodException) {
                        n7o0Var.I.a(th);
                    } else {
                        tje.N(n7o0Var.Jg(), null, null, new ScootersPackagesPresenter$openPaymentMethodsDialog$1(n7o0Var, null), 3);
                    }
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                n7o0Var = (n7o0) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    if (th instanceof ScootersNoSelectedPaymentMethodException) {
                    }
                    return zy11.a;
                }
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
