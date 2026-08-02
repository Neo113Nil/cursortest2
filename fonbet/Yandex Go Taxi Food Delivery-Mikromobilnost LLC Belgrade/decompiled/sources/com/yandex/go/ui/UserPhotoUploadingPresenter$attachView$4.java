package com.yandex.go.ui;

import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qr21;
import defpackage.sls;
import defpackage.vpr;
import defpackage.xby;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Ltr21;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ui.UserPhotoUploadingPresenter$attachView$4", f = "UserPhotoUploadingPresenter.kt", l = {HProv.PP_VERSION_TIMESTAMP}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UserPhotoUploadingPresenter$attachView$4 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.ui.UserPhotoUploadingPresenter$attachView$4$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            d.Lg((d) this.receiver);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPhotoUploadingPresenter$attachView$4(d dVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UserPhotoUploadingPresenter$attachView$4 userPhotoUploadingPresenter$attachView$4 = new UserPhotoUploadingPresenter$attachView$4(this.this$0, (Continuation) obj3);
        userPhotoUploadingPresenter$attachView$4.L$0 = (vpr) obj;
        userPhotoUploadingPresenter$attachView$4.L$1 = (Throwable) obj2;
        return userPhotoUploadingPresenter$attachView$4.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Throwable th = (Throwable) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            hst hstVar = jst.e;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            xby.l(hstVar, "USER_PHOTO_UPLOAD:USER_PHOTO_UPLOADING_PRESENTER", null, th, message, 2);
            this.this$0.G.f();
            qr21 qr21Var = new qr21(new AnonymousClass1(0, this.this$0, d.class, "onRetryButtonClicked", "onRetryButtonClicked()V", 0));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(qr21Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
