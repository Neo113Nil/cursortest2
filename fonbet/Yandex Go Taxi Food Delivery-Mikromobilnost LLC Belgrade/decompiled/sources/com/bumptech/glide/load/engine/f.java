package com.bumptech.glide.load.engine;

import defpackage.adt0;
import defpackage.exj;
import defpackage.fog;
import defpackage.gog;
import defpackage.khx;
import defpackage.p430;
import defpackage.sng;
import defpackage.x1o;

/* loaded from: classes10.dex */
public final class f implements fog {
    public final /* synthetic */ p430 a;
    public final /* synthetic */ adt0 b;

    public f(adt0 adt0Var, p430 p430Var) {
        this.b = adt0Var;
        this.a = p430Var;
    }

    @Override // defpackage.fog
    public final void d(Object obj) {
        adt0 adt0Var = this.b;
        p430 p430Var = this.a;
        p430 p430Var2 = adt0Var.y;
        if (p430Var2 == null || p430Var2 != p430Var) {
            return;
        }
        adt0 adt0Var2 = this.b;
        p430 p430Var3 = this.a;
        exj exjVar = adt0Var2.a.p;
        if (obj == null || !exjVar.c(p430Var3.c.c())) {
            b bVar = adt0Var2.b;
            khx khxVar = p430Var3.a;
            gog gogVar = p430Var3.c;
            bVar.b(khxVar, obj, gogVar, gogVar.c(), adt0Var2.z);
            return;
        }
        adt0Var2.x = obj;
        b bVar2 = adt0Var2.b;
        bVar2.L = DecodeJob$RunReason.SWITCH_TO_SOURCE_SERVICE;
        x1o x1oVar = bVar2.I;
        (x1oVar.F ? x1oVar.B : x1oVar.A).execute(bVar2);
    }

    @Override // defpackage.fog
    public final void e(Exception exc) {
        adt0 adt0Var = this.b;
        p430 p430Var = this.a;
        p430 p430Var2 = adt0Var.y;
        if (p430Var2 == null || p430Var2 != p430Var) {
            return;
        }
        adt0 adt0Var2 = this.b;
        p430 p430Var3 = this.a;
        b bVar = adt0Var2.b;
        sng sngVar = adt0Var2.z;
        gog gogVar = p430Var3.c;
        bVar.c(sngVar, exc, gogVar, gogVar.c());
    }
}
