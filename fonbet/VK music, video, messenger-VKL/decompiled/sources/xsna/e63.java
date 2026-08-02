package xsna;

import java.util.Iterator;
import xsna.c63;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e63 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (c63.e > 0) {
            return;
        }
        Iterator<c63.b> it = c63.i.iterator();
        while (it.hasNext()) {
            it.next().t();
        }
    }
}
