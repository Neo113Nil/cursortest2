package com.yandex.passport.internal.usecase;

import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes8.dex */
public final class q extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.core.accounts.d b;

    public q(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.d dVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    @Override // com.yandex.passport.common.domain.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, Continuation continuation) {
        Result.Failure failure;
        Object obj2;
        Throwable a;
        Uid uid = (Uid) obj;
        try {
            obj2 = this.b.a().e(uid);
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
            obj2 = failure;
            a = Result.a(obj2);
            if (a != null) {
            }
            if (!(obj2 instanceof Result.Failure)) {
            }
            return new Result(obj2);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            obj2 = failure;
            a = Result.a(obj2);
            if (a != null) {
            }
            if (!(obj2 instanceof Result.Failure)) {
            }
            return new Result(obj2);
        }
        a = Result.a(obj2);
        if (a != null) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Error searching master account for uid: " + uid, a);
            }
        }
        if (!(obj2 instanceof Result.Failure)) {
            try {
                obj2 = (ModernAccount) obj2;
                if (obj2 == null) {
                    throw new PassportAccountNotFoundException(uid);
                }
            } catch (Throwable th2) {
                obj2 = new Result.Failure(th2);
            }
        }
        return new Result(obj2);
    }
}
