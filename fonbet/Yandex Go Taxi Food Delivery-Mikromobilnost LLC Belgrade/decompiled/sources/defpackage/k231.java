package defpackage;

import java.util.Comparator;
import kotlin.Pair;

/* loaded from: classes11.dex */
public final class k231 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Pair pair = (Pair) obj;
        String str = (String) pair.getFirst();
        c231 c231Var = (c231) pair.getSecond();
        StringBuilder t = qv10.t(str);
        t.append(c231Var.c());
        String sb = t.toString();
        Pair pair2 = (Pair) obj2;
        String str2 = (String) pair2.getFirst();
        c231 c231Var2 = (c231) pair2.getSecond();
        StringBuilder t2 = qv10.t(str2);
        t2.append(c231Var2.c());
        return sb.compareTo(t2.toString());
    }
}
