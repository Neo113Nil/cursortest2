package xsna;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* compiled from: ControlsBackgroundController.kt */
/* loaded from: classes3.dex */
public final class nqj {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final String b = UUID.randomUUID().toString();
    public final ArrayList c = new ArrayList();

    public final void a(boolean z) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            fqj fqjVar = (fqj) ((WeakReference) it.next()).get();
            if (fqjVar != null) {
                int i = fqj.h;
                fqjVar.a(z, false);
            }
        }
    }
}
