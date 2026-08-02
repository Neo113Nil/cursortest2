package xsna;

import java.util.Iterator;
import xsna.c63;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f63 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        c63.f = c63.e > 0;
        if (c63.f) {
            return;
        }
        Iterator<c63.b> it = c63.i.iterator();
        while (it.hasNext()) {
            it.next().u();
        }
    }
}
