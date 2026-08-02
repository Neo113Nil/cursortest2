package com.yandex.go.domain.interactor;

import com.yandex.go.experiment.UserPhotoUploadingExperiment;
import defpackage.bms;
import defpackage.evu0;
import defpackage.mq21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zp21;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "isNotificationsEnabled", "Lcom/yandex/go/experiment/UserPhotoUploadingExperiment;", "experiment", "Lzp21;", "userPhoto", "Lmq21;", "<anonymous>", "(ZLcom/yandex/go/experiment/UserPhotoUploadingExperiment;Lzp21;)Lmq21;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.domain.interactor.UserPhotoNotificationInteractor$onLargestContentfulPaint$2", f = "UserPhotoNotificationInteractor.kt", l = {99}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class UserPhotoNotificationInteractor$onLargestContentfulPaint$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserPhotoNotificationInteractor$onLargestContentfulPaint$2(b bVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        UserPhotoNotificationInteractor$onLargestContentfulPaint$2 userPhotoNotificationInteractor$onLargestContentfulPaint$2 = new UserPhotoNotificationInteractor$onLargestContentfulPaint$2(this.this$0, (Continuation) obj4);
        userPhotoNotificationInteractor$onLargestContentfulPaint$2.Z$0 = booleanValue;
        userPhotoNotificationInteractor$onLargestContentfulPaint$2.L$0 = (UserPhotoUploadingExperiment) obj2;
        userPhotoNotificationInteractor$onLargestContentfulPaint$2.L$1 = (zp21) obj3;
        return userPhotoNotificationInteractor$onLargestContentfulPaint$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        UserPhotoUploadingExperiment userPhotoUploadingExperiment = (UserPhotoUploadingExperiment) this.L$0;
        zp21 zp21Var = (zp21) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (z && userPhotoUploadingExperiment.b && zp21Var != null) {
                String str = zp21Var.b;
                String str2 = zp21Var.a;
                if (!evu0.J(str2) && !evu0.J(str)) {
                    b bVar = this.this$0;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.Z$0 = z;
                    this.label = 1;
                    obj = b.d(bVar, str2, str, userPhotoUploadingExperiment, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return null;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return (mq21) obj;
    }
}
