package com.yandex.go.overdraft.domain;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.overdraft.data.DebtsApi;
import com.yandex.go.overdraft.data.DebtsApiV4;
import com.yandex.go.overdraft.data.model.DebtStatusesParam;
import com.yandex.go.overdraft.data.model.DebtStatusesResponse;
import com.yandex.go.overdraft.data.model.PayOrderParam;
import com.yandex.go.overdraft.data.model.PaymentState;
import defpackage.cmt;
import defpackage.evu0;
import defpackage.fug;
import defpackage.h3y;
import defpackage.hd;
import defpackage.hia1;
import defpackage.hit;
import defpackage.i3y;
import defpackage.id;
import defpackage.kbs;
import defpackage.m6a0;
import defpackage.ny61;
import defpackage.on2;
import defpackage.pl21;
import defpackage.pzt0;
import defpackage.qke;
import defpackage.r1e0;
import defpackage.sz80;
import defpackage.tje;
import defpackage.tpr;
import defpackage.yla0;
import defpackage.yvq;
import defpackage.zn1;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class g {
    public final ru.yandex.taxi.launch.c a;
    public final h3y b;
    public final h3y c;
    public final hd d;
    public final yvq e;
    public final hit f;
    public final sz80 g;
    public final h3y h;
    public final h3y i;
    public final Lifecycle j;
    public final i3y k;
    public volatile pzt0 l;

    public g(on2 on2Var, ru.yandex.taxi.launch.c cVar, h3y h3yVar, h3y h3yVar2, hd hdVar, yvq yvqVar, hit hitVar, sz80 sz80Var, h3y h3yVar3, h3y h3yVar4, Lifecycle lifecycle) {
        this.a = cVar;
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = hdVar;
        this.e = yvqVar;
        this.f = hitVar;
        this.g = sz80Var;
        this.h = h3yVar3;
        this.i = h3yVar4;
        this.j = lifecycle;
        this.k = kotlin.a.a(new zn1(on2Var, 14));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(1:(2:12|13)(2:42|43))(3:44|45|37))(9:46|47|21|(3:29|40|41)|31|(1:33)(1:39)|34|(2:36|19)|37))(1:48)|14|(9:16|(2:18|19)|21|(3:23|26|29)|31|(0)(0)|34|(0)|37)|40|41))|53|6|7|(0)(0)|14|(0)|40|41|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00da, code lost:
    
        if (ru.yandex.taxi.lifecycle.c.e(r11, r3, r1) == r2) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f0, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f1, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0038, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dd, code lost:
    
        defpackage.jst.e.k(r10, "Failed to check payment statuses");
        ((com.yandex.go.overdraft.domain.i) r0.get()).d();
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069 A[Catch: all -> 0x0038, CancellationException -> 0x00f0, TryCatch #2 {CancellationException -> 0x00f0, all -> 0x0038, blocks: (B:13:0x0034, B:14:0x005f, B:16:0x0069, B:21:0x0076, B:23:0x00a6, B:26:0x00ab, B:29:0x00b0, B:31:0x00b4, B:33:0x00b8, B:34:0x00bf, B:37:0x00cc, B:45:0x0049, B:47:0x0052), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8 A[Catch: all -> 0x0038, CancellationException -> 0x00f0, TryCatch #2 {CancellationException -> 0x00f0, all -> 0x0038, blocks: (B:13:0x0034, B:14:0x005f, B:16:0x0069, B:21:0x0076, B:23:0x00a6, B:26:0x00ab, B:29:0x00b0, B:31:0x00b4, B:33:0x00b8, B:34:0x00bf, B:37:0x00cc, B:45:0x0049, B:47:0x0052), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00da -> B:14:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g gVar, ContinuationImpl continuationImpl) {
        DebtsPaymentSender$debtStatusesPollingRequest$1 debtsPaymentSender$debtStatusesPollingRequest$1;
        int i;
        Object obj;
        PaymentState g;
        long longValue;
        h3y h3yVar = gVar.b;
        if (continuationImpl instanceof DebtsPaymentSender$debtStatusesPollingRequest$1) {
            debtsPaymentSender$debtStatusesPollingRequest$1 = (DebtsPaymentSender$debtStatusesPollingRequest$1) continuationImpl;
            int i2 = debtsPaymentSender$debtStatusesPollingRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                debtsPaymentSender$debtStatusesPollingRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = debtsPaymentSender$debtStatusesPollingRequest$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = debtsPaymentSender$debtStatusesPollingRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                } else if (i == 1) {
                    kotlin.b.b(obj2);
                    obj = ((Result) obj2).getValue();
                    kotlin.b.b(obj);
                    r1e0 r1e0Var = (r1e0) obj;
                    hd hdVar = gVar.d;
                    Object obj4 = r1e0Var.a;
                    hdVar.a((DebtStatusesResponse) obj4);
                    i iVar = (i) h3yVar.get();
                    pl21 pl21Var = pl21.c;
                    iVar.e(qke.l((DebtStatusesResponse) obj4));
                    gVar.e.getClass();
                    g = ((DebtStatusesResponse) obj4).g();
                    if (g != PaymentState.SBP_AWAITING_TOKEN && g != PaymentState.SBP_AWAITING_USER_INTERACTION && g != PaymentState.PROCESSING) {
                        gVar.g();
                        return zy11.a;
                    }
                    Long l = r1e0Var.b;
                    longValue = l == null ? l.longValue() : 5000L;
                    debtsPaymentSender$debtStatusesPollingRequest$1.L$0 = null;
                    debtsPaymentSender$debtStatusesPollingRequest$1.L$1 = null;
                    debtsPaymentSender$debtStatusesPollingRequest$1.label = 2;
                    if (kotlinx.coroutines.a.i(longValue, debtsPaymentSender$debtStatusesPollingRequest$1) == obj3) {
                        return obj3;
                    }
                    Lifecycle lifecycle = gVar.j;
                    Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
                    debtsPaymentSender$debtStatusesPollingRequest$1.L$0 = null;
                    debtsPaymentSender$debtStatusesPollingRequest$1.L$1 = null;
                    debtsPaymentSender$debtStatusesPollingRequest$1.label = 3;
                } else if (i == 2) {
                    kotlin.b.b(obj2);
                    Lifecycle lifecycle2 = gVar.j;
                    Lifecycle.Event event2 = Lifecycle.Event.ON_RESUME;
                    debtsPaymentSender$debtStatusesPollingRequest$1.L$0 = null;
                    debtsPaymentSender$debtStatusesPollingRequest$1.L$1 = null;
                    debtsPaymentSender$debtStatusesPollingRequest$1.label = 3;
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                if (kotlinx.coroutines.a.p(debtsPaymentSender$debtStatusesPollingRequest$1.get_context())) {
                    debtsPaymentSender$debtStatusesPollingRequest$1.L$0 = null;
                    debtsPaymentSender$debtStatusesPollingRequest$1.L$1 = null;
                    debtsPaymentSender$debtStatusesPollingRequest$1.label = 1;
                    obj = gVar.d(debtsPaymentSender$debtStatusesPollingRequest$1);
                    if (obj == obj3) {
                        return obj3;
                    }
                    kotlin.b.b(obj);
                    r1e0 r1e0Var2 = (r1e0) obj;
                    hd hdVar2 = gVar.d;
                    Object obj42 = r1e0Var2.a;
                    hdVar2.a((DebtStatusesResponse) obj42);
                    i iVar2 = (i) h3yVar.get();
                    pl21 pl21Var2 = pl21.c;
                    iVar2.e(qke.l((DebtStatusesResponse) obj42));
                    gVar.e.getClass();
                    g = ((DebtStatusesResponse) obj42).g();
                    if (g != PaymentState.SBP_AWAITING_TOKEN) {
                        gVar.g();
                    }
                    Long l2 = r1e0Var2.b;
                    if (l2 == null) {
                    }
                    debtsPaymentSender$debtStatusesPollingRequest$1.L$0 = null;
                    debtsPaymentSender$debtStatusesPollingRequest$1.L$1 = null;
                    debtsPaymentSender$debtStatusesPollingRequest$1.label = 2;
                    if (kotlinx.coroutines.a.i(longValue, debtsPaymentSender$debtStatusesPollingRequest$1) == obj3) {
                    }
                    Lifecycle lifecycle22 = gVar.j;
                    Lifecycle.Event event22 = Lifecycle.Event.ON_RESUME;
                    debtsPaymentSender$debtStatusesPollingRequest$1.L$0 = null;
                    debtsPaymentSender$debtStatusesPollingRequest$1.L$1 = null;
                    debtsPaymentSender$debtStatusesPollingRequest$1.label = 3;
                }
                return zy11.a;
            }
        }
        debtsPaymentSender$debtStatusesPollingRequest$1 = new DebtsPaymentSender$debtStatusesPollingRequest$1(gVar, continuationImpl);
        Object obj22 = debtsPaymentSender$debtStatusesPollingRequest$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = debtsPaymentSender$debtStatusesPollingRequest$1.label;
        if (i != 0) {
        }
        if (kotlinx.coroutines.a.p(debtsPaymentSender$debtStatusesPollingRequest$1.get_context())) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, PaymentMethod$Type paymentMethod$Type, String str2, ContinuationImpl continuationImpl) {
        DebtsPaymentSender$createPayOrderParam$1 debtsPaymentSender$createPayOrderParam$1;
        int i;
        if (continuationImpl instanceof DebtsPaymentSender$createPayOrderParam$1) {
            debtsPaymentSender$createPayOrderParam$1 = (DebtsPaymentSender$createPayOrderParam$1) continuationImpl;
            int i2 = debtsPaymentSender$createPayOrderParam$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                debtsPaymentSender$createPayOrderParam$1.label = i2 - Integer.MIN_VALUE;
                Object obj = debtsPaymentSender$createPayOrderParam$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = debtsPaymentSender$createPayOrderParam$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    debtsPaymentSender$createPayOrderParam$1.L$0 = str;
                    debtsPaymentSender$createPayOrderParam$1.L$1 = paymentMethod$Type;
                    debtsPaymentSender$createPayOrderParam$1.L$2 = str2;
                    debtsPaymentSender$createPayOrderParam$1.label = 1;
                    obj = this.a.c(debtsPaymentSender$createPayOrderParam$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) debtsPaymentSender$createPayOrderParam$1.L$2;
                    paymentMethod$Type = (PaymentMethod$Type) debtsPaymentSender$createPayOrderParam$1.L$1;
                    str = (String) debtsPaymentSender$createPayOrderParam$1.L$0;
                    kotlin.b.b(obj);
                }
                return new PayOrderParam((String) obj, str2, str, paymentMethod$Type);
            }
        }
        debtsPaymentSender$createPayOrderParam$1 = new DebtsPaymentSender$createPayOrderParam$1(this, continuationImpl);
        Object obj2 = debtsPaymentSender$createPayOrderParam$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = debtsPaymentSender$createPayOrderParam$1.label;
        if (i != 0) {
        }
        return new PayOrderParam((String) obj2, str2, str, paymentMethod$Type);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        DebtsPaymentSender$fetchDebtStatuses$1 debtsPaymentSender$fetchDebtStatuses$1;
        int i;
        Object d;
        boolean z;
        if (continuationImpl instanceof DebtsPaymentSender$fetchDebtStatuses$1) {
            debtsPaymentSender$fetchDebtStatuses$1 = (DebtsPaymentSender$fetchDebtStatuses$1) continuationImpl;
            int i2 = debtsPaymentSender$fetchDebtStatuses$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                debtsPaymentSender$fetchDebtStatuses$1.label = i2 - Integer.MIN_VALUE;
                Object obj = debtsPaymentSender$fetchDebtStatuses$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = debtsPaymentSender$fetchDebtStatuses$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    debtsPaymentSender$fetchDebtStatuses$1.label = 1;
                    d = d(debtsPaymentSender$fetchDebtStatuses$1);
                    if (d == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                }
                z = d instanceof Result.Failure;
                if (!z) {
                    this.d.a((DebtStatusesResponse) ((r1e0) d).a);
                }
                if (!z) {
                    pl21 pl21Var = pl21.c;
                    d = qke.l((DebtStatusesResponse) ((r1e0) d).a);
                }
                if (!(d instanceof Result.Failure)) {
                    ((i) this.b.get()).e((pl21) d);
                }
                return d;
            }
        }
        debtsPaymentSender$fetchDebtStatuses$1 = new DebtsPaymentSender$fetchDebtStatuses$1(this, continuationImpl);
        Object obj3 = debtsPaymentSender$fetchDebtStatuses$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = debtsPaymentSender$fetchDebtStatuses$1.label;
        if (i != 0) {
        }
        z = d instanceof Result.Failure;
        if (!z) {
        }
        if (!z) {
        }
        if (!(d instanceof Result.Failure)) {
        }
        return d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (r7 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        DebtsPaymentSender$fetchDebtStatusesInternal$1 debtsPaymentSender$fetchDebtStatusesInternal$1;
        int i;
        try {
            if (continuationImpl instanceof DebtsPaymentSender$fetchDebtStatusesInternal$1) {
                debtsPaymentSender$fetchDebtStatusesInternal$1 = (DebtsPaymentSender$fetchDebtStatusesInternal$1) continuationImpl;
                int i2 = debtsPaymentSender$fetchDebtStatusesInternal$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    debtsPaymentSender$fetchDebtStatusesInternal$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = debtsPaymentSender$fetchDebtStatusesInternal$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = debtsPaymentSender$fetchDebtStatusesInternal$1.label;
                    h3y h3yVar = this.c;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        fug fugVar = (fug) h3yVar.get();
                        debtsPaymentSender$fetchDebtStatusesInternal$1.label = 1;
                        obj = kotlinx.coroutines.flow.e.P((tpr) fugVar.c.getValue(), debtsPaymentSender$fetchDebtStatusesInternal$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return (r1e0) obj;
                        }
                        kotlin.b.b(obj);
                    }
                    DebtStatusesParam debtStatusesParam = (DebtStatusesParam) obj;
                    fug fugVar2 = (fug) h3yVar.get();
                    debtsPaymentSender$fetchDebtStatusesInternal$1.L$0 = null;
                    debtsPaymentSender$fetchDebtStatusesInternal$1.label = 2;
                    obj = ru.yandex.taxi.network.api.a.c(((DebtsApiV4) fugVar2.b.getValue()).a(debtStatusesParam), null, debtsPaymentSender$fetchDebtStatusesInternal$1);
                }
            }
            if (i != 0) {
            }
            DebtStatusesParam debtStatusesParam2 = (DebtStatusesParam) obj;
            fug fugVar22 = (fug) h3yVar.get();
            debtsPaymentSender$fetchDebtStatusesInternal$1.L$0 = null;
            debtsPaymentSender$fetchDebtStatusesInternal$1.label = 2;
            obj = ru.yandex.taxi.network.api.a.c(((DebtsApiV4) fugVar22.b.getValue()).a(debtStatusesParam2), null, debtsPaymentSender$fetchDebtStatusesInternal$1);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        debtsPaymentSender$fetchDebtStatusesInternal$1 = new DebtsPaymentSender$fetchDebtStatusesInternal$1(this, continuationImpl);
        Object obj2 = debtsPaymentSender$fetchDebtStatusesInternal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = debtsPaymentSender$fetchDebtStatusesInternal$1.label;
        h3y h3yVar2 = this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a0, code lost:
    
        if (ru.yandex.taxi.network.api.a.a(r10, null, r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(m6a0 m6a0Var, String str, ContinuationImpl continuationImpl) {
        DebtsPaymentSender$payDebt$1 debtsPaymentSender$payDebt$1;
        int i;
        PaymentMethod$Type paymentMethod$Type;
        if (continuationImpl instanceof DebtsPaymentSender$payDebt$1) {
            debtsPaymentSender$payDebt$1 = (DebtsPaymentSender$payDebt$1) continuationImpl;
            int i2 = debtsPaymentSender$payDebt$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                debtsPaymentSender$payDebt$1.label = i2 - Integer.MIN_VALUE;
                Object obj = debtsPaymentSender$payDebt$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = debtsPaymentSender$payDebt$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (evu0.J(str)) {
                        ny61.g("Missing order id required for debt payment");
                        return null;
                    }
                    PaymentMethod$Type paymentMethod$Type2 = m6a0Var.a;
                    String str2 = m6a0Var.b;
                    if (str2 == null || evu0.J(str2)) {
                        kbs.f(paymentMethod$Type2, "Missing payment id required for debt payment, payment_method=");
                        return null;
                    }
                    debtsPaymentSender$payDebt$1.L$0 = null;
                    debtsPaymentSender$payDebt$1.L$1 = str;
                    debtsPaymentSender$payDebt$1.L$2 = paymentMethod$Type2;
                    debtsPaymentSender$payDebt$1.L$3 = null;
                    debtsPaymentSender$payDebt$1.label = 1;
                    Object b = b(str2, paymentMethod$Type2, str, debtsPaymentSender$payDebt$1);
                    if (b != obj2) {
                        obj = b;
                        paymentMethod$Type = paymentMethod$Type2;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    paymentMethod$Type = (PaymentMethod$Type) debtsPaymentSender$payDebt$1.L$2;
                    str = (String) debtsPaymentSender$payDebt$1.L$1;
                    kotlin.b.b(obj);
                    hd hdVar = this.d;
                    hdVar.getClass();
                    if (hia1.c(paymentMethod$Type)) {
                        id idVar = hdVar.a;
                        idVar.b = str;
                        idVar.a.r("ACTIVE_ORDER_ID", str);
                    }
                    return zy11.a;
                }
                paymentMethod$Type = (PaymentMethod$Type) debtsPaymentSender$payDebt$1.L$2;
                str = (String) debtsPaymentSender$payDebt$1.L$1;
                kotlin.b.b(obj);
                cmt<zy11> a = ((DebtsApi) this.k.getValue()).a((PayOrderParam) obj);
                debtsPaymentSender$payDebt$1.L$0 = null;
                debtsPaymentSender$payDebt$1.L$1 = str;
                debtsPaymentSender$payDebt$1.L$2 = paymentMethod$Type;
                debtsPaymentSender$payDebt$1.L$3 = null;
                debtsPaymentSender$payDebt$1.L$4 = null;
                debtsPaymentSender$payDebt$1.label = 2;
            }
        }
        debtsPaymentSender$payDebt$1 = new DebtsPaymentSender$payDebt$1(this, continuationImpl);
        Object obj3 = debtsPaymentSender$payDebt$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = debtsPaymentSender$payDebt$1.label;
        if (i != 0) {
        }
        cmt<zy11> a2 = ((DebtsApi) this.k.getValue()).a((PayOrderParam) obj3);
        debtsPaymentSender$payDebt$1.L$0 = null;
        debtsPaymentSender$payDebt$1.L$1 = str;
        debtsPaymentSender$payDebt$1.L$2 = paymentMethod$Type;
        debtsPaymentSender$payDebt$1.L$3 = null;
        debtsPaymentSender$payDebt$1.L$4 = null;
        debtsPaymentSender$payDebt$1.label = 2;
    }

    public final void f() {
        pzt0 pzt0Var = this.l;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            this.l = tje.N(this.f.a, null, null, new DebtsPaymentSender$pollDebtStatuses$1(this, null), 3);
        }
    }

    public final void g() {
        m6a0 a = this.g.a();
        if ((a != null ? a.a : null) == PaymentMethod$Type.YB_WALLET && ((Boolean) ((yla0) this.h.get()).a.getValue()).booleanValue() && ((i) this.b.get()).a().b.i.compareTo(PaymentState.PROCESSING) >= 0) {
            ((com.yandex.go.yb.domain.o) this.i.get()).b();
        }
    }
}
