package defpackage;

import com.yandex.go.masstransit.sdk.ble.impl.fullscreen.d;
import com.yandex.go.masstransit.sdk.ble.impl.modal.e;
import ru.yandex.taxi.masstransit.geopayment.adapter.a;

/* loaded from: classes12.dex */
public final /* synthetic */ class d010 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ d010(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        d dVar = this.b;
        switch (i) {
            case 0:
                dVar.i();
                return zy11.a;
            case 1:
                n26 n26Var = ((nk30) dVar.n()).a;
                st0 st0Var = dVar.H;
                return new e(n26Var, (xl10) st0Var.b, (xl10) st0Var.x, (pl30) st0Var.a, (i47) st0Var.w, (jse) st0Var.D);
            default:
                st0 st0Var2 = dVar.H;
                return new com.yandex.go.masstransit.sdk.ble.impl.modal.d((u16) st0Var2.A, (a) st0Var2.y, (xl10) st0Var2.b, (z26) st0Var2.z, (xl10) st0Var2.x, dVar.I, (com.yandex.go.masstransit.sdk.ble.impl.domain.a) st0Var2.c, (fl10) st0Var2.C, (pl30) st0Var2.a);
        }
    }
}
