package xsna;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: OrderListRepositoryImpl.kt */
/* loaded from: classes18.dex */
public final class vv80 {
    public final yd10 a;
    public final bpn0 b = new bpn0(new uv80(0));
    public final bpn0 c = new bpn0(new ml7(22));

    public vv80(yd10 yd10Var) {
        this.a = yd10Var;
    }

    public final io.reactivex.rxjava3.internal.operators.single.y a(int i) {
        Integer valueOf = Integer.valueOf(i);
        Integer num = 5;
        this.a.getClass();
        tfx tfxVar = new tfx("market.getOrders", new gp(22), new eq0(17));
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, valueOf.intValue(), 0, 0, 8);
        tfxVar.f(num.intValue(), 0, 10, "count");
        tfxVar.j("extended", true);
        return rsg0.w0(yfb.x(tfxVar)).l(new qs6(new mf8(1, (iv80) this.b.getValue(), iv80.class, "map", "map(Lcom/vk/api/generated/market/dto/MarketGetOrdersExtendedResponseDto;)Lcom/vk/ecomm/orders/impl/orderlist/domain/OrdersResponse;", 0, 9), 26));
    }
}
