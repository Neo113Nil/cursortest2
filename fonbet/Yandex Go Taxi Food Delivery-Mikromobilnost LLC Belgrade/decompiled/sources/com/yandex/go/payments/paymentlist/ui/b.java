package com.yandex.go.payments.paymentlist.ui;

import com.yandex.go.payments.paymentlist.details.d;
import com.yandex.go.payments.paymentlist.experiments.MainMenuPaymentMethodsSelectorExperiment;
import defpackage.b600;
import defpackage.bjm0;
import defpackage.d6z;
import defpackage.evu0;
import defpackage.fl8;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.k7x0;
import defpackage.k9a0;
import defpackage.l9a0;
import defpackage.lea0;
import defpackage.m7x0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.ufu;
import defpackage.uyj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class b implements l9a0 {
    public final tt2 a;
    public final b600 b;
    public final d c;
    public final k7x0 d;
    public final pdc e;
    public volatile k9a0 f;
    public volatile k9a0 g;
    public final kotlinx.coroutines.sync.a h = gtq0.a();

    public b(tt2 tt2Var, b600 b600Var, d dVar, k7x0 k7x0Var, pdc pdcVar) {
        this.a = tt2Var;
        this.b = b600Var;
        this.c = dVar;
        this.d = k7x0Var;
        this.e = pdcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d2, code lost:
    
        if (r12 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cd, code lost:
    
        if (r12 == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00cd -> B:16:0x00d0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, lea0 lea0Var, ContinuationImpl continuationImpl) {
        PaymentMethodsBannerFactoryImpl$createDetailsScreenBanner$1 paymentMethodsBannerFactoryImpl$createDetailsScreenBanner$1;
        int i;
        Iterator it;
        k9a0 k9a0Var;
        bVar.getClass();
        if (continuationImpl instanceof PaymentMethodsBannerFactoryImpl$createDetailsScreenBanner$1) {
            paymentMethodsBannerFactoryImpl$createDetailsScreenBanner$1 = (PaymentMethodsBannerFactoryImpl$createDetailsScreenBanner$1) continuationImpl;
            int i2 = paymentMethodsBannerFactoryImpl$createDetailsScreenBanner$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsBannerFactoryImpl$createDetailsScreenBanner$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsBannerFactoryImpl$createDetailsScreenBanner$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsBannerFactoryImpl$createDetailsScreenBanner$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (bVar.e().b) {
                        MainMenuPaymentMethodsSelectorExperiment.PaymentTypes paymentTypes = lea0Var instanceof fl8 ? MainMenuPaymentMethodsSelectorExperiment.PaymentTypes.CARD : lea0Var instanceof bjm0 ? MainMenuPaymentMethodsSelectorExperiment.PaymentTypes.SBP_TOKEN : null;
                        if (paymentTypes != null) {
                            List list = bVar.e().e;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : list) {
                                MainMenuPaymentMethodsSelectorExperiment.InformationBanner informationBanner = (MainMenuPaymentMethodsSelectorExperiment.InformationBanner) obj3;
                                if (informationBanner.getI().getA() == MainMenuPaymentMethodsSelectorExperiment.Screen.DETAILS_CARD && informationBanner.getI().getB().contains(paymentTypes)) {
                                    arrayList.add(obj3);
                                }
                            }
                            it = arrayList.iterator();
                            if (!it.hasNext()) {
                                k9a0Var = null;
                                if (k9a0Var != null) {
                                    d dVar = bVar.c;
                                    String a = k9a0Var.a();
                                    paymentMethodsBannerFactoryImpl$createDetailsScreenBanner$1.L$0 = null;
                                    paymentMethodsBannerFactoryImpl$createDetailsScreenBanner$1.L$1 = null;
                                    paymentMethodsBannerFactoryImpl$createDetailsScreenBanner$1.L$2 = k9a0Var;
                                    paymentMethodsBannerFactoryImpl$createDetailsScreenBanner$1.L$3 = null;
                                    paymentMethodsBannerFactoryImpl$createDetailsScreenBanner$1.label = 2;
                                    if (dVar.b(a, paymentMethodsBannerFactoryImpl$createDetailsScreenBanner$1) == obj2) {
                                        return obj2;
                                    }
                                }
                                return k9a0Var;
                            }
                            MainMenuPaymentMethodsSelectorExperiment.InformationBanner informationBanner2 = (MainMenuPaymentMethodsSelectorExperiment.InformationBanner) it.next();
                            paymentMethodsBannerFactoryImpl$createDetailsScreenBanner$1.L$0 = null;
                            paymentMethodsBannerFactoryImpl$createDetailsScreenBanner$1.L$1 = null;
                            paymentMethodsBannerFactoryImpl$createDetailsScreenBanner$1.L$2 = it;
                            paymentMethodsBannerFactoryImpl$createDetailsScreenBanner$1.L$3 = null;
                            paymentMethodsBannerFactoryImpl$createDetailsScreenBanner$1.label = 1;
                            obj = bVar.c(informationBanner2, paymentMethodsBannerFactoryImpl$createDetailsScreenBanner$1);
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k9a0 k9a0Var2 = (k9a0) paymentMethodsBannerFactoryImpl$createDetailsScreenBanner$1.L$2;
                    kotlin.b.b(obj);
                    return k9a0Var2;
                }
                it = (Iterator) paymentMethodsBannerFactoryImpl$createDetailsScreenBanner$1.L$2;
                kotlin.b.b(obj);
                k9a0Var = (k9a0) obj;
            }
        }
        paymentMethodsBannerFactoryImpl$createDetailsScreenBanner$1 = new PaymentMethodsBannerFactoryImpl$createDetailsScreenBanner$1(bVar, continuationImpl);
        Object obj4 = paymentMethodsBannerFactoryImpl$createDetailsScreenBanner$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsBannerFactoryImpl$createDetailsScreenBanner$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x008e -> B:10:0x0091). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, ContinuationImpl continuationImpl) {
        PaymentMethodsBannerFactoryImpl$createMenuScreenBanner$1 paymentMethodsBannerFactoryImpl$createMenuScreenBanner$1;
        int i;
        Iterator it;
        bVar.getClass();
        if (continuationImpl instanceof PaymentMethodsBannerFactoryImpl$createMenuScreenBanner$1) {
            paymentMethodsBannerFactoryImpl$createMenuScreenBanner$1 = (PaymentMethodsBannerFactoryImpl$createMenuScreenBanner$1) continuationImpl;
            int i2 = paymentMethodsBannerFactoryImpl$createMenuScreenBanner$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsBannerFactoryImpl$createMenuScreenBanner$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsBannerFactoryImpl$createMenuScreenBanner$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsBannerFactoryImpl$createMenuScreenBanner$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (bVar.e().b) {
                        List list = bVar.e().e;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            if (((MainMenuPaymentMethodsSelectorExperiment.InformationBanner) obj3).getI().getA() == MainMenuPaymentMethodsSelectorExperiment.Screen.PAYMENT_LIST) {
                                arrayList.add(obj3);
                            }
                        }
                        it = arrayList.iterator();
                        if (it.hasNext()) {
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = (Iterator) paymentMethodsBannerFactoryImpl$createMenuScreenBanner$1.L$0;
                kotlin.b.b(obj);
                k9a0 k9a0Var = (k9a0) obj;
                if (k9a0Var != null) {
                    return k9a0Var;
                }
                if (it.hasNext()) {
                    MainMenuPaymentMethodsSelectorExperiment.InformationBanner informationBanner = (MainMenuPaymentMethodsSelectorExperiment.InformationBanner) it.next();
                    paymentMethodsBannerFactoryImpl$createMenuScreenBanner$1.L$0 = it;
                    paymentMethodsBannerFactoryImpl$createMenuScreenBanner$1.L$1 = null;
                    paymentMethodsBannerFactoryImpl$createMenuScreenBanner$1.label = 1;
                    obj = bVar.c(informationBanner, paymentMethodsBannerFactoryImpl$createMenuScreenBanner$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                    k9a0 k9a0Var2 = (k9a0) obj;
                    if (k9a0Var2 != null) {
                    }
                    if (it.hasNext()) {
                    }
                }
                return null;
            }
        }
        paymentMethodsBannerFactoryImpl$createMenuScreenBanner$1 = new PaymentMethodsBannerFactoryImpl$createMenuScreenBanner$1(bVar, continuationImpl);
        Object obj4 = paymentMethodsBannerFactoryImpl$createMenuScreenBanner$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsBannerFactoryImpl$createMenuScreenBanner$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(MainMenuPaymentMethodsSelectorExperiment.InformationBanner informationBanner, ContinuationImpl continuationImpl) {
        PaymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1 paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        d dVar;
        MainMenuPaymentMethodsSelectorExperiment.InformationBanner informationBanner2;
        String str;
        String Y;
        String Y2;
        MainMenuPaymentMethodsSelectorExperiment.ShowPolicy showPolicy;
        MainMenuPaymentMethodsSelectorExperiment.ShowPolicy h;
        Object c;
        String str2;
        MainMenuPaymentMethodsSelectorExperiment.InformationBanner informationBanner3;
        String str3;
        MainMenuPaymentMethodsSelectorExperiment.ShowPolicy showPolicy2;
        String str4;
        if (continuationImpl instanceof PaymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1) {
            paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1 = (PaymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1) continuationImpl;
            int i2 = paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.label = i2 - Integer.MIN_VALUE;
                obj = paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.label;
                dVar = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String a = informationBanner.getA();
                    if (!evu0.J(a)) {
                        informationBanner2 = informationBanner;
                        paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.L$0 = informationBanner2;
                        paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.L$1 = a;
                        paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.label = 1;
                        Object e = dVar.e(a, paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1);
                        if (e != coroutineSingletons) {
                            str = a;
                            obj = e;
                        }
                        return coroutineSingletons;
                    }
                    return null;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    MainMenuPaymentMethodsSelectorExperiment.ShowPolicy showPolicy3 = (MainMenuPaymentMethodsSelectorExperiment.ShowPolicy) paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.L$5;
                    String str5 = (String) paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.L$3;
                    String str6 = (String) paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.L$2;
                    String str7 = (String) paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.L$1;
                    informationBanner3 = (MainMenuPaymentMethodsSelectorExperiment.InformationBanner) paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.L$0;
                    kotlin.b.b(obj);
                    showPolicy2 = showPolicy3;
                    str3 = str5;
                    str2 = str6;
                    str4 = str7;
                    if (((Number) obj).intValue() < showPolicy2.getA()) {
                        String g = informationBanner3.getG();
                        String a2 = evu0.J(g) ? null : ((m7x0) this.d).a(g);
                        String c2 = informationBanner3.getC();
                        ufu ufuVar = (ufu) this.e;
                        return new k9a0(str4, str2, str3, informationBanner3.getB(), a2, showPolicy2, ufuVar.i(c2), ufuVar.i(informationBanner3.getD()));
                    }
                    return null;
                }
                String str8 = (String) paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.L$1;
                MainMenuPaymentMethodsSelectorExperiment.InformationBanner informationBanner4 = (MainMenuPaymentMethodsSelectorExperiment.InformationBanner) paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.L$0;
                kotlin.b.b(obj);
                str = str8;
                informationBanner2 = informationBanner4;
                if (!((Boolean) obj).booleanValue() && !evu0.J(informationBanner2.getC()) && !evu0.J(informationBanner2.getD())) {
                    Y = d6z.Y(e(), informationBanner2.getE());
                    Y2 = d6z.Y(e(), informationBanner2.getF());
                    if ((evu0.J(Y) || !evu0.J(Y2)) && (showPolicy = e().d) != null) {
                        h = informationBanner2.getH();
                        if (h != null) {
                            showPolicy = h;
                        }
                        paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.L$0 = informationBanner2;
                        paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.L$1 = str;
                        paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.L$2 = Y;
                        paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.L$3 = Y2;
                        paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.L$4 = null;
                        paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.L$5 = showPolicy;
                        paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.label = 2;
                        c = dVar.c(str, paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1);
                        if (c != coroutineSingletons) {
                            str2 = Y;
                            obj = c;
                            informationBanner3 = informationBanner2;
                            str3 = Y2;
                            showPolicy2 = showPolicy;
                            str4 = str;
                            if (((Number) obj).intValue() < showPolicy2.getA()) {
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                return null;
            }
        }
        paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1 = new PaymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1(this, continuationImpl);
        obj = paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.label;
        dVar = this.c;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
            Y = d6z.Y(e(), informationBanner2.getE());
            Y2 = d6z.Y(e(), informationBanner2.getF());
            if (evu0.J(Y)) {
            }
            h = informationBanner2.getH();
            if (h != null) {
            }
            paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.L$0 = informationBanner2;
            paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.L$1 = str;
            paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.L$2 = Y;
            paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.L$3 = Y2;
            paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.L$4 = null;
            paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.L$5 = showPolicy;
            paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1.label = 2;
            c = dVar.c(str, paymentMethodsBannerFactoryImpl$createPaymentMethodsBannerOrNull$1);
            if (c != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(lea0 lea0Var, ContinuationImpl continuationImpl) {
        PaymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1 paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        lea0 lea0Var2;
        g050 g050Var;
        Throwable th;
        g050 g050Var2;
        try {
            if (continuationImpl instanceof PaymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1) {
                paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1 = (PaymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1) continuationImpl;
                int i2 = paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1.label = i2 - Integer.MIN_VALUE;
                    obj = paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1.L$0 = lea0Var;
                        kotlinx.coroutines.sync.a aVar = this.h;
                        paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1.L$1 = aVar;
                        paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1.label = 1;
                        if (aVar.a(paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1) != coroutineSingletons) {
                            lea0Var2 = lea0Var;
                            g050Var = aVar;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var2 = (g050) paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1.L$1;
                        try {
                            kotlin.b.b(obj);
                            k9a0 k9a0Var = (k9a0) obj;
                            g050Var2.d(null);
                            return k9a0Var;
                        } catch (Throwable th2) {
                            th = th2;
                            g050Var2.d(null);
                            throw th;
                        }
                    }
                    g050Var = (g050) paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1.L$1;
                    lea0Var2 = (lea0) paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1.L$0;
                    kotlin.b.b(obj);
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    PaymentMethodsBannerFactoryImpl$getDetailsScreenBanner$2$1 paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$2$1 = new PaymentMethodsBannerFactoryImpl$getDetailsScreenBanner$2$1(this, lea0Var2, null);
                    paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1.L$0 = null;
                    paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1.L$1 = g050Var;
                    paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1.label = 2;
                    obj = tje.k0(mdhVar, paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$2$1, paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1);
                    if (obj != coroutineSingletons) {
                        g050Var2 = g050Var;
                        k9a0 k9a0Var2 = (k9a0) obj;
                        g050Var2.d(null);
                        return k9a0Var2;
                    }
                    return coroutineSingletons;
                }
            }
            this.a.getClass();
            sjh sjhVar2 = uyj.a;
            mdh mdhVar2 = mdh.b;
            PaymentMethodsBannerFactoryImpl$getDetailsScreenBanner$2$1 paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$2$12 = new PaymentMethodsBannerFactoryImpl$getDetailsScreenBanner$2$1(this, lea0Var2, null);
            paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1.L$0 = null;
            paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1.L$1 = g050Var;
            paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1.label = 2;
            obj = tje.k0(mdhVar2, paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$2$12, paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            g050 g050Var3 = g050Var;
            th = th3;
            g050Var2 = g050Var3;
            g050Var2.d(null);
            throw th;
        }
        paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1 = new PaymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1(this, continuationImpl);
        obj = paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsBannerFactoryImpl$getDetailsScreenBanner$1.label;
        if (i != 0) {
        }
    }

    public final MainMenuPaymentMethodsSelectorExperiment e() {
        return (MainMenuPaymentMethodsSelectorExperiment) this.b.a.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
    
        if (r8.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v6, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        PaymentMethodsBannerFactoryImpl$getMenuScreenBanner$1 paymentMethodsBannerFactoryImpl$getMenuScreenBanner$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar;
        Throwable th;
        g050 g050Var;
        Object k0;
        try {
            if (continuationImpl instanceof PaymentMethodsBannerFactoryImpl$getMenuScreenBanner$1) {
                paymentMethodsBannerFactoryImpl$getMenuScreenBanner$1 = (PaymentMethodsBannerFactoryImpl$getMenuScreenBanner$1) continuationImpl;
                int i2 = paymentMethodsBannerFactoryImpl$getMenuScreenBanner$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    paymentMethodsBannerFactoryImpl$getMenuScreenBanner$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = paymentMethodsBannerFactoryImpl$getMenuScreenBanner$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = paymentMethodsBannerFactoryImpl$getMenuScreenBanner$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = this.h;
                        paymentMethodsBannerFactoryImpl$getMenuScreenBanner$1.L$0 = aVar;
                        paymentMethodsBannerFactoryImpl$getMenuScreenBanner$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) paymentMethodsBannerFactoryImpl$getMenuScreenBanner$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                k9a0 k9a0Var = (k9a0) obj;
                                g050Var.d(null);
                                return k9a0Var;
                            } catch (Throwable th2) {
                                th = th2;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        ?? r2 = (g050) paymentMethodsBannerFactoryImpl$getMenuScreenBanner$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r2;
                    }
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    PaymentMethodsBannerFactoryImpl$getMenuScreenBanner$2$1 paymentMethodsBannerFactoryImpl$getMenuScreenBanner$2$1 = new PaymentMethodsBannerFactoryImpl$getMenuScreenBanner$2$1(this, null);
                    paymentMethodsBannerFactoryImpl$getMenuScreenBanner$1.L$0 = aVar;
                    paymentMethodsBannerFactoryImpl$getMenuScreenBanner$1.label = 2;
                    k0 = tje.k0(mdhVar, paymentMethodsBannerFactoryImpl$getMenuScreenBanner$2$1, paymentMethodsBannerFactoryImpl$getMenuScreenBanner$1);
                    if (k0 != coroutineSingletons) {
                        kotlinx.coroutines.sync.a aVar2 = aVar;
                        obj = k0;
                        g050Var = aVar2;
                        k9a0 k9a0Var2 = (k9a0) obj;
                        g050Var.d(null);
                        return k9a0Var2;
                    }
                    return coroutineSingletons;
                }
            }
            this.a.getClass();
            sjh sjhVar2 = uyj.a;
            mdh mdhVar2 = mdh.b;
            PaymentMethodsBannerFactoryImpl$getMenuScreenBanner$2$1 paymentMethodsBannerFactoryImpl$getMenuScreenBanner$2$12 = new PaymentMethodsBannerFactoryImpl$getMenuScreenBanner$2$1(this, null);
            paymentMethodsBannerFactoryImpl$getMenuScreenBanner$1.L$0 = aVar;
            paymentMethodsBannerFactoryImpl$getMenuScreenBanner$1.label = 2;
            k0 = tje.k0(mdhVar2, paymentMethodsBannerFactoryImpl$getMenuScreenBanner$2$12, paymentMethodsBannerFactoryImpl$getMenuScreenBanner$1);
            if (k0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            kotlinx.coroutines.sync.a aVar3 = aVar;
            th = th3;
            g050Var = aVar3;
            g050Var.d(null);
            throw th;
        }
        paymentMethodsBannerFactoryImpl$getMenuScreenBanner$1 = new PaymentMethodsBannerFactoryImpl$getMenuScreenBanner$1(this, continuationImpl);
        Object obj2 = paymentMethodsBannerFactoryImpl$getMenuScreenBanner$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsBannerFactoryImpl$getMenuScreenBanner$1.label;
        if (i != 0) {
        }
    }
}
