package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import io.reactivex.rxjava3.internal.functions.a;
import kotlin.NoWhenBranchMatchedException;
import xsna.awg0;
import xsna.jm50;
import xsna.v6w;

/* compiled from: ImItemListMviTaskExecutor.kt */
/* loaded from: classes2.dex */
public final class d7w extends evg0<o6w, on50, v6w, v6w, m6w, l6w> {
    public final f9w f;
    public final z5w g;
    public final com.vk.ecomm.catalog.impl.geo.a h;
    public final g8w i;
    public final tta j;
    public final r8w k;
    public final jsm l;

    public d7w(a6w a6wVar, f9w f9wVar, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = f9wVar;
        this.g = a6wVar.a;
        this.h = a6wVar.b;
        this.i = a6wVar.c;
        this.j = a6wVar.d;
        this.k = a6wVar.e;
        this.l = a6wVar.f;
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        v6w v6wVar = (v6w) hn50Var;
        boolean equals = v6wVar.equals(v6w.d.b);
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        f9w f9wVar = this.f;
        if (equals) {
            return awg0.a.b(this, io.reactivex.rxjava3.core.q.W(this.g.e.E(new f2u(new b5h(this, 22), 1), lVar, kVar, kVar), ((k8w) this.h.b).i.E(new jz(new wpg(this, 20), 21), lVar, kVar, kVar), this.i.a.a().U(new g7(new x8m(12), 21)).E(new b8v(new igh(this, 18), 1), lVar, kVar, kVar), this.k.b.E(new fu0(new fre(this, 29), 26), lVar, kVar, kVar)), new cz(f9wVar, 26), null, null, 6);
        }
        if (v6wVar.equals(v6w.e.b)) {
            return awg0.a.a(this, io.reactivex.rxjava3.core.a.l(new w6w(this, 0)), new cz(f9wVar, 26), null, 2);
        }
        if (v6wVar instanceof v6w.h) {
            return awg0.a.a(this, io.reactivex.rxjava3.core.a.l(new c7w(0, this, v6wVar)), new cz(f9wVar, 26), null, 2);
        }
        boolean equals2 = v6wVar.equals(v6w.f.b);
        jsm jsmVar = this.l;
        if (equals2) {
            return g(jsmVar.d().e(), new cz(f9wVar, 26), new iu1(this, 21));
        }
        if (v6wVar.equals(v6w.g.b)) {
            return awg0.a.b(this, jsmVar.b().a().E(new qs2(new l2i(this, 17), 19), lVar, kVar, kVar), new cz(f9wVar, 26), null, null, 6);
        }
        if (!(v6wVar instanceof v6w.a)) {
            if (v6wVar instanceof v6w.b) {
                v6w.b bVar = (v6w.b) v6wVar;
                if (bVar instanceof v6w.b.a) {
                    return awg0.a.a(this, io.reactivex.rxjava3.core.a.l(new z6w(0, this, bVar)), new xf1(this, 29), null, 2);
                }
                throw new NoWhenBranchMatchedException();
            }
            if (!(v6wVar instanceof v6w.c)) {
                throw new NoWhenBranchMatchedException();
            }
            final v6w.c cVar = (v6w.c) v6wVar;
            if (cVar instanceof v6w.c.C3871c) {
                return awg0.a.a(this, io.reactivex.rxjava3.core.a.l(new io.reactivex.rxjava3.functions.a() { // from class: xsna.a7w
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        d7w.this.l.c().b(((v6w.c.C3871c) cVar).b);
                    }
                }), new xf1(this, 29), null, 2);
            }
            if (cVar instanceof v6w.c.a) {
                v6w.c.a aVar = (v6w.c.a) cVar;
                return awg0.a.a(this, jsmVar.c().a(aVar.b, aVar.c).g(new b7w(0, cVar, this)), new xf1(this, 29), null, 2);
            }
            if (cVar instanceof v6w.c.b) {
                return awg0.a.a(this, io.reactivex.rxjava3.core.a.l(new g39(1, this, cVar)), new xf1(this, 29), null, 2);
            }
            throw new NoWhenBranchMatchedException();
        }
        v6w.a aVar2 = (v6w.a) v6wVar;
        boolean z = aVar2 instanceof v6w.a.C3870a;
        tta ttaVar = this.j;
        if (z) {
            return h(ttaVar.b(((v6w.a.C3870a) aVar2).b), new xf1(this, 29), new x6w(this, aVar2, 0));
        }
        if (aVar2 instanceof v6w.a.j) {
            long j = ((v6w.a.j) aVar2).b;
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            return awg0.a.a(this, ttaVar.l(Peer.a.b(j)), new xf1(this, 29), null, 2);
        }
        if (aVar2 instanceof v6w.a.b) {
            return awg0.a.a(this, ttaVar.c(((v6w.a.b) aVar2).b), new xf1(this, 29), null, 2);
        }
        if (aVar2 instanceof v6w.a.d) {
            return awg0.a.a(this, ttaVar.f(((v6w.a.d) aVar2).b), new xf1(this, 29), null, 2);
        }
        if (aVar2 instanceof v6w.a.e) {
            return awg0.a.a(this, ttaVar.g(((v6w.a.e) aVar2).b), new xf1(this, 29), null, 2);
        }
        if (aVar2 instanceof v6w.a.f) {
            long j2 = ((v6w.a.f) aVar2).b;
            Serializer.c<Peer> cVar3 = Peer.CREATOR;
            return awg0.a.a(this, ttaVar.h(Peer.a.b(j2)), new xf1(this, 29), null, 2);
        }
        if (aVar2 instanceof v6w.a.g) {
            long j3 = ((v6w.a.g) aVar2).b;
            Serializer.c<Peer> cVar4 = Peer.CREATOR;
            return awg0.a.a(this, ttaVar.i(Peer.a.b(j3)), new xf1(this, 29), null, 2);
        }
        if (aVar2 instanceof v6w.a.h) {
            return awg0.a.a(this, ttaVar.j(((v6w.a.h) aVar2).b), new xf1(this, 29), null, 2);
        }
        if (aVar2 instanceof v6w.a.k) {
            return awg0.a.a(this, ttaVar.m(((v6w.a.k) aVar2).b), new xf1(this, 29), null, 2);
        }
        if (aVar2 instanceof v6w.a.c) {
            return h(ttaVar.d(((v6w.a.c) aVar2).b), new xf1(this, 29), new y6w(0, this, aVar2));
        }
        if (!(aVar2 instanceof v6w.a.i)) {
            throw new NoWhenBranchMatchedException();
        }
        return h(ttaVar.k(((v6w.a.i) aVar2).b), new xf1(this, 29), new fo1(this, 2));
    }
}
