package xsna;

/* compiled from: GraphicsLayerModifier.kt */
/* loaded from: classes11.dex */
final class bf7 extends d730<cf7> {
    public final izs<tdu, s3q0> a;

    /* JADX WARN: Multi-variable type inference failed */
    public bf7(izs<? super tdu, s3q0> izsVar) {
        this.a = izsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bf7) {
            return this.a == ((bf7) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final cf7 r() {
        return new cf7(this.a);
    }

    @Override // xsna.d730
    public final void s(cf7 cf7Var) {
        androidx.compose.ui.node.o oVar;
        cf7 cf7Var2 = cf7Var;
        izs<tdu, s3q0> izsVar = this.a;
        cf7Var2.p = izsVar;
        if (cf7Var2.b.o && (oVar = itl.d(cf7Var2, 2).t) != null) {
            oVar.j2(izsVar, true);
        }
    }
}
