package com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.repository;

import com.yandex.go.masstransit.sdk.externalservice.api.mosmetro_otp.model.MosmetroOtpError;
import com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.dto.MosmetroExchangeOtpRequest;
import com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.dto.MosmetroExchangeOtpResponse;
import com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.network.MosmetroOtpApi;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.cmt;
import defpackage.g930;
import defpackage.jl40;
import defpackage.k930;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ps20;
import defpackage.qcx;
import defpackage.s8o;
import defpackage.sbx;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.BufferedInputStream;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/masstransit/sdk/externalservice/api/mosmetro_otp/model/MosmetroOtpError;", "<anonymous>", "(Ltse;)Lcom/yandex/go/masstransit/sdk/externalservice/api/mosmetro_otp/model/MosmetroOtpError;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.repository.MosmetroOtpRepositoryImpl$exchangeOtp$2", f = "MosmetroOtpRepositoryImpl.kt", l = {HProv.ALG_SID_KECCAK_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MosmetroOtpRepositoryImpl$exchangeOtp$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $password;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ k930 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MosmetroOtpRepositoryImpl$exchangeOtp$2(k930 k930Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = k930Var;
        this.$password = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MosmetroOtpRepositoryImpl$exchangeOtp$2(this.this$0, this.$password, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MosmetroOtpRepositoryImpl$exchangeOtp$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        k930 k930Var;
        String L;
        Pair pair;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                g930 g930Var = this.this$0.d;
                if (g930Var == null) {
                    return new MosmetroOtpError.UnknownBackendError(null, "initOtp was not called or failed");
                }
                String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
                String str = this.$password;
                k930 k930Var2 = this.this$0;
                try {
                    cmt<MosmetroExchangeOtpResponse> b = ((MosmetroOtpApi) k930Var2.c.getValue()).b(lowerCase, new MosmetroExchangeOtpRequest(g930Var.a, str));
                    ps20 ps20Var = new ps20(20);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = k930Var2;
                    this.L$3 = null;
                    this.label = 1;
                    if (ru.yandex.taxi.network.api.a.a(b, ps20Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    k930Var = k930Var2;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k930Var = (k930) this.L$2;
                try {
                    b.b(obj);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            xby.d.h("MosmetroOtp", "Failed to exchange OTP for Mosmetro", th);
            k930Var.getClass();
            BufferedInputStream N = s8o.N(th);
            if (N != null) {
                try {
                    L = s8o.L(N);
                } catch (Exception e) {
                    xby.d.h("MosmetroOtp", "Failed to parse error response body", e);
                }
                if (L != null) {
                    c cVar = (c) sbx.d.b(c.Companion.serializer(), L);
                    kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) cVar.get(AuthSdkActivity.RESPONSE_TYPE_CODE);
                    String g = bVar != null ? qcx.g(qcx.n(bVar)) : null;
                    kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) cVar.get(Constants.KEY_MESSAGE);
                    pair = new Pair(g, bVar2 != null ? qcx.g(qcx.n(bVar2)) : null);
                    String str2 = (String) pair.getFirst();
                    return !jl40.l(str2, "invalid_otp_provided") ? MosmetroOtpError.InvalidOtpProvided.a : jl40.l(str2, "phone_id_required") ? MosmetroOtpError.PhoneIdRequired.a : new MosmetroOtpError.UnknownBackendError(str2, (String) pair.getSecond());
                }
            }
            pair = new Pair(null, th.getMessage());
            String str22 = (String) pair.getFirst();
            if (!jl40.l(str22, "invalid_otp_provided")) {
            }
        } catch (CancellationException e2) {
            throw e2;
        }
    }
}
