package xsna;

/* compiled from: OrdersService.kt */
/* loaded from: classes2.dex */
public interface my80 {
    default tfx a(Boolean bool, Boolean bool2) {
        tfx tfxVar = new tfx("orders.setAutoBuyStatus", new bo(29), new sr(22));
        if (bool != null) {
            tfxVar.j("auto_buy_checked", bool.booleanValue());
        }
        tfxVar.j("is_mini_app", bool2.booleanValue());
        return tfxVar;
    }
}
