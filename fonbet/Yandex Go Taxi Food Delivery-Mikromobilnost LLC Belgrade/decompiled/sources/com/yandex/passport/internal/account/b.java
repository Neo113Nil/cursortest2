package com.yandex.passport.internal.account;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.storage.i;
import defpackage.eci0;
import defpackage.ffx;
import defpackage.kgx;
import defpackage.uo2;
import defpackage.zy11;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class b {
    public final i a;
    public final n0 b;
    public final eci0 c;

    public b(i iVar) {
        this.a = iVar;
        n0 c = ffx.c(0, 1, null, 5);
        this.b = c;
        this.c = kotlinx.coroutines.flow.e.c(c);
    }

    public final void a(Uid uid) {
        i iVar = this.a;
        if (uid.equals(iVar.b())) {
            uo2 uo2Var = iVar.c;
            kgx[] kgxVarArr = i.m;
            uo2Var.setValue(iVar, kgxVarArr[1], null);
            iVar.d.setValue(iVar, kgxVarArr[2], null);
            this.b.g(zy11.a);
        }
    }

    public final void b(Uid uid) {
        i iVar = this.a;
        uo2 uo2Var = iVar.c;
        kgx[] kgxVarArr = i.m;
        uo2Var.setValue(iVar, kgxVarArr[1], null);
        iVar.d.setValue(iVar, kgxVarArr[2], uid);
        this.b.g(zy11.a);
    }
}
