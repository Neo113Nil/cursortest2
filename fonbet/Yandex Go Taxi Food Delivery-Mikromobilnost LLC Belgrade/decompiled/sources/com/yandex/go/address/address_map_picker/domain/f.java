package com.yandex.go.address.address_map_picker.domain;

import android.view.ViewGroup;
import defpackage.gl;
import defpackage.jqr;
import defpackage.mth;
import defpackage.ry0;
import defpackage.tse;
import defpackage.uo21;
import defpackage.y4;
import defpackage.zy11;

/* loaded from: classes12.dex */
public final class f {
    public final g a;
    public final ry0 b;
    public final uo21 c;
    public final gl d;

    public f(g gVar, ry0 ry0Var, uo21 uo21Var, gl glVar) {
        this.a = gVar;
        this.b = ry0Var;
        this.c = uo21Var;
        this.d = glVar;
    }

    public final void a(tse tseVar) {
        this.c.attach();
        ry0 ry0Var = this.b;
        zy11 zy11Var = null;
        kotlinx.coroutines.flow.e.H(tseVar, new jqr(kotlinx.coroutines.flow.e.t(new mth(new b(ry0Var.c.b), 6)), new AddressMapPickerBlockedZonesInteractor$attach$2(ry0Var, null), 3));
        gl glVar = this.d;
        glVar.a = true;
        com.yandex.go.pin.api.a aVar = (com.yandex.go.pin.api.a) glVar.c;
        y4 y4Var = new y4(21, glVar);
        ViewGroup g = aVar.g();
        if (g != null) {
            y4Var.invoke(g);
            zy11Var = zy11.a;
        }
        if (zy11Var == null) {
            aVar.o = y4Var;
        }
    }
}
