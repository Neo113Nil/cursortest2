package com.yandex.go.places.impl.ui.payments.processing;

import com.yandex.go.places.analytics.generated.DiscoveryAnalytics$PaymentResultStatus;
import com.yandex.go.places.complaint.impl.ui.ComplaintNotification;
import com.yandex.go.places.impl.data.entities.network.payments.PaymentStatus;
import com.yandex.go.places.impl.data.entities.network.payments.PaymentStatusResponse;
import com.yandex.go.places.impl.data.entities.network.payments.PlacesProcessPaymentResponse;
import com.yandex.go.places.impl.navigation.payments.processing.PaymentsProcessingNavigator$ErrorType;
import com.yandex.go.places.models.domain.entities.PaymentProcessingState;
import defpackage.aq80;
import defpackage.dia0;
import defpackage.h75;
import defpackage.jio;
import defpackage.kk80;
import defpackage.nk80;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.u290;
import defpackage.una0;
import defpackage.vna0;
import defpackage.w511;
import defpackage.wna0;
import defpackage.xna0;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class a extends h75 {
    public final com.yandex.go.places.impl.data.repositories.payments.process.a A;
    public final jio B;
    public pzt0 C;
    public final aq80 x;
    public final una0 y;
    public final com.yandex.go.places.impl.data.repositories.payments.status.a z;

    public a(aq80 aq80Var, una0 una0Var, com.yandex.go.places.impl.data.repositories.payments.status.a aVar, com.yandex.go.places.impl.data.repositories.payments.process.a aVar2, jio jioVar) {
        super(wna0.class);
        this.x = aq80Var;
        this.y = una0Var;
        this.z = aVar;
        this.A = aVar2;
        this.B = jioVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (r10 == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(a aVar, ContinuationImpl continuationImpl) {
        PaymentsProcessingPresenter$createInvoice$1 paymentsProcessingPresenter$createInvoice$1;
        int i;
        nk80 nk80Var;
        aVar.getClass();
        if (continuationImpl instanceof PaymentsProcessingPresenter$createInvoice$1) {
            paymentsProcessingPresenter$createInvoice$1 = (PaymentsProcessingPresenter$createInvoice$1) continuationImpl;
            int i2 = paymentsProcessingPresenter$createInvoice$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentsProcessingPresenter$createInvoice$1.label = i2 - Integer.MIN_VALUE;
                PaymentsProcessingPresenter$createInvoice$1 paymentsProcessingPresenter$createInvoice$12 = paymentsProcessingPresenter$createInvoice$1;
                Object obj = paymentsProcessingPresenter$createInvoice$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentsProcessingPresenter$createInvoice$12.label;
                if (i != 0) {
                    b.b(obj);
                    una0 una0Var = aVar.y;
                    com.yandex.go.places.impl.data.repositories.payments.process.a aVar2 = aVar.A;
                    String str = una0Var.a;
                    String str2 = una0Var.b;
                    PaymentMethod$Type paymentMethod$Type = una0Var.c;
                    zzs zzsVar = una0Var.d;
                    paymentsProcessingPresenter$createInvoice$12.L$0 = null;
                    paymentsProcessingPresenter$createInvoice$12.label = 1;
                    obj = aVar2.a(str, str2, paymentMethod$Type, zzsVar, paymentsProcessingPresenter$createInvoice$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    b.b(obj);
                }
                nk80Var = (nk80) obj;
                if (nk80Var instanceof kk80) {
                    aVar.Mg(PaymentsProcessingNavigator$ErrorType.INVOICE_ERROR);
                    return zy11.a;
                }
                String str3 = ((PlacesProcessPaymentResponse) ((kk80) nk80Var).a).a;
                paymentsProcessingPresenter$createInvoice$12.L$0 = null;
                paymentsProcessingPresenter$createInvoice$12.label = 2;
                Object Lg = aVar.Lg(str3, paymentsProcessingPresenter$createInvoice$12);
                return Lg == obj2 ? obj2 : Lg;
            }
        }
        paymentsProcessingPresenter$createInvoice$1 = new PaymentsProcessingPresenter$createInvoice$1(aVar, continuationImpl);
        PaymentsProcessingPresenter$createInvoice$1 paymentsProcessingPresenter$createInvoice$122 = paymentsProcessingPresenter$createInvoice$1;
        Object obj3 = paymentsProcessingPresenter$createInvoice$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentsProcessingPresenter$createInvoice$122.label;
        if (i != 0) {
        }
        nk80Var = (nk80) obj3;
        if (nk80Var instanceof kk80) {
        }
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        pzt0 pzt0Var = this.C;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.C = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Lg(String str, ContinuationImpl continuationImpl) {
        PaymentsProcessingPresenter$checkPaymentStatus$1 paymentsProcessingPresenter$checkPaymentStatus$1;
        int i;
        nk80 nk80Var;
        if (continuationImpl instanceof PaymentsProcessingPresenter$checkPaymentStatus$1) {
            paymentsProcessingPresenter$checkPaymentStatus$1 = (PaymentsProcessingPresenter$checkPaymentStatus$1) continuationImpl;
            int i2 = paymentsProcessingPresenter$checkPaymentStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentsProcessingPresenter$checkPaymentStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentsProcessingPresenter$checkPaymentStatus$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentsProcessingPresenter$checkPaymentStatus$1.label;
                if (i != 0) {
                    b.b(obj);
                    paymentsProcessingPresenter$checkPaymentStatus$1.L$0 = str;
                    paymentsProcessingPresenter$checkPaymentStatus$1.label = 1;
                    obj = this.z.a(str, paymentsProcessingPresenter$checkPaymentStatus$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    str = (String) paymentsProcessingPresenter$checkPaymentStatus$1.L$0;
                    b.b(obj);
                }
                nk80Var = (nk80) obj;
                if (nk80Var instanceof kk80) {
                    Mg(PaymentsProcessingNavigator$ErrorType.POLLING_ERROR);
                    return zy11.a;
                }
                PaymentStatus paymentStatus = ((PaymentStatusResponse) ((kk80) nk80Var).a).a;
                paymentsProcessingPresenter$checkPaymentStatus$1.L$0 = null;
                paymentsProcessingPresenter$checkPaymentStatus$1.L$1 = null;
                paymentsProcessingPresenter$checkPaymentStatus$1.label = 2;
                Object Ng = Ng(paymentStatus, str, paymentsProcessingPresenter$checkPaymentStatus$1);
                return Ng == obj2 ? obj2 : Ng;
            }
        }
        paymentsProcessingPresenter$checkPaymentStatus$1 = new PaymentsProcessingPresenter$checkPaymentStatus$1(this, continuationImpl);
        Object obj3 = paymentsProcessingPresenter$checkPaymentStatus$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentsProcessingPresenter$checkPaymentStatus$1.label;
        if (i != 0) {
        }
        nk80Var = (nk80) obj3;
        if (nk80Var instanceof kk80) {
        }
    }

    public final void Mg(PaymentsProcessingNavigator$ErrorType paymentsProcessingNavigator$ErrorType) {
        this.B.g(this.y.a, DiscoveryAnalytics$PaymentResultStatus.Fail);
        ((vna0) this.x.a).r(new u290(26, paymentsProcessingNavigator$ErrorType));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        if (kotlinx.coroutines.a.i(com.yandex.go.places.complaint.impl.ui.ComplaintNotification.DURATION, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Ng(PaymentStatus paymentStatus, String str, ContinuationImpl continuationImpl) {
        PaymentsProcessingPresenter$processResult$1 paymentsProcessingPresenter$processResult$1;
        int i;
        if (continuationImpl instanceof PaymentsProcessingPresenter$processResult$1) {
            paymentsProcessingPresenter$processResult$1 = (PaymentsProcessingPresenter$processResult$1) continuationImpl;
            int i2 = paymentsProcessingPresenter$processResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentsProcessingPresenter$processResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentsProcessingPresenter$processResult$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentsProcessingPresenter$processResult$1.label;
                if (i != 0) {
                    b.b(obj);
                    int i3 = xna0.a[paymentStatus.ordinal()];
                    if (i3 == 1) {
                        paymentsProcessingPresenter$processResult$1.L$0 = null;
                        paymentsProcessingPresenter$processResult$1.L$1 = str;
                        paymentsProcessingPresenter$processResult$1.label = 1;
                    } else {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                Mg(PaymentsProcessingNavigator$ErrorType.POLLING_ERROR);
                            } else {
                                if (i3 != 4) {
                                    w511.b();
                                    return null;
                                }
                                Mg(PaymentsProcessingNavigator$ErrorType.PAYMENT_FAILURE);
                            }
                            return zy11.a;
                        }
                        paymentsProcessingPresenter$processResult$1.L$0 = null;
                        paymentsProcessingPresenter$processResult$1.L$1 = null;
                        paymentsProcessingPresenter$processResult$1.label = 3;
                        Object Og = Og(paymentsProcessingPresenter$processResult$1);
                        if (Og != obj2) {
                            return Og;
                        }
                    }
                }
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return obj;
                }
                str = (String) paymentsProcessingPresenter$processResult$1.L$1;
                b.b(obj);
                paymentsProcessingPresenter$processResult$1.L$0 = null;
                paymentsProcessingPresenter$processResult$1.L$1 = null;
                paymentsProcessingPresenter$processResult$1.label = 2;
                Object Lg = Lg(str, paymentsProcessingPresenter$processResult$1);
                return Lg != obj2 ? obj2 : Lg;
            }
        }
        paymentsProcessingPresenter$processResult$1 = new PaymentsProcessingPresenter$processResult$1(this, continuationImpl);
        Object obj3 = paymentsProcessingPresenter$processResult$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentsProcessingPresenter$processResult$1.label;
        if (i != 0) {
        }
        paymentsProcessingPresenter$processResult$1.L$0 = null;
        paymentsProcessingPresenter$processResult$1.L$1 = null;
        paymentsProcessingPresenter$processResult$1.label = 2;
        Object Lg2 = Lg(str, paymentsProcessingPresenter$processResult$1);
        if (Lg2 != obj22) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Og(ContinuationImpl continuationImpl) {
        PaymentsProcessingPresenter$processSuccess$1 paymentsProcessingPresenter$processSuccess$1;
        int i;
        if (continuationImpl instanceof PaymentsProcessingPresenter$processSuccess$1) {
            paymentsProcessingPresenter$processSuccess$1 = (PaymentsProcessingPresenter$processSuccess$1) continuationImpl;
            int i2 = paymentsProcessingPresenter$processSuccess$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentsProcessingPresenter$processSuccess$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentsProcessingPresenter$processSuccess$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentsProcessingPresenter$processSuccess$1.label;
                if (i != 0) {
                    b.b(obj);
                    this.A.b.l(PaymentProcessingState.SUCCESS);
                    paymentsProcessingPresenter$processSuccess$1.label = 1;
                    if (kotlinx.coroutines.a.i(ComplaintNotification.DURATION, paymentsProcessingPresenter$processSuccess$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                this.B.g(this.y.a, DiscoveryAnalytics$PaymentResultStatus.Success);
                ((vna0) this.x.a).r(new dia0(3));
                return zy11.a;
            }
        }
        paymentsProcessingPresenter$processSuccess$1 = new PaymentsProcessingPresenter$processSuccess$1(this, continuationImpl);
        Object obj2 = paymentsProcessingPresenter$processSuccess$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentsProcessingPresenter$processSuccess$1.label;
        if (i != 0) {
        }
        this.B.g(this.y.a, DiscoveryAnalytics$PaymentResultStatus.Success);
        ((vna0) this.x.a).r(new dia0(3));
        return zy11.a;
    }
}
