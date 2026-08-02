package defpackage;

import androidx.compose.foundation.text.selection.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ljre;", "Lj530;", "Lmre;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class jre extends j530 {
    public final j A;
    public final eiv B;
    public final yur C;
    public final vw01 a;
    public final hoy0 b;
    public final oay c;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final iv60 z;

    public jre(vw01 vw01Var, hoy0 hoy0Var, oay oayVar, boolean z, boolean z2, boolean z3, iv60 iv60Var, j jVar, eiv eivVar, yur yurVar) {
        this.a = vw01Var;
        this.b = hoy0Var;
        this.c = oayVar;
        this.w = z;
        this.x = z2;
        this.y = z3;
        this.z = iv60Var;
        this.A = jVar;
        this.B = eivVar;
        this.C = yurVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        mre mreVar = new mre();
        mreVar.c = this.a;
        mreVar.w = this.b;
        mreVar.x = this.c;
        mreVar.y = this.w;
        mreVar.z = this.x;
        mreVar.A = this.y;
        mreVar.B = this.z;
        j jVar = this.A;
        mreVar.C = jVar;
        mreVar.D = this.B;
        mreVar.E = this.C;
        jVar.g = new kre(mreVar, 4);
        return mreVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jre)) {
            return false;
        }
        jre jreVar = (jre) obj;
        return jl40.l(this.a, jreVar.a) && jl40.l(this.b, jreVar.b) && jl40.l(this.c, jreVar.c) && this.w == jreVar.w && this.x == jreVar.x && this.y == jreVar.y && jl40.l(this.z, jreVar.z) && jl40.l(this.A, jreVar.A) && jl40.l(this.B, jreVar.B) && jl40.l(this.C, jreVar.C);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        mre mreVar = (mre) e530Var;
        boolean z = mreVar.z;
        int i = 0;
        boolean z2 = z && !mreVar.y;
        boolean z3 = mreVar.A;
        eiv eivVar = mreVar.D;
        j jVar = mreVar.C;
        boolean z4 = this.w;
        boolean z5 = this.x;
        boolean z6 = z5 && !z4;
        mreVar.c = this.a;
        hoy0 hoy0Var = this.b;
        mreVar.w = hoy0Var;
        mreVar.x = this.c;
        mreVar.y = z4;
        mreVar.z = z5;
        mreVar.B = this.z;
        j jVar2 = this.A;
        mreVar.C = jVar2;
        eiv eivVar2 = this.B;
        mreVar.D = eivVar2;
        mreVar.E = this.C;
        if (z5 != z || z6 != z2 || !jl40.l(eivVar2, eivVar) || this.y != z3 || !asy0.c(hoy0Var.b)) {
            qje.P(mreVar).D();
        }
        if (jl40.l(jVar2, jVar)) {
            return;
        }
        jVar2.g = new kre(mreVar, i);
    }

    public final int hashCode() {
        return this.C.hashCode() + ((this.B.hashCode() + ((this.A.hashCode() + ((this.z.hashCode() + unr0.e(unr0.e(unr0.e((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.w), 31, this.x), 31, this.y)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.a + ", value=" + this.b + ", state=" + this.c + ", readOnly=" + this.w + ", enabled=" + this.x + ", isPassword=" + this.y + ", offsetMapping=" + this.z + ", manager=" + this.A + ", imeOptions=" + this.B + ", focusRequester=" + this.C + ')';
    }
}
