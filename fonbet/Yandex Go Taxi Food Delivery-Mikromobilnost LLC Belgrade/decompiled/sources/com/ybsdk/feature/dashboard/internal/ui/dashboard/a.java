package com.ybsdk.feature.dashboard.internal.ui.dashboard;

import defpackage.ds31;
import defpackage.pig;
import defpackage.plg;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.thg;
import defpackage.tje;
import defpackage.vhg;
import defpackage.vpr;
import defpackage.xj1;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a implements vpr {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        r0 r0Var;
        Object value;
        xj1 xj1Var;
        vhg vhgVar = (vhg) obj;
        b bVar = this.a;
        pz40 Y = bVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, plg.a((plg) value, null, null, null, vhgVar, 1023)));
        if ((vhgVar instanceof thg) && ((thg) vhgVar).c) {
            pig pigVar = (pig) ((plg) bVar.X()).d.a();
            String str = (pigVar == null || (xj1Var = pigVar.c) == null) ? null : xj1Var.a;
            if (str != null) {
                pzt0 pzt0Var = bVar.S;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                bVar.S = tje.N(ds31.a(bVar), null, null, new DashboardViewModel$startCardStatusPolling$1$1(bVar, str, null), 3);
            }
        } else {
            pzt0 pzt0Var2 = bVar.S;
            if (pzt0Var2 != null) {
                pzt0Var2.a(null);
            }
        }
        return zy11.a;
    }
}
