package com.yandex.go.payments.domain;

import com.yandex.go.payments.cards.domain.exception.SelectCardException;
import defpackage.ae9;
import defpackage.cda0;
import defpackage.evu0;
import defpackage.fga0;
import defpackage.h3y;
import defpackage.jtq0;
import defpackage.ny61;
import defpackage.p731;
import defpackage.rb8;
import defpackage.ru5;
import defpackage.tu5;
import defpackage.yc9;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class j {
    public final ru.yandex.taxi.startup.launch.h a;
    public final jtq0 b;
    public final fga0 c;
    public final h3y d;
    public final cda0 e;

    public j(ru.yandex.taxi.startup.launch.h hVar, jtq0 jtq0Var, fga0 fga0Var, h3y h3yVar, cda0 cda0Var) {
        this.a = hVar;
        this.b = jtq0Var;
        this.c = fga0Var;
        this.d = h3yVar;
        this.e = cda0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ru5 ru5Var, p731 p731Var, ContinuationImpl continuationImpl) {
        BindCardInteractor$getBindCardPaymentMethods$1 bindCardInteractor$getBindCardPaymentMethods$1;
        int i;
        if (continuationImpl instanceof BindCardInteractor$getBindCardPaymentMethods$1) {
            bindCardInteractor$getBindCardPaymentMethods$1 = (BindCardInteractor$getBindCardPaymentMethods$1) continuationImpl;
            int i2 = bindCardInteractor$getBindCardPaymentMethods$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bindCardInteractor$getBindCardPaymentMethods$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bindCardInteractor$getBindCardPaymentMethods$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bindCardInteractor$getBindCardPaymentMethods$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    bindCardInteractor$getBindCardPaymentMethods$1.L$0 = ru5Var;
                    bindCardInteractor$getBindCardPaymentMethods$1.L$1 = p731Var;
                    bindCardInteractor$getBindCardPaymentMethods$1.label = 1;
                    if (((com.yandex.go.payments.paymentlist.data.c) this.e).q(bindCardInteractor$getBindCardPaymentMethods$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p731Var = (p731) bindCardInteractor$getBindCardPaymentMethods$1.L$1;
                    ru5Var = (ru5) bindCardInteractor$getBindCardPaymentMethods$1.L$0;
                    kotlin.b.b(obj);
                }
                return new tu5(ru5Var, p731Var);
            }
        }
        bindCardInteractor$getBindCardPaymentMethods$1 = new BindCardInteractor$getBindCardPaymentMethods$1(this, continuationImpl);
        Object obj2 = bindCardInteractor$getBindCardPaymentMethods$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bindCardInteractor$getBindCardPaymentMethods$1.label;
        if (i != 0) {
        }
        return new tu5(ru5Var, p731Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e4, code lost:
    
        if (((com.yandex.go.taxi.order.paymentmethods.a) r3).d(r12, r4) == r5) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ru5 ru5Var, p731 p731Var, ContinuationImpl continuationImpl) {
        BindCardInteractor$requestBindCardWithSelection$1 bindCardInteractor$requestBindCardWithSelection$1;
        int i;
        ru5 ru5Var2 = ru5Var;
        p731 p731Var2 = p731Var;
        if (continuationImpl instanceof BindCardInteractor$requestBindCardWithSelection$1) {
            bindCardInteractor$requestBindCardWithSelection$1 = (BindCardInteractor$requestBindCardWithSelection$1) continuationImpl;
            int i2 = bindCardInteractor$requestBindCardWithSelection$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bindCardInteractor$requestBindCardWithSelection$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bindCardInteractor$requestBindCardWithSelection$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bindCardInteractor$requestBindCardWithSelection$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                p731 p731Var3 = (p731) bindCardInteractor$requestBindCardWithSelection$1.L$1;
                                ru5 ru5Var3 = (ru5) bindCardInteractor$requestBindCardWithSelection$1.L$0;
                                kotlin.b.b(obj);
                                p731Var2 = p731Var3;
                                ru5Var2 = ru5Var3;
                            } else {
                                if (i != 4) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            }
                        }
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                kotlin.b.b(obj);
                if (ru5Var2.a) {
                    String str = ((rb8) ru5Var2.b).b;
                    if (str == null || evu0.J(str)) {
                        bindCardInteractor$requestBindCardWithSelection$1.L$0 = null;
                        bindCardInteractor$requestBindCardWithSelection$1.L$1 = null;
                        bindCardInteractor$requestBindCardWithSelection$1.L$2 = null;
                        bindCardInteractor$requestBindCardWithSelection$1.label = 2;
                        Object a = a(ru5Var2, p731Var2, bindCardInteractor$requestBindCardWithSelection$1);
                        if (a != obj2) {
                            return a;
                        }
                    } else {
                        String Hg = this.a.Hg();
                        String t = this.c.t();
                        if (Hg == null || evu0.J(Hg)) {
                            throw new SelectCardException("Launch id is required to change payment method");
                        }
                        yc9 yc9Var = new yc9(Hg, str, this.b.b(null), PaymentMethod$Type.CARD, p731Var2.a.a, t, null, null);
                        ae9 ae9Var = (ae9) this.d.get();
                        bindCardInteractor$requestBindCardWithSelection$1.L$0 = ru5Var2;
                        bindCardInteractor$requestBindCardWithSelection$1.L$1 = p731Var2;
                        bindCardInteractor$requestBindCardWithSelection$1.L$2 = null;
                        bindCardInteractor$requestBindCardWithSelection$1.L$3 = null;
                        bindCardInteractor$requestBindCardWithSelection$1.L$4 = null;
                        bindCardInteractor$requestBindCardWithSelection$1.L$5 = null;
                        bindCardInteractor$requestBindCardWithSelection$1.label = 3;
                    }
                } else {
                    bindCardInteractor$requestBindCardWithSelection$1.L$0 = null;
                    bindCardInteractor$requestBindCardWithSelection$1.L$1 = null;
                    bindCardInteractor$requestBindCardWithSelection$1.label = 1;
                    Object a2 = a(ru5Var2, p731Var2, bindCardInteractor$requestBindCardWithSelection$1);
                    if (a2 != obj2) {
                        return a2;
                    }
                }
                bindCardInteractor$requestBindCardWithSelection$1.L$0 = null;
                bindCardInteractor$requestBindCardWithSelection$1.L$1 = null;
                bindCardInteractor$requestBindCardWithSelection$1.L$2 = null;
                bindCardInteractor$requestBindCardWithSelection$1.L$3 = null;
                bindCardInteractor$requestBindCardWithSelection$1.L$4 = null;
                bindCardInteractor$requestBindCardWithSelection$1.L$5 = null;
                bindCardInteractor$requestBindCardWithSelection$1.label = 4;
                Object a3 = a(ru5Var2, p731Var2, bindCardInteractor$requestBindCardWithSelection$1);
                return a3 != obj2 ? obj2 : a3;
            }
        }
        bindCardInteractor$requestBindCardWithSelection$1 = new BindCardInteractor$requestBindCardWithSelection$1(this, continuationImpl);
        Object obj3 = bindCardInteractor$requestBindCardWithSelection$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bindCardInteractor$requestBindCardWithSelection$1.label;
        if (i == 0) {
        }
        bindCardInteractor$requestBindCardWithSelection$1.L$0 = null;
        bindCardInteractor$requestBindCardWithSelection$1.L$1 = null;
        bindCardInteractor$requestBindCardWithSelection$1.L$2 = null;
        bindCardInteractor$requestBindCardWithSelection$1.L$3 = null;
        bindCardInteractor$requestBindCardWithSelection$1.L$4 = null;
        bindCardInteractor$requestBindCardWithSelection$1.L$5 = null;
        bindCardInteractor$requestBindCardWithSelection$1.label = 4;
        Object a32 = a(ru5Var2, p731Var2, bindCardInteractor$requestBindCardWithSelection$1);
        if (a32 != obj22) {
        }
    }
}
