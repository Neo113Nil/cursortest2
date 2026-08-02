package androidx.compose.ui.layout;

import defpackage.cji0;
import defpackage.loz;
import defpackage.u751;
import defpackage.udq0;
import defpackage.wx40;

/* loaded from: classes.dex */
public abstract class x {
    public static final wx40 a;
    public static final v[] b;

    static {
        wx40 wx40Var = new wx40(8);
        v.a.getClass();
        w wVar = u751.g;
        wx40Var.i(1, wVar);
        w wVar2 = u751.f;
        wx40Var.i(2, wVar2);
        w wVar3 = u751.b;
        wx40Var.i(4, wVar3);
        w wVar4 = u751.d;
        wx40Var.i(8, wVar4);
        w wVar5 = u751.h;
        wx40Var.i(16, wVar5);
        w wVar6 = u751.e;
        wx40Var.i(32, wVar6);
        w wVar7 = u751.i;
        wx40Var.i(64, wVar7);
        w wVar8 = u751.c;
        wx40Var.i(128, wVar8);
        a = wx40Var;
        b = new v[]{wVar, wVar2, wVar3, wVar7, wVar5, wVar6, wVar4, u751.j, wVar8};
    }

    public static final void a(loz lozVar, cji0 cji0Var, long j, int i, int i2) {
        if (udq0.n(j, -1L)) {
            return;
        }
        lozVar.a(cji0Var.c(), (int) ((j >>> 48) & 65535));
        lozVar.a(cji0Var.d(), (int) ((j >>> 32) & 65535));
        lozVar.a(cji0Var.b(), i - ((int) ((j >>> 16) & 65535)));
        lozVar.a(cji0Var.a(), i2 - ((int) (j & 65535)));
    }
}
