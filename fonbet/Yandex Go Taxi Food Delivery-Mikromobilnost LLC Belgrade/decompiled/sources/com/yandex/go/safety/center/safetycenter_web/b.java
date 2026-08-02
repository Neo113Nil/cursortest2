package com.yandex.go.safety.center.safetycenter_web;

import com.yandex.go.safety.center.experiment.SafetyCenterWebConfig;
import com.yandex.go.safety.center.l;
import com.yandex.go.zone.repository.r;
import defpackage.c0g;
import defpackage.d7g;
import defpackage.eul0;
import defpackage.h2b1;
import defpackage.h3y;
import defpackage.h55;
import defpackage.i6r;
import defpackage.itl0;
import defpackage.m950;
import defpackage.mul0;
import defpackage.o8k0;
import defpackage.pvl0;
import defpackage.qu;
import defpackage.sul0;
import defpackage.sy60;
import defpackage.tje;
import defpackage.yvf0;
import ru.yandex.taxi.activity.MainActivity;

/* loaded from: classes13.dex */
public final class b extends h55 {
    public final r D;
    public final yvf0 E;
    public final yvf0 F;
    public final yvf0 G;
    public final yvf0 H;
    public final yvf0 I;
    public final h3y J;
    public final h3y K;
    public final yvf0 L;
    public final com.yandex.go.safety.center.safetycenter_web.domain.a M;
    public final eul0 N;
    public final h3y O;
    public final mul0 P;
    public final pvl0 Q;
    public o8k0 R;
    public l S;

    public b(r rVar, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, h3y h3yVar, h3y h3yVar2, yvf0 yvf0Var6, com.yandex.go.safety.center.safetycenter_web.domain.a aVar, eul0 eul0Var, h3y h3yVar3, mul0 mul0Var, pvl0 pvl0Var) {
        super(null);
        this.D = rVar;
        this.E = yvf0Var;
        this.F = yvf0Var2;
        this.G = yvf0Var3;
        this.H = yvf0Var4;
        this.I = yvf0Var5;
        this.J = h3yVar;
        this.K = h3yVar2;
        this.L = yvf0Var6;
        this.M = aVar;
        this.N = eul0Var;
        this.O = h3yVar3;
        this.P = mul0Var;
        this.Q = pvl0Var;
    }

    public static final void P(b bVar, sul0 sul0Var) {
        bVar.getClass();
        itl0 itl0Var = new itl0(sul0Var.d, sul0Var.a, h2b1.N);
        m950 m950Var = bVar.S;
        sy60 sy60Var = sy60.Q2;
        if (m950Var != null) {
            bVar.A(m950Var, itl0Var, sy60Var);
            return;
        }
        i6r i6rVar = (i6r) bVar.O.get();
        MainActivity mainActivity = ((c0g) i6rVar).w;
        l a = new d7g(i6rVar, itl0Var).a();
        bVar.S = a;
        bVar.A(a, itl0Var, sy60Var);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        sul0 sul0Var = (sul0) obj;
        SafetyCenterWebConfig safetyCenterWebConfig = sul0Var.c.p;
        if (safetyCenterWebConfig == null) {
            r(new qu(9));
        } else {
            tje.N(o(), null, null, new SafetyCenterWebFeatureRouter$onLaunch$1(this, sul0Var, safetyCenterWebConfig, null), 3);
        }
    }
}
