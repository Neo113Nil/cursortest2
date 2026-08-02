package com.yandex.go.payments.cards.data;

import com.yandex.go.payments.cards.data.model.Verification;
import com.yandex.go.payments.cards.domain.exception.OnCardAddingErrorException;
import com.yandex.go.payments.domain.i0;
import defpackage.a3e;
import defpackage.a441;
import defpackage.cda0;
import defpackage.dt20;
import defpackage.evu0;
import defpackage.h3y;
import defpackage.jv5;
import defpackage.lw90;
import defpackage.n20;
import defpackage.n65;
import defpackage.ny61;
import defpackage.p731;
import defpackage.ru5;
import defpackage.tu5;
import defpackage.xw91;
import defpackage.yci0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.payments.cards.dto.VerificationStatus;

/* loaded from: classes13.dex */
public abstract class b {
    public final dt20 a;

    public b(dt20 dt20Var) {
        this.a = dt20Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ru5 ru5Var, p731 p731Var, Verification verification, ContinuationImpl continuationImpl) {
        ConfirmCardBaseInteractor$processBindResult$2 confirmCardBaseInteractor$processBindResult$2;
        int i;
        tu5 tu5Var;
        if (continuationImpl instanceof ConfirmCardBaseInteractor$processBindResult$2) {
            confirmCardBaseInteractor$processBindResult$2 = (ConfirmCardBaseInteractor$processBindResult$2) continuationImpl;
            int i2 = confirmCardBaseInteractor$processBindResult$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                confirmCardBaseInteractor$processBindResult$2.label = i2 - Integer.MIN_VALUE;
                Object obj = confirmCardBaseInteractor$processBindResult$2.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = confirmCardBaseInteractor$processBindResult$2.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    VerificationStatus verificationStatus = verification.c;
                    if (verificationStatus == null) {
                        ny61.r("Missing binding card status");
                        return null;
                    }
                    int i3 = a3e.a[verificationStatus.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3 || i3 == 4 || i3 == 5) {
                                return new tu5(ru5Var, p731Var);
                            }
                            yci0.k(verificationStatus, "Unknown binding card status ");
                            return null;
                        }
                        String str = verification.b;
                        if (str != null && !evu0.J(str)) {
                            throw new OnCardAddingErrorException(str);
                        }
                        ny61.r("Failed to bind a card");
                        return null;
                    }
                    confirmCardBaseInteractor$processBindResult$2.L$0 = null;
                    confirmCardBaseInteractor$processBindResult$2.L$1 = null;
                    confirmCardBaseInteractor$processBindResult$2.L$2 = null;
                    confirmCardBaseInteractor$processBindResult$2.L$3 = null;
                    confirmCardBaseInteractor$processBindResult$2.label = 1;
                    obj = b(ru5Var, p731Var, confirmCardBaseInteractor$processBindResult$2);
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
                tu5Var = (tu5) obj;
                if (tu5Var == null) {
                    return tu5Var;
                }
                ny61.r("Missing binding card status");
                return null;
            }
        }
        confirmCardBaseInteractor$processBindResult$2 = new ConfirmCardBaseInteractor$processBindResult$2(this, continuationImpl);
        Object obj3 = confirmCardBaseInteractor$processBindResult$2.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = confirmCardBaseInteractor$processBindResult$2.label;
        if (i != 0) {
        }
        tu5Var = (tu5) obj3;
        if (tu5Var == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ru5 ru5Var, p731 p731Var, ContinuationImpl continuationImpl) {
        ConfirmCardBaseInteractor$processOnBind$1 confirmCardBaseInteractor$processOnBind$1;
        int i;
        dt20 dt20Var;
        try {
            if (continuationImpl instanceof ConfirmCardBaseInteractor$processOnBind$1) {
                confirmCardBaseInteractor$processOnBind$1 = (ConfirmCardBaseInteractor$processOnBind$1) continuationImpl;
                int i2 = confirmCardBaseInteractor$processOnBind$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    confirmCardBaseInteractor$processOnBind$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = confirmCardBaseInteractor$processOnBind$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = confirmCardBaseInteractor$processOnBind$1.label;
                    dt20Var = this.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        confirmCardBaseInteractor$processOnBind$1.L$0 = null;
                        confirmCardBaseInteractor$processOnBind$1.L$1 = null;
                        confirmCardBaseInteractor$processOnBind$1.label = 1;
                        obj = ((com.yandex.go.payments.domain.j) ((h3y) dt20Var.w).get()).b(ru5Var, p731Var, confirmCardBaseInteractor$processOnBind$1);
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
                    return (tu5) obj;
                }
            }
            if (i != 0) {
            }
            return (tu5) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            ((com.yandex.go.payments.paymentlist.data.c) ((cda0) dt20Var.x)).p();
            return null;
        }
        confirmCardBaseInteractor$processOnBind$1 = new ConfirmCardBaseInteractor$processOnBind$1(this, continuationImpl);
        Object obj2 = confirmCardBaseInteractor$processOnBind$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = confirmCardBaseInteractor$processOnBind$1.label;
        dt20Var = this.a;
    }

    public final boolean c(jv5 jv5Var) {
        if (jv5Var != null) {
            dt20 dt20Var = this.a;
            if (((com.yandex.go.taxi.order.provider.a) ((n20) dt20Var.b)).u() != null) {
                return true;
            }
            a441 a441Var = (a441) dt20Var.c;
            if (lw90.c((lw90) ((h3y) a441Var.c).get(), ((i0) a441Var.b).a(), new n65[0], 2).a(PaymentMethod$Type.CARD).equals(xw91.C)) {
                return true;
            }
        }
        return false;
    }
}
