package com.yandex.go.image.loader.di;

import android.content.Context;
import android.graphics.Bitmap;
import coil3.a;
import coil3.b;
import coil3.c;
import com.yandex.go.coroutines.h;
import com.yandex.go.image.internal.coil.fetcher.d;
import defpackage.acv;
import defpackage.cev;
import defpackage.cg21;
import defpackage.cvw;
import defpackage.d9;
import defpackage.eqh;
import defpackage.g5p;
import defpackage.gbv;
import defpackage.i2v;
import defpackage.i3y;
import defpackage.in2;
import defpackage.iw4;
import defpackage.j5p;
import defpackage.k1d;
import defpackage.kbv;
import defpackage.kq2;
import defpackage.ku2;
import defpackage.l16;
import defpackage.lev;
import defpackage.n3w;
import defpackage.ppr;
import defpackage.qoi0;
import defpackage.ubv;
import defpackage.uci0;
import defpackage.uh;
import defpackage.v7p;
import defpackage.xvf0;
import defpackage.y1u;

/* loaded from: classes.dex */
public final class a implements v7p {
    public final xvf0 a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;

    public a(n3w n3wVar, eqh eqhVar, xvf0 xvf0Var, y1u y1uVar, xvf0 xvf0Var2, xvf0 xvf0Var3) {
        this.a = n3wVar;
        this.b = eqhVar;
        this.c = xvf0Var;
        this.d = y1uVar;
        this.e = xvf0Var2;
        this.f = xvf0Var3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        Context context = (Context) this.a.get();
        kq2 kq2Var = new kq2(this.c, 11);
        in2 in2Var = new in2(7, this.f, this.b, this.e);
        ImageLoaderAppModule$Companion$coilImageLoader$3 imageLoaderAppModule$Companion$coilImageLoader$3 = new ImageLoaderAppModule$Companion$coilImageLoader$3(this.d, null);
        i3y a = kotlin.a.a(new ku2(context, 0));
        h hVar = new h(imageLoaderAppModule$Companion$coilImageLoader$3);
        b bVar = new b(context);
        uh uhVar = cvw.d;
        Boolean bool = Boolean.FALSE;
        g5p g5pVar = bVar.f;
        g5pVar.b(uhVar, bool);
        g5pVar.b(lev.a, Bitmap.Config.ARGB_8888);
        bVar.d = kotlin.a.a(new ku2(context, 1));
        bVar.c = kotlin.a.a(new d9(16, a));
        a.C0029a c0029a = new a.C0029a();
        c0029a.b(new acv(), qoi0.a(kbv.class));
        c0029a.c(new ubv(), qoi0.a(gbv.class));
        c0029a.a.add(new com.yandex.go.image.internal.coil.intercept.a(a));
        c0029a.e.add(new k1d(new l16(0), 0));
        c0029a.a(new d(kq2Var, new d9(17, in2Var), hVar), qoi0.a(kbv.class));
        c0029a.a(new iw4(), qoi0.a(cg21.class));
        bVar.e = c0029a.d();
        j5p a2 = g5pVar.a();
        cev cevVar = bVar.b;
        cev cevVar2 = new cev(cevVar.a, cevVar.b, cevVar.c, cevVar.d, cevVar.e, cevVar.f, cevVar.g, cevVar.h, cevVar.i, cevVar.j, cevVar.k, cevVar.l, cevVar.m, a2);
        i3y a3 = kotlin.a.a(new i2v(1));
        i3y i3yVar = bVar.c;
        if (i3yVar == null) {
            i3yVar = kotlin.a.a(new ppr(11, bVar));
        }
        i3y i3yVar2 = i3yVar;
        i3y i3yVar3 = bVar.d;
        if (i3yVar3 == null) {
            i3yVar3 = kotlin.a.a(new i2v(2));
        }
        i3y i3yVar4 = i3yVar3;
        coil3.a aVar = bVar.e;
        if (aVar == null) {
            aVar = new coil3.a();
        }
        return new c(new uci0(bVar.a, cevVar2, a3, i3yVar2, i3yVar4, aVar));
    }
}
