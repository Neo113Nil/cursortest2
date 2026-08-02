package com.yandex.plus.pay.internal.feature.upsale;

import com.yandex.plus.pay.api.exception.PlusPayException;
import com.yandex.plus.pay.api.exception.PlusPayUnexpectedException;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayCompositeUpsale;
import defpackage.gt90;
import defpackage.mdd0;
import defpackage.ndd0;
import defpackage.ny61;
import defpackage.wgd0;
import defpackage.zsd;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class b implements wgd0 {
    public final zsd a;
    public final mdd0 b;

    public b(zsd zsdVar, ndd0 ndd0Var) {
        this.a = zsdVar;
        this.b = ndd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayCompositeOffers.Offer offer, ContinuationImpl continuationImpl) {
        PlusPayUpsaleServiceImpl$getCompositeUpsale$1 plusPayUpsaleServiceImpl$getCompositeUpsale$1;
        int i;
        mdd0 mdd0Var;
        Object failure;
        Throwable a;
        try {
            if (continuationImpl instanceof PlusPayUpsaleServiceImpl$getCompositeUpsale$1) {
                plusPayUpsaleServiceImpl$getCompositeUpsale$1 = (PlusPayUpsaleServiceImpl$getCompositeUpsale$1) continuationImpl;
                int i2 = plusPayUpsaleServiceImpl$getCompositeUpsale$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    plusPayUpsaleServiceImpl$getCompositeUpsale$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = plusPayUpsaleServiceImpl$getCompositeUpsale$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusPayUpsaleServiceImpl$getCompositeUpsale$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        mdd0 mdd0Var2 = this.b;
                        try {
                            zsd zsdVar = this.a;
                            plusPayUpsaleServiceImpl$getCompositeUpsale$1.L$0 = null;
                            plusPayUpsaleServiceImpl$getCompositeUpsale$1.L$1 = mdd0Var2;
                            plusPayUpsaleServiceImpl$getCompositeUpsale$1.L$2 = null;
                            plusPayUpsaleServiceImpl$getCompositeUpsale$1.L$3 = null;
                            plusPayUpsaleServiceImpl$getCompositeUpsale$1.L$4 = null;
                            plusPayUpsaleServiceImpl$getCompositeUpsale$1.L$5 = null;
                            plusPayUpsaleServiceImpl$getCompositeUpsale$1.I$0 = 0;
                            plusPayUpsaleServiceImpl$getCompositeUpsale$1.I$1 = 0;
                            plusPayUpsaleServiceImpl$getCompositeUpsale$1.I$2 = 0;
                            plusPayUpsaleServiceImpl$getCompositeUpsale$1.I$3 = 0;
                            plusPayUpsaleServiceImpl$getCompositeUpsale$1.I$4 = 0;
                            plusPayUpsaleServiceImpl$getCompositeUpsale$1.I$5 = 0;
                            plusPayUpsaleServiceImpl$getCompositeUpsale$1.label = 1;
                            try {
                                Object b = ((a) zsdVar).b(offer, plusPayUpsaleServiceImpl$getCompositeUpsale$1);
                                if (b == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                obj = b;
                                mdd0Var = mdd0Var2;
                            } catch (TimeoutCancellationException e) {
                                e = e;
                                mdd0Var = mdd0Var2;
                                failure = new Result.Failure(e);
                                a = Result.a(failure);
                                if (a != null) {
                                }
                            } catch (Throwable th) {
                                th = th;
                                mdd0Var = mdd0Var2;
                                failure = new Result.Failure(th);
                                a = Result.a(failure);
                                if (a != null) {
                                }
                            }
                        } catch (TimeoutCancellationException e2) {
                            e = e2;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mdd0Var = (mdd0) plusPayUpsaleServiceImpl$getCompositeUpsale$1.L$1;
                        try {
                            kotlin.b.b(obj);
                        } catch (TimeoutCancellationException e3) {
                            e = e3;
                            failure = new Result.Failure(e);
                            a = Result.a(failure);
                            if (a != null) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            failure = new Result.Failure(th);
                            a = Result.a(failure);
                            if (a != null) {
                            }
                        }
                    }
                    failure = (PlusPayCompositeUpsale) obj;
                    a = Result.a(failure);
                    if (a != null) {
                        return failure;
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
            failure = (PlusPayCompositeUpsale) obj;
            a = Result.a(failure);
            if (a != null) {
            }
        } catch (CancellationException e4) {
            throw e4;
        }
        plusPayUpsaleServiceImpl$getCompositeUpsale$1 = new PlusPayUpsaleServiceImpl$getCompositeUpsale$1(this, continuationImpl);
        Object obj2 = plusPayUpsaleServiceImpl$getCompositeUpsale$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPayUpsaleServiceImpl$getCompositeUpsale$1.label;
    }
}
