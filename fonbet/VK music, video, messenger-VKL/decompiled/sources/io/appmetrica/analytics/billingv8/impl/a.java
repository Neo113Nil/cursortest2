package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryPurchasesParams;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import xsna.e43;

/* loaded from: classes8.dex */
public final class a extends SafeRunnable {
    public final /* synthetic */ b a;
    public final /* synthetic */ BillingResult b;

    public a(b bVar, BillingResult billingResult) {
        this.a = bVar;
        this.b = billingResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        b bVar = this.a;
        BillingResult billingResult = this.b;
        bVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            bVar.e.onUpdateFinished();
            return;
        }
        if (!bVar.b.isReady()) {
            bVar.e.onUpdateFinished();
            return;
        }
        for (String str : e43.l("inapp", "subs")) {
            BillingConfig billingConfig = bVar.a;
            BillingClient billingClient = bVar.b;
            UtilsProvider utilsProvider = bVar.c;
            d dVar = bVar.d;
            i iVar = new i(billingConfig, billingClient, utilsProvider, str, dVar, bVar.e);
            dVar.b.add(iVar);
            bVar.b.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(str).build(), iVar);
        }
    }
}
