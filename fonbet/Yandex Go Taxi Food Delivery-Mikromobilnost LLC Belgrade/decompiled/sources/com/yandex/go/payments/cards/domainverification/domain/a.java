package com.yandex.go.payments.cards.domainverification.domain;

import android.os.SystemClock;
import com.yandex.go.payments.cards.data.model.Verification;
import com.yandex.go.payments.cards.domain.model.PaymentMethodVerificationSession;
import com.yandex.go.payments.cards.domainverification.data.PaymentMethodVerificationError;
import com.yandex.go.payments.cards.domainverification.data.PaymentMethodVerificationResponse;
import com.yandex.go.payments.cards.domainverification.data.PaymentMethodVerificationResult;
import com.yandex.go.payments.cards.domainverification.data.PaymentMethodVerificationStatus;
import com.yandex.go.payments.cards.domainverification.data.f;
import defpackage.evu0;
import defpackage.gz90;
import defpackage.h2t;
import defpackage.iz90;
import defpackage.j831;
import defpackage.jl40;
import defpackage.jv5;
import defpackage.k831;
import defpackage.k8a0;
import defpackage.l8a0;
import defpackage.l9z;
import defpackage.m831;
import defpackage.ny61;
import defpackage.p731;
import defpackage.rb8;
import defpackage.s3m;
import defpackage.tx90;
import defpackage.u32;
import defpackage.uy90;
import defpackage.v8e;
import defpackage.w511;
import defpackage.zh6;
import defpackage.zzs;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.network.api.models.GoApiHttpException;
import ru.yandex.taxi.payments.cards.dto.VerificationStatus;

/* loaded from: classes13.dex */
public final class a implements zh6 {
    public final l9z a;
    public final gz90 b;
    public final f c;
    public final u32 d;
    public final PaymentMethodVerificationSession e;
    public final h2t f = new h2t(new v8e(23, this));

