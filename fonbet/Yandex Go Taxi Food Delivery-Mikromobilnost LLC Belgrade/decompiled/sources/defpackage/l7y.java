package defpackage;

import androidx.compose.runtime.f;

/* loaded from: classes.dex */
public final class l7y implements k651 {
    public sls a;
    public oz40 b;
    public final oz40 c = f.j(Boolean.FALSE);

    @Override // defpackage.k651
    public final long a() {
        nxi nxiVar;
        if (this.b == null) {
            sls slsVar = this.a;
            if (slsVar == null || (nxiVar = (nxi) slsVar.invoke()) == null) {
                nxiVar = nxi.c;
            }
            this.b = f.j(nxiVar);
            this.a = null;
        }
        return ((nxi) this.b.getValue()).a();
    }

    @Override // defpackage.k651
    public final boolean b() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }
}
