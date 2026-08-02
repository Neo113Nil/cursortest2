package com.ybsdk.feature.kyc.internal.screens.photo;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.delegates.KycEvents$KycOnlineErrorPhotoDownloadOpenRequest;
import com.ybsdk.core.analytics.generated.delegates.KycEvents$KycOnlineSubmitRequestResultResult;
import defpackage.em3;
import defpackage.if8;
import defpackage.inx;
import defpackage.k801;
import defpackage.mtw;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.onx;
import defpackage.pz40;
import defpackage.tse;
import defpackage.u6z;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.kyc.internal.screens.photo.KycPhotoViewModel$submitPhotos$1", f = "KycPhotoViewModel.kt", l = {407}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class KycPhotoViewModel$submitPhotos$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.kyc.internal.screens.photo.KycPhotoViewModel$submitPhotos$1$2", f = "KycPhotoViewModel.kt", l = {412}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.kyc.internal.screens.photo.KycPhotoViewModel$submitPhotos$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object g;
            r0 r0Var;
            Object value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                String str = (String) this.L$0;
                b bVar = this.this$0;
                com.ybsdk.feature.kyc.internal.interactor.a aVar = bVar.E;
                u6z u6zVar = bVar.K;
                String applicationId = bVar.B.getApplicationId();
                this.label = 1;
                g = aVar.g(applicationId, u6zVar, str, this);
                if (g == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                g = ((Result) obj).getValue();
            }
            b bVar2 = this.this$0;
            if (!(g instanceof Result.Failure)) {
                em3 em3Var = bVar2.I.F;
                KycEvents$KycOnlineSubmitRequestResultResult kycEvents$KycOnlineSubmitRequestResultResult = KycEvents$KycOnlineSubmitRequestResultResult.OK;
                LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, kycEvents$KycOnlineSubmitRequestResultResult.getOriginalValue());
                em3Var.a.a("kyc_online.submit.request.result", linkedHashMap);
                bVar2.H.a(((if8) bVar2.F).a.e().getUploadSuccessDeeplink());
            }
            b bVar3 = this.this$0;
            Throwable a = Result.a(g);
            if (a != null) {
                x4c.g("[KYC_Online] Failed to submit photos", a, null, null, 12);
                em3 em3Var2 = bVar3.I.F;
                KycEvents$KycOnlineSubmitRequestResultResult kycEvents$KycOnlineSubmitRequestResultResult2 = KycEvents$KycOnlineSubmitRequestResultResult.ERROR;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
                linkedHashMap2.put(TarifficatorScenarioActivity.RESULT_KEY, kycEvents$KycOnlineSubmitRequestResultResult2.getOriginalValue());
                em3Var2.a.a("kyc_online.submit.request.result", linkedHashMap2);
                em3 em3Var3 = bVar3.I.F;
                KycEvents$KycOnlineErrorPhotoDownloadOpenRequest kycEvents$KycOnlineErrorPhotoDownloadOpenRequest = KycEvents$KycOnlineErrorPhotoDownloadOpenRequest.SUBMIT;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(1);
                linkedHashMap3.put("request", kycEvents$KycOnlineErrorPhotoDownloadOpenRequest.getOriginalValue());
                em3Var3.a.a("kyc_online.error.photo.download.open", linkedHashMap3);
                pz40 Y = bVar3.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, onx.a((onx) value, new inx(a), null, null, null, false, 0, false, 252)));
            }
            return new Result(g);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycPhotoViewModel$submitPhotos$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KycPhotoViewModel$submitPhotos$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((KycPhotoViewModel$submitPhotos$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object B;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            mtw mtwVar = new mtw(15);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(bVar, null);
            this.label = 1;
            B = bVar.B("IDEMPOTENCY_TOKEN_KEY_SUBMIT", new k801(25), mtwVar, anonymousClass2, this);
            if (B == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            ((Result) obj).getClass();
        }
        return zy11.a;
    }
}
