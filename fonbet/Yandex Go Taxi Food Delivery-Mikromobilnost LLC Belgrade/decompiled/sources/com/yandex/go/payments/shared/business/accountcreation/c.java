package com.yandex.go.payments.shared.business.accountcreation;

import com.yandex.go.payments.shared.data.model.Account;
import defpackage.aue;
import defpackage.ax6;
import defpackage.bue;
import defpackage.c800;
import defpackage.ny61;
import defpackage.rmr0;
import defpackage.vw6;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class c {
    public final b a;
    public final bue b;

    public c(b bVar, bue bueVar) {
        this.a = bVar;
        this.b = bueVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Account account, rmr0 rmr0Var, boolean z, boolean z2, c800 c800Var, ContinuationImpl continuationImpl) {
        BusinessAccountViewModelConverter$generateState$1 businessAccountViewModelConverter$generateState$1;
        int i;
        c800 c800Var2;
        Object a;
        boolean z3;
        Account account2 = account;
        rmr0 rmr0Var2 = rmr0Var;
        if (continuationImpl instanceof BusinessAccountViewModelConverter$generateState$1) {
            businessAccountViewModelConverter$generateState$1 = (BusinessAccountViewModelConverter$generateState$1) continuationImpl;
            int i2 = businessAccountViewModelConverter$generateState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                businessAccountViewModelConverter$generateState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = businessAccountViewModelConverter$generateState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = businessAccountViewModelConverter$generateState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    businessAccountViewModelConverter$generateState$1.L$0 = account2;
                    businessAccountViewModelConverter$generateState$1.L$1 = rmr0Var2;
                    c800Var2 = c800Var;
                    businessAccountViewModelConverter$generateState$1.L$2 = c800Var2;
                    businessAccountViewModelConverter$generateState$1.Z$0 = z;
                    businessAccountViewModelConverter$generateState$1.Z$1 = z2;
                    businessAccountViewModelConverter$generateState$1.label = 1;
                    a = this.a.a(account2, rmr0Var2, z, businessAccountViewModelConverter$generateState$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z3 = z2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z4 = businessAccountViewModelConverter$generateState$1.Z$1;
                    c800 c800Var3 = (c800) businessAccountViewModelConverter$generateState$1.L$2;
                    rmr0 rmr0Var3 = (rmr0) businessAccountViewModelConverter$generateState$1.L$1;
                    Account account3 = (Account) businessAccountViewModelConverter$generateState$1.L$0;
                    kotlin.b.b(obj);
                    c800Var2 = c800Var3;
                    rmr0Var2 = rmr0Var3;
                    a = obj;
                    z3 = z4;
                    account2 = account3;
                }
                vw6 vw6Var = (vw6) a;
                aue a2 = bue.a(this.b);
                String str = rmr0Var2.b;
                String str2 = rmr0Var2.c;
                String str3 = rmr0Var2.g;
                String str4 = account2.i;
                List list = account2.d;
                return new ax6(c800Var2, str, str2, str3, str4, a2.c(), rmr0Var2.l, rmr0Var2.m, list.size() >= 2 ? rmr0Var2.h : account2.g, list.size() >= 2 ? rmr0Var2.i : rmr0Var2.j, rmr0Var2.k, z3, vw6Var);
            }
        }
        businessAccountViewModelConverter$generateState$1 = new BusinessAccountViewModelConverter$generateState$1(this, continuationImpl);
        Object obj2 = businessAccountViewModelConverter$generateState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = businessAccountViewModelConverter$generateState$1.label;
        if (i != 0) {
        }
        vw6 vw6Var2 = (vw6) a;
        aue a22 = bue.a(this.b);
        String str5 = rmr0Var2.b;
        String str22 = rmr0Var2.c;
        String str32 = rmr0Var2.g;
        String str42 = account2.i;
        List list2 = account2.d;
        return new ax6(c800Var2, str5, str22, str32, str42, a22.c(), rmr0Var2.l, rmr0Var2.m, list2.size() >= 2 ? rmr0Var2.h : account2.g, list2.size() >= 2 ? rmr0Var2.i : rmr0Var2.j, rmr0Var2.k, z3, vw6Var2);
    }
}
