package com.yandex.go.places.complaint.impl.ui.modal.recycler;

import defpackage.axc;
import defpackage.dxc;
import defpackage.lys;
import defpackage.n8a;
import defpackage.pav;
import defpackage.vqb;
import defpackage.zo31;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes13.dex */
public final class a extends lys {
    public static final /* synthetic */ int U = 0;
    public final pav S;
    public final vqb T;

    public a(dxc dxcVar, pav pavVar, vqb vqbVar) {
        super(dxcVar);
        this.S = pavVar;
        this.T = vqbVar;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        axc axcVar = (axc) obj;
        dxc dxcVar = (dxc) ((zo31) this.R);
        dxcVar.b.setText(axcVar.a);
        b0(new ComplaintsViewHolder$bind$1(this, axcVar, null));
        c.z(new n8a(26, this, axcVar), dxcVar.a);
    }
}
