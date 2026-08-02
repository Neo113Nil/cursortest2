package com.yandex.go.payments.cards.data;

import com.yandex.go.payments.cards.data.model.GuessAmount;
import com.yandex.go.payments.cards.data.model.Verification;
import com.yandex.go.payments.cards.domain.model.PaymentMethodVerificationSession;
import defpackage.ai6;
import defpackage.apf;
import defpackage.b4u;
import defpackage.bi6;
import defpackage.biw0;
import defpackage.dt20;
import defpackage.dw5;
import defpackage.evu0;
import defpackage.gz90;
import defpackage.h831;
import defpackage.j831;
import defpackage.jv5;
import defpackage.k831;
import defpackage.l180;
import defpackage.l9z;
import defpackage.ldf0;
import defpackage.m831;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.p731;
import defpackage.ql3;
import defpackage.rb8;
import defpackage.ru5;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.tu5;
import defpackage.tx90;
import defpackage.u32;
import defpackage.uyj;
import defpackage.v931;
import defpackage.w511;
import defpackage.w931;
import defpackage.xvf0;
import defpackage.y931;
import defpackage.yfa;
import defpackage.yvf0;
import defpackage.zh0;
import defpackage.zh6;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class c extends b {
    public final tt2 b;
    public final bi6 c;
    public final f d;
    public final PaymentMethodVerificationSession e;
    public final h831 f;
    public zh6 g;
    public final d h;
    public volatile j831 i;

    public c(tt2 tt2Var, yvf0 yvf0Var, yvf0 yvf0Var2, bi6 bi6Var, f fVar, b4u b4uVar, dt20 dt20Var, y931 y931Var, PaymentMethodVerificationSession paymentMethodVerificationSession) {
        super(dt20Var);
        h831 h831Var;
        this.b = tt2Var;
        this.c = bi6Var;
        this.d = fVar;
        this.e = paymentMethodVerificationSession;
        if (y931Var.equals(v931.a)) {
            h831Var = (h831) yvf0Var.get();
        } else {
            if (!(y931Var instanceof w931)) {
                w511.b();
                throw null;
            }
            h831Var = (h831) yvf0Var2.get();
        }
        this.f = h831Var;
        yfa yfaVar = new yfa(this);
        zh0 zh0Var = b4uVar.a;
        this.h = new d((tt2) zh0Var.a.get(), yfaVar, (i) zh0Var.b.get(), (ql3) zh0Var.c.get(), (com.yandex.go.payments.di.a) zh0Var.d.get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r9 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(c cVar, jv5 jv5Var, dw5 dw5Var, ContinuationImpl continuationImpl) {
        ConfirmCardV2Interactor$initiateBinding$1 confirmCardV2Interactor$initiateBinding$1;
        int i;
        boolean c;
        Object b;
        cVar.getClass();
        if (continuationImpl instanceof ConfirmCardV2Interactor$initiateBinding$1) {
            confirmCardV2Interactor$initiateBinding$1 = (ConfirmCardV2Interactor$initiateBinding$1) continuationImpl;
            int i2 = confirmCardV2Interactor$initiateBinding$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                confirmCardV2Interactor$initiateBinding$1.label = i2 - Integer.MIN_VALUE;
                Object obj = confirmCardV2Interactor$initiateBinding$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = confirmCardV2Interactor$initiateBinding$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c = cVar.c(jv5Var);
                    h831 h831Var = cVar.f;
                    confirmCardV2Interactor$initiateBinding$1.L$0 = jv5Var;
                    confirmCardV2Interactor$initiateBinding$1.L$1 = null;
                    confirmCardV2Interactor$initiateBinding$1.Z$0 = c;
                    confirmCardV2Interactor$initiateBinding$1.label = 1;
                    b = h831Var.b(jv5Var, dw5Var, confirmCardV2Interactor$initiateBinding$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    boolean z = confirmCardV2Interactor$initiateBinding$1.Z$0;
                    jv5 jv5Var2 = (jv5) confirmCardV2Interactor$initiateBinding$1.L$0;
                    kotlin.b.b(obj);
                    c = z;
                    jv5Var = jv5Var2;
                    b = obj;
                }
                confirmCardV2Interactor$initiateBinding$1.L$0 = null;
                confirmCardV2Interactor$initiateBinding$1.L$1 = null;
                confirmCardV2Interactor$initiateBinding$1.L$2 = null;
                confirmCardV2Interactor$initiateBinding$1.Z$0 = c;
                confirmCardV2Interactor$initiateBinding$1.label = 2;
                Object h = cVar.h(jv5Var, c, (p731) b, confirmCardV2Interactor$initiateBinding$1);
                return h != obj2 ? obj2 : h;
            }
        }
        confirmCardV2Interactor$initiateBinding$1 = new ConfirmCardV2Interactor$initiateBinding$1(cVar, continuationImpl);
        Object obj3 = confirmCardV2Interactor$initiateBinding$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = confirmCardV2Interactor$initiateBinding$1.label;
        if (i != 0) {
        }
        confirmCardV2Interactor$initiateBinding$1.L$0 = null;
        confirmCardV2Interactor$initiateBinding$1.L$1 = null;
        confirmCardV2Interactor$initiateBinding$1.L$2 = null;
        confirmCardV2Interactor$initiateBinding$1.Z$0 = c;
        confirmCardV2Interactor$initiateBinding$1.label = 2;
        Object h2 = cVar.h(jv5Var, c, (p731) b, confirmCardV2Interactor$initiateBinding$1);
        if (h2 != obj22) {
        }
    }

    public final Object e(jv5 jv5Var, dw5 dw5Var, j831 j831Var, Continuation continuation) {
        if (this.i == null) {
            this.i = j831Var;
        }
        j831 j831Var2 = this.i;
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new ConfirmCardV2Interactor$doNextBindingAction$2(j831Var2, dw5Var, this, jv5Var, false, null), continuation);
    }

    public final Object f(rb8 rb8Var, tx90 tx90Var, j831 j831Var, GuessAmount guessAmount, Continuation continuation) {
        if (this.i == null) {
            this.i = j831Var;
        }
        j831 j831Var2 = this.i;
        if (j831Var2 == null) {
            ny61.r("Call guess amount without verification params");
            return null;
        }
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new ConfirmCardV2Interactor$guessAmount$2(j831Var2, this, rb8Var, tx90Var, guessAmount, false, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(jv5 jv5Var, j831 j831Var, boolean z, ContinuationImpl continuationImpl) {
        ConfirmCardV2Interactor$pollCardStatus$1 confirmCardV2Interactor$pollCardStatus$1;
        int i;
        boolean c;
        Object obj;
        boolean z2;
        PaymentMethodVerificationSession.Backend backend;
        String str;
        jv5 jv5Var2 = jv5Var;
        if (continuationImpl instanceof ConfirmCardV2Interactor$pollCardStatus$1) {
            confirmCardV2Interactor$pollCardStatus$1 = (ConfirmCardV2Interactor$pollCardStatus$1) continuationImpl;
            int i2 = confirmCardV2Interactor$pollCardStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                confirmCardV2Interactor$pollCardStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = confirmCardV2Interactor$pollCardStatus$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = confirmCardV2Interactor$pollCardStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    c = c(jv5Var);
                    zh6 zh6Var = this.g;
                    if (zh6Var == null) {
                        bi6 bi6Var = this.c;
                        h831 h831Var = this.f;
                        PaymentMethodVerificationSession paymentMethodVerificationSession = this.e;
                        bi6Var.getClass();
                        ldf0 ldf0Var = new ldf0(h831Var);
                        if ((j831Var.a instanceof k831) && ((str = j831Var.b) == null || evu0.J(str))) {
                            bi6Var.a.getClass();
                            backend = PaymentMethodVerificationSession.Backend.PROFILE;
                        } else {
                            backend = PaymentMethodVerificationSession.Backend.PROFILE;
                        }
                        synchronized (paymentMethodVerificationSession) {
                            PaymentMethodVerificationSession.Backend backend2 = paymentMethodVerificationSession.b;
                            if (backend2 != null) {
                                backend = backend2;
                            } else {
                                paymentMethodVerificationSession.b = backend;
                            }
                        }
                        int i3 = ai6.a[backend.ordinal()];
                        if (i3 == 1) {
                            zh6Var = ldf0Var;
                        } else {
                            if (i3 != 2) {
                                w511.b();
                                return null;
                            }
                            apf apfVar = bi6Var.b.a;
                            zh6Var = new com.yandex.go.payments.cards.domainverification.domain.a((l9z) ((xvf0) apfVar.b).get(), (gz90) ((xvf0) apfVar.c).get(), (com.yandex.go.payments.cards.domainverification.data.f) ((l180) apfVar.w).get(), (u32) ((xvf0) apfVar.x).get(), paymentMethodVerificationSession);
                        }
                        this.g = zh6Var;
                    }
                    confirmCardV2Interactor$pollCardStatus$1.L$0 = jv5Var2;
                    confirmCardV2Interactor$pollCardStatus$1.L$1 = null;
                    confirmCardV2Interactor$pollCardStatus$1.L$2 = null;
                    confirmCardV2Interactor$pollCardStatus$1.Z$0 = z;
                    confirmCardV2Interactor$pollCardStatus$1.Z$1 = c;
                    confirmCardV2Interactor$pollCardStatus$1.label = 1;
                    Object a = zh6Var.a(jv5Var2, j831Var, z, confirmCardV2Interactor$pollCardStatus$1);
                    if (a != obj3) {
                        obj = a;
                        z2 = z;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return obj2;
                }
                boolean z3 = confirmCardV2Interactor$pollCardStatus$1.Z$1;
                z2 = confirmCardV2Interactor$pollCardStatus$1.Z$0;
                jv5 jv5Var3 = (jv5) confirmCardV2Interactor$pollCardStatus$1.L$0;
                kotlin.b.b(obj2);
                c = z3;
                jv5Var2 = jv5Var3;
                obj = obj2;
                confirmCardV2Interactor$pollCardStatus$1.L$0 = null;
                confirmCardV2Interactor$pollCardStatus$1.L$1 = null;
                confirmCardV2Interactor$pollCardStatus$1.L$2 = null;
                confirmCardV2Interactor$pollCardStatus$1.L$3 = null;
                confirmCardV2Interactor$pollCardStatus$1.Z$0 = z2;
                confirmCardV2Interactor$pollCardStatus$1.Z$1 = c;
                confirmCardV2Interactor$pollCardStatus$1.label = 2;
                Object h = h(jv5Var2, c, (p731) obj, confirmCardV2Interactor$pollCardStatus$1);
                return h != obj3 ? obj3 : h;
            }
        }
        confirmCardV2Interactor$pollCardStatus$1 = new ConfirmCardV2Interactor$pollCardStatus$1(this, continuationImpl);
        Object obj22 = confirmCardV2Interactor$pollCardStatus$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = confirmCardV2Interactor$pollCardStatus$1.label;
        if (i != 0) {
        }
        confirmCardV2Interactor$pollCardStatus$1.L$0 = null;
        confirmCardV2Interactor$pollCardStatus$1.L$1 = null;
        confirmCardV2Interactor$pollCardStatus$1.L$2 = null;
        confirmCardV2Interactor$pollCardStatus$1.L$3 = null;
        confirmCardV2Interactor$pollCardStatus$1.Z$0 = z2;
        confirmCardV2Interactor$pollCardStatus$1.Z$1 = c;
        confirmCardV2Interactor$pollCardStatus$1.label = 2;
        Object h2 = h(jv5Var2, c, (p731) obj, confirmCardV2Interactor$pollCardStatus$1);
        if (h2 != obj32) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(jv5 jv5Var, boolean z, p731 p731Var, ContinuationImpl continuationImpl) {
        ConfirmCardV2Interactor$resultFromVerificationData$1 confirmCardV2Interactor$resultFromVerificationData$1;
        int i;
        if (continuationImpl instanceof ConfirmCardV2Interactor$resultFromVerificationData$1) {
            confirmCardV2Interactor$resultFromVerificationData$1 = (ConfirmCardV2Interactor$resultFromVerificationData$1) continuationImpl;
            int i2 = confirmCardV2Interactor$resultFromVerificationData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                confirmCardV2Interactor$resultFromVerificationData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = confirmCardV2Interactor$resultFromVerificationData$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = confirmCardV2Interactor$resultFromVerificationData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (p731Var == null) {
                        ny61.r("Missing bind card response");
                        return null;
                    }
                    ru5 ru5Var = new ru5(z, jv5Var, p731Var.d);
                    confirmCardV2Interactor$resultFromVerificationData$1.L$0 = null;
                    confirmCardV2Interactor$resultFromVerificationData$1.L$1 = null;
                    confirmCardV2Interactor$resultFromVerificationData$1.L$2 = null;
                    confirmCardV2Interactor$resultFromVerificationData$1.Z$0 = z;
                    confirmCardV2Interactor$resultFromVerificationData$1.label = 1;
                    obj = a(ru5Var, p731Var, p731Var.b, confirmCardV2Interactor$resultFromVerificationData$1);
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
                tu5 tu5Var = (tu5) obj;
                p731 p731Var2 = tu5Var.b;
                m831 m831Var = p731Var2.a;
                Verification verification = p731Var2.b;
                String str = verification.a;
                String b = verification.b();
                p731 p731Var3 = tu5Var.b;
                String str2 = p731Var3.c;
                boolean z2 = tu5Var.d;
                Verification verification2 = p731Var3.b;
                this.i = new j831(m831Var, str, b, str2, z2, verification2.c, verification2.i, null, null, null, tu5Var.f, null, 8192);
                return tu5Var;
            }
        }
        confirmCardV2Interactor$resultFromVerificationData$1 = new ConfirmCardV2Interactor$resultFromVerificationData$1(this, continuationImpl);
        Object obj3 = confirmCardV2Interactor$resultFromVerificationData$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = confirmCardV2Interactor$resultFromVerificationData$1.label;
        if (i != 0) {
        }
        tu5 tu5Var2 = (tu5) obj3;
        p731 p731Var22 = tu5Var2.b;
        m831 m831Var2 = p731Var22.a;
        Verification verification3 = p731Var22.b;
        String str3 = verification3.a;
        String b2 = verification3.b();
        p731 p731Var32 = tu5Var2.b;
        String str22 = p731Var32.c;
        boolean z22 = tu5Var2.d;
        Verification verification22 = p731Var32.b;
        this.i = new j831(m831Var2, str3, b2, str22, z22, verification22.c, verification22.i, null, null, null, tu5Var2.f, null, 8192);
        return tu5Var2;
    }

    public final Object i(rb8 rb8Var, tx90 tx90Var, j831 j831Var, biw0 biw0Var, Continuation continuation) {
        if (this.i == null) {
            this.i = j831Var;
        }
        j831 j831Var2 = this.i;
        if (j831Var2 == null) {
            ny61.r("Call supply cvn without verification params");
            return null;
        }
        String str = j831Var2.d;
        if (str == null || evu0.J(str)) {
            ny61.r("Call supply cvn without purchase token");
            return null;
        }
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new ConfirmCardV2Interactor$supplyCvn$2(this, str, tx90Var, biw0Var, rb8Var, j831Var2, false, null), continuation);
    }
}
