package com.yandex.go.account.upgrade;

import com.yandex.go.account.upgrade.ForceAccountUpgradeExperiment;
import com.yandex.passport.api.PassportAccountUpgrader$UpdateInterval;
import defpackage.fl3;
import defpackage.g92;
import defpackage.gtq0;
import defpackage.hl3;
import defpackage.jsq0;
import defpackage.kj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o921;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.account.upgrade.AccountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$flatMapLatest$1", f = "AccountUpgradeInteractorImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AccountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$flatMapLatest$1(Continuation continuation, f fVar) {
        super(3, continuation);
        this.this$0 = fVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AccountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$flatMapLatest$1 accountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$flatMapLatest$1 = new AccountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        accountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        accountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$flatMapLatest$1.L$1 = obj2;
        return accountUpgradeInteractorImpl$shouldUpgradeAccount$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[LOOP:0: B:19:0x0048->B:37:?, LOOP_END, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tpr g92Var;
        jsq0 jsq0Var;
        boolean z;
        rol0 c;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Pair pair = (Pair) obj2;
            hl3 hl3Var = (hl3) pair.getFirst();
            ForceAccountUpgradeExperiment forceAccountUpgradeExperiment = (ForceAccountUpgradeExperiment) pair.getSecond();
            if ((hl3Var instanceof fl3) && forceAccountUpgradeExperiment.b && ((jsq0Var = forceAccountUpgradeExperiment.d) == null || !jsq0Var.a.isEmpty())) {
                for (ForceAccountUpgradeExperiment.AccountType accountType : jsq0Var.a) {
                    ru.yandex.taxi.am.k kVar = this.this$0.a;
                    int i2 = accountType == null ? -1 : a.a[accountType.ordinal()];
                    if (i2 != -1) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                w511.b();
                                return null;
                            }
                            kj Ig = kVar.Ig();
                            if (Ig != null) {
                                z = Ig.p;
                                if (z) {
                                    c = this.this$0.c.a().q().c(gtq0.h(this.this$0.b, ((fl3) hl3Var).a), PassportAccountUpgrader$UpdateInterval.ONE_DAY);
                                    g92Var = new e(c, forceAccountUpgradeExperiment, this.this$0);
                                    break;
                                }
                            }
                        } else {
                            kj Ig2 = kVar.Ig();
                            if (Ig2 != null) {
                                z = Ig2.o;
                                if (z) {
                                }
                            }
                        }
                    }
                    z = false;
                    if (z) {
                    }
                }
            }
            g92Var = new g92(2, o921.a);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(g92Var, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
