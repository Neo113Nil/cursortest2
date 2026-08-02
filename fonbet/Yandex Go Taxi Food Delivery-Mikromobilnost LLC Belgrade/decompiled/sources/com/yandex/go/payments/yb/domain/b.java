package com.yandex.go.payments.yb.domain;

import defpackage.ab60;
import defpackage.hit;
import defpackage.io60;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.pne;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.u5o;
import defpackage.ua41;
import defpackage.w511;
import defpackage.yvf0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.AuthType;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes8.dex */
public final class b {
    public final yvf0 a;
    public final o b;
    public final hit c;
    public pzt0 d;

    public b(yvf0 yvf0Var, o oVar, hit hitVar) {
        this.a = yvf0Var;
        this.b = oVar;
        this.c = hitVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, String str, ContinuationImpl continuationImpl) {
        PaymentMethodsWebInfoRouter$createWebViewConfig$1 paymentMethodsWebInfoRouter$createWebViewConfig$1;
        int i;
        bVar.getClass();
        if (continuationImpl instanceof PaymentMethodsWebInfoRouter$createWebViewConfig$1) {
            paymentMethodsWebInfoRouter$createWebViewConfig$1 = (PaymentMethodsWebInfoRouter$createWebViewConfig$1) continuationImpl;
            int i2 = paymentMethodsWebInfoRouter$createWebViewConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsWebInfoRouter$createWebViewConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsWebInfoRouter$createWebViewConfig$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsWebInfoRouter$createWebViewConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    paymentMethodsWebInfoRouter$createWebViewConfig$1.L$0 = null;
                    paymentMethodsWebInfoRouter$createWebViewConfig$1.label = 1;
                    obj = bVar.c(str, paymentMethodsWebInfoRouter$createWebViewConfig$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new UiWebViewConfig(new CoreWebViewConfig((String) obj, null, null, false, false, false, false, false, false, false, false, false, false, null, null, null, false, 131070, null), null, true, false, false, false, null, true, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194170, null);
            }
        }
        paymentMethodsWebInfoRouter$createWebViewConfig$1 = new PaymentMethodsWebInfoRouter$createWebViewConfig$1(bVar, continuationImpl);
        Object obj3 = paymentMethodsWebInfoRouter$createWebViewConfig$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsWebInfoRouter$createWebViewConfig$1.label;
        if (i != 0) {
        }
        return new UiWebViewConfig(new CoreWebViewConfig((String) obj3, null, null, false, false, false, false, false, false, false, false, false, false, null, null, null, false, 131070, null), null, true, false, false, false, null, true, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194170, null);
    }

    public final void b(String str) {
        pzt0 pzt0Var = this.d;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        if (str.length() == 0) {
            return;
        }
        this.d = tje.N(this.c.a, null, null, new PaymentMethodsWebInfoRouter$showPaymentGroupWebInfoView$1(this, str, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        PaymentMethodsWebInfoRouter$wrapUrlWithCookies$1 paymentMethodsWebInfoRouter$wrapUrlWithCookies$1;
        int i;
        ua41 ua41Var;
        if (continuationImpl instanceof PaymentMethodsWebInfoRouter$wrapUrlWithCookies$1) {
            paymentMethodsWebInfoRouter$wrapUrlWithCookies$1 = (PaymentMethodsWebInfoRouter$wrapUrlWithCookies$1) continuationImpl;
            int i2 = paymentMethodsWebInfoRouter$wrapUrlWithCookies$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsWebInfoRouter$wrapUrlWithCookies$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsWebInfoRouter$wrapUrlWithCookies$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsWebInfoRouter$wrapUrlWithCookies$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AuthType authType = AuthType.COOKIES;
                    paymentMethodsWebInfoRouter$wrapUrlWithCookies$1.L$0 = str;
                    paymentMethodsWebInfoRouter$wrapUrlWithCookies$1.label = 1;
                    obj = this.b.b(str, authType, paymentMethodsWebInfoRouter$wrapUrlWithCookies$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) paymentMethodsWebInfoRouter$wrapUrlWithCookies$1.L$0;
                    kotlin.b.b(obj);
                }
                ua41Var = (ua41) obj;
                if (!(ua41Var instanceof pne)) {
                    return ((pne) ua41Var).a();
                }
                if ((ua41Var instanceof io60) || (ua41Var instanceof u5o) || jl40.l(ua41Var, ab60.a)) {
                    return str;
                }
                w511.b();
                return null;
            }
        }
        paymentMethodsWebInfoRouter$wrapUrlWithCookies$1 = new PaymentMethodsWebInfoRouter$wrapUrlWithCookies$1(this, continuationImpl);
        Object obj2 = paymentMethodsWebInfoRouter$wrapUrlWithCookies$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsWebInfoRouter$wrapUrlWithCookies$1.label;
        if (i != 0) {
        }
        ua41Var = (ua41) obj2;
        if (!(ua41Var instanceof pne)) {
        }
    }
}
