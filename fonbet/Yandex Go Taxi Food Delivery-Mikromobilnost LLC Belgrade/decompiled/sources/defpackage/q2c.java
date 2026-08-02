package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class q2c implements p2c {
    public ArrayList a;

    @Override // defpackage.p2c
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((p2c) it.next()).a();
        }
    }
}
