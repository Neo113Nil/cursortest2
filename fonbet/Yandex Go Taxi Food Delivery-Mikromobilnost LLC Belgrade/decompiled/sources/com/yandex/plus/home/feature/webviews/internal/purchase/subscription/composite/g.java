package com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite;

import com.yandex.plus.home.feature.webviews.internal.purchase.subscription.common.SubscriptionProductException;
import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;
import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer;
import com.yandex.plus.pay.adapter.internal.q;
import defpackage.a9h;
import defpackage.bfd0;
import defpackage.dye;
import defpackage.i3y;
import defpackage.mqd;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.ued0;
import defpackage.w511;
import defpackage.ycc;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class g {
    public final bfd0 a;

    public g(bfd0 bfd0Var) {
        this.a = bfd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(SubscriptionConfiguration.Subscription.PaymentMethod paymentMethod, List list, String str, ContinuationImpl continuationImpl) {
        DefaultCompositeSubscriptionProductInteractor$getSubscriptionProducts$1 defaultCompositeSubscriptionProductInteractor$getSubscriptionProducts$1;
        int i;
        PlusPaySdkAdapter$CompositeOffer.Vendor vendor;
        PlusPaySdkAdapter$CompositeOffer.Vendor vendor2;
        i3y i3yVar;
        String id;
        if (continuationImpl instanceof DefaultCompositeSubscriptionProductInteractor$getSubscriptionProducts$1) {
            defaultCompositeSubscriptionProductInteractor$getSubscriptionProducts$1 = (DefaultCompositeSubscriptionProductInteractor$getSubscriptionProducts$1) continuationImpl;
            int i2 = defaultCompositeSubscriptionProductInteractor$getSubscriptionProducts$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultCompositeSubscriptionProductInteractor$getSubscriptionProducts$1.label = i2 - Integer.MIN_VALUE;
                Object obj = defaultCompositeSubscriptionProductInteractor$getSubscriptionProducts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultCompositeSubscriptionProductInteractor$getSubscriptionProducts$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = a9h.a[paymentMethod.ordinal()];
                    if (i3 == 1) {
                        vendor = PlusPaySdkAdapter$CompositeOffer.Vendor.NATIVE;
                    } else {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                throw new SubscriptionProductException.InvalidPaymentMethod(paymentMethod);
                            }
                            w511.b();
                            return null;
                        }
                        vendor = PlusPaySdkAdapter$CompositeOffer.Vendor.GOOGLE_PLAY;
                    }
                    dye dyeVar = new dye(this, vendor);
                    defaultCompositeSubscriptionProductInteractor$getSubscriptionProducts$1.L$0 = null;
                    defaultCompositeSubscriptionProductInteractor$getSubscriptionProducts$1.L$1 = null;
                    defaultCompositeSubscriptionProductInteractor$getSubscriptionProducts$1.L$2 = null;
                    defaultCompositeSubscriptionProductInteractor$getSubscriptionProducts$1.L$3 = null;
                    defaultCompositeSubscriptionProductInteractor$getSubscriptionProducts$1.L$4 = null;
                    defaultCompositeSubscriptionProductInteractor$getSubscriptionProducts$1.L$5 = vendor;
                    defaultCompositeSubscriptionProductInteractor$getSubscriptionProducts$1.label = 1;
                    obj = ((q) this.a).c(str, list, dyeVar, defaultCompositeSubscriptionProductInteractor$getSubscriptionProducts$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    vendor2 = vendor;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vendor2 = (PlusPaySdkAdapter$CompositeOffer.Vendor) defaultCompositeSubscriptionProductInteractor$getSubscriptionProducts$1.L$5;
                    kotlin.b.b(obj);
                }
                mqd mqdVar = (mqd) ((ued0) obj);
                i3yVar = mqdVar.b;
                i3y i3yVar2 = mqdVar.b;
                if (((List) i3yVar.getValue()).isEmpty()) {
                    List list2 = (List) i3yVar2.getValue();
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new CompositeSubscriptionProduct((PlusPaySdkAdapter$CompositeOffer) it.next()));
                    }
                    return arrayList;
                }
                String name = vendor2.name();
                List<PlusPaySdkAdapter$CompositeOffer> list3 = (List) i3yVar2.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer : list3) {
                    List<PlusPaySdkAdapter$CompositeOffer.Option> optionOffers = plusPaySdkAdapter$CompositeOffer.getOptionOffers();
                    ArrayList arrayList3 = new ArrayList(tcc.n(optionOffers, 10));
                    Iterator<T> it2 = optionOffers.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((PlusPaySdkAdapter$CompositeOffer.Option) it2.next()).getId());
                    }
                    PlusPaySdkAdapter$CompositeOffer.Tariff tariffOffer = plusPaySdkAdapter$CompositeOffer.getTariffOffer();
                    List singletonList = (tariffOffer == null || (id = tariffOffer.getId()) == null) ? null : Collections.singletonList(id);
                    if (singletonList == null) {
                        singletonList = EmptyList.a;
                    }
                    ycc.r(kotlin.collections.a.m0(singletonList, arrayList3), arrayList2);
                }
                throw new SubscriptionProductException.NoOffersByVendor(name, arrayList2);
            }
        }
        defaultCompositeSubscriptionProductInteractor$getSubscriptionProducts$1 = new DefaultCompositeSubscriptionProductInteractor$getSubscriptionProducts$1(this, continuationImpl);
        Object obj2 = defaultCompositeSubscriptionProductInteractor$getSubscriptionProducts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultCompositeSubscriptionProductInteractor$getSubscriptionProducts$1.label;
        if (i != 0) {
        }
        mqd mqdVar2 = (mqd) ((ued0) obj2);
        i3yVar = mqdVar2.b;
        i3y i3yVar22 = mqdVar2.b;
        if (((List) i3yVar.getValue()).isEmpty()) {
        }
    }
}
