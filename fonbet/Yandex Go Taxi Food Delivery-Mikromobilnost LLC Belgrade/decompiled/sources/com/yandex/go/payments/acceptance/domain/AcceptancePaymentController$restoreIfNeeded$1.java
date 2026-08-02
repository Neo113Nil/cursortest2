package com.yandex.go.payments.acceptance.domain;

import com.yandex.go.payments.api.acceptance.AcceptancePaymentOrderContext;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rd;
import defpackage.sd;
import defpackage.tse;
import defpackage.wd;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.acceptance.domain.AcceptancePaymentController$restoreIfNeeded$1", f = "AcceptancePaymentController.kt", l = {199}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AcceptancePaymentController$restoreIfNeeded$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $orderId;
    final /* synthetic */ sd $state;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcceptancePaymentController$restoreIfNeeded$1(c cVar, String str, sd sdVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$orderId = str;
        this.$state = sdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AcceptancePaymentController$restoreIfNeeded$1(this.this$0, this.$orderId, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AcceptancePaymentController$restoreIfNeeded$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
    
        r6.a(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        r1.i.remove(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009b, code lost:
    
        return defpackage.zy11.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
    
        if (r6 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        if (r6 != null) goto L19;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.yandex.go.payments.acceptance.domain.c, int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c cVar;
        sd sdVar;
        String str;
        String str2;
        c cVar2;
        l8x l8xVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
            if (r1 == 0) {
                kotlin.b.b(obj);
                cVar = this.this$0;
                String str3 = this.$orderId;
                sdVar = this.$state;
                try {
                    this.L$0 = cVar;
                    this.L$1 = sdVar;
                    this.L$2 = str3;
                    this.L$3 = cVar;
                    this.L$4 = str3;
                    this.label = 1;
                    if (c.a(cVar, str3, sdVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = str3;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable unused) {
                    str = str3;
                    str2 = str;
                    cVar2 = cVar;
                    cVar2.e.a();
                    if (sdVar.c || sdVar.e != AcceptancePaymentOrderContext.TRANSPORTING) {
                        cVar2.h.b(str2);
                        cVar2.l(new wd(sdVar.b, null));
                    } else {
                        cVar2.h.c(str2, null, new rd(cVar2, str2, 5));
                    }
                    l8xVar = (l8x) cVar.j.remove(str);
                }
            } else {
                if (r1 != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) this.L$4;
                cVar = (c) this.L$3;
                str2 = (String) this.L$2;
                sdVar = (sd) this.L$1;
                cVar2 = (c) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable unused2) {
                    cVar2.e.a();
                    if (sdVar.c) {
                    }
                    cVar2.h.b(str2);
                    cVar2.l(new wd(sdVar.b, null));
                    l8xVar = (l8x) cVar.j.remove(str);
                }
            }
            l8xVar = (l8x) cVar.j.remove(str);
        } catch (Throwable th) {
            l8x l8xVar2 = (l8x) r1.j.remove(coroutineSingletons);
            if (l8xVar2 != null) {
                l8xVar2.a(null);
            }
            r1.i.remove(coroutineSingletons);
            throw th;
        }
    }
}
