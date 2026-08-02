package defpackage;

/* loaded from: classes2.dex */
public final class dlp extends flp implements wkp {
    public final rlp f;
    public final rlp g;
    public final rlp h;
    public final rlp i;
    public final Float j;
    public final vjg0 k;

    public dlp(d7u d7uVar, mlp mlpVar, mlp mlpVar2, Float f, vjg0 vjg0Var, int i) {
        d7uVar = (i & 1) != 0 ? null : d7uVar;
        mlpVar = (i & 4) != 0 ? null : mlpVar;
        mlpVar2 = (i & 8) != 0 ? null : mlpVar2;
        f = (i & 16) != 0 ? null : f;
        vjg0Var = (i & 32) != 0 ? null : vjg0Var;
        this.f = d7uVar;
        this.g = null;
        this.h = mlpVar;
        this.i = mlpVar2;
        this.j = f;
        this.k = vjg0Var;
    }

    @Override // defpackage.cvw
    public final rlp B() {
        return this.i;
    }

    @Override // defpackage.cvw
    public final Object C() {
        return this.j;
    }

    @Override // defpackage.cvw
    public final rlp D() {
        return this.h;
    }

    @Override // defpackage.cvw
    public final rlp E() {
        return this.f;
    }

    @Override // defpackage.cvw
    public final rlp I() {
        return this.g;
    }

    @Override // defpackage.flp
    public final vjg0 m0() {
        return this.k;
    }

    public dlp() {
        this(null, null, null, null, null, 63);
    }
}
