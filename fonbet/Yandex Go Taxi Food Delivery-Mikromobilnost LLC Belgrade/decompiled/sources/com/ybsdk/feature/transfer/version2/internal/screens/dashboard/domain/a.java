package com.ybsdk.feature.transfer.version2.internal.screens.dashboard.domain;

import defpackage.ny61;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final com.ybsdk.feature.transfer.version2.internal.screens.dashboard.data.a a;

    public a(com.ybsdk.feature.transfer.version2.internal.screens.dashboard.data.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        TransfersDashboardInteractor$getTransfersDashboard$1 transfersDashboardInteractor$getTransfersDashboard$1;
        int i;
        if (continuationImpl instanceof TransfersDashboardInteractor$getTransfersDashboard$1) {
            transfersDashboardInteractor$getTransfersDashboard$1 = (TransfersDashboardInteractor$getTransfersDashboard$1) continuationImpl;
            int i2 = transfersDashboardInteractor$getTransfersDashboard$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfersDashboardInteractor$getTransfersDashboard$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfersDashboardInteractor$getTransfersDashboard$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfersDashboardInteractor$getTransfersDashboard$1.label;
                if (i != 0) {
                    b.b(obj);
                    transfersDashboardInteractor$getTransfersDashboard$1.label = 1;
                    Object a = this.a.a(str, transfersDashboardInteractor$getTransfersDashboard$1);
                    return a == coroutineSingletons ? coroutineSingletons : a;
                }
                if (i == 1) {
                    b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        transfersDashboardInteractor$getTransfersDashboard$1 = new TransfersDashboardInteractor$getTransfersDashboard$1(this, continuationImpl);
        Object obj2 = transfersDashboardInteractor$getTransfersDashboard$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfersDashboardInteractor$getTransfersDashboard$1.label;
        if (i != 0) {
        }
    }
}
