package com.yandex.div.core;

import com.yandex.div2.DivContainer;
import defpackage.bsd;
import defpackage.cbl;
import defpackage.cxk;
import defpackage.g5l;
import defpackage.h5l;
import defpackage.hxy;
import defpackage.i2k;
import defpackage.i5l;
import defpackage.iol;
import defpackage.j2k;
import defpackage.jil;
import defpackage.k2k;
import defpackage.kdl;
import defpackage.kl40;
import defpackage.kql;
import defpackage.m2k;
import defpackage.m3k;
import defpackage.ngd0;
import defpackage.ppe0;
import defpackage.q2k;
import defpackage.rtk;
import defpackage.rvo;
import defpackage.t1l;
import defpackage.tls;
import defpackage.u2k;
import defpackage.w2k;
import defpackage.xw91;
import defpackage.y2k;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes11.dex */
public final class e extends kql {
    public final d a;
    public final jil b;
    public final rvo c;
    public final xw91 d;
    public final h5l e;
    public final /* synthetic */ i5l f;

    public e(i5l i5lVar, d dVar, jil jilVar, rvo rvoVar) {
        xw91 xw91Var = xw91.w;
        this.f = i5lVar;
        this.a = dVar;
        this.b = jilVar;
        this.c = rvoVar;
        this.d = xw91Var;
        this.e = new h5l();
    }

    @Override // defpackage.kql
    public final /* bridge */ /* synthetic */ Object a(m3k m3kVar, rvo rvoVar) {
        o(m3kVar, rvoVar);
        return zy11.a;
    }

    @Override // defpackage.kql
    public final Object b(i2k i2kVar, rvo rvoVar) {
        DivContainer divContainer = i2kVar.c;
        for (cxk cxkVar : com.yandex.div.internal.core.a.c(divContainer.B, divContainer.z, rvoVar)) {
            n(cxkVar.a, cxkVar.b);
        }
        o(i2kVar, rvoVar);
        return zy11.a;
    }

    @Override // defpackage.kql
    public final Object c(j2k j2kVar, rvo rvoVar) {
        List list = j2kVar.c.q;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                n((m3k) it.next(), rvoVar);
            }
        }
        this.e.a.add(this.f.b.preload(j2kVar.c, this.b));
        o(j2kVar, rvoVar);
        return zy11.a;
    }

    @Override // defpackage.kql
    public final Object d(k2k k2kVar, rvo rvoVar) {
        for (cxk cxkVar : com.yandex.div.internal.core.a.b(k2kVar.c, rvoVar)) {
            n(cxkVar.a, cxkVar.b);
        }
        o(k2kVar, rvoVar);
        return zy11.a;
    }

    @Override // defpackage.kql
    public final Object f(m2k m2kVar, rvo rvoVar) {
        Iterable iterable = m2kVar.c.y;
        if (iterable == null) {
            iterable = EmptyList.a;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            n((m3k) it.next(), rvoVar);
        }
        o(m2kVar, rvoVar);
        return zy11.a;
    }

    @Override // defpackage.kql
    public final Object h(q2k q2kVar, rvo rvoVar) {
        t1l t1lVar = q2kVar.c;
        for (cxk cxkVar : com.yandex.div.internal.core.a.c(t1lVar.t, t1lVar.r, rvoVar)) {
            n(cxkVar.a, cxkVar.b);
        }
        o(q2kVar, rvoVar);
        return zy11.a;
    }

    @Override // defpackage.kql
    public final Object j(u2k u2kVar, rvo rvoVar) {
        Iterator it = u2kVar.c.I.iterator();
        while (it.hasNext()) {
            m3k m3kVar = ((cbl) it.next()).c;
            if (m3kVar != null) {
                n(m3kVar, rvoVar);
            }
        }
        o(u2kVar, rvoVar);
        return zy11.a;
    }

    @Override // defpackage.kql
    public final Object k(w2k w2kVar, rvo rvoVar) {
        Iterator it = w2kVar.c.q.iterator();
        while (it.hasNext()) {
            n(((kdl) it.next()).a, rvoVar);
        }
        o(w2kVar, rvoVar);
        return zy11.a;
    }

    @Override // defpackage.kql
    public final Object m(y2k y2kVar, rvo rvoVar) {
        o(y2kVar, rvoVar);
        if (this.d.i(y2kVar, rvoVar)) {
            final ppe0 l = this.a.l(MediaStreamTrack.VIDEO_TRACK_KIND);
            ArrayList arrayList = new ArrayList();
            List list = y2kVar.c.S;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((iol) it.next()).d.a(rvoVar));
                }
            }
            kl40 kl40Var = this.f.d;
            tls tlsVar = new tls() { // from class: com.yandex.div.core.DivPreloader$PreloadVisitor$visit$10
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
            this.e.a.add(ngd0.x);
        }
        return zy11.a;
    }

    public final void o(m3k m3kVar, rvo rvoVar) {
        ArrayList a;
        i5l i5lVar = this.f;
        rtk rtkVar = i5lVar.a;
        d dVar = this.a;
        if (rtkVar != null && (a = rtkVar.a(m3kVar, rvoVar, this.d, dVar)) != null) {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                this.e.a.add(new g5l((hxy) it.next()));
            }
        }
        i5lVar.c.d(m3kVar.d(), rvoVar, dVar);
    }

    public final h5l p(m3k m3kVar) {
        n(m3kVar, this.c);
        return this.e;
    }
}
