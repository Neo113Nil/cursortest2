package com.yandex.go.payments.menu.domain;

import com.yandex.go.payments.api.shared.model.EntryPoints;
import com.yandex.go.payments.api.shared.model.PaymentMenuEntryPoints;
import com.yandex.go.payments.domain.i0;
import com.yandex.go.payments.domain.k0;
import com.yandex.go.yb.api.experiments.YbWalletEntryPointExperiment;
import defpackage.g9a0;
import defpackage.h270;
import defpackage.h8b0;
import defpackage.jbh;
import defpackage.jfa0;
import defpackage.jqr;
import defpackage.lw90;
import defpackage.nea0;
import defpackage.nj0;
import defpackage.nk0;
import defpackage.ny61;
import defpackage.qw6;
import defpackage.rqo;
import defpackage.snr0;
import defpackage.t19;
import defpackage.t1b0;
import defpackage.tmr0;
import defpackage.u0k;
import defpackage.u19;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;

/* loaded from: classes8.dex */
public final class c {
    public final g9a0 a;
    public final i0 b;
    public final lw90 c;
    public final k0 d;
    public final qw6 e;
    public final h270 f = new h270();
    public final t1b0 g;

    public c(rqo rqoVar, g9a0 g9a0Var, i0 i0Var, lw90 lw90Var, k0 k0Var, qw6 qw6Var) {
        this.a = g9a0Var;
        this.b = i0Var;
        this.c = lw90Var;
        this.d = k0Var;
        this.e = qw6Var;
        this.g = ((jbh) rqoVar).e(YbWalletEntryPointExperiment.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.yandex.go.payments.menu.domain.c, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008d -> B:10:0x0090). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, jfa0 jfa0Var, boolean z, ContinuationImpl continuationImpl) {
        MenuPaymentOptionsSourceInteractor$filterOptions$1 menuPaymentOptionsSourceInteractor$filterOptions$1;
        int i;
        ?? arrayList;
        Collection arrayList2;
        Iterator it;
        cVar.getClass();
        if (continuationImpl instanceof MenuPaymentOptionsSourceInteractor$filterOptions$1) {
            menuPaymentOptionsSourceInteractor$filterOptions$1 = (MenuPaymentOptionsSourceInteractor$filterOptions$1) continuationImpl;
            int i2 = menuPaymentOptionsSourceInteractor$filterOptions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                menuPaymentOptionsSourceInteractor$filterOptions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = menuPaymentOptionsSourceInteractor$filterOptions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = menuPaymentOptionsSourceInteractor$filterOptions$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!z) {
                        List list = jfa0Var.a;
                        arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            u0k u0kVar = ((nea0) obj2).a;
                            if (!(u0kVar instanceof nj0) && !(u0kVar instanceof h8b0) && !(u0kVar instanceof u19) && !(u0kVar instanceof snr0) && !(u0kVar instanceof t19)) {
                                arrayList.add(obj2);
                            }
                        }
                        return jfa0.a(jfa0Var, arrayList, null, 6);
                    }
                    List list2 = jfa0Var.a;
                    arrayList2 = new ArrayList();
                    it = list2.iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z2 = menuPaymentOptionsSourceInteractor$filterOptions$1.Z$0;
                    Object obj3 = menuPaymentOptionsSourceInteractor$filterOptions$1.L$5;
                    it = (Iterator) menuPaymentOptionsSourceInteractor$filterOptions$1.L$4;
                    arrayList2 = (Collection) menuPaymentOptionsSourceInteractor$filterOptions$1.L$3;
                    jfa0 jfa0Var2 = (jfa0) menuPaymentOptionsSourceInteractor$filterOptions$1.L$0;
                    kotlin.b.b(obj);
                    boolean z3 = z2;
                    jfa0Var = jfa0Var2;
                    Object b = obj;
                    if (((Boolean) b).booleanValue()) {
                        arrayList2.add(obj3);
                    }
                    z = z3;
                    if (it.hasNext()) {
                        Object next = it.next();
                        u0k u0kVar2 = ((nea0) next).a;
                        menuPaymentOptionsSourceInteractor$filterOptions$1.L$0 = jfa0Var;
                        menuPaymentOptionsSourceInteractor$filterOptions$1.L$1 = null;
                        menuPaymentOptionsSourceInteractor$filterOptions$1.L$2 = null;
                        menuPaymentOptionsSourceInteractor$filterOptions$1.L$3 = arrayList2;
                        menuPaymentOptionsSourceInteractor$filterOptions$1.L$4 = it;
                        menuPaymentOptionsSourceInteractor$filterOptions$1.L$5 = next;
                        menuPaymentOptionsSourceInteractor$filterOptions$1.L$6 = null;
                        menuPaymentOptionsSourceInteractor$filterOptions$1.Z$0 = z;
                        menuPaymentOptionsSourceInteractor$filterOptions$1.label = 1;
                        b = cVar.b(u0kVar2, menuPaymentOptionsSourceInteractor$filterOptions$1);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        z3 = z;
                        obj3 = next;
                        if (((Boolean) b).booleanValue()) {
                        }
                        z = z3;
                        if (it.hasNext()) {
                            arrayList = (List) arrayList2;
                            return jfa0.a(jfa0Var, arrayList, null, 6);
                        }
                    }
                }
            }
        }
        menuPaymentOptionsSourceInteractor$filterOptions$1 = new MenuPaymentOptionsSourceInteractor$filterOptions$1(cVar, continuationImpl);
        Object obj4 = menuPaymentOptionsSourceInteractor$filterOptions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = menuPaymentOptionsSourceInteractor$filterOptions$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(u0k u0kVar, ContinuationImpl continuationImpl) {
        MenuPaymentOptionsSourceInteractor$optionSupportedInSelectableMode$1 menuPaymentOptionsSourceInteractor$optionSupportedInSelectableMode$1;
        int i;
        List list;
        boolean z;
        PaymentMenuEntryPoints paymentMenuEntryPoints;
        if (continuationImpl instanceof MenuPaymentOptionsSourceInteractor$optionSupportedInSelectableMode$1) {
            menuPaymentOptionsSourceInteractor$optionSupportedInSelectableMode$1 = (MenuPaymentOptionsSourceInteractor$optionSupportedInSelectableMode$1) continuationImpl;
            int i2 = menuPaymentOptionsSourceInteractor$optionSupportedInSelectableMode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                menuPaymentOptionsSourceInteractor$optionSupportedInSelectableMode$1.label = i2 - Integer.MIN_VALUE;
                Object obj = menuPaymentOptionsSourceInteractor$optionSupportedInSelectableMode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = menuPaymentOptionsSourceInteractor$optionSupportedInSelectableMode$1.label;
                boolean z2 = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(u0kVar instanceof nk0)) {
                        if (u0kVar instanceof nj0) {
                            tmr0 tmr0Var = ((nj0) u0kVar).b;
                            qw6 qw6Var = this.e;
                            qw6Var.getClass();
                            if (tmr0Var.a() != SharedAccountType.BUSINESS) {
                                z = false;
                            } else {
                                EntryPoints entryPoints = tmr0Var.n;
                                if (entryPoints == null || (paymentMenuEntryPoints = entryPoints.a) == null || (list = paymentMenuEntryPoints.b) == null) {
                                    list = EmptyList.a;
                                }
                                z = qw6Var.a.a(list) ? true : !tmr0Var.k;
                            }
                            if (z) {
                                z2 = false;
                            }
                        }
                        return Boolean.valueOf(z2);
                    }
                    menuPaymentOptionsSourceInteractor$optionSupportedInSelectableMode$1.L$0 = null;
                    menuPaymentOptionsSourceInteractor$optionSupportedInSelectableMode$1.label = 1;
                    obj = this.g.b(menuPaymentOptionsSourceInteractor$optionSupportedInSelectableMode$1);
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
                z2 = ((YbWalletEntryPointExperiment) obj).d.contains(YbWalletEntryPointExperiment.EntryPoint.MENU);
                return Boolean.valueOf(z2);
            }
        }
        menuPaymentOptionsSourceInteractor$optionSupportedInSelectableMode$1 = new MenuPaymentOptionsSourceInteractor$optionSupportedInSelectableMode$1(this, continuationImpl);
        Object obj2 = menuPaymentOptionsSourceInteractor$optionSupportedInSelectableMode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = menuPaymentOptionsSourceInteractor$optionSupportedInSelectableMode$1.label;
        boolean z22 = true;
        if (i != 0) {
        }
        z22 = ((YbWalletEntryPointExperiment) obj2).d.contains(YbWalletEntryPointExperiment.EntryPoint.MENU);
        return Boolean.valueOf(z22);
    }

    public final jqr c(boolean z) {
        return new jqr(e.X(this.b.b(), new MenuPaymentOptionsSourceInteractor$optionsFlow$$inlined$flatMapLatest$1(null, this, z)), new MenuPaymentOptionsSourceInteractor$optionsFlow$2(this, null), 3);
    }
}
