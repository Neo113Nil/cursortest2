package com.yandex.go.payments.shared.details;

import com.yandex.go.payments.data.model.response.SharedAccount;
import com.yandex.go.payments.shared.SharedPaymentExperiment;
import com.yandex.go.payments.shared.data.model.Account;
import defpackage.d6z;
import defpackage.fga0;
import defpackage.il;
import defpackage.jl40;
import defpackage.jmr0;
import defpackage.ny61;
import defpackage.rg7;
import defpackage.rk;
import defpackage.tcc;
import defpackage.tk;
import defpackage.tl;
import defpackage.wnr0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final com.yandex.go.payments.shared.details.accountpayment.a a;
    public final wnr0 b;
    public final fga0 c;
    public final com.yandex.go.payments.shared.business.c d;

    public a(com.yandex.go.payments.shared.details.accountpayment.a aVar, wnr0 wnr0Var, fga0 fga0Var, com.yandex.go.payments.shared.business.c cVar) {
        this.a = aVar;
        this.b = wnr0Var;
        this.c = fga0Var;
        this.d = cVar;
    }

    public static SharedPaymentExperiment.RawType a(il ilVar, SharedPaymentExperiment sharedPaymentExperiment) {
        Object obj;
        String typeId = ilVar.d.getTypeId();
        Iterator it = sharedPaymentExperiment.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((SharedPaymentExperiment.RawType) obj).a, typeId)) {
                break;
            }
        }
        return (SharedPaymentExperiment.RawType) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(il ilVar, ContinuationImpl continuationImpl) {
        AccountDetailsConverter$toViewModel$1 accountDetailsConverter$toViewModel$1;
        int i;
        rg7 rg7Var;
        Account account;
        il ilVar2;
        boolean equals;
        Object obj;
        SharedPaymentExperiment b;
        SharedPaymentExperiment.RawType a;
        SharedPaymentExperiment b2;
        SharedPaymentExperiment.RawType a2;
        SharedPaymentExperiment.PlusMultiBanner plusMultiBanner;
        if (continuationImpl instanceof AccountDetailsConverter$toViewModel$1) {
            accountDetailsConverter$toViewModel$1 = (AccountDetailsConverter$toViewModel$1) continuationImpl;
            int i2 = accountDetailsConverter$toViewModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accountDetailsConverter$toViewModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = accountDetailsConverter$toViewModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountDetailsConverter$toViewModel$1.label;
                rg7Var = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Account b3 = ilVar.b();
                    accountDetailsConverter$toViewModel$1.L$0 = ilVar;
                    accountDetailsConverter$toViewModel$1.L$1 = b3;
                    accountDetailsConverter$toViewModel$1.label = 1;
                    Object b4 = this.a.b(b3, accountDetailsConverter$toViewModel$1);
                    if (b4 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    account = b3;
                    obj2 = b4;
                    ilVar2 = ilVar;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    account = (Account) accountDetailsConverter$toViewModel$1.L$1;
                    ilVar2 = (il) accountDetailsConverter$toViewModel$1.L$0;
                    kotlin.b.b(obj2);
                }
                tl tlVar = (tl) obj2;
                this.d.getClass();
                equals = "business".equals(ilVar2.a().getTypeId());
                wnr0 wnr0Var = this.b;
                ?? r8 = EmptyList.a;
                if (!equals) {
                    Iterator it = this.c.b.g().f.a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (jl40.l(((SharedAccount) obj).a, ilVar2.b)) {
                            break;
                        }
                    }
                    if (((SharedAccount) obj) != null && account.c.c && (a = a(ilVar2, (b = wnr0Var.b()))) != null) {
                        List<SharedPaymentExperiment.AccountAction> list = a.j;
                        r8 = new ArrayList(tcc.n(list, 10));
                        for (SharedPaymentExperiment.AccountAction accountAction : list) {
                            r8.add(new jmr0(d6z.Y(b, accountAction.a), accountAction.b, accountAction.c));
                        }
                    }
                }
                List list2 = r8;
                if (!"business".equals(ilVar2.a().getTypeId()) && (a2 = a(ilVar2, (b2 = wnr0Var.b()))) != null && (plusMultiBanner = a2.k) != null) {
                    rg7Var = new rg7(d6z.Y(b2, plusMultiBanner.a), d6z.Y(b2, plusMultiBanner.b), plusMultiBanner.c);
                }
                rk rkVar = new rk();
                rkVar.a = false;
                Account.Settings settings = account.l;
                Account.Settings settings2 = Account.Settings.f;
                rkVar.e = settings == settings2;
                rkVar.d = !(settings != settings2);
                String b5 = account.b();
                String str = account.g;
                rkVar.b = str;
                rkVar.c = tlVar;
                rkVar.f = list2;
                boolean z = account.p;
                rkVar.g = z;
                rkVar.h = rg7Var;
                return new tk(rkVar.a, b5, str, tlVar, rkVar.d, rkVar.e, list2, z, rg7Var);
            }
        }
        accountDetailsConverter$toViewModel$1 = new AccountDetailsConverter$toViewModel$1(this, continuationImpl);
        Object obj22 = accountDetailsConverter$toViewModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountDetailsConverter$toViewModel$1.label;
        rg7Var = null;
        if (i != 0) {
        }
        tl tlVar2 = (tl) obj22;
        this.d.getClass();
        equals = "business".equals(ilVar2.a().getTypeId());
        wnr0 wnr0Var2 = this.b;
        ?? r82 = EmptyList.a;
        if (!equals) {
        }
        List list22 = r82;
        if (!"business".equals(ilVar2.a().getTypeId())) {
            rg7Var = new rg7(d6z.Y(b2, plusMultiBanner.a), d6z.Y(b2, plusMultiBanner.b), plusMultiBanner.c);
        }
        rk rkVar2 = new rk();
        rkVar2.a = false;
        Account.Settings settings3 = account.l;
        Account.Settings settings22 = Account.Settings.f;
        rkVar2.e = settings3 == settings22;
        rkVar2.d = !(settings3 != settings22);
        String b52 = account.b();
        String str2 = account.g;
        rkVar2.b = str2;
        rkVar2.c = tlVar2;
        rkVar2.f = list22;
        boolean z2 = account.p;
        rkVar2.g = z2;
        rkVar2.h = rg7Var;
        return new tk(rkVar2.a, b52, str2, tlVar2, rkVar2.d, rkVar2.e, list22, z2, rg7Var);
    }
}
