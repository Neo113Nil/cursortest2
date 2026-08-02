package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import defpackage.av81;
import defpackage.bp61;
import defpackage.dh81;
import defpackage.ey71;
import defpackage.ll81;
import defpackage.m191;
import defpackage.nba1;
import defpackage.nl81;
import defpackage.pil0;
import defpackage.rbh;
import defpackage.rf71;
import defpackage.sc81;
import defpackage.t671;
import defpackage.zl61;
import java.io.FileNotFoundException;
import java.io.IOException;
import yads.aa2;
import yads.b01;
import yads.ef1;
import yads.h30;
import yads.x20;

/* loaded from: classes7.dex */
public final class e implements av81 {
    public final /* synthetic */ i b;

    public e(i iVar) {
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
        dh81 dh81Var = (dh81) bp61Var.f;
        dh81 dh81Var2 = iVar.H;
        int size = dh81Var2 == null ? 0 : dh81Var2.m.size();
        long j4 = ((ey71) dh81Var.m.get(0)).b;
        int i = 0;
        while (i < size && ((ey71) iVar.H.m.get(i)).b < j4) {
            i++;
        }
        if (dh81Var.d) {
            if (size - i > dh81Var.m.size()) {
                nba1.e();
            } else {
                long j5 = iVar.N;
                if (j5 == -9223372036854775807L || dh81Var.h * 1000 > j5) {
                    iVar.M = 0;
                } else {
                    nba1.e();
                }
            }
            int i2 = iVar.M;
            iVar.M = i2 + 1;
            ll81 ll81Var = iVar.n;
            int i3 = bp61Var.c;
            ll81Var.getClass();
            if (i2 < (i3 == 7 ? 6 : 3)) {
                iVar.D.postDelayed(iVar.v, Math.min((iVar.M - 1) * 1000, 5000));
                return;
            } else {
                iVar.C = new x20();
                return;
            }
        }
        iVar.H = dh81Var;
        iVar.I = dh81Var.d & iVar.I;
        iVar.J = j - j2;
        iVar.K = j;
        synchronized (iVar.t) {
            try {
                if (bp61Var.b.a == iVar.F) {
                    Uri uri2 = iVar.H.k;
                    if (uri2 == null) {
                        uri2 = bp61Var.d.c;
                    }
                    iVar.F = uri2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (size != 0) {
            iVar.O += i;
            iVar.a(true);
            return;
        }
        dh81 dh81Var3 = iVar.H;
        if (!dh81Var3.d) {
            iVar.a(true);
            return;
        }
        rbh rbhVar = dh81Var3.i;
        if (rbhVar == null) {
            iVar.g();
            return;
        }
        String str = rbhVar.b;
        if (rf71.o(str, "urn:mpeg:dash:utc:direct:2014") || rf71.o(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                iVar.L = rf71.B(rbhVar.c) - iVar.K;
                iVar.a(true);
                return;
            } catch (aa2 e) {
                iVar.a(e);
                return;
            }
        }
        if (rf71.o(str, "urn:mpeg:dash:utc:http-iso:2014") || rf71.o(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            bp61 bp61Var2 = new bp61(iVar.z, Uri.parse(rbhVar.c), 5, new d());
            iVar.A.c(bp61Var2, new g(iVar), 1);
            sc81 sc81Var2 = iVar.q;
            sc81Var2.g(new nl81(bp61Var2.b), new pil0(bp61Var2.c, -1, null, 0, null, sc81Var2.a(-9223372036854775807L), sc81Var2.a(-9223372036854775807L)));
            return;
        }
        if (rf71.o(str, "urn:mpeg:dash:utc:http-xsdate:2014") || rf71.o(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            bp61 bp61Var3 = new bp61(iVar.z, Uri.parse(rbhVar.c), 5, new h());
            iVar.A.c(bp61Var3, new g(iVar), 1);
            sc81 sc81Var3 = iVar.q;
            sc81Var3.g(new nl81(bp61Var3.b), new pil0(bp61Var3.c, -1, null, 0, null, sc81Var3.a(-9223372036854775807L), sc81Var3.a(-9223372036854775807L)));
            return;
        }
        if (rf71.o(str, "urn:mpeg:dash:utc:ntp:2014") || rf71.o(str, "urn:mpeg:dash:utc:ntp:2012")) {
            iVar.g();
        } else {
            iVar.a(new IOException("Unsupported UTC timing scheme"));
        }
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    @Override // defpackage.av81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m191 a(zl61 zl61Var, long j, long j2, IOException iOException, int i) {
        long j3;
        m191 m191Var;
        int i2;
        bp61 bp61Var = (bp61) zl61Var;
        i iVar = this.b;
        iVar.getClass();
        long j4 = bp61Var.a;
        Uri uri = bp61Var.d.c;
        nl81 nl81Var = new nl81();
        iVar.n.getClass();
        boolean z = true;
        if (!(iOException instanceof aa2) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof b01) && !(iOException instanceof ef1)) {
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof h30) || ((h30) th).b != 2008) {
                }
            }
            j3 = Math.min((i - 1) * 1000, 5000);
            if (j3 != -9223372036854775807L) {
                m191Var = t671.e;
            } else {
                m191Var = new m191(0, j3);
            }
            i2 = m191Var.a;
            if (i2 != 0 && i2 != 1) {
                z = false;
            }
            sc81 sc81Var = iVar.q;
            sc81Var.d(nl81Var, new pil0(bp61Var.c, -1, null, 0, null, sc81Var.a(-9223372036854775807L), sc81Var.a(-9223372036854775807L)), iOException, !z);
            if (!z) {
                iVar.n.getClass();
            }
            return m191Var;
        }
        j3 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
        }
        i2 = m191Var.a;
        if (i2 != 0) {
            z = false;
        }
        sc81 sc81Var2 = iVar.q;
        sc81Var2.d(nl81Var, new pil0(bp61Var.c, -1, null, 0, null, sc81Var2.a(-9223372036854775807L), sc81Var2.a(-9223372036854775807L)), iOException, !z);
        if (!z) {
        }
        return m191Var;
    }
}
