package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.QueryProductDetailsParams;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.c5g;
import xsna.epx;
import xsna.j5g;

/* loaded from: classes8.dex */
public final class g extends SafeRunnable {
    public final /* synthetic */ i a;
    public final /* synthetic */ BillingResult b;
    public final /* synthetic */ List c;

    public g(i iVar, BillingResult billingResult, List list) {
        this.a = iVar;
        this.b = billingResult;
        this.c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        i iVar = this.a;
        BillingResult billingResult = this.b;
        List<PurchaseHistoryRecord> list = this.c;
        iVar.getClass();
        if (billingResult.getResponseCode() != 0 || list == null) {
            iVar.f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
                for (String str : purchaseHistoryRecord.getProducts()) {
                    String str2 = iVar.d;
                    BillingInfo billingInfo = new BillingInfo(epx.f(str2, "inapp") ? ProductType.INAPP : epx.f(str2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, str, purchaseHistoryRecord.getPurchaseToken(), purchaseHistoryRecord.getPurchaseTime(), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            Map<String, BillingInfo> billingInfoToUpdate = iVar.c.getUpdatePolicy().getBillingInfoToUpdate(iVar.a, linkedHashMap, iVar.c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                m.a(linkedHashMap, billingInfoToUpdate, iVar.d, iVar.c.getBillingInfoManager());
                iVar.f.onUpdateFinished();
            } else {
                List O0 = j5g.O0(billingInfoToUpdate.keySet());
                n nVar = iVar.f;
                h hVar = new h(linkedHashMap, billingInfoToUpdate, iVar);
                String str3 = iVar.d;
                BillingClient billingClient = iVar.b;
                UtilsProvider utilsProvider = iVar.c;
                d dVar = iVar.e;
                f fVar = new f(str3, billingClient, utilsProvider, hVar, list, dVar, nVar);
                dVar.b.add(fVar);
                if (iVar.b.isReady()) {
                    BillingClient billingClient2 = iVar.b;
                    QueryProductDetailsParams.Builder newBuilder = QueryProductDetailsParams.newBuilder();
                    ArrayList arrayList = new ArrayList(c5g.u(O0, 10));
                    Iterator it = O0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it.next()).setProductType(iVar.d).build());
                    }
                    billingClient2.queryProductDetailsAsync(newBuilder.setProductList(arrayList).build(), fVar);
                } else {
                    iVar.e.a(fVar);
                    nVar.onUpdateFinished();
                }
            }
        }
        i iVar2 = this.a;
        iVar2.e.a(iVar2);
    }
}
