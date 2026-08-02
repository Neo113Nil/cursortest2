package com.yandex.go.places.searchbar.impl.ui;

import com.yandex.go.places.searchbar.impl.ui.PlacesSearchbarContainerView;
import com.yandex.go.places.searchbar.impl.ui.searchbar.PlacesSearchbarView;
import defpackage.afc0;
import defpackage.dec0;
import defpackage.eec0;
import defpackage.fec0;
import defpackage.gec0;
import defpackage.i4b0;
import defpackage.jl40;
import defpackage.pec0;
import defpackage.q6c0;
import defpackage.sec0;
import defpackage.sls;
import defpackage.tec0;
import defpackage.uec0;
import defpackage.w511;
import defpackage.ww90;
import defpackage.xec0;
import defpackage.xw8;
import defpackage.xw90;
import defpackage.yce;
import defpackage.yec0;
import defpackage.zy11;
import ru.yandex.taxi.HapticController$Effect;

/* loaded from: classes13.dex */
public final class b implements pec0 {
    public final afc0 a;
    public final /* synthetic */ PlacesSearchbarContainerView b;

    public b(PlacesSearchbarContainerView placesSearchbarContainerView) {
        PlacesSearchbarView placesSearchbarView;
        this.b = placesSearchbarContainerView;
        placesSearchbarView = placesSearchbarContainerView.searchbarView;
        this.a = new afc0(placesSearchbarView);
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        final gec0 gec0Var;
        yec0 yec0Var = (yec0) obj;
        this.a.render(yec0Var);
        PlacesSearchbarContainerView placesSearchbarContainerView = this.b;
        gec0Var = placesSearchbarContainerView.animator;
        final boolean z = yec0Var instanceof xec0;
        final uec0 state = yec0Var.getState();
        final boolean a = yec0Var.a();
        int i = 24;
        xw90 xw90Var = new xw90(i, yec0Var, placesSearchbarContainerView);
        final int i2 = 0;
        if (gec0Var.k) {
            gec0Var.k = false;
            gec0Var.c(z, state);
            gec0Var.b(state);
            if (z) {
                xw90Var.invoke();
                return;
            }
            return;
        }
        final int i3 = 1;
        boolean z2 = ((PlacesSearchbarView) gec0Var.c.b).getVisibility() == 0 && gec0Var.d.a.getVisibility() == 0;
        eec0 eec0Var = eec0.a;
        if (z2 == z) {
            q6c0 q6c0Var = gec0Var.h;
            if (!jl40.l(q6c0Var != null ? (fec0) q6c0Var.b : null, eec0Var)) {
                boolean l = jl40.l(gec0Var.j, state);
                dec0 dec0Var = dec0.a;
                if (l) {
                    q6c0 q6c0Var2 = gec0Var.h;
                    if (!jl40.l(q6c0Var2 != null ? (fec0) q6c0Var2.b : null, dec0Var)) {
                        return;
                    }
                }
                gec0Var.d(dec0Var, state, new i4b0(23, state), new PlacesSearchbarAnimator$animateState$2(gec0Var), new sls() { // from class: cec0
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i4 = i2;
                        zy11 zy11Var = zy11.a;
                        uec0 uec0Var = state;
                        gec0 gec0Var2 = gec0Var;
                        boolean z3 = a;
                        switch (i4) {
                            case 0:
                                if (z3) {
                                    qke.E(gec0Var2.a, HapticController$Effect.CLICK_LIGHT, false, 8);
                                }
                                if (jl40.l(uec0Var, tec0.a)) {
                                    if (!jl40.l(gec0Var2.j, uec0Var)) {
                                        gec0Var2.b(uec0Var);
                                    }
                                    gec0.a(gec0Var2, 1.0f);
                                    break;
                                }
                                break;
                            default:
                                if (z3) {
                                    if (!jl40.l(gec0Var2.j, uec0Var)) {
                                        gec0Var2.b(uec0Var);
                                    }
                                    gec0Var2.c(true, uec0Var);
                                    break;
                                }
                                break;
                        }
                        return zy11Var;
                    }
                }, new sls() { // from class: com.yandex.go.places.searchbar.impl.ui.a
                    @Override // defpackage.sls
                    public final Object invoke() {
                        tec0 tec0Var = tec0.a;
                        uec0 uec0Var = uec0.this;
                        boolean l2 = jl40.l(uec0Var, tec0Var);
                        gec0 gec0Var2 = gec0Var;
                        if (l2) {
                            ((PlacesSearchbarContainerView.AnonymousClass5) gec0Var2.e).invoke();
                        } else {
                            if (!jl40.l(uec0Var, sec0.a)) {
                                w511.b();
                                return null;
                            }
                            if (!jl40.l(gec0Var2.j, uec0Var)) {
                                gec0Var2.b(uec0Var);
                            }
                            ((PlacesSearchbarContainerView.AnonymousClass6) gec0Var2.f).invoke();
                        }
                        return zy11.a;
                    }
                });
                return;
            }
        }
        gec0Var.d(eec0Var, Boolean.valueOf(z), new yce(z, i), new ww90(26, gec0Var, state), new sls() { // from class: cec0
            @Override // defpackage.sls
            public final Object invoke() {
                int i4 = i3;
                zy11 zy11Var = zy11.a;
                uec0 uec0Var = state;
                gec0 gec0Var2 = gec0Var;
                boolean z3 = z;
                switch (i4) {
                    case 0:
                        if (z3) {
                            qke.E(gec0Var2.a, HapticController$Effect.CLICK_LIGHT, false, 8);
                        }
                        if (jl40.l(uec0Var, tec0.a)) {
                            if (!jl40.l(gec0Var2.j, uec0Var)) {
                                gec0Var2.b(uec0Var);
                            }
                            gec0.a(gec0Var2, 1.0f);
                            break;
                        }
                        break;
                    default:
                        if (z3) {
                            if (!jl40.l(gec0Var2.j, uec0Var)) {
                                gec0Var2.b(uec0Var);
                            }
                            gec0Var2.c(true, uec0Var);
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        }, new xw8(z, xw90Var, gec0Var, state, 6));
    }
}
