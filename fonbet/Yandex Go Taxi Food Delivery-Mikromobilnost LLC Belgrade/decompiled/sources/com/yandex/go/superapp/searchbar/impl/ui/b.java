package com.yandex.go.superapp.searchbar.impl.ui;

import com.yandex.go.superapp.searchbar.impl.ui.SuperappSearchbarContainerView;
import com.yandex.go.superapp.searchbar.impl.ui.searchbar.SuperappSearchbarView;
import defpackage.amp0;
import defpackage.bdw0;
import defpackage.cdw0;
import defpackage.ddw0;
import defpackage.edw0;
import defpackage.gyt0;
import defpackage.jew0;
import defpackage.jl40;
import defpackage.kew0;
import defpackage.lzu0;
import defpackage.mew0;
import defpackage.rdw0;
import defpackage.s5w0;
import defpackage.sdw0;
import defpackage.sls;
import defpackage.tdw0;
import defpackage.udw0;
import defpackage.w511;
import defpackage.xw8;
import defpackage.yce;
import defpackage.zy11;
import ru.yandex.taxi.HapticController$Effect;

/* loaded from: classes14.dex */
public final class b implements udw0 {
    public final mew0 a;
    public final /* synthetic */ SuperappSearchbarContainerView b;

    public b(SuperappSearchbarContainerView superappSearchbarContainerView) {
        SuperappSearchbarView superappSearchbarView;
        this.b = superappSearchbarContainerView;
        superappSearchbarView = superappSearchbarContainerView.searchbarView;
        this.a = new mew0(superappSearchbarView);
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        final edw0 edw0Var;
        kew0 kew0Var = (kew0) obj;
        this.a.render(kew0Var);
        SuperappSearchbarContainerView superappSearchbarContainerView = this.b;
        edw0Var = superappSearchbarContainerView.animator;
        final boolean z = kew0Var instanceof jew0;
        final tdw0 mode = kew0Var.getMode();
        final boolean a = kew0Var.a();
        gyt0 gyt0Var = new gyt0(15, kew0Var, superappSearchbarContainerView);
        final int i = 0;
        if (edw0Var.k) {
            edw0Var.k = false;
            edw0Var.c(z, mode);
            edw0Var.b(mode);
            if (z) {
                gyt0Var.invoke();
                return;
            }
            return;
        }
        final int i2 = 1;
        boolean z2 = ((SuperappSearchbarView) edw0Var.c.a).getVisibility() == 0 && edw0Var.d.a.getVisibility() == 0;
        cdw0 cdw0Var = cdw0.a;
        if (z2 == z) {
            amp0 amp0Var = edw0Var.h;
            if (!jl40.l(amp0Var != null ? (ddw0) amp0Var.a : null, cdw0Var)) {
                boolean l = jl40.l(edw0Var.j, mode);
                bdw0 bdw0Var = bdw0.a;
                if (l) {
                    amp0 amp0Var2 = edw0Var.h;
                    if (!jl40.l(amp0Var2 != null ? (ddw0) amp0Var2.a : null, bdw0Var)) {
                        return;
                    }
                }
                edw0Var.d(bdw0Var, mode, new s5w0(3, mode), new SuperappSearchbarAnimator$animateMode$2(edw0Var), new sls() { // from class: adw0
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i3 = i2;
                        zy11 zy11Var = zy11.a;
                        tdw0 tdw0Var = mode;
                        edw0 edw0Var2 = edw0Var;
                        boolean z3 = a;
                        switch (i3) {
                            case 0:
                                if (z3) {
                                    if (!jl40.l(edw0Var2.j, tdw0Var)) {
                                        edw0Var2.b(tdw0Var);
                                    }
                                    edw0Var2.c(true, tdw0Var);
                                    break;
                                }
                                break;
                            default:
                                if (z3) {
                                    qke.E(edw0Var2.a, HapticController$Effect.CLICK_LIGHT, false, 8);
                                }
                                if (jl40.l(tdw0Var, sdw0.a)) {
                                    if (!jl40.l(edw0Var2.j, tdw0Var)) {
                                        edw0Var2.b(tdw0Var);
                                    }
                                    edw0.a(edw0Var2, 1.0f);
                                    break;
                                }
                                break;
                        }
                        return zy11Var;
                    }
                }, new sls() { // from class: com.yandex.go.superapp.searchbar.impl.ui.a
                    @Override // defpackage.sls
                    public final Object invoke() {
                        edw0 edw0Var2 = edw0Var;
                        amp0 amp0Var3 = edw0Var2.c;
                        sdw0 sdw0Var = sdw0.a;
                        tdw0 tdw0Var = tdw0.this;
                        if (jl40.l(tdw0Var, sdw0Var)) {
                            ((SuperappSearchbarView) amp0Var3.a).getBinding().f.resumeAnimation();
                            ((SuperappSearchbarContainerView.AnonymousClass6) edw0Var2.e).invoke();
                        } else {
                            if (!jl40.l(tdw0Var, rdw0.a)) {
                                w511.b();
                                return null;
                            }
                            if (!jl40.l(edw0Var2.j, tdw0Var)) {
                                edw0Var2.b(tdw0Var);
                            }
                            ((SuperappSearchbarView) amp0Var3.a).getBinding().f.pauseAnimation();
                            ((SuperappSearchbarContainerView.AnonymousClass7) edw0Var2.f).invoke();
                        }
                        return zy11.a;
                    }
                });
                return;
            }
        }
        edw0Var.d(cdw0Var, Boolean.valueOf(z), new yce(z, 29), new lzu0(10, edw0Var, mode), new sls() { // from class: adw0
            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                zy11 zy11Var = zy11.a;
                tdw0 tdw0Var = mode;
                edw0 edw0Var2 = edw0Var;
                boolean z3 = z;
                switch (i3) {
                    case 0:
                        if (z3) {
                            if (!jl40.l(edw0Var2.j, tdw0Var)) {
                                edw0Var2.b(tdw0Var);
                            }
                            edw0Var2.c(true, tdw0Var);
                            break;
                        }
                        break;
                    default:
                        if (z3) {
                            qke.E(edw0Var2.a, HapticController$Effect.CLICK_LIGHT, false, 8);
                        }
                        if (jl40.l(tdw0Var, sdw0.a)) {
                            if (!jl40.l(edw0Var2.j, tdw0Var)) {
                                edw0Var2.b(tdw0Var);
                            }
                            edw0.a(edw0Var2, 1.0f);
                            break;
                        }
                        break;
                }
                return zy11Var;
            }
        }, new xw8(z, gyt0Var, edw0Var, mode, 9));
    }
}
