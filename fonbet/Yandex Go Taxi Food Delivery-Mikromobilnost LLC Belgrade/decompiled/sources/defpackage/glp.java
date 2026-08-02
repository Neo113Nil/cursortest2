package defpackage;

/* loaded from: classes2.dex */
public final class glp extends cvw implements wkp {
    public final rlp f;
    public final rlp g;
    public final rlp h;
    public final rlp i;
    public final String j;

    public glp(d7u d7uVar, olp olpVar, olp olpVar2, String str, int i) {
        d7uVar = (i & 1) != 0 ? null : d7uVar;
        olpVar = (i & 4) != 0 ? null : olpVar;
        olpVar2 = (i & 8) != 0 ? null : olpVar2;
        str = (i & 16) != 0 ? null : str;
        this.f = d7uVar;
        this.g = null;
        this.h = olpVar;
        this.i = olpVar2;
        this.j = str;
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

    public glp() {
        this(null, null, null, null, 31);
    }
}
