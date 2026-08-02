package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WorkTagDao.kt */
/* loaded from: classes.dex */
public interface cyx0 {
    void a(String str);

    default void b(String str, Set<String> set) {
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            d(new byx0((String) it.next(), str));
        }
    }

    ArrayList c(String str);

    void d(byx0 byx0Var);
}
