package com.yandex.go.yb.domain;

import defpackage.dvw;
import defpackage.j18;
import defpackage.kde;
import defpackage.ny61;
import defpackage.pt51;
import defpackage.qt51;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class r {
    public final pt51 a;
    public final pt51 b;
    public final /* synthetic */ qt51 c;

    public r(qt51 qt51Var) {
        this.c = qt51Var;
        this.a = new pt51(0, qt51Var);
        this.b = new pt51(1, qt51Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        YbPlusTreasuryAdapterProviderImpl$YbPlusTreasuryAdapterImpl$proceedYbSdkAuth$1 ybPlusTreasuryAdapterProviderImpl$YbPlusTreasuryAdapterImpl$proceedYbSdkAuth$1;
        int i;
        if (continuationImpl instanceof YbPlusTreasuryAdapterProviderImpl$YbPlusTreasuryAdapterImpl$proceedYbSdkAuth$1) {
            ybPlusTreasuryAdapterProviderImpl$YbPlusTreasuryAdapterImpl$proceedYbSdkAuth$1 = (YbPlusTreasuryAdapterProviderImpl$YbPlusTreasuryAdapterImpl$proceedYbSdkAuth$1) continuationImpl;
            int i2 = ybPlusTreasuryAdapterProviderImpl$YbPlusTreasuryAdapterImpl$proceedYbSdkAuth$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybPlusTreasuryAdapterProviderImpl$YbPlusTreasuryAdapterImpl$proceedYbSdkAuth$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ybPlusTreasuryAdapterProviderImpl$YbPlusTreasuryAdapterImpl$proceedYbSdkAuth$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybPlusTreasuryAdapterProviderImpl$YbPlusTreasuryAdapterImpl$proceedYbSdkAuth$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    qt51 qt51Var = this.c;
                    ybPlusTreasuryAdapterProviderImpl$YbPlusTreasuryAdapterImpl$proceedYbSdkAuth$1.L$0 = qt51Var;
                    ybPlusTreasuryAdapterProviderImpl$YbPlusTreasuryAdapterImpl$proceedYbSdkAuth$1.label = 1;
                    j18 j18Var = new j18(1, dvw.b(ybPlusTreasuryAdapterProviderImpl$YbPlusTreasuryAdapterImpl$proceedYbSdkAuth$1));
                    j18Var.u();
                    ((c) qt51Var.c.get()).p(new kde(j18Var, 8));
                    if (j18Var.s() == coroutineSingletons) {
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
        ybPlusTreasuryAdapterProviderImpl$YbPlusTreasuryAdapterImpl$proceedYbSdkAuth$1 = new YbPlusTreasuryAdapterProviderImpl$YbPlusTreasuryAdapterImpl$proceedYbSdkAuth$1(this, continuationImpl);
        Object obj2 = ybPlusTreasuryAdapterProviderImpl$YbPlusTreasuryAdapterImpl$proceedYbSdkAuth$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybPlusTreasuryAdapterProviderImpl$YbPlusTreasuryAdapterImpl$proceedYbSdkAuth$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
