package com.yandex.go.charity;

import com.yandex.go.modals.progress.api.CircularProgressRouter$Payload;
import defpackage.dg41;
import defpackage.dpb;
import defpackage.f89;
import defpackage.gf41;
import defpackage.gg41;
import defpackage.h55;
import defpackage.i3y;
import defpackage.ju8;
import defpackage.mza;
import defpackage.nza;
import defpackage.oza;
import defpackage.pza;
import defpackage.pzt0;
import defpackage.qza;
import defpackage.tje;
import defpackage.tvb;
import defpackage.tzd;
import defpackage.w511;
import defpackage.yfa;
import defpackage.yvf0;
import java.util.Map;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes12.dex */
public final class a extends h55 implements mza {
    public final tzd D;
    public final yfa E;
    public final yvf0 F;
    public final gf41 G;
    public pzt0 H;
    public final i3y I;

    public a(tzd tzdVar, yfa yfaVar, yvf0 yvf0Var, gf41 gf41Var) {
        super(null);
        this.D = tzdVar;
        this.E = yfaVar;
        this.F = yvf0Var;
        this.G = gf41Var;
        this.I = kotlin.a.a(new ju8(29, this));
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        qza qzaVar = (qza) obj;
        if (qzaVar instanceof oza) {
            oza ozaVar = (oza) qzaVar;
            f89 f89Var = new f89(4, this, ozaVar.a, ozaVar.b);
            pzt0 pzt0Var = this.H;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            tvb tvbVar = (tvb) this.F.get();
            D(tvbVar, new CircularProgressRouter$Payload(null, false, 7), new nza(this, 1));
            this.H = tje.N(o(), null, null, new CharityRouterImpl$doWithUrl$2(this, tvbVar, f89Var, null), 3);
            return;
        }
        if (!(qzaVar instanceof pza)) {
            w511.b();
            return;
        }
        pza pzaVar = (pza) qzaVar;
        Map map = pzaVar.a;
        P(this.D.a(pzaVar.b, pzaVar.c, pzaVar.d, map));
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        pzt0 pzt0Var = this.H;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.H = null;
        j(dpb.a);
    }

    public final void P(UiWebViewConfig uiWebViewConfig) {
        A((gg41) this.I.getValue(), new dg41(uiWebViewConfig, null, null, null, null, null, null, 254), new nza(this, 0));
    }
}
