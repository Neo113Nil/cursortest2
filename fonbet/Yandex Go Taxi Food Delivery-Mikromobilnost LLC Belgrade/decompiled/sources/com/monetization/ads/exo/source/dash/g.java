package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import defpackage.av81;
import defpackage.bp61;
import defpackage.m191;
import defpackage.nl81;
import defpackage.pil0;
import defpackage.sc81;
import defpackage.t671;
import defpackage.zl61;
import java.io.IOException;

/* loaded from: classes7.dex */
public final class g implements av81 {
    public final /* synthetic */ i b;

    public g(i iVar) {
        this.b = iVar;
    }

    @Override // defpackage.av81
    public final void a(zl61 zl61Var, long j, long j2) {
        bp61 bp61Var = (bp61) zl61Var;
        i iVar = this.b;
        iVar.getClass();
        long j3 = bp61Var.a;
        Uri uri = bp61Var.d.c;
        nl81 nl81Var = new nl81();
        iVar.n.getClass();
        sc81 sc81Var = iVar.q;
        sc81Var.f(nl81Var, new pil0(bp61Var.c, -1, null, 0, null, sc81Var.a(-9223372036854775807L), sc81Var.a(-9223372036854775807L)));
        iVar.L = ((Long) bp61Var.f).longValue() - j;
        iVar.a(true);
    }

    @Override // defpackage.av81
    public final void a(zl61 zl61Var, long j, long j2, boolean z) {
        bp61 bp61Var = (bp61) zl61Var;
        i iVar = this.b;
        iVar.getClass();
        long j3 = bp61Var.a;
        Uri uri = bp61Var.d.c;
        nl81 nl81Var = new nl81();
        iVar.n.getClass();
        sc81 sc81Var = iVar.q;
        sc81Var.c(nl81Var, new pil0(bp61Var.c, -1, null, 0, null, sc81Var.a(-9223372036854775807L), sc81Var.a(-9223372036854775807L)));
    }

    @Override // defpackage.av81
    public final m191 a(zl61 zl61Var, long j, long j2, IOException iOException, int i) {
        bp61 bp61Var = (bp61) zl61Var;
        i iVar = this.b;
        sc81 sc81Var = iVar.q;
        long j3 = bp61Var.a;
        Uri uri = bp61Var.d.c;
        sc81Var.d(new nl81(), new pil0(bp61Var.c, -1, null, 0, null, sc81Var.a(-9223372036854775807L), sc81Var.a(-9223372036854775807L)), iOException, true);
        iVar.n.getClass();
        iVar.a(iOException);
        return t671.d;
    }
}
