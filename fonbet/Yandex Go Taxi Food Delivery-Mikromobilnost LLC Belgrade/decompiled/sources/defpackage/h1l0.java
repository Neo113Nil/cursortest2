package defpackage;

import com.yandex.go.taxi.order.api.change.destination.RouteChangeType;

/* loaded from: classes14.dex */
public final /* synthetic */ class h1l0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ k1l0 b;
    public final /* synthetic */ o2y0 c;

    public /* synthetic */ h1l0(k1l0 k1l0Var, o2y0 o2y0Var, int i) {
        this.a = i;
        this.b = k1l0Var;
        this.c = o2y0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        o2y0 o2y0Var = this.c;
        k1l0 k1l0Var = this.b;
        sy60 sy60Var = (sy60) obj;
        switch (i) {
            case 0:
                k1l0Var.F.a(o2y0Var, RouteChangeType.DELETE_MID_POINT);
                sy60Var.a();
                break;
            default:
                k1l0Var.F.a(o2y0Var, RouteChangeType.CHANGE_MID_POINT);
                sy60Var.a();
                break;
        }
        return zy11Var;
    }
}
