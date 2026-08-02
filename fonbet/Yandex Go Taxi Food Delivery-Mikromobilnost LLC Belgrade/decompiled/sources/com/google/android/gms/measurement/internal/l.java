package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import defpackage.cvw;
import defpackage.f3a1;
import defpackage.g6a1;
import defpackage.gw91;
import defpackage.j691;
import defpackage.kl40;
import defpackage.n9b1;
import defpackage.nw91;
import defpackage.p8a1;
import defpackage.r491;
import defpackage.t5b1;
import defpackage.tbz;
import defpackage.u4a1;
import defpackage.y1a1;

/* loaded from: classes.dex */
public final class l implements Runnable {
    public final /* synthetic */ n a;

    public l(n nVar, tbz tbzVar) {
        this.a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.a;
        nVar.M1().Gg();
        nVar.D = new g6a1(nVar);
        b bVar = new b(nVar);
        bVar.Ig();
        nVar.c = bVar;
        p8a1 p8a1Var = nVar.a;
        j691 Y = nVar.Y();
        cvw.l(p8a1Var);
        Y.x = p8a1Var;
        t5b1 t5b1Var = new t5b1(nVar);
        t5b1Var.Ig();
        nVar.B = t5b1Var;
        r491 r491Var = new r491(nVar);
        r491Var.Ig();
        nVar.y = r491Var;
        f3a1 f3a1Var = new f3a1(nVar, 1);
        f3a1Var.Ig();
        nVar.A = f3a1Var;
        n9b1 n9b1Var = new n9b1(nVar);
        n9b1Var.Ig();
        nVar.x = n9b1Var;
        nVar.w = new zzhb(nVar);
        if (nVar.K != nVar.L) {
            nVar.B0().z.c("Not all upload components initialized", Integer.valueOf(nVar.K), Integer.valueOf(nVar.L));
        }
        nVar.F.set(true);
        nVar.B0().H.a("UploadController is now fully initialized");
        nVar.M1().Gg();
        b bVar2 = nVar.c;
        n.O(bVar2);
        bVar2.Qg();
        b bVar3 = nVar.c;
        n.O(bVar3);
        bVar3.Gg();
        bVar3.Hg();
        if (bVar3.nh()) {
            gw91 gw91Var = nw91.v0;
            if (((Long) gw91Var.a(null)).longValue() != 0) {
                SQLiteDatabase vh = bVar3.vh();
                g gVar = (g) bVar3.b;
                gVar.D.getClass();
                int delete = vh.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(gw91Var.a(null))});
                if (delete > 0) {
                    y1a1 y1a1Var = gVar.y;
                    g.g(y1a1Var);
                    y1a1Var.H.b(Integer.valueOf(delete), "Deleted stale trigger uris. rowsDeleted");
                }
            }
        }
        if (nVar.B.B.a() == 0) {
            u4a1 u4a1Var = nVar.B.B;
            ((kl40) nVar.q4()).getClass();
            u4a1Var.b(System.currentTimeMillis());
        }
        nVar.I();
    }
}
