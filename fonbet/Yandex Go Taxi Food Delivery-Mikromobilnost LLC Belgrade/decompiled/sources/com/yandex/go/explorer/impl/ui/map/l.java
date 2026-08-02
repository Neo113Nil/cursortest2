package com.yandex.go.explorer.impl.ui.map;

import defpackage.ad5;
import defpackage.ah00;
import defpackage.cvo;
import defpackage.guo;
import defpackage.i3y;
import defpackage.pzt0;
import defpackage.qto;
import defpackage.tje;
import defpackage.xto;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class l extends ad5 {
    public final com.yandex.go.explorer.impl.experiments.g A;
    public cvo B;
    public pzt0 C;
    public pzt0 D;
    public pzt0 E;
    public List F;
    public int G;
    public boolean H;
    public final com.yandex.go.explorer.impl.data.repositories.a x;
    public final com.yandex.go.explorer.impl.domain.interactors.a y;
    public final ah00 z;

    public l(com.yandex.go.explorer.impl.data.repositories.a aVar, com.yandex.go.explorer.impl.domain.interactors.a aVar2, ah00 ah00Var, com.yandex.go.explorer.impl.experiments.g gVar) {
        super(guo.class);
        this.x = aVar;
        this.y = aVar2;
        this.z = ah00Var;
        this.A = gVar;
        this.B = new cvo(0);
        this.F = EmptyList.a;
        this.G = -1;
        this.H = true;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        pzt0 pzt0Var = this.C;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.C = null;
        pzt0 pzt0Var2 = this.D;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.D = null;
        pzt0 pzt0Var3 = this.E;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
        this.E = null;
        ((guo) Dg()).X7();
        super.Cg();
    }

    public final void Kg() {
        i3y i3yVar = xto.a;
        cvo cvoVar = this.B;
        this.B = cvo.a(this.B, false, xto.b(cvoVar.d, cvoVar.c), null, 0, 13);
        ((guo) Dg()).render(this.B);
    }

    public final void Lg(boolean z) {
        cvo cvoVar = this.B;
        if (cvoVar.a == z) {
            return;
        }
        this.B = cvo.a(cvoVar, z, null, null, 0, 14);
        r0 r0Var = this.y.b.a;
        qto qtoVar = (qto) r0Var.getValue();
        r0Var.l(qtoVar != null ? qto.a(qtoVar, z, null, 11) : null);
        if (z) {
            tje.N(Jg(), null, null, new ExplorerPresenter$showWithUnviewedAnimation$1(this, null), 3);
        } else {
            ((guo) Dg()).ee(this.B, null);
        }
    }
}
