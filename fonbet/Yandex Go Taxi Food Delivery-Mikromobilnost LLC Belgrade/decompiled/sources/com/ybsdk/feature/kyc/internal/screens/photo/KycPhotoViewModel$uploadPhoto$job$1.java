package com.ybsdk.feature.kyc.internal.screens.photo;

import com.ybsdk.core.analytics.generated.delegates.KycEvents$KycOnlinePhotoUploadResultResult;
import defpackage.k801;
import defpackage.mtw;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tnx;
import defpackage.tse;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import java.io.File;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.kyc.internal.screens.photo.KycPhotoViewModel$uploadPhoto$job$1", f = "KycPhotoViewModel.kt", l = {318}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class KycPhotoViewModel$uploadPhoto$job$1 extends SuspendLambda implements wls {
    final /* synthetic */ tnx $type;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.kyc.internal.screens.photo.KycPhotoViewModel$uploadPhoto$job$1$2", f = "KycPhotoViewModel.kt", l = {323, 340, 350}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.kyc.internal.screens.photo.KycPhotoViewModel$uploadPhoto$job$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ tse $$this$launch;
        final /* synthetic */ tnx $type;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(b bVar, tnx tnxVar, tse tseVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$type = tnxVar;
            this.$$this$launch = tseVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$type, this.$$this$launch, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x00c4, code lost:
        
            if (r14.emit(r3, r12) == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
        
            if (r14.emit(r6, r12) == r0) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x009b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AnonymousClass2 anonymousClass2;
            Object obj2;
            Object obj3;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                String str = (String) this.L$0;
                b bVar = this.this$0;
                com.ybsdk.feature.kyc.internal.interactor.a aVar = bVar.E;
                tnx tnxVar = this.$type;
                File q0 = bVar.q0(tnxVar);
                File b0 = b.b0(this.this$0, this.$type);
                String applicationId = this.this$0.B.getApplicationId();
                this.label = 1;
                anonymousClass2 = this;
                Object i2 = aVar.i(tnxVar, q0, b0, applicationId, str, anonymousClass2);
                if (i2 != coroutineSingletons) {
                    obj2 = i2;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj3 = this.L$0;
                    kotlin.b.b(obj);
                    return new Result(obj3);
                }
                obj2 = this.L$0;
                kotlin.b.b(obj);
                anonymousClass2 = this;
                obj3 = obj2;
                b bVar2 = anonymousClass2.this$0;
                tnx tnxVar2 = anonymousClass2.$type;
                if (!(obj3 instanceof Result.Failure)) {
                    bVar2.I.F.j(KycEvents$KycOnlinePhotoUploadResultResult.OK, null);
                    try {
                        bVar2.q0(tnxVar2).delete();
                        b.b0(bVar2, tnxVar2).delete();
                    } catch (Throwable unused) {
                    }
                    n0 n0Var = bVar2.O;
                    Pair pair = new Pair(tnxVar2, null);
                    anonymousClass2.L$0 = obj3;
                    anonymousClass2.label = 3;
                }
                return new Result(obj3);
            }
            kotlin.b.b(obj);
            anonymousClass2 = this;
            obj2 = ((Result) obj).getValue();
            tnx tnxVar3 = anonymousClass2.$type;
            b bVar3 = anonymousClass2.this$0;
            Throwable a = Result.a(obj2);
            if (a != null) {
                x4c.g("[KYC_Online] Failed to upload photo", a, String.valueOf(tnxVar3), null, 8);
                bVar3.I.F.j(KycEvents$KycOnlinePhotoUploadResultResult.ERROR, a.getLocalizedMessage());
                n0 n0Var2 = bVar3.O;
                Pair pair2 = new Pair(tnxVar3, a);
                anonymousClass2.L$0 = obj2;
                anonymousClass2.label = 2;
            }
            obj3 = obj2;
            b bVar22 = anonymousClass2.this$0;
            tnx tnxVar22 = anonymousClass2.$type;
            if (!(obj3 instanceof Result.Failure)) {
            }
            return new Result(obj3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycPhotoViewModel$uploadPhoto$job$1(b bVar, tnx tnxVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$type = tnxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        KycPhotoViewModel$uploadPhoto$job$1 kycPhotoViewModel$uploadPhoto$job$1 = new KycPhotoViewModel$uploadPhoto$job$1(this.this$0, this.$type, continuation);
        kycPhotoViewModel$uploadPhoto$job$1.L$0 = obj;
        return kycPhotoViewModel$uploadPhoto$job$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((KycPhotoViewModel$uploadPhoto$job$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object B;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tse tseVar = (tse) this.L$0;
            b bVar = this.this$0;
            tnx tnxVar = this.$type;
            mtw mtwVar = new mtw(16);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(bVar, tnxVar, tseVar, null);
            this.label = 1;
            B = bVar.B(tnxVar, new k801(25), mtwVar, anonymousClass2, this);
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
