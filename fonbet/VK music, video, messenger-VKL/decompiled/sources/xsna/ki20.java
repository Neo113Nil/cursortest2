package xsna;

import java.util.HashSet;
import xsna.fi20;

/* compiled from: MetadataCollector.java */
/* loaded from: classes12.dex */
public final class ki20 {
    public vf30 b;
    public yf30 d;
    public l4y0 e;
    public xf30 a = new xf30(0);
    public final HashSet c = new HashSet();

    public ki20() {
        long currentTimeMillis = (System.currentTimeMillis() / 1000) + 2082844800;
        this.d = new yf30(currentTimeMillis, currentTimeMillis);
    }

    public final void a(fi20.a aVar) {
        if (aVar instanceof xf30) {
            this.a = (xf30) aVar;
            return;
        }
        if (aVar instanceof vf30) {
            this.b = (vf30) aVar;
            return;
        }
        if (aVar instanceof yf30) {
            this.d = (yf30) aVar;
        } else if (aVar instanceof vo10) {
            this.c.add((vo10) aVar);
        } else {
            if (!(aVar instanceof l4y0)) {
                throw new IllegalArgumentException("Unsupported metadata");
            }
            this.e = (l4y0) aVar;
        }
    }
}
