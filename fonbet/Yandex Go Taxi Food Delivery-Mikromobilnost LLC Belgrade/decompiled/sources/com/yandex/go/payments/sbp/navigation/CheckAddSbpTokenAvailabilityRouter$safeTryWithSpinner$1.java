package com.yandex.go.payments.sbp.navigation;

import com.yandex.go.payments.addmethod.data.model.AddPaymentInfo$AddPaymentInfoStatus;
import defpackage.ai0;
import defpackage.avj0;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.sy60;
import defpackage.tls;
import defpackage.tse;
import defpackage.wi0;
import defpackage.wls;
import defpackage.zi0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.sbp.navigation.CheckAddSbpTokenAvailabilityRouter$safeTryWithSpinner$1", f = "CheckAddSbpTokenAvailabilityRouter.kt", l = {99, 101, 113, HProv.PP_INFO, Constants.VPN_TRAFFIC}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CheckAddSbpTokenAvailabilityRouter$safeTryWithSpinner$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $action;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckAddSbpTokenAvailabilityRouter$safeTryWithSpinner$1(a aVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$action = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckAddSbpTokenAvailabilityRouter$safeTryWithSpinner$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckAddSbpTokenAvailabilityRouter$safeTryWithSpinner$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x010b, code lost:
    
        if (r7 != r0) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e7 A[Catch: all -> 0x00eb, CancellationException -> 0x0134, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0134, all -> 0x00eb, blocks: (B:24:0x0058, B:25:0x00e3, B:27:0x00e7, B:31:0x006d, B:32:0x00c2, B:37:0x007d, B:39:0x009d, B:44:0x0089), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        a aVar2;
        zi0 zi0Var;
        tls tlsVar;
        a aVar3;
        a aVar4;
        tls tlsVar2;
        a aVar5;
        a aVar6;
        a aVar7;
        zi0 zi0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        a aVar8 = this.label;
        zy11 zy11Var = zy11.a;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            String h = ((avj0) aVar8.D).h(kyh0.add_payment_method_preparing_failed_text);
            wi0 wi0Var = aVar8.F;
            ai0 ai0Var = new ai0(h, AddPaymentInfo$AddPaymentInfoStatus.ERROR);
            this.L$0 = aVar8;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 4;
            wi0Var.a(ai0Var, this);
            aVar = aVar8;
        }
        if (aVar8 == 0) {
            kotlin.b.b(obj);
            a aVar9 = this.this$0;
            tlsVar = this.$action;
            wi0 wi0Var2 = aVar9.F;
            ai0 ai0Var2 = ai0.c;
            this.L$0 = aVar9;
            this.L$1 = tlsVar;
            this.L$2 = aVar9;
            this.label = 1;
            wi0Var2.a(ai0Var2, this);
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar3 = aVar9;
            aVar4 = aVar9;
        } else {
            if (aVar8 != 1) {
                if (aVar8 == 2) {
                    a aVar10 = (a) this.L$2;
                    tlsVar2 = (tls) this.L$1;
                    aVar5 = (a) this.L$0;
                    kotlin.b.b(obj);
                    aVar6 = aVar10;
                    zi0 zi0Var3 = (zi0) aVar5.E.get();
                    aVar5.L = zi0Var3;
                    aVar5.z(zi0Var3, sy60.Q2);
                    this.L$0 = aVar5;
                    this.L$1 = aVar6;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 3;
                    if (tlsVar2.invoke(this) != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar7 = aVar5;
                    aVar8 = aVar6;
                    zi0Var2 = aVar7.L;
                    if (zi0Var2 != null) {
                    }
                    return zy11Var;
                }
                if (aVar8 == 3) {
                    a aVar11 = (a) this.L$1;
                    aVar7 = (a) this.L$0;
                    kotlin.b.b(obj);
                    aVar8 = aVar11;
                    zi0Var2 = aVar7.L;
                    if (zi0Var2 != null) {
                        zi0Var2.i();
                    }
                    return zy11Var;
                }
                if (aVar8 != 4) {
                    if (aVar8 != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar2 = (a) this.L$0;
                    kotlin.b.b(obj);
                    zi0Var = aVar2.L;
                    if (zi0Var != null) {
                        zi0Var.i();
                    }
                    aVar2.r(new qu(9));
                    return zy11Var;
                }
                a aVar12 = (a) this.L$0;
                kotlin.b.b(obj);
                aVar = aVar12;
                this.L$0 = aVar;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 5;
                if (kotlinx.coroutines.a.i(1000L, this) != coroutineSingletons) {
                    aVar2 = aVar;
                    zi0Var = aVar2.L;
                    if (zi0Var != null) {
                    }
                    aVar2.r(new qu(9));
                    return zy11Var;
                }
                return coroutineSingletons;
            }
            a aVar13 = (a) this.L$2;
            tls tlsVar3 = (tls) this.L$1;
            aVar3 = (a) this.L$0;
            kotlin.b.b(obj);
            tlsVar = tlsVar3;
            aVar4 = aVar13;
        }
        String h2 = ((avj0) aVar3.D).h(kyh0.add_payment_method_preparing_loading_text);
        wi0 wi0Var3 = aVar3.F;
        ai0 ai0Var3 = new ai0(h2, AddPaymentInfo$AddPaymentInfoStatus.LOADING);
        this.L$0 = aVar3;
        this.L$1 = tlsVar;
        this.L$2 = aVar4;
        this.L$3 = null;
        this.label = 2;
        wi0Var3.a(ai0Var3, this);
        if (zy11Var == coroutineSingletons) {
            return coroutineSingletons;
        }
        tlsVar2 = tlsVar;
        aVar5 = aVar3;
        aVar6 = aVar4;
        zi0 zi0Var32 = (zi0) aVar5.E.get();
        aVar5.L = zi0Var32;
        aVar5.z(zi0Var32, sy60.Q2);
        this.L$0 = aVar5;
        this.L$1 = aVar6;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 3;
        if (tlsVar2.invoke(this) != coroutineSingletons) {
        }
    }
}
