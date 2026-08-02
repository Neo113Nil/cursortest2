package defpackage;

import com.yandex.go.scooters.offers.v2.components.scooters.ScootersListComponent;

/* loaded from: classes13.dex */
public final class iwn0 implements mwn0 {
    public final /* synthetic */ ScootersListComponent a;

    public iwn0(ScootersListComponent scootersListComponent) {
        this.a = scootersListComponent;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        w4o0 w4o0Var = (w4o0) obj;
        boolean z = w4o0Var instanceof u4o0;
        ScootersListComponent scootersListComponent = this.a;
        if (z) {
            scootersListComponent.loading(((u4o0) w4o0Var).a);
            return;
        }
        if (jl40.l(w4o0Var, v4o0.a)) {
            scootersListComponent.hideView();
        } else if (w4o0Var instanceof t4o0) {
            scootersListComponent.showViewWithScooters((t4o0) w4o0Var);
        } else {
            w511.b();
        }
    }
}
