package com.ybsdk.api;

import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.common.SdkUserAuthRequirement;
import com.ybsdk.common.StartSessionCallSource;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.CommonEvents$BalanceRequestResultResult;
import com.ybsdk.core.analytics.generated.delegates.CommonEvents$PublicEventsNotifyEvent;
import com.ybsdk.core.analytics.generated.delegates.PublicApiEvents$PublicApiCompactHorizontalWidgetUpdateResultResult;
import com.ybsdk.core.analytics.generated.delegates.PublicApiEvents$PublicApiPaymentCheckRequestResultResult;
import com.ybsdk.core.analytics.generated.delegates.PublicApiEvents$PublicApiPaymentsMethodsUpdate2ResultResult;
import com.ybsdk.core.analytics.generated.delegates.PublicApiEvents$PublicApiPaymentsMethodsUpdateResultResult;
import com.ybsdk.core.common.domain.entities.BalanceEntity;
import com.ybsdk.screens.initial.deeplink.i;
import defpackage.a3h;
import defpackage.ag51;
import defpackage.ah51;
import defpackage.bpp0;
import defpackage.c4u0;
import defpackage.dh51;
import defpackage.e3n;
import defpackage.e4u0;
import defpackage.eh51;
import defpackage.em3;
import defpackage.ffx;
import defpackage.fh51;
import defpackage.fyf0;
import defpackage.g92;
import defpackage.gci0;
import defpackage.gff;
import defpackage.ha2;
import defpackage.jqr;
import defpackage.kp50;
import defpackage.mth;
import defpackage.ny61;
import defpackage.o430;
import defpackage.qe01;
import defpackage.qg51;
import defpackage.r6a0;
import defpackage.rg51;
import defpackage.tg51;
import defpackage.top0;
import defpackage.tse;
import defpackage.ug51;
import defpackage.vg51;
import defpackage.w511;
import defpackage.w530;
import defpackage.wg51;
import defpackage.wsr0;
import defpackage.wt51;
import defpackage.xg51;
import defpackage.xh51;
import defpackage.xsr0;
import defpackage.yg51;
import defpackage.yvf0;
import defpackage.zf51;
import defpackage.zg51;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.h;
import kotlinx.coroutines.flow.n0;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes8.dex */
public final class e {
    public final tse a;
    public final com.ybsdk.common.domain.b b;
    public final com.ybsdk.common.e c;
    public final r6a0 d;
    public final com.ybsdk.common.repositiories.payment.a e;
    public final AppAnalyticsReporter f;
    public final com.ybsdk.common.repositiories.user.a g;
    public final com.ybsdk.common.repositiories.agreements.a h;
    public final a3h i;
    public final wt51 j;
    public final com.ybsdk.common.domain.c k;
    public final yvf0 l;
    public final i m;
    public final com.ybsdk.common.repositiories.card.c n;
    public final bpp0 o;
    public final com.ybsdk.common.repositiories.cashback.a p;
    public final top0 q;
    public final w530 r;
    public final gci0 s;
    public final n0 t;

