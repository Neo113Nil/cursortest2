package defpackage;

/* loaded from: classes8.dex */
public final class elp extends flp implements wkp {
    public final rlp f;
    public final rlp g;
    public final rlp h;
    public final rlp i;
    public final Integer j;
    public final vjg0 k;

    public elp(c7u c7uVar, nlp nlpVar, nlp nlpVar2, Integer num, vjg0 vjg0Var, int i) {
        c7uVar = (i & 1) != 0 ? null : c7uVar;
        nlpVar = (i & 4) != 0 ? null : nlpVar;
        nlpVar2 = (i & 8) != 0 ? null : nlpVar2;
        num = (i & 16) != 0 ? null : num;
        vjg0Var = (i & 32) != 0 ? null : vjg0Var;
        this.f = c7uVar;
        this.g = null;
        this.h = nlpVar;
        this.i = nlpVar2;
        this.j = num;
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

    public elp() {
        this(null, null, null, null, null, 63);
    }
}
