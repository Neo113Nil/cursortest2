package xsna;

import java.util.Iterator;

/* compiled from: ReactionsDelegate.kt */
/* loaded from: classes16.dex */
public final class e3f0 {
    public final v76 a;

    public /* synthetic */ e3f0(v76 v76Var) {
        this.a = v76Var;
    }

    public void a(tam0 tam0Var) {
        nov novVar;
        Iterator<nov> it = tam0Var.h.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                novVar = null;
                break;
            } else {
                novVar = it.next();
                if (novVar instanceof pjm0) {
                    break;
                }
            }
        }
        this.a.v(((pjm0) (novVar instanceof pjm0 ? novVar : null)) != null);
    }
}
