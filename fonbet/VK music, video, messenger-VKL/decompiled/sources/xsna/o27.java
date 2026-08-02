package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.SharedPreferences;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.vk.billing.a;
import com.vk.log.L;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptySet;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;

/* compiled from: BillingManagerImpl.kt */
/* loaded from: classes.dex */
public final class o27 extends com.vk.billing.a implements BillingClientStateListener, PurchasesUpdatedListener {
    public static BillingClient e;
    public static SharedPreferences f;
    public static final o27 d = new o27();
    public static final ConcurrentLinkedQueue<j27> g = new ConcurrentLinkedQueue<>();
    public static final AtomicBoolean h = new AtomicBoolean(false);

    /* compiled from: BillingManagerImpl.kt */
    /* loaded from: classes15.dex */
    public static final class a extends c implements AcknowledgePurchaseResponseListener {
        public a(Purchase purchase) {
            super(purchase);
        }

        @Override // xsna.o27.c
        public final void b() {
            StringBuilder sb = new StringBuilder("Retrying acknowledgment for purchaseToken ");
            Purchase purchase = this.b;
            sb.append(purchase.getPurchaseToken());
            L.e("Billing : BillingManagerImpl", sb.toString());
            AcknowledgePurchaseParams build = AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build();
            BillingClient billingClient = o27.e;
            if (billingClient == null) {
                billingClient = null;
            }
            billingClient.acknowledgePurchase(build, this);
        }

        @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
        @SuppressLint({"ApplySharedPref"})
        public final void onAcknowledgePurchaseResponse(BillingResult billingResult) {
            L.e("Billing : BillingManagerImpl", "onAcknowledgeResponse: responseCode = " + billingResult.getResponseCode());
            if (billingResult.getResponseCode() == 0) {
                SharedPreferences sharedPreferences = o27.f;
                if (sharedPreferences == null) {
                    sharedPreferences = null;
                }
                Set<String> stringSet = sharedPreferences.getStringSet("acknowledged_tokens", EmptySet.b);
                Set<String> R0 = stringSet != null ? j5g.R0(stringSet) : new LinkedHashSet<>();
                R0.add(this.b.getPurchaseToken());
                SharedPreferences sharedPreferences2 = o27.f;
                (sharedPreferences2 != null ? sharedPreferences2 : null).edit().putStringSet("acknowledged_tokens", R0).commit();
            }
            if (billingResult.getResponseCode() != 0) {
                a();
            }
        }
    }

    /* compiled from: BillingManagerImpl.kt */
    /* loaded from: classes15.dex */
    public static final class b extends c implements ConsumeResponseListener {
        public b(Purchase purchase) {
            super(purchase);
        }

        @Override // xsna.o27.c
        public final void b() {
            StringBuilder sb = new StringBuilder("Retrying consumption for purchaseToken ");
            Purchase purchase = this.b;
            sb.append(purchase.getPurchaseToken());
            L.e("Billing : BillingManagerImpl", sb.toString());
            ConsumeParams build = ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build();
            BillingClient billingClient = o27.e;
            if (billingClient == null) {
                billingClient = null;
            }
            billingClient.consumeAsync(build, this);
        }

        @Override // com.android.billingclient.api.ConsumeResponseListener
        public final void onConsumeResponse(BillingResult billingResult, String str) {
            L.e("Billing : BillingManagerImpl", "onConsumeResponse: responseCode = " + billingResult.getResponseCode());
            if (billingResult.getResponseCode() != 0) {
                a();
            }
        }
    }

    public static void a(String str, Purchase purchase) {
        if (str == null || str.equals("inapp")) {
            ConsumeParams build = ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build();
            BillingClient billingClient = e;
            (billingClient != null ? billingClient : null).consumeAsync(build, new b(purchase));
        } else {
            if (!str.equals("subs")) {
                throw new IllegalArgumentException("Unknown product type ".concat(str));
            }
            AcknowledgePurchaseParams build2 = AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build();
            BillingClient billingClient2 = e;
            (billingClient2 != null ? billingClient2 : null).acknowledgePurchase(build2, new a(purchase));
        }
    }

