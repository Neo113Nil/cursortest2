package defpackage;

import java.util.Set;

/* loaded from: classes8.dex */
public final class hlp extends cvw implements wkp {
    public final rlp f;
    public final rlp g;
    public final rlp h;
    public final rlp i;
    public final Set j;

    public hlp(d7u d7uVar, plp plpVar, plp plpVar2, Set set, int i) {
        d7uVar = (i & 1) != 0 ? null : d7uVar;
        plpVar = (i & 4) != 0 ? null : plpVar;
        plpVar2 = (i & 8) != 0 ? null : plpVar2;
        set = (i & 16) != 0 ? null : set;
        this.f = d7uVar;
        this.g = null;
        this.h = plpVar;
        this.i = plpVar2;
        this.j = set;
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

    public hlp() {
        this(null, null, null, null, 31);
    }
}
