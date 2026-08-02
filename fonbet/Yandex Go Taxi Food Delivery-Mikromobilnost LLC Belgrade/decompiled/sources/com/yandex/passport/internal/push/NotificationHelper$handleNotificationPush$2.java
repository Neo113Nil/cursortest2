package com.yandex.passport.internal.push;

import android.os.Bundle;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/passport/sloth/data/SlothParams;", "<anonymous>", "(Ltse;)Lcom/yandex/passport/sloth/data/SlothParams;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.push.NotificationHelper$handleNotificationPush$2", f = "NotificationHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class NotificationHelper$handleNotificationPush$2 extends SuspendLambda implements wls {
    final /* synthetic */ Bundle $data;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationHelper$handleNotificationPush$2(h hVar, Bundle bundle, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$data = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NotificationHelper$handleNotificationPush$2(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NotificationHelper$handleNotificationPush$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        PushPayload a = this.this$0.m.a(this.$data);
        ModernAccount l = this.this$0.l(a.getUid(), com.yandex.passport.internal.properties.u.S(a));
        if (l != null) {
            c0 c0Var = this.this$0.o;
            Uid uid = l.getUid();
            c0Var.getClass();
            return c0Var.e(uid, a.getWebviewUrl(), a.getPushType());
        }
        throw new IllegalStateException("No authorized account with " + a.getUid());
    }
}
