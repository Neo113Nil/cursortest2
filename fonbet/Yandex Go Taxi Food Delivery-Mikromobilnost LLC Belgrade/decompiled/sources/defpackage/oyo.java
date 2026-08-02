package defpackage;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class oyo {
    public static volatile oyo b;
    public static final oyo c = new oyo();
    public final Map a = Collections.EMPTY_MAP;

    public static oyo b() {
        oyo oyoVar;
        oyo oyoVar2 = b;
        if (oyoVar2 != null) {
            return oyoVar2;
        }
        synchronized (oyo.class) {
            try {
                oyoVar = b;
                if (oyoVar == null) {
                    Class cls = iyo.a;
                    oyo oyoVar3 = null;
                    if (cls != null) {
                        try {
                            oyoVar3 = (oyo) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    oyoVar = oyoVar3 != null ? oyoVar3 : c;
                    b = oyoVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return oyoVar;
    }

    public final void a(vt10 vt10Var, int i) {
        b64.D(this.a.get(new lyo(vt10Var, i)));
    }
}
