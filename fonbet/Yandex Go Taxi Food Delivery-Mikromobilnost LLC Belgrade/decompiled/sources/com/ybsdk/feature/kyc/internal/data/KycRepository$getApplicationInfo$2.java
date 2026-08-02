package com.ybsdk.feature.kyc.internal.data;

import com.ybsdk.feature.kyc.internal.network.KycApi;
import com.ybsdk.feature.kyc.internal.network.dto.ApplicationDocumentDto;
import com.ybsdk.feature.kyc.internal.network.dto.ApplicationDocumentsInfoDto;
import com.ybsdk.feature.kyc.internal.network.dto.ApplicationInfoDto;
import com.ybsdk.feature.kyc.internal.network.dto.ApplicationInfoRequest;
import com.ybsdk.feature.kyc.internal.network.dto.ApplicationInfoResponse;
import com.ybsdk.feature.kyc.internal.network.dto.ErrorWithAddons;
import com.ybsdk.feature.kyc.internal.network.dto.SubmitUserActionRequest;
import com.ybsdk.feature.kyc.internal.network.dto.SubmitUserActionResponse;
import com.ybsdk.utils.poller.c;
import defpackage.c03;
import defpackage.dac;
import defpackage.f0e0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qnx;
import defpackage.snx;
import defpackage.tcc;
import defpackage.tls;
import defpackage.tq11;
import defpackage.wg10;
import defpackage.wls;
import defpackage.xfo;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lc03;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.kyc.internal.data.KycRepository$getApplicationInfo$2", f = "KycRepository.kt", l = {100, HProv.PP_DELETE_KEYSET}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class KycRepository$getApplicationInfo$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $applicationId;
    final /* synthetic */ String $idempotencyToken;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lcom/ybsdk/feature/kyc/internal/network/dto/ApplicationInfoResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @mvg(c = "com.ybsdk.feature.kyc.internal.data.KycRepository$getApplicationInfo$2$1", f = "KycRepository.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.kyc.internal.data.KycRepository$getApplicationInfo$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        private /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((ApplicationInfoResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            ApplicationInfoResponse applicationInfoResponse = (ApplicationInfoResponse) this.L$0;
            ApplicationInfoDto successData = applicationInfoResponse.getSuccessData();
            return Boolean.valueOf((successData != null ? successData.getApplicationState() : null) == null || a.f.contains(applicationInfoResponse.getSuccessData().getApplicationState()));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltq11;", "it", "Lkotlin/Result;", "Liyd0;", "Lcom/ybsdk/feature/kyc/internal/network/dto/ApplicationInfoResponse;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.kyc.internal.data.KycRepository$getApplicationInfo$2$2", f = "KycRepository.kt", l = {BuildConfig.API_LEVEL}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.kyc.internal.data.KycRepository$getApplicationInfo$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ String $applicationId;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(a aVar, String str, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$applicationId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$applicationId, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            int i = ((tq11) obj).a;
            return new AnonymousClass2(this.this$0, this.$applicationId, (Continuation) obj2).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                KycApi kycApi = this.this$0.a;
                ApplicationInfoRequest applicationInfoRequest = new ApplicationInfoRequest(this.$applicationId);
                this.label = 1;
                f = kycApi.f(applicationInfoRequest, this);
                if (f == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                f = ((Result) obj).getValue();
            }
            return new Result(f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycRepository$getApplicationInfo$2(a aVar, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$idempotencyToken = str;
        this.$applicationId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new KycRepository$getApplicationInfo$2(this.this$0, this.$idempotencyToken, this.$applicationId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((KycRepository$getApplicationInfo$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0079, code lost:
    
        if (r9 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x007b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x003f, code lost:
    
        if (r9 == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object i;
        String valueOf;
        Object e;
        Object failure;
        List<ApplicationDocumentDto> list;
        Object obj2;
        ApplicationDocumentsInfoDto documentsInfo;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            KycApi kycApi = this.this$0.a;
            String str = this.$idempotencyToken;
            SubmitUserActionRequest submitUserActionRequest = new SubmitUserActionRequest(this.$applicationId, "USER_STARTED_PHOTOGRAPHING");
            this.label = 1;
            i = kycApi.i(str, submitUserActionRequest, this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                e = ((Result) obj).getValue();
                a aVar = this.this$0;
                Throwable a = Result.a(e);
                if (a == null) {
                    ApplicationInfoResponse applicationInfoResponse = (ApplicationInfoResponse) e;
                    wg10 wg10Var = a.d;
                    aVar.getClass();
                    ApplicationInfoDto successData = applicationInfoResponse.getSuccessData();
                    List<ApplicationDocumentDto> documents = (successData == null || (documentsInfo = successData.getDocumentsInfo()) == null) ? null : documentsInfo.getDocuments();
                    if (applicationInfoResponse.getSuccessData() == null || a.e.contains(applicationInfoResponse.getSuccessData().getApplicationState()) || (list = documents) == null || list.isEmpty()) {
                        ErrorWithAddons errorData = applicationInfoResponse.getErrorData();
                        ApplicationInfoDto successData2 = applicationInfoResponse.getSuccessData();
                        failure = new Result.Failure(new IllegalStateException("Error fetching applications info.Details: " + errorData + ".State: " + (successData2 != null ? successData2.getApplicationState() : null) + "Documents size: " + (documents != null ? Integer.valueOf(documents.size()) : null)));
                    } else {
                        List<ApplicationDocumentDto> list2 = documents;
                        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                        for (ApplicationDocumentDto applicationDocumentDto : list2) {
                            String type = applicationDocumentDto.getType();
                            if (jl40.l(type, "PASSPORT_MAIN_PAGE")) {
                                obj2 = qnx.b;
                            } else {
                                if (!jl40.l(type, "SELFIE_WITH_PASSPORT")) {
                                    dac.f(applicationDocumentDto.getType(), "Unsupported document type: ");
                                    return null;
                                }
                                obj2 = snx.b;
                            }
                            arrayList.add(obj2);
                        }
                        failure = new c03(applicationInfoResponse.getSuccessData().getApplicationId(), applicationInfoResponse.getSuccessData().getApplicationType(), null, arrayList);
                    }
                } else {
                    failure = new Result.Failure(a);
                }
                return new Result(failure);
            }
            b.b(obj);
            i = ((Result) obj).getValue();
        }
        Throwable a2 = Result.a(i);
        if (i instanceof Result.Failure) {
            i = null;
        }
        SubmitUserActionResponse submitUserActionResponse = (SubmitUserActionResponse) i;
        ErrorWithAddons errorData2 = submitUserActionResponse != null ? submitUserActionResponse.getErrorData() : null;
        if (a2 != null || errorData2 != null) {
            if (a2 == null || (valueOf = a2.getMessage()) == null) {
                valueOf = String.valueOf(errorData2);
            }
            xfo.g(valueOf);
            return null;
        }
        c c = this.this$0.b.c(f0e0.b, new AnonymousClass1(2, null), new AnonymousClass2(this.this$0, this.$applicationId, null));
        this.label = 2;
        e = c.e(this);
    }
}
