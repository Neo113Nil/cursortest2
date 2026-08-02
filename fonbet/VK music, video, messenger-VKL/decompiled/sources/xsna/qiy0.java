package xsna;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import xsna.ocz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class qiy0 {
    public boolean a = false;
    public final HashMap b = new HashMap();
    public final ArrayList c = new ArrayList();

    public final void a(ocz0.a aVar) {
        WeakReference weakReference = (WeakReference) this.b.get(aVar);
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        ArrayList arrayList = this.c;
        if (arrayList.contains(aVar)) {
            return;
        }
        arrayList.add(aVar);
        h8z0.e(aVar.a, "show", 1, null);
    }
}
