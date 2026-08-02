package defpackage;

import com.yandex.go.scooters.zones.legend.ui.ScootersZonesLegendModalView;

/* loaded from: classes13.dex */
public final class lap0 implements nap0 {
    public final /* synthetic */ ScootersZonesLegendModalView a;

    public lap0(ScootersZonesLegendModalView scootersZonesLegendModalView) {
        this.a = scootersZonesLegendModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        eap0 eap0Var;
        zap0 zap0Var = (zap0) obj;
        if (zap0Var instanceof yap0) {
            eap0Var = this.a.adapter;
            eap0Var.submitList(((yap0) zap0Var).a, null);
        } else {
            if (jl40.l(zap0Var, xap0.a)) {
                return;
            }
            w511.b();
        }
    }
}
