package com.yandex.mob.okhttp;

import defpackage.csb1;
import defpackage.d5j0;
import defpackage.dz11;
import defpackage.ep20;
import defpackage.kvj0;
import defpackage.ll20;
import defpackage.lub1;
import defpackage.mvg;
import defpackage.nci0;
import defpackage.ny61;
import defpackage.qr20;
import defpackage.rvj0;
import defpackage.tje;
import defpackage.tl20;
import defpackage.tse;
import defpackage.uk10;
import defpackage.wls;
import defpackage.y9b1;
import defpackage.yf7;
import defpackage.yvi0;
import defpackage.zcx;
import defpackage.zp20;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import okhttp3.OkHttpClient;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Ltse;", "Lxl20;", "<anonymous>", "(Ltse;)Lxl20;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.okhttp.OkHttpExtensionsKt$callRequestWithTimeout$2", f = "OkHttpExtensions.kt", l = {130}, m = "invokeSuspend")
/* renamed from: com.yandex.mob.okhttp.OkHttpMobAvailabilityGateway$ping$2$invokeSuspend$$inlined$callRequestWithTimeout-exY8QGI$1, reason: invalid class name */
/* loaded from: classes8.dex */
public final class OkHttpMobAvailabilityGateway$ping$2$invokeSuspend$$inlined$callRequestWithTimeoutexY8QGI$1 extends SuspendLambda implements wls {
    final /* synthetic */ d5j0 $request;
    final /* synthetic */ OkHttpClient $this_callRequestWithTimeout;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttpMobAvailabilityGateway$ping$2$invokeSuspend$$inlined$callRequestWithTimeoutexY8QGI$1(OkHttpClient okHttpClient, d5j0 d5j0Var, Continuation continuation) {
        super(2, continuation);
        this.$this_callRequestWithTimeout = okHttpClient;
        this.$request = d5j0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OkHttpMobAvailabilityGateway$ping$2$invokeSuspend$$inlined$callRequestWithTimeoutexY8QGI$1(this.$this_callRequestWithTimeout, this.$request, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OkHttpMobAvailabilityGateway$ping$2$invokeSuspend$$inlined$callRequestWithTimeoutexY8QGI$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                yf7 newCall = this.$this_callRequestWithTimeout.newCall(this.$request);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.I$0 = 0;
                this.label = 1;
                obj = tje.z((nci0) newCall, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            kvj0 kvj0Var = (kvj0) obj;
            if (!kvj0Var.J) {
                return new ll20(kvj0Var.w, y9b1.c(kvj0Var), new uk10(kvj0Var));
            }
            rvj0 rvj0Var = kvj0Var.z;
            if (rvj0Var == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String string = rvj0Var.string();
            if (zy11.class.equals(zy11.class)) {
                b = zy11.a;
            } else {
                zcx zcxVar = qr20.a;
                zcxVar.getClass();
                b = zcxVar.b(dz11.b, string);
            }
            return new tl20(b, new yvi0(kvj0Var));
        } catch (IllegalArgumentException e) {
            return new zp20(e);
        } catch (Throwable th) {
            csb1.h(th);
            return new ep20(th, lub1.g(th));
        }
    }
}
