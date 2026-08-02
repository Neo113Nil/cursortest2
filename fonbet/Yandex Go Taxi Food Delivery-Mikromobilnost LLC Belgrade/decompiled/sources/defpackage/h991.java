package defpackage;

import ru.yandex.taxi.logistics.sdk.delivery.create.OrderCommitApi;
import ru.yandex.taxi.logistics.sdk.delivery.create.OrderDraftApi;

/* loaded from: classes5.dex */
public abstract class h991 {
    public static final z3k a = new z3k(2);

    public static OrderCommitApi a(t0k0 t0k0Var) {
        return (OrderCommitApi) t0k0Var.b(OrderCommitApi.class);
    }

    public static OrderDraftApi b(t0k0 t0k0Var) {
        return (OrderDraftApi) t0k0Var.b(OrderDraftApi.class);
    }

    public static final String c(String str) {
        return "Bearer ".concat(str);
    }
}
