package com.yandex.go.payments.paymentlist.domain.converter;

import com.yandex.go.payments.api.model.PaymentsScreen;
import com.yandex.go.payments.paymentlist.domain.PaymentMethodsConfig$OpenReason;
import com.yandex.go.payments.paymentlist.domain.j;
import com.yandex.go.payments.paymentlist.domain.m;
import com.yandex.go.payments.paymentlist.experiments.PaymentMethodsAddButtonExperiment;
import com.yandex.go.payments.paymentlist.ui.PaymentMethodChooserUIState$ShowAddCardAtBottomConfig;
import com.yandex.go.payments.promo.PaymentMethodsPromoBannerExperiment;
import com.yandex.go.yb.data.u;
import defpackage.a000;
import defpackage.ada0;
import defpackage.avj0;
import defpackage.aw90;
import defpackage.bdc;
import defpackage.bea0;
import defpackage.bfa0;
import defpackage.bg0;
import defpackage.bjm0;
import defpackage.bw90;
import defpackage.c4m;
import defpackage.cf91;
import defpackage.cfm0;
import defpackage.cxq0;
import defpackage.d4m;
import defpackage.df0;
import defpackage.drd;
import defpackage.edi0;
import defpackage.en11;
import defpackage.ep51;
import defpackage.eq51;
import defpackage.evu0;
import defpackage.evz;
import defpackage.fl8;
import defpackage.fvc;
import defpackage.g6a0;
import defpackage.g8e;
import defpackage.gm10;
import defpackage.gp50;
import defpackage.h2b1;
import defpackage.h8b0;
import defpackage.i3y;
import defpackage.i9a0;
import defpackage.ivt;
import defpackage.jbh;
import defpackage.jfa0;
import defpackage.jl40;
import defpackage.jo51;
import defpackage.jst;
import defpackage.jve;
import defpackage.k4m;
import defpackage.k9a0;
import defpackage.kd0;
import defpackage.kdc;
import defpackage.kjz;
import defpackage.kyh0;
import defpackage.l4m;
import defpackage.l9a0;
import defpackage.m4a0;
import defpackage.m4m;
import defpackage.m7x0;
import defpackage.mcp;
import defpackage.md3;
import defpackage.mdh;
import defpackage.mf0;
import defpackage.mj0;
import defpackage.mk0;
import defpackage.na0;
import defpackage.nea0;
import defpackage.nj0;
import defpackage.nk0;
import defpackage.ny61;
import defpackage.o2u;
import defpackage.o370;
import defpackage.of0;
import defpackage.ogz0;
import defpackage.om10;
import defpackage.p1c;
import defpackage.p4m;
import defpackage.pdc;
import defpackage.pmn;
import defpackage.q2u;
import defpackage.qgx;
import defpackage.qqy;
import defpackage.qz10;
import defpackage.r4m;
import defpackage.r8;
import defpackage.rcc;
import defpackage.rhq0;
import defpackage.rqo;
import defpackage.s65;
import defpackage.s9a0;
import defpackage.saa0;
import defpackage.scc;
import defpackage.sjh;
import defpackage.snr0;
import defpackage.t19;
import defpackage.t1b0;
import defpackage.t9a0;
import defpackage.tje;
import defpackage.tls;
import defpackage.ts51;
import defpackage.tt2;
import defpackage.u0a0;
import defpackage.u0k;
import defpackage.u19;
import defpackage.u290;
import defpackage.u9a0;
import defpackage.uba0;
import defpackage.ufu;
import defpackage.uk10;
import defpackage.um50;
import defpackage.us51;
import defpackage.uyj;
import defpackage.v7x;
import defpackage.vbn;
import defpackage.vca0;
import defpackage.vez0;
import defpackage.w511;
import defpackage.wrr;
import defpackage.wxc;
import defpackage.xdf;
import defpackage.xng0;
import defpackage.xw91;
import defpackage.yhi;
import defpackage.yvf0;
import defpackage.yy51;
import defpackage.za60;
import defpackage.zea0;
import defpackage.znj;
import defpackage.zuj0;
import defpackage.zv90;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;

/* loaded from: classes8.dex */
public final class i {
    public s9a0 a;
    public final boolean b;
    public final pmn c;
    public final uba0 d;
    public final tt2 e;
    public final zuj0 f;
    public final r4m g;
    public final com.yandex.go.payments.promo.c h;
    public final com.yandex.go.loyalty.impl.common.data.c i;
    public final t1b0 j;
    public final s65 k;
    public final u9a0 l;
    public final i3y m;

