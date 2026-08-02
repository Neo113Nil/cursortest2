package xsna;

import java.util.Iterator;
import xsna.mzl;

/* compiled from: DimensionDependency.java */
/* loaded from: classes11.dex */
public class azm extends mzl {
    public int m;

    public azm(pnx0 pnx0Var) {
        super(pnx0Var);
        if (pnx0Var instanceof yfv) {
            this.e = mzl.a.HORIZONTAL_DIMENSION;
        } else {
            this.e = mzl.a.VERTICAL_DIMENSION;
        }
    }

    @Override // xsna.mzl
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            hzl hzlVar = (hzl) it.next();
            hzlVar.a(hzlVar);
        }
    }
}
