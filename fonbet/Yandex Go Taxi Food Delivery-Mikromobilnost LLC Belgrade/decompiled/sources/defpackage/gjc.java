package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class gjc implements bt41 {
    public final ArrayList a = new ArrayList();

    @Override // defpackage.bt41
    public final void d(srd0 srd0Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bt41) it.next()).d(srd0Var);
        }
    }

    @Override // defpackage.bt41
    public final void q(srd0 srd0Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bt41) it.next()).q(srd0Var);
        }
    }
}
