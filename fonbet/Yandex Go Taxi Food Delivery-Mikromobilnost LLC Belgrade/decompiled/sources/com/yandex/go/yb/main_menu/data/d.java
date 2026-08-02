package com.yandex.go.yb.main_menu.data;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr a;

    public d(tpr tprVar) {
        this.a = tprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        YbWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$1$1 ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof YbWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$1$1) {
            ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$1$1 = (YbWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$1$1) continuation;
            int i2 = ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar);
                    ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$1$1.L$0 = null;
                    ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$1$1.L$1 = null;
                    ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$1$1.L$2 = null;
                    ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$1$1 = new YbWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
