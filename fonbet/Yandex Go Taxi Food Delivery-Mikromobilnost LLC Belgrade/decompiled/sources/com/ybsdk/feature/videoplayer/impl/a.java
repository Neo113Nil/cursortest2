package com.ybsdk.feature.videoplayer.impl;

import android.content.Context;
import androidx.media3.database.StandaloneDatabaseProvider;
import androidx.media3.exoplayer.f;
import defpackage.a9y;
import defpackage.d6z;
import defpackage.db7;
import defpackage.eds0;
import defpackage.hg91;
import defpackage.ipg;
import defpackage.mm31;
import defpackage.noo;
import defpackage.och;
import defpackage.om31;
import defpackage.ono;
import defpackage.ooo;
import defpackage.orc;
import defpackage.pm31;
import defpackage.seh;
import defpackage.teh;
import defpackage.tje;
import defpackage.ueh;
import defpackage.zdh;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class a implements om31 {
    public final ooo a;
    public final noo b;
    public f c;
    public orc d;
    public mm31 e;

    public a(Context context, pm31 pm31Var, ooo oooVar) {
        this.a = oooVar;
        noo nooVar = new noo(this);
        this.b = nooVar;
        ono onoVar = new ono(context);
        ueh uehVar = new ueh(context);
        db7 db7Var = new db7();
        eds0 eds0Var = hg91.l;
        if (eds0Var != null) {
            hg91.k++;
        } else {
            Context applicationContext = context.getApplicationContext();
            eds0Var = new eds0(new File(applicationContext.getCacheDir(), "video_player"), new a9y(10485760L), new StandaloneDatabaseProvider(applicationContext), false);
            hg91.l = eds0Var;
            hg91.k = 1;
        }
        db7Var.a = eds0Var;
        db7Var.y = new och();
        uehVar.b = db7Var;
        teh tehVar = uehVar.a;
        if (db7Var != ((ipg) tehVar.x)) {
            tehVar.x = db7Var;
            ((HashMap) tehVar.c).clear();
            ((HashMap) tehVar.w).clear();
        }
        onoVar.b(uehVar);
        zdh.a aVar = new zdh.a();
        aVar.b(pm31Var.a, pm31Var.b, pm31Var.c, pm31Var.d);
        d6z.x(!aVar.g);
        aVar.f = true;
        zdh a = aVar.a();
        d6z.x(!onoVar.y);
        onoVar.f = new seh(9, a);
        f a2 = onoVar.a();
        a2.addAnalyticsListener(oooVar);
        a2.m.a(nooVar);
        this.c = a2;
    }

    public final void a() {
        f fVar = this.c;
        if (fVar != null) {
            fVar.clearVideoSurface();
        }
        f fVar2 = this.c;
        if (fVar2 != null) {
            fVar2.release();
        }
        f fVar3 = this.c;
        if (fVar3 != null) {
            fVar3.removeAnalyticsListener(this.a);
        }
        f fVar4 = this.c;
        if (fVar4 != null) {
            fVar4.removeListener(this.b);
        }
        this.c = null;
        if (hg91.k <= 0) {
            return;
        }
        hg91.k--;
        if (hg91.k == 0) {
            eds0 eds0Var = hg91.l;
            hg91.l = null;
            tje.X(new VideoCache$release$1(eds0Var, null));
        }
    }
}