    public i(s9a0 s9a0Var, boolean z, pmn pmnVar, uba0 uba0Var, i9a0 i9a0Var, tt2 tt2Var, zuj0 zuj0Var, r4m r4mVar, com.yandex.go.payments.promo.c cVar, u0a0 u0a0Var, znj znjVar, com.yandex.go.loyalty.impl.common.data.c cVar2, j jVar, eq51 eq51Var, u uVar, rqo rqoVar, gp50 gp50Var, pdc pdcVar, bea0 bea0Var, yvf0 yvf0Var, xdf xdfVar, l9a0 l9a0Var, drd drdVar) {
        this.a = s9a0Var;
        this.b = z;
        this.c = pmnVar;
        this.d = uba0Var;
        this.e = tt2Var;
        this.f = zuj0Var;
        this.g = r4mVar;
        this.h = cVar;
        this.i = cVar2;
        PaymentMethodsAddButtonExperiment.Companion.getClass();
        this.j = ((jbh) rqoVar).e(PaymentMethodsAddButtonExperiment.e);
        com.yandex.go.payments.paymentlist.experiments.info_modal.c cVar3 = new com.yandex.go.payments.paymentlist.experiments.info_modal.c(rqoVar);
        s9a0 s9a0Var2 = this.a;
        this.k = (s9a0Var2.i || s9a0Var2.c != PaymentsScreen.MENU) ? new m(s9a0Var2, pmnVar, zuj0Var, xdfVar, drdVar, pdcVar, new cxq0(s9a0Var2.l, i9a0Var.a, i9a0Var.b), (o370) bea0Var.get(), u0a0Var, uba0Var.e, znjVar, cVar2, jVar, eq51Var, uVar, uba0Var, gp50Var, cVar3) : new com.yandex.go.payments.paymentlist.domain.d(s9a0Var2, pmnVar, zuj0Var, l9a0Var, new cxq0(s9a0Var2.l, i9a0Var.a, i9a0Var.b), (om10) yvf0Var.get(), u0a0Var, jVar, znjVar, eq51Var, uVar);
        s9a0 s9a0Var3 = this.a;
        this.l = (s9a0Var3.i || s9a0Var3.c != PaymentsScreen.MENU) ? s9a0Var3.e == PaymentMethodsConfig$OpenReason.RIDE ? new e(this) : new a(this) : new c(this);
        this.m = kotlin.a.b(LazyThreadSafetyMode.NONE, new t9a0(0, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(i iVar, jfa0 jfa0Var, ContinuationImpl continuationImpl) {
        PaymentMethodsConverter$convertWithEditMode$1 paymentMethodsConverter$convertWithEditMode$1;
        int i;
        iVar.getClass();
        i3y i3yVar = iVar.m;
        if (continuationImpl instanceof PaymentMethodsConverter$convertWithEditMode$1) {
            paymentMethodsConverter$convertWithEditMode$1 = (PaymentMethodsConverter$convertWithEditMode$1) continuationImpl;
            int i2 = paymentMethodsConverter$convertWithEditMode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsConverter$convertWithEditMode$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsConverter$convertWithEditMode$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsConverter$convertWithEditMode$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList = new ArrayList(jfa0Var.a);
                    ((b) i3yVar.getValue()).c(arrayList);
                    List b = ((b) i3yVar.getValue()).b(arrayList, jfa0Var.b);
                    paymentMethodsConverter$convertWithEditMode$1.L$0 = null;
                    paymentMethodsConverter$convertWithEditMode$1.L$1 = null;
                    paymentMethodsConverter$convertWithEditMode$1.L$2 = null;
                    paymentMethodsConverter$convertWithEditMode$1.label = 1;
                    obj = iVar.d((ArrayList) b, paymentMethodsConverter$convertWithEditMode$1);
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
                return new m4a0((List) obj, null, null, null, false, null, HProv.PP_DELETE_SAVED_PASSWD);
            }
        }
        paymentMethodsConverter$convertWithEditMode$1 = new PaymentMethodsConverter$convertWithEditMode$1(iVar, continuationImpl);
        Object obj3 = paymentMethodsConverter$convertWithEditMode$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsConverter$convertWithEditMode$1.label;
        if (i != 0) {
        }
        return new m4a0((List) obj3, null, null, null, false, null, HProv.PP_DELETE_SAVED_PASSWD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r1v10, types: [a4m] */
    /* JADX WARN: Type inference failed for: r26v0, types: [com.yandex.go.payments.paymentlist.domain.converter.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(i iVar, jfa0 jfa0Var, String str, k4m k4mVar, boolean z, ContinuationImpl continuationImpl) {
        PaymentMethodsConverter$convertWithNormalMode$1 paymentMethodsConverter$convertWithNormalMode$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        k4m k4mVar2;
        jfa0 jfa0Var2;
        boolean z2;
        String str2;
        boolean z3;
        List list;
        boolean z4;
        boolean z5;
        Object e;
        PaymentMethodChooserUIState$ShowAddCardAtBottomConfig paymentMethodChooserUIState$ShowAddCardAtBottomConfig;
        k4m k4mVar3;
        String str3;
        jfa0 jfa0Var3;
        boolean z6;
        p4m m4mVar;
        u9a0 u9a0Var = iVar.l;
        if (continuationImpl instanceof PaymentMethodsConverter$convertWithNormalMode$1) {
            paymentMethodsConverter$convertWithNormalMode$1 = (PaymentMethodsConverter$convertWithNormalMode$1) continuationImpl;
            int i2 = paymentMethodsConverter$convertWithNormalMode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsConverter$convertWithNormalMode$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsConverter$convertWithNormalMode$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsConverter$convertWithNormalMode$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean z7 = jfa0Var.c;
                    List list2 = jfa0Var.a;
                    if (z7) {
                        return m4a0.h;
                    }
                    ArrayList arrayList = new ArrayList(list2);
                    if (!z) {
                        arrayList.removeIf(new md3(12, new qz10(17)));
                    }
                    u9a0Var.c(arrayList);
                    boolean z8 = false;
                    if (str != null) {
                        List list3 = list2;
                        boolean z9 = list3 instanceof Collection;
                        if (!z9 || !list3.isEmpty()) {
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                if (((nea0) it.next()).a instanceof yy51) {
                                    z4 = true;
                                    break;
                                }
                            }
                        }
                        z4 = false;
                        if (!z9 || !list3.isEmpty()) {
                            Iterator it2 = list3.iterator();
                            while (it2.hasNext()) {
                                u0k u0kVar = ((nea0) it2.next()).a;
                                if ((u0kVar instanceof fl8) && !((fl8) u0kVar).h) {
                                    z5 = true;
                                    break;
                                }
                            }
                        }
                        z5 = false;
                        if (!z4 && !z5) {
                            z8 = true;
                        }
                    }
                    paymentMethodsConverter$convertWithNormalMode$1.L$0 = jfa0Var;
                    paymentMethodsConverter$convertWithNormalMode$1.L$1 = str;
                    k4mVar2 = k4mVar;
                    paymentMethodsConverter$convertWithNormalMode$1.L$2 = k4mVar2;
                    paymentMethodsConverter$convertWithNormalMode$1.L$3 = arrayList;
                    paymentMethodsConverter$convertWithNormalMode$1.Z$0 = z;
                    paymentMethodsConverter$convertWithNormalMode$1.Z$1 = z8;
                    paymentMethodsConverter$convertWithNormalMode$1.label = 1;
                    Enum m = iVar.m(arrayList, z8, paymentMethodsConverter$convertWithNormalMode$1);
                    if (m != coroutineSingletons) {
                        jfa0Var2 = jfa0Var;
                        z2 = z8;
                        obj = m;
                        str2 = str;
                        z3 = z;
                        list = arrayList;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = paymentMethodsConverter$convertWithNormalMode$1.Z$1;
                    PaymentMethodChooserUIState$ShowAddCardAtBottomConfig paymentMethodChooserUIState$ShowAddCardAtBottomConfig2 = (PaymentMethodChooserUIState$ShowAddCardAtBottomConfig) paymentMethodsConverter$convertWithNormalMode$1.L$4;
                    k4mVar3 = (k4m) paymentMethodsConverter$convertWithNormalMode$1.L$2;
                    String str4 = (String) paymentMethodsConverter$convertWithNormalMode$1.L$1;
                    jfa0Var3 = (jfa0) paymentMethodsConverter$convertWithNormalMode$1.L$0;
                    kotlin.b.b(obj);
                    paymentMethodChooserUIState$ShowAddCardAtBottomConfig = paymentMethodChooserUIState$ShowAddCardAtBottomConfig2;
                    str3 = str4;
                    boolean z10 = z2;
                    List list4 = (List) obj;
                    r4m r4mVar = iVar.g;
                    s9a0 s9a0Var = iVar.a;
                    zuj0 zuj0Var = r4mVar.a;
                    z6 = s9a0Var.k;
                    l4m l4mVar = l4m.a;
                    if (!z6) {
                        boolean z11 = k4mVar3 instanceof d4m;
                        za60 za60Var = za60.a;
                        if (z11) {
                            m4mVar = new m4m(((avj0) zuj0Var).h(kyh0.common_done), r4m.c(paymentMethodChooserUIState$ShowAddCardAtBottomConfig), r4m.b(paymentMethodChooserUIState$ShowAddCardAtBottomConfig), za60Var, r4m.a(jfa0Var3));
                        } else if (k4mVar3 instanceof c4m) {
                            c4m c4mVar = (c4m) k4mVar3;
                            String c = c4mVar.c();
                            if (c == null) {
                                c = ((avj0) zuj0Var).h(kyh0.common_done);
                            }
                            String str5 = c;
                            kdc d = c4mVar.d();
                            if (d == null) {
                                d = r4m.c(paymentMethodChooserUIState$ShowAddCardAtBottomConfig);
                            }
                            kdc kdcVar = d;
                            kdc a = c4mVar.a();
                            if (a == null) {
                                a = r4m.b(paymentMethodChooserUIState$ShowAddCardAtBottomConfig);
                            }
                            kdc kdcVar2 = a;
                            ?? b = c4mVar.b();
                            m4mVar = new m4m(str5, kdcVar, kdcVar2, b == 0 ? za60Var : b, r4m.a(jfa0Var3));
                        }
                        return new m4a0(list4, iVar.a.f, paymentMethodChooserUIState$ShowAddCardAtBottomConfig, str3, z10, m4mVar, 32);
                    }
                    m4mVar = l4mVar;
                    return new m4a0(list4, iVar.a.f, paymentMethodChooserUIState$ShowAddCardAtBottomConfig, str3, z10, m4mVar, 32);
                }
                z2 = paymentMethodsConverter$convertWithNormalMode$1.Z$1;
                z3 = paymentMethodsConverter$convertWithNormalMode$1.Z$0;
                list = (List) paymentMethodsConverter$convertWithNormalMode$1.L$3;
                k4mVar2 = (k4m) paymentMethodsConverter$convertWithNormalMode$1.L$2;
                str2 = (String) paymentMethodsConverter$convertWithNormalMode$1.L$1;
                jfa0Var2 = (jfa0) paymentMethodsConverter$convertWithNormalMode$1.L$0;
                kotlin.b.b(obj);
                PaymentMethodChooserUIState$ShowAddCardAtBottomConfig paymentMethodChooserUIState$ShowAddCardAtBottomConfig3 = (PaymentMethodChooserUIState$ShowAddCardAtBottomConfig) obj;
                List b2 = u9a0Var.b(list, jfa0Var2.b);
                if (!list.isEmpty()) {
                    jst.e.r("unsorted payment options present", new IllegalStateException());
                }
                rhq0 rhq0Var = jfa0Var2.b;
                paymentMethodsConverter$convertWithNormalMode$1.L$0 = jfa0Var2;
                paymentMethodsConverter$convertWithNormalMode$1.L$1 = str2;
                paymentMethodsConverter$convertWithNormalMode$1.L$2 = k4mVar2;
                paymentMethodsConverter$convertWithNormalMode$1.L$3 = null;
                paymentMethodsConverter$convertWithNormalMode$1.L$4 = paymentMethodChooserUIState$ShowAddCardAtBottomConfig3;
                paymentMethodsConverter$convertWithNormalMode$1.L$5 = null;
                paymentMethodsConverter$convertWithNormalMode$1.Z$0 = z3;
                paymentMethodsConverter$convertWithNormalMode$1.Z$1 = z2;
                paymentMethodsConverter$convertWithNormalMode$1.label = 2;
                e = iVar.e(b2, rhq0Var, paymentMethodsConverter$convertWithNormalMode$1);
                if (e != coroutineSingletons) {
                    paymentMethodChooserUIState$ShowAddCardAtBottomConfig = paymentMethodChooserUIState$ShowAddCardAtBottomConfig3;
                    k4mVar3 = k4mVar2;
                    str3 = str2;
                    jfa0Var3 = jfa0Var2;
                    obj = e;
                    boolean z102 = z2;
                    List list42 = (List) obj;
                    r4m r4mVar2 = iVar.g;
                    s9a0 s9a0Var2 = iVar.a;
                    zuj0 zuj0Var2 = r4mVar2.a;
                    z6 = s9a0Var2.k;
                    l4m l4mVar2 = l4m.a;
                    if (!z6) {
                    }
                    m4mVar = l4mVar2;
                    return new m4a0(list42, iVar.a.f, paymentMethodChooserUIState$ShowAddCardAtBottomConfig, str3, z102, m4mVar, 32);
                }
                return coroutineSingletons;
            }
        }
        paymentMethodsConverter$convertWithNormalMode$1 = new PaymentMethodsConverter$convertWithNormalMode$1(iVar, continuationImpl);
        Object obj2 = paymentMethodsConverter$convertWithNormalMode$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsConverter$convertWithNormalMode$1.label;
        if (i != 0) {
        }
        PaymentMethodChooserUIState$ShowAddCardAtBottomConfig paymentMethodChooserUIState$ShowAddCardAtBottomConfig32 = (PaymentMethodChooserUIState$ShowAddCardAtBottomConfig) obj2;
        List b22 = u9a0Var.b(list, jfa0Var2.b);
        if (!list.isEmpty()) {
        }
        rhq0 rhq0Var2 = jfa0Var2.b;
        paymentMethodsConverter$convertWithNormalMode$1.L$0 = jfa0Var2;
        paymentMethodsConverter$convertWithNormalMode$1.L$1 = str2;
        paymentMethodsConverter$convertWithNormalMode$1.L$2 = k4mVar2;
        paymentMethodsConverter$convertWithNormalMode$1.L$3 = null;
        paymentMethodsConverter$convertWithNormalMode$1.L$4 = paymentMethodChooserUIState$ShowAddCardAtBottomConfig32;
        paymentMethodsConverter$convertWithNormalMode$1.L$5 = null;
        paymentMethodsConverter$convertWithNormalMode$1.Z$0 = z3;
        paymentMethodsConverter$convertWithNormalMode$1.Z$1 = z2;
        paymentMethodsConverter$convertWithNormalMode$1.label = 2;
        e = iVar.e(b22, rhq0Var2, paymentMethodsConverter$convertWithNormalMode$1);
        if (e != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
    
        if (r2 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
    
        if (r12 == 0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2, types: [s65] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00df -> B:10:0x00e6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, boolean z, rhq0 rhq0Var, tls tlsVar, ContinuationImpl continuationImpl) {
        PaymentMethodsConverter$convertOptionsSectionToViewModels$1 paymentMethodsConverter$convertOptionsSectionToViewModels$1;
        int i;
        rhq0 rhq0Var2;
        ArrayList t;
        PaymentMethodsConverter$convertOptionsSectionToViewModels$1 paymentMethodsConverter$convertOptionsSectionToViewModels$12;
        Iterator it;
        int i2;
        List list2;
        boolean z2;
        tls tlsVar2;
        int i3;
        if (continuationImpl instanceof PaymentMethodsConverter$convertOptionsSectionToViewModels$1) {
            paymentMethodsConverter$convertOptionsSectionToViewModels$1 = (PaymentMethodsConverter$convertOptionsSectionToViewModels$1) continuationImpl;
            int i4 = paymentMethodsConverter$convertOptionsSectionToViewModels$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                paymentMethodsConverter$convertOptionsSectionToViewModels$1.label = i4 - Integer.MIN_VALUE;
                Object obj = paymentMethodsConverter$convertOptionsSectionToViewModels$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsConverter$convertOptionsSectionToViewModels$1.label;
                int i5 = 1;
                if (i != 0) {
                    rhq0Var2 = rhq0Var;
                    t = g8e.t(obj);
                    paymentMethodsConverter$convertOptionsSectionToViewModels$12 = paymentMethodsConverter$convertOptionsSectionToViewModels$1;
                    it = list.iterator();
                    i2 = 0;
                    list2 = list;
                    z2 = z;
                    tlsVar2 = tlsVar;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i6 = paymentMethodsConverter$convertOptionsSectionToViewModels$1.I$0;
                    boolean z3 = paymentMethodsConverter$convertOptionsSectionToViewModels$1.Z$0;
                    Iterator it2 = (Iterator) paymentMethodsConverter$convertOptionsSectionToViewModels$1.L$5;
                    ?? r10 = (List) paymentMethodsConverter$convertOptionsSectionToViewModels$1.L$3;
                    tls tlsVar3 = (tls) paymentMethodsConverter$convertOptionsSectionToViewModels$1.L$2;
                    rhq0 rhq0Var3 = (rhq0) paymentMethodsConverter$convertOptionsSectionToViewModels$1.L$1;
                    List list3 = (List) paymentMethodsConverter$convertOptionsSectionToViewModels$1.L$0;
                    kotlin.b.b(obj);
                    int i7 = 1;
                    it = it2;
                    t = r10;
                    rhq0Var2 = rhq0Var3;
                    PaymentMethodsConverter$convertOptionsSectionToViewModels$1 paymentMethodsConverter$convertOptionsSectionToViewModels$13 = paymentMethodsConverter$convertOptionsSectionToViewModels$1;
                    z2 = z3;
                    i2 = i6;
                    tlsVar2 = tlsVar3;
                    g6a0 g6a0Var = (g6a0) obj;
                    if (g6a0Var != null) {
                        t.add(g6a0Var);
                    }
                    list2 = list3;
                    paymentMethodsConverter$convertOptionsSectionToViewModels$12 = paymentMethodsConverter$convertOptionsSectionToViewModels$13;
                    i5 = i7;
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i8 = i2 + 1;
                        if (i2 < 0) {
                            scc.m();
                            throw null;
                        }
                        nea0 nea0Var = (nea0) next;
                        int i9 = i2 == scc.f(list2) ? i5 : 0;
                        int i10 = this.a.g != null ? i5 : 0;
                        if (i10 == 0 && !this.c.a()) {
                            if (i9 != 0) {
                            }
                            i3 = 1;
                        }
                        bfa0 bfa0Var = (bfa0) tlsVar2.invoke(nea0Var);
                        paymentMethodsConverter$convertOptionsSectionToViewModels$12.L$0 = list2;
                        paymentMethodsConverter$convertOptionsSectionToViewModels$12.L$1 = rhq0Var2;
                        paymentMethodsConverter$convertOptionsSectionToViewModels$12.L$2 = tlsVar2;
                        paymentMethodsConverter$convertOptionsSectionToViewModels$12.L$3 = t;
                        paymentMethodsConverter$convertOptionsSectionToViewModels$12.L$4 = null;
                        paymentMethodsConverter$convertOptionsSectionToViewModels$12.L$5 = it;
                        paymentMethodsConverter$convertOptionsSectionToViewModels$12.L$6 = null;
                        paymentMethodsConverter$convertOptionsSectionToViewModels$12.L$7 = null;
                        paymentMethodsConverter$convertOptionsSectionToViewModels$12.Z$0 = z2;
                        paymentMethodsConverter$convertOptionsSectionToViewModels$12.I$0 = i8;
                        paymentMethodsConverter$convertOptionsSectionToViewModels$12.I$1 = i2;
                        paymentMethodsConverter$convertOptionsSectionToViewModels$12.I$2 = i9;
                        paymentMethodsConverter$convertOptionsSectionToViewModels$12.I$3 = i10;
                        paymentMethodsConverter$convertOptionsSectionToViewModels$12.I$4 = i3;
                        i7 = 1;
                        paymentMethodsConverter$convertOptionsSectionToViewModels$12.label = 1;
                        Object a = this.k.a(nea0Var, rhq0Var2, i3, bfa0Var, paymentMethodsConverter$convertOptionsSectionToViewModels$12);
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        PaymentMethodsConverter$convertOptionsSectionToViewModels$1 paymentMethodsConverter$convertOptionsSectionToViewModels$14 = paymentMethodsConverter$convertOptionsSectionToViewModels$12;
                        list3 = list2;
                        obj = a;
                        i2 = i8;
                        paymentMethodsConverter$convertOptionsSectionToViewModels$13 = paymentMethodsConverter$convertOptionsSectionToViewModels$14;
                        g6a0 g6a0Var2 = (g6a0) obj;
                        if (g6a0Var2 != null) {
                        }
                        list2 = list3;
                        paymentMethodsConverter$convertOptionsSectionToViewModels$12 = paymentMethodsConverter$convertOptionsSectionToViewModels$13;
                        i5 = i7;
                        if (it.hasNext()) {
                            return t;
                        }
                    }
                }
            }
        }
        paymentMethodsConverter$convertOptionsSectionToViewModels$1 = new PaymentMethodsConverter$convertOptionsSectionToViewModels$1(this, continuationImpl);
        Object obj2 = paymentMethodsConverter$convertOptionsSectionToViewModels$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsConverter$convertOptionsSectionToViewModels$1.label;
        int i52 = 1;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00cb -> B:10:0x00d0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ArrayList arrayList, ContinuationImpl continuationImpl) {
        PaymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$1 paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$1;
        int i;
        List list;
        Iterator it;
        PaymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$1 paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$12;
        int i2;
        if (continuationImpl instanceof PaymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$1) {
            paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$1 = (PaymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$1) continuationImpl;
            int i3 = paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$1.label = i3 - Integer.MIN_VALUE;
                Object obj = paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$1.label;
                if (i != 0) {
                    ArrayList t = g8e.t(obj);
                    if (this.a.h) {
                        t.add(new vca0(((avj0) this.f).h(kyh0.payment_method_deletion_with_orders_unavailable)));
                    }
                    list = t;
                    it = kotlin.collections.a.x0(arrayList, new g()).iterator();
                    paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$12 = paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$1;
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$1.I$0;
                    list = (List) paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$1.L$6;
                    Iterator it2 = (Iterator) paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$1.L$3;
                    List list2 = (List) paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$1.L$1;
                    ?? r8 = (List) paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$1.L$0;
                    kotlin.b.b(obj);
                    i iVar = this;
                    Iterator it3 = it2;
                    paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$12 = paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$1;
                    i2 = i4;
                    arrayList = r8;
                    list.addAll((Collection) obj);
                    it = it3;
                    this = iVar;
                    list = list2;
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i5 = i2 + 1;
                        if (i2 < 0) {
                            scc.m();
                            throw null;
                        }
                        d dVar = (d) next;
                        if (i2 > 0) {
                            list.add(new o2u(dVar.c));
                        }
                        List list3 = dVar.b;
                        boolean z = i2 == scc.f(arrayList);
                        u290 u290Var = new u290(19, this);
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$12.L$0 = arrayList;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$12.L$1 = list;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$12.L$2 = null;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$12.L$3 = it;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$12.L$4 = null;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$12.L$5 = null;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$12.L$6 = list;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$12.I$0 = i5;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$12.I$1 = i2;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$12.label = 1;
                        iVar = this;
                        Object c = iVar.c(list3, z, null, u290Var, paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$12);
                        if (c == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        Iterator it4 = it;
                        obj = c;
                        it3 = it4;
                        list2 = list;
                        i2 = i5;
                        list.addAll((Collection) obj);
                        it = it3;
                        this = iVar;
                        list = list2;
                        if (it.hasNext()) {
                            return list;
                        }
                    }
                }
            }
        }
        paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$1 = new PaymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$1(this, continuationImpl);
        Object obj2 = paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsConverter$convertPaymentSectionsToViewModelsEditMode$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x043c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03d5  */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.yandex.go.payments.paymentlist.domain.converter.i] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.yandex.go.payments.paymentlist.domain.converter.i] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.yandex.go.payments.paymentlist.domain.converter.i] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x0423 -> B:11:0x0428). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(List list, rhq0 rhq0Var, ContinuationImpl continuationImpl) {
        PaymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1 paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1;
        int i;
        List t;
        Iterator it;
        int i2;
        List list2;
        PaymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1 paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$12;
        rhq0 rhq0Var2;
        int i3;
        int i4;
        d dVar;
        ?? r0;
        char c;
        int i5;
        Object obj;
        String h;
        String a;
        us51 us51Var;
        i iVar;
        PaymentsScreen paymentsScreen;
        List list3;
        PaymentMethodsPromoBannerExperiment.PromoBannerDto promoBannerDto;
        wrr wrrVar;
        String e;
        String g;
        List list4;
        PaymentMethodsPromoBannerExperiment.PromoBannerDto promoBannerDto2;
        List list5;
        rhq0 rhq0Var3;
        int i6;
        int i7;
        i iVar2;
        k9a0 k9a0Var;
        i iVar3 = this;
        if (continuationImpl instanceof PaymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1) {
            paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1 = (PaymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1) continuationImpl;
            int i8 = paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1.label = i8 - Integer.MIN_VALUE;
                Object obj2 = paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1.label;
                u9a0 u9a0Var = iVar3.l;
                int i9 = 1;
                wrr wrrVar2 = null;
                if (i != 0) {
                    t = g8e.t(obj2);
                    it = kotlin.collections.a.x0(list, new h()).iterator();
                    i2 = 0;
                    list2 = list;
                    paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$12 = paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1;
                    rhq0Var2 = rhq0Var;
                    r0 = iVar3;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i == 1) {
                        i7 = paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1.I$1;
                        i6 = paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1.I$0;
                        dVar = (d) paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1.L$6;
                        it = (Iterator) paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1.L$4;
                        t = (List) paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1.L$2;
                        rhq0Var3 = (rhq0) paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1.L$1;
                        list5 = (List) paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1.L$0;
                        kotlin.b.b(obj2);
                        iVar2 = iVar3;
                        k9a0Var = (k9a0) obj2;
                        if (k9a0Var != null) {
                        }
                        int i10 = i7;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$12 = paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1;
                        rhq0Var2 = rhq0Var3;
                        i4 = i6;
                        i2 = i10;
                        list2 = list5;
                        iVar = iVar2;
                        paymentsScreen = iVar.a.c;
                        com.yandex.go.payments.promo.c cVar = iVar.h;
                        ada0 ada0Var = cVar.a;
                        if (paymentsScreen != null) {
                        }
                        if (wrrVar != null) {
                        }
                        list2 = list3;
                        r0 = iVar;
                        if (i2 > 0) {
                        }
                        if (u9a0Var.a()) {
                        }
                        if (list2.size() != 1) {
                        }
                        if (r0.a.g != null) {
                            PaymentMethodsConverter$PaymentOptionGroupType paymentMethodsConverter$PaymentOptionGroupType = dVar.a;
                            String str = dVar.c;
                            i5 = f.b[paymentMethodsConverter$PaymentOptionGroupType.ordinal()];
                            zuj0 zuj0Var = r0.f;
                            if (i5 == 1) {
                            }
                        }
                        obj = null;
                        i3 = 1;
                        if (obj != null) {
                        }
                        uba0 uba0Var = r0.d;
                        if (uba0Var != null) {
                        }
                        if (r8 == null) {
                        }
                        if (a != null) {
                        }
                        List list6 = list2;
                        d dVar2 = dVar;
                        PaymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1 paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$13 = paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$12;
                        rhq0 rhq0Var4 = rhq0Var2;
                        List list7 = dVar2.b;
                        if (i2 == scc.f(list6)) {
                        }
                        PaymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$3$4 paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$3$4 = new PaymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$3$4(1, r0.k, s65.class, "getPaymentOptionAvailability", "getPaymentOptionAvailability(Lcom/yandex/go/payments/payment/PaymentModelAvailabilityWrapper;)Lcom/yandex/go/payments/paymentlist/domain/PaymentOptionAvailability;", 0);
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$13.L$0 = list6;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$13.L$1 = rhq0Var4;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$13.L$2 = t;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$13.L$3 = null;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$13.L$4 = it;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$13.L$5 = null;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$13.L$6 = null;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$13.L$7 = t;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$13.I$0 = i4;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$13.I$1 = i2;
                        c = 2;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$13.label = 2;
                        obj2 = r0.c(list7, r2, rhq0Var4, paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$3$4, paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$13);
                        if (obj2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i11 = paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1.I$0;
                    List list8 = (List) paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1.L$7;
                    Iterator it2 = (Iterator) paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1.L$4;
                    List list9 = (List) paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1.L$2;
                    rhq0 rhq0Var5 = (rhq0) paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1.L$1;
                    List list10 = (List) paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1.L$0;
                    kotlin.b.b(obj2);
                    int i12 = i11;
                    c = 2;
                    i3 = 1;
                    paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$12 = paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1;
                    rhq0Var2 = rhq0Var5;
                    t = list9;
                    it = it2;
                    list8.addAll((Collection) obj2);
                    i2 = i12;
                    list2 = list10;
                    i9 = i3;
                    wrrVar2 = null;
                    r0 = this;
                    if (it.hasNext()) {
                        Object next = it.next();
                        i4 = i2 + 1;
                        if (i2 < 0) {
                            scc.m();
                            throw null;
                        }
                        dVar = (d) next;
                        PaymentMethodsConfig$OpenReason paymentMethodsConfig$OpenReason = r0.a.e;
                        r0 = r0;
                        if (paymentMethodsConfig$OpenReason != PaymentMethodsConfig$OpenReason.PREORDER) {
                            i3 = i9;
                            List list62 = list2;
                            d dVar22 = dVar;
                            PaymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1 paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$132 = paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$12;
                            rhq0 rhq0Var42 = rhq0Var2;
                            List list72 = dVar22.b;
                            ?? r2 = i2 == scc.f(list62) ? i3 : 0;
                            PaymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$3$4 paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$3$42 = new PaymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$3$4(1, r0.k, s65.class, "getPaymentOptionAvailability", "getPaymentOptionAvailability(Lcom/yandex/go/payments/payment/PaymentModelAvailabilityWrapper;)Lcom/yandex/go/payments/paymentlist/domain/PaymentOptionAvailability;", 0);
                            paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$132.L$0 = list62;
                            paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$132.L$1 = rhq0Var42;
                            paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$132.L$2 = t;
                            paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$132.L$3 = null;
                            paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$132.L$4 = it;
                            paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$132.L$5 = null;
                            paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$132.L$6 = null;
                            paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$132.L$7 = t;
                            paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$132.I$0 = i4;
                            paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$132.I$1 = i2;
                            c = 2;
                            paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$132.label = 2;
                            obj2 = r0.c(list72, r2, rhq0Var42, paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$3$42, paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$132);
                            if (obj2 != coroutineSingletons) {
                                rhq0Var2 = rhq0Var42;
                                paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$12 = paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$132;
                                list8 = t;
                                i12 = i4;
                                list10 = list62;
                                list8.addAll((Collection) obj2);
                                i2 = i12;
                                list2 = list10;
                                i9 = i3;
                                wrrVar2 = null;
                                r0 = this;
                                if (it.hasNext()) {
                                    return t;
                                }
                            }
                            return coroutineSingletons;
                        }
                        if (i2 == 0) {
                            iVar = r0;
                            if (u9a0Var.a()) {
                                paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$12.L$0 = list2;
                                paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$12.L$1 = rhq0Var2;
                                paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$12.L$2 = t;
                                paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$12.L$3 = wrrVar2;
                                paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$12.L$4 = it;
                                paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$12.L$5 = wrrVar2;
                                paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$12.L$6 = dVar;
                                paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$12.L$7 = wrrVar2;
                                paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$12.I$0 = i4;
                                paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$12.I$1 = i2;
                                paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$12.label = i9;
                                Object b = r0.k.b(paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$12);
                                if (b != coroutineSingletons) {
                                    rhq0Var3 = rhq0Var2;
                                    paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1 = paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$12;
                                    i7 = i2;
                                    i6 = i4;
                                    list5 = list2;
                                    obj2 = b;
                                    iVar2 = r0;
                                    k9a0Var = (k9a0) obj2;
                                    if (k9a0Var != null) {
                                        t.add(gm10.a(k9a0Var));
                                    }
                                    int i102 = i7;
                                    paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$12 = paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1;
                                    rhq0Var2 = rhq0Var3;
                                    i4 = i6;
                                    i2 = i102;
                                    list2 = list5;
                                    iVar = iVar2;
                                }
                                return coroutineSingletons;
                            }
                            paymentsScreen = iVar.a.c;
                            com.yandex.go.payments.promo.c cVar2 = iVar.h;
                            ada0 ada0Var2 = cVar2.a;
                            if (paymentsScreen != null) {
                                list3 = list2;
                                wrrVar = wrrVar2;
                            } else {
                                String lowerCase = paymentsScreen.getOpenReason().toLowerCase(Locale.ROOT);
                                PaymentMethodsPromoBannerExperiment paymentMethodsPromoBannerExperiment = (PaymentMethodsPromoBannerExperiment) ((en11) ada0Var2.a.getValue()).b();
                                if (!paymentMethodsPromoBannerExperiment.b || (list4 = paymentMethodsPromoBannerExperiment.c) == null) {
                                    list3 = list2;
                                    promoBannerDto = null;
                                } else {
                                    Iterator it3 = list4.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            list3 = list2;
                                            promoBannerDto2 = 0;
                                            break;
                                        }
                                        promoBannerDto2 = it3.next();
                                        list3 = list2;
                                        if (((PaymentMethodsPromoBannerExperiment.PromoBannerDto) promoBannerDto2).getC().contains(lowerCase)) {
                                            break;
                                        }
                                        list2 = list3;
                                    }
                                    promoBannerDto = promoBannerDto2;
                                }
                                if (promoBannerDto != null) {
                                    com.yandex.go.payments.promo.d dVar3 = cVar2.b;
                                    Map map = ada0Var2.b;
                                    pdc pdcVar = dVar3.a;
                                    if (!evu0.J(promoBannerDto.getA()) && !evu0.J(promoBannerDto.getE())) {
                                        String a2 = promoBannerDto.getA();
                                        PaymentMethodsPromoBannerExperiment.PromoBannerDto promoBannerDto3 = promoBannerDto;
                                        ufu ufuVar = (ufu) pdcVar;
                                        kdc h2 = ufuVar.h(new bdc(xng0.bgMain), promoBannerDto.getD());
                                        String f = promoBannerDto3.getF();
                                        if (f == null || (e = (String) map.get(f)) == null) {
                                            e = promoBannerDto3.getE();
                                        }
                                        String str2 = e;
                                        String h3 = promoBannerDto3.getH();
                                        String str3 = ((h3 == null || (g = (String) map.get(h3)) == null) && ((g = promoBannerDto3.getG()) == null || evu0.J(g))) ? null : g;
                                        kdc h4 = ufuVar.h(new bdc(xng0.textMain), promoBannerDto3.getI());
                                        String j = promoBannerDto3.getJ();
                                        String a3 = j != null ? ((m7x0) dVar3.b).a(j) : null;
                                        String k = promoBannerDto3.getK();
                                        wrrVar = new wrr(a2, h2, str2, str3, h4, a3, (k == null || evu0.J(k)) ? null : k, 18);
                                    }
                                }
                                wrrVar = null;
                            }
                            if (wrrVar != null) {
                                t.add(cf91.c(wrrVar));
                            }
                            list2 = list3;
                            r0 = iVar;
                        }
                        if (i2 > 0) {
                            t.add(new o2u(dVar.c));
                        }
                        if (u9a0Var.a() || i2 > 0) {
                            boolean z = list2.size() != 1;
                            if (r0.a.g != null && (!z || dVar.a == PaymentMethodsConverter$PaymentOptionGroupType.YB)) {
                                PaymentMethodsConverter$PaymentOptionGroupType paymentMethodsConverter$PaymentOptionGroupType2 = dVar.a;
                                String str4 = dVar.c;
                                i5 = f.b[paymentMethodsConverter$PaymentOptionGroupType2.ordinal()];
                                zuj0 zuj0Var2 = r0.f;
                                if (i5 == 1) {
                                    List list11 = dVar.b;
                                    if (list11.isEmpty() || dVar.a != PaymentMethodsConverter$PaymentOptionGroupType.SELECTED_OPTION_UNAVAILABLE) {
                                        i3 = 1;
                                    } else {
                                        nea0 nea0Var = (nea0) kotlin.collections.a.R(list11);
                                        u0k u0kVar = nea0Var != null ? nea0Var.a : null;
                                        boolean z2 = (u0kVar instanceof h8b0) || (u0kVar instanceof wxc);
                                        i3 = 1;
                                        if (list11.size() > 1 || nea0Var == null || !z2) {
                                            obj = new vca0(((avj0) zuj0Var2).h(kyh0.payment_methods_invalid_payment_select_other_payment));
                                        } else {
                                            bw90 bw90Var = nea0Var.b;
                                            if (!jl40.l(bw90Var, xw91.C)) {
                                                if (bw90Var instanceof zv90) {
                                                    h = ((zv90) bw90Var).a();
                                                    if (h == null) {
                                                        h = ((avj0) zuj0Var2).h(kyh0.payment_methods_invalid_payment_select_other_payment);
                                                    }
                                                } else {
                                                    h = !jl40.l(bw90Var, h2b1.K) ? bw90Var instanceof aw90 ? ((avj0) zuj0Var2).h(kyh0.payment_methods_invalid_payment_plus_unavailable_in_tariff) : ((avj0) zuj0Var2).h(kyh0.payment_methods_invalid_payment_select_other_payment) : ((avj0) zuj0Var2).h(kyh0.payment_methods_invalid_payment_plus_unavailable);
                                                }
                                                obj = new vca0(h);
                                            }
                                        }
                                        if (obj != null) {
                                            t.add(obj);
                                        }
                                    }
                                    obj = null;
                                    if (obj != null) {
                                    }
                                } else {
                                    if (i5 == 3) {
                                        kjz kjzVar = r0.a.g;
                                        if ((kjzVar != null ? (saa0) kjzVar.b : null) != null) {
                                            saa0 saa0Var = (saa0) kjzVar.b;
                                            r8 r8Var = (r8) kjzVar.c;
                                            obj = new q2u(null, saa0Var, r8Var, new fvc(new Object[]{g8e.o("GroupHeader-", str4), saa0Var, r8Var}));
                                        } else {
                                            String h5 = ((avj0) zuj0Var2).h(kyh0.payment_methods_list_cards_and_tokens_title);
                                            obj = new q2u(h5, null, kjzVar != null ? (r8) kjzVar.c : null, new fvc(new Object[]{g8e.o("GroupHeader-", str4), h5}));
                                        }
                                    } else if (i5 == 4) {
                                        String h6 = ((avj0) zuj0Var2).h(kyh0.settings_tips);
                                        obj = new q2u(h6, null, null, new fvc(new Object[]{g8e.o("GroupHeader-", str4), h6}));
                                    } else if (i5 == 5) {
                                        String h7 = ((avj0) zuj0Var2).h(kyh0.payment_methods_list_others_group_title);
                                        obj = new q2u(h7, null, null, new fvc(new Object[]{g8e.o("GroupHeader-", str4), h7}));
                                    } else if (i5 == 6) {
                                        String h8 = ((avj0) zuj0Var2).h(kyh0.payment_methods_list_business_accounts_group_title);
                                        obj = new q2u(h8, null, null, new fvc(new Object[]{g8e.o("GroupHeader-", str4), h8}));
                                    } else if (i5 == 7) {
                                        String h9 = ((avj0) zuj0Var2).h(kyh0.payment_methods_unavailable_group_title);
                                        obj = new q2u(h9, null, null, new fvc(new Object[]{g8e.o("GroupHeader-", str4), h9}));
                                    }
                                    i3 = 1;
                                    if (obj != null) {
                                    }
                                }
                            }
                            obj = null;
                            i3 = 1;
                            if (obj != null) {
                            }
                        } else {
                            i3 = 1;
                        }
                        uba0 uba0Var2 = r0.d;
                        ts51 g2 = (uba0Var2 != null || (us51Var = uba0Var2.b) == null) ? null : ((uk10) us51Var).g();
                        a = g2 == null ? g2.a() : null;
                        if (a != null) {
                            t.add(new vca0(a));
                        }
                        List list622 = list2;
                        d dVar222 = dVar;
                        PaymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1 paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1322 = paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$12;
                        rhq0 rhq0Var422 = rhq0Var2;
                        List list722 = dVar222.b;
                        if (i2 == scc.f(list622)) {
                        }
                        PaymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$3$4 paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$3$422 = new PaymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$3$4(1, r0.k, s65.class, "getPaymentOptionAvailability", "getPaymentOptionAvailability(Lcom/yandex/go/payments/payment/PaymentModelAvailabilityWrapper;)Lcom/yandex/go/payments/paymentlist/domain/PaymentOptionAvailability;", 0);
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1322.L$0 = list622;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1322.L$1 = rhq0Var422;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1322.L$2 = t;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1322.L$3 = null;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1322.L$4 = it;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1322.L$5 = null;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1322.L$6 = null;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1322.L$7 = t;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1322.I$0 = i4;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1322.I$1 = i2;
                        c = 2;
                        paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1322.label = 2;
                        obj2 = r0.c(list722, r2, rhq0Var422, paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$3$422, paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1322);
                        if (obj2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                }
            }
        }
        paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1 = new PaymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1(iVar3, continuationImpl);
        Object obj22 = paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsConverter$convertPaymentSectionsToViewModelsNormalMode$1.label;
        u9a0 u9a0Var2 = iVar3.l;
        int i92 = 1;
        wrr wrrVar22 = null;
        if (i != 0) {
        }
    }

