package com.ybsdk.feature.autotopup.internal.data;

import com.ybsdk.core.common.data.network.dto.HmacDto;
import com.ybsdk.core.utils.dto.TwoFactorAuthResponse;
import com.ybsdk.core.utils.dto.f;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.autotopup.internal.network.AutoTopupApi;
import com.ybsdk.feature.autotopup.internal.network.dto.AutoFundDto;
import com.ybsdk.feature.autotopup.internal.network.dto.AutoTopupParamsDto;
import com.ybsdk.feature.autotopup.internal.network.dto.SaveAutoTopupRequest;
import defpackage.i04;
import defpackage.j4w;
import defpackage.lr3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qb91;
import defpackage.tls;
import defpackage.wls;
import defpackage.ynb1;
import defpackage.yu50;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lsk11;", "Lty3;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.data.AutoTopupSetupRepository$saveAutoTopup$2", f = "AutoTopupSetupRepository.kt", l = {299, 330}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupRepository$saveAutoTopup$2 extends SuspendLambda implements wls {
    final /* synthetic */ Boolean $autoFundEnabled;
    final /* synthetic */ String $autoTopupId;
    final /* synthetic */ j4w $infoEntity;
    final /* synthetic */ boolean $isV2RequestStatusEnabled;
    final /* synthetic */ String $operationId;
    final /* synthetic */ String $verificationToken;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/TwoFactorAuthResponse;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupSuccessResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @mvg(c = "com.ybsdk.feature.autotopup.internal.data.AutoTopupSetupRepository$saveAutoTopup$2$1", f = "AutoTopupSetupRepository.kt", l = {315}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.autotopup.internal.data.AutoTopupSetupRepository$saveAutoTopup$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements tls {
        final /* synthetic */ Boolean $autoFundEnabled;
        final /* synthetic */ String $autoTopupId;
        final /* synthetic */ String $idempotencyToken;
        final /* synthetic */ j4w $infoEntity;
        final /* synthetic */ String $operationId;
        final /* synthetic */ String $verificationToken;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(j4w j4wVar, Boolean bool, b bVar, String str, String str2, String str3, String str4, Continuation continuation) {
            super(1, continuation);
            this.$infoEntity = j4wVar;
            this.$autoFundEnabled = bool;
            this.this$0 = bVar;
            this.$autoTopupId = str;
            this.$idempotencyToken = str2;
            this.$verificationToken = str3;
            this.$operationId = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.$infoEntity, this.$autoFundEnabled, this.this$0, this.$autoTopupId, this.$idempotencyToken, this.$verificationToken, this.$operationId, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                j4w j4wVar = this.$infoEntity;
                AutoTopupParamsDto autoTopupParamsDto = new AutoTopupParamsDto(i04.e(j4wVar.b), i04.e(j4wVar.c), qb91.e(j4wVar.d), i04.d(j4wVar.e), null);
                Boolean bool = this.$autoFundEnabled;
                AutoFundDto autoFundDto = bool != null ? new AutoFundDto(bool.booleanValue(), null) : null;
                HmacDto a2 = this.this$0.b.a(i04.a(autoTopupParamsDto, autoFundDto != null ? new lr3(autoFundDto.getEnabled(), autoFundDto.getFundAmountLimit()) : null), this.$infoEntity.a, this.$autoTopupId, this.$idempotencyToken, this.$verificationToken);
                AutoTopupApi autoTopupApi = this.this$0.a;
                String str = this.$idempotencyToken;
                Map<String, String> b = ynb1.b(new Pair(yu50.a, this.$verificationToken), new Pair(yu50.e, this.$operationId));
                SaveAutoTopupRequest saveAutoTopupRequest = new SaveAutoTopupRequest(this.$infoEntity.a, this.$autoTopupId, autoTopupParamsDto, autoFundDto, a2);
                this.label = 1;
                a = autoTopupApi.a(str, b, saveAutoTopupRequest, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                a = ((Result) obj).getValue();
            }
            return new Result(a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupRepository$saveAutoTopup$2(j4w j4wVar, Boolean bool, b bVar, String str, String str2, String str3, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$infoEntity = j4wVar;
        this.$autoFundEnabled = bool;
        this.this$0 = bVar;
        this.$autoTopupId = str;
        this.$verificationToken = str2;
        this.$operationId = str3;
        this.$isV2RequestStatusEnabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AutoTopupSetupRepository$saveAutoTopup$2 autoTopupSetupRepository$saveAutoTopup$2 = new AutoTopupSetupRepository$saveAutoTopup$2(this.$infoEntity, this.$autoFundEnabled, this.this$0, this.$autoTopupId, this.$verificationToken, this.$operationId, this.$isV2RequestStatusEnabled, continuation);
        autoTopupSetupRepository$saveAutoTopup$2.L$0 = obj;
        return autoTopupSetupRepository$saveAutoTopup$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupSetupRepository$saveAutoTopup$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        if (r14 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r15 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$infoEntity, this.$autoFundEnabled, this.this$0, this.$autoTopupId, (String) this.L$0, this.$verificationToken, this.$operationId, null);
            this.label = 1;
            c = c.c(anonymousClass1, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                failure = ((Result) obj).getValue();
                return new Result(failure);
            }
            kotlin.b.b(obj);
            c = ((Result) obj).getValue();
        }
        boolean z = this.$isV2RequestStatusEnabled;
        Throwable a = Result.a(c);
        if (a == null) {
            AutoTopupSetupRepository$saveAutoTopup$2$2$1 autoTopupSetupRepository$saveAutoTopup$2$2$1 = new AutoTopupSetupRepository$saveAutoTopup$2$2$1(z, null);
            this.label = 2;
            failure = f.a((TwoFactorAuthResponse) c, autoTopupSetupRepository$saveAutoTopup$2$2$1, this);
        } else {
            failure = new Result.Failure(a);
        }
        return new Result(failure);
    }
}