    public a(l9z l9zVar, gz90 gz90Var, f fVar, u32 u32Var, PaymentMethodVerificationSession paymentMethodVerificationSession) {
        this.a = l9zVar;
        this.b = gz90Var;
        this.c = fVar;
        this.d = u32Var;
        this.e = paymentMethodVerificationSession;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, jv5 jv5Var, j831 j831Var, boolean z, ContinuationImpl continuationImpl) {
        DomainBoundPaymentMethodVerifier$verifyExclusive$1 domainBoundPaymentMethodVerifier$verifyExclusive$1;
        int i;
        a aVar2;
        GoApiHttpException goApiHttpException;
        m831 m831Var;
        k831 k831Var;
        aVar.getClass();
        try {
            if (continuationImpl instanceof DomainBoundPaymentMethodVerifier$verifyExclusive$1) {
                domainBoundPaymentMethodVerifier$verifyExclusive$1 = (DomainBoundPaymentMethodVerifier$verifyExclusive$1) continuationImpl;
                int i2 = domainBoundPaymentMethodVerifier$verifyExclusive$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    domainBoundPaymentMethodVerifier$verifyExclusive$1.label = i2 - Integer.MIN_VALUE;
                    DomainBoundPaymentMethodVerifier$verifyExclusive$1 domainBoundPaymentMethodVerifier$verifyExclusive$12 = domainBoundPaymentMethodVerifier$verifyExclusive$1;
                    Object obj = domainBoundPaymentMethodVerifier$verifyExclusive$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = domainBoundPaymentMethodVerifier$verifyExclusive$12.label;
                    if (i != 0) {
                        b.b(obj);
                        m831 m831Var2 = j831Var.a;
                        if (!(m831Var2 instanceof k831)) {
                            throw new PaymentMethodVerificationProtocolException("Domain verification supports bound cards only");
                        }
                        if (evu0.J(m831Var2.a)) {
                            throw new PaymentMethodVerificationProtocolException("Payment method id is required");
                        }
                        try {
                            k831Var = (k831) m831Var2;
                            domainBoundPaymentMethodVerifier$verifyExclusive$12.L$0 = null;
                            domainBoundPaymentMethodVerifier$verifyExclusive$12.L$1 = null;
                            domainBoundPaymentMethodVerifier$verifyExclusive$12.L$2 = m831Var2;
                            domainBoundPaymentMethodVerifier$verifyExclusive$12.Z$0 = z;
                            domainBoundPaymentMethodVerifier$verifyExclusive$12.label = 1;
                            aVar2 = aVar;
                        } catch (GoApiHttpException e) {
                            e = e;
                            aVar2 = aVar;
                        }
                        try {
                            Object i3 = aVar2.i(jv5Var, j831Var, k831Var, z, domainBoundPaymentMethodVerifier$verifyExclusive$12);
                            if (i3 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            m831Var = m831Var2;
                            obj = i3;
                        } catch (GoApiHttpException e2) {
                            e = e2;
                            goApiHttpException = e;
                            m831Var = m831Var2;
                            aVar2.f.g(goApiHttpException, m831Var);
                            throw goApiHttpException;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        m831Var = (m831) domainBoundPaymentMethodVerifier$verifyExclusive$12.L$2;
                        try {
                            b.b(obj);
                            aVar2 = aVar;
                        } catch (GoApiHttpException e3) {
                            goApiHttpException = e3;
                            aVar2 = aVar;
                            aVar2.f.g(goApiHttpException, m831Var);
                            throw goApiHttpException;
                        }
                    }
                    return (p731) obj;
                }
            }
            return (p731) obj;
        } catch (GoApiHttpException e4) {
            goApiHttpException = e4;
            aVar2.f.g(goApiHttpException, m831Var);
            throw goApiHttpException;
        }
        domainBoundPaymentMethodVerifier$verifyExclusive$1 = new DomainBoundPaymentMethodVerifier$verifyExclusive$1(aVar, continuationImpl);
        DomainBoundPaymentMethodVerifier$verifyExclusive$1 domainBoundPaymentMethodVerifier$verifyExclusive$122 = domainBoundPaymentMethodVerifier$verifyExclusive$1;
        Object obj2 = domainBoundPaymentMethodVerifier$verifyExclusive$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = domainBoundPaymentMethodVerifier$verifyExclusive$122.label;
        if (i != 0) {
        }
    }

    public static Long f(Long l) {
        if (l == null || l.longValue() <= 0) {
            return null;
        }
        return l;
    }

    public static boolean g(k8a0 k8a0Var, boolean z, String str) {
        PaymentMethodVerificationResult paymentMethodVerificationResult = k8a0Var.a.a;
        PaymentMethodVerificationStatus paymentMethodVerificationStatus = paymentMethodVerificationResult.c;
        String str2 = paymentMethodVerificationResult.d;
        if (paymentMethodVerificationStatus == PaymentMethodVerificationStatus.NOT_STARTED || paymentMethodVerificationStatus == PaymentMethodVerificationStatus.IN_PROGRESS || paymentMethodVerificationStatus == PaymentMethodVerificationStatus.RECEIVED_3DS_STATUS || paymentMethodVerificationStatus == PaymentMethodVerificationStatus.UNKNOWN) {
            return true;
        }
        return z && paymentMethodVerificationStatus == PaymentMethodVerificationStatus.REQUIRED_3DS && str2 != null && !evu0.J(str2) && str2.equals(str);
    }

    @Override // defpackage.zh6
    public final Object a(jv5 jv5Var, j831 j831Var, boolean z, Continuation continuation) {
        return this.e.a(new DomainBoundPaymentMethodVerifier$verify$2(this, jv5Var, j831Var, z, null), (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x008d, code lost:
    
        if (r7 == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(jv5 jv5Var, String str, String str2, ContinuationImpl continuationImpl) {
        DomainBoundPaymentMethodVerifier$createStartContext$1 domainBoundPaymentMethodVerifier$createStartContext$1;
        Object obj;
        Object obj2;
        int i;
        String str3;
        String str4;
        String str5;
        Object d;
        jv5 jv5Var2;
        uy90 uy90Var;
        String str6;
        String str7;
        String str8;
        jv5 jv5Var3 = jv5Var;
        if (continuationImpl instanceof DomainBoundPaymentMethodVerifier$createStartContext$1) {
            domainBoundPaymentMethodVerifier$createStartContext$1 = (DomainBoundPaymentMethodVerifier$createStartContext$1) continuationImpl;
            int i2 = domainBoundPaymentMethodVerifier$createStartContext$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                domainBoundPaymentMethodVerifier$createStartContext$1.label = i2 - Integer.MIN_VALUE;
                obj = domainBoundPaymentMethodVerifier$createStartContext$1.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = domainBoundPaymentMethodVerifier$createStartContext$1.label;
                if (i != 0) {
                    b.b(obj);
                    str3 = ((rb8) jv5Var3).a.a;
                    if (str3 == null || evu0.J(str3)) {
                        str3 = null;
                    }
                    domainBoundPaymentMethodVerifier$createStartContext$1.L$0 = jv5Var3;
                    str4 = str;
                    domainBoundPaymentMethodVerifier$createStartContext$1.L$1 = str4;
                    str5 = str2;
                    domainBoundPaymentMethodVerifier$createStartContext$1.L$2 = str5;
                    domainBoundPaymentMethodVerifier$createStartContext$1.L$3 = str3;
                    domainBoundPaymentMethodVerifier$createStartContext$1.label = 1;
                    d = d(jv5Var3, str3, domainBoundPaymentMethodVerifier$createStartContext$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uy90Var = (uy90) domainBoundPaymentMethodVerifier$createStartContext$1.L$4;
                        String str9 = (String) domainBoundPaymentMethodVerifier$createStartContext$1.L$2;
                        str4 = (String) domainBoundPaymentMethodVerifier$createStartContext$1.L$1;
                        jv5Var2 = (jv5) domainBoundPaymentMethodVerifier$createStartContext$1.L$0;
                        b.b(obj);
                        str6 = str9;
                        String str10 = str4;
                        String str11 = (String) obj;
                        str7 = ((rb8) jv5Var2).a.d;
                        if (str7 != null || evu0.J(str7)) {
                            str7 = null;
                        }
                        if (str7 != null) {
                            String a = this.a.a();
                            str8 = (a == null || evu0.J(a)) ? null : a;
                        } else {
                            str8 = str7;
                        }
                        return new l8a0(str11, str10, uy90Var.c, str8, str6);
                    }
                    String str12 = (String) domainBoundPaymentMethodVerifier$createStartContext$1.L$3;
                    String str13 = (String) domainBoundPaymentMethodVerifier$createStartContext$1.L$2;
                    String str14 = (String) domainBoundPaymentMethodVerifier$createStartContext$1.L$1;
                    jv5 jv5Var4 = (jv5) domainBoundPaymentMethodVerifier$createStartContext$1.L$0;
                    b.b(obj);
                    str3 = str12;
                    jv5Var3 = jv5Var4;
                    str5 = str13;
                    str4 = str14;
                    d = obj;
                }
                uy90 uy90Var2 = (uy90) d;
                String str15 = uy90Var2.c;
                String str16 = uy90Var2.b;
                domainBoundPaymentMethodVerifier$createStartContext$1.L$0 = jv5Var3;
                domainBoundPaymentMethodVerifier$createStartContext$1.L$1 = str4;
                domainBoundPaymentMethodVerifier$createStartContext$1.L$2 = str5;
                domainBoundPaymentMethodVerifier$createStartContext$1.L$3 = null;
                domainBoundPaymentMethodVerifier$createStartContext$1.L$4 = uy90Var2;
                domainBoundPaymentMethodVerifier$createStartContext$1.label = 2;
                obj = this.c.a(str15, str16, str3, domainBoundPaymentMethodVerifier$createStartContext$1);
                if (obj != obj2) {
                    jv5Var2 = jv5Var3;
                    uy90Var = uy90Var2;
                    str6 = str5;
                    String str102 = str4;
                    String str112 = (String) obj;
                    str7 = ((rb8) jv5Var2).a.d;
                    if (str7 != null) {
                    }
                    str7 = null;
                    if (str7 != null) {
                    }
                    return new l8a0(str112, str102, uy90Var.c, str8, str6);
                }
                return obj2;
            }
        }
        domainBoundPaymentMethodVerifier$createStartContext$1 = new DomainBoundPaymentMethodVerifier$createStartContext$1(this, continuationImpl);
        obj = domainBoundPaymentMethodVerifier$createStartContext$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = domainBoundPaymentMethodVerifier$createStartContext$1.label;
        if (i != 0) {
        }
        uy90 uy90Var22 = (uy90) d;
        String str152 = uy90Var22.c;
        String str162 = uy90Var22.b;
        domainBoundPaymentMethodVerifier$createStartContext$1.L$0 = jv5Var3;
        domainBoundPaymentMethodVerifier$createStartContext$1.L$1 = str4;
        domainBoundPaymentMethodVerifier$createStartContext$1.L$2 = str5;
        domainBoundPaymentMethodVerifier$createStartContext$1.L$3 = null;
        domainBoundPaymentMethodVerifier$createStartContext$1.L$4 = uy90Var22;
        domainBoundPaymentMethodVerifier$createStartContext$1.label = 2;
        obj = this.c.a(str152, str162, str3, domainBoundPaymentMethodVerifier$createStartContext$1);
        if (obj != obj2) {
        }
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(jv5 jv5Var, String str, ContinuationImpl continuationImpl) {
        DomainBoundPaymentMethodVerifier$fetchPaymentDomain$1 domainBoundPaymentMethodVerifier$fetchPaymentDomain$1;
        int i;
        Object b;
        uy90 uy90Var;
        if (continuationImpl instanceof DomainBoundPaymentMethodVerifier$fetchPaymentDomain$1) {
            domainBoundPaymentMethodVerifier$fetchPaymentDomain$1 = (DomainBoundPaymentMethodVerifier$fetchPaymentDomain$1) continuationImpl;
            int i2 = domainBoundPaymentMethodVerifier$fetchPaymentDomain$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                domainBoundPaymentMethodVerifier$fetchPaymentDomain$1.label = i2 - Integer.MIN_VALUE;
                Object obj = domainBoundPaymentMethodVerifier$fetchPaymentDomain$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = domainBoundPaymentMethodVerifier$fetchPaymentDomain$1.label;
                if (i != 0) {
                    b.b(obj);
                    zzs zzsVar = ((rb8) jv5Var).a.c;
                    if (zzsVar == null) {
                        throw new PaymentMethodVerificationProtocolException("Geo point is required to resolve payment domain");
                    }
                    iz90 iz90Var = new iz90(str, zzsVar.b, zzsVar.a);
                    domainBoundPaymentMethodVerifier$fetchPaymentDomain$1.L$0 = null;
                    domainBoundPaymentMethodVerifier$fetchPaymentDomain$1.L$1 = null;
                    domainBoundPaymentMethodVerifier$fetchPaymentDomain$1.L$2 = null;
                    domainBoundPaymentMethodVerifier$fetchPaymentDomain$1.label = 1;
                    b = ((com.yandex.go.payments.paymentdomain.domain.a) this.b).b(iz90Var, domainBoundPaymentMethodVerifier$fetchPaymentDomain$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    b = ((Result) obj).getValue();
                }
                uy90Var = (uy90) (b instanceof Result.Failure ? null : b);
                if (uy90Var == null) {
                    return uy90Var;
                }
                Throwable a = Result.a(b);
                if (a == null) {
                    throw new PaymentMethodVerificationProtocolException("Payment domain resolution failed without an error");
                }
                throw a;
            }
        }
        domainBoundPaymentMethodVerifier$fetchPaymentDomain$1 = new DomainBoundPaymentMethodVerifier$fetchPaymentDomain$1(this, continuationImpl);
        Object obj2 = domainBoundPaymentMethodVerifier$fetchPaymentDomain$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = domainBoundPaymentMethodVerifier$fetchPaymentDomain$1.label;
        if (i != 0) {
        }
        uy90Var = (uy90) (b instanceof Result.Failure ? null : b);
        if (uy90Var == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0176 -> B:11:0x017c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(k8a0 k8a0Var, String str, String str2, j831 j831Var, boolean z, ContinuationImpl continuationImpl) {
        DomainBoundPaymentMethodVerifier$pollUntilTerminal$1 domainBoundPaymentMethodVerifier$pollUntilTerminal$1;
        int i;
        Object obj;
        boolean z2;
        j831 j831Var2;
        long j;
        String str3;
        long j2;
        long j3;
        DomainBoundPaymentMethodVerifier$pollUntilTerminal$1 domainBoundPaymentMethodVerifier$pollUntilTerminal$12;
        String str4;
        String str5;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        String str6;
        boolean z3;
        j831 j831Var3;
        k8a0 k8a0Var2 = k8a0Var;
        if (continuationImpl instanceof DomainBoundPaymentMethodVerifier$pollUntilTerminal$1) {
            domainBoundPaymentMethodVerifier$pollUntilTerminal$1 = (DomainBoundPaymentMethodVerifier$pollUntilTerminal$1) continuationImpl;
            int i2 = domainBoundPaymentMethodVerifier$pollUntilTerminal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                domainBoundPaymentMethodVerifier$pollUntilTerminal$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = domainBoundPaymentMethodVerifier$pollUntilTerminal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = domainBoundPaymentMethodVerifier$pollUntilTerminal$1.label;
                if (i != 0) {
                    obj = null;
                    b.b(obj2);
                    PaymentMethodVerificationStatus paymentMethodVerificationStatus = k8a0Var2.a.a.c;
                    switch (s3m.a[paymentMethodVerificationStatus.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            z2 = z;
                            if (!g(k8a0Var2, z2, j831Var.n)) {
                                return k8a0Var2;
                            }
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Long f = f(k8a0Var2.b);
                            long longValue = f != null ? f.longValue() : 3000L;
                            Long f2 = f(k8a0Var2.c);
                            long longValue2 = f2 != null ? f2.longValue() : 60000L;
                            j831Var2 = j831Var;
                            j = longValue2;
                            str3 = str;
                            j2 = longValue;
                            j3 = elapsedRealtime;
                            domainBoundPaymentMethodVerifier$pollUntilTerminal$12 = domainBoundPaymentMethodVerifier$pollUntilTerminal$1;
                            str4 = str2;
                            break;
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            throw new PaymentMethodVerificationUnsupportedActionException(paymentMethodVerificationStatus);
                        default:
                            w511.b();
                            return null;
                    }
                    if (g(k8a0Var2, z2, j831Var2.n)) {
                    }
                } else if (i == 1) {
                    j8 = domainBoundPaymentMethodVerifier$pollUntilTerminal$1.J$4;
                    long j9 = domainBoundPaymentMethodVerifier$pollUntilTerminal$1.J$3;
                    long j10 = domainBoundPaymentMethodVerifier$pollUntilTerminal$1.J$2;
                    j4 = domainBoundPaymentMethodVerifier$pollUntilTerminal$1.J$1;
                    long j11 = domainBoundPaymentMethodVerifier$pollUntilTerminal$1.J$0;
                    boolean z4 = domainBoundPaymentMethodVerifier$pollUntilTerminal$1.Z$0;
                    j831 j831Var4 = (j831) domainBoundPaymentMethodVerifier$pollUntilTerminal$1.L$3;
                    String str7 = (String) domainBoundPaymentMethodVerifier$pollUntilTerminal$1.L$2;
                    String str8 = (String) domainBoundPaymentMethodVerifier$pollUntilTerminal$1.L$1;
                    b.b(obj2);
                    z3 = z4;
                    j831Var3 = j831Var4;
                    str6 = str7;
                    str5 = str8;
                    j7 = j11;
                    j6 = j10;
                    j5 = j9;
                    if (SystemClock.elapsedRealtime() - j7 < j6) {
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j12 = domainBoundPaymentMethodVerifier$pollUntilTerminal$1.J$2;
                    long j13 = domainBoundPaymentMethodVerifier$pollUntilTerminal$1.J$1;
                    long j14 = domainBoundPaymentMethodVerifier$pollUntilTerminal$1.J$0;
                    z3 = domainBoundPaymentMethodVerifier$pollUntilTerminal$1.Z$0;
                    j831 j831Var5 = (j831) domainBoundPaymentMethodVerifier$pollUntilTerminal$1.L$3;
                    String str9 = (String) domainBoundPaymentMethodVerifier$pollUntilTerminal$1.L$2;
                    String str10 = (String) domainBoundPaymentMethodVerifier$pollUntilTerminal$1.L$1;
                    b.b(obj2);
                    domainBoundPaymentMethodVerifier$pollUntilTerminal$12 = domainBoundPaymentMethodVerifier$pollUntilTerminal$1;
                    long j15 = j12;
                    j3 = j14;
                    str4 = str9;
                    str5 = str10;
                    j4 = j13;
                    a aVar = this;
                    CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
                    j831Var3 = j831Var5;
                    k8a0 k8a0Var3 = (k8a0) obj2;
                    PaymentMethodVerificationResponse paymentMethodVerificationResponse = k8a0Var3.a;
                    PaymentMethodVerificationResponse paymentMethodVerificationResponse2 = k8a0Var3.a;
                    if (!jl40.l(paymentMethodVerificationResponse.b, str5)) {
                        throw new PaymentMethodVerificationProtocolException("Verification response contains an unexpected payment method id");
                    }
                    if (!jl40.l(paymentMethodVerificationResponse2.a.a, str4)) {
                        throw new PaymentMethodVerificationProtocolException("Verification response contains an unexpected id");
                    }
                    PaymentMethodVerificationStatus paymentMethodVerificationStatus2 = paymentMethodVerificationResponse2.a.c;
                    switch (s3m.a[paymentMethodVerificationStatus2.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            Long f3 = f(k8a0Var3.b);
                            if (f3 != null) {
                                j4 = f3.longValue();
                            }
                            Long f4 = f(k8a0Var3.c);
                            if (f4 != null) {
                                j15 = f4.longValue();
                            }
                            j831Var2 = j831Var3;
                            coroutineSingletons = coroutineSingletons2;
                            j2 = j4;
                            j = j15;
                            z2 = z3;
                            k8a0Var2 = k8a0Var3;
                            obj = null;
                            str3 = str5;
                            break;
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            throw new PaymentMethodVerificationUnsupportedActionException(paymentMethodVerificationStatus2);
                        default:
                            w511.b();
                            return null;
                    }
                    if (g(k8a0Var2, z2, j831Var2.n)) {
                        return k8a0Var2;
                    }
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - j3;
                    long j16 = j - elapsedRealtime2;
                    if (j16 <= 0) {
                        throw new PaymentMethodVerificationPollingTimeoutException();
                    }
                    long j17 = j;
                    long min = Math.min(j2, j16);
                    Object obj3 = obj;
                    domainBoundPaymentMethodVerifier$pollUntilTerminal$12.L$0 = obj3;
                    domainBoundPaymentMethodVerifier$pollUntilTerminal$12.L$1 = str3;
                    domainBoundPaymentMethodVerifier$pollUntilTerminal$12.L$2 = str4;
                    domainBoundPaymentMethodVerifier$pollUntilTerminal$12.L$3 = j831Var2;
                    domainBoundPaymentMethodVerifier$pollUntilTerminal$12.L$4 = obj3;
                    domainBoundPaymentMethodVerifier$pollUntilTerminal$12.Z$0 = z2;
                    domainBoundPaymentMethodVerifier$pollUntilTerminal$12.J$0 = j3;
                    domainBoundPaymentMethodVerifier$pollUntilTerminal$12.J$1 = j2;
                    str5 = str3;
                    String str11 = str4;
                    domainBoundPaymentMethodVerifier$pollUntilTerminal$12.J$2 = j17;
                    domainBoundPaymentMethodVerifier$pollUntilTerminal$12.J$3 = elapsedRealtime2;
                    domainBoundPaymentMethodVerifier$pollUntilTerminal$12.J$4 = j16;
                    domainBoundPaymentMethodVerifier$pollUntilTerminal$12.label = 1;
                    if (kotlinx.coroutines.a.i(min, domainBoundPaymentMethodVerifier$pollUntilTerminal$12) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    j4 = j2;
                    j5 = elapsedRealtime2;
                    domainBoundPaymentMethodVerifier$pollUntilTerminal$1 = domainBoundPaymentMethodVerifier$pollUntilTerminal$12;
                    j7 = j3;
                    str6 = str11;
                    j6 = j17;
                    j831Var3 = j831Var2;
                    z3 = z2;
                    j8 = j16;
                    if (SystemClock.elapsedRealtime() - j7 < j6) {
                        throw new PaymentMethodVerificationPollingTimeoutException();
                    }
                    domainBoundPaymentMethodVerifier$pollUntilTerminal$1.L$0 = null;
                    domainBoundPaymentMethodVerifier$pollUntilTerminal$1.L$1 = str5;
                    domainBoundPaymentMethodVerifier$pollUntilTerminal$1.L$2 = str6;
                    domainBoundPaymentMethodVerifier$pollUntilTerminal$1.L$3 = j831Var3;
                    domainBoundPaymentMethodVerifier$pollUntilTerminal$1.L$4 = null;
                    domainBoundPaymentMethodVerifier$pollUntilTerminal$1.Z$0 = z3;
                    domainBoundPaymentMethodVerifier$pollUntilTerminal$1.J$0 = j7;
                    domainBoundPaymentMethodVerifier$pollUntilTerminal$1.J$1 = j4;
                    domainBoundPaymentMethodVerifier$pollUntilTerminal$1.J$2 = j6;
                    domainBoundPaymentMethodVerifier$pollUntilTerminal$1.J$3 = j5;
                    domainBoundPaymentMethodVerifier$pollUntilTerminal$1.J$4 = j8;
                    domainBoundPaymentMethodVerifier$pollUntilTerminal$1.label = 2;
                    aVar = this;
                    Object c = aVar.c.c(str6, domainBoundPaymentMethodVerifier$pollUntilTerminal$1);
                    coroutineSingletons2 = coroutineSingletons;
                    if (c == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    j15 = j6;
                    j3 = j7;
                    domainBoundPaymentMethodVerifier$pollUntilTerminal$12 = domainBoundPaymentMethodVerifier$pollUntilTerminal$1;
                    str4 = str6;
                    obj2 = c;
                    k8a0 k8a0Var32 = (k8a0) obj2;
                    PaymentMethodVerificationResponse paymentMethodVerificationResponse3 = k8a0Var32.a;
                    PaymentMethodVerificationResponse paymentMethodVerificationResponse22 = k8a0Var32.a;
                    if (!jl40.l(paymentMethodVerificationResponse3.b, str5)) {
                    }
                }
            }
        }
        domainBoundPaymentMethodVerifier$pollUntilTerminal$1 = new DomainBoundPaymentMethodVerifier$pollUntilTerminal$1(this, continuationImpl);
        Object obj22 = domainBoundPaymentMethodVerifier$pollUntilTerminal$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = domainBoundPaymentMethodVerifier$pollUntilTerminal$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(jv5 jv5Var, j831 j831Var, k831 k831Var, ContinuationImpl continuationImpl) {
        DomainBoundPaymentMethodVerifier$startVerification$1 domainBoundPaymentMethodVerifier$startVerification$1;
        int i;
        String str;
        l8a0 l8a0Var;
        String str2;
        l8a0 l8a0Var2;
        k8a0 k8a0Var;
        if (continuationImpl instanceof DomainBoundPaymentMethodVerifier$startVerification$1) {
            domainBoundPaymentMethodVerifier$startVerification$1 = (DomainBoundPaymentMethodVerifier$startVerification$1) continuationImpl;
            int i2 = domainBoundPaymentMethodVerifier$startVerification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                domainBoundPaymentMethodVerifier$startVerification$1.label = i2 - Integer.MIN_VALUE;
                DomainBoundPaymentMethodVerifier$startVerification$1 domainBoundPaymentMethodVerifier$startVerification$12 = domainBoundPaymentMethodVerifier$startVerification$1;
                Object obj = domainBoundPaymentMethodVerifier$startVerification$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = domainBoundPaymentMethodVerifier$startVerification$12.label;
                PaymentMethodVerificationSession paymentMethodVerificationSession = this.e;
                if (i != 0) {
                    b.b(obj);
                    str = j831Var.l;
                    if (str == null || evu0.J(str)) {
                        throw new PaymentMethodVerificationProtocolException("Idempotency token is required to start verification");
                    }
                    l8a0Var = paymentMethodVerificationSession.c;
                    if (l8a0Var == null) {
                        String str3 = k831Var.a;
                        domainBoundPaymentMethodVerifier$startVerification$12.L$0 = null;
                        domainBoundPaymentMethodVerifier$startVerification$12.L$1 = null;
                        domainBoundPaymentMethodVerifier$startVerification$12.L$2 = k831Var;
                        domainBoundPaymentMethodVerifier$startVerification$12.L$3 = str;
                        domainBoundPaymentMethodVerifier$startVerification$12.label = 1;
                        obj = c(jv5Var, str3, str, domainBoundPaymentMethodVerifier$startVerification$12);
                        if (obj != obj2) {
                            str2 = str;
                        }
                        return obj2;
                    }
                    if (jl40.l(l8a0Var.b, k831Var.a) || !jl40.l(l8a0Var.e, str)) {
                        throw new PaymentMethodVerificationProtocolException("Verification session does not match request parameters");
                    }
                    String str4 = l8a0Var.d;
                    this.d.a(!(str4 == null || evu0.J(str4)), !evu0.J(l8a0Var.c));
                    String str5 = l8a0Var.a;
                    String str6 = l8a0Var.b;
                    String str7 = l8a0Var.c;
                    String str8 = l8a0Var.d;
                    String str9 = k831Var.c;
                    String str10 = l8a0Var.e;
                    domainBoundPaymentMethodVerifier$startVerification$12.L$0 = null;
                    domainBoundPaymentMethodVerifier$startVerification$12.L$1 = null;
                    domainBoundPaymentMethodVerifier$startVerification$12.L$2 = null;
                    domainBoundPaymentMethodVerifier$startVerification$12.L$3 = null;
                    domainBoundPaymentMethodVerifier$startVerification$12.L$4 = l8a0Var;
                    domainBoundPaymentMethodVerifier$startVerification$12.label = 2;
                    Object b = this.c.b(str5, str6, str7, str8, str9, str10, domainBoundPaymentMethodVerifier$startVerification$12);
                    if (b != obj2) {
                        l8a0 l8a0Var3 = l8a0Var;
                        obj = b;
                        l8a0Var2 = l8a0Var3;
                        k8a0Var = (k8a0) obj;
                        if (jl40.l(k8a0Var.a.b, l8a0Var2.b)) {
                        }
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l8a0Var2 = (l8a0) domainBoundPaymentMethodVerifier$startVerification$12.L$4;
                    b.b(obj);
                    k8a0Var = (k8a0) obj;
                    if (jl40.l(k8a0Var.a.b, l8a0Var2.b)) {
                        throw new PaymentMethodVerificationProtocolException("Verification response contains an unexpected payment method id");
                    }
                    paymentMethodVerificationSession.d = k8a0Var.a.a.a;
                    return k8a0Var;
                }
                str2 = (String) domainBoundPaymentMethodVerifier$startVerification$12.L$3;
                k831 k831Var2 = (k831) domainBoundPaymentMethodVerifier$startVerification$12.L$2;
                b.b(obj);
                k831Var = k831Var2;
                l8a0Var = (l8a0) obj;
                paymentMethodVerificationSession.c = l8a0Var;
                str = str2;
                if (jl40.l(l8a0Var.b, k831Var.a)) {
                }
                throw new PaymentMethodVerificationProtocolException("Verification session does not match request parameters");
            }
        }
        domainBoundPaymentMethodVerifier$startVerification$1 = new DomainBoundPaymentMethodVerifier$startVerification$1(this, continuationImpl);
        DomainBoundPaymentMethodVerifier$startVerification$1 domainBoundPaymentMethodVerifier$startVerification$122 = domainBoundPaymentMethodVerifier$startVerification$1;
        Object obj3 = domainBoundPaymentMethodVerifier$startVerification$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = domainBoundPaymentMethodVerifier$startVerification$122.label;
        PaymentMethodVerificationSession paymentMethodVerificationSession2 = this.e;
        if (i != 0) {
        }
        l8a0Var = (l8a0) obj3;
        paymentMethodVerificationSession2.c = l8a0Var;
        str = str2;
        if (jl40.l(l8a0Var.b, k831Var.a)) {
        }
        throw new PaymentMethodVerificationProtocolException("Verification session does not match request parameters");
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c0, code lost:
    
        if (r4 == r7) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00dc, code lost:
    
        if (r4 == r7) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(jv5 jv5Var, j831 j831Var, k831 k831Var, boolean z, ContinuationImpl continuationImpl) {
        DomainBoundPaymentMethodVerifier$verifyPayment$1 domainBoundPaymentMethodVerifier$verifyPayment$1;
        int i;
        k8a0 k8a0Var;
        String str;
        j831 j831Var2;
        PaymentMethodVerificationResult paymentMethodVerificationResult;
        int i2;
        VerificationStatus verificationStatus;
        tx90 tx90Var;
        j831 j831Var3 = j831Var;
        k831 k831Var2 = k831Var;
        boolean z2 = z;
        if (continuationImpl instanceof DomainBoundPaymentMethodVerifier$verifyPayment$1) {
            domainBoundPaymentMethodVerifier$verifyPayment$1 = (DomainBoundPaymentMethodVerifier$verifyPayment$1) continuationImpl;
            int i3 = domainBoundPaymentMethodVerifier$verifyPayment$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                domainBoundPaymentMethodVerifier$verifyPayment$1.label = i3 - Integer.MIN_VALUE;
                DomainBoundPaymentMethodVerifier$verifyPayment$1 domainBoundPaymentMethodVerifier$verifyPayment$12 = domainBoundPaymentMethodVerifier$verifyPayment$1;
                Object obj = domainBoundPaymentMethodVerifier$verifyPayment$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = domainBoundPaymentMethodVerifier$verifyPayment$12.label;
                PaymentMethodVerificationSession paymentMethodVerificationSession = this.e;
                j831 j831Var4 = null;
                if (i != 0) {
                    b.b(obj);
                    String str2 = paymentMethodVerificationSession.d;
                    if (str2 == null && ((str2 = j831Var3.b) == null || evu0.J(str2))) {
                        str2 = null;
                    }
                    if (str2 == null || evu0.J(str2)) {
                        domainBoundPaymentMethodVerifier$verifyPayment$12.L$0 = null;
                        domainBoundPaymentMethodVerifier$verifyPayment$12.L$1 = j831Var3;
                        domainBoundPaymentMethodVerifier$verifyPayment$12.L$2 = k831Var2;
                        domainBoundPaymentMethodVerifier$verifyPayment$12.L$3 = null;
                        domainBoundPaymentMethodVerifier$verifyPayment$12.Z$0 = z2;
                        domainBoundPaymentMethodVerifier$verifyPayment$12.label = 1;
                        obj = h(jv5Var, j831Var3, k831Var2, domainBoundPaymentMethodVerifier$verifyPayment$12);
                    } else {
                        paymentMethodVerificationSession.d = str2;
                        domainBoundPaymentMethodVerifier$verifyPayment$12.L$0 = null;
                        domainBoundPaymentMethodVerifier$verifyPayment$12.L$1 = j831Var3;
                        domainBoundPaymentMethodVerifier$verifyPayment$12.L$2 = k831Var2;
                        domainBoundPaymentMethodVerifier$verifyPayment$12.L$3 = null;
                        domainBoundPaymentMethodVerifier$verifyPayment$12.Z$0 = z2;
                        domainBoundPaymentMethodVerifier$verifyPayment$12.label = 2;
                        obj = this.c.c(str2, domainBoundPaymentMethodVerifier$verifyPayment$12);
                    }
                    return obj2;
                }
                if (i == 1) {
                    boolean z3 = domainBoundPaymentMethodVerifier$verifyPayment$12.Z$0;
                    k831Var2 = (k831) domainBoundPaymentMethodVerifier$verifyPayment$12.L$2;
                    j831 j831Var5 = (j831) domainBoundPaymentMethodVerifier$verifyPayment$12.L$1;
                    b.b(obj);
                    z2 = z3;
                    j831Var3 = j831Var5;
                    k8a0Var = (k8a0) obj;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j831Var2 = (j831) domainBoundPaymentMethodVerifier$verifyPayment$12.L$1;
                        b.b(obj);
                        paymentMethodVerificationResult = ((k8a0) obj).a.a;
                        i2 = s3m.a[paymentMethodVerificationResult.c.ordinal()];
                        if (i2 != 2) {
                            verificationStatus = VerificationStatus.REQUIRED_3DS;
                        } else if (i2 == 5) {
                            verificationStatus = VerificationStatus.SUCCESS;
                        } else {
                            if (i2 != 6) {
                                throw new PaymentMethodVerificationProtocolException("Non-terminal payment method verification response cannot be mapped");
                            }
                            verificationStatus = VerificationStatus.FAILURE;
                        }
                        VerificationStatus verificationStatus2 = verificationStatus;
                        m831 m831Var = j831Var2.a;
                        String str3 = paymentMethodVerificationResult.a;
                        PaymentMethodVerificationError paymentMethodVerificationError = paymentMethodVerificationResult.f;
                        Verification verification = new Verification(str3, paymentMethodVerificationError == null ? paymentMethodVerificationError.b : null, verificationStatus2, paymentMethodVerificationResult.b, paymentMethodVerificationResult.d, (String) null, (String) null, paymentMethodVerificationResult.e, (Integer) null, paymentMethodVerificationError == null ? paymentMethodVerificationError.a : null, 352);
                        tx90 tx90Var2 = j831Var2.m;
                        if (paymentMethodVerificationResult.c == PaymentMethodVerificationStatus.REQUIRED_3DS) {
                            tx90Var = tx90Var2;
                        } else {
                            tx90Var = tx90Var2;
                            j831Var4 = new j831(j831Var2.a, paymentMethodVerificationResult.a, paymentMethodVerificationResult.b, j831Var2.d, j831Var2.e, VerificationStatus.REQUIRED_3DS, j831Var2.g, j831Var2.j, j831Var2.k, j831Var2.l, tx90Var, paymentMethodVerificationResult.d, 384);
                        }
                        return new p731(m831Var, verification, tx90Var, j831Var4, 4);
                    }
                    boolean z4 = domainBoundPaymentMethodVerifier$verifyPayment$12.Z$0;
                    k831Var2 = (k831) domainBoundPaymentMethodVerifier$verifyPayment$12.L$2;
                    j831 j831Var6 = (j831) domainBoundPaymentMethodVerifier$verifyPayment$12.L$1;
                    b.b(obj);
                    z2 = z4;
                    j831Var3 = j831Var6;
                    k8a0Var = (k8a0) obj;
                }
                k8a0 k8a0Var2 = k8a0Var;
                j831 j831Var7 = j831Var3;
                boolean z5 = z2;
                str = paymentMethodVerificationSession.d;
                if (str != null) {
                    throw new PaymentMethodVerificationProtocolException("Verification session does not contain an id");
                }
                if (!jl40.l(k8a0Var2.a.b, k831Var2.a)) {
                    throw new PaymentMethodVerificationProtocolException("Verification response contains an unexpected payment method id");
                }
                if (!jl40.l(k8a0Var2.a.a.a, str)) {
                    throw new PaymentMethodVerificationProtocolException("Verification response contains an unexpected id");
                }
                String str4 = k831Var2.a;
                domainBoundPaymentMethodVerifier$verifyPayment$12.L$0 = null;
                domainBoundPaymentMethodVerifier$verifyPayment$12.L$1 = j831Var7;
                domainBoundPaymentMethodVerifier$verifyPayment$12.L$2 = null;
                domainBoundPaymentMethodVerifier$verifyPayment$12.L$3 = null;
                domainBoundPaymentMethodVerifier$verifyPayment$12.L$4 = null;
                domainBoundPaymentMethodVerifier$verifyPayment$12.L$5 = null;
                domainBoundPaymentMethodVerifier$verifyPayment$12.Z$0 = z5;
                domainBoundPaymentMethodVerifier$verifyPayment$12.label = 3;
                Object e = e(k8a0Var2, str4, str, j831Var7, z5, domainBoundPaymentMethodVerifier$verifyPayment$12);
                if (e != obj2) {
                    obj = e;
                    j831Var2 = j831Var7;
                    paymentMethodVerificationResult = ((k8a0) obj).a.a;
                    i2 = s3m.a[paymentMethodVerificationResult.c.ordinal()];
                    if (i2 != 2) {
                    }
                    VerificationStatus verificationStatus22 = verificationStatus;
                    m831 m831Var2 = j831Var2.a;
                    String str32 = paymentMethodVerificationResult.a;
                    PaymentMethodVerificationError paymentMethodVerificationError2 = paymentMethodVerificationResult.f;
                    Verification verification2 = new Verification(str32, paymentMethodVerificationError2 == null ? paymentMethodVerificationError2.b : null, verificationStatus22, paymentMethodVerificationResult.b, paymentMethodVerificationResult.d, (String) null, (String) null, paymentMethodVerificationResult.e, (Integer) null, paymentMethodVerificationError2 == null ? paymentMethodVerificationError2.a : null, 352);
                    tx90 tx90Var22 = j831Var2.m;
                    if (paymentMethodVerificationResult.c == PaymentMethodVerificationStatus.REQUIRED_3DS) {
                    }
                    return new p731(m831Var2, verification2, tx90Var, j831Var4, 4);
                }
                return obj2;
            }
        }
        domainBoundPaymentMethodVerifier$verifyPayment$1 = new DomainBoundPaymentMethodVerifier$verifyPayment$1(this, continuationImpl);
        DomainBoundPaymentMethodVerifier$verifyPayment$1 domainBoundPaymentMethodVerifier$verifyPayment$122 = domainBoundPaymentMethodVerifier$verifyPayment$1;
        Object obj3 = domainBoundPaymentMethodVerifier$verifyPayment$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = domainBoundPaymentMethodVerifier$verifyPayment$122.label;
        PaymentMethodVerificationSession paymentMethodVerificationSession2 = this.e;
        j831 j831Var42 = null;
        if (i != 0) {
        }
        k8a0 k8a0Var22 = k8a0Var;
        j831 j831Var72 = j831Var3;
        boolean z52 = z2;
        str = paymentMethodVerificationSession2.d;
        if (str != null) {
        }
    }
}
