package com.yandex.go.payments.shared.business.accountcreation;

import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.v;
import defpackage.hw6;
import defpackage.il;
import defpackage.iw6;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tmr0;
import defpackage.tor0;
import defpackage.tse;
import defpackage.vnr0;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.business.accountcreation.BusinessAccountCreationPresenter$createAccount$1", f = "BusinessAccountCreationPresenter.kt", l = {207, 210}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BusinessAccountCreationPresenter$createAccount$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessAccountCreationPresenter$createAccount$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BusinessAccountCreationPresenter$createAccount$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BusinessAccountCreationPresenter$createAccount$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(5:(1:(6:6|7|8|9|10|11)(2:17|18))(4:19|20|21|22)|16|9|10|11)(5:51|52|53|(1:55)|32)|23|24|25|26|27|28|29|30|(4:33|9|10|11)|32) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|2|(5:(1:(6:6|7|8|9|10|11)(2:17|18))(4:19|20|21|22)|16|9|10|11)(5:51|52|53|(1:55)|32)|23|24|25|26|27|28|29|30|(4:33|9|10|11)|32|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
    
        r13 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
    
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        r8 = r14;
        r13 = r1;
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
    
        r13 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a4, code lost:
    
        r14 = r0;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, zc5] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Throwable th;
        a aVar2;
        a aVar3;
        a aVar4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
            try {
                try {
                    if (r1 != 0) {
                        if (r1 != 1) {
                            if (r1 != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            aVar = (a) this.L$1;
                            aVar2 = (a) this.L$0;
                            try {
                                kotlin.b.b(obj);
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            ((hw6) aVar.Dg()).hideLoader();
                            return zy11.a;
                        }
                        aVar = (a) this.L$2;
                        a aVar5 = (a) this.L$1;
                        aVar4 = (a) this.L$0;
                        try {
                            kotlin.b.b(obj);
                            aVar3 = aVar;
                            aVar = aVar5;
                        } catch (Throwable th3) {
                            th = th3;
                            aVar2 = aVar5;
                        }
                        aVar2.H.getClass();
                        xby.l(jst.e, "B2B.TOKEN_ERROR:CREATE_BUSINESS_ACCOUNT", null, th, "Failed to create a shared account", 2);
                        iw6 iw6Var = aVar2.x;
                        tor0 tor0Var = iw6Var.b;
                        tor0Var.a.n(aVar2.z.a(th), true);
                        iw6Var.b.a();
                        ((hw6) aVar.Dg()).hideLoader();
                        return zy11.a;
                    }
                    kotlin.b.b(obj);
                    aVar = this.this$0;
                    try {
                        v vVar = aVar.y;
                        tmr0 tmr0Var = aVar.x.a;
                        this.L$0 = aVar;
                        this.L$1 = aVar;
                        this.L$2 = aVar;
                        this.label = 1;
                        obj = vVar.e(tmr0Var, this);
                        if (obj != coroutineSingletons) {
                            aVar3 = aVar;
                            aVar4 = aVar3;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th4) {
                        th = th4;
                        aVar2 = aVar;
                    }
                    Account account = (Account) obj;
                    aVar4.x.e = new il(account, account.a, account.b(), account.c());
                    vnr0 vnr0Var = aVar4.F;
                    vnr0Var.t.put("group_id", aVar4.x.a().b);
                    this.L$0 = aVar;
                    this.L$1 = aVar3;
                    this.L$2 = null;
                    this.label = 2;
                    if (a.Kg(aVar4, this) != coroutineSingletons) {
                        aVar = aVar3;
                        ((hw6) aVar.Dg()).hideLoader();
                        return zy11.a;
                    }
                    return coroutineSingletons;
                } catch (CancellationException e) {
                    throw e;
                }
            } catch (Throwable th5) {
                ((hw6) r1.Dg()).hideLoader();
                throw th5;
            }
        } catch (CancellationException e2) {
            throw e2;
        }
    }
}
