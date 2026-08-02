package defpackage;

import com.yandex.go.address.models.Address;

/* loaded from: classes13.dex */
public final class fai implements ax4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fai(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ax4
    public final void t(pv0 pv0Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((gai) obj).r(new t71(pv0Var, 3));
                break;
            case 1:
                ((ej1) obj).r(new t71(pv0Var, 17));
                break;
            default:
                zzs B = pv0Var.a.B();
                Address address = pv0Var.a;
                address.d();
                address.D1();
                ((uyo0) obj).invoke(new k7n0(B));
                break;
        }
    }
}
