package com.yandex.go.image.loader.domain;

import android.content.Context;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.lz60;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;

/* loaded from: classes.dex */
public final class a implements lz60 {
    public final Context a;
    public final tse b;
    public final tt2 c;
    public final cne0 d;

    public a(Context context, tse tseVar, tt2 tt2Var, dne0 dne0Var) {
        this.a = context;
        this.b = tseVar;
        this.c = tt2Var;
        this.d = dne0Var.a("CoilAfterMigrationClean");
    }

    @Override // defpackage.lz60
    public final void g() {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.b, mdh.b, null, new CoilAfterMigrationClean$onLargestContentfulPaint$1(this, null), 2);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "CoilAfterMigrationClean";
    }
}
