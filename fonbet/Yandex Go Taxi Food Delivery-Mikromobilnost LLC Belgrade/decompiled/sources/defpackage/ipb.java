package defpackage;

import kotlinx.coroutines.c;

/* loaded from: classes9.dex */
public final class ipb extends t8x implements hpb {
    public final c A;

    public ipb(c cVar) {
        this.A = cVar;
    }

    @Override // defpackage.hpb
    public final boolean a(Throwable th) {
        c cVar = this.z;
        if (cVar == null) {
            cVar = null;
        }
        return cVar.z(th);
    }

    @Override // defpackage.hpb
    public final l8x getParent() {
        c cVar = this.z;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    @Override // defpackage.t8x
    public final boolean n() {
        return true;
    }

    @Override // defpackage.t8x
    public final void o(Throwable th) {
        c cVar = this.z;
        if (cVar == null) {
            cVar = null;
        }
        this.A.t(cVar);
    }
}
