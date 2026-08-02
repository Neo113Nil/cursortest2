package com.yandex.passport.internal.ui.challenge.changecurrent;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.usecase.j1;
import defpackage.jl40;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class f extends com.yandex.passport.internal.ui.challenge.o {
    public final j1 f;
    public final com.yandex.passport.internal.account.a g;

    public f(com.yandex.passport.internal.ui.challenge.j jVar, h hVar, com.yandex.passport.internal.ui.challenge.n nVar, j1 j1Var, com.yandex.passport.internal.account.a aVar) {
        super(jVar, hVar, nVar, true);
        this.f = j1Var;
        this.g = aVar;
    }

    @Override // com.yandex.passport.internal.ui.challenge.o
    public final Uid d() {
        ModernAccount a = this.g.a();
        Uid uid = a != null ? a.getUid() : null;
        if (jl40.l(uid, ((com.yandex.passport.internal.ui.challenge.j) this.a).a)) {
            return null;
        }
        return uid;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.yandex.passport.internal.ui.challenge.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        SetCurrentAccountModel$performChallengedAction$1 setCurrentAccountModel$performChallengedAction$1;
        int i;
        Object value;
        if (continuationImpl instanceof SetCurrentAccountModel$performChallengedAction$1) {
            setCurrentAccountModel$performChallengedAction$1 = (SetCurrentAccountModel$performChallengedAction$1) continuationImpl;
            int i2 = setCurrentAccountModel$performChallengedAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                setCurrentAccountModel$performChallengedAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = setCurrentAccountModel$performChallengedAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setCurrentAccountModel$performChallengedAction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    LogLevel logLevel = LogLevel.DEBUG;
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(logLevel, null, "Executing setCurrentAccountUseCase", 10);
                    }
                    Uid uid = ((com.yandex.passport.internal.ui.challenge.j) this.a).a;
                    setCurrentAccountModel$performChallengedAction$1.L$0 = this;
                    setCurrentAccountModel$performChallengedAction$1.label = 1;
                    obj = this.f.a(uid, setCurrentAccountModel$performChallengedAction$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (f) setCurrentAccountModel$performChallengedAction$1.L$0;
                    kotlin.b.b(obj);
                }
                value = ((Result) obj).getValue();
                if (Result.a(value) == null) {
                    this.getClass();
                    return com.yandex.passport.internal.ui.challenge.o.c();
                }
                this.getClass();
                return new com.yandex.passport.internal.ui.challenge.r(true);
            }
        }
        setCurrentAccountModel$performChallengedAction$1 = new SetCurrentAccountModel$performChallengedAction$1(this, continuationImpl);
        Object obj2 = setCurrentAccountModel$performChallengedAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setCurrentAccountModel$performChallengedAction$1.label;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (Result.a(value) == null) {
        }
    }
}
