package com.yandex.go.masstransit.sdk.order.impl.activation;

import android.util.Base64;
import defpackage.g1z0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q1z0;
import defpackage.r1z0;
import defpackage.tse;
import defpackage.v77;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.order.impl.activation.TicketActivationScanUiStateInteractor$handleNfcSuccess$1", f = "TicketActivationScanUiStateInteractor.kt", l = {149, 152}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class TicketActivationScanUiStateInteractor$handleNfcSuccess$1 extends SuspendLambda implements wls {
    final /* synthetic */ v77 $barcode;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketActivationScanUiStateInteractor$handleNfcSuccess$1(d dVar, v77 v77Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$barcode = v77Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TicketActivationScanUiStateInteractor$handleNfcSuccess$1(this.this$0, this.$barcode, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TicketActivationScanUiStateInteractor$handleNfcSuccess$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (kotlinx.coroutines.a.i(2000, r5) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
    
        if (kotlinx.coroutines.a.i(500, r5) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            r0 r0Var = this.this$0.c;
            do {
                value = r0Var.getValue();
            } while (!r0Var.k(value, q1z0.a));
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                this.this$0.e.g(new g1z0(Base64.encodeToString(this.$barcode.a, 2)));
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        r0 r0Var2 = this.this$0.c;
        do {
            value2 = r0Var2.getValue();
        } while (!r0Var2.k(value2, r1z0.a));
        this.label = 2;
    }
}
