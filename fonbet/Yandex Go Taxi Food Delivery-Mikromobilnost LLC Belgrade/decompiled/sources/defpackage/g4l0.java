package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.places.impl.navigation.a;

/* loaded from: classes12.dex */
public final class g4l0 implements pf50 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zsa b;

    public /* synthetic */ g4l0(zsa zsaVar, int i) {
        this.a = i;
        this.b = zsaVar;
    }

    private final void n1() {
    }

    @Override // defpackage.pf50
    public final void V() {
        switch (this.a) {
            case 0:
                zsa zsaVar = this.b;
                zsaVar.D((m950) ((yvf0) zsaVar.E).get(), new qf50(vf50.a, true), new g4l0(zsaVar, 1));
                break;
        }
    }

    @Override // defpackage.sy60
    public final void a() {
        switch (this.a) {
            case 0:
                this.b.r(new qu(9));
                break;
            default:
                this.b.Q(null);
                break;
        }
    }

    @Override // defpackage.pf50
    public final void p0(pv0 pv0Var) {
        int i = this.a;
        zsa zsaVar = this.b;
        switch (i) {
            case 0:
                ti80 b = dpa1.b(pv0Var);
                Address address = pv0Var.a;
                if (b == null) {
                    ((re50) zsaVar.F).a(new ne50(address), null);
                    zsaVar.r(new z0l0(1));
                    break;
                } else {
                    ((a) ((h3y) zsaVar.G).get()).a(new xl80(suj.b, b, eg80.b, null, null, false, null, null, null, null, null, null, null, 8152), new llm(zsaVar, address, 2));
                    break;
                }
            default:
                ((re50) zsaVar.F).b(new oe50(pv0Var.a));
                zsaVar.Q(null);
                break;
        }
    }
}
