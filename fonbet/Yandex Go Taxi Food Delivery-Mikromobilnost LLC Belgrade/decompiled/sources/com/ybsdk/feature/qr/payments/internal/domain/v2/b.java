package com.ybsdk.feature.qr.payments.internal.domain.v2;

import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.utils.network.retryPolicy.RetryTimeoutException;
import com.ybsdk.core.utils.poller.PollerTimeoutException;
import com.ybsdk.feature.qr.payments.api.QrSource;
import com.ybsdk.feature.qr.payments.internal.domain.model.QrPaymentBankInfo;
import com.ybsdk.feature.qr.payments.internal.network.QrPaymentsApi;
import com.ybsdk.feature.qr.payments.internal.screens.result.data.entities.ResultStatus;
import com.ybsdk.utils.poller.c;
import defpackage.acu;
import defpackage.bg1;
import defpackage.bqg;
import defpackage.c6g;
import defpackage.c6g0;
import defpackage.cag0;
import defpackage.cqg;
import defpackage.dqg;
import defpackage.g8e;
import defpackage.kxb0;
import defpackage.lrp0;
import defpackage.ny61;
import defpackage.o8g0;
import defpackage.obg0;
import defpackage.pk11;
import defpackage.q0e0;
import defpackage.qk11;
import defpackage.rk11;
import defpackage.s0e0;
import defpackage.sk11;
import defpackage.tpr;
import defpackage.tzj0;
import defpackage.vag0;
import defpackage.w511;
import defpackage.x4c;
import defpackage.xvf0;
import defpackage.yxf0;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.UUID;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b {
    public final com.ybsdk.utils.poller.b a;
    public final c6g0 b;
    public final com.ybsdk.feature.qr.payments.internal.screens.presentation.b c;
    public final bg1 d;
    public final com.ybsdk.di.modules.features.qr.a e;
    public final com.ybsdk.feature.qr.payments.internal.data.b f;
    public final com.ybsdk.feature.qr.payments.internal.screens.subscription.data.a g;

    public b(obg0 obg0Var, vag0 vag0Var, com.ybsdk.utils.poller.b bVar, c6g0 c6g0Var, com.ybsdk.feature.qr.payments.internal.screens.presentation.b bVar2, bg1 bg1Var, com.ybsdk.di.modules.features.qr.a aVar) {
        this.a = bVar;
        this.b = c6g0Var;
        this.c = bVar2;
        this.d = bg1Var;
        this.e = aVar;
        o8g0 o8g0Var = obg0Var.a;
        this.f = new com.ybsdk.feature.qr.payments.internal.data.b((QrPaymentsApi) ((kxb0) o8g0Var.a).get(), c6g0Var, (com.ybsdk.feature.qr.payments.internal.screens.result.domain.a) ((xvf0) o8g0Var.b).get());
        String str = c6g0Var.b;
        yxf0 yxf0Var = vag0Var.a;
        this.g = new com.ybsdk.feature.qr.payments.internal.screens.subscription.data.a((QrPaymentsApi) ((kxb0) yxf0Var.a).get(), (com.ybsdk.di.modules.features.qr.a) ((c6g) yxf0Var.b).get(), str, bVar2);
    }

    public static tzj0 f(Throwable th, QrPaymentsV2Interactor$FailResult qrPaymentsV2Interactor$FailResult) {
        x4c.g(g8e.o("Exception during call ", qrPaymentsV2Interactor$FailResult.name()), th, null, Collections.singletonList(lrp0.x), 4);
        return ((th instanceof PollerTimeoutException) || (th instanceof RetryTimeoutException)) ? new tzj0(ResultStatus.TIMEOUT, null, 14) : new tzj0(ResultStatus.ERROR, null, 14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ae, code lost:
    
        if (r3 == r14) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Money money, QrSource qrSource, QrPaymentBankInfo qrPaymentBankInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, ContinuationImpl continuationImpl) {
        QrPaymentsV2Interactor$callConfirmV3$1 qrPaymentsV2Interactor$callConfirmV3$1;
        int i;
        QrSource qrSource2;
        QrPaymentBankInfo qrPaymentBankInfo2;
        String str8;
        String str9;
        String str10;
        Object obj;
        String str11;
        String str12;
        Money money2;
        String str13;
        String str14;
        String str15;
        String str16;
        Money money3;
        String str17;
        String str18;
        Object a;
        String str19;
        if (continuationImpl instanceof QrPaymentsV2Interactor$callConfirmV3$1) {
            qrPaymentsV2Interactor$callConfirmV3$1 = (QrPaymentsV2Interactor$callConfirmV3$1) continuationImpl;
            int i2 = qrPaymentsV2Interactor$callConfirmV3$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrPaymentsV2Interactor$callConfirmV3$1.label = i2 - Integer.MIN_VALUE;
                QrPaymentsV2Interactor$callConfirmV3$1 qrPaymentsV2Interactor$callConfirmV3$12 = qrPaymentsV2Interactor$callConfirmV3$1;
                Object obj2 = qrPaymentsV2Interactor$callConfirmV3$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrPaymentsV2Interactor$callConfirmV3$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (str5 != null) {
                        qrSource2 = qrSource;
                        qrPaymentBankInfo2 = qrPaymentBankInfo;
                        str8 = str6;
                        str9 = str7;
                        str10 = str;
                        obj = null;
                        str11 = str2;
                        str12 = str3;
                        money2 = money;
                        str13 = str4;
                        str14 = str5;
                        Object obj3 = obj;
                        QrPaymentsV2Interactor$callConfirmV3$2 qrPaymentsV2Interactor$callConfirmV3$2 = new QrPaymentsV2Interactor$callConfirmV3$2(this, str12, str10, str11, str13, money2, str14, str8, str9, qrSource2, qrPaymentBankInfo2, null);
                        qrPaymentsV2Interactor$callConfirmV3$12.L$0 = obj3;
                        qrPaymentsV2Interactor$callConfirmV3$12.L$1 = obj3;
                        qrPaymentsV2Interactor$callConfirmV3$12.L$2 = obj3;
                        qrPaymentsV2Interactor$callConfirmV3$12.L$3 = obj3;
                        qrPaymentsV2Interactor$callConfirmV3$12.L$4 = obj3;
                        qrPaymentsV2Interactor$callConfirmV3$12.L$5 = obj3;
                        qrPaymentsV2Interactor$callConfirmV3$12.L$6 = obj3;
                        qrPaymentsV2Interactor$callConfirmV3$12.L$7 = obj3;
                        qrPaymentsV2Interactor$callConfirmV3$12.L$8 = obj3;
                        qrPaymentsV2Interactor$callConfirmV3$12.label = 2;
                        Object O = this.c.O(qrPaymentsV2Interactor$callConfirmV3$2, str12, qrPaymentsV2Interactor$callConfirmV3$12);
                        return O != coroutineSingletons ? coroutineSingletons : O;
                    }
                    str15 = str;
                    qrPaymentsV2Interactor$callConfirmV3$12.L$0 = str15;
                    str16 = str2;
                    qrPaymentsV2Interactor$callConfirmV3$12.L$1 = str16;
                    money3 = money;
                    qrPaymentsV2Interactor$callConfirmV3$12.L$2 = money3;
                    str17 = str3;
                    qrPaymentsV2Interactor$callConfirmV3$12.L$3 = str17;
                    str18 = str4;
                    qrPaymentsV2Interactor$callConfirmV3$12.L$4 = str18;
                    str8 = str6;
                    qrPaymentsV2Interactor$callConfirmV3$12.L$5 = str8;
                    str9 = str7;
                    qrPaymentsV2Interactor$callConfirmV3$12.L$6 = str9;
                    qrSource2 = qrSource;
                    qrPaymentsV2Interactor$callConfirmV3$12.L$7 = qrSource2;
                    qrPaymentBankInfo2 = qrPaymentBankInfo;
                    qrPaymentsV2Interactor$callConfirmV3$12.L$8 = qrPaymentBankInfo2;
                    qrPaymentsV2Interactor$callConfirmV3$12.label = 1;
                    a = this.e.a(qrPaymentsV2Interactor$callConfirmV3$12);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj2);
                            return ((Result) obj2).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    QrPaymentBankInfo qrPaymentBankInfo3 = (QrPaymentBankInfo) qrPaymentsV2Interactor$callConfirmV3$12.L$8;
                    QrSource qrSource3 = (QrSource) qrPaymentsV2Interactor$callConfirmV3$12.L$7;
                    String str20 = (String) qrPaymentsV2Interactor$callConfirmV3$12.L$6;
                    String str21 = (String) qrPaymentsV2Interactor$callConfirmV3$12.L$5;
                    str18 = (String) qrPaymentsV2Interactor$callConfirmV3$12.L$4;
                    String str22 = (String) qrPaymentsV2Interactor$callConfirmV3$12.L$3;
                    Money money4 = (Money) qrPaymentsV2Interactor$callConfirmV3$12.L$2;
                    String str23 = (String) qrPaymentsV2Interactor$callConfirmV3$12.L$1;
                    String str24 = (String) qrPaymentsV2Interactor$callConfirmV3$12.L$0;
                    kotlin.b.b(obj2);
                    a = ((Result) obj2).getValue();
                    str15 = str24;
                    qrPaymentBankInfo2 = qrPaymentBankInfo3;
                    str16 = str23;
                    qrSource2 = qrSource3;
                    str9 = str20;
                    money3 = money4;
                    str8 = str21;
                    str17 = str22;
                }
                if (a instanceof Result.Failure) {
                    a = null;
                }
                str19 = (String) a;
                if (str19 != null) {
                    return new Result.Failure(new Throwable("Agreement is null in confirming payment"));
                }
                str10 = str15;
                obj = null;
                str11 = str16;
                str12 = str17;
                money2 = money3;
                str13 = str18;
                str14 = str19;
                Object obj32 = obj;
                QrPaymentsV2Interactor$callConfirmV3$2 qrPaymentsV2Interactor$callConfirmV3$22 = new QrPaymentsV2Interactor$callConfirmV3$2(this, str12, str10, str11, str13, money2, str14, str8, str9, qrSource2, qrPaymentBankInfo2, null);
                qrPaymentsV2Interactor$callConfirmV3$12.L$0 = obj32;
                qrPaymentsV2Interactor$callConfirmV3$12.L$1 = obj32;
                qrPaymentsV2Interactor$callConfirmV3$12.L$2 = obj32;
                qrPaymentsV2Interactor$callConfirmV3$12.L$3 = obj32;
                qrPaymentsV2Interactor$callConfirmV3$12.L$4 = obj32;
                qrPaymentsV2Interactor$callConfirmV3$12.L$5 = obj32;
                qrPaymentsV2Interactor$callConfirmV3$12.L$6 = obj32;
                qrPaymentsV2Interactor$callConfirmV3$12.L$7 = obj32;
                qrPaymentsV2Interactor$callConfirmV3$12.L$8 = obj32;
                qrPaymentsV2Interactor$callConfirmV3$12.label = 2;
                Object O2 = this.c.O(qrPaymentsV2Interactor$callConfirmV3$22, str12, qrPaymentsV2Interactor$callConfirmV3$12);
                if (O2 != coroutineSingletons) {
                }
            }
        }
        qrPaymentsV2Interactor$callConfirmV3$1 = new QrPaymentsV2Interactor$callConfirmV3$1(this, continuationImpl);
        QrPaymentsV2Interactor$callConfirmV3$1 qrPaymentsV2Interactor$callConfirmV3$122 = qrPaymentsV2Interactor$callConfirmV3$1;
        Object obj22 = qrPaymentsV2Interactor$callConfirmV3$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrPaymentsV2Interactor$callConfirmV3$122.label;
        if (i != 0) {
        }
        if (a instanceof Result.Failure) {
        }
        str19 = (String) a;
        if (str19 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        QrPaymentsV2Interactor$callGetResult$1 qrPaymentsV2Interactor$callGetResult$1;
        int i;
        if (continuationImpl instanceof QrPaymentsV2Interactor$callGetResult$1) {
            qrPaymentsV2Interactor$callGetResult$1 = (QrPaymentsV2Interactor$callGetResult$1) continuationImpl;
            int i2 = qrPaymentsV2Interactor$callGetResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrPaymentsV2Interactor$callGetResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = qrPaymentsV2Interactor$callGetResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrPaymentsV2Interactor$callGetResult$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                c c = this.a.c(s0e0.b, new QrPaymentsV2Interactor$callGetResult$2(2, null), new QrPaymentsV2Interactor$callGetResult$3(this, str, null));
                qrPaymentsV2Interactor$callGetResult$1.label = 1;
                Object e = c.e(qrPaymentsV2Interactor$callGetResult$1);
                return e == coroutineSingletons ? coroutineSingletons : e;
            }
        }
        qrPaymentsV2Interactor$callGetResult$1 = new QrPaymentsV2Interactor$callGetResult$1(this, continuationImpl);
        Object obj2 = qrPaymentsV2Interactor$callGetResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrPaymentsV2Interactor$callGetResult$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, BigDecimal bigDecimal, String str2, String str3, QrPaymentBankInfo qrPaymentBankInfo, ContinuationImpl continuationImpl) {
        QrPaymentsV2Interactor$checkPayment$1 qrPaymentsV2Interactor$checkPayment$1;
        int i;
        if (continuationImpl instanceof QrPaymentsV2Interactor$checkPayment$1) {
            qrPaymentsV2Interactor$checkPayment$1 = (QrPaymentsV2Interactor$checkPayment$1) continuationImpl;
            int i2 = qrPaymentsV2Interactor$checkPayment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrPaymentsV2Interactor$checkPayment$1.label = i2 - Integer.MIN_VALUE;
                QrPaymentsV2Interactor$checkPayment$1 qrPaymentsV2Interactor$checkPayment$12 = qrPaymentsV2Interactor$checkPayment$1;
                Object obj = qrPaymentsV2Interactor$checkPayment$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrPaymentsV2Interactor$checkPayment$12.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                UUID randomUUID = UUID.randomUUID();
                QrPaymentsV2Interactor$checkPayment$2 qrPaymentsV2Interactor$checkPayment$2 = new QrPaymentsV2Interactor$checkPayment$2(this, str, bigDecimal, str2, str3, qrPaymentBankInfo, null);
                qrPaymentsV2Interactor$checkPayment$12.label = 1;
                Object O = this.c.O(qrPaymentsV2Interactor$checkPayment$2, randomUUID, qrPaymentsV2Interactor$checkPayment$12);
                return O == coroutineSingletons ? coroutineSingletons : O;
            }
        }
        qrPaymentsV2Interactor$checkPayment$1 = new QrPaymentsV2Interactor$checkPayment$1(this, continuationImpl);
        QrPaymentsV2Interactor$checkPayment$1 qrPaymentsV2Interactor$checkPayment$122 = qrPaymentsV2Interactor$checkPayment$1;
        Object obj2 = qrPaymentsV2Interactor$checkPayment$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrPaymentsV2Interactor$checkPayment$122.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Money money, QrSource qrSource, QrPaymentBankInfo qrPaymentBankInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, ContinuationImpl continuationImpl) {
        QrPaymentsV2Interactor$confirmPayment$1 qrPaymentsV2Interactor$confirmPayment$1;
        int i;
        Object a;
        Throwable a2;
        if (continuationImpl instanceof QrPaymentsV2Interactor$confirmPayment$1) {
            qrPaymentsV2Interactor$confirmPayment$1 = (QrPaymentsV2Interactor$confirmPayment$1) continuationImpl;
            int i2 = qrPaymentsV2Interactor$confirmPayment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrPaymentsV2Interactor$confirmPayment$1.label = i2 - Integer.MIN_VALUE;
                QrPaymentsV2Interactor$confirmPayment$1 qrPaymentsV2Interactor$confirmPayment$12 = qrPaymentsV2Interactor$confirmPayment$1;
                Object obj = qrPaymentsV2Interactor$confirmPayment$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrPaymentsV2Interactor$confirmPayment$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    qrPaymentsV2Interactor$confirmPayment$12.label = 1;
                    a = a(money, qrSource, qrPaymentBankInfo, str3, str4, str, str2, str5, str6, str7, qrPaymentsV2Interactor$confirmPayment$12);
                    if (a == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                a2 = Result.a(a);
                if (a2 == null) {
                    return new rk11(f(a2, QrPaymentsV2Interactor$FailResult.CONFIRM));
                }
                sk11 sk11Var = (sk11) a;
                if (sk11Var instanceof pk11) {
                    pk11 pk11Var = (pk11) sk11Var;
                    return new pk11(pk11Var.a, pk11Var.b);
                }
                if (sk11Var instanceof qk11) {
                    qk11 qk11Var = (qk11) sk11Var;
                    return new qk11(qk11Var.a, qk11Var.b, qk11Var.c, qk11Var.d, qk11Var.e, qk11Var.f);
                }
                if (sk11Var instanceof rk11) {
                    cag0 cag0Var = (cag0) ((rk11) sk11Var).a;
                    return new rk11(new tzj0(cag0Var.a, cag0Var.b, 8));
                }
                w511.b();
                return null;
            }
        }
        qrPaymentsV2Interactor$confirmPayment$1 = new QrPaymentsV2Interactor$confirmPayment$1(this, continuationImpl);
        QrPaymentsV2Interactor$confirmPayment$1 qrPaymentsV2Interactor$confirmPayment$122 = qrPaymentsV2Interactor$confirmPayment$1;
        Object obj3 = qrPaymentsV2Interactor$confirmPayment$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrPaymentsV2Interactor$confirmPayment$122.label;
        if (i != 0) {
        }
        a2 = Result.a(a);
        if (a2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        QrPaymentsV2Interactor$confirmSubscription$1 qrPaymentsV2Interactor$confirmSubscription$1;
        int i;
        if (continuationImpl instanceof QrPaymentsV2Interactor$confirmSubscription$1) {
            qrPaymentsV2Interactor$confirmSubscription$1 = (QrPaymentsV2Interactor$confirmSubscription$1) continuationImpl;
            int i2 = qrPaymentsV2Interactor$confirmSubscription$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrPaymentsV2Interactor$confirmSubscription$1.label = i2 - Integer.MIN_VALUE;
                QrPaymentsV2Interactor$confirmSubscription$1 qrPaymentsV2Interactor$confirmSubscription$12 = qrPaymentsV2Interactor$confirmSubscription$1;
                Object obj = qrPaymentsV2Interactor$confirmSubscription$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrPaymentsV2Interactor$confirmSubscription$12.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                String str4 = this.b.a;
                qrPaymentsV2Interactor$confirmSubscription$12.label = 1;
                Object a = this.g.a(str4, str, str2, str3, qrPaymentsV2Interactor$confirmSubscription$12);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        qrPaymentsV2Interactor$confirmSubscription$1 = new QrPaymentsV2Interactor$confirmSubscription$1(this, continuationImpl);
        QrPaymentsV2Interactor$confirmSubscription$1 qrPaymentsV2Interactor$confirmSubscription$122 = qrPaymentsV2Interactor$confirmSubscription$1;
        Object obj2 = qrPaymentsV2Interactor$confirmSubscription$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrPaymentsV2Interactor$confirmSubscription$122.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, BigDecimal bigDecimal, String str2, ContinuationImpl continuationImpl) {
        QrPaymentsV2Interactor$getInfo$1 qrPaymentsV2Interactor$getInfo$1;
        int i;
        if (continuationImpl instanceof QrPaymentsV2Interactor$getInfo$1) {
            qrPaymentsV2Interactor$getInfo$1 = (QrPaymentsV2Interactor$getInfo$1) continuationImpl;
            int i2 = qrPaymentsV2Interactor$getInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrPaymentsV2Interactor$getInfo$1.label = i2 - Integer.MIN_VALUE;
                QrPaymentsV2Interactor$getInfo$1 qrPaymentsV2Interactor$getInfo$12 = qrPaymentsV2Interactor$getInfo$1;
                Object obj = qrPaymentsV2Interactor$getInfo$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrPaymentsV2Interactor$getInfo$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c c = this.a.c(q0e0.b, new QrPaymentsV2Interactor$getInfo$2(2, null), new QrPaymentsV2Interactor$getInfo$3(this, str, bigDecimal, str2, null));
                    qrPaymentsV2Interactor$getInfo$12.label = 1;
                    obj = c.d(null, qrPaymentsV2Interactor$getInfo$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new acu((tpr) obj, 18);
            }
        }
        qrPaymentsV2Interactor$getInfo$1 = new QrPaymentsV2Interactor$getInfo$1(this, continuationImpl);
        QrPaymentsV2Interactor$getInfo$1 qrPaymentsV2Interactor$getInfo$122 = qrPaymentsV2Interactor$getInfo$1;
        Object obj2 = qrPaymentsV2Interactor$getInfo$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrPaymentsV2Interactor$getInfo$122.label;
        if (i != 0) {
        }
        return new acu((tpr) obj2, 18);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, ContinuationImpl continuationImpl) {
        QrPaymentsV2Interactor$getResult$1 qrPaymentsV2Interactor$getResult$1;
        int i;
        Object b;
        Throwable a;
        if (continuationImpl instanceof QrPaymentsV2Interactor$getResult$1) {
            qrPaymentsV2Interactor$getResult$1 = (QrPaymentsV2Interactor$getResult$1) continuationImpl;
            int i2 = qrPaymentsV2Interactor$getResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrPaymentsV2Interactor$getResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = qrPaymentsV2Interactor$getResult$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrPaymentsV2Interactor$getResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    qrPaymentsV2Interactor$getResult$1.label = 1;
                    b = b(str, qrPaymentsV2Interactor$getResult$1);
                    if (b == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                }
                a = Result.a(b);
                if (a == null) {
                    return f(a, QrPaymentsV2Interactor$FailResult.GET_RESULT);
                }
                dqg dqgVar = (dqg) b;
                if (dqgVar instanceof bqg) {
                    return new tzj0(ResultStatus.FAILED, null, 14);
                }
                if (dqgVar instanceof cqg) {
                    return (tzj0) ((cqg) dqgVar).a;
                }
                w511.b();
                return null;
            }
        }
        qrPaymentsV2Interactor$getResult$1 = new QrPaymentsV2Interactor$getResult$1(this, continuationImpl);
        Object obj3 = qrPaymentsV2Interactor$getResult$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrPaymentsV2Interactor$getResult$1.label;
        if (i != 0) {
        }
        a = Result.a(b);
        if (a == null) {
        }
    }
}
