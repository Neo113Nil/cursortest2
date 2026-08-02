package com.ybsdk.feature.kyc.internal.screens.photov2;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.c03;
import defpackage.gox;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tnx;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.kyc.internal.screens.photov2.KycPhotoV2ViewModel$uploadPhoto$3", f = "KycPhotoV2ViewModel.kt", l = {329}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class KycPhotoV2ViewModel$uploadPhoto$3 extends SuspendLambda implements wls {
    final /* synthetic */ tnx $photo;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycPhotoV2ViewModel$uploadPhoto$3(b bVar, tnx tnxVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$photo = tnxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        KycPhotoV2ViewModel$uploadPhoto$3 kycPhotoV2ViewModel$uploadPhoto$3 = new KycPhotoV2ViewModel$uploadPhoto$3(this.this$0, this.$photo, continuation);
        kycPhotoV2ViewModel$uploadPhoto$3.L$0 = obj;
        return kycPhotoV2ViewModel$uploadPhoto$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((KycPhotoV2ViewModel$uploadPhoto$3) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) this.L$0;
            b bVar = this.this$0;
            com.ybsdk.feature.kyc.internal.interactor.a aVar = bVar.E;
            tnx tnxVar = this.$photo;
            File n0 = bVar.n0(tnxVar);
            File o0 = this.this$0.o0(this.$photo);
            c03 c03Var = ((gox) this.this$0.X()).e;
            this.label = 1;
            j = aVar.j(tnxVar, n0, o0, c03Var, str, this);
            if (j == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            j = ((Result) obj).getValue();
        }
        return new Result(j);
    }
}
