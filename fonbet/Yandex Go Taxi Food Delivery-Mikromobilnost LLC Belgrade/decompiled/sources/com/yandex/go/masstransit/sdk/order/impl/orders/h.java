package com.yandex.go.masstransit.sdk.order.impl.orders;

import com.yandex.go.masstransit.sdk.order.api.orders.OrderRequestException;
import com.yandex.go.masstransit.sdk.order.impl.orders.network.GetMasstransitOrderParams;
import com.yandex.go.masstransit.sdk.order.impl.orders.network.GetMasstransitOrderResponse;
import com.yandex.go.masstransit.sdk.order.impl.orders.network.MasstransitOrdersApi;
import com.yandex.go.masstransit.sdk.order.impl.orders.network.MasstransitOrdersParams;
import com.yandex.go.masstransit.sdk.order.impl.orders.network.MasstransitOrdersResponse;
import defpackage.bwq;
import defpackage.ck;
import defpackage.cmt;
import defpackage.fmt;
import defpackage.gtq0;
import defpackage.h20;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.on2;
import defpackage.p0u;
import defpackage.s8o;
import defpackage.ws00;
import defpackage.wwg;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class h {
    public final i3y a;

    public h(on2 on2Var) {
        this.a = kotlin.a.a(new ck(on2Var, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(GetMasstransitOrderParams getMasstransitOrderParams, ContinuationImpl continuationImpl) {
        MasstransitOrdersRemoteGatewayImpl$fetchOrder$1 masstransitOrdersRemoteGatewayImpl$fetchOrder$1;
        int i;
        try {
            if (continuationImpl instanceof MasstransitOrdersRemoteGatewayImpl$fetchOrder$1) {
                masstransitOrdersRemoteGatewayImpl$fetchOrder$1 = (MasstransitOrdersRemoteGatewayImpl$fetchOrder$1) continuationImpl;
                int i2 = masstransitOrdersRemoteGatewayImpl$fetchOrder$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    masstransitOrdersRemoteGatewayImpl$fetchOrder$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = masstransitOrdersRemoteGatewayImpl$fetchOrder$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = masstransitOrdersRemoteGatewayImpl$fetchOrder$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<GetMasstransitOrderResponse> b = ((MasstransitOrdersApi) this.a.getValue()).b(getMasstransitOrderParams);
                        ws00 ws00Var = new ws00(14);
                        masstransitOrdersRemoteGatewayImpl$fetchOrder$1.L$0 = null;
                        masstransitOrdersRemoteGatewayImpl$fetchOrder$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.b(b, ws00Var, masstransitOrdersRemoteGatewayImpl$fetchOrder$1);
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
                    fmt fmtVar = (fmt) obj;
                    return new bwq(((GetMasstransitOrderResponse) fmtVar.a).getA(), fmtVar.e.a("X-YaMasstransitRequestId"));
                }
            }
            if (i != 0) {
            }
            fmt fmtVar2 = (fmt) obj;
            return new bwq(((GetMasstransitOrderResponse) fmtVar2.a).getA(), fmtVar2.e.a("X-YaMasstransitRequestId"));
        } catch (Throwable th) {
            throw new OrderRequestException(gtq0.y(s8o.O(th)), th);
        }
        masstransitOrdersRemoteGatewayImpl$fetchOrder$1 = new MasstransitOrdersRemoteGatewayImpl$fetchOrder$1(this, continuationImpl);
        Object obj2 = masstransitOrdersRemoteGatewayImpl$fetchOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = masstransitOrdersRemoteGatewayImpl$fetchOrder$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(MasstransitOrdersParams masstransitOrdersParams, ContinuationImpl continuationImpl) {
        MasstransitOrdersRemoteGatewayImpl$requestActiveOrders$1 masstransitOrdersRemoteGatewayImpl$requestActiveOrders$1;
        int i;
        if (continuationImpl instanceof MasstransitOrdersRemoteGatewayImpl$requestActiveOrders$1) {
            masstransitOrdersRemoteGatewayImpl$requestActiveOrders$1 = (MasstransitOrdersRemoteGatewayImpl$requestActiveOrders$1) continuationImpl;
            int i2 = masstransitOrdersRemoteGatewayImpl$requestActiveOrders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                masstransitOrdersRemoteGatewayImpl$requestActiveOrders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = masstransitOrdersRemoteGatewayImpl$requestActiveOrders$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = masstransitOrdersRemoteGatewayImpl$requestActiveOrders$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cmt<MasstransitOrdersResponse> a = ((MasstransitOrdersApi) this.a.getValue()).a(masstransitOrdersParams);
                    p0u p0uVar = new p0u(28);
                    masstransitOrdersRemoteGatewayImpl$requestActiveOrders$1.L$0 = null;
                    masstransitOrdersRemoteGatewayImpl$requestActiveOrders$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.b(a, p0uVar, masstransitOrdersRemoteGatewayImpl$requestActiveOrders$1);
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
                fmt fmtVar = (fmt) obj;
                return new h20(fmtVar.e.a("X-YaMasstransitRequestId"), wwg.l(fmtVar));
            }
        }
        masstransitOrdersRemoteGatewayImpl$requestActiveOrders$1 = new MasstransitOrdersRemoteGatewayImpl$requestActiveOrders$1(this, continuationImpl);
        Object obj2 = masstransitOrdersRemoteGatewayImpl$requestActiveOrders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = masstransitOrdersRemoteGatewayImpl$requestActiveOrders$1.label;
        if (i != 0) {
        }
        fmt fmtVar2 = (fmt) obj2;
        return new h20(fmtVar2.e.a("X-YaMasstransitRequestId"), wwg.l(fmtVar2));
    }
}
