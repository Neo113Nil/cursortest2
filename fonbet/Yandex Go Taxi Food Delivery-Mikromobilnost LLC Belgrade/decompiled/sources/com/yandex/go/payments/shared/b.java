package com.yandex.go.payments.shared;

import com.yandex.go.payments.shared.SharedPaymentExperiment;
import defpackage.caj;
import defpackage.cpr0;
import defpackage.d6z;
import defpackage.dw1;
import defpackage.evu0;
import defpackage.jst;
import defpackage.rmr0;
import defpackage.smr0;
import defpackage.tmr0;
import defpackage.wnr0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public final class b {
    public final ru.yandex.taxi.am.g a;
    public final wnr0 b;
    public final com.yandex.go.payments.shared.business.c c;
    public final cpr0 d;

    public b(ru.yandex.taxi.am.g gVar, wnr0 wnr0Var, com.yandex.go.payments.shared.business.c cVar, cpr0 cpr0Var) {
        this.a = gVar;
        this.b = wnr0Var;
        this.c = cVar;
        this.d = cpr0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a() {
        Collection collection;
        List list;
        wnr0 wnr0Var;
        Iterator it;
        tmr0 tmr0Var;
        rmr0 rmr0Var;
        caj cajVar;
        SharedPaymentExperiment.CreateCorporateAccount createCorporateAccount;
        dw1 dw1Var;
        com.yandex.go.payments.shared.business.c cVar = this.c;
        List a = cVar.a(cVar.b());
        if (!this.a.g()) {
            return a;
        }
        wnr0 wnr0Var2 = this.b;
        List list2 = wnr0Var2.b().c;
        if (list2.isEmpty()) {
            collection = EmptyList.a;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                SharedPaymentExperiment.RawType rawType = (SharedPaymentExperiment.RawType) it2.next();
                List list3 = rawType.g;
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = list3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    SharedPaymentExperiment.RawTypeDescription rawTypeDescription = (SharedPaymentExperiment.RawTypeDescription) it3.next();
                    String Y = d6z.Y(wnr0Var2.b(), rawTypeDescription.a);
                    smr0 smr0Var = evu0.J(Y) ? null : new smr0(Y, rawTypeDescription.b);
                    if (smr0Var != null) {
                        arrayList2.add(smr0Var);
                    }
                }
                SharedPaymentExperiment b = wnr0Var2.b();
                String str = rawType.a;
                String Y2 = d6z.Y(b, rawType.b);
                String Y3 = d6z.Y(b, rawType.c);
                String Y4 = d6z.Y(b, rawType.d);
                if (evu0.J(str) || evu0.J(Y2) || evu0.J(Y4)) {
                    list = a;
                    wnr0Var = wnr0Var2;
                    it = it2;
                    jst.e.k(new IllegalArgumentException(), String.format("Inconsistent shared account type data - typeId: %s menuTitle: %s title: %s", Arrays.copyOf(new Object[]{str, Y2, Y4}, 3)));
                    tmr0Var = null;
                } else {
                    SharedPaymentExperiment.BusinessAccountCreationFlow businessAccountCreationFlow = rawType.l;
                    if (businessAccountCreationFlow != null) {
                        SharedPaymentExperiment b2 = wnr0Var2.b();
                        boolean z = businessAccountCreationFlow.a;
                        list = a;
                        String Y5 = d6z.Y(b2, businessAccountCreationFlow.b);
                        String Y6 = d6z.Y(b2, businessAccountCreationFlow.c);
                        String Y7 = d6z.Y(b2, businessAccountCreationFlow.d);
                        String Y8 = d6z.Y(b2, businessAccountCreationFlow.e);
                        String Y9 = d6z.Y(b2, businessAccountCreationFlow.f);
                        String Y10 = d6z.Y(b2, businessAccountCreationFlow.g);
                        String Y11 = d6z.Y(b2, businessAccountCreationFlow.h);
                        String Y12 = d6z.Y(b2, businessAccountCreationFlow.i);
                        String Y13 = d6z.Y(b2, businessAccountCreationFlow.j);
                        SharedPaymentExperiment.Action action = businessAccountCreationFlow.k;
                        if (action != null) {
                            String str2 = action.b;
                            String str3 = action.a;
                            if (str3.length() != 0 && str2.length() != 0) {
                                wnr0Var = wnr0Var2;
                                it = it2;
                                cajVar = new caj(d6z.Y(wnr0Var.b(), str3), str2);
                                createCorporateAccount = businessAccountCreationFlow.l;
                                if (createCorporateAccount != null) {
                                    String str4 = createCorporateAccount.c;
                                    String str5 = createCorporateAccount.b;
                                    String str6 = createCorporateAccount.a;
                                    if (str6.length() != 0 && str5.length() != 0 && str4.length() != 0) {
                                        SharedPaymentExperiment b3 = wnr0Var.b();
                                        dw1Var = new dw1(d6z.Y(b3, str6), d6z.Y(b3, str5), str4);
                                        rmr0Var = new rmr0(z, Y5, Y6, Y7, Y8, Y9, Y10, Y11, Y12, Y13, cajVar, dw1Var, 4096);
                                    }
                                }
                                dw1Var = null;
                                rmr0Var = new rmr0(z, Y5, Y6, Y7, Y8, Y9, Y10, Y11, Y12, Y13, cajVar, dw1Var, 4096);
                            }
                        }
                        wnr0Var = wnr0Var2;
                        it = it2;
                        cajVar = null;
                        createCorporateAccount = businessAccountCreationFlow.l;
                        if (createCorporateAccount != null) {
                        }
                        dw1Var = null;
                        rmr0Var = new rmr0(z, Y5, Y6, Y7, Y8, Y9, Y10, Y11, Y12, Y13, cajVar, dw1Var, 4096);
                    } else {
                        list = a;
                        wnr0Var = wnr0Var2;
                        it = it2;
                        rmr0Var = null;
                    }
                    tmr0Var = new tmr0(str, Y2, Y3, Y4, d6z.Y(b, rawType.e), !rawType.f, arrayList2, rawType.h, d6z.Y(b, rawType.i), rmr0Var, this.d.a(), 121856);
                }
                if (tmr0Var != null) {
                    arrayList.add(tmr0Var);
                }
                a = list;
                wnr0Var2 = wnr0Var;
                it2 = it;
            }
            collection = arrayList;
        }
        return kotlin.collections.a.m0(a, collection);
    }
}
