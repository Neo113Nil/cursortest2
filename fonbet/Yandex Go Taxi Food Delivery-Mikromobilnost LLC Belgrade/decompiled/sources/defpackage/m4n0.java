package defpackage;

import com.yandex.go.scooters.offers.v2.components.bottom.ScootersCardBottomComponent;

/* loaded from: classes13.dex */
public final class m4n0 implements p4n0 {
    public final /* synthetic */ ScootersCardBottomComponent a;

    public m4n0(ScootersCardBottomComponent scootersCardBottomComponent) {
        this.a = scootersCardBottomComponent;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        s4n0 s4n0Var;
        r3n0 r3n0Var = (r3n0) obj;
        boolean z = r3n0Var instanceof q3n0;
        ScootersCardBottomComponent scootersCardBottomComponent = this.a;
        if (z) {
            q3n0 q3n0Var = (q3n0) r3n0Var;
            l3n0 l3n0Var = q3n0Var.b;
            if (jl40.l(l3n0Var, i3n0.a)) {
                scootersCardBottomComponent.renderPhotoVerificationInProgressLayout();
            }
            scootersCardBottomComponent.startButtonProgress(q3n0Var.a, l3n0Var);
            return;
        }
        if (r3n0Var instanceof n3n0) {
            s4n0Var = scootersCardBottomComponent.scootersCardBottomPresenter;
            s4n0Var.Kg(((n3n0) r3n0Var).a);
            return;
        }
        if (r3n0Var instanceof o3n0) {
            scootersCardBottomComponent.error(((o3n0) r3n0Var).a, j3n0.a);
            return;
        }
        if (r3n0Var instanceof p3n0) {
            scootersCardBottomComponent.success((p3n0) r3n0Var);
        } else if (!(r3n0Var instanceof m3n0)) {
            w511.b();
        } else {
            m3n0 m3n0Var = (m3n0) r3n0Var;
            scootersCardBottomComponent.bookIsBlocked(m3n0Var.a, m3n0Var.b);
        }
    }
}
