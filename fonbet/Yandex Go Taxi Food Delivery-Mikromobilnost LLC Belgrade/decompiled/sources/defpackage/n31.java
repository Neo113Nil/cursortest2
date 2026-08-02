package defpackage;

import com.yandex.go.address.address_map_picker.domain.c;
import com.yandex.go.address.models.Address;
import com.yandex.go.net.taxi.dto.response.NearestZoneResponse;
import defpackage.n31;
import defpackage.tje;
import java.util.Arrays;
import kotlin.a;

/* loaded from: classes12.dex */
public final class n31 extends h55 {
    public final zuj0 D;
    public final jl50 E;
    public final zwx0 F;
    public final c G;
    public final yvf0 H;
    public final i3y I;
    public final i3y J;

    public n31(zuj0 zuj0Var, jl50 jl50Var, zwx0 zwx0Var, c cVar, yvf0 yvf0Var) {
        super(null);
        this.D = zuj0Var;
        this.E = jl50Var;
        this.F = zwx0Var;
        this.G = cVar;
        this.H = yvf0Var;
        final int i = 0;
        this.I = a.a(new sls(this) { // from class: k31
            public final /* synthetic */ n31 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                n31 n31Var = this.b;
                switch (i2) {
                    case 0:
                        return (w71) n31Var.H.get();
                    default:
                        return new m31(n31Var);
                }
            }
        });
        final int i2 = 1;
        this.J = a.a(new sls(this) { // from class: k31
            public final /* synthetic */ n31 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                n31 n31Var = this.b;
                switch (i22) {
                    case 0:
                        return (w71) n31Var.H.get();
                    default:
                        return new m31(n31Var);
                }
            }
        });
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        l31 l31Var = (l31) obj;
        pv0 pv0Var = l31Var.a;
        NearestZoneResponse nearestZoneResponse = pv0Var.d;
        Address address = pv0Var.a;
        String a = nearestZoneResponse != null ? nearestZoneResponse.a() : null;
        if (a == null || evu0.J(a)) {
            String q0 = address.q0();
            zuj0 zuj0Var = this.D;
            a = String.format(((avj0) zuj0Var).h(kyh0.address_region_not_supported), Arrays.copyOf(new Object[]{(q0 == null || q0.length() == 0) ? ((avj0) zuj0Var).h(kyh0.address_region_not_supported_default_prefix) : address.q0()}, 1));
        }
        String str = a;
        mc mcVar = this.E.a;
        A(new da0(13, (i130) mcVar.a.get(), this.F, (lg21) mcVar.b.get()), new hl50(str, nearestZoneResponse != null ? nearestZoneResponse.e : null, nearestZoneResponse != null ? nearestZoneResponse.c() : null, nearestZoneResponse != null ? nearestZoneResponse.b() : null, new Runnable() { // from class: com.yandex.go.address.address_map_picker.navigation.k
            @Override // java.lang.Runnable
            public final void run() {
                n31 n31Var = n31.this;
                tje.N(n31Var.o(), null, null, new AddressMapPickerUnsupportedZoneRouter$onAttach$1$1(n31Var, null), 3);
            }
        }, new hc(9, this, l31Var)), new bb0(this, 4));
    }
}
