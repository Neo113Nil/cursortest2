package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ImItemListMviStore.kt */
/* loaded from: classes2.dex */
public final class s6w implements p6w, mm50<o6w, i6w, l6w> {
    public final /* synthetic */ mm50<o6w, i6w, l6w> b;

    public s6w(Peer peer, final a6w a6wVar, final pbw pbwVar, final f9w f9wVar) {
        ql50 ql50Var = new ql50((aqw) null, 7);
        eka ekaVar = new eka(peer, 1);
        cm20 cm20Var = new cm20() { // from class: xsna.q6w
            @Override // xsna.izs
            /* renamed from: i */
            public final rl50 invoke(sl50 sl50Var) {
                return new g7w(sl50Var, pbw.this);
            }
        };
        this.b = ql50Var.a(new an50(ekaVar, t6w.b, u6w.b, new t5o0() { // from class: xsna.r6w
            @Override // xsna.izs
            /* renamed from: m */
            public final mn50 invoke(nn50 nn50Var) {
                return new d7w(a6w.this, f9wVar, nn50Var);
            }
        }, cm20Var));
    }

    @Override // xsna.mm50
    public final uic G(izs<? super o6w, s3q0> izsVar) {
        return this.b.G(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super l6w, s3q0> izsVar) {
        return this.b.R(izsVar);
    }

    @Override // xsna.mm50
    public final void b(i6w i6wVar) {
        this.b.b(i6wVar);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.mm50
    public final o6w getCurrentState() {
        return this.b.getCurrentState();
    }
}
