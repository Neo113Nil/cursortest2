package com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.repository;

import com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.dto.MosmetroInitOtpRequest;
import com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.dto.MosmetroInitOtpResponse;
import com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.network.MosmetroOtpApi;
import defpackage.cmt;
import defpackage.g930;
import defpackage.i930;
import defpackage.k930;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ps20;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lg930;", "<anonymous>", "(Ltse;)Lg930;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.repository.MosmetroOtpRepositoryImpl$initOtp$2", f = "MosmetroOtpRepositoryImpl.kt", l = {50}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MosmetroOtpRepositoryImpl$initOtp$2 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ k930 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MosmetroOtpRepositoryImpl$initOtp$2(k930 k930Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = k930Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MosmetroOtpRepositoryImpl$initOtp$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MosmetroOtpRepositoryImpl$initOtp$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        k930 k930Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                this.this$0.getClass();
                String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                k930 k930Var2 = this.this$0;
                cmt<MosmetroInitOtpResponse> a = ((MosmetroOtpApi) k930Var2.c.getValue()).a(lowerCase, new MosmetroInitOtpRequest());
                ps20 ps20Var = new ps20(21);
                this.L$0 = null;
                this.L$1 = k930Var2;
                this.label = 1;
                obj = ru.yandex.taxi.network.api.a.a(a, ps20Var, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                k930Var = k930Var2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k930Var = (k930) this.L$1;
                b.b(obj);
            }
            i930 i930Var = k930Var.a;
            g930 a2 = i930.a((MosmetroInitOtpResponse) obj);
            k930Var.d = a2;
            return a2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.d.h("MosmetroOtp", "Failed to init OTP for Mosmetro", th);
            return null;
        }
    }
}
