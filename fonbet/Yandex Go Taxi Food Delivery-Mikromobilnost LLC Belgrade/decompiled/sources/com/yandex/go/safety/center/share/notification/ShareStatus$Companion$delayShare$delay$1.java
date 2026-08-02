package com.yandex.go.safety.center.share.notification;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.share.notification.ShareStatus$Companion$delayShare$delay$1", f = "ShareStatus.kt", l = {23, 24}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ShareStatus$Companion$delayShare$delay$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $delayInSec;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareStatus$Companion$delayShare$delay$1(int i, Continuation continuation) {
        super(2, continuation);
        this.$delayInSec = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ShareStatus$Companion$delayShare$delay$1 shareStatus$Companion$delayShare$delay$1 = new ShareStatus$Companion$delayShare$delay$1(this.$delayInSec, continuation);
        shareStatus$Companion$delayShare$delay$1.L$0 = obj;
        return shareStatus$Companion$delayShare$delay$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShareStatus$Companion$delayShare$delay$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (((defpackage.x6f0) r0).y.o(r9, r8) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (kotlinx.coroutines.a.i(r6, r8) == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            long millis = TimeUnit.SECONDS.toMillis(this.$delayInSec);
            this.L$0 = y6f0Var;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        Object obj2 = new Object();
        this.L$0 = null;
        this.label = 2;
    }
}
