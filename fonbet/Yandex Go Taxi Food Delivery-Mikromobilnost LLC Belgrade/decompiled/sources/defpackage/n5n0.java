package defpackage;

import com.yandex.go.scooters.offers.v2.components.options.ScootersCardOptionsListComponent;

/* loaded from: classes13.dex */
public final class n5n0 implements p5n0 {
    public final /* synthetic */ ScootersCardOptionsListComponent a;

    public n5n0(ScootersCardOptionsListComponent scootersCardOptionsListComponent) {
        this.a = scootersCardOptionsListComponent;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        v5n0 v5n0Var = (v5n0) obj;
        boolean z = v5n0Var instanceof s5n0;
        ScootersCardOptionsListComponent scootersCardOptionsListComponent = this.a;
        if (z) {
            scootersCardOptionsListComponent.error();
            return;
        }
        if (v5n0Var instanceof t5n0) {
            scootersCardOptionsListComponent.loading(((t5n0) v5n0Var).a);
        } else if (!(v5n0Var instanceof u5n0)) {
            w511.b();
        } else {
            u5n0 u5n0Var = (u5n0) v5n0Var;
            scootersCardOptionsListComponent.success(u5n0Var.a, u5n0Var.b);
        }
    }
}
