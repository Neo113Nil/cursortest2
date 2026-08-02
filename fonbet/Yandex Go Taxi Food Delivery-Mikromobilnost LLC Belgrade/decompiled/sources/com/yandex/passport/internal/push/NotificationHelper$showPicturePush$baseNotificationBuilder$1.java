package com.yandex.passport.internal.push;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroidx/core/app/v;", "<anonymous>", "(Ltse;)Landroidx/core/app/v;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.push.NotificationHelper$showPicturePush$baseNotificationBuilder$1", f = "NotificationHelper.kt", l = {156}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class NotificationHelper$showPicturePush$baseNotificationBuilder$1 extends SuspendLambda implements wls {
    final /* synthetic */ ModernAccount $account;
    final /* synthetic */ PicturePayload $payload;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationHelper$showPicturePush$baseNotificationBuilder$1(h hVar, PicturePayload picturePayload, ModernAccount modernAccount, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$payload = picturePayload;
        this.$account = modernAccount;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NotificationHelper$showPicturePush$baseNotificationBuilder$1(this.this$0, this.$payload, this.$account, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NotificationHelper$showPicturePush$baseNotificationBuilder$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        i iVar = this.this$0.p;
        PicturePayload picturePayload = this.$payload;
        Uid uid = this.$account.getUid();
        this.label = 1;
        Object a = iVar.a(picturePayload, uid, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
