package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.logistics.cargo_flow.discovery_map.a;

/* loaded from: classes12.dex */
public final class ou8 implements cai {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ ou8(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    private final void n1() {
    }

    @Override // defpackage.sy60
    public final void a() {
        switch (this.a) {
            case 0:
                break;
            default:
                ((uva) this.b).r(new qu(9));
                break;
        }
    }

    @Override // defpackage.cai
    public final void d(Address address) {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((a) h55Var).r(new yd0(address, 10));
                break;
            default:
                uva uvaVar = (uva) h55Var;
                uvaVar.r(new qu(9));
                ((x240) uvaVar.F).invoke(address);
                break;
        }
    }
}
