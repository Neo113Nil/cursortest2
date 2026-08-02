package com.yandex.go.payments.paymentdomain.domain;

import com.yandex.go.payments.paymentdomain.data.PaymentDomainResponseDto;
import com.yandex.go.payments.paymentdomain.data.d;
import com.yandex.go.payments.paymentdomain.domain.exception.PaymentDomainException;
import defpackage.bz90;
import defpackage.ez90;
import defpackage.fz90;
import defpackage.gz90;
import defpackage.iz90;
import defpackage.ny61;
import defpackage.p370;
import defpackage.pho;
import defpackage.uy90;
import defpackage.vy90;
import defpackage.wy90;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.network.api.models.GoApiHttpException;
import ru.yandex.taxi.network.api.models.GoParsingException;

/* loaded from: classes13.dex */
public final class a implements gz90 {
    public final d a;
    public final wy90 b;
    public final bz90 c;
    public final vy90 d;
    public final ez90 e;

    static {
        List list = bz90.a;
    }

    public a(d dVar, wy90 wy90Var, bz90 bz90Var, vy90 vy90Var, ez90 ez90Var) {
        this.a = dVar;
        this.b = wy90Var;
        this.c = bz90Var;
        this.d = vy90Var;
        this.e = ez90Var;
    }

    public static Result.Failure a(a aVar, PaymentDomainException paymentDomainException, PaymentDomainProviderImpl$FailureReason paymentDomainProviderImpl$FailureReason, GoApiHttpException goApiHttpException, String str, int i) {
        Throwable th = goApiHttpException;
        if ((i & 4) != 0) {
            Throwable cause = paymentDomainException.getCause();
            th = cause;
            if (cause == null) {
                th = paymentDomainException;
            }
        }
        if ((i & 8) != 0) {
            str = null;
        }
        vy90 vy90Var = aVar.d;
        String localizedMessage = th.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = th.toString();
        }
        vy90Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("error_description", localizedMessage);
        vy90Var.a.a("PaymentDomain.GetMethodFailedWithError", hashMap, 1, new HashMap());
        aVar.e.a(paymentDomainProviderImpl$FailureReason.getErrorCode(), str, th);
        return new Result.Failure(paymentDomainException);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(iz90 iz90Var, ContinuationImpl continuationImpl) {
        PaymentDomainProviderImpl$fetchDomain$1 paymentDomainProviderImpl$fetchDomain$1;
        int i;
        Exception exc;
        a aVar;
        GoParsingException goParsingException;
        a aVar2;
        GoApiHttpException goApiHttpException;
        a aVar3;
        fz90 fz90Var;
        Date date;
        wy90 wy90Var = this.b;
        try {
            try {
                if (continuationImpl instanceof PaymentDomainProviderImpl$fetchDomain$1) {
                    paymentDomainProviderImpl$fetchDomain$1 = (PaymentDomainProviderImpl$fetchDomain$1) continuationImpl;
                    int i2 = paymentDomainProviderImpl$fetchDomain$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        paymentDomainProviderImpl$fetchDomain$1.label = i2 - Integer.MIN_VALUE;
                        Object obj = paymentDomainProviderImpl$fetchDomain$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = paymentDomainProviderImpl$fetchDomain$1.label;
                        vy90 vy90Var = this.d;
                        if (i != 0) {
                            b.b(obj);
                            vy90Var.getClass();
                            pho phoVar = vy90Var.a;
                            phoVar.a("PaymentDomain.GetMethodWillBegin", new HashMap(), 1, new HashMap());
                            double d = iz90Var.a;
                            if (-180.0d <= d && d <= 180.0d) {
                                double d2 = iz90Var.b;
                                if (-90.0d <= d2 && d2 <= 90.0d) {
                                    try {
                                        d dVar = this.a;
                                        paymentDomainProviderImpl$fetchDomain$1.L$0 = null;
                                        paymentDomainProviderImpl$fetchDomain$1.label = 1;
                                        obj = dVar.a(iz90Var, paymentDomainProviderImpl$fetchDomain$1);
                                        if (obj == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    } catch (GoApiHttpException e) {
                                        aVar3 = this;
                                        goApiHttpException = e;
                                        GoApiHttpException goApiHttpException2 = goApiHttpException;
                                        if (goApiHttpException2.getCode() != 400) {
                                        }
                                    } catch (GoParsingException e2) {
                                        aVar2 = this;
                                        goParsingException = e2;
                                        return a(aVar2, new PaymentDomainException.MalformedResponse(goParsingException), PaymentDomainProviderImpl$FailureReason.MalformedResponse, null, null, 12);
                                    } catch (Exception e3) {
                                        aVar = this;
                                        exc = e3;
                                        return a(aVar, new PaymentDomainException.Client(exc), PaymentDomainProviderImpl$FailureReason.Client, null, null, 12);
                                    }
                                }
                            }
                            PaymentDomainException.InvalidContext invalidContext = new PaymentDomainException.InvalidContext();
                            phoVar.a("PaymentDomain.GetMethodFailedWithInvalidContext", new HashMap(), 1, new HashMap());
                            this.e.a("invalid_context", null, invalidContext);
                            return new Result.Failure(invalidContext);
                        }
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        try {
                            b.b(obj);
                        } catch (GoApiHttpException e4) {
                            goApiHttpException = e4;
                            aVar3 = this;
                            GoApiHttpException goApiHttpException22 = goApiHttpException;
                            return goApiHttpException22.getCode() != 400 ? a(aVar3, new PaymentDomainException.DomainNotConfigured(), PaymentDomainProviderImpl$FailureReason.DomainNotConfigured, goApiHttpException22, null, 8) : a(aVar3, new PaymentDomainException.Client(goApiHttpException22), PaymentDomainProviderImpl$FailureReason.Client, null, null, 12);
                        } catch (GoParsingException e5) {
                            goParsingException = e5;
                            aVar2 = this;
                            return a(aVar2, new PaymentDomainException.MalformedResponse(goParsingException), PaymentDomainProviderImpl$FailureReason.MalformedResponse, null, null, 12);
                        } catch (Exception e6) {
                            exc = e6;
                            aVar = this;
                            return a(aVar, new PaymentDomainException.Client(exc), PaymentDomainProviderImpl$FailureReason.Client, null, null, 12);
                        }
                        fz90Var = (fz90) obj;
                        PaymentDomainResponseDto paymentDomainResponseDto = fz90Var.a;
                        p370 a = wy90Var.a(paymentDomainResponseDto.a);
                        date = fz90Var.b;
                        if (date != null) {
                            return a(this, new PaymentDomainException.MalformedResponse(new IllegalArgumentException("Payment domain response has no valid Date header")), PaymentDomainProviderImpl$FailureReason.MalformedResponse, null, paymentDomainResponseDto.c, 4);
                        }
                        try {
                            this.c.getClass();
                            if (!bz90.b(a, date)) {
                                return a(this, new PaymentDomainException.Verification(null), PaymentDomainProviderImpl$FailureReason.Verification, null, paymentDomainResponseDto.c, 4);
                            }
                            try {
                                uy90 b = wy90Var.b(a, paymentDomainResponseDto.b, paymentDomainResponseDto.c);
                                String str = b.c;
                                String str2 = b.b;
                                String str3 = b.d;
                                vy90Var.getClass();
                                HashMap hashMap = new HashMap();
                                hashMap.put("currency", str);
                                hashMap.put("domain_name", str2);
                                if (str3 != null) {
                                    hashMap.put("request_id", str3);
                                }
                                vy90Var.a.a("PaymentDomain.GetMethodSucceeded", hashMap, 1, new HashMap());
                                return b;
                            } catch (Exception e7) {
                                return a(this, new PaymentDomainException.MalformedResponse(e7), PaymentDomainProviderImpl$FailureReason.MalformedResponse, null, fz90Var.a.c, 4);
                            }
                        } catch (Exception e8) {
                            return a(this, new PaymentDomainException.Verification(e8), PaymentDomainProviderImpl$FailureReason.Verification, null, fz90Var.a.c, 4);
                        }
                    }
                }
                PaymentDomainResponseDto paymentDomainResponseDto2 = fz90Var.a;
                p370 a2 = wy90Var.a(paymentDomainResponseDto2.a);
                date = fz90Var.b;
                if (date != null) {
                }
            } catch (Exception e9) {
                return a(this, new PaymentDomainException.MalformedResponse(e9), PaymentDomainProviderImpl$FailureReason.MalformedResponse, null, fz90Var.a.c, 4);
            }
            if (i != 0) {
            }
            fz90Var = (fz90) obj;
        } catch (CancellationException e10) {
            throw e10;
        }
        paymentDomainProviderImpl$fetchDomain$1 = new PaymentDomainProviderImpl$fetchDomain$1(this, continuationImpl);
        Object obj2 = paymentDomainProviderImpl$fetchDomain$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentDomainProviderImpl$fetchDomain$1.label;
        vy90 vy90Var2 = this.d;
    }
}
