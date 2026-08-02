package com.yandex.go.taxi.order.change.source.mvp;

import com.yandex.go.analytics.ChangePointInActiveOrderAnalytics$CloseReasonV2;
import com.yandex.go.analytics.ChangePointInActiveOrderAnalytics$PointTypeV2;
import com.yandex.go.taxi.order.change.common.data.ConfirmChangeResponse;
import com.yandex.go.taxi.order.change.source.data.ChangeSourceMessageResponse;
import com.yandex.go.taxi.order.change.source.experiment.ChangeSourcePointExperiment;
import com.yandex.go.taxi.order.change.source.interactor.e;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Failure;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Unavailable;
import com.yandex.go.taxi.order.models.api.response.ChangeOrderNotificationActionResponse;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import defpackage.ac9;
import defpackage.fmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.o61;
import defpackage.pv0;
import defpackage.sf9;
import defpackage.tb9;
import defpackage.tse;
import defpackage.wf9;
import defpackage.wls;
import defpackage.x4e;
import defpackage.yb9;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.source.mvp.ChangeOrderSourceAddressPresenter$confirm$1$1$1", f = "ChangeOrderSourceAddressPresenter.kt", l = {281, 309}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ChangeOrderSourceAddressPresenter$confirm$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ pv0 $addressInfo;
    final /* synthetic */ fmt $response;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeOrderSourceAddressPresenter$confirm$1$1$1(pv0 pv0Var, fmt fmtVar, d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$response = fmtVar;
        this.$addressInfo = pv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        d dVar = this.this$0;
        return new ChangeOrderSourceAddressPresenter$confirm$1$1$1(this.$addressInfo, this.$response, dVar, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangeOrderSourceAddressPresenter$confirm$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f1, code lost:
    
        if (r2.b(r4, r7, r23) == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a9, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a7, code lost:
    
        if (r3.b(r2, r8, r23) == r1) goto L67;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String name;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11.a;
            }
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            this.this$0.F.b(ChangePointInActiveOrderAnalytics$CloseReasonV2.ConfirmUnavailable);
            ((ac9) this.this$0.Dg()).onBack();
            return zy11.a;
        }
        kotlin.b.b(obj);
        ((ac9) this.this$0.Dg()).changeBackButtonVisibility(true);
        ((ac9) this.this$0.Dg()).changeAutoLocateButtonVisibility(true);
        fmt fmtVar = this.$response;
        ConfirmChangeResponse confirmChangeResponse = (ConfirmChangeResponse) fmtVar.a;
        String str = confirmChangeResponse.a;
        wf9 wf9Var = this.this$0.F;
        OrderChangesDto.Status status = confirmChangeResponse.b;
        ChangeSourceMessageResponse changeSourceMessageResponse = confirmChangeResponse.d;
        String str2 = confirmChangeResponse.c;
        String a = fmtVar.e.a("X-YaTraceId");
        o61 o61Var = wf9Var.a;
        ChangePointInActiveOrderAnalytics$PointTypeV2 changePointInActiveOrderAnalytics$PointTypeV2 = ChangePointInActiveOrderAnalytics$PointTypeV2.Source;
        String str3 = str == null ? "" : str;
        String lowerCase = (status == null || (name = status.name()) == null) ? null : name.toLowerCase(Locale.ROOT);
        if (str2 == null) {
            str2 = "";
        }
        if (a == null) {
            a = "";
        }
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        if (changePointInActiveOrderAnalytics$PointTypeV2 != null) {
            hashMap.put("type", changePointInActiveOrderAnalytics$PointTypeV2.getEventValue());
        }
        hashMap.put("change_id", str3);
        if (lowerCase != null) {
            hashMap.put(ACSPConstants.STATUS, lowerCase);
        }
        o61Var.a.a("ChangePointInActiveOrder.ConfirmResult", hashMap, 2, x4e.q(hashMap, CRLReasonCodeExtension.REASON, str2, "trace_id", a));
        int i2 = status == null ? -1 : yb9.a[status.ordinal()];
        if (i2 == 1 || i2 == 2) {
            d dVar = this.this$0;
            if (str != null) {
                dVar.E.a.h(new tb9(dVar.x.a.b().a, str, ChangeOrderState$Source.SOURCE_POINT));
                this.this$0.F.b(ChangePointInActiveOrderAnalytics$CloseReasonV2.PollingStarted);
                ((ac9) this.this$0.Dg()).onSourceAddressChanged(this.$addressInfo);
                ((ac9) this.this$0.Dg()).onBack();
            } else {
                e eVar = dVar.D;
                o2y0 o2y0Var = dVar.x.a;
                ChangeOrderState$Failure changeOrderState$Failure = new ChangeOrderState$Failure(str, ChangeOrderState$Source.SOURCE_POINT, changeSourceMessageResponse != null ? new OrderChangesDto.Notification((String) null, changeSourceMessageResponse.a, changeSourceMessageResponse.b, ChangeOrderNotificationActionResponse.COMMUNICATE_WITH_DRIVER, 1) : null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
            }
            return zy11.a;
        }
        d dVar2 = this.this$0;
        if (i2 == 3) {
            dVar2.Ng(false, (r3 & 2) == 0, (ChangeSourcePointExperiment) dVar2.H.getValue());
            ac9 ac9Var = (ac9) this.this$0.Dg();
            String str4 = changeSourceMessageResponse != null ? changeSourceMessageResponse.a : null;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = changeSourceMessageResponse != null ? changeSourceMessageResponse.b : null;
            ac9Var.changePinState(new sf9(str4, str5 != null ? str5 : ""));
            return zy11.a;
        }
        e eVar2 = dVar2.D;
        o2y0 o2y0Var2 = dVar2.x.a;
        ChangeOrderState$Unavailable changeOrderState$Unavailable = new ChangeOrderState$Unavailable(ChangeOrderState$Source.SOURCE_POINT, changeSourceMessageResponse != null ? new OrderChangesDto.Notification((String) null, changeSourceMessageResponse.a, changeSourceMessageResponse.b, (ChangeOrderNotificationActionResponse) null, 9) : null);
        this.L$0 = null;
        this.label = 2;
    }
}
