package xsna;

import com.vk.dto.common.Peer;
import com.vk.toggle.features.ImFeatures;
import xsna.esm;
import xsna.io8;
import xsna.ng20;

/* compiled from: FoldersDialogsListConfigImpl.kt */
/* loaded from: classes18.dex */
public final class t0s implements esm {
    public final int a;
    public final a1w b;
    public final mxv c;
    public final b1s d;
    public final v0s e;
    public final b25 f;
    public final jtm g;
    public final fo50 h;
    public final m7p i;
    public final boolean j;
    public final bpn0 k;
    public final io.reactivex.rxjava3.internal.operators.observable.g1 l;
    public final mo8 m;
    public final k9q0 n;
    public final u0s o;
    public final io.reactivex.rxjava3.internal.operators.observable.g1 p;
    public final g6o0 q;
    public final agp r;
    public final esm.a s;
    public final p5e0 t;

    public t0s(int i, a1w a1wVar, mxv mxvVar, b1s b1sVar, v0s v0sVar, c1s c1sVar, b25 b25Var, jtm jtmVar, lyr lyrVar, m7p m7pVar) {
        this.a = i;
        this.b = a1wVar;
        this.c = mxvVar;
        this.d = b1sVar;
        this.e = v0sVar;
        this.f = b25Var;
        this.g = jtmVar;
        this.h = lyrVar;
        this.i = m7pVar;
        ImFeatures imFeatures = ImFeatures.IM_FOLDERS_LAZY_LOADING;
        imFeatures.getClass();
        this.j = com.vk.toggle.b.A.a(imFeatures);
        this.k = new bpn0(new sim(this, 5));
        this.l = io.reactivex.rxjava3.core.q.T(io8.a.a);
        this.m = new mo8(mxvVar);
        m7pVar.b();
        this.n = m7pVar.a();
        this.o = new u0s(i, v0sVar, c1sVar);
        this.p = io.reactivex.rxjava3.core.q.T(ng20.a.a);
        this.q = new g6o0(mxvVar);
        this.r = new agp();
        Peer q = a1wVar.q();
        cau0 cau0Var = a1wVar.r().h;
        q.getClass();
        boolean z = false;
        if (!q.Ab(Peer.Type.GROUP) && (!o25.b(b25Var) || b25Var.i().S)) {
            z = true;
        }
        a1wVar.q().getClass();
        this.s = esm.a.a(255, z, !r1.Ab(r3));
        this.t = new p5e0();
    }

    @Override // xsna.esm
    public final jtm a() {
        return this.g;
    }

    @Override // xsna.esm
    public final m5e0 b() {
        return this.t;
    }

    @Override // xsna.esm
    public final esm.a c() {
        return this.s;
    }

    @Override // xsna.esm
    public final fo50 d() {
        return this.h;
    }

    @Override // xsna.esm
    public final g6o0 e() {
        return this.q;
    }

    @Override // xsna.esm
    public final mo8 f() {
        return this.m;
    }

    @Override // xsna.esm
    public final bfz g() {
        return this.r;
    }

    @Override // xsna.esm
    public final nsm h() {
        return this.o;
    }

    @Override // xsna.esm
    public final io.reactivex.rxjava3.core.q<io8> i() {
        return this.l;
    }

    @Override // xsna.esm
    public final io.reactivex.rxjava3.core.q<ng20> j() {
        return this.p;
    }

    @Override // xsna.esm
    public final boolean k() {
        return this.j;
    }

    @Override // xsna.esm
    public final int l() {
        this.b.a.getClass();
        return 10;
    }

    @Override // xsna.esm
    public final drz<xrm> m() {
        return (drz) this.k.getValue();
    }

    @Override // xsna.esm
    public final k9q0 n() {
        return this.n;
    }

    @Override // xsna.esm
    public final int o() {
        this.b.a.getClass();
        return 30;
    }
}
