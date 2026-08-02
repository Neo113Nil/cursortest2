package com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain;

import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.Me2MeDebitResultScreenParams;
import defpackage.a5f;
import defpackage.b64;
import defpackage.e5z0;
import defpackage.g8e;
import defpackage.i5z0;
import defpackage.j73;
import defpackage.kfb0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.uza;
import defpackage.wls;
import defpackage.zy11;
import java.nio.charset.Charset;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lsk11;", "Lpi01;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain.Me2MeDebitResultInteractor$getMe2MeTransferId$2", f = "Me2MeDebitResultInteractor.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Me2MeDebitResultInteractor$getMe2MeTransferId$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $operationId;
    final /* synthetic */ String $verificationToken;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Me2MeDebitResultInteractor$getMe2MeTransferId$2(a aVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$operationId = str;
        this.$verificationToken = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Me2MeDebitResultInteractor$getMe2MeTransferId$2 me2MeDebitResultInteractor$getMe2MeTransferId$2 = new Me2MeDebitResultInteractor$getMe2MeTransferId$2(this.this$0, this.$operationId, this.$verificationToken, continuation);
        me2MeDebitResultInteractor$getMe2MeTransferId$2.L$0 = obj;
        return me2MeDebitResultInteractor$getMe2MeTransferId$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Me2MeDebitResultInteractor$getMe2MeTransferId$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            String str = (String) this.L$0;
            a aVar = this.this$0;
            com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.data.a aVar2 = aVar.b;
            String permissionRequestId = aVar.c.getPermissionRequestId();
            String agreementId = this.this$0.c.getAgreementId();
            String str2 = this.$operationId;
            String str3 = this.$verificationToken;
            a aVar3 = this.this$0;
            String str4 = aVar3.w.b;
            if (str4 == null) {
                return new Result(new Result.Failure(new Throwable("Null sessionUuid for generating hmac in getTransferId")));
            }
            Me2MeDebitResultScreenParams me2MeDebitResultScreenParams = aVar3.c;
            String agreementId2 = me2MeDebitResultScreenParams.getAgreementId();
            String phoneNumber = me2MeDebitResultScreenParams.getPhoneNumber();
            String partnerId = me2MeDebitResultScreenParams.getResultLoaderPage().getYbInfo().getPartnerId();
            String permissionRequestId2 = me2MeDebitResultScreenParams.getPermissionRequestId();
            String j = b64.j(kfb0.f(phoneNumber), partnerId);
            String str5 = str3 == null ? "" : str3;
            StringBuilder v = b64.v("idempotencyToken=", str, ",idempotencyToken=", permissionRequestId2, ",sourceAgreementId=");
            g8e.D(v, agreementId2, ",destination=", j, ",verificationToken=");
            v.append(str5);
            String sb = v.toString();
            e5z0 e5z0Var = i5z0.a;
            e5z0Var.m("HMAC me2meDebit");
            e5z0Var.a(sb, new Object[0]);
            String q = oyr.q(str, permissionRequestId2, agreementId2, j, str3 == null ? "" : str3);
            Locale locale = Locale.ROOT;
            String lowerCase = q.toLowerCase(locale);
            String concat = "sessionKey=".concat(str4);
            e5z0Var.m("HMAC me2meDebit");
            e5z0Var.a(concat, new Object[0]);
            String concat2 = "raw data=".concat(lowerCase);
            e5z0Var.m("HMAC me2meDebit");
            e5z0Var.a(concat2, new Object[0]);
            String lowerCase2 = lowerCase.toLowerCase(locale);
            Mac mac = Mac.getInstance("HmacSHA256");
            Charset charset = uza.a;
            mac.init(new SecretKeySpec(str4.getBytes(charset), "HmacSHA256"));
            String K = j73.K(mac.doFinal(lowerCase2.getBytes(charset)), "", new a5f(5), 30);
            this.label = 1;
            d = aVar2.d(permissionRequestId, agreementId, str, str2, str3, K, this);
            if (d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            d = ((Result) obj).getValue();
        }
        return new Result(d);
    }
}
