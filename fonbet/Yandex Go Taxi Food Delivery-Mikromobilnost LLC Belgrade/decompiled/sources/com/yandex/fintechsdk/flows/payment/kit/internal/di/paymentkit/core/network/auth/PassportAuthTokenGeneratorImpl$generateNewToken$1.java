package com.yandex.fintechsdk.flows.payment.kit.internal.di.paymentkit.core.network.auth;

import android.os.SystemClock;
import defpackage.dn90;
import defpackage.ek;
import defpackage.fnz0;
import defpackage.g050;
import defpackage.gnz0;
import defpackage.hk3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qk3;
import defpackage.tse;
import defpackage.wls;
import defpackage.xk3;
import defpackage.z22;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.flows.payment.kit.internal.di.paymentkit.core.network.auth.PassportAuthTokenGeneratorImpl$generateNewToken$1", f = "PassportAuthTokenGeneratorImpl.kt", l = {HProv.PP_LCD_QUERY}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class PassportAuthTokenGeneratorImpl$generateNewToken$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassportAuthTokenGeneratorImpl$generateNewToken$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PassportAuthTokenGeneratorImpl$generateNewToken$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PassportAuthTokenGeneratorImpl$generateNewToken$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bb, code lost:
    
        if (r0 != false) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        g050 g050Var;
        ek ekVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            b.b(obj);
            a aVar2 = this.this$0;
            kotlinx.coroutines.sync.a aVar3 = aVar2.g;
            this.L$0 = aVar3;
            this.L$1 = aVar2;
            this.label = 1;
            if (aVar3.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar = aVar2;
            g050Var = aVar3;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = (a) this.L$1;
            g050Var = (g050) this.L$0;
            b.b(obj);
        }
        try {
            hk3 hk3Var = aVar.b;
            z22 z22Var = aVar.a;
            xk3 xk3Var = (xk3) hk3Var.c.a.getValue();
            qk3 qk3Var = xk3Var instanceof qk3 ? (qk3) xk3Var : null;
            Long valueOf = (qk3Var == null || (ekVar = qk3Var.a) == null) ? null : Long.valueOf(ekVar.b);
            if (valueOf == null) {
                ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new fnz0("Current UID is null", "MissingUID", null));
            } else {
                dn90 dn90Var = aVar.e;
                if (dn90Var == null) {
                    ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new fnz0("PassportAdapter is null", "MissingAdapter", valueOf));
                } else {
                    Pair pair = new Pair(Boolean.valueOf(a.a(aVar, dn90Var, valueOf.longValue())), new Long(SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime()));
                    boolean booleanValue = ((Boolean) pair.getFirst()).booleanValue();
                    ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new gnz0(((Number) pair.getSecond()).longValue(), booleanValue, valueOf));
                }
            }
            z = false;
            Boolean valueOf2 = Boolean.valueOf(z);
            g050Var.d(null);
            return valueOf2;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
    }
}
