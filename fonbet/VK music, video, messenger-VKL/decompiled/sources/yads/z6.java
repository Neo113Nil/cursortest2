package yads;

import java.util.ArrayList;
import java.util.Iterator;
import xsna.jza0;

/* loaded from: classes10.dex */
public abstract class z6 {
    public static final ArrayList a = new ArrayList();
    public static volatile sp0 b;

    public static final void a(sp0 sp0Var) {
        b = sp0Var;
        Iterator it = a.iterator();
        while (it.hasNext()) {
            jza0.b bVar = (jza0.b) it.next();
            if (b != null) {
                sp0 sp0Var2 = b;
                if (sp0Var2 != null) {
                    sp0Var2.a.c(bVar);
                }
            } else {
                a.add(bVar);
            }
        }
    }
}
