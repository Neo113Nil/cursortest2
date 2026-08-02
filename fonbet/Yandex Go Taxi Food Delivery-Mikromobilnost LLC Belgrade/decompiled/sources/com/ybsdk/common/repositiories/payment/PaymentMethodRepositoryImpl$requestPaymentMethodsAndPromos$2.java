package com.ybsdk.common.repositiories.payment;

import com.ybsdk.network.Api;
import com.ybsdk.network.ApiCountryCode;
import com.ybsdk.network.UzApi;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/network/dto/WalletsInfoResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.common.repositiories.payment.PaymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$2", f = "PaymentMethodRepositoryImpl.kt", l = {262, 266, 269}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PaymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$2 extends SuspendLambda implements tls {
    final /* synthetic */ List<String> $allowedApiCountryCodes;
    final /* synthetic */ String $countryCode;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$2(String str, List list, b bVar, Continuation continuation) {
        super(1, continuation);
        this.$countryCode = str;
        this.$allowedApiCountryCodes = list;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PaymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$2(this.$countryCode, this.$allowedApiCountryCodes, this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((PaymentMethodRepositoryImpl$requestPaymentMethodsAndPromos$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r5 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r5 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r5 == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = this.$countryCode;
            if (str == null || !this.$allowedApiCountryCodes.contains(str)) {
                Api api = this.this$0.b;
                this.label = 1;
                a = api.a(this);
            } else {
                boolean equals = this.$countryCode.toUpperCase(Locale.ROOT).equals(ApiCountryCode.UZ.getIsoAlpha2());
                b bVar = this.this$0;
                if (equals) {
                    UzApi uzApi = bVar.c;
                    this.label = 2;
                    a = uzApi.a(this);
                } else {
                    Api api2 = bVar.b;
                    this.label = 3;
                    a = api2.a(this);
                }
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
