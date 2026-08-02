package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers;

import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffers;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffersReason;
import com.yandex.plus.pay.ui.api.feature.payment.PlusPaymentFlowErrorReason;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.PlusTarifficatorPurchase;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.d;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.ErrorFragment;
import defpackage.dio;
import defpackage.eu90;
import defpackage.ftb;
import defpackage.ind0;
import defpackage.j0f;
import defpackage.j5t;
import defpackage.k0f;
import defpackage.l0f;
import defpackage.m5t;
import defpackage.mvg;
import defpackage.n5t;
import defpackage.ny61;
import defpackage.pgz;
import defpackage.pz40;
import defpackage.rze;
import defpackage.tcc;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xvz;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.CounterOffersViewModel$fetchAndShowCounterOffers$1", f = "CounterOffersViewModel.kt", l = {HProv.PP_INFO, 122}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CounterOffersViewModel$fetchAndShowCounterOffers$1 extends SuspendLambda implements wls {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CounterOffersViewModel$fetchAndShowCounterOffers$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CounterOffersViewModel$fetchAndShowCounterOffers$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CounterOffersViewModel$fetchAndShowCounterOffers$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0115, code lost:
    
        if (r4 == r0) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0190 A[LOOP:0: B:12:0x018a->B:14:0x0190, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0169  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ind0 a;
        PlusPayCounterOffersReason plusPayCounterOffersReason;
        Object a2;
        ind0 ind0Var;
        PlusPayCounterOffersReason plusPayCounterOffersReason2;
        PlusPayCounterOffers plusPayCounterOffers;
        a aVar;
        pz40 pz40Var;
        String id;
        Iterator<T> it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            r0 r0Var = this.this$0.G;
            r0Var.getClass();
            r0Var.m(null, k0f.a);
            a = this.this$0.c.a.a();
            n5t n5tVar = (n5t) this.this$0.w;
            n5tVar.getClass();
            PlusTarifficatorPurchase.Status status = a.b().getStatus();
            if (status instanceof PlusTarifficatorPurchase.Status.Error) {
                PlusPaymentFlowErrorReason reason = ((PlusTarifficatorPurchase.Status.Error) status).getReason();
                if (reason instanceof PlusPaymentFlowErrorReason.Backend) {
                    switch (m5t.a[((PlusPaymentFlowErrorReason.Backend) reason).getKind().ordinal()]) {
                        case 1:
                            plusPayCounterOffersReason = PlusPayCounterOffersReason.PAYMENT_TIMEOUT;
                            break;
                        case 2:
                            plusPayCounterOffersReason = PlusPayCounterOffersReason.BLACKLISTED;
                            break;
                        case 3:
                            plusPayCounterOffersReason = PlusPayCounterOffersReason.EXPIRED_CARD;
                            break;
                        case 4:
                            plusPayCounterOffersReason = PlusPayCounterOffersReason.USER_CANCELLED;
                            break;
                        case 5:
                            plusPayCounterOffersReason = PlusPayCounterOffersReason.RESTRICTED_CARD;
                            break;
                        case 6:
                            plusPayCounterOffersReason = PlusPayCounterOffersReason.FAIL_3DS;
                            break;
                        case 7:
                            plusPayCounterOffersReason = PlusPayCounterOffersReason.NOT_ENOUGH_FUNDS;
                            break;
                        case 8:
                            plusPayCounterOffersReason = PlusPayCounterOffersReason.INVALID_XRF_TOKEN;
                            break;
                        case 9:
                            plusPayCounterOffersReason = PlusPayCounterOffersReason.OPERATION_CANCELLED;
                            break;
                        case 10:
                            plusPayCounterOffersReason = PlusPayCounterOffersReason.AUTHORIZATION_REJECT;
                            break;
                        case 11:
                            plusPayCounterOffersReason = PlusPayCounterOffersReason.TIMEOUT_NO_SUCCESS;
                            break;
                        case 12:
                            plusPayCounterOffersReason = PlusPayCounterOffersReason.TRANSACTION_NOT_PERMITTED;
                            break;
                        case 13:
                            plusPayCounterOffersReason = PlusPayCounterOffersReason.LIMIT_EXCEEDED;
                            break;
                        case 14:
                            plusPayCounterOffersReason = PlusPayCounterOffersReason.UNKNOWN_PAYMENT_ERROR;
                            break;
                        case 15:
                            plusPayCounterOffersReason = PlusPayCounterOffersReason.INTERNAL_ERROR;
                            break;
                        default:
                            w511.b();
                            return null;
                    }
                } else if (reason instanceof PlusPaymentFlowErrorReason.GooglePlay) {
                    plusPayCounterOffersReason = PlusPayCounterOffersReason.GOOGLE_PLAY_ERROR;
                } else if (reason instanceof PlusPaymentFlowErrorReason.Connection) {
                    plusPayCounterOffersReason = PlusPayCounterOffersReason.DATA_LOADING_ERROR;
                } else if (reason instanceof PlusPaymentFlowErrorReason.PaymentMethodSelection) {
                    plusPayCounterOffersReason = PlusPayCounterOffersReason.UNABLE_TO_PAY_BY_SAVED_CARD;
                } else if (reason instanceof PlusPaymentFlowErrorReason.Unauthorized) {
                    plusPayCounterOffersReason = PlusPayCounterOffersReason.UNAUTHORIZED_USER;
                } else {
                    if (!(reason instanceof PlusPaymentFlowErrorReason.Unexpected)) {
                        w511.b();
                        return null;
                    }
                    plusPayCounterOffersReason = PlusPayCounterOffersReason.UNEXPECTED;
                }
            } else {
                if (!(status instanceof PlusTarifficatorPurchase.Status.NotFinished) && !(status instanceof PlusTarifficatorPurchase.Status.Success)) {
                    w511.b();
                    return null;
                }
                pgz pgzVar = n5tVar.a;
                LogPriority logPriority = LogPriority.WARNING;
                if (pgzVar.e(logPriority)) {
                    pgzVar.a(logPriority, "GetCounterOffersReasonInteractorImpl", "There is no reason for counter offers. Fallback to unexpected");
                }
                plusPayCounterOffersReason = PlusPayCounterOffersReason.UNEXPECTED;
            }
            j5t j5tVar = this.this$0.x;
            this.L$0 = a;
            this.L$1 = plusPayCounterOffersReason;
            this.label = 1;
            a2 = ((d) j5tVar).a(a, plusPayCounterOffersReason, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pz40Var = (pz40) this.L$4;
                plusPayCounterOffers = (PlusPayCounterOffers) this.L$3;
                aVar = (a) this.L$2;
                plusPayCounterOffersReason2 = (PlusPayCounterOffersReason) this.L$1;
                ind0Var = (ind0) this.L$0;
                b.b(obj);
                l0f l0fVar = new l0f((rze) obj);
                r0 r0Var2 = (r0) pz40Var;
                r0Var2.getClass();
                r0Var2.m(null, l0fVar);
                eu90 eu90Var = ((j0f) aVar.C).a;
                String d = dio.d(ind0Var.a);
                PlusTarifficatorPurchase plusTarifficatorPurchase = ind0Var.b;
                PlusPayCompositeOffers.Offer.Tariff tariffOffer = plusTarifficatorPurchase.getOffer().getTariffOffer();
                id = tariffOffer != null ? tariffOffer.getId() : null;
                if (id == null) {
                    id = "no_value";
                }
                List<PlusPayCompositeOffers.Offer.Option> optionOffers = plusTarifficatorPurchase.getOffer().getOptionOffers();
                ArrayList arrayList = new ArrayList(tcc.n(optionOffers, 10));
                it = optionOffers.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                }
                String a3 = j0f.a(plusPayCounterOffers);
                String code = plusPayCounterOffersReason2.getCode();
                LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", d, "product_id", id);
                t.put("options_id", arrayList);
                t.put("target", a3);
                t.put(CRLReasonCodeExtension.REASON, code);
                t.put("_meta", eu90.c(new HashMap()));
                eu90Var.f("CounterOffers.Screen.Shown", t);
                return zy11.a;
            }
            plusPayCounterOffersReason = (PlusPayCounterOffersReason) this.L$1;
            ind0 ind0Var2 = (ind0) this.L$0;
            b.b(obj);
            a2 = obj;
            a = ind0Var2;
        }
        PlusPayCounterOffers plusPayCounterOffers2 = (PlusPayCounterOffers) a2;
        a aVar2 = this.this$0;
        if (plusPayCounterOffers2 == null) {
            ftb ftbVar = aVar2.b;
            ftbVar.getClass();
            ftbVar.c(new ErrorFragment(), "Error");
            return zy11.a;
        }
        aVar2.E = plusPayCounterOffersReason;
        aVar2.F = plusPayCounterOffers2;
        r0 r0Var3 = aVar2.G;
        this.L$0 = a;
        this.L$1 = plusPayCounterOffersReason;
        this.L$2 = aVar2;
        this.L$3 = plusPayCounterOffers2;
        this.L$4 = r0Var3;
        this.I$0 = 0;
        this.label = 2;
        Object W = a.W(aVar2, plusPayCounterOffers2, this);
        if (W != coroutineSingletons) {
            ind0 ind0Var3 = a;
            obj = W;
            ind0Var = ind0Var3;
            plusPayCounterOffersReason2 = plusPayCounterOffersReason;
            plusPayCounterOffers = plusPayCounterOffers2;
            aVar = aVar2;
            pz40Var = r0Var3;
            l0f l0fVar2 = new l0f((rze) obj);
            r0 r0Var22 = (r0) pz40Var;
            r0Var22.getClass();
            r0Var22.m(null, l0fVar2);
            eu90 eu90Var2 = ((j0f) aVar.C).a;
            String d2 = dio.d(ind0Var.a);
            PlusTarifficatorPurchase plusTarifficatorPurchase2 = ind0Var.b;
            PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = plusTarifficatorPurchase2.getOffer().getTariffOffer();
            if (tariffOffer2 != null) {
            }
            if (id == null) {
            }
            List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = plusTarifficatorPurchase2.getOffer().getOptionOffers();
            ArrayList arrayList2 = new ArrayList(tcc.n(optionOffers2, 10));
            it = optionOffers2.iterator();
            while (it.hasNext()) {
            }
            String a32 = j0f.a(plusPayCounterOffers);
            String code2 = plusPayCounterOffersReason2.getCode();
            LinkedHashMap t2 = xvz.t(eu90Var2, "purchase_session_id", d2, "product_id", id);
            t2.put("options_id", arrayList2);
            t2.put("target", a32);
            t2.put(CRLReasonCodeExtension.REASON, code2);
            t2.put("_meta", eu90.c(new HashMap()));
            eu90Var2.f("CounterOffers.Screen.Shown", t2);
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
