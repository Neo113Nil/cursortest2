package xsna;

import android.app.Activity;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.vk.billing.GoogleStorePurchasesManagerImpl;
import com.vk.billing.StorePurchasesManager;
import com.vk.billing.a;
import com.vk.mediapicker.impl.presentation.mvi.MediaPickerMviState;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.tra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class x0s implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x0s(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List<Purchase> list;
        BillingClient billingClient;
        Object obj2;
        StorePurchasesManager.a<D> aVar;
        switch (this.b) {
            case 0:
                ((z0s) this.d).c.d(new c580(this.c));
                return s3q0.a;
            case 1:
                return MediaPickerMviState.a((MediaPickerMviState) ((com.vk.mediapicker.impl.presentation.mvi.b) this.d).b.getCurrentState(), 0, null, false, rdi.A(this.c, ((MediaPickerMviState) obj).f), null, 47);
            case 2:
                com.vk.billing.h hVar = (com.vk.billing.h) this.d;
                D d = hVar.d;
                final int i = this.c;
                l27 l27Var = (l27) obj;
                try {
                    list = l27Var.b;
                } catch (Exception unused) {
                    com.vk.billing.h.q();
                }
                if (l27Var.a.getResponseCode() != 0) {
                    throw new GoogleStorePurchasesManagerImpl.PayNotAvailableException();
                }
                Iterator<T> it = list.iterator();
                while (true) {
                    billingClient = null;
                    if (it.hasNext()) {
                        obj2 = it.next();
                        List<String> products = ((Purchase) obj2).getProducts();
                        if (!(products instanceof Collection) || !products.isEmpty()) {
                            Iterator<T> it2 = products.iterator();
                            while (it2.hasNext()) {
                                if (epx.f((String) it2.next(), d.R8())) {
                                }
                            }
                        }
                    } else {
                        obj2 = null;
                    }
                }
                final Purchase purchase = (Purchase) obj2;
                hVar.j = purchase;
                hVar.i = "subs";
                if (purchase == null) {
                    if (d != 0 && (aVar = hVar.e) != 0) {
                        aVar.d(d);
                    }
                    return s3q0.a;
                }
                final Activity activity = hVar.f.get();
                if (activity != null) {
                    o27 o27Var = hVar.b;
                    final String W6 = d.W6();
                    o27Var.getClass();
                    QueryProductDetailsParams build = QueryProductDetailsParams.newBuilder().setProductList(Collections.singletonList(QueryProductDetailsParams.Product.newBuilder().setProductId("combo_android_1m_169_notrial").setProductType("subs").build())).build();
                    BillingClient billingClient2 = o27.e;
                    if (billingClient2 != null) {
                        billingClient = billingClient2;
                    }
                    billingClient.queryProductDetailsAsync(build, new ProductDetailsResponseListener() { // from class: xsna.n27
                        @Override // com.android.billingclient.api.ProductDetailsResponseListener
                        public final void onProductDetailsResponse(BillingResult billingResult, List list2) {
                            Object obj3;
                            ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails;
                            a.InterfaceC0423a interfaceC0423a;
                            a.InterfaceC0423a interfaceC0423a2;
                            o27 o27Var2 = o27.d;
                            if (billingResult.getResponseCode() != 0) {
                                int responseCode = billingResult.getResponseCode();
                                WeakReference<a.InterfaceC0423a> weakReference = o27Var2.b;
                                if (weakReference == null || (interfaceC0423a2 = weakReference.get()) == null) {
                                    return;
                                }
                                interfaceC0423a2.c(responseCode);
                                return;
                            }
                            Iterator it3 = list2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    obj3 = null;
                                    break;
                                } else {
                                    obj3 = it3.next();
                                    if (epx.f(((ProductDetails) obj3).getProductId(), "combo_android_1m_169_notrial")) {
                                        break;
                                    }
                                }
                            }
                            ProductDetails productDetails = (ProductDetails) obj3;
                            if (productDetails == null) {
                                WeakReference<a.InterfaceC0423a> weakReference2 = o27Var2.b;
                                if (weakReference2 == null || (interfaceC0423a = weakReference2.get()) == null) {
                                    return;
                                }
                                interfaceC0423a.b();
                                return;
                            }
                            List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails2 = productDetails.getSubscriptionOfferDetails();
                            String offerToken = (subscriptionOfferDetails2 == null || (subscriptionOfferDetails = (ProductDetails.SubscriptionOfferDetails) j5g.a0(subscriptionOfferDetails2)) == null) ? null : subscriptionOfferDetails.getOfferToken();
                            BillingFlowParams.SubscriptionUpdateParams build2 = BillingFlowParams.SubscriptionUpdateParams.newBuilder().setOldPurchaseToken(Purchase.this.getPurchaseToken()).setSubscriptionReplacementMode(i).build();
                            BillingFlowParams.ProductDetailsParams.Builder productDetails2 = BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails);
                            if (offerToken != null && offerToken.length() != 0) {
                                productDetails2.setOfferToken(offerToken);
                            }
                            BillingFlowParams build3 = BillingFlowParams.newBuilder().setSubscriptionUpdateParams(build2).setProductDetailsParamsList(Collections.singletonList(productDetails2.build())).setObfuscatedAccountId(W6).build();
                            BillingClient billingClient3 = o27.e;
                            (billingClient3 != null ? billingClient3 : null).launchBillingFlow(activity, build3);
                        }
                    });
                }
                return s3q0.a;
            default:
                tra0.a aVar2 = (tra0.a) obj;
                Iterator it3 = ((ArrayList) this.d).iterator();
                int i2 = 0;
                while (it3.hasNext()) {
                    Pair pair = (Pair) it3.next();
                    int intValue = ((Number) pair.j()).intValue();
                    int i3 = 0;
                    for (tra0 tra0Var : (List) pair.i()) {
                        tra0.a.x(aVar2, tra0Var, i3, x9.b(intValue, tra0Var.c, 2, i2));
                        i3 += tra0Var.b;
                    }
                    i2 += intValue + this.c;
                }
                return s3q0.a;
        }
    }
}
