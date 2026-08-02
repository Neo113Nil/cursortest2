package com.yandex.passport.internal.upgrader;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lcom/yandex/passport/api/PassportAccountUpgradeStatus;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.upgrader.UpgradeStatusUpdateScheduler$subscribeForUpdates$2", f = "UpgradeStatusUpdateScheduler.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UpgradeStatusUpdateScheduler$subscribeForUpdates$2 extends SuspendLambda implements wls {
    final /* synthetic */ o $subscription;
    final /* synthetic */ Uid $uid;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ s this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lcom/yandex/passport/api/PassportAccountUpgradeStatus;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "com.yandex.passport.internal.upgrader.UpgradeStatusUpdateScheduler$subscribeForUpdates$2$3", f = "UpgradeStatusUpdateScheduler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.passport.internal.upgrader.UpgradeStatusUpdateScheduler$subscribeForUpdates$2$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements zls {
        final /* synthetic */ o $subscription;
        int label;
        final /* synthetic */ s this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(s sVar, o oVar, Continuation continuation) {
            super(3, continuation);
            this.this$0 = sVar;
            this.$subscription = oVar;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$subscription, (Continuation) obj3);
            zy11 zy11Var = zy11.a;
            anonymousClass3.invokeSuspend(zy11Var);
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
            s sVar = this.this$0;
            o oVar = this.$subscription;
            sVar.getClass();
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "subscribeForUpdates: unsubscribe for uid=" + oVar.a + " thread=" + Thread.currentThread().getName(), 8);
            }
            if (sVar.c.remove(oVar)) {
                sVar.a();
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeStatusUpdateScheduler$subscribeForUpdates$2(s sVar, Uid uid, o oVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sVar;
        this.$uid = uid;
        this.$subscription = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpgradeStatusUpdateScheduler$subscribeForUpdates$2 upgradeStatusUpdateScheduler$subscribeForUpdates$2 = new UpgradeStatusUpdateScheduler$subscribeForUpdates$2(this.this$0, this.$uid, this.$subscription, continuation);
        upgradeStatusUpdateScheduler$subscribeForUpdates$2.L$0 = obj;
        return upgradeStatusUpdateScheduler$subscribeForUpdates$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpgradeStatusUpdateScheduler$subscribeForUpdates$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            s sVar = this.this$0;
            kotlinx.coroutines.flow.k kVar = new kotlinx.coroutines.flow.k(new com.yandex.passport.internal.ui.challenge.c(new com.yandex.passport.common.mvi.c(sVar.b, this.$uid, 13), 2), new AnonymousClass3(sVar, this.$subscription, null));
            this.L$0 = kVar;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(kVar, vprVar, this) == coroutineSingletons) {
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
