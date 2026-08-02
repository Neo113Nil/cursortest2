package com.yandex.go.permission;

import defpackage.jy60;
import defpackage.mdh;
import defpackage.nfh;
import defpackage.sjh;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w7j0;

/* loaded from: classes8.dex */
public final class a implements jy60 {
    public final tt2 a;
    public final nfh b;
    public final tse c;
    public final w7j0 d;

    public a(tt2 tt2Var, nfh nfhVar, tse tseVar, w7j0 w7j0Var) {
        this.a = tt2Var;
        this.b = nfhVar;
        this.c = tseVar;
        this.d = w7j0Var;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "PermissionsOnFcpListener";
    }

    @Override // defpackage.jy60
    public final void h() {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        com.yandex.go.coroutines.b.g(this.c, mdh.b, null, new PermissionOnFcpListener$onFirstContentfulPaint$1(this, null), 2);
    }
}
