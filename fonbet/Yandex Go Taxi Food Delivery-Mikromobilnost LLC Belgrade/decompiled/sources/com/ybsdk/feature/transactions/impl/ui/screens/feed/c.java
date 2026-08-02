package com.ybsdk.feature.transactions.impl.ui.screens.feed;

import android.net.Uri;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.BottomNavigationEvents$BottomNavigationClickButtonVersion;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrIconClickedSource;
import com.ybsdk.core.common.domain.entities.BottomBarItemId;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.transactions.api.entities.TransactionsFeedFilterEntity;
import com.ybsdk.feature.transactions.api.entities.TransactionsLoadType;
import com.ybsdk.feature.transactions.api.entities.TransactionsState;
import defpackage.df01;
import defpackage.ds31;
import defpackage.ff01;
import defpackage.gao;
import defpackage.i5y0;
import defpackage.kcz0;
import defpackage.lh6;
import defpackage.lj91;
import defpackage.mf01;
import defpackage.mv3;
import defpackage.ny61;
import defpackage.ph6;
import defpackage.ppl;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.sb6;
import defpackage.sf01;
import defpackage.sh6;
import defpackage.tb6;
import defpackage.tf01;
import defpackage.tje;
import defpackage.uc5;
import defpackage.v0h;
import defpackage.w4x0;
import defpackage.we01;
import defpackage.wf01;
import defpackage.x4x0;
import defpackage.z2z;
import defpackage.zw0;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class c extends uc5 {
    public final TransactionsFeedScreenParams B;
    public final com.ybsdk.feature.transactions.impl.domain.interactors.a C;
    public final df01 D;
    public final tf01 E;
    public final w4x0 F;
    public final AppAnalyticsReporter G;
    public final sb6 H;
    public pzt0 I;
    public pzt0 J;
    public boolean K;

    public c(TransactionsFeedScreenParams transactionsFeedScreenParams, com.ybsdk.feature.transactions.impl.domain.interactors.a aVar, df01 df01Var, tf01 tf01Var, w4x0 w4x0Var, AppAnalyticsReporter appAnalyticsReporter, sb6 sb6Var, kcz0 kcz0Var, sf01 sf01Var) {
        super(new i5y0(22, transactionsFeedScreenParams, sf01Var), kcz0Var);
        this.B = transactionsFeedScreenParams;
        this.C = aVar;
        this.D = df01Var;
        this.E = tf01Var;
        this.F = w4x0Var;
        this.G = appAnalyticsReporter;
        this.H = sb6Var;
        this.I = tje.N(ds31.a(this), null, null, new TransactionsFeedViewModel$2(this, null), 3);
        this.J = tje.N(ds31.a(this), null, null, new TransactionsFeedViewModel$3(this, null), 3);
        ((wf01) df01Var).a.a(new mv3(DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN, new b(this), 29));
    }

    public static Object d0(c cVar, TransactionsLoadType transactionsLoadType, SuspendLambda suspendLambda) {
        return cVar.c0(transactionsLoadType, ((ff01) cVar.X()).a, suspendLambda);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b0(boolean z, ContinuationImpl continuationImpl) {
        TransactionsFeedViewModel$loadFilters$1 transactionsFeedViewModel$loadFilters$1;
        int i;
        Object a;
        boolean z2;
        Throwable a2;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        if (continuationImpl instanceof TransactionsFeedViewModel$loadFilters$1) {
            transactionsFeedViewModel$loadFilters$1 = (TransactionsFeedViewModel$loadFilters$1) continuationImpl;
            int i2 = transactionsFeedViewModel$loadFilters$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transactionsFeedViewModel$loadFilters$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transactionsFeedViewModel$loadFilters$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transactionsFeedViewModel$loadFilters$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    TransactionsFeedFilterEntity transactionsFeedFilterEntity = ((ff01) X()).a;
                    TransactionsFeedScreenParams transactionsFeedScreenParams = this.B;
                    boolean showTabbar = transactionsFeedScreenParams.getShowTabbar();
                    boolean hideFilters = transactionsFeedScreenParams.getHideFilters();
                    transactionsFeedViewModel$loadFilters$1.Z$0 = z;
                    transactionsFeedViewModel$loadFilters$1.label = 1;
                    a = this.C.a(transactionsFeedFilterEntity, showTabbar, hideFilters, transactionsFeedViewModel$loadFilters$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z2 = z;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = transactionsFeedViewModel$loadFilters$1.Z$0;
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    we01 we01Var = (we01) a;
                    pz40 Y = Y();
                    do {
                        r0Var2 = (r0) Y;
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, ff01.a((ff01) value2, null, new r8j0(we01Var, null, 14), null, null, false, null, null, 0, 2039)));
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    if (!z2 || this.K) {
                        pz40 Y2 = Y();
                        do {
                            r0Var = (r0) Y2;
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, ff01.a((ff01) value, null, new s8j0(a2), null, null, false, null, null, 0, 2039)));
                    } else {
                        this.K = true;
                        Z(new mf01(gao.e(null, null, a2, 3)));
                    }
                }
                return zy11.a;
            }
        }
        transactionsFeedViewModel$loadFilters$1 = new TransactionsFeedViewModel$loadFilters$1(this, continuationImpl);
        Object obj2 = transactionsFeedViewModel$loadFilters$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transactionsFeedViewModel$loadFilters$1.label;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c0(TransactionsLoadType transactionsLoadType, TransactionsFeedFilterEntity transactionsFeedFilterEntity, ContinuationImpl continuationImpl) {
        TransactionsFeedViewModel$loadTransactions$1 transactionsFeedViewModel$loadTransactions$1;
        int i;
        c cVar;
        Object b;
        TransactionsLoadType transactionsLoadType2;
        int i2;
        TransactionsState transactionsState;
        int i3;
        ppl pplVar;
        Throwable a;
        r0 r0Var;
        Object value;
        if (continuationImpl instanceof TransactionsFeedViewModel$loadTransactions$1) {
            transactionsFeedViewModel$loadTransactions$1 = (TransactionsFeedViewModel$loadTransactions$1) continuationImpl;
            int i4 = transactionsFeedViewModel$loadTransactions$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                transactionsFeedViewModel$loadTransactions$1.label = i4 - Integer.MIN_VALUE;
                TransactionsFeedViewModel$loadTransactions$1 transactionsFeedViewModel$loadTransactions$12 = transactionsFeedViewModel$loadTransactions$1;
                Object obj = transactionsFeedViewModel$loadTransactions$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transactionsFeedViewModel$loadTransactions$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ppl pplVar2 = transactionsLoadType == TransactionsLoadType.INITIAL ? null : ((ff01) X()).e;
                    if (pplVar2 == null) {
                        pplVar2 = new ppl();
                    }
                    ppl pplVar3 = pplVar2;
                    TransactionsLoadType transactionsLoadType3 = TransactionsLoadType.NEXT_PAGE;
                    String str = transactionsLoadType == transactionsLoadType3 ? pplVar3.b : null;
                    boolean z = transactionsLoadType == TransactionsLoadType.REFRESH;
                    TransactionsState transactionsState2 = ((ff01) X()).f;
                    boolean z2 = z;
                    a0(new zw0(this, transactionsLoadType, transactionsFeedFilterEntity, pplVar3, z));
                    int i5 = transactionsLoadType == transactionsLoadType3 ? ((ff01) X()).j + 1 : 0;
                    TransactionsFeedScreenParams transactionsFeedScreenParams = this.B;
                    boolean showTabbar = transactionsFeedScreenParams.getShowTabbar();
                    boolean hideFilters = transactionsFeedScreenParams.getHideFilters();
                    transactionsFeedViewModel$loadTransactions$12.L$0 = transactionsLoadType;
                    transactionsFeedViewModel$loadTransactions$12.L$1 = pplVar3;
                    transactionsFeedViewModel$loadTransactions$12.L$2 = transactionsState2;
                    transactionsFeedViewModel$loadTransactions$12.I$0 = z2 ? 1 : 0;
                    transactionsFeedViewModel$loadTransactions$12.I$1 = i5;
                    transactionsFeedViewModel$loadTransactions$12.label = 1;
                    String str2 = str;
                    cVar = this;
                    b = this.C.b(transactionsFeedFilterEntity, str2, transactionsLoadType, i5, showTabbar, hideFilters, transactionsFeedViewModel$loadTransactions$12);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    transactionsLoadType2 = transactionsLoadType;
                    i2 = i5;
                    transactionsState = transactionsState2;
                    i3 = z2 ? 1 : 0;
                    pplVar = pplVar3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i6 = transactionsFeedViewModel$loadTransactions$12.I$1;
                    i3 = transactionsFeedViewModel$loadTransactions$12.I$0;
                    transactionsState = (TransactionsState) transactionsFeedViewModel$loadTransactions$12.L$2;
                    pplVar = (ppl) transactionsFeedViewModel$loadTransactions$12.L$1;
                    transactionsLoadType2 = (TransactionsLoadType) transactionsFeedViewModel$loadTransactions$12.L$0;
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                    cVar = this;
                    i2 = i6;
                }
                if (!(b instanceof Result.Failure)) {
                    ppl pplVar4 = (ppl) b;
                    pz40 Y = cVar.Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, ff01.a((ff01) value, null, null, lj91.b(transactionsLoadType2, pplVar, pplVar4), TransactionsState.IDLE, false, null, null, i2, 1423)));
                }
                a = Result.a(b);
                if (a != null) {
                    if (i3 != 0) {
                        if (!cVar.K) {
                            cVar.K = true;
                            cVar.Z(new mf01(gao.e(null, null, a, 3)));
                        }
                        pz40 Y2 = cVar.Y();
                        while (true) {
                            r0 r0Var2 = (r0) Y2;
                            Object value2 = r0Var2.getValue();
                            TransactionsState transactionsState3 = transactionsState;
                            if (r0Var2.k(value2, ff01.a((ff01) value2, null, null, null, transactionsState3, false, null, transactionsState == TransactionsState.ERROR ? a : null, 0, 1695))) {
                                break;
                            }
                            transactionsState = transactionsState3;
                        }
                    } else {
                        pz40 Y3 = cVar.Y();
                        while (true) {
                            r0 r0Var3 = (r0) Y3;
                            Object value3 = r0Var3.getValue();
                            Throwable th = a;
                            if (r0Var3.k(value3, ff01.a((ff01) value3, null, null, null, TransactionsState.ERROR, false, null, th, 0, 1695))) {
                                break;
                            }
                            a = th;
                        }
                    }
                }
                return zy11.a;
            }
        }
        transactionsFeedViewModel$loadTransactions$1 = new TransactionsFeedViewModel$loadTransactions$1(this, continuationImpl);
        TransactionsFeedViewModel$loadTransactions$1 transactionsFeedViewModel$loadTransactions$122 = transactionsFeedViewModel$loadTransactions$1;
        Object obj2 = transactionsFeedViewModel$loadTransactions$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transactionsFeedViewModel$loadTransactions$122.label;
        if (i != 0) {
        }
        if (!(b instanceof Result.Failure)) {
        }
        a = Result.a(b);
        if (a != null) {
        }
        return zy11.a;
    }

    public final void e0(tb6 tb6Var) {
        this.H.a(tb6Var.a, BottomBarItemId.HISTORY.getId(), BottomNavigationEvents$BottomNavigationClickButtonVersion.SCREEN_BUTTON);
        sh6 sh6Var = tb6Var.e;
        if (sh6Var instanceof lh6) {
            return;
        }
        boolean z = sh6Var instanceof ph6;
        w4x0 w4x0Var = this.F;
        if (!z) {
            ((x4x0) w4x0Var).b(sh6Var);
        } else {
            this.G.Y.x(QrPaymentEvents$QrIconClickedSource.HISTORY);
            ((x4x0) w4x0Var).a();
        }
    }

    public final boolean f0(Uri uri) {
        z2z c = ((wf01) this.D).a.c(uri.toString());
        return c.b || (c.a instanceof v0h);
    }

    public final void g0() {
        if (((ff01) X()).f == TransactionsState.IDLE) {
            ppl pplVar = ((ff01) X()).e;
            if ((pplVar != null ? pplVar.b : null) == null) {
                return;
            }
            this.J = tje.N(ds31.a(this), null, null, new TransactionsFeedViewModel$onLastItemShown$1(this, null), 3);
        }
    }

    public final void h0() {
        this.J = tje.N(ds31.a(this), null, null, new TransactionsFeedViewModel$onTransactionsErrorClick$1(this, null), 3);
    }
}
