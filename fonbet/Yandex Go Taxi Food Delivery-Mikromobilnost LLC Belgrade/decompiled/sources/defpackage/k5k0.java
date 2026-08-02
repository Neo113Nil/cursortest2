package defpackage;

import com.yandex.go.rida.bids.router.g;
import com.yandex.go.taxi.order.controller.a;

/* loaded from: classes13.dex */
public final /* synthetic */ class k5k0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ o2y0 c;
    public final /* synthetic */ c29 w;

    public /* synthetic */ k5k0(c29 c29Var, o2y0 o2y0Var, g gVar) {
        this.a = 4;
        this.w = c29Var;
        this.b = gVar;
        this.c = o2y0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        o2y0 o2y0Var = this.c;
        g gVar = this.b;
        c29 c29Var = this.w;
        switch (i) {
            case 0:
                if (o2y0Var.b().I()) {
                    g.S(c29Var, o2y0Var, gVar);
                    break;
                }
                break;
            case 1:
                g.S(c29Var, o2y0Var, gVar);
                break;
            case 2:
                g.S(c29Var, o2y0Var, gVar);
                break;
            case 3:
                if (o2y0Var.b().I()) {
                    g.S(c29Var, o2y0Var, gVar);
                    break;
                }
                break;
            default:
                if (((a) c29Var.b).d()) {
                    gVar.K.c();
                    g.S(c29Var, o2y0Var, gVar);
                    break;
                }
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ k5k0(o2y0 o2y0Var, g gVar, c29 c29Var, int i) {
        this.a = i;
        this.c = o2y0Var;
        this.b = gVar;
        this.w = c29Var;
    }

    public /* synthetic */ k5k0(g gVar, o2y0 o2y0Var, c29 c29Var, int i) {
        this.a = i;
        this.b = gVar;
        this.c = o2y0Var;
        this.w = c29Var;
    }
}
