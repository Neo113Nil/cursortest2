package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.android.billingclient.api.QueryPurchasesParams;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;
import xsna.gzs;

/* loaded from: classes8.dex */
public final class e extends SafeRunnable {
    public final /* synthetic */ f a;
    public final /* synthetic */ BillingResult b;
    public final /* synthetic */ QueryProductDetailsResult c;

    public e(f fVar, BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        this.a = fVar;
        this.b = billingResult;
        this.c = queryProductDetailsResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        f fVar = this.a;
        BillingResult billingResult = this.b;
        List productDetailsList = this.c.getProductDetailsList();
        fVar.getClass();
        if (billingResult.getResponseCode() != 0 || productDetailsList.isEmpty()) {
            fVar.g.onUpdateFinished();
        } else {
            UtilsProvider utilsProvider = fVar.c;
            gzs gzsVar = fVar.d;
            List list = fVar.e;
            d dVar = fVar.f;
            k kVar = new k(utilsProvider, gzsVar, list, productDetailsList, dVar, fVar.g);
            dVar.b.add(kVar);
            if (fVar.b.isReady()) {
                fVar.b.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(fVar.a).build(), kVar);
            } else {
                fVar.f.a(kVar);
                fVar.g.onUpdateFinished();
            }
        }
        f fVar2 = this.a;
        fVar2.f.a(fVar2);
    }
}
