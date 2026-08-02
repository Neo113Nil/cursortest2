package xsna;

import com.vk.voip.api.id.CallId;
import xsna.e49;

/* compiled from: CallLifecycleAnalyticsFilter.kt */
/* loaded from: classes11.dex */
public final class f49 implements e49 {
    public final zui a;
    public boolean b;
    public boolean c;

    public f49(zui zuiVar) {
        this.a = zuiVar;
    }

    @Override // xsna.e49
    public final void B0(e49.e eVar) {
        this.a.B0(eVar);
    }

    @Override // xsna.e49
    public final void D0(e49.l lVar) {
        CallId n = sni.n(lVar.b(), new pr0(3));
        if (!this.b) {
            h(new e49.n(false, lVar.g(), 0, n, lVar.f(), null));
        }
        this.b = false;
        this.c = true;
        this.a.D0(e49.l.a(lVar, n));
    }

    @Override // xsna.e49
    public final void E(e49.j jVar) {
        this.c = false;
        this.b = true;
        this.a.E(jVar);
    }

    @Override // xsna.e49
    public final void J(e49.m mVar) {
        this.a.J(mVar);
    }

    @Override // xsna.e49
    public final void K(String str, e49.b bVar) {
        if (!this.b || this.c) {
            return;
        }
        this.b = false;
        this.a.K(str, bVar);
    }

    @Override // xsna.e49
    public final void K0(e49.i iVar) {
        CallId n = sni.n(iVar.b(), new gc(3));
        if (!this.b) {
            E(new e49.j(n));
        }
        this.b = false;
        this.c = true;
        this.a.K0(e49.i.a(iVar, n));
    }

    @Override // xsna.e49
    public final void U(e49.d dVar) {
        this.a.U(dVar);
    }

    @Override // xsna.e49
    public final void V(e49.a aVar) {
        this.a.V(aVar);
    }

    @Override // xsna.e49
    public final void f0(e49.g gVar) {
        CallId n = sni.n(gVar.b(), new fc(2));
        if (!this.b) {
            u(new e49.h(false, null, gVar.e(), n));
        }
        this.b = false;
        this.c = true;
        this.a.f0(e49.g.a(gVar, n));
    }

    @Override // xsna.e49
    public final void h(e49.n nVar) {
        this.c = false;
        this.b = true;
        this.a.h(nVar);
    }

    @Override // xsna.e49
    public final void u(e49.h hVar) {
        this.c = false;
        this.b = true;
        this.a.u(hVar);
    }

    @Override // xsna.e49
    public final void v(e49.f fVar) {
        this.a.v(fVar);
    }

    @Override // xsna.e49
    public final void y(e49.c cVar) {
        if (!this.b || this.c) {
            return;
        }
        this.b = false;
        this.a.y(cVar);
    }

    @Override // xsna.e49
    public final void z(e49.k kVar) {
        this.a.z(kVar);
    }
}
