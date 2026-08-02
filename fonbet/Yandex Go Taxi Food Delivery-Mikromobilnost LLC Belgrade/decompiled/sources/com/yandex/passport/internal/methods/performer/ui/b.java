package com.yandex.passport.internal.methods.performer.ui;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.logger.c;
import com.yandex.passport.internal.core.accounts.d;
import com.yandex.passport.internal.methods.performer.w0;
import com.yandex.passport.internal.methods.t0;
import com.yandex.passport.internal.methods.x2;
import com.yandex.passport.internal.report.reporters.f;
import com.yandex.passport.internal.upgrader.UpgradeStatusRequestSource;
import com.yandex.passport.internal.upgrader.i;
import com.yandex.passport.internal.upgrader.j;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class b implements w0 {
    public final d a;
    public final j b;
    public final f c;

    public b(d dVar, j jVar, f fVar) {
        this.a = dVar;
        this.b = jVar;
        this.c = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, Uid uid, UpgradeStatusRequestSource upgradeStatusRequestSource, ContinuationImpl continuationImpl) {
        GetAccountUpgradeStatusPerformer$getActual$1 getAccountUpgradeStatusPerformer$getActual$1;
        int i;
        bVar.getClass();
        if (continuationImpl instanceof GetAccountUpgradeStatusPerformer$getActual$1) {
            getAccountUpgradeStatusPerformer$getActual$1 = (GetAccountUpgradeStatusPerformer$getActual$1) continuationImpl;
            int i2 = getAccountUpgradeStatusPerformer$getActual$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getAccountUpgradeStatusPerformer$getActual$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getAccountUpgradeStatusPerformer$getActual$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getAccountUpgradeStatusPerformer$getActual$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "getActual for Uid=" + uid, 8);
                    }
                    j jVar = bVar.b;
                    i iVar = new i(uid, upgradeStatusRequestSource);
                    getAccountUpgradeStatusPerformer$getActual$1.label = 1;
                    obj = jVar.a(iVar, getAccountUpgradeStatusPerformer$getActual$1);
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
                return ((Result) obj).getValue();
            }
        }
        getAccountUpgradeStatusPerformer$getActual$1 = new GetAccountUpgradeStatusPerformer$getActual$1(bVar, continuationImpl);
        Object obj2 = getAccountUpgradeStatusPerformer$getActual$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getAccountUpgradeStatusPerformer$getActual$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    @Override // com.yandex.passport.internal.methods.performer.w0
    public final Object a(x2 x2Var) {
        return com.yandex.passport.common.util.a.h(new GetAccountUpgradeStatusPerformer$performMethod$1((t0) x2Var, this, null));
    }
}
