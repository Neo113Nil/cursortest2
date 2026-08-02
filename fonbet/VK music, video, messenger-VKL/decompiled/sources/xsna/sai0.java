package xsna;

import java.util.List;
import xsna.v4s;

/* compiled from: SelectableTextAnnotatedStringNode.kt */
/* loaded from: classes11.dex */
public final class sai0 extends ytl implements noy, lio, o1u {
    public jci0 r;
    public final sbo0 s;

    public sai0() {
        throw null;
    }

    public sai0(us2 us2Var, nmo0 nmo0Var, v4s.a aVar, izs izsVar, int i, boolean z, int i2, int i3, List list, izs izsVar2, jci0 jci0Var, o7g o7gVar) {
        this.r = jci0Var;
        sbo0 sbo0Var = new sbo0(us2Var, nmo0Var, aVar, izsVar, i, z, i2, i3, list, izsVar2, jci0Var, o7gVar, null);
        i2(sbo0Var);
        this.s = sbo0Var;
        if (this.r == null) {
            throw jq.f("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        }
    }

    @Override // xsna.o1u
    public final void T1(androidx.compose.ui.node.o oVar) {
        jci0 jci0Var = this.r;
        if (jci0Var != null) {
            jci0Var.e = lyk0.a(jci0Var.e, oVar, null, 2);
            jci0Var.c.a(jci0Var.b);
        }
    }

    @Override // xsna.q630.c
    public final boolean X1() {
        return false;
    }

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        return this.s.c(ep10Var, zo10Var, j);
    }

    @Override // xsna.noy
    public final int k(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return this.s.k(fVar, zoxVar, i);
    }

    @Override // xsna.lio
    public final void v(toy toyVar) {
        this.s.v(toyVar);
    }

    @Override // xsna.noy
    public final int w(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return this.s.w(fVar, zoxVar, i);
    }

    @Override // xsna.noy
    public final int x(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return this.s.x(fVar, zoxVar, i);
    }

    @Override // xsna.noy
    public final int y(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return this.s.y(fVar, zoxVar, i);
    }
}
