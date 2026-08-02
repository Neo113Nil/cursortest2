package defpackage;

/* loaded from: classes8.dex */
public final class clp extends cvw implements wkp {
    public final rlp f;
    public final rlp g;
    public final rlp h;
    public final rlp i;
    public final Boolean j;

    public clp(c7u c7uVar, llp llpVar, llp llpVar2, Boolean bool, int i) {
        c7uVar = (i & 1) != 0 ? null : c7uVar;
        llpVar = (i & 4) != 0 ? null : llpVar;
        llpVar2 = (i & 8) != 0 ? null : llpVar2;
        bool = (i & 16) != 0 ? null : bool;
        this.f = c7uVar;
        this.g = null;
        this.h = llpVar;
        this.i = llpVar2;
        this.j = bool;
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

    public clp() {
        this(null, null, null, null, 31);
    }
}
