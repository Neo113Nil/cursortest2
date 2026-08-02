package com.yandex.go.payments.paymentlist.navigation.deeplink;

import android.net.Uri;
import defpackage.daa0;
import defpackage.eaa0;
import defpackage.faa0;
import defpackage.h9a0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.navigation.deeplink.PaymentMethodsDeeplinkRouter$onLaunch$2", f = "PaymentMethodsDeeplinkRouter.kt", l = {70, 71}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class PaymentMethodsDeeplinkRouter$onLaunch$2 extends SuspendLambda implements wls {
    final /* synthetic */ faa0 $payload;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsDeeplinkRouter$onLaunch$2(faa0 faa0Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$payload = faa0Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMethodsDeeplinkRouter$onLaunch$2(this.$payload, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodsDeeplinkRouter$onLaunch$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            return zy11Var;
        }
        b.b(obj);
        faa0 faa0Var = this.$payload;
        if (faa0Var instanceof daa0) {
            a aVar = this.this$0;
            Uri uri = ((daa0) faa0Var).a;
            this.L$0 = null;
            this.label = 1;
            return a.P(aVar, uri, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        if (!(faa0Var instanceof eaa0)) {
            w511.b();
            return null;
        }
        a aVar2 = this.this$0;
        h9a0 a = ((eaa0) faa0Var).a();
        this.L$0 = null;
        this.label = 2;
        aVar2.Q(a);
        if (zy11Var == coroutineSingletons) {
        }
    }
}
