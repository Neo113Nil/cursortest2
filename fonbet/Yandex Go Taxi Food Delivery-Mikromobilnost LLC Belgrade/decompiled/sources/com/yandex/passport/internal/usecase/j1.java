package com.yandex.passport.internal.usecase;

import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import defpackage.kgx;
import defpackage.uo2;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes8.dex */
public final class j1 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.core.accounts.d b;
    public final com.yandex.passport.internal.account.b c;
    public final com.yandex.passport.internal.analytics.c0 d;

    public j1(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.account.b bVar, com.yandex.passport.internal.analytics.c0 c0Var) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = dVar;
        this.c = bVar;
        this.d = c0Var;
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        Uid uid = (Uid) obj;
        Object obj2 = zy11.a;
        com.yandex.passport.internal.analytics.c0 c0Var = this.d;
        com.yandex.passport.internal.account.b bVar = this.c;
        try {
            if (uid != null) {
                ModernAccount e = this.b.a().e(uid);
                if (e == null) {
                    throw new PassportAccountNotFoundException(uid);
                }
                bVar.b(uid);
                c0Var.e(e);
            } else {
                com.yandex.passport.internal.storage.i iVar = bVar.a;
                uo2 uo2Var = iVar.c;
                kgx[] kgxVarArr = com.yandex.passport.internal.storage.i.m;
                uo2Var.setValue(iVar, kgxVarArr[1], null);
                iVar.d.setValue(iVar, kgxVarArr[2], null);
                bVar.b.g(obj2);
                c0Var.d();
            }
        } catch (TimeoutCancellationException e2) {
            obj2 = new Result.Failure(e2);
        } catch (CancellationException e3) {
            throw e3;
        } catch (Throwable th) {
            obj2 = new Result.Failure(th);
        }
        return new Result(obj2);
    }
}
