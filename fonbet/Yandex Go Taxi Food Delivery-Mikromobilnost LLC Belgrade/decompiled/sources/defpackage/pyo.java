package defpackage;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class pyo {
    public static volatile pyo b;
    public static final pyo c = new pyo();
    public final Map a = Collections.EMPTY_MAP;

    public static pyo b() {
        pyo pyoVar;
        Class cls = g72.a;
        pyo pyoVar2 = b;
        if (pyoVar2 != null) {
            return pyoVar2;
        }
        synchronized (pyo.class) {
            try {
                pyoVar = b;
                if (pyoVar == null) {
                    Class cls2 = jyo.a;
                    pyo pyoVar3 = null;
                    if (cls2 != null) {
                        try {
                            pyoVar3 = (pyo) cls2.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    pyoVar = pyoVar3 != null ? pyoVar3 : c;
                    b = pyoVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return pyoVar;
    }

    public final rxs a(int i, wt10 wt10Var) {
        return (rxs) this.a.get(new myo(i, wt10Var));
    }
}
