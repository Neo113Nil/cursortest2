package androidx.camera.core.impl;

import androidx.camera.core.impl.DeferrableSurface;
import defpackage.e5h;
import defpackage.gl7;
import defpackage.jx81;
import defpackage.ni91;
import defpackage.t26;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes10.dex */
public abstract class a {
    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((DeferrableSurface) it.next()).b();
        }
    }

    public static void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = 0;
        do {
            try {
                ((DeferrableSurface) list.get(i)).d();
                i++;
            } catch (DeferrableSurface.SurfaceClosedException e) {
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    ((DeferrableSurface) list.get(i2)).b();
                }
                throw e;
            }
        } while (i < list.size());
    }

    public static gl7 c(List list, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ni91.g(((DeferrableSurface) it.next()).c()));
        }
        return jx81.r(new t26(7, jx81.r(new e5h(ni91.k(arrayList), scheduledExecutorService, 5000L, 2)), executor, list));
    }
}
