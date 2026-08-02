package com.yandex.passport.internal.upgrader;

import com.yandex.passport.api.PassportAccountUpgradeStatus;
import com.yandex.passport.api.PassportAccountUpgrader$UpdateInterval;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.l2;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lcom/yandex/passport/api/PassportAccountUpgradeStatus;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.upgrader.AccountUpgraderImpl$getUpgradeStatus$1", f = "AccountUpgraderImpl.kt", l = {45, 45, 46, 46}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AccountUpgraderImpl$getUpgradeStatus$1 extends SuspendLambda implements wls {
    final /* synthetic */ k2 $uid;
    final /* synthetic */ PassportAccountUpgrader$UpdateInterval $updateInterval;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountUpgraderImpl$getUpgradeStatus$1(g gVar, k2 k2Var, PassportAccountUpgrader$UpdateInterval passportAccountUpgrader$UpdateInterval, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$uid = k2Var;
        this.$updateInterval = passportAccountUpgrader$UpdateInterval;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AccountUpgraderImpl$getUpgradeStatus$1 accountUpgraderImpl$getUpgradeStatus$1 = new AccountUpgraderImpl$getUpgradeStatus$1(this.this$0, this.$uid, this.$updateInterval, continuation);
        accountUpgraderImpl$getUpgradeStatus$1.L$0 = obj;
        return accountUpgraderImpl$getUpgradeStatus$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountUpgraderImpl$getUpgradeStatus$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d4, code lost:
    
        if (kotlinx.coroutines.flow.e.u((defpackage.tpr) r11, r1, r10) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c7, code lost:
    
        if (r11 != r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        s sVar;
        o oVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar2 = (vpr) this.L$0;
            g gVar = this.this$0;
            k2 k2Var = this.$uid;
            PassportUidImpl.Companion.getClass();
            PassportUidImpl a = l2.a(k2Var);
            this.L$0 = vprVar2;
            this.label = 1;
            gVar.getClass();
            Object b = gVar.b(a, UpgradeStatusRequestType.CACHED, this);
            if (b != coroutineSingletons) {
                vprVar = vprVar2;
                obj = b;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            vprVar = (vpr) this.L$0;
            kotlin.b.b(obj);
        } else if (i == 2) {
            vprVar = (vpr) this.L$0;
            kotlin.b.b(obj);
            sVar = this.this$0.b;
            Uid B = com.yandex.passport.internal.util.p.B(this.$uid);
            PassportAccountUpgrader$UpdateInterval passportAccountUpgrader$UpdateInterval = this.$updateInterval;
            this.L$0 = vprVar;
            this.label = 3;
            oVar = new o(B, passportAccountUpgrader$UpdateInterval);
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "subscribeForUpdates: subscribe for uid=" + B + " thread=" + Thread.currentThread().getName(), 8);
            }
            if (sVar.c.add(oVar)) {
                sVar.a();
            }
            obj = new rol0(new UpgradeStatusUpdateScheduler$subscribeForUpdates$2(sVar, B, oVar, null));
        } else {
            if (i != 3) {
                if (i == 4) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$0;
            kotlin.b.b(obj);
            this.L$0 = null;
            this.label = 4;
        }
        PassportAccountUpgradeStatus passportAccountUpgradeStatus = (PassportAccountUpgradeStatus) obj;
        if (passportAccountUpgradeStatus != null) {
            this.L$0 = vprVar;
            this.label = 2;
        }
        sVar = this.this$0.b;
        Uid B2 = com.yandex.passport.internal.util.p.B(this.$uid);
        PassportAccountUpgrader$UpdateInterval passportAccountUpgrader$UpdateInterval2 = this.$updateInterval;
        this.L$0 = vprVar;
        this.label = 3;
        oVar = new o(B2, passportAccountUpgrader$UpdateInterval2);
        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
        }
        if (sVar.c.add(oVar)) {
        }
        obj = new rol0(new UpgradeStatusUpdateScheduler$subscribeForUpdates$2(sVar, B2, oVar, null));
    }
}
