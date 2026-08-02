package com.yandex.messaging.internal.authorized.chat.notifications;

import defpackage.ad7;
import defpackage.g9v;
import defpackage.mfb1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xn50;
import defpackage.yn50;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Ltse;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.chat.notifications.NotificationAvatarLoader$tryLoadAvatar$2", f = "NotificationAvatarLoader.kt", l = {108}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class NotificationAvatarLoader$tryLoadAvatar$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $avatarUrl;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationAvatarLoader$tryLoadAvatar$2(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$avatarUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NotificationAvatarLoader$tryLoadAvatar$2(this.this$0, this.$avatarUrl, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NotificationAvatarLoader$tryLoadAvatar$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g9v load = this.this$0.d.load(this.$avatarUrl);
            int i2 = this.this$0.f;
            yn50 yn50Var = (yn50) load;
            xn50 xn50Var = yn50Var.b;
            xn50Var.i = i2;
            xn50Var.j = i2;
            this.label = 1;
            obj = mfb1.d(yn50Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ad7 ad7Var = (ad7) obj;
        if (ad7Var != null) {
            return ad7Var.a;
        }
        return null;
    }
}
