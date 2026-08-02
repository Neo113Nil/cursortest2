package com.yandex.plus.pay.internal.feature.user;

import com.yandex.plus.pay.api.exception.PlusPayException;
import com.yandex.plus.pay.api.exception.PlusPayUnexpectedException;
import com.yandex.plus.pay.internal.model.PlusPayUserAvatarInfo;
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
public final class b {
    public final e a;
    public final mdd0 b;

    public b(e eVar, ndd0 ndd0Var) {
        this.a = eVar;
        this.b = ndd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PlusPayUserServiceInternalImpl$getUserAvatarInfo$1 plusPayUserServiceInternalImpl$getUserAvatarInfo$1;
        int i;
        Throwable th;
        mdd0 mdd0Var;
        TimeoutCancellationException e;
        Result.Failure failure;
        Object obj;
        Throwable a;
        try {
            if (continuationImpl instanceof PlusPayUserServiceInternalImpl$getUserAvatarInfo$1) {
                plusPayUserServiceInternalImpl$getUserAvatarInfo$1 = (PlusPayUserServiceInternalImpl$getUserAvatarInfo$1) continuationImpl;
                int i2 = plusPayUserServiceInternalImpl$getUserAvatarInfo$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    plusPayUserServiceInternalImpl$getUserAvatarInfo$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = plusPayUserServiceInternalImpl$getUserAvatarInfo$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusPayUserServiceInternalImpl$getUserAvatarInfo$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        mdd0 mdd0Var2 = this.b;
                        try {
                            e eVar = this.a;
                            plusPayUserServiceInternalImpl$getUserAvatarInfo$1.L$0 = mdd0Var2;
                            plusPayUserServiceInternalImpl$getUserAvatarInfo$1.L$1 = null;
                            plusPayUserServiceInternalImpl$getUserAvatarInfo$1.L$2 = null;
                            plusPayUserServiceInternalImpl$getUserAvatarInfo$1.L$3 = null;
                            plusPayUserServiceInternalImpl$getUserAvatarInfo$1.L$4 = null;
                            plusPayUserServiceInternalImpl$getUserAvatarInfo$1.I$0 = 0;
                            plusPayUserServiceInternalImpl$getUserAvatarInfo$1.I$1 = 0;
                            plusPayUserServiceInternalImpl$getUserAvatarInfo$1.I$2 = 0;
                            plusPayUserServiceInternalImpl$getUserAvatarInfo$1.I$3 = 0;
                            plusPayUserServiceInternalImpl$getUserAvatarInfo$1.I$4 = 0;
                            plusPayUserServiceInternalImpl$getUserAvatarInfo$1.I$5 = 0;
                            plusPayUserServiceInternalImpl$getUserAvatarInfo$1.label = 1;
                            Object a2 = eVar.a(plusPayUserServiceInternalImpl$getUserAvatarInfo$1);
                            if (a2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            obj2 = a2;
                            mdd0Var = mdd0Var2;
                        } catch (TimeoutCancellationException e2) {
                            e = e2;
                            mdd0Var = mdd0Var2;
                            failure = new Result.Failure(e);
                            obj = failure;
                            a = Result.a(obj);
                            if (a != null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            mdd0Var = mdd0Var2;
                            failure = new Result.Failure(th);
                            obj = failure;
                            a = Result.a(obj);
                            if (a != null) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mdd0Var = (mdd0) plusPayUserServiceInternalImpl$getUserAvatarInfo$1.L$0;
                        try {
                            kotlin.b.b(obj2);
                        } catch (TimeoutCancellationException e3) {
                            e = e3;
                            failure = new Result.Failure(e);
                            obj = failure;
                            a = Result.a(obj);
                            if (a != null) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            failure = new Result.Failure(th);
                            obj = failure;
                            a = Result.a(obj);
                            if (a != null) {
                            }
                        }
                    }
                    obj = (PlusPayUserAvatarInfo) obj2;
                    a = Result.a(obj);
                    if (a != null) {
                        return obj;
                    }
                    if (a instanceof PlusPayException) {
                        throw a;
                    }
                    mdd0.g(mdd0Var, gt90.a, "Unexpected error", a, 8);
                    throw new PlusPayUnexpectedException(a);
                }
            }
            if (i != 0) {
            }
            obj = (PlusPayUserAvatarInfo) obj2;
            a = Result.a(obj);
            if (a != null) {
            }
        } catch (CancellationException e4) {
            throw e4;
        }
        plusPayUserServiceInternalImpl$getUserAvatarInfo$1 = new PlusPayUserServiceInternalImpl$getUserAvatarInfo$1(this, continuationImpl);
        Object obj22 = plusPayUserServiceInternalImpl$getUserAvatarInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPayUserServiceInternalImpl$getUserAvatarInfo$1.label;
    }
}
