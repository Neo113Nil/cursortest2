package com.yandex.plus.pay.internal.feature.contacts;

import com.yandex.plus.pay.api.exception.PlusPayException;
import com.yandex.plus.pay.api.exception.PlusPayUnexpectedException;
import com.yandex.plus.pay.internal.model.PlusPayWebCollectContactsParams;
import com.yandex.plus.pay.internal.model.PlusPayWebCollectContactsResult;
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
    public final a a;
    public final mdd0 b;

    public b(a aVar, ndd0 ndd0Var) {
        this.a = aVar;
        this.b = ndd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayWebCollectContactsParams plusPayWebCollectContactsParams, ContinuationImpl continuationImpl) {
        PlusPayCollectContactsServiceImpl$getWebCollectContacts$1 plusPayCollectContactsServiceImpl$getWebCollectContacts$1;
        int i;
        mdd0 mdd0Var;
        Object failure;
        Throwable a;
        try {
            if (continuationImpl instanceof PlusPayCollectContactsServiceImpl$getWebCollectContacts$1) {
                plusPayCollectContactsServiceImpl$getWebCollectContacts$1 = (PlusPayCollectContactsServiceImpl$getWebCollectContacts$1) continuationImpl;
                int i2 = plusPayCollectContactsServiceImpl$getWebCollectContacts$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    plusPayCollectContactsServiceImpl$getWebCollectContacts$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = plusPayCollectContactsServiceImpl$getWebCollectContacts$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusPayCollectContactsServiceImpl$getWebCollectContacts$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        mdd0 mdd0Var2 = this.b;
                        try {
                            a aVar = this.a;
                            plusPayCollectContactsServiceImpl$getWebCollectContacts$1.L$0 = null;
                            plusPayCollectContactsServiceImpl$getWebCollectContacts$1.L$1 = mdd0Var2;
                            plusPayCollectContactsServiceImpl$getWebCollectContacts$1.L$2 = null;
                            plusPayCollectContactsServiceImpl$getWebCollectContacts$1.L$3 = null;
                            plusPayCollectContactsServiceImpl$getWebCollectContacts$1.L$4 = null;
                            plusPayCollectContactsServiceImpl$getWebCollectContacts$1.L$5 = null;
                            plusPayCollectContactsServiceImpl$getWebCollectContacts$1.I$0 = 0;
                            plusPayCollectContactsServiceImpl$getWebCollectContacts$1.I$1 = 0;
                            plusPayCollectContactsServiceImpl$getWebCollectContacts$1.I$2 = 0;
                            plusPayCollectContactsServiceImpl$getWebCollectContacts$1.I$3 = 0;
                            plusPayCollectContactsServiceImpl$getWebCollectContacts$1.I$4 = 0;
                            plusPayCollectContactsServiceImpl$getWebCollectContacts$1.I$5 = 0;
                            plusPayCollectContactsServiceImpl$getWebCollectContacts$1.label = 1;
                            Object a2 = aVar.a(plusPayWebCollectContactsParams, plusPayCollectContactsServiceImpl$getWebCollectContacts$1);
                            if (a2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            obj = a2;
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
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mdd0Var = (mdd0) plusPayCollectContactsServiceImpl$getWebCollectContacts$1.L$1;
                        try {
                            kotlin.b.b(obj);
                        } catch (TimeoutCancellationException e2) {
                            e = e2;
                            failure = new Result.Failure(e);
                            a = Result.a(failure);
                            if (a != null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            failure = new Result.Failure(th);
                            a = Result.a(failure);
                            if (a != null) {
                            }
                        }
                    }
                    failure = (PlusPayWebCollectContactsResult) obj;
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
            failure = (PlusPayWebCollectContactsResult) obj;
            a = Result.a(failure);
            if (a != null) {
            }
        } catch (CancellationException e3) {
            throw e3;
        }
        plusPayCollectContactsServiceImpl$getWebCollectContacts$1 = new PlusPayCollectContactsServiceImpl$getWebCollectContacts$1(this, continuationImpl);
        Object obj2 = plusPayCollectContactsServiceImpl$getWebCollectContacts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPayCollectContactsServiceImpl$getWebCollectContacts$1.label;
    }
}
