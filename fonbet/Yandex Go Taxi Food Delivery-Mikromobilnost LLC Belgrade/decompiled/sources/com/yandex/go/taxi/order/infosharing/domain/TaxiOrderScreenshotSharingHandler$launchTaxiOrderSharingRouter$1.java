package com.yandex.go.taxi.order.infosharing.domain;

import android.net.Uri;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.bvf0;
import defpackage.hxx;
import defpackage.lzu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pep0;
import defpackage.q5y0;
import defpackage.rwo0;
import defpackage.s2y0;
import defpackage.t2y0;
import defpackage.tse;
import defpackage.usc;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$ModalType;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$RideOpenReason;
import ru.yandex.taxi.communications.model.CommunicationItem;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.infosharing.domain.TaxiOrderScreenshotSharingHandler$launchTaxiOrderSharingRouter$1", f = "TaxiOrderScreenshotSharingHandler.kt", l = {66}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderScreenshotSharingHandler$launchTaxiOrderSharingRouter$1 extends SuspendLambda implements wls {
    final /* synthetic */ TaxiOrder $order;
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderScreenshotSharingHandler$launchTaxiOrderSharingRouter$1(b bVar, TaxiOrder taxiOrder, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$order = taxiOrder;
        this.$uri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderScreenshotSharingHandler$launchTaxiOrderSharingRouter$1(this.this$0, this.$order, this.$uri, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderScreenshotSharingHandler$launchTaxiOrderSharingRouter$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            t2y0 t2y0Var = this.this$0.d;
            TaxiOrder taxiOrder = this.$order;
            CommunicationItem.DisplayOnType displayOnType = CommunicationItem.DisplayOnType.RIDE_CUSTOM;
            this.label = 1;
            t2y0Var.getClass();
            obj = bvf0.n(new TaxiOrderInfoSharingPayloadInteractor$getPayloadFromOrder$2(taxiOrder, displayOnType, t2y0Var, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        s2y0 s2y0Var = (s2y0) obj;
        zy11 zy11Var = zy11.a;
        if (s2y0Var == null) {
            return zy11Var;
        }
        Uri uri = this.$uri;
        String str = s2y0Var.a;
        CommunicationModalAnalyticsData$ModalType communicationModalAnalyticsData$ModalType = CommunicationModalAnalyticsData$ModalType.SHARE_ORDER;
        TaxiOrder taxiOrder2 = this.$order;
        q5y0 q5y0Var = new q5y0(uri, true, s2y0Var, new usc(str, communicationModalAnalyticsData$ModalType, taxiOrder2.a, CommunicationModalAnalyticsData$RideOpenReason.SCREENSHOT));
        b bVar = this.this$0;
        ((pep0) this.this$0.g).f(new rwo0(10, bVar.e, new lzu0(26, bVar, taxiOrder2)), q5y0Var, hxx.a);
        return zy11Var;
    }
}
