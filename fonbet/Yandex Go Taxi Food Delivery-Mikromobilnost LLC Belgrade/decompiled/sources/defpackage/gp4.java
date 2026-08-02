package defpackage;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes10.dex */
public final class gp4 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public final void a(Handler handler, hp4 hp4Var) {
        handler.getClass();
        hp4Var.getClass();
        c(hp4Var);
        this.a.add(new fp4(handler, hp4Var));
    }

    public final void b(int i, long j, long j2) {
        int i2;
        long j3;
        long j4;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            fp4 fp4Var = (fp4) it.next();
            if (fp4Var.c) {
                i2 = i;
                j3 = j;
                j4 = j2;
            } else {
                i2 = i;
                j3 = j;
                j4 = j2;
                fp4Var.a.post(new wg3(i2, 1, j3, j4, fp4Var));
            }
            i = i2;
            j = j3;
            j2 = j4;
        }
    }

    public final void c(hp4 hp4Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            fp4 fp4Var = (fp4) it.next();
            if (fp4Var.b == hp4Var) {
                fp4Var.c = true;
                copyOnWriteArrayList.remove(fp4Var);
            }
        }
    }
}
