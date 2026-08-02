package com.ybsdk.feature.card.internal.presentation.cardissue;

import com.google.android.gms.location.DeviceOrientationRequest;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.features.b;
import com.ybsdk.feature.card.internal.interactors.f;
import defpackage.cf8;
import defpackage.df8;
import defpackage.ds31;
import defpackage.ny61;
import defpackage.ofb1;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.rk6;
import defpackage.sh8;
import defpackage.ta8;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.uc5;
import defpackage.uh8;
import defpackage.vm7;
import defpackage.w511;
import defpackage.x4c;
import defpackage.xh8;
import defpackage.xj1;
import defpackage.yh8;
import defpackage.zy11;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final f B;
    public final cf8 C;
    public final AppAnalyticsReporter D;
    public final tfl0 E;
    public final b F;
    public final CardIssueScreenArguments G;
    public pzt0 H;
    public String I;

    public a(f fVar, cf8 cf8Var, AppAnalyticsReporter appAnalyticsReporter, tfl0 tfl0Var, b bVar, CardIssueScreenArguments cardIssueScreenArguments) {
        super(new rk6(24, cardIssueScreenArguments), new vm7(13));
        this.B = fVar;
        this.C = cf8Var;
        this.D = appAnalyticsReporter;
        this.E = tfl0Var;
        this.F = bVar;
        this.G = cardIssueScreenArguments;
        h0();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable b0(a aVar, ContinuationImpl continuationImpl) {
        CardIssueViewModel$getApplicationId$1 cardIssueViewModel$getApplicationId$1;
        int i;
        Object b;
        boolean z;
        aVar.getClass();
        if (continuationImpl instanceof CardIssueViewModel$getApplicationId$1) {
            cardIssueViewModel$getApplicationId$1 = (CardIssueViewModel$getApplicationId$1) continuationImpl;
            int i2 = cardIssueViewModel$getApplicationId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardIssueViewModel$getApplicationId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardIssueViewModel$getApplicationId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardIssueViewModel$getApplicationId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String applicationId = aVar.G.getApplicationId();
                    if (applicationId == null) {
                        applicationId = aVar.I;
                    }
                    if (applicationId != null) {
                        return applicationId;
                    }
                    f fVar = aVar.B;
                    cardIssueViewModel$getApplicationId$1.label = 1;
                    b = fVar.b(aVar, cardIssueViewModel$getApplicationId$1);
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
                z = b instanceof Result.Failure;
                if (!z) {
                    aVar.I = ((ta8) b).a;
                }
                return z ? ((ta8) b).a : (Serializable) b;
            }
        }
        cardIssueViewModel$getApplicationId$1 = new CardIssueViewModel$getApplicationId$1(aVar, continuationImpl);
        Object obj2 = cardIssueViewModel$getApplicationId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardIssueViewModel$getApplicationId$1.label;
        if (i != 0) {
        }
        z = b instanceof Result.Failure;
        if (!z) {
        }
        if (z) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        if (r11 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0064, code lost:
    
        if (r11 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c0(a aVar, String str, ContinuationImpl continuationImpl) {
        CardIssueViewModel$submitCard$1 cardIssueViewModel$submitCard$1;
        int i;
        Object d0;
        Throwable a;
        Object a2;
        r0 r0Var;
        Object value;
        aVar.getClass();
        if (continuationImpl instanceof CardIssueViewModel$submitCard$1) {
            cardIssueViewModel$submitCard$1 = (CardIssueViewModel$submitCard$1) continuationImpl;
            int i2 = cardIssueViewModel$submitCard$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardIssueViewModel$submitCard$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardIssueViewModel$submitCard$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardIssueViewModel$submitCard$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cardIssueViewModel$submitCard$1.L$0 = str;
                    cardIssueViewModel$submitCard$1.label = 1;
                    d0 = aVar.d0(cardIssueViewModel$submitCard$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                kotlin.b.b(obj);
                                return ((Result) obj).getValue();
                            }
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) cardIssueViewModel$submitCard$1.L$0;
                        kotlin.b.b(obj);
                        a2 = ((Result) obj).getValue();
                        Throwable a3 = Result.a(a2);
                        if (a3 != null) {
                            return new Result.Failure(a3);
                        }
                        pz40 Y = aVar.Y();
                        do {
                            r0Var = (r0) Y;
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, sh8.a((sh8) value, false, null, null, 11)));
                        cardIssueViewModel$submitCard$1.L$0 = null;
                        cardIssueViewModel$submitCard$1.label = 3;
                        Object g0 = aVar.g0(str, cardIssueViewModel$submitCard$1);
                        return g0 == obj2 ? obj2 : g0;
                    }
                    str = (String) cardIssueViewModel$submitCard$1.L$0;
                    kotlin.b.b(obj);
                    d0 = ((Result) obj).getValue();
                }
                a = Result.a(d0);
                if (a == null) {
                    return new Result.Failure(a);
                }
                f fVar = aVar.B;
                cardIssueViewModel$submitCard$1.L$0 = str;
                cardIssueViewModel$submitCard$1.label = 2;
                a2 = fVar.a(str, aVar, (String) d0, cardIssueViewModel$submitCard$1);
            }
        }
        cardIssueViewModel$submitCard$1 = new CardIssueViewModel$submitCard$1(aVar, continuationImpl);
        Object obj3 = cardIssueViewModel$submitCard$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardIssueViewModel$submitCard$1.label;
        if (i != 0) {
        }
        a = Result.a(d0);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d0(ContinuationImpl continuationImpl) {
        CardIssueViewModel$getAgreementId$1 cardIssueViewModel$getAgreementId$1;
        int i;
        Object a;
        r0 r0Var;
        Object value;
        if (continuationImpl instanceof CardIssueViewModel$getAgreementId$1) {
            cardIssueViewModel$getAgreementId$1 = (CardIssueViewModel$getAgreementId$1) continuationImpl;
            int i2 = cardIssueViewModel$getAgreementId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardIssueViewModel$getAgreementId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cardIssueViewModel$getAgreementId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardIssueViewModel$getAgreementId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = ((sh8) X()).d;
                    if (str != null) {
                        return str;
                    }
                    String str2 = ((sh8) X()).d;
                    cardIssueViewModel$getAgreementId$1.label = 1;
                    b bVar = this.F;
                    bVar.getClass();
                    a = com.ybsdk.feature.card.api.a.a(bVar, str2, cardIssueViewModel$getAgreementId$1);
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
                if (!(a instanceof Result.Failure)) {
                    a = ((xj1) a).a;
                }
                if (!(a instanceof Result.Failure)) {
                    String str3 = (String) a;
                    pz40 Y = Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, sh8.a((sh8) value, false, null, str3, 7)));
                }
                return a;
            }
        }
        cardIssueViewModel$getAgreementId$1 = new CardIssueViewModel$getAgreementId$1(this, continuationImpl);
        Object obj2 = cardIssueViewModel$getAgreementId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardIssueViewModel$getAgreementId$1.label;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        return a;
    }

    public final void e0(yh8 yh8Var) {
        boolean equals = yh8Var.equals(xh8.a);
        tfl0 tfl0Var = this.E;
        if (equals) {
            tfl0Var.m(((df8) this.C).b());
            return;
        }
        if (yh8Var.equals(xh8.b)) {
            h0();
            return;
        }
        if (yh8Var.equals(xh8.e)) {
            tfl0Var.e();
            return;
        }
        if (!yh8Var.equals(xh8.d)) {
            if (yh8Var.equals(xh8.c)) {
                return;
            }
            w511.b();
            return;
        }
        int i = uh8.a[this.G.getIssueAction().ordinal()];
        if (i == 1) {
            tfl0Var.e();
            return;
        }
        if (i != 2) {
            w511.b();
            return;
        }
        String str = ((sh8) X()).d;
        if (str == null) {
            x4c.g("failed to open card screen from card issue screen - no agreementId", null, null, null, 14);
        } else {
            tfl0Var.l(ofb1.a(this.C, str, false, null, null, null, null, 254));
        }
    }

    public final void f0() {
        this.E.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g0(String str, ContinuationImpl continuationImpl) {
        CardIssueViewModel$pollApplication$1 cardIssueViewModel$pollApplication$1;
        int i;
        try {
            if (continuationImpl instanceof CardIssueViewModel$pollApplication$1) {
                cardIssueViewModel$pollApplication$1 = (CardIssueViewModel$pollApplication$1) continuationImpl;
                int i2 = cardIssueViewModel$pollApplication$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cardIssueViewModel$pollApplication$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = cardIssueViewModel$pollApplication$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = cardIssueViewModel$pollApplication$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        CardIssueViewModel$pollApplication$2$1 cardIssueViewModel$pollApplication$2$1 = new CardIssueViewModel$pollApplication$2$1(this, str, null);
                        cardIssueViewModel$pollApplication$1.label = 1;
                        if (kotlinx.coroutines.a.u(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, cardIssueViewModel$pollApplication$2$1, cardIssueViewModel$pollApplication$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        cardIssueViewModel$pollApplication$1 = new CardIssueViewModel$pollApplication$1(this, continuationImpl);
        Object obj2 = cardIssueViewModel$pollApplication$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardIssueViewModel$pollApplication$1.label;
    }

    public final void h0() {
        this.D.k.a.a("card.create.initiated", null);
        pzt0 pzt0Var = this.H;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.H = tje.N(ds31.a(this), null, null, new CardIssueViewModel$retry$1(this, null), 3);
    }
}
