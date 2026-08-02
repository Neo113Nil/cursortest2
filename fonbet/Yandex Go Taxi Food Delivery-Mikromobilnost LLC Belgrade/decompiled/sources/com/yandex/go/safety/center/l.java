package com.yandex.go.safety.center;

import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import defpackage.av4;
import defpackage.btl0;
import defpackage.bu0;
import defpackage.cql0;
import defpackage.ctl0;
import defpackage.dab1;
import defpackage.dsl0;
import defpackage.dvl0;
import defpackage.esl0;
import defpackage.gtl0;
import defpackage.h2b1;
import defpackage.h55;
import defpackage.hrl0;
import defpackage.htl0;
import defpackage.itl0;
import defpackage.jl40;
import defpackage.mrl0;
import defpackage.n3w;
import defpackage.ptl0;
import defpackage.rx4;
import defpackage.stl0;
import defpackage.tje;
import defpackage.tsl0;
import defpackage.utl0;
import defpackage.vsl0;
import defpackage.vu;
import defpackage.w030;
import defpackage.w511;
import defpackage.wfz;
import defpackage.wtl0;
import defpackage.xvf0;
import defpackage.ypc;
import defpackage.ysl0;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.Iterator;
import ru.yandex.taxi.activity.ContentContainer$ZOrder;

/* loaded from: classes13.dex */
public final class l extends h55 {
    public final j D;
    public final SafetyCenterExperiment E;
    public final dsl0 F;
    public final yvf0 G;
    public final ctl0 H;
    public final yvf0 I;
    public final tsl0 J;
    public final yvf0 K;
    public final mrl0 L;

    public l(j jVar, SafetyCenterExperiment safetyCenterExperiment, dsl0 dsl0Var, av4 av4Var, ctl0 ctl0Var, vu vuVar, tsl0 tsl0Var, rx4 rx4Var, mrl0 mrl0Var) {
        super(null);
        this.D = jVar;
        this.E = safetyCenterExperiment;
        this.F = dsl0Var;
        this.G = av4Var;
        this.H = ctl0Var;
        this.I = vuVar;
        this.J = tsl0Var;
        this.K = rx4Var;
        this.L = mrl0Var;
        ContentContainer$ZOrder contentContainer$ZOrder = ContentContainer$ZOrder.MAP;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        itl0 itl0Var = (itl0) obj;
        htl0 htl0Var = itl0Var.c;
        if (htl0Var.equals(dab1.O)) {
            P(itl0Var);
            return;
        }
        Object obj2 = null;
        if (!(htl0Var instanceof gtl0)) {
            if (htl0Var.equals(h2b1.N)) {
                A(this.L.a(new hrl0()), itl0Var, new ptl0(this, 0));
                return;
            } else if (htl0Var.equals(wfz.O)) {
                tje.N(o(), null, null, new SafetyCenterRouter$onLaunch$1(this, itl0Var, null), 3);
                return;
            } else {
                w511.b();
                return;
            }
        }
        String str = ((gtl0) htl0Var).a;
        Iterator it = this.E.j.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (jl40.l(((SafetyCenterExperiment.Instruction) next).a, str)) {
                obj2 = next;
                break;
            }
        }
        SafetyCenterExperiment.Instruction instruction = (SafetyCenterExperiment.Instruction) obj2;
        if (instruction == null) {
            z(this.J.a(new hrl0()), new stl0(this));
        } else {
            A(((esl0) this.F).a(new hrl0(), instruction), zy11.a, new wtl0());
        }
    }

    public final void P(itl0 itl0Var) {
        hrl0 hrl0Var = new hrl0();
        bu0 bu0Var = this.H.a;
        A(new btl0(hrl0Var, (ysl0) ((xvf0) bu0Var.a).get(), (vsl0) ((xvf0) bu0Var.b).get(), (mrl0) ((xvf0) bu0Var.c).get(), (com.yandex.go.safety.center.contacts.b) ((xvf0) bu0Var.d).get(), (cql0) ((xvf0) bu0Var.e).get(), (tsl0) ((n3w) bu0Var.f).a, (dvl0) ((xvf0) bu0Var.g).get(), (ypc) ((xvf0) bu0Var.h).get(), (w030) ((xvf0) bu0Var.i).get()), itl0Var, new utl0(this));
    }
}
