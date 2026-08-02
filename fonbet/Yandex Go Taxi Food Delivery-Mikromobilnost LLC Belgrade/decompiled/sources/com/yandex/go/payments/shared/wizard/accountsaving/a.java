package com.yandex.go.payments.shared.wizard.accountsaving;

import com.yandex.go.payments.shared.data.model.Account;
import defpackage.jzl0;
import defpackage.lzl0;
import defpackage.ny61;
import defpackage.oe91;
import defpackage.tl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final com.yandex.go.payments.shared.details.accountpayment.a a;

    public a(com.yandex.go.payments.shared.details.accountpayment.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Account account, jzl0 jzl0Var, ContinuationImpl continuationImpl) {
        SaveAccountConverter$toViewModel$1 saveAccountConverter$toViewModel$1;
        int i;
        String str;
        String str2;
        if (continuationImpl instanceof SaveAccountConverter$toViewModel$1) {
            saveAccountConverter$toViewModel$1 = (SaveAccountConverter$toViewModel$1) continuationImpl;
            int i2 = saveAccountConverter$toViewModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                saveAccountConverter$toViewModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = saveAccountConverter$toViewModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = saveAccountConverter$toViewModel$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String b = account.b();
                    String str3 = account.g;
                    saveAccountConverter$toViewModel$1.L$0 = account;
                    saveAccountConverter$toViewModel$1.L$1 = jzl0Var;
                    saveAccountConverter$toViewModel$1.L$2 = b;
                    saveAccountConverter$toViewModel$1.L$3 = str3;
                    saveAccountConverter$toViewModel$1.label = 1;
                    Object b2 = this.a.b(account, saveAccountConverter$toViewModel$1);
                    if (b2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = b;
                    str2 = str3;
                    obj = b2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str4 = (String) saveAccountConverter$toViewModel$1.L$3;
                    String str5 = (String) saveAccountConverter$toViewModel$1.L$2;
                    jzl0Var = (jzl0) saveAccountConverter$toViewModel$1.L$1;
                    Account account2 = (Account) saveAccountConverter$toViewModel$1.L$0;
                    kotlin.b.b(obj);
                    str2 = str4;
                    str = str5;
                    account = account2;
                }
                return new lzl0(str, str2, (tl) obj, jzl0Var.c, oe91.e(account.c()));
            }
        }
        saveAccountConverter$toViewModel$1 = new SaveAccountConverter$toViewModel$1(this, continuationImpl);
        Object obj2 = saveAccountConverter$toViewModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = saveAccountConverter$toViewModel$1.label;
        if (i != 0) {
        }
        return new lzl0(str, str2, (tl) obj2, jzl0Var.c, oe91.e(account.c()));
    }
}
