package com.yandex.go.payments.acceptance.domain;

import defpackage.l8x;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sd;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wd;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.acceptance.domain.AcceptancePaymentController$startPayment$1", f = "AcceptancePaymentController.kt", l = {108, 111, BuildConfig.API_LEVEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AcceptancePaymentController$startPayment$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $orderId;
    final /* synthetic */ sd $state;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcceptancePaymentController$startPayment$1(c cVar, String str, sd sdVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$orderId = str;
        this.$state = sdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AcceptancePaymentController$startPayment$1(this.this$0, this.$orderId, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AcceptancePaymentController$startPayment$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|2|(5:(1:(1:(8:7|8|9|10|(1:12)|13|14|15)(2:17|18))(8:19|20|21|22|(1:24)|25|14|15))(4:44|45|46|47)|31|32|(7:35|9|10|(0)|13|14|15)|34)(5:59|60|61|(1:63)|34)|48|49|(6:51|22|(0)|25|14|15)|34|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00da, code lost:
    
        r9 = r1;
        r1 = r4;
        r4 = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d1  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.yandex.go.payments.acceptance.domain.c] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c cVar;
        sd sdVar;
        sd sdVar2;
        sd sdVar3;
        c cVar2;
        c cVar3;
        Object obj2;
        String str;
        Object obj3;
        c cVar4;
        c cVar5;
        Object obj4;
        l8x l8xVar;
        c cVar6;
        l8x l8xVar2;
        Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
            if (r1 == 0) {
                kotlin.b.b(obj);
                cVar = this.this$0;
                ?? r9 = this.$orderId;
                sdVar = this.$state;
                try {
                    cVar.c.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    AcceptancePaymentController$startPayment$1$1$1 acceptancePaymentController$startPayment$1$1$1 = new AcceptancePaymentController$startPayment$1$1$1(cVar, r9, null);
                    this.L$0 = cVar;
                    this.L$1 = r9;
                    this.L$2 = sdVar;
                    this.L$3 = cVar;
                    this.L$4 = sdVar;
                    this.L$5 = cVar;
                    this.L$6 = r9;
                    this.label = 1;
                    if (tje.k0(mdhVar, acceptancePaymentController$startPayment$1$1$1, this) != obj5) {
                        sdVar3 = sdVar;
                        cVar2 = cVar;
                        cVar3 = cVar2;
                        obj2 = r9;
                        str = r9;
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable unused) {
                    sdVar2 = sdVar;
                    r1 = cVar;
                    obj3 = r9;
                }
                return obj5;
            }
            try {
                if (r1 != 1) {
                    if (r1 == 2) {
                        obj2 = (String) this.L$3;
                        cVar4 = (c) this.L$2;
                        sdVar2 = (sd) this.L$1;
                        c cVar7 = (c) this.L$0;
                        try {
                            kotlin.b.b(obj);
                            l8xVar = (l8x) cVar4.j.remove(obj2);
                            if (l8xVar != null) {
                                l8xVar.a(null);
                            }
                            cVar4.i.remove(obj2);
                        } catch (CancellationException e2) {
                            throw e2;
                        } catch (Throwable unused2) {
                            obj3 = obj2;
                            r1 = cVar4;
                            cVar = cVar7;
                        }
                        return zy11.a;
                    }
                    if (r1 != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj4 = (String) this.L$2;
                    c cVar8 = (c) this.L$1;
                    cVar5 = (c) this.L$0;
                    kotlin.b.b(obj);
                    cVar6 = cVar8;
                    cVar5.e();
                    l8xVar2 = (l8x) cVar6.j.remove(obj4);
                    if (l8xVar2 != null) {
                        l8xVar2.a(null);
                    }
                    cVar6.i.remove(obj4);
                    return zy11.a;
                }
                obj2 = (String) this.L$6;
                cVar2 = (c) this.L$5;
                sd sdVar4 = (sd) this.L$4;
                cVar = (c) this.L$3;
                sdVar3 = (sd) this.L$2;
                String str2 = (String) this.L$1;
                cVar3 = (c) this.L$0;
                try {
                    try {
                        kotlin.b.b(obj);
                        sdVar = sdVar4;
                        str = str2;
                    } catch (Throwable unused3) {
                        obj3 = obj2;
                        r1 = cVar2;
                        sdVar2 = sdVar4;
                    }
                } catch (CancellationException e3) {
                    throw e3;
                }
                cVar.e.a();
                cVar.l(new wd(sdVar2.b, null));
                this.L$0 = cVar;
                this.L$1 = r1;
                this.L$2 = obj3;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.label = 3;
                if (kotlinx.coroutines.a.i(1000L, this) != obj5) {
                    cVar5 = cVar;
                    obj4 = obj3;
                    cVar6 = r1;
                    cVar5.e();
                    l8xVar2 = (l8x) cVar6.j.remove(obj4);
                    if (l8xVar2 != null) {
                    }
                    cVar6.i.remove(obj4);
                    return zy11.a;
                }
                return obj5;
            } catch (Throwable th) {
                th = th;
                obj5 = obj3;
                l8x l8xVar3 = (l8x) r1.j.remove(obj5);
                if (l8xVar3 != null) {
                    l8xVar3.a(null);
                }
                r1.i.remove(obj5);
                throw th;
            }
            this.L$0 = cVar;
            this.L$1 = sdVar;
            this.L$2 = cVar2;
            this.L$3 = obj2;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.label = 2;
            if (c.a(cVar3, str, sdVar3, this) != obj5) {
                cVar4 = cVar2;
                l8xVar = (l8x) cVar4.j.remove(obj2);
                if (l8xVar != null) {
                }
                cVar4.i.remove(obj2);
                return zy11.a;
            }
            return obj5;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
