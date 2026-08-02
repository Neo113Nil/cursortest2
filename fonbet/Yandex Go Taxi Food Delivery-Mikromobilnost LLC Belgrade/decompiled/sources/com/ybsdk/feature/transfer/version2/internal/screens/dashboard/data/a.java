package com.ybsdk.feature.transfer.version2.internal.screens.dashboard.data;

import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
import defpackage.ny61;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final Transfer2Api a;

    public a(Transfer2Api transfer2Api) {
        this.a = transfer2Api;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        TransfersDashboardRepository$getTransfersDashboard$1 transfersDashboardRepository$getTransfersDashboard$1;
        int i;
        if (continuationImpl instanceof TransfersDashboardRepository$getTransfersDashboard$1) {
            transfersDashboardRepository$getTransfersDashboard$1 = (TransfersDashboardRepository$getTransfersDashboard$1) continuationImpl;
            int i2 = transfersDashboardRepository$getTransfersDashboard$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfersDashboardRepository$getTransfersDashboard$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfersDashboardRepository$getTransfersDashboard$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfersDashboardRepository$getTransfersDashboard$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                TransfersDashboardRepository$getTransfersDashboard$2 transfersDashboardRepository$getTransfersDashboard$2 = new TransfersDashboardRepository$getTransfersDashboard$2(this, str, null);
                transfersDashboardRepository$getTransfersDashboard$1.label = 1;
                Object c = c.c(transfersDashboardRepository$getTransfersDashboard$2, transfersDashboardRepository$getTransfersDashboard$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        transfersDashboardRepository$getTransfersDashboard$1 = new TransfersDashboardRepository$getTransfersDashboard$1(this, continuationImpl);
        Object obj2 = transfersDashboardRepository$getTransfersDashboard$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfersDashboardRepository$getTransfersDashboard$1.label;
        if (i == 0) {
        }
    }
}
