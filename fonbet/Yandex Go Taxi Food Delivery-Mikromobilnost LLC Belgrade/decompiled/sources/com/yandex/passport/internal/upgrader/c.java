package com.yandex.passport.internal.upgrader;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.report.b0;
import com.yandex.passport.internal.report.td;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.report.z;
import defpackage.ny61;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class c extends com.yandex.passport.common.domain.d {
    public final k b;
    public final com.yandex.passport.internal.core.accounts.d c;
    public final com.yandex.passport.internal.report.reporters.f d;

    public c(com.yandex.passport.common.coroutine.a aVar, k kVar, com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.report.reporters.f fVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = kVar;
        this.c = dVar;
        this.d = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(b bVar, ContinuationImpl continuationImpl) {
        AccountUpgradeLaunchUseCase$run$1 accountUpgradeLaunchUseCase$run$1;
        int i;
        Uid uid;
        Object value;
        if (continuationImpl instanceof AccountUpgradeLaunchUseCase$run$1) {
            accountUpgradeLaunchUseCase$run$1 = (AccountUpgradeLaunchUseCase$run$1) continuationImpl;
            int i2 = accountUpgradeLaunchUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accountUpgradeLaunchUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = accountUpgradeLaunchUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountUpgradeLaunchUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    uid = bVar.a.getUid();
                    com.yandex.passport.internal.report.reporters.f fVar = this.d;
                    fVar.getClass();
                    fVar.g(z.w, uid);
                    accountUpgradeLaunchUseCase$run$1.L$0 = this;
                    accountUpgradeLaunchUseCase$run$1.L$1 = uid;
                    accountUpgradeLaunchUseCase$run$1.label = 1;
                    obj = this.b.a(uid, accountUpgradeLaunchUseCase$run$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Uid uid2 = (Uid) accountUpgradeLaunchUseCase$run$1.L$1;
                    c cVar = (c) accountUpgradeLaunchUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                    uid = uid2;
                    this = cVar;
                }
                Result result = (Result) obj;
                Object value2 = result.getValue();
                com.yandex.passport.internal.report.reporters.f fVar2 = this.d;
                fVar2.getClass();
                fVar2.f(b0.w, new yd(uid), new td(com.yandex.passport.internal.report.reporters.e.a, value2));
                value = result.getValue();
                if (!(value instanceof Result.Failure)) {
                    try {
                        value = new a(this.c.a().e(uid), ((com.yandex.passport.common.url.b) value).a);
                    } catch (Throwable th) {
                        value = new Result.Failure(th);
                    }
                }
                return new Result(value);
            }
        }
        accountUpgradeLaunchUseCase$run$1 = new AccountUpgradeLaunchUseCase$run$1(this, continuationImpl);
        Object obj2 = accountUpgradeLaunchUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountUpgradeLaunchUseCase$run$1.label;
        if (i != 0) {
        }
        Result result2 = (Result) obj2;
        Object value22 = result2.getValue();
        com.yandex.passport.internal.report.reporters.f fVar22 = this.d;
        fVar22.getClass();
        fVar22.f(b0.w, new yd(uid), new td(com.yandex.passport.internal.report.reporters.e.a, value22));
        value = result2.getValue();
        if (!(value instanceof Result.Failure)) {
        }
        return new Result(value);
    }
}
