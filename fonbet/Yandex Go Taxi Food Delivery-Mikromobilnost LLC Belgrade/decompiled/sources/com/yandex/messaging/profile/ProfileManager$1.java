package com.yandex.messaging.profile;

import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import com.yandex.messaging.internal.storage.i;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qhq0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.profile.ProfileManager$1", f = "ProfileManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ProfileManager$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileManager$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProfileManager$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ProfileManager$1 profileManager$1 = (ProfileManager$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        profileManager$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        i iVar = this.this$0.g;
        final Looper looper = iVar.g;
        final qhq0 qhq0Var = new qhq0(15, iVar);
        looper.getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: ryy0
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                new Handler(looper).post(new ymp0(12, qhq0Var));
                return false;
            }
        });
        return zy11.a;
    }
}
