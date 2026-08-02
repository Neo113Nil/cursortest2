package com.yandex.go.payments.domain;

import com.yandex.go.payments.data.model.response.AddPaymentMethodButton;
import com.yandex.go.payments.data.model.response.AddSbpTokenButtonDto;
import com.yandex.go.payments.data.model.response.ListPaymentMethodsUiDto;
import com.yandex.go.payments.data.model.response.PaymentMethods;
import com.yandex.go.payments.data.model.response.SharedAccount;
import com.yandex.go.payments.data.model.response.YbWallet;
import com.yandex.go.payments.payment.AddPaymentModel$State;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment;
import com.yandex.go.yb.api.experiments.YbWalletEntryPointExperiment;
import defpackage.bg0;
import defpackage.bk0;
import defpackage.ck0;
import defpackage.df0;
import defpackage.due;
import defpackage.evu0;
import defpackage.jbh;
import defpackage.jl40;
import defpackage.jw90;
import defpackage.kd0;
import defpackage.mf0;
import defpackage.mj0;
import defpackage.mk0;
import defpackage.na0;
import defpackage.nj0;
import defpackage.nk0;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.rqo;
import defpackage.s59;
import defpackage.t1b0;
import defpackage.tcc;
import defpackage.tmr0;
import defpackage.u0k;
import defpackage.u80;
import defpackage.uap;
import defpackage.ui0;
import defpackage.vi0;
import defpackage.w511;
import defpackage.xw91;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class a {
    public final com.yandex.go.payments.shared.b a;
    public final s59 b;
    public final due c;
    public final t1b0 d;

    public a(rqo rqoVar, com.yandex.go.payments.shared.b bVar, s59 s59Var, due dueVar) {
        this.a = bVar;
        this.b = s59Var;
        this.c = dueVar;
        this.d = ((jbh) rqoVar).e(YbWalletEntryPointExperiment.i);
    }

    public static AddPaymentModel$State a(AddSbpTokenButtonDto.StateType stateType) {
        int i = ui0.b[stateType.ordinal()];
        if (i == 1) {
            return AddPaymentModel$State.ENABLED;
        }
        if (i == 2) {
            return AddPaymentModel$State.BUSY;
        }
        if (i == 3) {
            return AddPaymentModel$State.DISABLED;
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(PaymentMethods paymentMethods, ContinuationImpl continuationImpl) {
        AddPaymentMethodsResponseMapper$createAddYbWalletPayment$1 addPaymentMethodsResponseMapper$createAddYbWalletPayment$1;
        int i;
        List list;
        YbWalletEntryPointExperiment ybWalletEntryPointExperiment;
        if (continuationImpl instanceof AddPaymentMethodsResponseMapper$createAddYbWalletPayment$1) {
            addPaymentMethodsResponseMapper$createAddYbWalletPayment$1 = (AddPaymentMethodsResponseMapper$createAddYbWalletPayment$1) continuationImpl;
            int i2 = addPaymentMethodsResponseMapper$createAddYbWalletPayment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addPaymentMethodsResponseMapper$createAddYbWalletPayment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addPaymentMethodsResponseMapper$createAddYbWalletPayment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addPaymentMethodsResponseMapper$createAddYbWalletPayment$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = paymentMethods.g.a;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((YbWallet) it.next()).getC());
                    }
                    addPaymentMethodsResponseMapper$createAddYbWalletPayment$1.L$0 = null;
                    addPaymentMethodsResponseMapper$createAddYbWalletPayment$1.L$1 = arrayList;
                    addPaymentMethodsResponseMapper$createAddYbWalletPayment$1.label = 1;
                    Object b = this.d.b(addPaymentMethodsResponseMapper$createAddYbWalletPayment$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = b;
                    list = arrayList;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) addPaymentMethodsResponseMapper$createAddYbWalletPayment$1.L$1;
                    kotlin.b.b(obj);
                }
                ybWalletEntryPointExperiment = (YbWalletEntryPointExperiment) obj;
                if (ybWalletEntryPointExperiment.b || ybWalletEntryPointExperiment.d.a.isEmpty()) {
                    return null;
                }
                return new nk0(list);
            }
        }
        addPaymentMethodsResponseMapper$createAddYbWalletPayment$1 = new AddPaymentMethodsResponseMapper$createAddYbWalletPayment$1(this, continuationImpl);
        Object obj2 = addPaymentMethodsResponseMapper$createAddYbWalletPayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addPaymentMethodsResponseMapper$createAddYbWalletPayment$1.label;
        if (i != 0) {
        }
        ybWalletEntryPointExperiment = (YbWalletEntryPointExperiment) obj2;
        if (ybWalletEntryPointExperiment.b) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r25v0, types: [com.yandex.go.payments.domain.a] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(PaymentMethods paymentMethods, jw90 jw90Var, ContinuationImpl continuationImpl) {
        AddPaymentMethodsResponseMapper$mapAll$1 addPaymentMethodsResponseMapper$mapAll$1;
        int i;
        mf0 mf0Var;
        ListBuilder a;
        ListBuilder listBuilder;
        Object obj;
        ListBuilder listBuilder2;
        boolean equals;
        Object obj2;
        nj0 nj0Var;
        ListPaymentMethodsUiDto listPaymentMethodsUiDto;
        Iterable iterable;
        Iterable iterable2;
        Iterator it;
        AddPaymentMethodButton addPaymentMethodButton;
        List<AddPaymentMethodButton> list;
        u0k mk0Var;
        nj0 nj0Var2;
        mj0 mj0Var;
        PaymentMethods paymentMethods2 = paymentMethods;
        jw90 jw90Var2 = jw90Var;
        xw91 xw91Var = xw91.C;
        if (continuationImpl instanceof AddPaymentMethodsResponseMapper$mapAll$1) {
            addPaymentMethodsResponseMapper$mapAll$1 = (AddPaymentMethodsResponseMapper$mapAll$1) continuationImpl;
            int i2 = addPaymentMethodsResponseMapper$mapAll$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addPaymentMethodsResponseMapper$mapAll$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = addPaymentMethodsResponseMapper$mapAll$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addPaymentMethodsResponseMapper$mapAll$1.label;
                mf0Var = null;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    a = rcc.a();
                    if (!jw90Var2.a(PaymentMethod$Type.YB_WALLET).equals(xw91Var)) {
                        listBuilder = a;
                        if (jw90Var2.a(PaymentMethod$Type.SBP_TOKEN).equals(xw91Var)) {
                            AddSbpTokenButtonDto addSbpTokenButtonDto = paymentMethods2.q.c;
                            if (addSbpTokenButtonDto != null) {
                                AddSbpTokenButtonDto.StateType stateType = addSbpTokenButtonDto.d;
                                mj0Var = new mj0(stateType != AddSbpTokenButtonDto.StateType.DISABLED ? null : "", addSbpTokenButtonDto.a, addSbpTokenButtonDto.b, addSbpTokenButtonDto.c, a(stateType));
                            } else {
                                mj0Var = null;
                            }
                            if (mj0Var != null) {
                                a.add(mj0Var);
                            }
                        }
                        equals = jw90Var2.a(PaymentMethod$Type.SHARED).equals(xw91Var);
                        com.yandex.go.payments.shared.b bVar = this.a;
                        if (equals) {
                            List list2 = paymentMethods2.f.a;
                            List<tmr0> a2 = bVar.a();
                            ArrayList arrayList = new ArrayList();
                            for (tmr0 tmr0Var : a2) {
                                if (tmr0Var.a() != SharedAccountType.FAMILY || !((uap) this.b.a).isEnabled()) {
                                    List list3 = list2;
                                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                        Iterator it2 = list3.iterator();
                                        while (it2.hasNext()) {
                                            if (jl40.l(((SharedAccount) it2.next()).getB(), tmr0Var.a)) {
                                            }
                                        }
                                    }
                                    nj0Var2 = new nj0(tmr0Var.a(), tmr0Var);
                                    if (nj0Var2 == null) {
                                        arrayList.add(nj0Var2);
                                    }
                                }
                                nj0Var2 = null;
                                if (nj0Var2 == null) {
                                }
                            }
                            a.addAll(arrayList);
                        } else {
                            if (((CorpAccountFlowExperiment) this.c.a.b()).b) {
                                Iterator it3 = bVar.a().iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it3.next();
                                    if (((tmr0) obj2).a() == SharedAccountType.BUSINESS) {
                                        break;
                                    }
                                }
                                tmr0 tmr0Var2 = (tmr0) obj2;
                                if (tmr0Var2 != null) {
                                    nj0Var = new nj0(tmr0Var2.a(), tmr0Var2);
                                    if (nj0Var != null) {
                                        a.add(nj0Var);
                                    }
                                }
                            }
                            nj0Var = null;
                            if (nj0Var != null) {
                            }
                        }
                        if (jw90Var2.a(PaymentMethod$Type.CARD).equals(xw91Var)) {
                            a.add(new na0(paymentMethods2.a.b.size() + paymentMethods2.a.a.size() < 20 ? null : ""));
                        }
                        listPaymentMethodsUiDto = paymentMethods2.u;
                        if (listPaymentMethodsUiDto != null || (list = listPaymentMethodsUiDto.a) == null) {
                            iterable = EmptyList.a;
                        } else {
                            iterable = new ArrayList();
                            for (AddPaymentMethodButton addPaymentMethodButton2 : list) {
                                String str = addPaymentMethodButton2.a;
                                String str2 = addPaymentMethodButton2.d;
                                String str3 = addPaymentMethodButton2.b;
                                String str4 = addPaymentMethodButton2.a;
                                AddSbpTokenButtonDto.StateType stateType2 = addPaymentMethodButton2.f;
                                AddPaymentMethodButton.AddButtonFlow addButtonFlow = addPaymentMethodButton2.e;
                                if (!evu0.J(str)) {
                                    switch (ui0.a[addPaymentMethodButton2.c.ordinal()]) {
                                        case 1:
                                            AddPaymentModel$State a3 = a(stateType2);
                                            mk0Var = new mk0(a3 != AddPaymentModel$State.DISABLED ? null : "", addPaymentMethodButton2.a, addPaymentMethodButton2.b, addPaymentMethodButton2.d, u80.a(addButtonFlow), a3);
                                            if (mk0Var != null) {
                                                iterable.add(mk0Var);
                                            }
                                        case 2:
                                            AddPaymentModel$State a4 = a(stateType2);
                                            mk0Var = new bg0(a4 != AddPaymentModel$State.DISABLED ? null : "", addPaymentMethodButton2.a, addPaymentMethodButton2.b, addPaymentMethodButton2.d, u80.a(addButtonFlow), a4);
                                            if (mk0Var != null) {
                                            }
                                            break;
                                        case 3:
                                            AddPaymentModel$State a5 = a(stateType2);
                                            mk0Var = new kd0(a5 != AddPaymentModel$State.DISABLED ? null : "", addPaymentMethodButton2.a, addPaymentMethodButton2.b, addPaymentMethodButton2.d, u80.a(addButtonFlow), a5);
                                            if (mk0Var != null) {
                                            }
                                            break;
                                        case 4:
                                            AddPaymentModel$State a6 = a(stateType2);
                                            mk0Var = new df0(a6 != AddPaymentModel$State.DISABLED ? null : "", addPaymentMethodButton2.a, addPaymentMethodButton2.b, addPaymentMethodButton2.d, u80.a(addButtonFlow), a6);
                                            if (mk0Var != null) {
                                            }
                                            break;
                                        case 5:
                                            mk0Var = new bk0(str4, str3, str2, u80.a(addButtonFlow));
                                            if (mk0Var != null) {
                                            }
                                            break;
                                        case 6:
                                            mk0Var = new ck0(str4, str3, str2, u80.a(addButtonFlow));
                                            if (mk0Var != null) {
                                            }
                                            break;
                                        case 7:
                                            if (!evu0.J(str4)) {
                                                AddPaymentModel$State a7 = a(stateType2);
                                                mk0Var = new mf0(a7 != AddPaymentModel$State.DISABLED ? null : "", addPaymentMethodButton2.a, addPaymentMethodButton2.b, addPaymentMethodButton2.d, u80.a(addButtonFlow), a7);
                                                if (mk0Var != null) {
                                                }
                                            }
                                            break;
                                        case 8:
                                        case 9:
                                            mk0Var = null;
                                            if (mk0Var != null) {
                                            }
                                            break;
                                        default:
                                            w511.b();
                                            return null;
                                    }
                                }
                                mk0Var = null;
                                if (mk0Var != null) {
                                }
                            }
                        }
                        iterable2 = iterable;
                        if ((iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            it = iterable2.iterator();
                            while (it.hasNext()) {
                                if (((vi0) it.next()) instanceof mf0) {
                                    a.addAll((Collection) iterable);
                                    return listBuilder.j();
                                }
                            }
                        }
                        addPaymentMethodButton = paymentMethods2.r.b;
                        if (addPaymentMethodButton != null && !evu0.J(addPaymentMethodButton.a)) {
                            mf0Var = new mf0(null, addPaymentMethodButton.a, addPaymentMethodButton.b, addPaymentMethodButton.d, u80.a(addPaymentMethodButton.e), AddPaymentModel$State.ENABLED);
                        }
                        if (mf0Var != null) {
                            a.add(mf0Var);
                        }
                        a.addAll((Collection) iterable);
                        return listBuilder.j();
                    }
                    addPaymentMethodsResponseMapper$mapAll$1.L$0 = paymentMethods2;
                    addPaymentMethodsResponseMapper$mapAll$1.L$1 = jw90Var2;
                    addPaymentMethodsResponseMapper$mapAll$1.L$2 = a;
                    addPaymentMethodsResponseMapper$mapAll$1.L$3 = a;
                    addPaymentMethodsResponseMapper$mapAll$1.L$4 = null;
                    addPaymentMethodsResponseMapper$mapAll$1.L$5 = a;
                    addPaymentMethodsResponseMapper$mapAll$1.label = 1;
                    Object b = b(paymentMethods2, addPaymentMethodsResponseMapper$mapAll$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    listBuilder = a;
                    obj = b;
                    listBuilder2 = listBuilder;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r1 = (List) addPaymentMethodsResponseMapper$mapAll$1.L$5;
                    ?? r2 = (List) addPaymentMethodsResponseMapper$mapAll$1.L$3;
                    ?? r6 = (List) addPaymentMethodsResponseMapper$mapAll$1.L$2;
                    jw90 jw90Var3 = (jw90) addPaymentMethodsResponseMapper$mapAll$1.L$1;
                    PaymentMethods paymentMethods3 = (PaymentMethods) addPaymentMethodsResponseMapper$mapAll$1.L$0;
                    kotlin.b.b(obj3);
                    a = r1;
                    paymentMethods2 = paymentMethods3;
                    listBuilder2 = r2;
                    jw90Var2 = jw90Var3;
                    listBuilder = r6;
                    obj = obj3;
                }
                if (obj != null) {
                    a.add(obj);
                }
                a = listBuilder2;
                if (jw90Var2.a(PaymentMethod$Type.SBP_TOKEN).equals(xw91Var)) {
                }
                equals = jw90Var2.a(PaymentMethod$Type.SHARED).equals(xw91Var);
                com.yandex.go.payments.shared.b bVar2 = this.a;
                if (equals) {
                }
                if (jw90Var2.a(PaymentMethod$Type.CARD).equals(xw91Var)) {
                }
                listPaymentMethodsUiDto = paymentMethods2.u;
                if (listPaymentMethodsUiDto != null) {
                }
                iterable = EmptyList.a;
                iterable2 = iterable;
                if (iterable2 instanceof Collection) {
                }
                it = iterable2.iterator();
                while (it.hasNext()) {
                }
                addPaymentMethodButton = paymentMethods2.r.b;
                if (addPaymentMethodButton != null) {
                    mf0Var = new mf0(null, addPaymentMethodButton.a, addPaymentMethodButton.b, addPaymentMethodButton.d, u80.a(addPaymentMethodButton.e), AddPaymentModel$State.ENABLED);
                }
                if (mf0Var != null) {
                }
                a.addAll((Collection) iterable);
                return listBuilder.j();
            }
        }
        addPaymentMethodsResponseMapper$mapAll$1 = new AddPaymentMethodsResponseMapper$mapAll$1(this, continuationImpl);
        Object obj32 = addPaymentMethodsResponseMapper$mapAll$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addPaymentMethodsResponseMapper$mapAll$1.label;
        mf0Var = null;
        if (i != 0) {
        }
        if (obj != null) {
        }
        a = listBuilder2;
        if (jw90Var2.a(PaymentMethod$Type.SBP_TOKEN).equals(xw91Var)) {
        }
        equals = jw90Var2.a(PaymentMethod$Type.SHARED).equals(xw91Var);
        com.yandex.go.payments.shared.b bVar22 = this.a;
        if (equals) {
        }
        if (jw90Var2.a(PaymentMethod$Type.CARD).equals(xw91Var)) {
        }
        listPaymentMethodsUiDto = paymentMethods2.u;
        if (listPaymentMethodsUiDto != null) {
        }
        iterable = EmptyList.a;
        iterable2 = iterable;
        if (iterable2 instanceof Collection) {
        }
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        addPaymentMethodButton = paymentMethods2.r.b;
        if (addPaymentMethodButton != null) {
        }
        if (mf0Var != null) {
        }
        a.addAll((Collection) iterable);
        return listBuilder.j();
    }
}
