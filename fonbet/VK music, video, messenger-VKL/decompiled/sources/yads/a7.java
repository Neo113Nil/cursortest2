package yads;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class a7 {
    public static final ArrayList a = new ArrayList();
    public static volatile tp0 b;

    public static final void a(tp0 tp0Var) {
        b = tp0Var;
        Iterator it = a.iterator();
        while (it.hasNext()) {
            nf2 nf2Var = (nf2) it.next();
            if (b != null) {
                tp0 tp0Var2 = b;
                if (tp0Var2 != null) {
                    ((ao0) tp0Var2.a).a(nf2Var);
                }
            } else {
                a.add(nf2Var);
            }
        }
    }
}
