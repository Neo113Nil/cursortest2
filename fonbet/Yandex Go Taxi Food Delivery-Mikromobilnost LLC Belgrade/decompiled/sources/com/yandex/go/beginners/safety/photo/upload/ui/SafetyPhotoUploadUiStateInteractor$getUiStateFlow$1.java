package com.yandex.go.beginners.safety.photo.upload.ui;

import defpackage.fyl0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qxl0;
import defpackage.zls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqxl0;", ClidProvider.STATE, "Lfyl0;", Constants.KEY_DATA, "Leyl0;", "<anonymous>", "(Lqxl0;Lfyl0;)Leyl0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.beginners.safety.photo.upload.ui.SafetyPhotoUploadUiStateInteractor$getUiStateFlow$1", f = "SafetyPhotoUploadUiStateInteractor.kt", l = {34}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SafetyPhotoUploadUiStateInteractor$getUiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyPhotoUploadUiStateInteractor$getUiStateFlow$1(b bVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SafetyPhotoUploadUiStateInteractor$getUiStateFlow$1 safetyPhotoUploadUiStateInteractor$getUiStateFlow$1 = new SafetyPhotoUploadUiStateInteractor$getUiStateFlow$1(this.this$0, (Continuation) obj3);
        safetyPhotoUploadUiStateInteractor$getUiStateFlow$1.L$0 = (qxl0) obj;
        safetyPhotoUploadUiStateInteractor$getUiStateFlow$1.L$1 = (fyl0) obj2;
        return safetyPhotoUploadUiStateInteractor$getUiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qxl0 qxl0Var = (qxl0) this.L$0;
        fyl0 fyl0Var = (fyl0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        Object a = b.a(bVar, qxl0Var, fyl0Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
