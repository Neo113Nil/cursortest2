package xsna;

import androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TextContextMenuToolbarHandlerModifier.kt */
/* loaded from: classes11.dex */
final class ldo0 extends d730<ndo0> {
    public final pwi a;
    public final SuspendLambda b;
    public final izs<spj<? super s3q0>, Object> c;
    public final izs<tny, zhf0> d;

    /* JADX WARN: Multi-variable type inference failed */
    public ldo0(pwi pwiVar, izs<? super spj<? super s3q0>, ? extends Object> izsVar, izs<? super spj<? super s3q0>, ? extends Object> izsVar2, izs<? super tny, zhf0> izsVar3) {
        this.a = pwiVar;
        this.b = (SuspendLambda) izsVar;
        this.c = izsVar2;
        this.d = izsVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldo0)) {
            return false;
        }
        ldo0 ldo0Var = (ldo0) obj;
        return this.a == ldo0Var.a && this.b == ldo0Var.b && this.c == ldo0Var.c && this.d == ldo0Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        SuspendLambda suspendLambda = this.b;
        int hashCode2 = (hashCode + (suspendLambda != null ? suspendLambda.hashCode() : 0)) * 31;
        izs<spj<? super s3q0>, Object> izsVar = this.c;
        return this.d.hashCode() + ((hashCode2 + (izsVar != null ? izsVar.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.izs] */
    @Override // xsna.d730
    public final ndo0 r() {
        return new ndo0(this.a, this.b, this.c, this.d);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.izs<? super xsna.spj<? super xsna.s3q0>, ? extends java.lang.Object>] */
    @Override // xsna.d730
    public final void s(ndo0 ndo0Var) {
        ndo0 ndo0Var2 = ndo0Var;
        ndo0Var2.r.b = null;
        pwi pwiVar = this.a;
        ndo0Var2.r = pwiVar;
        pwiVar.b = ndo0Var2;
        pwiVar.c = ndo0Var2.o ? ToolbarHandlerState.Attached : ToolbarHandlerState.Detached;
        ndo0Var2.s = this.b;
        ndo0Var2.t = this.c;
        ndo0Var2.u = this.d;
    }
}
