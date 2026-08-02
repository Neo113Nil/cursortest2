package com.yandex.go.payments_widgets.mini.widgets.data;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.g92;
import defpackage.gea0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zww0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments_widgets.mini.widgets.data.PaymentMiniWidgetsVisibilityInteractorImpl$miniWidgetsVisibleFlow$$inlined$flatMapLatest$1", f = "PaymentMiniWidgetsVisibilityInteractorImpl.kt", l = {217, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
public final class PaymentMiniWidgetsVisibilityInteractorImpl$miniWidgetsVisibleFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMiniWidgetsVisibilityInteractorImpl$miniWidgetsVisibleFlow$$inlined$flatMapLatest$1(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PaymentMiniWidgetsVisibilityInteractorImpl$miniWidgetsVisibleFlow$$inlined$flatMapLatest$1 paymentMiniWidgetsVisibilityInteractorImpl$miniWidgetsVisibleFlow$$inlined$flatMapLatest$1 = new PaymentMiniWidgetsVisibilityInteractorImpl$miniWidgetsVisibleFlow$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        paymentMiniWidgetsVisibilityInteractorImpl$miniWidgetsVisibleFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        paymentMiniWidgetsVisibilityInteractorImpl$miniWidgetsVisibleFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return paymentMiniWidgetsVisibilityInteractorImpl$miniWidgetsVisibleFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007c, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r1, r0, r7) != r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007e, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (((com.yandex.go.preload.g) r8).a(r7) == r2) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tpr g92Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            int i2 = gea0.a[((Screen) obj2).ordinal()];
            if (i2 != 1) {
                g92Var = i2 != 2 ? new g92(2, Boolean.FALSE) : a.a(this.this$0);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 2;
            } else {
                zww0 zww0Var = this.this$0.e;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = vprVar;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 1;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$2;
            b.b(obj);
        }
        g92Var = a.a(this.this$0);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
    }
}
