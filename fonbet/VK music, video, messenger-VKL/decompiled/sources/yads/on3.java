package yads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class on3 {
    public static final boolean c = pn3.a;
    public final ArrayList a = new ArrayList();
    public boolean b = false;

    public final synchronized void a(String str, long j) {
        if (this.b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.a.add(new nn3(str, j, SystemClock.elapsedRealtime()));
    }

    public final void finalize() {
        if (this.b) {
            return;
        }
        a();
    }

    public final synchronized void a() {
        long j;
        this.b = true;
        if (this.a.size() == 0) {
            j = 0;
        } else {
            long j2 = ((nn3) this.a.get(0)).a;
            ArrayList arrayList = this.a;
            j = ((nn3) arrayList.get(arrayList.size() - 1)).a - j2;
        }
        if (j <= 0) {
            return;
        }
        long j3 = ((nn3) this.a.get(0)).a;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            long j4 = ((nn3) it.next()).a;
        }
    }
}
