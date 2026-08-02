package com.yandex.plus.pay.internal.feature.payment.common;

import com.yandex.plus.pay.api.exception.PlusPayPaymentException;
import com.yandex.plus.pay.api.exception.PlusPayPaymentGatewayErrorKind;
import com.yandex.plus.pay.common.internal.log.PayCoreLogTag;
import com.yandex.plus.pay.internal.model.PlusPayInvoice;
import defpackage.c1u0;
import defpackage.d1u0;
import defpackage.ddd0;
import defpackage.fdd0;
import defpackage.kxw;
import defpackage.mdd0;
import defpackage.ny61;
import defpackage.w511;
import defpackage.xca1;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class b implements c1u0 {
    public final com.yandex.plus.pay.graphql.invoice.a a;
    public final fdd0 b;
    public final mdd0 c;

    public b(com.yandex.plus.pay.graphql.invoice.a aVar, fdd0 fdd0Var, mdd0 mdd0Var) {
        this.a = aVar;
        this.b = fdd0Var;
        this.c = mdd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayInvoice plusPayInvoice, ContinuationImpl continuationImpl) {
        StartInvoiceInteractorImpl$checkStatusAndStartIfNeeded$1 startInvoiceInteractorImpl$checkStatusAndStartIfNeeded$1;
        int i;
        if (continuationImpl instanceof StartInvoiceInteractorImpl$checkStatusAndStartIfNeeded$1) {
            startInvoiceInteractorImpl$checkStatusAndStartIfNeeded$1 = (StartInvoiceInteractorImpl$checkStatusAndStartIfNeeded$1) continuationImpl;
            int i2 = startInvoiceInteractorImpl$checkStatusAndStartIfNeeded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                startInvoiceInteractorImpl$checkStatusAndStartIfNeeded$1.label = i2 - Integer.MIN_VALUE;
                Object obj = startInvoiceInteractorImpl$checkStatusAndStartIfNeeded$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = startInvoiceInteractorImpl$checkStatusAndStartIfNeeded$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PlusPayInvoice.Status invoiceStatus = plusPayInvoice.getInvoiceStatus();
                    switch (invoiceStatus == null ? -1 : d1u0.a[invoiceStatus.ordinal()]) {
                        case -1:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                            if (plusPayInvoice.getInvoiceStatus() == null || plusPayInvoice.getInvoiceStatus() == PlusPayInvoice.Status.UNKNOWN) {
                                throw new PlusPayPaymentException("Unknown invoice status", PlusPayPaymentGatewayErrorKind.UNEXPECTED);
                            }
                            if (plusPayInvoice.getInvoiceStatus() == PlusPayInvoice.Status.FAILED) {
                                PlusPayInvoice.Payment payment = plusPayInvoice.getPayment();
                                throw new PlusPayPaymentException(payment != null ? payment.getDescription() : null, ddd0.a(plusPayInvoice.getPayment()));
                            }
                            String id = plusPayInvoice.getId();
                            startInvoiceInteractorImpl$checkStatusAndStartIfNeeded$1.L$0 = null;
                            startInvoiceInteractorImpl$checkStatusAndStartIfNeeded$1.L$1 = null;
                            startInvoiceInteractorImpl$checkStatusAndStartIfNeeded$1.label = 1;
                            obj = this.a.d(id, startInvoiceInteractorImpl$checkStatusAndStartIfNeeded$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            break;
                        case 0:
                        default:
                            w511.b();
                            return null;
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            return plusPayInvoice;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return this.b.a((kxw) obj);
            }
        }
        startInvoiceInteractorImpl$checkStatusAndStartIfNeeded$1 = new StartInvoiceInteractorImpl$checkStatusAndStartIfNeeded$1(this, continuationImpl);
        Object obj2 = startInvoiceInteractorImpl$checkStatusAndStartIfNeeded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = startInvoiceInteractorImpl$checkStatusAndStartIfNeeded$1.label;
        if (i != 0) {
        }
        return this.b.a((kxw) obj2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:21|22))(3:23|24|(1:26))|12|13|(2:15|16)(2:18|19)))|33|6|7|(0)(0)|12|13|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        r9 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003b, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        r9 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(PlusPayInvoice plusPayInvoice, ContinuationImpl continuationImpl) {
        StartInvoiceInteractorImpl$startInvoice$1 startInvoiceInteractorImpl$startInvoice$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof StartInvoiceInteractorImpl$startInvoice$1) {
            startInvoiceInteractorImpl$startInvoice$1 = (StartInvoiceInteractorImpl$startInvoice$1) continuationImpl;
            int i2 = startInvoiceInteractorImpl$startInvoice$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                startInvoiceInteractorImpl$startInvoice$1.label = i2 - Integer.MIN_VALUE;
                Object obj = startInvoiceInteractorImpl$startInvoice$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = startInvoiceInteractorImpl$startInvoice$1.label;
                mdd0 mdd0Var = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mdd0.c(mdd0Var, PayCoreLogTag.PAYMENT, "Starting invoice: " + plusPayInvoice.getId());
                    startInvoiceInteractorImpl$startInvoice$1.L$0 = plusPayInvoice;
                    startInvoiceInteractorImpl$startInvoice$1.L$1 = null;
                    startInvoiceInteractorImpl$startInvoice$1.L$2 = null;
                    startInvoiceInteractorImpl$startInvoice$1.L$3 = null;
                    startInvoiceInteractorImpl$startInvoice$1.I$0 = 0;
                    startInvoiceInteractorImpl$startInvoice$1.I$1 = 0;
                    startInvoiceInteractorImpl$startInvoice$1.label = 1;
                    obj = a(plusPayInvoice, startInvoiceInteractorImpl$startInvoice$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    plusPayInvoice = (PlusPayInvoice) startInvoiceInteractorImpl$startInvoice$1.L$0;
                    kotlin.b.b(obj);
                }
                a = Result.a(obj);
                if (a == null) {
                    mdd0.g(mdd0Var, PayCoreLogTag.PAYMENT, "Error starting invoice: " + plusPayInvoice.getId(), a, 8);
                    throw xca1.e(a);
                }
                mdd0.c(mdd0Var, PayCoreLogTag.PAYMENT, "Start invoice result: " + plusPayInvoice);
                return obj;
            }
        }
        startInvoiceInteractorImpl$startInvoice$1 = new StartInvoiceInteractorImpl$startInvoice$1(this, continuationImpl);
        Object obj3 = startInvoiceInteractorImpl$startInvoice$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = startInvoiceInteractorImpl$startInvoice$1.label;
        mdd0 mdd0Var2 = this.c;
        if (i != 0) {
        }
        a = Result.a(obj3);
        if (a == null) {
        }
    }
}
