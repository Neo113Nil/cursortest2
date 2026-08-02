package yads;

import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class su1 {
    public final Object a = new Object();
    public final ArrayList b = new ArrayList();

    public final void a(v61 v61Var) {
        synchronized (this.a) {
            this.b.add(v61Var);
        }
    }
}
