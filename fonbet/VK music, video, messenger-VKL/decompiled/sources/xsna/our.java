package xsna;

import com.ironsource.X3;
import java.util.Iterator;

/* compiled from: FluentIterable.java */
/* loaded from: classes13.dex */
public abstract class our<E> implements Iterable<E> {
    public final kc b = kc.b;

    public final String toString() {
        this.b.getClass();
        Iterator<E> it = iterator();
        StringBuilder sb = new StringBuilder(X3.j.d);
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }
}
