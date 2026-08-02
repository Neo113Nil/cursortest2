package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public final class pi61 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public final void a(int i, long j, long j2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            b291 b291Var = (b291) it.next();
            if (!b291Var.c) {
                b291Var.a.post(new wg3(i, 2, j, j2, b291Var));
            }
        }
    }
}
