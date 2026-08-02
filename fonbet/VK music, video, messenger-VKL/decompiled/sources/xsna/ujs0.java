package xsna;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.c360;
import xsna.tu70;

/* compiled from: VideoErrorResolver.kt */
/* loaded from: classes2.dex */
public final class ujs0 {
    public final kk8 a;
    public final List<owp> b;

    public ujs0(boolean z, c360.a aVar, tu70.a aVar2, mm80 mm80Var, boolean z2) {
        kk8 kk8Var = new kk8(z2);
        this.a = kk8Var;
        this.b = rl3.I(new owp[]{kk8Var, new oxw(), new o7l(), (!aVar2.equals(tu70.a.C3775a.b) ? this : null) != null ? new tu70(aVar2, mm80Var) : null, (!z ? this : null) != null ? new egk0() : null, new cwp(), new c360(aVar), new gj00(), new d3q0()});
    }

    public final List<avp> a(Throwable th, m7q m7qVar, long j) {
        List<avp> list;
        Iterator<T> it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                list = null;
                break;
            }
            list = rdi.x(((owp) it.next()).a(th, m7qVar, j));
            if (list != null) {
                break;
            }
        }
        return list == null ? Collections.singletonList(yhj0.a) : list;
    }
}
