package com.yandex.plus.pay.internal.feature.user;

import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.api.exception.PlusPayException;
import com.yandex.plus.pay.api.exception.PlusPayUnexpectedException;
import com.yandex.plus.pay.api.model.PlusPayUserStatus;
import defpackage.gt90;
import defpackage.mdd0;
import defpackage.ndd0;
import defpackage.ny61;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class a {
    public final d a;
    public final mdd0 b;

    public a(d dVar, ndd0 ndd0Var) {
        this.a = dVar;
        this.b = ndd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PlusPayUserServiceImpl$updateUserStatus$1 plusPayUserServiceImpl$updateUserStatus$1;
        int i;
        mdd0 mdd0Var;
        Result.Failure failure;
        Object obj;
        Throwable a;
        try {
            if (continuationImpl instanceof PlusPayUserServiceImpl$updateUserStatus$1) {
                plusPayUserServiceImpl$updateUserStatus$1 = (PlusPayUserServiceImpl$updateUserStatus$1) continuationImpl;
                int i2 = plusPayUserServiceImpl$updateUserStatus$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    plusPayUserServiceImpl$updateUserStatus$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = plusPayUserServiceImpl$updateUserStatus$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusPayUserServiceImpl$updateUserStatus$1.label;
                    mdd0 mdd0Var2 = this.b;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        LogPriority logPriority = LogPriority.DEBUG;
                        mdd0Var2.getClass();
                        ((ndd0) mdd0Var2).a(logPriority, "PlusPayUserService", "updateUserStatus()");
                        try {
                            d dVar = this.a;
                            plusPayUserServiceImpl$updateUserStatus$1.L$0 = mdd0Var2;
                            plusPayUserServiceImpl$updateUserStatus$1.L$1 = null;
                            plusPayUserServiceImpl$updateUserStatus$1.L$2 = null;
                            plusPayUserServiceImpl$updateUserStatus$1.L$3 = null;
                            plusPayUserServiceImpl$updateUserStatus$1.L$4 = null;
                            plusPayUserServiceImpl$updateUserStatus$1.I$0 = 0;
                            plusPayUserServiceImpl$updateUserStatus$1.I$1 = 0;
                            plusPayUserServiceImpl$updateUserStatus$1.I$2 = 0;
                            plusPayUserServiceImpl$updateUserStatus$1.I$3 = 0;
                            plusPayUserServiceImpl$updateUserStatus$1.I$4 = 0;
                            plusPayUserServiceImpl$updateUserStatus$1.I$5 = 0;
                            plusPayUserServiceImpl$updateUserStatus$1.label = 1;
                            obj2 = dVar.a(plusPayUserServiceImpl$updateUserStatus$1);
                            if (obj2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            mdd0Var = mdd0Var2;
                        } catch (TimeoutCancellationException e) {
                            e = e;
                            mdd0Var = mdd0Var2;
                            failure = new Result.Failure(e);
                            obj = failure;
                            a = Result.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            mdd0Var = mdd0Var2;
                            failure = new Result.Failure(th);
                            obj = failure;
                            a = Result.a(obj);
                            if (a == null) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mdd0Var = (mdd0) plusPayUserServiceImpl$updateUserStatus$1.L$0;
                        try {
                            kotlin.b.b(obj2);
                        } catch (TimeoutCancellationException e2) {
                            e = e2;
                            failure = new Result.Failure(e);
                            obj = failure;
                            a = Result.a(obj);
                            if (a == null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            failure = new Result.Failure(th);
                            obj = failure;
                            a = Result.a(obj);
                            if (a == null) {
                            }
                        }
                    }
                    obj = (PlusPayUserStatus) obj2;
                    a = Result.a(obj);
                    if (a == null) {
                        if (a instanceof PlusPayException) {
                            throw a;
                        }
                        mdd0.g(mdd0Var, gt90.a, "Unexpected error", a, 8);
                        throw new PlusPayUnexpectedException(a);
                    }
                    PlusPayUserStatus plusPayUserStatus = (PlusPayUserStatus) obj;
                    LogPriority logPriority2 = LogPriority.DEBUG;
                    mdd0Var2.getClass();
                    ((ndd0) mdd0Var2).a(logPriority2, "PlusPayUserService", "updateUserStatus() = " + plusPayUserStatus);
                    return plusPayUserStatus;
                }
            }
            if (i != 0) {
            }
            obj = (PlusPayUserStatus) obj2;
            a = Result.a(obj);
            if (a == null) {
            }
        } catch (CancellationException e3) {
            throw e3;
        }
        plusPayUserServiceImpl$updateUserStatus$1 = new PlusPayUserServiceImpl$updateUserStatus$1(this, continuationImpl);
        Object obj22 = plusPayUserServiceImpl$updateUserStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPayUserServiceImpl$updateUserStatus$1.label;
        mdd0 mdd0Var22 = this.b;
    }
}
