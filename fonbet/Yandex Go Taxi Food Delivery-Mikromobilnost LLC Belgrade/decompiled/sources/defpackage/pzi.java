package defpackage;

import com.yandex.go.address.models.Address;

/* loaded from: classes12.dex */
public final class pzi implements fzi {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;
    public final /* synthetic */ h55 c;

    public /* synthetic */ pzi(x3 x3Var, h55 h55Var, int i) {
        this.a = i;
        this.b = x3Var;
        this.c = h55Var;
    }

    @Override // defpackage.si00
    public final void a(Address address) {
        int i = this.a;
        h55 h55Var = this.c;
        x3 x3Var = this.b;
        switch (i) {
            case 0:
                x3Var.I(address);
                ((qzi) h55Var).r(new nni(6));
                break;
            default:
                address.z0("order_summary");
                x3Var.I(address);
                ((olp0) h55Var).r(new tyo0(10));
                break;
        }
    }

    @Override // defpackage.si00
    public final void d() {
        int i = this.a;
        h55 h55Var = this.c;
        x3 x3Var = this.b;
        switch (i) {
            case 0:
                x3Var.cancel();
                ((qzi) h55Var).r(new qu(9));
                break;
            default:
                x3Var.cancel();
                ((olp0) h55Var).r(new qu(9));
                break;
        }
    }

    @Override // defpackage.si00
    public final void j(pv0 pv0Var) {
        int i = this.a;
        x3 x3Var = this.b;
        switch (i) {
            case 0:
                x3Var.I(pv0Var.a);
                break;
            default:
                x3Var.I(pv0Var.a);
                break;
        }
    }
}
