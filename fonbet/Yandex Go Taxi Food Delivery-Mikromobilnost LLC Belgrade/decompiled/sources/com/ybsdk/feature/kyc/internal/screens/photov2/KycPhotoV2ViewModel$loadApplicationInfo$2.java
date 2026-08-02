package com.ybsdk.feature.kyc.internal.screens.photov2;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.c03;
import defpackage.gox;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.kyc.internal.screens.photov2.KycPhotoV2ViewModel$loadApplicationInfo$2", f = "KycPhotoV2ViewModel.kt", l = {248}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class KycPhotoV2ViewModel$loadApplicationInfo$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "Lkotlin/Result;", "Lc03;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.kyc.internal.screens.photov2.KycPhotoV2ViewModel$loadApplicationInfo$2$1", f = "KycPhotoV2ViewModel.kt", l = {249}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.kyc.internal.screens.photov2.KycPhotoV2ViewModel$loadApplicationInfo$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                String str = (String) this.L$0;
                b bVar = this.this$0;
                com.ybsdk.feature.kyc.internal.interactor.a aVar = bVar.E;
                String applicationId = bVar.B.getApplicationId();
                this.label = 1;
                d = aVar.d(applicationId, str, this);
                if (d == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                d = ((Result) obj).getValue();
            }
            return new Result(d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycPhotoV2ViewModel$loadApplicationInfo$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KycPhotoV2ViewModel$loadApplicationInfo$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((KycPhotoV2ViewModel$loadApplicationInfo$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object O;
        r0 r0Var;
        Object value;
        gox goxVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            String applicationId = bVar.B.getApplicationId();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            O = bVar.O(anonymousClass1, applicationId, this);
            if (O == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            O = ((Result) obj).getValue();
        }
        b bVar2 = this.this$0;
        if (!(O instanceof Result.Failure)) {
            c03 c03Var = (c03) O;
            bVar2.getClass();
            if (c03Var.d.isEmpty()) {
                bVar2.l0(new IllegalStateException("No required photos found"));
            } else {
                pz40 Y = bVar2.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                    goxVar = (gox) value;
                } while (!r0Var.k(value, gox.a(goxVar, false, null, null, goxVar.e, false, null, 111)));
                bVar2.k0(c03Var);
            }
        }
        b bVar3 = this.this$0;
        Throwable a = Result.a(O);
        if (a != null) {
            bVar3.l0(a);
        }
        return zy11.a;
    }
}
