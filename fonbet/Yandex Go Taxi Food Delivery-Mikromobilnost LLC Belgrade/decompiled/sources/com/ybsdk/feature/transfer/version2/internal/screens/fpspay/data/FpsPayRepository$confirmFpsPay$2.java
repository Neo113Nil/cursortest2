package com.ybsdk.feature.transfer.version2.internal.screens.fpspay.data;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.ybsdk.core.utils.d;
import com.ybsdk.core.utils.dto.AuthenticationTrackInfo;
import com.ybsdk.core.utils.dto.TwoFactorAuthResponse;
import com.ybsdk.core.utils.dto.UtilsThemedParameter;
import com.ybsdk.core.utils.dto.common.NoReply;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
import com.ybsdk.feature.transfer.version2.internal.network.dto.fpspay.FpsPayConfirmRequest;
import defpackage.d6v;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pk11;
import defpackage.qk11;
import defpackage.rk11;
import defpackage.tk11;
import defpackage.tls;
import defpackage.w511;
import defpackage.wls;
import defpackage.ynb1;
import defpackage.yu50;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Result;", "Lsk11;", "Lcom/ybsdk/core/utils/dto/common/NoReply;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.fpspay.data.FpsPayRepository$confirmFpsPay$2", f = "FpsPayRepository.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FpsPayRepository$confirmFpsPay$2 extends SuspendLambda implements tls {
    final /* synthetic */ d6v $idempotencyTokenProvider;
    final /* synthetic */ String $operationId;
    final /* synthetic */ String $resultAgreementId;
    final /* synthetic */ String $tokenIntentId;
    final /* synthetic */ String $verificationToken;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "Lkotlin/Result;", "Lsk11;", "Lcom/ybsdk/core/utils/dto/common/NoReply;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.fpspay.data.FpsPayRepository$confirmFpsPay$2$1", f = "FpsPayRepository.kt", l = {52}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.transfer.version2.internal.screens.fpspay.data.FpsPayRepository$confirmFpsPay$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ String $operationId;
        final /* synthetic */ String $resultAgreementId;
        final /* synthetic */ String $tokenIntentId;
        final /* synthetic */ String $verificationToken;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, String str, String str2, String str3, String str4, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$verificationToken = str;
            this.$operationId = str2;
            this.$resultAgreementId = str3;
            this.$tokenIntentId = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$verificationToken, this.$operationId, this.$resultAgreementId, this.$tokenIntentId, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object x;
            Object failure;
            Object failure2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                String str = (String) this.L$0;
                Transfer2Api transfer2Api = this.this$0.a;
                String str2 = yu50.a;
                Map<String, String> b = ynb1.b(new Pair(yu50.a, this.$verificationToken), new Pair(yu50.e, this.$operationId));
                FpsPayConfirmRequest fpsPayConfirmRequest = new FpsPayConfirmRequest(this.$resultAgreementId, this.$tokenIntentId);
                this.label = 1;
                x = transfer2Api.x(str, b, fpsPayConfirmRequest, this);
                if (x == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                x = ((Result) obj).getValue();
            }
            Throwable a = Result.a(x);
            if (a == null) {
                TwoFactorAuthResponse twoFactorAuthResponse = (TwoFactorAuthResponse) x;
                int i2 = tk11.a[twoFactorAuthResponse.getStatus().ordinal()];
                if (i2 == 1) {
                    failure = new rk11(new NoReply());
                } else if (i2 != 2) {
                    if (i2 == 3) {
                        AuthenticationTrackInfo authenticationInfo = twoFactorAuthResponse.getAuthenticationInfo();
                        failure2 = (authenticationInfo != null ? authenticationInfo.getTrackId() : null) == null ? new Result.Failure(new Exception("authorizationInfo null")) : new pk11(twoFactorAuthResponse.getAuthenticationInfo().getTrackId(), twoFactorAuthResponse.getAuthenticationInfo().getOperationId());
                        failure = failure2;
                    } else {
                        if (i2 != 4) {
                            w511.b();
                            return null;
                        }
                        failure = new Result.Failure(new Exception("unknown status " + twoFactorAuthResponse));
                    }
                } else if (twoFactorAuthResponse.getFailData() == null) {
                    failure2 = new Result.Failure(new Exception("failData null"));
                    failure = failure2;
                } else {
                    String title = twoFactorAuthResponse.getFailData().getTitle();
                    String description = twoFactorAuthResponse.getFailData().getDescription();
                    UtilsThemedParameter<String> icon = twoFactorAuthResponse.getFailData().getIcon();
                    failure = new qk11(title, description, icon != null ? icon.toEntity() : null, twoFactorAuthResponse.getFailData().getSupportUrl(), twoFactorAuthResponse.getFailData().getTraceId(), twoFactorAuthResponse.getFailData().getTechInfo());
                }
            } else {
                failure = new Result.Failure(a);
            }
            return new Result(failure);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FpsPayRepository$confirmFpsPay$2(d6v d6vVar, a aVar, String str, String str2, String str3, String str4, Continuation continuation) {
        super(1, continuation);
        this.$idempotencyTokenProvider = d6vVar;
        this.this$0 = aVar;
        this.$verificationToken = str;
        this.$operationId = str2;
        this.$resultAgreementId = str3;
        this.$tokenIntentId = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new FpsPayRepository$confirmFpsPay$2(this.$idempotencyTokenProvider, this.this$0, this.$verificationToken, this.$operationId, this.$resultAgreementId, this.$tokenIntentId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((FpsPayRepository$confirmFpsPay$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            d6v d6vVar = this.$idempotencyTokenProvider;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$verificationToken, this.$operationId, this.$resultAgreementId, this.$tokenIntentId, null);
            this.label = 1;
            a = d.a(d6vVar, anonymousClass1, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
