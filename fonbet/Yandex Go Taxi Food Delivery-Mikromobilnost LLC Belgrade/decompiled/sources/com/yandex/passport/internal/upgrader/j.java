package com.yandex.passport.internal.upgrader;

import com.yandex.passport.api.PassportAccountUpgradeStatus;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.data.network.t0;
import com.yandex.passport.data.network.x0;
import com.yandex.passport.data.network.y0;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.report.td;
import com.yandex.passport.internal.report.w;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.stash.StashCell;
import defpackage.ny61;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class j extends com.yandex.passport.common.domain.d {
    public final com.yandex.passport.internal.core.accounts.d b;
    public final y0 c;
    public final com.yandex.passport.internal.e d;
    public final n e;
    public final com.yandex.passport.internal.report.reporters.f f;
    public final com.yandex.passport.internal.network.mappers.b g;

    public j(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.d dVar, y0 y0Var, com.yandex.passport.internal.e eVar, n nVar, com.yandex.passport.internal.report.reporters.f fVar, com.yandex.passport.internal.network.mappers.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = dVar;
        this.c = y0Var;
        this.d = eVar;
        this.e = nVar;
        this.f = fVar;
        this.g = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(i iVar, ContinuationImpl continuationImpl) {
        GetUpgradeStatusUseCase$run$1 getUpgradeStatusUseCase$run$1;
        int i;
        MasterToken masterToken;
        i iVar2;
        Object obj;
        j jVar;
        Object value;
        if (continuationImpl instanceof GetUpgradeStatusUseCase$run$1) {
            getUpgradeStatusUseCase$run$1 = (GetUpgradeStatusUseCase$run$1) continuationImpl;
            int i2 = getUpgradeStatusUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getUpgradeStatusUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getUpgradeStatusUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getUpgradeStatusUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Uid b = iVar.b();
                    com.yandex.passport.internal.core.accounts.d dVar = this.b;
                    ModernAccount e = dVar.a().e(b);
                    Environment environment = iVar.b().getEnvironment();
                    this.g.getClass();
                    com.yandex.passport.data.models.g a = com.yandex.passport.internal.network.mappers.b.a(environment);
                    long locationId = e != null ? e.getLocationId() : 0L;
                    ModernAccount e2 = dVar.a().e(iVar.b());
                    if (e2 == null || (masterToken = e2.getMasterToken()) == null) {
                        masterToken = new MasterToken(null);
                    }
                    t0 t0Var = new t0(masterToken, a, locationId, this.d.a(), e != null ? e.m298getUpgradePostponedAtR7zlAxo() : 0L);
                    getUpgradeStatusUseCase$run$1.L$0 = this;
                    iVar2 = iVar;
                    getUpgradeStatusUseCase$run$1.L$1 = iVar2;
                    getUpgradeStatusUseCase$run$1.label = 1;
                    Object a2 = this.c.a(t0Var, getUpgradeStatusUseCase$run$1);
                    if (a2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a2;
                    jVar = this;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i iVar3 = (i) getUpgradeStatusUseCase$run$1.L$1;
                    jVar = (j) getUpgradeStatusUseCase$run$1.L$0;
                    kotlin.b.b(obj2);
                    obj = obj2;
                    iVar2 = iVar3;
                }
                Result result = (Result) obj;
                Object value2 = result.getValue();
                com.yandex.passport.internal.report.reporters.f fVar = jVar.f;
                com.yandex.passport.internal.core.accounts.d dVar2 = jVar.b;
                Uid b2 = iVar2.b();
                UpgradeStatusRequestSource a3 = iVar2.a();
                fVar.getClass();
                boolean z = false;
                fVar.f(w.w, new yd(b2), new yd(a3), new td(new com.yandex.passport.internal.core.announcing.f(6), value2));
                value = result.getValue();
                if (!(value instanceof Result.Failure)) {
                    try {
                        x0 x0Var = (x0) value;
                        ModernAccount e3 = dVar2.a().e(iVar2.b());
                        com.yandex.passport.common.time.a aVar = e3 != null ? new com.yandex.passport.common.time.a(e3.m298getUpgradePostponedAtR7zlAxo()) : null;
                        if (x0Var.e) {
                            value = PassportAccountUpgradeStatus.REQUIRED;
                        } else if (x0Var.d) {
                            value = PassportAccountUpgradeStatus.NEEDED;
                        } else if (x0Var.b) {
                            value = PassportAccountUpgradeStatus.NOT_NEEDED;
                        } else if (x0Var.c) {
                            if (aVar != null) {
                                z = com.yandex.passport.common.time.a.e(aVar.a, 0L);
                            }
                            value = !z ? PassportAccountUpgradeStatus.SKIPPED : PassportAccountUpgradeStatus.NOT_NEEDED;
                        } else {
                            value = PassportAccountUpgradeStatus.NOT_NEEDED;
                        }
                    } catch (Throwable th) {
                        value = new Result.Failure(th);
                    }
                }
                if (!(value instanceof Result.Failure)) {
                    PassportAccountUpgradeStatus passportAccountUpgradeStatus = (PassportAccountUpgradeStatus) value;
                    ModernAccount e4 = dVar2.a().e(iVar2.b());
                    if (e4 != null) {
                        com.yandex.passport.internal.core.accounts.g.i(jVar.e.a, e4, new Pair[]{new Pair(StashCell.UPGRADE_STATUS, String.valueOf(passportAccountUpgradeStatus.ordinal()))});
                    }
                }
                return new Result(value);
            }
        }
        getUpgradeStatusUseCase$run$1 = new GetUpgradeStatusUseCase$run$1(this, continuationImpl);
        Object obj22 = getUpgradeStatusUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getUpgradeStatusUseCase$run$1.label;
        if (i != 0) {
        }
        Result result2 = (Result) obj;
        Object value22 = result2.getValue();
        com.yandex.passport.internal.report.reporters.f fVar2 = jVar.f;
        com.yandex.passport.internal.core.accounts.d dVar22 = jVar.b;
        Uid b22 = iVar2.b();
        UpgradeStatusRequestSource a32 = iVar2.a();
        fVar2.getClass();
        boolean z2 = false;
        fVar2.f(w.w, new yd(b22), new yd(a32), new td(new com.yandex.passport.internal.core.announcing.f(6), value22));
        value = result2.getValue();
        if (!(value instanceof Result.Failure)) {
        }
        if (!(value instanceof Result.Failure)) {
        }
        return new Result(value);
    }
}
