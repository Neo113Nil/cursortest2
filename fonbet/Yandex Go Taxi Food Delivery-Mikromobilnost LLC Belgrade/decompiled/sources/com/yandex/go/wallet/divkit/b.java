package com.yandex.go.wallet.divkit;

import defpackage.h3y;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class b {
    public final i3y a;

    public b(h3y h3yVar) {
        this.a = kotlin.a.a(new WalletVariablesInteractor$handlers$2(0, h3yVar, h3y.class, "get", "get()Ljava/lang/Object;", 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        WalletVariablesInteractor$init$1 walletVariablesInteractor$init$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof WalletVariablesInteractor$init$1) {
            walletVariablesInteractor$init$1 = (WalletVariablesInteractor$init$1) continuationImpl;
            int i2 = walletVariablesInteractor$init$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walletVariablesInteractor$init$1.label = i2 - Integer.MIN_VALUE;
                Object obj = walletVariablesInteractor$init$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walletVariablesInteractor$init$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    it = ((Set) this.a.getValue()).iterator();
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) walletVariablesInteractor$init$1.L$0;
                    kotlin.b.b(obj);
                }
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    walletVariablesInteractor$init$1.L$0 = it;
                    walletVariablesInteractor$init$1.L$1 = null;
                    walletVariablesInteractor$init$1.label = 1;
                    if (aVar.a(walletVariablesInteractor$init$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11.a;
            }
        }
        walletVariablesInteractor$init$1 = new WalletVariablesInteractor$init$1(this, continuationImpl);
        Object obj2 = walletVariablesInteractor$init$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walletVariablesInteractor$init$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return zy11.a;
    }
}
