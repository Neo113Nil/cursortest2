package com.yandex.div.core;

import defpackage.aw5;
import defpackage.bsd;
import defpackage.dpl;
import defpackage.fll;
import defpackage.g5l;
import defpackage.h5l;
import defpackage.hxy;
import defpackage.i5l;
import defpackage.iol;
import defpackage.j2k;
import defpackage.kl40;
import defpackage.m3k;
import defpackage.ngd0;
import defpackage.ppe0;
import defpackage.rtk;
import defpackage.rvo;
import defpackage.tls;
import defpackage.xw91;
import defpackage.y2k;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
public final class f extends fll {
    public final d a;
    public final h5l b = new h5l();
    public final /* synthetic */ dpl c;

    public f(dpl dplVar, d dVar) {
        this.c = dplVar;
        this.a = dVar;
    }

    @Override // defpackage.fll
    public final /* bridge */ /* synthetic */ void a(m3k m3kVar, aw5 aw5Var, com.yandex.div.core.state.b bVar) {
        i(aw5Var, m3kVar);
    }

    @Override // defpackage.fll
    public final Object d(j2k j2kVar, aw5 aw5Var, com.yandex.div.core.state.b bVar) {
        super.d(j2kVar, aw5Var, bVar);
        this.b.a.add(this.c.b.preload(j2kVar.c, i5l.e));
        return zy11.a;
    }

    @Override // defpackage.fll
    public final Object f(y2k y2kVar, aw5 aw5Var, com.yandex.div.core.state.b bVar) {
        i(aw5Var, y2kVar);
        xw91 xw91Var = xw91.w;
        rvo rvoVar = aw5Var.b;
        if (xw91Var.i(y2kVar, rvoVar)) {
            ArrayList arrayList = new ArrayList();
            List list = y2kVar.c.S;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((iol) it.next()).d.a(rvoVar));
                }
            }
            final ppe0 l = this.a.l(MediaStreamTrack.VIDEO_TRACK_KIND);
            kl40 kl40Var = this.c.d;
            tls tlsVar = new tls() { // from class: com.yandex.div.core.DivViewDataPreloader$PreloadVisitor$visit$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    ((ppe0) l).a(new bsd((List) obj));
                    return zy11.a;
                }
            };
            kl40Var.getClass();
            kl40.r(arrayList, tlsVar);
            this.b.a.add(ngd0.x);
        }
        return zy11.a;
    }

    public final void i(aw5 aw5Var, m3k m3kVar) {
        ArrayList a;
        dpl dplVar = this.c;
        rtk rtkVar = dplVar.a;
        d dVar = this.a;
        if (rtkVar != null && (a = rtkVar.a(m3kVar, aw5Var.b, xw91.w, dVar)) != null) {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                this.b.a.add(new g5l((hxy) it.next()));
            }
        }
        dplVar.c.d(m3kVar.d(), aw5Var.b, dVar);
    }
}
