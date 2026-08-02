package xsna;

import java.util.Iterator;
import xsna.c63;
import xsna.wyx;

/* compiled from: DefaultInstantJobManagerFactory.kt */
/* loaded from: classes.dex */
public final class qgl implements wyx.a {
    @Override // xsna.wyx.a
    public final void a(boolean z) {
        if (z && c63.c == 0) {
            c63.l = true;
            Iterator<c63.b> it = c63.i.iterator();
            while (it.hasNext()) {
                it.next().A();
            }
        }
    }
}
