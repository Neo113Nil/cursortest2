package xsna;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import java.util.Iterator;
import xsna.c63;

/* compiled from: AppLifecycleDispatcher.kt */
/* loaded from: classes.dex */
public final class d63 implements ComponentCallbacks {
    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Iterator<T> it = c63.i.iterator();
        while (it.hasNext()) {
            ((c63.b) it.next()).B(configuration);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        Iterator<T> it = c63.i.iterator();
        while (it.hasNext()) {
            ((c63.b) it.next()).C();
        }
    }
}
