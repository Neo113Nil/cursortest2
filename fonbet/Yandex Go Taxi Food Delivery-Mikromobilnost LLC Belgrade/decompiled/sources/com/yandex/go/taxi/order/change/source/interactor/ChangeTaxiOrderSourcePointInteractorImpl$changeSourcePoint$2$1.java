package com.yandex.go.taxi.order.change.source.interactor;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.taxi.order.api.change.source.interactor.SourcePointChangeReason;
import com.yandex.go.taxi.order.change.common.data.ConfirmChangeResponse;
import com.yandex.go.taxi.order.change.source.data.ChangeSourceMessageResponse;
import com.yandex.go.taxi.order.change.source.data.SourceChangeReason;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Failure;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Unavailable;
import com.yandex.go.taxi.order.models.api.response.ChangeOrderNotificationActionResponse;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import defpackage.d2t;
import defpackage.eci0;
import defpackage.fmt;
import defpackage.g2t;
import defpackage.g6u;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.o400;
import defpackage.o9j0;
import defpackage.p820;
import defpackage.pv0;
import defpackage.sjh;
import defpackage.tse;
import defpackage.ug9;
import defpackage.uyj;
import defpackage.vg9;
import defpackage.w511;
import defpackage.wls;
import defpackage.zgc0;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.persuggest.api.GeoPointAcquisitionType;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.source.interactor.ChangeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$2$1", f = "ChangeTaxiOrderSourcePointInteractorImpl.kt", l = {67, 69, HProv.ALG_SID_SHA3_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ChangeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ o2y0 $orderHolder;
    final /* synthetic */ String $orderId;
    final /* synthetic */ zzs $point;
    final /* synthetic */ SourcePointChangeReason $reason;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ j this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.change.source.interactor.ChangeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$2$1$1", f = "ChangeTaxiOrderSourcePointInteractorImpl.kt", l = {HProv.ALG_SID_SHA3_384}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.change.source.interactor.ChangeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$2$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ ConfirmChangeResponse $changeSourceDto;
        final /* synthetic */ o2y0 $orderHolder;
        int label;
        final /* synthetic */ j this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(j jVar, ConfirmChangeResponse confirmChangeResponse, o2y0 o2y0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = jVar;
            this.$changeSourceDto = confirmChangeResponse;
            this.$orderHolder = o2y0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$changeSourceDto, this.$orderHolder, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00a7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a8 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            int i2 = 1;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            j jVar = this.this$0;
            ConfirmChangeResponse confirmChangeResponse = this.$changeSourceDto;
            String str = confirmChangeResponse.a;
            o2y0 o2y0Var = this.$orderHolder;
            this.label = 1;
            e eVar = jVar.h;
            OrderChangesDto.Status status = confirmChangeResponse.b;
            ChangeSourceMessageResponse changeSourceMessageResponse = confirmChangeResponse.d;
            int i3 = status == null ? -1 : ug9.a[status.ordinal()];
            if (i3 != -1) {
                if (i3 == 1 || i3 == 2) {
                    b = str != null ? jVar.b(str, o2y0Var, this) : zy11Var;
                } else if (i3 == 3) {
                    ChangeOrderState$Source changeOrderState$Source = ChangeOrderState$Source.SOURCE_POINT;
                    String str2 = changeSourceMessageResponse != null ? changeSourceMessageResponse.a : null;
                    b = eVar.b(o2y0Var, new ChangeOrderState$Unavailable(changeOrderState$Source, new OrderChangesDto.Notification((String) null, str2 == null ? "" : str2, changeSourceMessageResponse != null ? changeSourceMessageResponse.b : null, (ChangeOrderNotificationActionResponse) null, 9)), this);
                } else if (i3 != 4) {
                    w511.b();
                    return null;
                }
                return b != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
            ChangeOrderState$Source changeOrderState$Source2 = ChangeOrderState$Source.SOURCE_POINT;
            String str3 = changeSourceMessageResponse != null ? changeSourceMessageResponse.a : null;
            b = eVar.b(o2y0Var, new ChangeOrderState$Failure(r3, changeOrderState$Source2, new OrderChangesDto.Notification((String) null, str3 == null ? "" : str3, changeSourceMessageResponse != null ? changeSourceMessageResponse.b : null, (ChangeOrderNotificationActionResponse) null, 9), i2), this);
            if (b != coroutineSingletons) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$2$1(j jVar, zzs zzsVar, String str, String str2, SourcePointChangeReason sourcePointChangeReason, o2y0 o2y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$point = zzsVar;
        this.$idempotencyToken = str;
        this.$orderId = str2;
        this.$reason = sourcePointChangeReason;
        this.$orderHolder = o2y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChangeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$2$1(this.this$0, this.$point, this.$idempotencyToken, this.$orderId, this.$reason, this.$orderHolder, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangeTaxiOrderSourcePointInteractorImpl$changeSourcePoint$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x010c, code lost:
    
        if (defpackage.tje.k0(r1, r2, r22) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x010e, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e3, code lost:
    
        if (r0 == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
    
        if (r0 == r6) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object y;
        Address a;
        SourceChangeReason sourceChangeReason;
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.persuggest.domain.g gVar = this.this$0.b;
            zzs zzsVar = this.$point;
            gVar.getClass();
            RoutePointType routePointType = RoutePointType.POINT_A;
            d2t d2tVar = new d2t(new o9j0(routePointType, zzsVar, null, false, false, null, null, "main", null, null, null, 2916), new p820(zzsVar, "manual.alternative_pickup_point_a_tap", "#none#", routePointType, gVar.e.d(), null, null, null, GeoPointAcquisitionType.USER_LOCATION, false, 3552));
            eci0 h = ru.yandex.taxi.persuggest.domain.g.h(gVar, d2tVar, null, 6);
            gVar.a(h, d2tVar);
            ru.yandex.taxi.persuggest.domain.d dVar = new ru.yandex.taxi.persuggest.domain.d(h);
            this.label = 1;
            y = kotlinx.coroutines.flow.e.y(dVar, this);
        } else if (i == 1) {
            kotlin.b.b(obj);
            y = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
            b = obj;
            ConfirmChangeResponse confirmChangeResponse = (ConfirmChangeResponse) ((fmt) b).a;
            this.this$0.a.getClass();
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, confirmChangeResponse, this.$orderHolder, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 3;
        }
        pv0 b2 = this.this$0.i.b((g2t) y);
        c cVar = this.this$0.e;
        String str = this.$idempotencyToken;
        String str2 = this.$orderId;
        if (b2 == null || (a = b2.a) == null) {
            zgc0 zgc0Var = PlainAddress.Companion;
            zzs zzsVar2 = this.$point;
            zgc0Var.getClass();
            a = zgc0.a(zzsVar2);
        }
        int i2 = vg9.a[this.$reason.ordinal()];
        if (i2 == 1) {
            sourceChangeReason = SourceChangeReason.PICKUP_POINT_MANUAL;
        } else {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            sourceChangeReason = SourceChangeReason.ALTPIN_SUGGEST;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        b = cVar.b(str, str2, a, sourceChangeReason, this);
    }
}
