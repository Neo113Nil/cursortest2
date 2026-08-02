package com.ybsdk.feature.transfer.internal.screens.targets.presentation;

import defpackage.au01;
import defpackage.ev31;
import defpackage.h73;
import defpackage.il01;
import defpackage.jl40;
import defpackage.l1z;
import defpackage.ntz0;
import defpackage.pt01;
import defpackage.qtz0;
import defpackage.r8j0;
import defpackage.rtz0;
import defpackage.s8j0;
import defpackage.scc;
import defpackage.t8j0;
import defpackage.teb1;
import defpackage.u8j0;
import defpackage.w511;
import defpackage.yt01;
import defpackage.yw01;
import defpackage.zt01;
import java.util.List;

/* loaded from: classes3.dex */
public final class a implements ev31 {
    public au01 a;

    @Override // defpackage.ev31
    public final Object q(Object obj) {
        boolean z;
        boolean z2;
        pt01 pt01Var = (pt01) obj;
        String str = pt01Var.b;
        boolean z3 = pt01Var.c;
        rtz0 ntz0Var = z3 ? qtz0.a : new ntz0(0);
        u8j0 u8j0Var = pt01Var.a;
        if (!(u8j0Var instanceof r8j0)) {
            if (u8j0Var instanceof s8j0) {
                return new yt01(z3, ntz0Var);
            }
            if (u8j0Var instanceof t8j0) {
                l1z l1zVar = l1z.a;
                return new zt01(scc.g(l1zVar, l1zVar, l1zVar), z3, ntz0Var);
            }
            w511.b();
            return null;
        }
        boolean z4 = true;
        List s = kotlin.sequences.b.s(new yw01(kotlin.sequences.b.g(new h73(1 == true ? 1 : 0, (List) ((r8j0) u8j0Var).a), new il01(str, 3)), TransferTargetsStateMapper$createTargetItems$2.b));
        boolean z5 = pt01Var.c;
        au01 au01Var = this.a;
        if (teb1.c(au01Var != null ? au01Var.a : null) != teb1.c(s)) {
            z = true;
        } else {
            z = true;
            z4 = false;
        }
        au01 au01Var2 = this.a;
        List list = au01Var2 != null ? au01Var2.a : null;
        if (teb1.c(s)) {
            if (!jl40.l(list != null ? Integer.valueOf(list.size()) : null, Integer.valueOf(s.size()))) {
                z2 = z;
                au01 au01Var3 = new au01(s, z5, ntz0Var, str, z4, z2);
                this.a = au01Var3;
                return au01Var3;
            }
        }
        z2 = false;
        au01 au01Var32 = new au01(s, z5, ntz0Var, str, z4, z2);
        this.a = au01Var32;
        return au01Var32;
    }
}
