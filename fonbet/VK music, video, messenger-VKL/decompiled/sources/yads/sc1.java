package yads;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class sc1 {
    public static rc1 a(k62 k62Var, List list) {
        int i;
        Integer num;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                Integer valueOf = Integer.valueOf(((tz2) it.next()).c);
                while (it.hasNext()) {
                    Integer valueOf2 = Integer.valueOf(((tz2) it.next()).c);
                    if (valueOf.compareTo(valueOf2) < 0) {
                        valueOf = valueOf2;
                    }
                }
                num = valueOf;
            } else {
                num = null;
            }
            if (num != null) {
                i = num.intValue();
                return new rc1(k62Var, i);
            }
        }
        i = 50;
        return new rc1(k62Var, i);
    }
}