    public static void b(String str, List list, izs izsVar) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it.next()).setProductType(str).build());
        }
        QueryProductDetailsParams build = QueryProductDetailsParams.newBuilder().setProductList(arrayList).build();
        BillingClient billingClient = e;
        if (billingClient == null) {
            billingClient = null;
        }
        billingClient.queryProductDetailsAsync(build, new j7(izsVar, 5));
    }

    public static void c(String str, izs izsVar) {
        QueryPurchasesParams build = QueryPurchasesParams.newBuilder().setProductType(str).build();
        BillingClient billingClient = e;
        if (billingClient == null) {
            billingClient = null;
        }
        billingClient.queryPurchasesAsync(build, new qa(izsVar, 3));
    }

    public static void f(final Activity activity, String str, final String str2, final String str3) {
        QueryProductDetailsParams build = QueryProductDetailsParams.newBuilder().setProductList(Collections.singletonList(QueryProductDetailsParams.Product.newBuilder().setProductId(str2).setProductType(str).build())).build();
        BillingClient billingClient = e;
        if (billingClient == null) {
            billingClient = null;
        }
        billingClient.queryProductDetailsAsync(build, new ProductDetailsResponseListener() { // from class: xsna.m27
            @Override // com.android.billingclient.api.ProductDetailsResponseListener
            public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                Object obj;
                ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails;
                a.InterfaceC0423a interfaceC0423a;
                a.InterfaceC0423a interfaceC0423a2;
                o27 o27Var = o27.d;
                if (billingResult.getResponseCode() != 0) {
                    int responseCode = billingResult.getResponseCode();
                    WeakReference<a.InterfaceC0423a> weakReference = o27Var.b;
                    if (weakReference == null || (interfaceC0423a2 = weakReference.get()) == null) {
                        return;
                    }
                    interfaceC0423a2.c(responseCode);
                    return;
                }
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (epx.f(((ProductDetails) obj).getProductId(), str2)) {
                            break;
                        }
                    }
                }
                ProductDetails productDetails = (ProductDetails) obj;
                if (productDetails == null) {
                    WeakReference<a.InterfaceC0423a> weakReference2 = o27Var.b;
                    if (weakReference2 == null || (interfaceC0423a = weakReference2.get()) == null) {
                        return;
                    }
                    interfaceC0423a.b();
                    return;
                }
                List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails2 = productDetails.getSubscriptionOfferDetails();
                String offerToken = (subscriptionOfferDetails2 == null || (subscriptionOfferDetails = (ProductDetails.SubscriptionOfferDetails) j5g.a0(subscriptionOfferDetails2)) == null) ? null : subscriptionOfferDetails.getOfferToken();
                BillingFlowParams.ProductDetailsParams.Builder productDetails2 = BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails);
                if (offerToken != null && offerToken.length() != 0) {
                    productDetails2.setOfferToken(offerToken);
                }
                BillingFlowParams build2 = BillingFlowParams.newBuilder().setProductDetailsParamsList(Collections.singletonList(productDetails2.build())).setObfuscatedAccountId(str3).build();
                BillingClient billingClient2 = o27.e;
                (billingClient2 != null ? billingClient2 : null).launchBillingFlow(activity, build2);
            }
        });
    }

    public final boolean d(boolean z) {
        LinkedHashMap linkedHashMap = this.c;
        if (linkedHashMap.get("inapp") == null || linkedHashMap.get("subs") == null || !z) {
            try {
                e("inapp", z);
                e("subs", z);
                Object obj = linkedHashMap.get("inapp");
                Boolean bool = Boolean.TRUE;
                if (epx.f(obj, bool) && epx.f(linkedHashMap.get("subs"), bool)) {
                    L.e("Billing : BaseBillingManager", "billing enabled");
                    return true;
                }
            } catch (Exception e2) {
                L.i(e2);
                return false;
            }
        } else {
            Object obj2 = linkedHashMap.get("inapp");
            Boolean bool2 = Boolean.TRUE;
            if (epx.f(obj2, bool2) && epx.f(linkedHashMap.get("subs"), bool2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(String str, boolean z) {
        BillingClient billingClient = e;
        if (billingClient == null) {
            billingClient = null;
        }
        if (!billingClient.isReady()) {
            L.e("Billing : BillingManagerImpl", "isBillingSupported: billing client isn't ready");
            return false;
        }
        boolean equals = str.equals("inapp");
        LinkedHashMap linkedHashMap = this.c;
        if (equals) {
            linkedHashMap.put(str, Boolean.TRUE);
        } else if (str.equals("subs")) {
            Boolean bool = (Boolean) linkedHashMap.get(str);
            if (bool != null && z) {
                return bool.booleanValue();
            }
            BillingClient billingClient2 = e;
            int responseCode = (billingClient2 != null ? billingClient2 : null).isFeatureSupported(BillingClient.FeatureType.SUBSCRIPTIONS).getResponseCode();
            if (responseCode == 0) {
                linkedHashMap.put(str, Boolean.TRUE);
            }
            L.G("Billing : BillingManagerImpl", "isBillingSupported:" + str + ':' + responseCode);
            if (responseCode == 3) {
                linkedHashMap.put(str, Boolean.FALSE);
            }
        }
        Boolean bool2 = (Boolean) linkedHashMap.get(str);
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        return false;
    }

    public final void g(j27 j27Var) {
        BillingClient billingClient = e;
        if (billingClient == null) {
            billingClient = null;
        }
        if (billingClient.isReady()) {
            L.e("Billing : BillingManagerImpl", "onServiceResolved:".concat(j27Var.getName()));
            j27Var.b();
            return;
        }
        g.add(j27Var);
        if (h.compareAndSet(false, true)) {
            BillingClient billingClient2 = e;
            (billingClient2 != null ? billingClient2 : null).startConnection(this);
        }
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingServiceDisconnected() {
        L.e("Billing : BillingManagerImpl", "onBillingServiceDisconnected");
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingSetupFinished(BillingResult billingResult) {
        h.set(false);
        int responseCode = billingResult.getResponseCode();
        L.e("Billing : BillingManagerImpl", lhg.a(responseCode, "onBillingSetupFinished, responseCode = "));
        ConcurrentLinkedQueue<j27> concurrentLinkedQueue = g;
        if (responseCode == 0) {
            while (!concurrentLinkedQueue.isEmpty()) {
                j27 poll = concurrentLinkedQueue.poll();
                StringBuilder sb = new StringBuilder("onServiceResolved:");
                sb.append(poll != null ? poll.getName() : null);
                L.e("Billing : BillingManagerImpl", sb.toString());
                if (poll != null) {
                    poll.b();
                }
            }
            return;
        }
        while (!concurrentLinkedQueue.isEmpty()) {
            j27 poll2 = concurrentLinkedQueue.poll();
            StringBuilder sb2 = new StringBuilder("onServiceUnavailable:");
            sb2.append(poll2 != null ? poll2.getName() : null);
            L.e("Billing : BillingManagerImpl", sb2.toString());
            if (poll2 != null) {
                poll2.a();
            }
        }
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public final void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
        a.InterfaceC0423a interfaceC0423a;
        a.InterfaceC0423a interfaceC0423a2;
        a.InterfaceC0423a interfaceC0423a3;
        a.InterfaceC0423a interfaceC0423a4;
        a.InterfaceC0423a interfaceC0423a5;
        int responseCode = billingResult.getResponseCode();
        if (responseCode == 0) {
            if (list == null || list.isEmpty()) {
                return;
            }
            Purchase purchase = list.get(0);
            WeakReference<a.InterfaceC0423a> weakReference = d.b;
            if (weakReference == null || (interfaceC0423a = weakReference.get()) == null) {
                return;
            }
            interfaceC0423a.e(purchase);
            return;
        }
        if (responseCode == 1) {
            WeakReference<a.InterfaceC0423a> weakReference2 = this.b;
            if (weakReference2 == null || (interfaceC0423a2 = weakReference2.get()) == null) {
                return;
            }
            interfaceC0423a2.f();
            return;
        }
        if (responseCode == 4) {
            WeakReference<a.InterfaceC0423a> weakReference3 = this.b;
            if (weakReference3 == null || (interfaceC0423a3 = weakReference3.get()) == null) {
                return;
            }
            interfaceC0423a3.b();
            return;
        }
        if (responseCode != 7) {
            WeakReference<a.InterfaceC0423a> weakReference4 = this.b;
            if (weakReference4 == null || (interfaceC0423a5 = weakReference4.get()) == null) {
                return;
            }
            interfaceC0423a5.c(responseCode);
            return;
        }
        Purchase purchase2 = list != null ? (Purchase) j5g.a0(list) : null;
        WeakReference<a.InterfaceC0423a> weakReference5 = this.b;
        if (weakReference5 == null || (interfaceC0423a4 = weakReference5.get()) == null) {
            return;
        }
        interfaceC0423a4.d(purchase2);
    }

    /* compiled from: BillingManagerImpl.kt */
    /* loaded from: classes15.dex */
    public static abstract class c {
        public final Purchase b;
        public int c;

        public c(Purchase purchase) {
            this.b = purchase;
        }

        public final void a() {
            int i = this.c;
            this.c = i + 1;
            if (i <= 3) {
                asu0.a.getClass();
                asu0.r().d(new r44(this, 2), ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS, TimeUnit.MILLISECONDS);
            } else {
                L.e("Billing : BillingManagerImpl", "Reached max attempts for purchaseToken " + this.b.getPurchaseToken());
            }
        }

        public abstract void b();

        /* compiled from: BillingManagerImpl.kt */
        public static final class a implements j27 {
            public a() {
            }

            @Override // xsna.j27
            public final void b() {
                c.this.b();
            }

            @Override // xsna.j27
            public final String getName() {
                return "attemptRetry";
            }

            @Override // xsna.j27
            public final void a() {
            }
        }
    }
}
