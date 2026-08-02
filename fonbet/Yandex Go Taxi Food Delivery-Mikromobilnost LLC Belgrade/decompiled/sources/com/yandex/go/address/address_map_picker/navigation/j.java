package com.yandex.go.address.address_map_picker.navigation;

import com.yandex.go.address.address_map_picker.analytics.ClarifyAnalytics$ClarifyModalType;
import com.yandex.go.address.address_map_picker.analytics.ClarifyAnalytics$ClarifyPointType;
import com.yandex.go.address.address_map_picker.analytics.ClarifyAnalytics$ClarifySourceScreen;
import com.yandex.go.address.address_map_picker.data.AddressMapPickerAddressStateRepository;
import com.yandex.go.address.address_map_picker.navigation.j;
import com.yandex.go.navigation.screen.api.Screen;
import defpackage.a21;
import defpackage.a31;
import defpackage.ayb;
import defpackage.c11;
import defpackage.c21;
import defpackage.c8w;
import defpackage.d11;
import defpackage.e11;
import defpackage.f11;
import defpackage.f21;
import defpackage.g11;
import defpackage.g21;
import defpackage.h11;
import defpackage.h55;
import defpackage.i11;
import defpackage.i3y;
import defpackage.j01;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.k01;
import defpackage.lf;
import defpackage.n1j0;
import defpackage.ooa1;
import defpackage.pn0;
import defpackage.sls;
import defpackage.vng;
import defpackage.w21;
import defpackage.w511;
import defpackage.y21;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class j extends h55 {
    public final yvf0 D;
    public final com.yandex.go.address.address_map_picker.domain.c E;
    public final AddressMapPickerAddressStateRepository F;
    public final g21 G;
    public final yvf0 H;
    public final c8w I;
    public final lf J;
    public final com.yandex.go.navigation.screen.c K;
    public final ayb L;
    public final i3y M;
    public final i3y N;
    public final i3y O;
    public final i3y P;
    public final i3y Q;

    public j(yvf0 yvf0Var, com.yandex.go.address.address_map_picker.domain.c cVar, AddressMapPickerAddressStateRepository addressMapPickerAddressStateRepository, g21 g21Var, yvf0 yvf0Var2, c8w c8wVar, lf lfVar, com.yandex.go.navigation.screen.c cVar2, ayb aybVar) {
        super(null);
        this.D = yvf0Var;
        this.E = cVar;
        this.F = addressMapPickerAddressStateRepository;
        this.G = g21Var;
        this.H = yvf0Var2;
        this.I = c8wVar;
        this.J = lfVar;
        this.K = cVar2;
        this.L = aybVar;
        final int i = 0;
        this.M = kotlin.a.a(new sls(this) { // from class: x21
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                j jVar = this.b;
                switch (i2) {
                    case 0:
                        return (c11) jVar.D.get();
                    case 1:
                        return (n31) jVar.H.get();
                    case 2:
                        return (uce0) jVar.I.get();
                    default:
                        return (k01) jVar.J.get();
                }
            }
        });
        final int i2 = 1;
        this.N = kotlin.a.a(new sls(this) { // from class: x21
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                j jVar = this.b;
                switch (i22) {
                    case 0:
                        return (c11) jVar.D.get();
                    case 1:
                        return (n31) jVar.H.get();
                    case 2:
                        return (uce0) jVar.I.get();
                    default:
                        return (k01) jVar.J.get();
                }
            }
        });
        final int i3 = 2;
        this.O = kotlin.a.a(new sls(this) { // from class: x21
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                j jVar = this.b;
                switch (i22) {
                    case 0:
                        return (c11) jVar.D.get();
                    case 1:
                        return (n31) jVar.H.get();
                    case 2:
                        return (uce0) jVar.I.get();
                    default:
                        return (k01) jVar.J.get();
                }
            }
        });
        final int i4 = 3;
        this.P = kotlin.a.a(new sls(this) { // from class: x21
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i4;
                j jVar = this.b;
                switch (i22) {
                    case 0:
                        return (c11) jVar.D.get();
                    case 1:
                        return (n31) jVar.H.get();
                    case 2:
                        return (uce0) jVar.I.get();
                    default:
                        return (k01) jVar.J.get();
                }
            }
        });
        this.Q = kotlin.a.a(new pn0(13));
    }

    public static final void P(j jVar) {
        jVar.B((c11) jVar.M.getValue(), zy11.a, new y21(jVar), new n1j0((k01) jVar.P.getValue()));
    }

    public static final void Q(j jVar, f21 f21Var, w21 w21Var, ClarifyAnalytics$ClarifyModalType clarifyAnalytics$ClarifyModalType) {
        ClarifyAnalytics$ClarifyPointType clarifyAnalytics$ClarifyPointType;
        ayb aybVar = jVar.L;
        int i = a21.a[f21Var.a.ordinal()];
        if (i == 1) {
            clarifyAnalytics$ClarifyPointType = ClarifyAnalytics$ClarifyPointType.A;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            clarifyAnalytics$ClarifyPointType = ClarifyAnalytics$ClarifyPointType.B;
        }
        ClarifyAnalytics$ClarifySourceScreen c = ooa1.c(w21Var.b);
        aybVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("point_type", clarifyAnalytics$ClarifyPointType.getEventValue());
        hashMap.put("source_screen", c.getEventValue());
        hashMap.put("modal_type", clarifyAnalytics$ClarifyModalType.getEventValue());
        aybVar.a.a("Clarify.Modal.Shown", hashMap, 1, new HashMap());
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        Screen screen;
        w21 w21Var = (w21) obj;
        i11 i11Var = w21Var.a;
        if (i11Var instanceof e11) {
            int i = a31.a[((e11) i11Var).a.ordinal()];
            if (i == 1) {
                screen = Screen.ROUTE_SELECTOR;
            } else {
                if (i != 2) {
                    w511.b();
                    return;
                }
                screen = Screen.CHOOSE_B;
            }
        } else if (jl40.l(i11Var, h11.a) || jl40.l(i11Var, g11.a) || jl40.l(i11Var, d11.a)) {
            screen = Screen.ROUTE_SELECTOR;
        } else {
            if (!jl40.l(i11Var, f11.a)) {
                w511.b();
                return;
            }
            screen = Screen.CHOOSE_B;
        }
        this.K.i(screen);
        kotlinx.coroutines.flow.e.H(o(), new jqr(vng.l(this.G.b, new j01(8), vng.c), new AddressMapPickerUiRouterImpl$observeAddressViewType$2(this, w21Var, null), 3));
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        com.yandex.go.navigation.screen.c cVar = this.K;
        cVar.i(cVar.d());
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        z((k01) this.P.getValue(), new c21());
    }
}