    public e(tse tseVar, com.ybsdk.common.domain.b bVar, com.ybsdk.common.e eVar, gff gffVar, r6a0 r6a0Var, com.ybsdk.common.repositiories.payment.a aVar, AppAnalyticsReporter appAnalyticsReporter, com.ybsdk.common.repositiories.user.a aVar2, com.ybsdk.common.repositiories.agreements.a aVar3, a3h a3hVar, wt51 wt51Var, com.ybsdk.common.domain.c cVar, yvf0 yvf0Var, c4u0 c4u0Var, i iVar, com.ybsdk.common.repositiories.card.c cVar2, bpp0 bpp0Var, com.ybsdk.common.repositiories.cashback.a aVar4, top0 top0Var, w530 w530Var) {
        this.a = tseVar;
        this.b = bVar;
        this.c = eVar;
        this.d = r6a0Var;
        this.e = aVar;
        this.f = appAnalyticsReporter;
        this.g = aVar2;
        this.h = aVar3;
        this.i = a3hVar;
        this.j = wt51Var;
        this.k = cVar;
        this.l = yvf0Var;
        this.m = iVar;
        this.n = cVar2;
        this.o = bpp0Var;
        this.p = aVar4;
        this.q = top0Var;
        this.r = w530Var;
        com.ybsdk.common.repositiories.payment.b bVar2 = (com.ybsdk.common.repositiories.payment.b) r6a0Var;
        ha2 n = kotlinx.coroutines.flow.e.n(kotlinx.coroutines.flow.e.t(gffVar.c), new ha2(16, bVar.c, this), bVar2.i, new PublicApiInteractor$sdkStateFlow$2(this, null));
        xsr0.a.getClass();
        gci0 R = kotlinx.coroutines.flow.e.R(n, tseVar, wsr0.b, xh51.d);
        this.s = R;
        this.t = ffx.c(0, 16, BufferOverflow.DROP_OLDEST, 1);
        kotlinx.coroutines.flow.e.H(tseVar, new jqr(new g92(7, R), new PublicApiInteractor$2(this, null), 3));
        h K = kotlinx.coroutines.flow.e.K(R, ((e4u0) c4u0Var).w);
        o430 o430Var = e3n.b;
        com.ybsdk.core.utils.ext.c.a(new g92(8, kotlinx.coroutines.flow.e.N(K, kotlinx.coroutines.a.t(kp50.U(1, DurationUnit.SECONDS)))), tseVar, new fyf0(this, 0));
        com.ybsdk.core.utils.ext.c.a(new mth(bVar2.k, 14), tseVar, new fyf0(this, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        if (r7 == r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        if (r11 == r2) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, BigDecimal bigDecimal, String str2, ContinuationImpl continuationImpl) {
        PublicApiInteractor$checkPayment$1 publicApiInteractor$checkPayment$1;
        int i;
        Object a;
        Throwable a2;
        Object failure;
        em3 em3Var = this.f.W;
        if (continuationImpl instanceof PublicApiInteractor$checkPayment$1) {
            publicApiInteractor$checkPayment$1 = (PublicApiInteractor$checkPayment$1) continuationImpl;
            int i2 = publicApiInteractor$checkPayment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                publicApiInteractor$checkPayment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = publicApiInteractor$checkPayment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = publicApiInteractor$checkPayment$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    em3Var.a.a("public_api.payment_check_request.initiated", null);
                    publicApiInteractor$checkPayment$1.L$0 = str;
                    publicApiInteractor$checkPayment$1.L$1 = bigDecimal;
                    publicApiInteractor$checkPayment$1.L$2 = str2;
                    publicApiInteractor$checkPayment$1.label = 1;
                    a = this.c.a("checkPayment", SdkUserAuthRequirement.IS_NORMAL, publicApiInteractor$checkPayment$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        failure = ((Result) obj).getValue();
                        if (!(failure instanceof Result.Failure)) {
                            em3.o(em3Var, PublicApiEvents$PublicApiPaymentCheckRequestResultResult.OK);
                        }
                        if (Result.a(failure) != null) {
                            em3.o(em3Var, PublicApiEvents$PublicApiPaymentCheckRequestResultResult.ERROR);
                        }
                        return failure;
                    }
                    str2 = (String) publicApiInteractor$checkPayment$1.L$2;
                    bigDecimal = (BigDecimal) publicApiInteractor$checkPayment$1.L$1;
                    str = (String) publicApiInteractor$checkPayment$1.L$0;
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    publicApiInteractor$checkPayment$1.L$0 = null;
                    publicApiInteractor$checkPayment$1.L$1 = null;
                    publicApiInteractor$checkPayment$1.L$2 = null;
                    publicApiInteractor$checkPayment$1.label = 2;
                    failure = this.e.a(str, bigDecimal, str2, publicApiInteractor$checkPayment$1);
                } else {
                    failure = new Result.Failure(a2);
                }
                if (!(failure instanceof Result.Failure)) {
                }
                if (Result.a(failure) != null) {
                }
                return failure;
            }
        }
        publicApiInteractor$checkPayment$1 = new PublicApiInteractor$checkPayment$1(this, continuationImpl);
        Object obj2 = publicApiInteractor$checkPayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = publicApiInteractor$checkPayment$1.label;
        if (i != 0) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
        if (!(failure instanceof Result.Failure)) {
        }
        if (Result.a(failure) != null) {
        }
        return failure;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        PublicApiInteractor$getCardDeliveryApplicationStatus$1 publicApiInteractor$getCardDeliveryApplicationStatus$1;
        int i;
        if (continuationImpl instanceof PublicApiInteractor$getCardDeliveryApplicationStatus$1) {
            publicApiInteractor$getCardDeliveryApplicationStatus$1 = (PublicApiInteractor$getCardDeliveryApplicationStatus$1) continuationImpl;
            int i2 = publicApiInteractor$getCardDeliveryApplicationStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                publicApiInteractor$getCardDeliveryApplicationStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = publicApiInteractor$getCardDeliveryApplicationStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = publicApiInteractor$getCardDeliveryApplicationStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    publicApiInteractor$getCardDeliveryApplicationStatus$1.label = 1;
                    Object a = this.n.a(str, publicApiInteractor$getCardDeliveryApplicationStatus$1);
                    return a == coroutineSingletons ? coroutineSingletons : a;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        publicApiInteractor$getCardDeliveryApplicationStatus$1 = new PublicApiInteractor$getCardDeliveryApplicationStatus$1(this, continuationImpl);
        Object obj2 = publicApiInteractor$getCardDeliveryApplicationStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = publicApiInteractor$getCardDeliveryApplicationStatus$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(YBProduct yBProduct, ContinuationImpl continuationImpl) {
        PublicApiInteractor$getCashbackStatus$1 publicApiInteractor$getCashbackStatus$1;
        int i;
        if (continuationImpl instanceof PublicApiInteractor$getCashbackStatus$1) {
            publicApiInteractor$getCashbackStatus$1 = (PublicApiInteractor$getCashbackStatus$1) continuationImpl;
            int i2 = publicApiInteractor$getCashbackStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                publicApiInteractor$getCashbackStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = publicApiInteractor$getCashbackStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = publicApiInteractor$getCashbackStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    publicApiInteractor$getCashbackStatus$1.label = 1;
                    Object a = this.p.a(yBProduct, publicApiInteractor$getCashbackStatus$1);
                    return a == coroutineSingletons ? coroutineSingletons : a;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        publicApiInteractor$getCashbackStatus$1 = new PublicApiInteractor$getCashbackStatus$1(this, continuationImpl);
        Object obj2 = publicApiInteractor$getCashbackStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = publicApiInteractor$getCashbackStatus$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ag51 ag51Var, Continuation continuation) {
        PublicApiInteractor$getPlusShortcutData$1 publicApiInteractor$getPlusShortcutData$1;
        int i;
        Object a;
        if (continuation instanceof PublicApiInteractor$getPlusShortcutData$1) {
            publicApiInteractor$getPlusShortcutData$1 = (PublicApiInteractor$getPlusShortcutData$1) continuation;
            int i2 = publicApiInteractor$getPlusShortcutData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                publicApiInteractor$getPlusShortcutData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = publicApiInteractor$getPlusShortcutData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = publicApiInteractor$getPlusShortcutData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    publicApiInteractor$getPlusShortcutData$1.L$0 = ag51Var;
                    publicApiInteractor$getPlusShortcutData$1.label = 1;
                    a = this.c.a("getPlusShortcutData", SdkUserAuthRequirement.IS_NORMAL, publicApiInteractor$getPlusShortcutData$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ag51Var = (ag51) publicApiInteractor$getPlusShortcutData$1.L$0;
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                publicApiInteractor$getPlusShortcutData$1.L$0 = null;
                publicApiInteractor$getPlusShortcutData$1.label = 2;
                Object a2 = this.k.a(ag51Var, a, publicApiInteractor$getPlusShortcutData$1);
                return a2 != coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        publicApiInteractor$getPlusShortcutData$1 = new PublicApiInteractor$getPlusShortcutData$1(this, continuation);
        Object obj2 = publicApiInteractor$getPlusShortcutData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = publicApiInteractor$getPlusShortcutData$1.label;
        if (i != 0) {
        }
        publicApiInteractor$getPlusShortcutData$1.L$0 = null;
        publicApiInteractor$getPlusShortcutData$1.label = 2;
        Object a22 = this.k.a(ag51Var, a, publicApiInteractor$getPlusShortcutData$1);
        if (a22 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        PublicApiInteractor$requestBalance$1 publicApiInteractor$requestBalance$1;
        int i;
        Object a;
        if (continuationImpl instanceof PublicApiInteractor$requestBalance$1) {
            publicApiInteractor$requestBalance$1 = (PublicApiInteractor$requestBalance$1) continuationImpl;
            int i2 = publicApiInteractor$requestBalance$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                publicApiInteractor$requestBalance$1.label = i2 - Integer.MIN_VALUE;
                Object obj = publicApiInteractor$requestBalance$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = publicApiInteractor$requestBalance$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    publicApiInteractor$requestBalance$1.label = 1;
                    a = this.b.a(publicApiInteractor$requestBalance$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                return a instanceof Result.Failure ? qe01.a(((BalanceEntity) a).getBalance(), this.r) : a;
            }
        }
        publicApiInteractor$requestBalance$1 = new PublicApiInteractor$requestBalance$1(this, continuationImpl);
        Object obj2 = publicApiInteractor$requestBalance$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = publicApiInteractor$requestBalance$1.label;
        if (i != 0) {
        }
        if (a instanceof Result.Failure) {
        }
    }

    public final void f(fh51 fh51Var) {
        CommonEvents$PublicEventsNotifyEvent commonEvents$PublicEventsNotifyEvent;
        em3 em3Var = this.f.o;
        if (fh51Var instanceof tg51) {
            commonEvents$PublicEventsNotifyEvent = CommonEvents$PublicEventsNotifyEvent.PAYMENT_METHODS_INFO_UPDATE;
        } else if (fh51Var instanceof qg51) {
            commonEvents$PublicEventsNotifyEvent = CommonEvents$PublicEventsNotifyEvent.CREDIT_RESULT_FAIL;
        } else if (fh51Var instanceof rg51) {
            commonEvents$PublicEventsNotifyEvent = CommonEvents$PublicEventsNotifyEvent.CREDIT_RESULT_SUCCESS;
        } else if (fh51Var instanceof ug51) {
            commonEvents$PublicEventsNotifyEvent = CommonEvents$PublicEventsNotifyEvent.PLUS_SHORTCUT_DATA_UPDATE;
        } else if (fh51Var instanceof ah51) {
            commonEvents$PublicEventsNotifyEvent = CommonEvents$PublicEventsNotifyEvent.REPLENISHMENT_SUCCESS;
        } else if (fh51Var.equals(zg51.b)) {
            commonEvents$PublicEventsNotifyEvent = CommonEvents$PublicEventsNotifyEvent.REPLENISHMENT_FAIL;
        } else if (fh51Var.equals(zg51.c)) {
            commonEvents$PublicEventsNotifyEvent = CommonEvents$PublicEventsNotifyEvent.REPLENISHMENT_PENDING;
        } else if (fh51Var instanceof dh51) {
            commonEvents$PublicEventsNotifyEvent = CommonEvents$PublicEventsNotifyEvent.SDK_RESULT;
        } else if (fh51Var.equals(vg51.b)) {
            commonEvents$PublicEventsNotifyEvent = CommonEvents$PublicEventsNotifyEvent.REBIND_PAYMENT_CANCELED;
        } else if (fh51Var instanceof wg51) {
            commonEvents$PublicEventsNotifyEvent = CommonEvents$PublicEventsNotifyEvent.REBIND_PAYMENT_FAILURE;
        } else if (fh51Var.equals(vg51.c)) {
            commonEvents$PublicEventsNotifyEvent = CommonEvents$PublicEventsNotifyEvent.REBIND_PAYMENT_SUCCESS;
        } else if (fh51Var instanceof eh51) {
            commonEvents$PublicEventsNotifyEvent = CommonEvents$PublicEventsNotifyEvent.WEBVIEW_JS_NATIVE_EVENT;
        } else if (fh51Var.equals(xg51.b)) {
            commonEvents$PublicEventsNotifyEvent = CommonEvents$PublicEventsNotifyEvent.REGISTRATION_RESULT_FAIL;
        } else {
            if (!(fh51Var instanceof yg51)) {
                w511.b();
                return;
            }
            commonEvents$PublicEventsNotifyEvent = CommonEvents$PublicEventsNotifyEvent.REGISTRATION_RESULT_SUCCESS;
        }
        Map map = fh51Var.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, commonEvents$PublicEventsNotifyEvent.getOriginalValue());
        if (map != null) {
            linkedHashMap.put("params", map);
        }
        em3Var.a.a("public_events.notify", linkedHashMap);
        this.t.g(fh51Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        if (r7 == r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        if (r8 == r2) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        PublicApiInteractor$updateBalance$1 publicApiInteractor$updateBalance$1;
        int i;
        Object a;
        Throwable a2;
        Object failure;
        Throwable a3;
        em3 em3Var = this.f.o;
        if (continuationImpl instanceof PublicApiInteractor$updateBalance$1) {
            publicApiInteractor$updateBalance$1 = (PublicApiInteractor$updateBalance$1) continuationImpl;
            int i2 = publicApiInteractor$updateBalance$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                publicApiInteractor$updateBalance$1.label = i2 - Integer.MIN_VALUE;
                Object obj = publicApiInteractor$updateBalance$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = publicApiInteractor$updateBalance$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    em3Var.a.a("balance_request.initiated", null);
                    publicApiInteractor$updateBalance$1.label = 1;
                    a = this.c.a("updateBalance", SdkUserAuthRequirement.IS_NORMAL, publicApiInteractor$updateBalance$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        failure = ((Result) obj).getValue();
                        if (!(failure instanceof Result.Failure)) {
                            em3Var.a(CommonEvents$BalanceRequestResultResult.OK, null);
                        }
                        a3 = Result.a(failure);
                        if (a3 != null) {
                            em3Var.a(CommonEvents$BalanceRequestResultResult.ERROR, a3.getMessage());
                        }
                        return failure;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    publicApiInteractor$updateBalance$1.label = 2;
                    failure = e(publicApiInteractor$updateBalance$1);
                } else {
                    failure = new Result.Failure(a2);
                }
                if (!(failure instanceof Result.Failure)) {
                }
                a3 = Result.a(failure);
                if (a3 != null) {
                }
                return failure;
            }
        }
        publicApiInteractor$updateBalance$1 = new PublicApiInteractor$updateBalance$1(this, continuationImpl);
        Object obj3 = publicApiInteractor$updateBalance$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = publicApiInteractor$updateBalance$1.label;
        if (i != 0) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
        if (!(failure instanceof Result.Failure)) {
        }
        a3 = Result.a(failure);
        if (a3 != null) {
        }
        return failure;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        PublicApiInteractor$updateCompactHorizontalWidgetData$1 publicApiInteractor$updateCompactHorizontalWidgetData$1;
        int i;
        Object b;
        em3 em3Var = this.f.W;
        if (continuationImpl instanceof PublicApiInteractor$updateCompactHorizontalWidgetData$1) {
            publicApiInteractor$updateCompactHorizontalWidgetData$1 = (PublicApiInteractor$updateCompactHorizontalWidgetData$1) continuationImpl;
            int i2 = publicApiInteractor$updateCompactHorizontalWidgetData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                publicApiInteractor$updateCompactHorizontalWidgetData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = publicApiInteractor$updateCompactHorizontalWidgetData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = publicApiInteractor$updateCompactHorizontalWidgetData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    em3Var.a.a("public_api.compact_horizontal_widget_update.initiated", null);
                    publicApiInteractor$updateCompactHorizontalWidgetData$1.label = 1;
                    b = ((com.ybsdk.common.repositiories.payment.b) this.d).b(publicApiInteractor$updateCompactHorizontalWidgetData$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (!(b instanceof Result.Failure)) {
                    em3.n(em3Var, PublicApiEvents$PublicApiCompactHorizontalWidgetUpdateResultResult.OK);
                }
                if (Result.a(b) != null) {
                    em3.n(em3Var, PublicApiEvents$PublicApiCompactHorizontalWidgetUpdateResultResult.ERROR);
                }
                return b;
            }
        }
        publicApiInteractor$updateCompactHorizontalWidgetData$1 = new PublicApiInteractor$updateCompactHorizontalWidgetData$1(this, continuationImpl);
        Object obj2 = publicApiInteractor$updateCompactHorizontalWidgetData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = publicApiInteractor$updateCompactHorizontalWidgetData$1.label;
        if (i != 0) {
        }
        if (!(b instanceof Result.Failure)) {
        }
        if (Result.a(b) != null) {
        }
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        if (r8 != r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        if (r8.c.c(r9, r0) == r2) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ContinuationImpl continuationImpl) {
        PublicApiInteractor$updatePaymentMethods$4 publicApiInteractor$updatePaymentMethods$4;
        int i;
        Object d;
        em3 em3Var = this.f.W;
        if (continuationImpl instanceof PublicApiInteractor$updatePaymentMethods$4) {
            publicApiInteractor$updatePaymentMethods$4 = (PublicApiInteractor$updatePaymentMethods$4) continuationImpl;
            int i2 = publicApiInteractor$updatePaymentMethods$4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                publicApiInteractor$updatePaymentMethods$4.label = i2 - Integer.MIN_VALUE;
                Object obj = publicApiInteractor$updatePaymentMethods$4.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = publicApiInteractor$updatePaymentMethods$4.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    em3Var.a.a("public_api.payments_methods_update2.initiated", new LinkedHashMap(1));
                    StartSessionCallSource.PublicApi publicApi = new StartSessionCallSource.PublicApi("updatePaymentMethods");
                    publicApiInteractor$updatePaymentMethods$4.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        d = ((Result) obj).getValue();
                        if (!(d instanceof Result.Failure)) {
                            zf51 zf51Var = (zf51) d;
                            em3.p(em3Var, PublicApiEvents$PublicApiPaymentsMethodsUpdate2ResultResult.OK, new Integer(((ArrayList) zf51Var.a()).size()), new Integer(((ArrayList) zf51Var.b()).size()), Boolean.valueOf(zf51Var.d() != null), Boolean.valueOf(zf51Var.c() != null), 8);
                        }
                        if (Result.a(d) != null) {
                            em3.p(em3Var, PublicApiEvents$PublicApiPaymentsMethodsUpdate2ResultResult.ERROR, null, null, null, null, 62);
                        }
                        return d;
                    }
                    kotlin.b.b(obj);
                }
                publicApiInteractor$updatePaymentMethods$4.label = 2;
                d = ((com.ybsdk.common.repositiories.payment.b) this.d).d(null, publicApiInteractor$updatePaymentMethods$4);
            }
        }
        publicApiInteractor$updatePaymentMethods$4 = new PublicApiInteractor$updatePaymentMethods$4(this, continuationImpl);
        Object obj2 = publicApiInteractor$updatePaymentMethods$4.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = publicApiInteractor$updatePaymentMethods$4.label;
        if (i != 0) {
        }
        publicApiInteractor$updatePaymentMethods$4.label = 2;
        d = ((com.ybsdk.common.repositiories.payment.b) this.d).d(null, publicApiInteractor$updatePaymentMethods$4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (r8 != r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006a, code lost:
    
        if (r8.c.c(r10, r0) == r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, ContinuationImpl continuationImpl) {
        PublicApiInteractor$updatePaymentMethods$1 publicApiInteractor$updatePaymentMethods$1;
        int i;
        Object d;
        em3 em3Var = this.f.W;
        if (continuationImpl instanceof PublicApiInteractor$updatePaymentMethods$1) {
            publicApiInteractor$updatePaymentMethods$1 = (PublicApiInteractor$updatePaymentMethods$1) continuationImpl;
            int i2 = publicApiInteractor$updatePaymentMethods$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                publicApiInteractor$updatePaymentMethods$1.label = i2 - Integer.MIN_VALUE;
                Object obj = publicApiInteractor$updatePaymentMethods$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = publicApiInteractor$updatePaymentMethods$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                    if (str != null) {
                        linkedHashMap.put("country_code", str);
                    }
                    em3Var.a.a("public_api.payments_methods_update2.initiated", linkedHashMap);
                    StartSessionCallSource.PublicApi publicApi = new StartSessionCallSource.PublicApi("updatePaymentMethods(countryCode)");
                    publicApiInteractor$updatePaymentMethods$1.L$0 = str;
                    publicApiInteractor$updatePaymentMethods$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        d = ((Result) obj).getValue();
                        if (!(d instanceof Result.Failure)) {
                            zf51 zf51Var = (zf51) d;
                            em3.p(em3Var, PublicApiEvents$PublicApiPaymentsMethodsUpdate2ResultResult.OK, new Integer(((ArrayList) zf51Var.a()).size()), new Integer(((ArrayList) zf51Var.b()).size()), Boolean.valueOf(zf51Var.d() != null), Boolean.valueOf(zf51Var.c() != null), 8);
                        }
                        if (Result.a(d) != null) {
                            em3.p(em3Var, PublicApiEvents$PublicApiPaymentsMethodsUpdate2ResultResult.ERROR, null, null, null, null, 62);
                        }
                        return d;
                    }
                    str = (String) publicApiInteractor$updatePaymentMethods$1.L$0;
                    kotlin.b.b(obj);
                }
                publicApiInteractor$updatePaymentMethods$1.L$0 = null;
                publicApiInteractor$updatePaymentMethods$1.label = 2;
                d = ((com.ybsdk.common.repositiories.payment.b) this.d).d(str, publicApiInteractor$updatePaymentMethods$1);
            }
        }
        publicApiInteractor$updatePaymentMethods$1 = new PublicApiInteractor$updatePaymentMethods$1(this, continuationImpl);
        Object obj2 = publicApiInteractor$updatePaymentMethods$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = publicApiInteractor$updatePaymentMethods$1.label;
        if (i != 0) {
        }
        publicApiInteractor$updatePaymentMethods$1.L$0 = null;
        publicApiInteractor$updatePaymentMethods$1.label = 2;
        d = ((com.ybsdk.common.repositiories.payment.b) this.d).d(str, publicApiInteractor$updatePaymentMethods$1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r7 != r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r7.c.c(r8, r1) == r2) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(ContinuationImpl continuationImpl) {
        PublicApiInteractor$updatePaymentMethodsInfo$1 publicApiInteractor$updatePaymentMethodsInfo$1;
        int i;
        Object c;
        em3 em3Var = this.f.W;
        if (continuationImpl instanceof PublicApiInteractor$updatePaymentMethodsInfo$1) {
            publicApiInteractor$updatePaymentMethodsInfo$1 = (PublicApiInteractor$updatePaymentMethodsInfo$1) continuationImpl;
            int i2 = publicApiInteractor$updatePaymentMethodsInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                publicApiInteractor$updatePaymentMethodsInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = publicApiInteractor$updatePaymentMethodsInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = publicApiInteractor$updatePaymentMethodsInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    em3Var.a.a("public_api.payments_methods_update.initiated", null);
                    StartSessionCallSource.PublicApi publicApi = new StartSessionCallSource.PublicApi("updatePaymentMethodsInfo");
                    publicApiInteractor$updatePaymentMethodsInfo$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        c = ((Result) obj).getValue();
                        if (!(c instanceof Result.Failure)) {
                            em3.q(em3Var, PublicApiEvents$PublicApiPaymentsMethodsUpdateResultResult.OK);
                        }
                        if (Result.a(c) != null) {
                            em3.q(em3Var, PublicApiEvents$PublicApiPaymentsMethodsUpdateResultResult.ERROR);
                        }
                        return c;
                    }
                    kotlin.b.b(obj);
                }
                publicApiInteractor$updatePaymentMethodsInfo$1.label = 2;
                c = ((com.ybsdk.common.repositiories.payment.b) this.d).c(publicApiInteractor$updatePaymentMethodsInfo$1);
            }
        }
        publicApiInteractor$updatePaymentMethodsInfo$1 = new PublicApiInteractor$updatePaymentMethodsInfo$1(this, continuationImpl);
        Object obj2 = publicApiInteractor$updatePaymentMethodsInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = publicApiInteractor$updatePaymentMethodsInfo$1.label;
        if (i != 0) {
        }
        publicApiInteractor$updatePaymentMethodsInfo$1.label = 2;
        c = ((com.ybsdk.common.repositiories.payment.b) this.d).c(publicApiInteractor$updatePaymentMethodsInfo$1);
    }
}
