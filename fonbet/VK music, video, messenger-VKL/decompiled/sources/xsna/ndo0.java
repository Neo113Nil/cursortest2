package xsna;

import androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState;

/* compiled from: TextContextMenuToolbarHandlerModifier.kt */
/* loaded from: classes11.dex */
public final class ndo0 extends ytl implements nvi, wco0 {
    public pwi r;
    public izs<? super spj<? super s3q0>, ? extends Object> s;
    public izs<? super spj<? super s3q0>, ? extends Object> t;
    public izs<? super tny, zhf0> u;
    public yok0 v;
    public final f1m w = bbk0.b(new jaa0(this, 20));
    public zhf0 x = zhf0.e;

    public ndo0(pwi pwiVar, izs<? super spj<? super s3q0>, ? extends Object> izsVar, izs<? super spj<? super s3q0>, ? extends Object> izsVar2, izs<? super tny, zhf0> izsVar3) {
        this.r = pwiVar;
        this.s = izsVar;
        this.t = izsVar2;
        this.u = izsVar3;
    }

    @Override // xsna.wco0
    public final zhf0 K1(tny tnyVar) {
        if (!this.o) {
            return this.x;
        }
        zhf0 invoke = this.u.invoke(tnyVar);
        if (invoke == null) {
            return this.x;
        }
        this.x = invoke;
        return invoke;
    }

    @Override // xsna.wco0
    public final vco0 L() {
        return (vco0) this.w.getValue();
    }

    @Override // xsna.wco0
    public final long U(tny tnyVar) {
        return K1(tnyVar).e();
    }

    @Override // xsna.q630.c
    public final void a2() {
        pwi pwiVar = this.r;
        pwiVar.c = ToolbarHandlerState.Attached;
        pwiVar.b = this;
    }

    @Override // xsna.q630.c
    public final void b2() {
        pwi pwiVar = this.r;
        pwiVar.c = ToolbarHandlerState.Detached;
        pwiVar.b = null;
    }
}
