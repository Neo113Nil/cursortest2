package xsna;

/* compiled from: ClipCtaWithDonutMviStore.kt */
/* loaded from: classes16.dex */
public final class upc implements qpc, mm50<ppc, fpc, mpc> {
    public final /* synthetic */ mm50<ppc, fpc, mpc> b;

    public upc(final dpc dpcVar, final m3a m3aVar, final lbk lbkVar) {
        this.b = new ql50((aqw) null, 7).a(new an50(new j18() { // from class: xsna.rpc
            @Override // xsna.gzs
            public final Object invoke() {
                return new ipc(dpc.this);
            }
        }, vpc.b, wpc.b, new t5o0() { // from class: xsna.spc
            @Override // xsna.izs
            /* renamed from: m */
            public final mn50 invoke(nn50 nn50Var) {
                return new ypc(m3a.this, dpcVar, nn50Var);
            }
        }, new cm20() { // from class: xsna.tpc
            @Override // xsna.izs
            /* renamed from: i */
            public final rl50 invoke(sl50 sl50Var) {
                dpc dpcVar2 = dpc.this;
                int i = dpcVar2.k;
                return new hpc(sl50Var, lbkVar, dpcVar2.j, i);
            }
        }));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super ppc, s3q0> izsVar) {
        return this.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super mpc, s3q0> izsVar) {
        return this.b.R(izsVar);
    }

    @Override // xsna.mm50
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ppc getCurrentState() {
        return this.b.getCurrentState();
    }

    @Override // xsna.mm50
    public final void b(fpc fpcVar) {
        this.b.b(fpcVar);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.d2h0
    public final ppc e() {
        return getCurrentState();
    }
}
