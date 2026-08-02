package xsna;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CompositeCancelable.kt */
/* loaded from: classes3.dex */
public final class qsi implements fq9 {
    public final ArrayList a = new ArrayList();
    public boolean b;

    @Override // xsna.fq9
    public final void cancel() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            s3q0 s3q0Var = s3q0.a;
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((fq9) it.next()).cancel();
            }
            this.a.clear();
        }
    }
}
