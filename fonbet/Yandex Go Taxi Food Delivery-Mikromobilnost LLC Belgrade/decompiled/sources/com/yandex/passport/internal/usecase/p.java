package com.yandex.passport.internal.usecase;

import com.yandex.passport.api.PassportAccountUpgradeStatus;
import com.yandex.passport.api.PassportSocialProviderCode;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.UserInfo;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.database.DatabaseHelper;
import com.yandex.passport.internal.stash.Stash;
import com.yandex.passport.internal.stash.StashCell;
import defpackage.ny61;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class p extends com.yandex.passport.common.domain.a {
    public final t b;
    public final com.yandex.passport.internal.report.reporters.b1 c;
    public final DatabaseHelper d;
    public final com.yandex.passport.common.ui.lang.b e;

    public p(com.yandex.passport.common.coroutine.a aVar, t tVar, com.yandex.passport.internal.report.reporters.b1 b1Var, DatabaseHelper databaseHelper, com.yandex.passport.common.ui.lang.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        this.b = tVar;
        this.c = b1Var;
        this.d = databaseHelper;
        this.e = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable c(p pVar, o oVar, ContinuationImpl continuationImpl) {
        FetchModernAccountUseCase$run$1 fetchModernAccountUseCase$run$1;
        int i;
        o oVar2;
        Object value;
        p pVar2 = pVar;
        if (continuationImpl instanceof FetchModernAccountUseCase$run$1) {
            fetchModernAccountUseCase$run$1 = (FetchModernAccountUseCase$run$1) continuationImpl;
            int i2 = fetchModernAccountUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fetchModernAccountUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fetchModernAccountUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fetchModernAccountUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String b = com.yandex.passport.common.ui.lang.a.b(((com.yandex.passport.internal.ui.lang.a) pVar2.e).b());
                    t tVar = pVar2.b;
                    s sVar = new s(oVar.d(), oVar.b(), oVar.c(), b, null);
                    fetchModernAccountUseCase$run$1.L$0 = pVar2;
                    oVar2 = oVar;
                    fetchModernAccountUseCase$run$1.L$1 = oVar2;
                    fetchModernAccountUseCase$run$1.label = 1;
                    obj = tVar.a(sVar, fetchModernAccountUseCase$run$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o oVar3 = (o) fetchModernAccountUseCase$run$1.L$1;
                    p pVar3 = (p) fetchModernAccountUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                    oVar2 = oVar3;
                    pVar2 = pVar3;
                }
                value = ((Result) obj).getValue();
                if (!(value instanceof Result.Failure)) {
                    r rVar = (r) value;
                    UserInfo d = rVar.d();
                    pVar2.c.l(d.getUidValue(), d.getMuidValue(), d.getHasMasterToken(), oVar2.a(), new Long(oVar2.c()));
                    Stash.Companion.getClass();
                    Stash a = com.yandex.passport.internal.stash.a.a();
                    if (d.getPrimaryAliasType() == 12) {
                        StashCell stashCell = StashCell.MAILISH_SOCIAL_CODE;
                        PassportSocialProviderCode e = oVar2.e();
                        a = a.with(stashCell, e != null ? e.getCodeString() : null, true);
                    }
                    Stash stash = a;
                    Environment b2 = oVar2.b();
                    MasterToken b3 = rVar.b();
                    if (b3 == null) {
                        b3 = oVar2.d();
                    }
                    ModernAccount a2 = com.yandex.passport.internal.l.a(b2, b3, d, stash, null);
                    pVar2.d.updateChildren(a2.getAccountName(), rVar.a());
                    PassportAccountUpgradeStatus c = rVar.c();
                    value = c != null ? ModernAccount.copy$default(a2, null, null, null, null, null, Stash.with$default(stash, StashCell.UPGRADE_STATUS, String.valueOf(c.ordinal()), false, 4, null), 31, null) : a2;
                }
                return new Result(value);
            }
        }
        fetchModernAccountUseCase$run$1 = new FetchModernAccountUseCase$run$1(pVar2, continuationImpl);
        Object obj2 = fetchModernAccountUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fetchModernAccountUseCase$run$1.label;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        return new Result(value);
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        return c(this, (o) obj, (ContinuationImpl) continuation);
    }
}
