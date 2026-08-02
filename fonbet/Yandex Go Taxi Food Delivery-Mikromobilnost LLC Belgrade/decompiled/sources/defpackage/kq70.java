package defpackage;

import com.yandex.go.taxi.order.controller.a;

/* loaded from: classes14.dex */
public final /* synthetic */ class kq70 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ kq70(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                aVar.N = false;
                throw new IllegalStateException("Got null zone while resolving for address " + aVar.c.b().u() + " before requesting order");
            case 1:
                aVar.G.b("processCancelledSuccess", new IllegalStateException("Zone is null"), new jl70(16));
                return zy11.a;
            default:
                return "Cannot resolve zone for order with address " + aVar.c.b().u();
        }
    }
}
