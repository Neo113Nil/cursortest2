package com.yandex.passport.internal.upgrader;

import com.yandex.passport.api.PassportAccountUpgradeStatus;
import com.yandex.passport.api.PassportAccountUpgrader$UpdateInterval;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.methods.MethodRef;
import defpackage.ny61;
import defpackage.rol0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class g {
    public final com.yandex.passport.internal.methods.requester.d a;
    public final s b;
    public final h c;
    public final com.yandex.passport.internal.ui.account_upgrade.j d = new com.yandex.passport.internal.ui.account_upgrade.j();

    public g(com.yandex.passport.internal.methods.requester.d dVar, s sVar, h hVar) {
        this.a = dVar;
        this.b = sVar;
        this.c = hVar;
    }

    public final com.yandex.passport.internal.ui.account_upgrade.j a() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(PassportUidImpl passportUidImpl, UpgradeStatusRequestType upgradeStatusRequestType, ContinuationImpl continuationImpl) {
        AccountUpgraderImpl$getStatus$1 accountUpgraderImpl$getStatus$1;
        int i;
        Object a;
        Throwable a2;
        boolean z;
        if (continuationImpl instanceof AccountUpgraderImpl$getStatus$1) {
            accountUpgraderImpl$getStatus$1 = (AccountUpgraderImpl$getStatus$1) continuationImpl;
            int i2 = accountUpgraderImpl$getStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accountUpgraderImpl$getStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = accountUpgraderImpl$getStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountUpgraderImpl$getStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.methods.requester.c cVar = new com.yandex.passport.internal.methods.requester.c(passportUidImpl, upgradeStatusRequestType);
                    accountUpgraderImpl$getStatus$1.L$0 = this;
                    accountUpgraderImpl$getStatus$1.label = 1;
                    a = this.a.a(cVar, accountUpgraderImpl$getStatus$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (g) accountUpgraderImpl$getStatus$1.L$0;
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    this.c.a(MethodRef.GetAccountUpgradeStatus, a2);
                }
                z = a instanceof Result.Failure;
                if (!z) {
                    PassportAccountUpgradeStatus passportAccountUpgradeStatus = (PassportAccountUpgradeStatus) a;
                    com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "New PassportAccountUpgradeStatus: " + passportAccountUpgradeStatus, 8);
                    }
                }
                if (z) {
                    return a;
                }
                return null;
            }
        }
        accountUpgraderImpl$getStatus$1 = new AccountUpgraderImpl$getStatus$1(this, continuationImpl);
        Object obj2 = accountUpgraderImpl$getStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountUpgraderImpl$getStatus$1.label;
        if (i != 0) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
        z = a instanceof Result.Failure;
        if (!z) {
        }
        if (z) {
        }
    }

    public final rol0 c(PassportUidImpl passportUidImpl, PassportAccountUpgrader$UpdateInterval passportAccountUpgrader$UpdateInterval) {
        return new rol0(new AccountUpgraderImpl$getUpgradeStatus$1(this, passportUidImpl, passportAccountUpgrader$UpdateInterval, null));
    }
}
