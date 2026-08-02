package com.yandex.passport.internal.usecase;

import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.network.id;
import com.yandex.passport.data.network.jd;
import com.yandex.passport.data.network.qd;
import com.yandex.passport.internal.ModernAccount;
import defpackage.ny61;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes8.dex */
public final class p1 extends com.yandex.passport.common.domain.a {
    public final qd b;
    public final com.yandex.passport.internal.core.accounts.d c;
    public final com.yandex.passport.internal.network.mappers.b d;
    public final com.yandex.passport.internal.report.reporters.h0 e;

    public p1(com.yandex.passport.common.coroutine.a aVar, qd qdVar, com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.report.reporters.h0 h0Var) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        this.b = qdVar;
        this.c = dVar;
        this.d = bVar;
        this.e = h0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009e A[Catch: all -> 0x00f7, CancellationException -> 0x00ff, TimeoutCancellationException -> 0x0102, TryCatch #2 {TimeoutCancellationException -> 0x0102, CancellationException -> 0x00ff, all -> 0x00f7, blocks: (B:11:0x002c, B:12:0x0094, B:14:0x009e, B:15:0x00be, B:17:0x00c4, B:18:0x00d9, B:20:0x00dd, B:21:0x00e7, B:27:0x003a, B:29:0x004a, B:32:0x00ed, B:33:0x00f6), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c4 A[Catch: all -> 0x00f7, CancellationException -> 0x00ff, TimeoutCancellationException -> 0x0102, TryCatch #2 {TimeoutCancellationException -> 0x0102, CancellationException -> 0x00ff, all -> 0x00f7, blocks: (B:11:0x002c, B:12:0x0094, B:14:0x009e, B:15:0x00be, B:17:0x00c4, B:18:0x00d9, B:20:0x00dd, B:21:0x00e7, B:27:0x003a, B:29:0x004a, B:32:0x00ed, B:33:0x00f6), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dd A[Catch: all -> 0x00f7, CancellationException -> 0x00ff, TimeoutCancellationException -> 0x0102, TryCatch #2 {TimeoutCancellationException -> 0x0102, CancellationException -> 0x00ff, all -> 0x00f7, blocks: (B:11:0x002c, B:12:0x0094, B:14:0x009e, B:15:0x00be, B:17:0x00c4, B:18:0x00d9, B:20:0x00dd, B:21:0x00e7, B:27:0x003a, B:29:0x004a, B:32:0x00ed, B:33:0x00f6), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(o1 o1Var, ContinuationImpl continuationImpl) {
        TryAddPlusDeviceUseCase$run$1 tryAddPlusDeviceUseCase$run$1;
        int i;
        Result.Failure failure;
        Object value;
        Throwable a;
        try {
            if (continuationImpl instanceof TryAddPlusDeviceUseCase$run$1) {
                tryAddPlusDeviceUseCase$run$1 = (TryAddPlusDeviceUseCase$run$1) continuationImpl;
                int i2 = tryAddPlusDeviceUseCase$run$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    tryAddPlusDeviceUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = tryAddPlusDeviceUseCase$run$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = tryAddPlusDeviceUseCase$run$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        ModernAccount e = this.c.a().e(o1Var.d());
                        if (e == null) {
                            throw new PassportAccountNotFoundException(o1Var.d());
                        }
                        this.e.n(o1Var.d(), o1Var.c(), o1Var.a(), o1Var.b());
                        qd qdVar = this.b;
                        MasterToken masterToken = e.getMasterToken();
                        com.yandex.passport.internal.network.mappers.b bVar = this.d;
                        Environment environment = o1Var.d().getEnvironment();
                        bVar.getClass();
                        jd jdVar = new jd(e.getLocationId(), masterToken, com.yandex.passport.internal.network.mappers.b.a(environment), o1Var.c(), o1Var.a());
                        tryAddPlusDeviceUseCase$run$1.L$0 = this;
                        tryAddPlusDeviceUseCase$run$1.L$1 = o1Var;
                        tryAddPlusDeviceUseCase$run$1.label = 1;
                        obj = qdVar.a(jdVar, tryAddPlusDeviceUseCase$run$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o1Var = (o1) tryAddPlusDeviceUseCase$run$1.L$1;
                        this = (p1) tryAddPlusDeviceUseCase$run$1.L$0;
                        kotlin.b.b(obj);
                    }
                    value = ((Result) obj).getValue();
                    if (!(value instanceof Result.Failure)) {
                        id idVar = (id) value;
                        this.e.l(o1Var.c(), o1Var.a(), o1Var.d(), idVar.a(), o1Var.b(), idVar.b());
                    }
                    a = Result.a(value);
                    if (a != null) {
                        this.e.k(o1Var.c(), o1Var.a(), o1Var.d(), a, o1Var.b());
                    }
                    if (!(value instanceof Result.Failure)) {
                        value = Boolean.valueOf(((id) value).a());
                    }
                    return new Result(value);
                }
            }
            if (i != 0) {
            }
            value = ((Result) obj).getValue();
            if (!(value instanceof Result.Failure)) {
            }
            a = Result.a(value);
            if (a != null) {
            }
            if (!(value instanceof Result.Failure)) {
            }
            return new Result(value);
        } catch (TimeoutCancellationException e2) {
            failure = new Result.Failure(e2);
            return new Result(failure);
        } catch (CancellationException e3) {
            throw e3;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            return new Result(failure);
        }
        tryAddPlusDeviceUseCase$run$1 = new TryAddPlusDeviceUseCase$run$1(this, continuationImpl);
        Object obj2 = tryAddPlusDeviceUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tryAddPlusDeviceUseCase$run$1.label;
    }
}
