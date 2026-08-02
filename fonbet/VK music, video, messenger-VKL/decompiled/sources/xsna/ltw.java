package xsna;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import xsna.ktw;
import xsna.qhu;

/* compiled from: IndentListenerManager.kt */
/* loaded from: classes7.dex */
public final class ltw implements ktw {
    public final LinkedHashSet a = new LinkedHashSet();
    public qhu.a b;

    @Override // xsna.ktw
    public final void a(wns0 wns0Var) {
        this.a.remove(wns0Var);
    }

    @Override // xsna.ktw
    public final void b(wns0 wns0Var) {
        this.a.add(wns0Var);
        qhu.a aVar = this.b;
        if (aVar != null) {
            Iterator it = Collections.singleton(wns0Var).iterator();
            while (it.hasNext()) {
                ((ktw.a) it.next()).I5(aVar);
            }
        }
    }
}
