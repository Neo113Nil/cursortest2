package defpackage;

import com.yandex.go.taxi.order.map.overlay.traffic.b;

/* loaded from: classes14.dex */
public final /* synthetic */ class g901 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ g901(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                bVar.g.g(zy11Var);
                break;
            default:
                bVar.c();
                break;
        }
        return zy11Var;
    }
}
