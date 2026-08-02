package xsna;

import com.vk.catalog.mvi.block.CatalogBlockState;
import java.util.List;
import xsna.q1a;

/* compiled from: CatalogBlockInlineActor.kt */
/* loaded from: classes.dex */
public abstract class u1a<State extends CatalogBlockState, Action extends q1a> implements s1a<State>, c2a<State> {
    public final /* synthetic */ mcc0 b;

    public u1a(b2a b2aVar) {
        this.b = new mcc0(b2aVar);
    }

    @Override // xsna.s1a
    public final void M(State state) {
        m(new ya(6, this, state));
    }

    public final void a(String str) {
        this.b.q(str);
    }

    public final void c(String str, izs izsVar, v1a v1aVar) {
        this.b.r(str, izsVar, v1aVar);
    }

    @Override // xsna.uic
    public void clear() {
        this.b.m();
    }

    @Override // xsna.c2a
    public final void e(on50 on50Var, ln50<on50> ln50Var, izs<? super dwj, ? extends bwj> izsVar) {
        this.b.e(on50Var, ln50Var, izsVar);
    }

    public abstract void g(Action action);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.s1a
    public final void j(q1a q1aVar) {
        g(q1aVar);
    }

    public final void m(izs<? super State, ? extends State> izsVar) {
        this.b.s(izsVar);
    }

    public final void q() {
        this.b.t();
    }

    public final void r() {
        this.b.u();
    }

    public final void s(List<String> list) {
        this.b.v(list);
    }

    public final void t(r1a r1aVar) {
        this.b.w(r1aVar);
    }

    public final void v(t0a t0aVar) {
        this.b.x(t0aVar);
    }

    public State h(State state, State state2) {
        return state2;
    }
}
