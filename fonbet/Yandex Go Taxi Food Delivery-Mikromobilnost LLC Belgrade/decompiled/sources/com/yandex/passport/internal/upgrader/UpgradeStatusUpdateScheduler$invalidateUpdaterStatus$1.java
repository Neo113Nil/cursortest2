package com.yandex.passport.internal.upgrader;

import com.yandex.passport.api.PassportAccountUpgradeStatus;
import com.yandex.passport.common.core.Uid;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/passport/common/core/Uid;", "uid", "Lcom/yandex/passport/api/PassportAccountUpgradeStatus;", ACSPConstants.STATUS, "Lzy11;", "<anonymous>", "(Lcom/yandex/passport/common/core/Uid;Lcom/yandex/passport/api/PassportAccountUpgradeStatus;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.upgrader.UpgradeStatusUpdateScheduler$invalidateUpdaterStatus$1", f = "UpgradeStatusUpdateScheduler.kt", l = {72}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UpgradeStatusUpdateScheduler$invalidateUpdaterStatus$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeStatusUpdateScheduler$invalidateUpdaterStatus$1(s sVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = sVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UpgradeStatusUpdateScheduler$invalidateUpdaterStatus$1 upgradeStatusUpdateScheduler$invalidateUpdaterStatus$1 = new UpgradeStatusUpdateScheduler$invalidateUpdaterStatus$1(this.this$0, (Continuation) obj3);
        upgradeStatusUpdateScheduler$invalidateUpdaterStatus$1.L$0 = (Uid) obj;
        upgradeStatusUpdateScheduler$invalidateUpdaterStatus$1.L$1 = (PassportAccountUpgradeStatus) obj2;
        return upgradeStatusUpdateScheduler$invalidateUpdaterStatus$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Uid uid = (Uid) this.L$0;
            PassportAccountUpgradeStatus passportAccountUpgradeStatus = (PassportAccountUpgradeStatus) this.L$1;
            n0 n0Var = this.this$0.b;
            p pVar = new p(uid, passportAccountUpgradeStatus);
            this.L$0 = null;
            this.label = 1;
            if (n0Var.emit(pVar, this) == coroutineSingletons) {
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