    public final ArrayList f(List list) {
        Object obj;
        ListBuilder a = rcc.a();
        for (Object obj2 : list) {
            if (((nea0) obj2).a instanceof wxc) {
                a.add(obj2);
            }
        }
        list.removeAll(a);
        ListBuilder j = a.j();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = j.listIterator(0);
        while (true) {
            qqy qqyVar = (qqy) listIterator;
            if (!qqyVar.hasNext()) {
                return arrayList;
            }
            Object next = qqyVar.next();
            nea0 nea0Var = (nea0) next;
            Iterator it = this.i.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((evz) obj).getId(), vez0.E(nea0Var.a))) {
                    break;
                }
            }
            if (hashSet.add(Boolean.valueOf(obj == null))) {
                arrayList.add(next);
            }
        }
    }

    public final List g(List list, PaymentMethodsConverter$ConvertMode paymentMethodsConverter$ConvertMode) {
        s65 s65Var;
        boolean e;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            s65Var = this.k;
            if (!hasNext) {
                break;
            }
            Object next = it.next();
            nea0 nea0Var = (nea0) next;
            u0k u0kVar = nea0Var.a;
            if ((u0kVar instanceof qgx) || (u0kVar instanceof p1c) || (u0kVar instanceof vbn) || (u0kVar instanceof v7x)) {
                if (s65Var.e(nea0Var)) {
                    arrayList.add(next);
                }
            }
        }
        list.removeAll(arrayList);
        List list2 = list;
        for (Object obj : list2) {
            nea0 nea0Var2 = (nea0) obj;
            u0k u0kVar2 = nea0Var2.a;
            if ((u0kVar2 instanceof ivt) || (u0kVar2 instanceof u19) || (u0kVar2 instanceof t19)) {
                e = s65Var.e(nea0Var2);
            } else {
                e = false;
                if (!(u0kVar2 instanceof h8b0) && (paymentMethodsConverter$ConvertMode == PaymentMethodsConverter$ConvertMode.EDIT || jl40.l(nea0Var2.b, xw91.C))) {
                    e = true;
                }
            }
            if (e) {
                arrayList.add(obj);
            }
        }
        list.removeAll(arrayList);
        if (!list.isEmpty()) {
            String X = kotlin.collections.a.X(list2, null, null, null, new qz10(18), 31);
            jst.e.r("unsorted payment options present,\n".concat(X), new IllegalStateException());
            for (Object obj2 : list2) {
                arrayList.add(obj2);
            }
            list.removeAll(arrayList);
        }
        return kotlin.collections.a.J0(arrayList);
    }

    public final d h(PaymentMethodsConverter$PaymentOptionGroupType paymentMethodsConverter$PaymentOptionGroupType, List list, rhq0 rhq0Var) {
        edi0 edi0Var;
        edi0 edi0Var2;
        edi0 edi0Var3;
        int i = f.b[paymentMethodsConverter$PaymentOptionGroupType.ordinal()];
        s65 s65Var = this.k;
        List list2 = EmptyList.a;
        List list3 = list2;
        switch (i) {
            case 1:
                list3 = list2;
                if (this.a.c != PaymentsScreen.MENU) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        zea0 zea0Var = zea0.a;
                        if (!hasNext) {
                            list.removeAll(arrayList);
                            List list4 = list;
                            for (Object obj : list4) {
                                nea0 nea0Var = (nea0) obj;
                                u0k u0kVar = nea0Var.a;
                                if (u0kVar instanceof wxc) {
                                    if (jl40.l(vez0.E(u0kVar), (rhq0Var == null || (edi0Var2 = rhq0Var.b) == null) ? null : edi0Var2.a.getId()) && !s65Var.c(nea0Var).equals(zea0Var)) {
                                        arrayList.add(obj);
                                    }
                                }
                            }
                            list.removeAll(arrayList);
                            for (Object obj2 : list4) {
                                nea0 nea0Var2 = (nea0) obj2;
                                if (jl40.l(vez0.E(nea0Var2.a), (rhq0Var == null || (edi0Var = rhq0Var.a) == null) ? null : edi0Var.a.getId()) && (!jl40.l(nea0Var2.b, xw91.C) || !s65Var.c(nea0Var2).equals(zea0Var))) {
                                    arrayList.add(obj2);
                                }
                            }
                            list.removeAll(arrayList);
                            list3 = kotlin.collections.a.J0(arrayList);
                            break;
                        } else {
                            Object next = it.next();
                            nea0 nea0Var3 = (nea0) next;
                            u0k u0kVar2 = nea0Var3.a;
                            if (u0kVar2 instanceof h8b0) {
                                if (jl40.l(vez0.E(u0kVar2), (rhq0Var == null || (edi0Var3 = rhq0Var.b) == null) ? null : edi0Var3.a.getId()) && !s65Var.c(nea0Var3).equals(zea0Var)) {
                                    arrayList.add(next);
                                }
                            }
                        }
                    }
                }
                break;
            case 2:
                list3 = f(list);
                break;
            case 3:
                list3 = j(list);
                break;
            case 4:
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (((nea0) obj3).a instanceof ogz0) {
                        arrayList2.add(obj3);
                    }
                }
                list.removeAll(arrayList2);
                list3 = arrayList2;
                break;
            case 5:
                list3 = g(list, PaymentMethodsConverter$ConvertMode.NORMAL);
                break;
            case 6:
                list3 = i(list, PaymentMethodsConverter$ConvertMode.NORMAL);
                break;
            case 7:
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    nea0 nea0Var4 = (nea0) obj4;
                    u0k u0kVar3 = nea0Var4.a;
                    if (((u0kVar3 instanceof fl8) && ((fl8) u0kVar3).h) || (((u0kVar3 instanceof snr0) && !((snr0) u0kVar3).i()) || (!(u0kVar3 instanceof ogz0) && !(u0kVar3 instanceof h8b0) && !(u0kVar3 instanceof jo51) && !(u0kVar3 instanceof wxc) && !s65Var.e(nea0Var4)))) {
                        arrayList3.add(obj4);
                    }
                }
                list.removeAll(arrayList3);
                list3 = kotlin.collections.a.J0(arrayList3);
                break;
            case 8:
            case 9:
                break;
            default:
                w511.b();
                return null;
        }
        if (list3.isEmpty()) {
            return null;
        }
        return new d(paymentMethodsConverter$PaymentOptionGroupType, list3);
    }

    public final List i(List list, PaymentMethodsConverter$ConvertMode paymentMethodsConverter$ConvertMode) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            nea0 nea0Var = (nea0) next;
            u0k u0kVar = nea0Var.a;
            snr0 snr0Var = u0kVar instanceof snr0 ? (snr0) u0kVar : null;
            if (snr0Var != null && snr0Var.h() != SharedAccountType.FAMILY && (paymentMethodsConverter$ConvertMode == PaymentMethodsConverter$ConvertMode.EDIT || this.k.e(nea0Var))) {
                arrayList.add(next);
            }
        }
        list.removeAll(arrayList);
        List list2 = list;
        for (Object obj : list2) {
            u0k u0kVar2 = ((nea0) obj).a;
            nj0 nj0Var = u0kVar2 instanceof nj0 ? (nj0) u0kVar2 : null;
            if (nj0Var != null && nj0Var.b.a() != SharedAccountType.FAMILY) {
                arrayList.add(obj);
            }
        }
        list.removeAll(arrayList);
        for (Object obj2 : list2) {
            if (((nea0) obj2).a instanceof jve) {
                arrayList.add(obj2);
            }
        }
        list.removeAll(arrayList);
        for (Object obj3 : list2) {
            if (((nea0) obj3).a instanceof yhi) {
                arrayList.add(obj3);
            }
        }
        list.removeAll(arrayList);
        for (Object obj4 : list2) {
            if (((nea0) obj4).a instanceof of0) {
                arrayList.add(obj4);
            }
        }
        list.removeAll(arrayList);
        return kotlin.collections.a.J0(arrayList);
    }

    public final ArrayList j(List list) {
        s65 s65Var;
        u9a0 u9a0Var;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((nea0) obj).a instanceof h8b0) {
                arrayList.add(obj);
            }
        }
        list.removeAll(arrayList);
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            s65Var = this.k;
            if (!hasNext) {
                break;
            }
            Object next = it.next();
            nea0 nea0Var = (nea0) next;
            if ((nea0Var.a instanceof cfm0) && s65Var.e(nea0Var)) {
                arrayList.add(next);
            }
        }
        list.removeAll(arrayList);
        for (Object obj2 : list2) {
            if (((nea0) obj2).a instanceof yy51) {
                arrayList.add(obj2);
            }
        }
        list.removeAll(arrayList);
        for (Object obj3 : list2) {
            if (((nea0) obj3).a instanceof nk0) {
                arrayList.add(obj3);
            }
        }
        list.removeAll(arrayList);
        for (Object obj4 : list2) {
            if (((nea0) obj4).a instanceof jo51) {
                arrayList.add(obj4);
            }
        }
        list.removeAll(arrayList);
        Iterator it2 = list2.iterator();
        while (true) {
            boolean hasNext2 = it2.hasNext();
            u9a0Var = this.l;
            if (!hasNext2) {
                break;
            }
            Object next2 = it2.next();
            nea0 nea0Var2 = (nea0) next2;
            if ((nea0Var2.a instanceof bjm0) && s65Var.e(nea0Var2) && !u9a0Var.a()) {
                arrayList.add(next2);
            }
        }
        list.removeAll(arrayList);
        for (Object obj5 : list2) {
            if ((((nea0) obj5).a instanceof mj0) && !u9a0Var.a()) {
                arrayList.add(obj5);
            }
        }
        list.removeAll(arrayList);
        for (Object obj6 : list2) {
            nea0 nea0Var3 = (nea0) obj6;
            if ((nea0Var3.a instanceof p1c) && s65Var.e(nea0Var3)) {
                arrayList.add(obj6);
            }
        }
        list.removeAll(arrayList);
        for (Object obj7 : list2) {
            nea0 nea0Var4 = (nea0) obj7;
            if ((nea0Var4.a instanceof vbn) && s65Var.e(nea0Var4)) {
                arrayList.add(obj7);
            }
        }
        list.removeAll(arrayList);
        for (Object obj8 : list2) {
            nea0 nea0Var5 = (nea0) obj8;
            if ((nea0Var5.a instanceof v7x) && s65Var.e(nea0Var5)) {
                arrayList.add(obj8);
            }
        }
        list.removeAll(arrayList);
        for (Object obj9 : list2) {
            if (((nea0) obj9).a instanceof df0) {
                arrayList.add(obj9);
            }
        }
        list.removeAll(arrayList);
        for (Object obj10 : list2) {
            nea0 nea0Var6 = (nea0) obj10;
            if ((nea0Var6.a instanceof ep51) && s65Var.e(nea0Var6)) {
                arrayList.add(obj10);
            }
        }
        list.removeAll(arrayList);
        for (Object obj11 : list2) {
            if (((nea0) obj11).a instanceof mk0) {
                arrayList.add(obj11);
            }
        }
        list.removeAll(arrayList);
        for (Object obj12 : list2) {
            nea0 nea0Var7 = (nea0) obj12;
            if ((nea0Var7.a instanceof um50) && s65Var.e(nea0Var7)) {
                arrayList.add(obj12);
            }
        }
        list.removeAll(arrayList);
        for (Object obj13 : list2) {
            if (((nea0) obj13).a instanceof bg0) {
                arrayList.add(obj13);
            }
        }
        list.removeAll(arrayList);
        for (Object obj14 : list2) {
            nea0 nea0Var8 = (nea0) obj14;
            if ((nea0Var8.a instanceof a000) && s65Var.e(nea0Var8)) {
                arrayList.add(obj14);
            }
        }
        list.removeAll(arrayList);
        for (Object obj15 : list2) {
            if (((nea0) obj15).a instanceof mf0) {
                arrayList.add(obj15);
            }
        }
        list.removeAll(arrayList);
        for (Object obj16 : list2) {
            nea0 nea0Var9 = (nea0) obj16;
            if ((nea0Var9.a instanceof fl8) && s65Var.e(nea0Var9)) {
                arrayList.add(obj16);
            }
        }
        list.removeAll(arrayList);
        for (Object obj17 : list2) {
            if (((nea0) obj17).a instanceof na0) {
                arrayList.add(obj17);
            }
        }
        list.removeAll(arrayList);
        for (Object obj18 : list2) {
            nea0 nea0Var10 = (nea0) obj18;
            if ((nea0Var10.a instanceof mcp) && s65Var.e(nea0Var10)) {
                arrayList.add(obj18);
            }
        }
        list.removeAll(arrayList);
        for (Object obj19 : list2) {
            if (((nea0) obj19).a instanceof kd0) {
                arrayList.add(obj19);
            }
        }
        list.removeAll(arrayList);
        Iterator it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next3 = it3.next();
            u0k u0kVar = ((nea0) next3).a;
            snr0 snr0Var = u0kVar instanceof snr0 ? (snr0) u0kVar : null;
            if (snr0Var != null && snr0Var.h() == SharedAccountType.FAMILY) {
                arrayList.add(next3);
            }
        }
        list.removeAll(arrayList);
        for (Object obj20 : list2) {
            u0k u0kVar2 = ((nea0) obj20).a;
            nj0 nj0Var = u0kVar2 instanceof nj0 ? (nj0) u0kVar2 : null;
            if (nj0Var != null && nj0Var.b.a() == SharedAccountType.FAMILY) {
                arrayList.add(obj20);
            }
        }
        list.removeAll(arrayList);
        for (Object obj21 : list2) {
            if ((((nea0) obj21).a instanceof ogz0) && !u9a0Var.a()) {
                arrayList.add(obj21);
            }
        }
        list.removeAll(arrayList);
        return arrayList;
    }

    public final String k() {
        boolean a = this.c.a();
        s9a0 s9a0Var = this.a;
        zuj0 zuj0Var = this.f;
        if (a) {
            if (s9a0Var.a) {
                return ((avj0) zuj0Var).h(kyh0.payment_method_edit_title);
            }
            return ((avj0) zuj0Var).h(kyh0.payment_method_deletion_title);
        }
        String str = s9a0Var.j;
        if (str != null) {
            return str;
        }
        return ((avj0) zuj0Var).h(kyh0.summary_payment_method_title);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a1, code lost:
    
        if (r5.b != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(List list, ContinuationImpl continuationImpl) {
        PaymentMethodsConverter$shouldShowAddButtonAtBottom$1 paymentMethodsConverter$shouldShowAddButtonAtBottom$1;
        int i;
        PaymentMethodsAddButtonExperiment paymentMethodsAddButtonExperiment;
        List list2;
        Iterator it;
        s9a0 s9a0Var;
        if (continuationImpl instanceof PaymentMethodsConverter$shouldShowAddButtonAtBottom$1) {
            paymentMethodsConverter$shouldShowAddButtonAtBottom$1 = (PaymentMethodsConverter$shouldShowAddButtonAtBottom$1) continuationImpl;
            int i2 = paymentMethodsConverter$shouldShowAddButtonAtBottom$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsConverter$shouldShowAddButtonAtBottom$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsConverter$shouldShowAddButtonAtBottom$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsConverter$shouldShowAddButtonAtBottom$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    paymentMethodsConverter$shouldShowAddButtonAtBottom$1.L$0 = list;
                    paymentMethodsConverter$shouldShowAddButtonAtBottom$1.label = 1;
                    obj = this.j.b(paymentMethodsConverter$shouldShowAddButtonAtBottom$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) paymentMethodsConverter$shouldShowAddButtonAtBottom$1.L$0;
                    kotlin.b.b(obj);
                }
                paymentMethodsAddButtonExperiment = (PaymentMethodsAddButtonExperiment) obj;
                if (!paymentMethodsAddButtonExperiment.b && this.a.d) {
                    return Boolean.valueOf(paymentMethodsAddButtonExperiment.c == PaymentMethodsAddButtonExperiment.PaymentMethodsAddButtonPosition.FOOTER);
                }
                list2 = list;
                if ((list2 instanceof Collection) || !list2.isEmpty()) {
                    it = list2.iterator();
                    while (it.hasNext()) {
                        u0k u0kVar = ((nea0) it.next()).a;
                        fl8 fl8Var = u0kVar instanceof fl8 ? (fl8) u0kVar : null;
                        if (fl8Var != null && fl8Var.c && !fl8Var.h) {
                            break;
                        }
                    }
                }
                s9a0Var = this.a;
                if (s9a0Var.e != PaymentMethodsConfig$OpenReason.COMPOSITE_PAYMENT) {
                    if (s9a0Var.d) {
                    }
                }
                r4 = false;
                return Boolean.valueOf(r4);
            }
        }
        paymentMethodsConverter$shouldShowAddButtonAtBottom$1 = new PaymentMethodsConverter$shouldShowAddButtonAtBottom$1(this, continuationImpl);
        Object obj2 = paymentMethodsConverter$shouldShowAddButtonAtBottom$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsConverter$shouldShowAddButtonAtBottom$1.label;
        if (i != 0) {
        }
        paymentMethodsAddButtonExperiment = (PaymentMethodsAddButtonExperiment) obj2;
        if (!paymentMethodsAddButtonExperiment.b) {
        }
        list2 = list;
        if (list2 instanceof Collection) {
        }
        it = list2.iterator();
        while (it.hasNext()) {
        }
        s9a0Var = this.a;
        if (s9a0Var.e != PaymentMethodsConfig$OpenReason.COMPOSITE_PAYMENT) {
        }
        r4 = false;
        return Boolean.valueOf(r4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0089, code lost:
    
        if (((java.lang.Boolean) r9).booleanValue() == false) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.yandex.go.payments.paymentlist.domain.converter.i] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum m(ArrayList arrayList, boolean z, ContinuationImpl continuationImpl) {
        PaymentMethodsConverter$showAddCardAtBottom$1 paymentMethodsConverter$showAddCardAtBottom$1;
        int i;
        Object obj;
        ArrayList arrayList2;
        ArrayList arrayList3;
        if (continuationImpl instanceof PaymentMethodsConverter$showAddCardAtBottom$1) {
            paymentMethodsConverter$showAddCardAtBottom$1 = (PaymentMethodsConverter$showAddCardAtBottom$1) continuationImpl;
            int i2 = paymentMethodsConverter$showAddCardAtBottom$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsConverter$showAddCardAtBottom$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = paymentMethodsConverter$showAddCardAtBottom$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsConverter$showAddCardAtBottom$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (this.l.a()) {
                        return PaymentMethodChooserUIState$ShowAddCardAtBottomConfig.GONE;
                    }
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((nea0) obj).a instanceof na0) {
                            break;
                        }
                    }
                    nea0 nea0Var = (nea0) obj;
                    if (nea0Var == null) {
                        return PaymentMethodChooserUIState$ShowAddCardAtBottomConfig.GONE;
                    }
                    arrayList2 = arrayList;
                    if (!jl40.l(nea0Var.b, xw91.C)) {
                        return PaymentMethodChooserUIState$ShowAddCardAtBottomConfig.GONE;
                    }
                    if (!z) {
                        paymentMethodsConverter$showAddCardAtBottom$1.L$0 = arrayList;
                        paymentMethodsConverter$showAddCardAtBottom$1.L$1 = null;
                        paymentMethodsConverter$showAddCardAtBottom$1.Z$0 = z;
                        paymentMethodsConverter$showAddCardAtBottom$1.label = 1;
                        obj2 = l(arrayList, paymentMethodsConverter$showAddCardAtBottom$1);
                        arrayList3 = arrayList;
                        if (obj2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i3 = -1;
                            break;
                        }
                        if (((nea0) it2.next()).a instanceof na0) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 != -1) {
                        arrayList2.remove(i3);
                        return PaymentMethodChooserUIState$ShowAddCardAtBottomConfig.VISIBLE;
                    }
                    return PaymentMethodChooserUIState$ShowAddCardAtBottomConfig.GONE;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ?? r7 = (List) paymentMethodsConverter$showAddCardAtBottom$1.L$0;
                kotlin.b.b(obj2);
                arrayList3 = r7;
                arrayList2 = arrayList3;
            }
        }
        paymentMethodsConverter$showAddCardAtBottom$1 = new PaymentMethodsConverter$showAddCardAtBottom$1(this, continuationImpl);
        Object obj22 = paymentMethodsConverter$showAddCardAtBottom$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsConverter$showAddCardAtBottom$1.label;
        if (i != 0) {
        }
        arrayList2 = arrayList3;
    }

    public final Object n(jfa0 jfa0Var, String str, k4m k4mVar, boolean z, SuspendLambda suspendLambda) {
        this.e.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new PaymentMethodsConverter$toUIState$2(this, jfa0Var, str, k4mVar, z, null), suspendLambda);
    }
}
