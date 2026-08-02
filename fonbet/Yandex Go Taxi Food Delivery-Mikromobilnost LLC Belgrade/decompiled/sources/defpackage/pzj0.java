package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class pzj0 {
    public final w2a0 a;
    public final upr b;
    public final t7w c;
    public final t3a0 d;

    public pzj0(w2a0 w2a0Var, upr uprVar, t7w t7wVar, pey peyVar, t3a0 t3a0Var) {
        this.a = w2a0Var;
        this.b = uprVar;
        this.c = t7wVar;
        this.d = t3a0Var;
    }

    public static String a(List list, Map map) {
        String str;
        Iterator it = list.iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) map.get((String) it.next());
            if (str2 != null && str2.length() > 0) {
                str = str2;
            }
        } while (str == null);
        return str;
    }
}
