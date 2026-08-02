package xsna;

import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaQueueItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import xsna.lvf0;
import xsna.pv10;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class am01 extends lvf0.a {
    public final /* synthetic */ pv10 a;

    public am01(pv10 pv10Var) {
        this.a = pv10Var;
    }

    @Override // xsna.lvf0.a
    public final void e() {
        pv10 pv10Var = this.a;
        long e = pv10Var.e();
        if (e != pv10Var.b) {
            pv10Var.b = e;
            pv10Var.a();
            if (pv10Var.b != 0) {
                pv10Var.b();
            }
        }
    }

    @Override // xsna.lvf0.a
    public final void g(int[] iArr) {
        ArrayList e = o0a.e(iArr);
        pv10 pv10Var = this.a;
        if (pv10Var.d.equals(e)) {
            return;
        }
        pv10Var.f();
        pv10Var.f.evictAll();
        pv10Var.g.clear();
        pv10Var.d = e;
        pv10Var.c();
        pv10Var.h();
        pv10Var.g();
    }

    @Override // xsna.lvf0.a
    public final void h(int i, int[] iArr) {
        int i2;
        if (i == 0) {
            i2 = this.a.d.size();
        } else {
            pv10 pv10Var = this.a;
            i2 = pv10Var.e.get(i, -1);
            if (i2 == -1) {
                pv10Var.b();
                return;
            }
        }
        pv10 pv10Var2 = this.a;
        pv10Var2.f();
        pv10Var2.d.addAll(i2, o0a.e(iArr));
        pv10Var2.c();
        Set set = pv10Var2.m;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((pv10.a) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        pv10Var2.g();
    }

    @Override // xsna.lvf0.a
    public final void i(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = iArr.length;
            pv10 pv10Var = this.a;
            if (i >= length) {
                Collections.sort(arrayList);
                pv10Var.f();
                o0a.d(arrayList);
                pv10Var.d();
                pv10Var.g();
                return;
            }
            int i2 = iArr[i];
            pv10Var.f.remove(Integer.valueOf(i2));
            int i3 = pv10Var.e.get(i2, -1);
            if (i3 == -1) {
                pv10Var.b();
                return;
            }
            i = tv4.a(arrayList, i3, i, 1);
        }
    }

    @Override // xsna.lvf0.a
    public final void j(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            pv10 pv10Var = this.a;
            pv10Var.f.remove(Integer.valueOf(i));
            SparseIntArray sparseIntArray = pv10Var.e;
            int i2 = sparseIntArray.get(i, -1);
            if (i2 == -1) {
                pv10Var.b();
                return;
            } else {
                sparseIntArray.delete(i);
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList);
        pv10 pv10Var2 = this.a;
        pv10Var2.f();
        pv10Var2.d.removeAll(o0a.e(iArr));
        pv10Var2.c();
        o0a.d(arrayList);
        Set set = pv10Var2.m;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((pv10.a) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        pv10Var2.g();
    }

    @Override // xsna.lvf0.a
    public final void k(MediaQueueItem[] mediaQueueItemArr) {
        HashSet hashSet = new HashSet();
        pv10 pv10Var = this.a;
        ArrayList arrayList = pv10Var.g;
        SparseIntArray sparseIntArray = pv10Var.e;
        arrayList.clear();
        for (MediaQueueItem mediaQueueItem : mediaQueueItemArr) {
            int i = mediaQueueItem.c;
            pv10Var.f.put(Integer.valueOf(i), mediaQueueItem);
            int i2 = sparseIntArray.get(i, -1);
            if (i2 == -1) {
                pv10Var.b();
                return;
            }
            hashSet.add(Integer.valueOf(i2));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i3 = sparseIntArray.get(((Integer) it.next()).intValue(), -1);
            if (i3 != -1) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList(hashSet);
        Collections.sort(arrayList2);
        pv10Var.f();
        o0a.d(arrayList2);
        pv10Var.d();
        pv10Var.g();
    }

    @Override // xsna.lvf0.a
    public final void l(int i, ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        if (i == 0) {
            this.a.d.size();
        } else if (arrayList2.isEmpty()) {
            this.a.a.c("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]);
        } else {
            SparseIntArray sparseIntArray = this.a.e;
            if (sparseIntArray.get(i, -1) == -1) {
                sparseIntArray.get(((Integer) arrayList2.get(0)).intValue(), -1);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            pv10 pv10Var = this.a;
            int i2 = pv10Var.e.get(intValue, -1);
            if (i2 == -1) {
                pv10Var.b();
                return;
            }
            arrayList3.add(Integer.valueOf(i2));
        }
        pv10 pv10Var2 = this.a;
        pv10Var2.f();
        pv10Var2.d = arrayList;
        pv10Var2.c();
        Set set = pv10Var2.m;
        synchronized (set) {
            try {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    ((pv10.a) it2.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        pv10Var2.g();
    }

    @Override // xsna.lvf0.a
    public final void m() {
        this.a.b();
    }
}
