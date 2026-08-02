package com.ybsdk.feature.change.payment.method.internal.ui;

import android.net.Uri;
import com.ybsdk.feature.change.payment.method.api.ChangePaymentMethodParameter;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import defpackage.b3z;
import defpackage.bd9;
import defpackage.cd9;
import defpackage.dd9;
import defpackage.ds31;
import defpackage.jc9;
import defpackage.ju8;
import defpackage.ld9;
import defpackage.mv3;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.r8j0;
import defpackage.r90;
import defpackage.s8j0;
import defpackage.sc9;
import defpackage.t8j0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.uc5;
import defpackage.uc9;
import defpackage.xc9;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class c extends uc5 {
    public final ChangePaymentMethodParameter B;
    public final com.ybsdk.feature.change.payment.method.internal.repositories.a C;
    public final com.ybsdk.feature.change.payment.method.internal.domain.a D;
    public final xc9 E;
    public final tfl0 F;
    public pzt0 G;

    public c(ChangePaymentMethodParameter changePaymentMethodParameter, com.ybsdk.feature.change.payment.method.internal.repositories.a aVar, com.ybsdk.feature.change.payment.method.internal.domain.a aVar2, xc9 xc9Var, tfl0 tfl0Var, r90 r90Var, ld9 ld9Var) {
        super(new jc9(5), ld9Var);
        this.B = changePaymentMethodParameter;
        this.C = aVar;
        this.D = aVar2;
        this.E = xc9Var;
        this.F = tfl0Var;
        com.ybsdk.core.utils.ext.c.a(r90Var.d, ds31.a(this), new cd9(this));
        a aVar3 = new a(this);
        b3z b3zVar = ((uc9) xc9Var).a;
        DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType = DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN;
        b3zVar.a(new mv3(deeplinkHandleResult$DeeplinkType, aVar3, 12));
        b3zVar.a(new mv3(deeplinkHandleResult$DeeplinkType, new ju8(14, this), 10));
        b3zVar.a(new mv3(deeplinkHandleResult$DeeplinkType, new b(this), 11));
        tje.N(ds31.a(this), null, null, new ChangePaymentMethodViewModel$6(this, null), 3);
    }

    public static void g0(c cVar) {
        cVar.getClass();
        tje.N(ds31.a(cVar), null, null, new ChangePaymentMethodViewModel$reloadData$1(cVar, null, null, null), 3);
    }

    public final boolean b0(Uri uri) {
        return ((uc9) this.E).a.c(uri.toString()).b;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c0(String str, String str2, ContinuationImpl continuationImpl) {
        ChangePaymentMethodViewModel$loadData$1 changePaymentMethodViewModel$loadData$1;
        int i;
        r0 r0Var;
        Object value;
        Object c;
        Throwable a;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        if (continuationImpl instanceof ChangePaymentMethodViewModel$loadData$1) {
            changePaymentMethodViewModel$loadData$1 = (ChangePaymentMethodViewModel$loadData$1) continuationImpl;
            int i2 = changePaymentMethodViewModel$loadData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changePaymentMethodViewModel$loadData$1.label = i2 - Integer.MIN_VALUE;
                ChangePaymentMethodViewModel$loadData$1 changePaymentMethodViewModel$loadData$12 = changePaymentMethodViewModel$loadData$1;
                Object obj = changePaymentMethodViewModel$loadData$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changePaymentMethodViewModel$loadData$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pz40 Y = Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, bd9.a((bd9) value, new t8j0(), null, null, 14)));
                    boolean z = ((bd9) X()).b;
                    changePaymentMethodViewModel$loadData$12.label = 1;
                    c = this.C.c(this.B, z, str, str2, changePaymentMethodViewModel$loadData$12);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a != null) {
                    sc9 sc9Var = (sc9) c;
                    pz40 Y2 = Y();
                    do {
                        r0Var3 = (r0) Y2;
                        value3 = r0Var3.getValue();
                    } while (!r0Var3.k(value3, bd9.a((bd9) value3, new r8j0(sc9Var, null, 14), null, null, 12)));
                } else {
                    pz40 Y3 = Y();
                    do {
                        r0Var2 = (r0) Y3;
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, bd9.a((bd9) value2, new s8j0(a), null, null, 14)));
                }
                return zy11.a;
            }
        }
        changePaymentMethodViewModel$loadData$1 = new ChangePaymentMethodViewModel$loadData$1(this, continuationImpl);
        ChangePaymentMethodViewModel$loadData$1 changePaymentMethodViewModel$loadData$122 = changePaymentMethodViewModel$loadData$1;
        Object obj2 = changePaymentMethodViewModel$loadData$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changePaymentMethodViewModel$loadData$122.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a != null) {
        }
        return zy11.a;
    }

    public final void d0() {
        r0 r0Var;
        Object value;
        pzt0 pzt0Var = this.G;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.G = null;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, bd9.a((bd9) value, null, null, null, 11)));
        Z(new dd9(ChangePaymentMethodDivVariable.SET_DEFAULT_PAYMENT_METHOD_STATUS.getVariableName(), "CANCEL"));
    }

    public final void e0() {
        Z(new dd9(ChangePaymentMethodDivVariable.SET_DEFAULT_PAYMENT_METHOD_STATUS.getVariableName(), "FAILED"));
    }

    public final void f0() {
        pzt0 pzt0Var = this.G;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.G = null;
        h0();
        this.F.e();
    }

    public final void h0() {
        Z(new dd9(ChangePaymentMethodDivVariable.SHOULD_EXECUTE_CLOSE_ACTIONS.getVariableName(), "true"));
    }
}
