package com.yandex.go.copter.city_tour;

import android.content.Context;
import com.yandex.go.copter.experiment.CopterOrderFlowExperiment;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.h3y;
import defpackage.jl40;
import defpackage.lmw0;
import defpackage.mdh;
import defpackage.p1b;
import defpackage.pex0;
import defpackage.pgd;
import defpackage.qu;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vqb;
import defpackage.w030;
import defpackage.wfd;
import defpackage.yt11;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class b extends pgd {
    public final tt2 F;
    public final Context G;
    public final h3y H;
    public final w030 I;
    public final p1b J;

    public b(tt2 tt2Var, Context context, h3y h3yVar, w030 w030Var) {
        super(0);
        this.F = tt2Var;
        this.G = context;
        this.H = h3yVar;
        this.I = w030Var;
        this.J = new p1b((yt11) h3yVar.get(), new vqb(4, this));
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        d dVar = (d) this.H.get();
        if (dVar.l) {
            return;
        }
        dVar.a.a(null, dVar.h);
        dVar.l = true;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        CopterOrderFlowExperiment.CityTourSettings cityTourSettings;
        Object obj2;
        lmw0 lmw0Var;
        d dVar = (d) this.H.get();
        CopterOrderFlowExperiment copterOrderFlowExperiment = dVar.g;
        if (copterOrderFlowExperiment.b && (cityTourSettings = copterOrderFlowExperiment.f) != null) {
            pex0 m = ((k) dVar.c).m();
            if (!jl40.l(m != null ? m.b : null, cityTourSettings.a)) {
                m = null;
            }
            if (m == null) {
                lmw0Var = null;
            } else {
                Iterator it = m.f().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (jl40.l(((lmw0) obj2).getName(), cityTourSettings.b)) {
                            break;
                        }
                    }
                }
                lmw0Var = (lmw0) obj2;
            }
            if (lmw0Var != null) {
                tse o = o();
                this.F.getClass();
                sjh sjhVar = uyj.a;
                tje.N(o, mdh.b, null, new CityTourModalViewRouterImpl$onLaunch$1(this, null), 2);
                return;
            }
        }
        r(new qu(9));
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.J;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.G;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.I;
    }
}
