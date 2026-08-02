package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.feature.offers.PlusPayOfferDetailsConfiguration;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import defpackage.ind0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p2d0;
import defpackage.tse;
import defpackage.wls;
import defpackage.x0u0;
import defpackage.y0u0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.CheckoutViewModel$refreshOfferDetails$1", f = "CheckoutViewModel.kt", l = {316, 326}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CheckoutViewModel$refreshOfferDetails$1 extends SuspendLambda implements wls {
    final /* synthetic */ PlusPayOfferDetailsConfiguration.AdditionalOffers $additionalOffers;
    final /* synthetic */ PlusPayCompositeOfferDetails $fallbackOfferDetails;
    final /* synthetic */ ind0 $scenarioContext;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutViewModel$refreshOfferDetails$1(d dVar, ind0 ind0Var, PlusPayOfferDetailsConfiguration.AdditionalOffers additionalOffers, PlusPayCompositeOfferDetails plusPayCompositeOfferDetails, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$scenarioContext = ind0Var;
        this.$additionalOffers = additionalOffers;
        this.$fallbackOfferDetails = plusPayCompositeOfferDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CheckoutViewModel$refreshOfferDetails$1 checkoutViewModel$refreshOfferDetails$1 = new CheckoutViewModel$refreshOfferDetails$1(this.this$0, this.$scenarioContext, this.$additionalOffers, this.$fallbackOfferDetails, continuation);
        checkoutViewModel$refreshOfferDetails$1.L$0 = obj;
        return checkoutViewModel$refreshOfferDetails$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutViewModel$refreshOfferDetails$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ba, code lost:
    
        if (r3 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bc, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x004b, code lost:
    
        if (r9 == r1) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            r0 r0Var = this.this$0.K;
            Boolean bool = Boolean.TRUE;
            r0Var.getClass();
            r0Var.m(null, bool);
            p2d0 p2d0Var = this.this$0.w;
            PlusPayCompositeOffers.Offer offer = this.$scenarioContext.b.getOffer();
            PlusPayOfferDetailsConfiguration.AdditionalOffers additionalOffers = this.$additionalOffers;
            this.L$0 = tseVar;
            this.label = 1;
            obj = p2d0Var.a(offer, additionalOffers, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                r0 r0Var2 = this.this$0.K;
                Boolean bool2 = Boolean.FALSE;
                r0Var2.getClass();
                r0Var2.m(null, bool2);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails = (PlusPayCompositeOfferDetails) obj;
        if (plusPayCompositeOfferDetails != null) {
            d dVar = this.this$0;
            ind0 ind0Var = this.$scenarioContext;
            r0 r0Var3 = dVar.M;
            String str = (String) r0Var3.getValue();
            if (str == null) {
                List list = ind0Var.c;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String paymentMethodId = ((PlusTarifficatorPurchase) it.next()).getPaymentMethodId();
                    if (paymentMethodId != null) {
                        arrayList.add(paymentMethodId);
                    }
                }
                str = (String) kotlin.collections.a.b0(arrayList);
                if (str == null && (str = dVar.b.getPaymentMethodId()) == null) {
                    str = plusPayCompositeOfferDetails.getMainPaymentMethod();
                }
            }
            r0Var3.l(str);
            r0 r0Var4 = dVar.N;
            r0Var4.getClass();
            r0Var4.m(null, plusPayCompositeOfferDetails);
        } else {
            PlusPayCompositeOfferDetails plusPayCompositeOfferDetails2 = this.$fallbackOfferDetails;
            d dVar2 = this.this$0;
            if (plusPayCompositeOfferDetails2 == null) {
                x0u0 x0u0Var = dVar2.D;
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = 0;
                this.label = 2;
                ((y0u0) x0u0Var).a();
            } else {
                r0 r0Var5 = dVar2.N;
                r0Var5.getClass();
                r0Var5.m(null, plusPayCompositeOfferDetails2);
            }
        }
        r0 r0Var22 = this.this$0.K;
        Boolean bool22 = Boolean.FALSE;
        r0Var22.getClass();
        r0Var22.m(null, bool22);
        return zy11Var;
    }
}
