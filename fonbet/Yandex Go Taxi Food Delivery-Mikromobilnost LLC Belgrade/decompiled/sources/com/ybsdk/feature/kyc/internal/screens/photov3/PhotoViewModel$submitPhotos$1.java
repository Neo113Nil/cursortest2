package com.ybsdk.feature.kyc.internal.screens.photov3;

import android.net.Uri;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.ybsdk.core.utils.d;
import com.ybsdk.feature.kyc.internal.entities.SubmitV2Exception;
import defpackage.ajb0;
import defpackage.c03;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.qib0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.kyc.internal.screens.photov3.PhotoViewModel$submitPhotos$1", f = "PhotoViewModel.kt", l = {278}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PhotoViewModel$submitPhotos$1 extends SuspendLambda implements wls {
    final /* synthetic */ Uri $lastPhotoUri;
    final /* synthetic */ qib0 $screenContent;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", AuthSdkActivity.RESPONSE_TYPE_TOKEN, ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @mvg(c = "com.ybsdk.feature.kyc.internal.screens.photov3.PhotoViewModel$submitPhotos$1$1", f = "PhotoViewModel.kt", l = {279}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.kyc.internal.screens.photov3.PhotoViewModel$submitPhotos$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ Uri $lastPhotoUri;
        final /* synthetic */ qib0 $screenContent;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, qib0 qib0Var, Uri uri, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$screenContent = qib0Var;
            this.$lastPhotoUri = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$screenContent, this.$lastPhotoUri, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            r0 r0Var;
            Object value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                String str = (String) this.L$0;
                b bVar = this.this$0;
                com.ybsdk.feature.kyc.internal.interactor.a aVar = bVar.E;
                List J0 = kotlin.collections.a.J0(((ajb0) bVar.X()).f.values());
                c03 c03Var = this.$screenContent.b;
                this.label = 1;
                Object h = aVar.h(J0, c03Var, str, this);
                if (h == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj2 = h;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                obj2 = ((Result) obj).getValue();
            }
            b bVar2 = this.this$0;
            Uri uri = this.$lastPhotoUri;
            Throwable a = Result.a(obj2);
            if (a != null) {
                pz40 Y = bVar2.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, ajb0.a((ajb0) value, false, null, null, null, kotlin.collections.b.f(), false, null, 219)));
                b.b0(bVar2, new SubmitV2Exception(a.getMessage(), a), uri);
            }
            b bVar3 = this.this$0;
            qib0 qib0Var = this.$screenContent;
            if (!(obj2 instanceof Result.Failure)) {
                bVar3.G.a(qib0Var.c);
            }
            return new Result(obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoViewModel$submitPhotos$1(b bVar, qib0 qib0Var, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$screenContent = qib0Var;
        this.$lastPhotoUri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PhotoViewModel$submitPhotos$1(this.this$0, this.$screenContent, this.$lastPhotoUri, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PhotoViewModel$submitPhotos$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(bVar, this.$screenContent, this.$lastPhotoUri, null);
            this.label = 1;
            if (d.a(bVar, anonymousClass1, this) == coroutineSingletons) {
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
