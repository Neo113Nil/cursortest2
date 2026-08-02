package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes10.dex */
public final class ah2 extends Lambda implements gzs {
    public static final ah2 b = new ah2();

    public ah2() {
        super(0);
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Object obj;
        Iterator<E> it = zg2.d.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            List list = ((zg2) obj).b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    try {
                        Class.forName((String) it2.next());
                        break loop0;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return (zg2) obj;
    }
}
