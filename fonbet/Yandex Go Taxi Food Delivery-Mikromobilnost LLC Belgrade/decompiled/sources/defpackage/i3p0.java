package defpackage;

import com.yandex.go.scooters.offers.v2.surge.info.ScootersSurgeInfoModalView;

/* loaded from: classes13.dex */
public final class i3p0 implements k3p0 {
    public final /* synthetic */ ScootersSurgeInfoModalView a;

    public i3p0(ScootersSurgeInfoModalView scootersSurgeInfoModalView) {
        this.a = scootersSurgeInfoModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        g3p0 g3p0Var;
        p3p0 p3p0Var = (p3p0) obj;
        if (p3p0Var instanceof o3p0) {
            g3p0Var = this.a.adapter;
            g3p0Var.submitList(((o3p0) p3p0Var).a, null);
        } else {
            if (jl40.l(p3p0Var, n3p0.a)) {
                return;
            }
            w511.b();
        }
    }
}
