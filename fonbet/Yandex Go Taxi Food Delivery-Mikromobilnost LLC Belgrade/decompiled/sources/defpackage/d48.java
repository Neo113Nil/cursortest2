package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class d48 {
    public final Object a = new Object();
    public final LongSparseArray b = new LongSparseArray();
    public final HashMap c = new HashMap();
    public final LongSparseArray d = new LongSparseArray();
    public c48 e;

    public final void a(TotalCaptureResult totalCaptureResult, int i) {
        synchronized (this.a) {
            try {
                Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
                long longValue = l != null ? l.longValue() : -1L;
                if (longValue == -1) {
                    return;
                }
                LongSparseArray longSparseArray = this.b;
                List list = (List) longSparseArray.get(longValue);
                if (list == null) {
                    list = new ArrayList();
                    longSparseArray.put(longValue, list);
                }
                list.add(totalCaptureResult);
                this.c.put(totalCaptureResult, Integer.valueOf(i));
                d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.a) {
            try {
                this.b.clear();
                int i = 0;
                while (true) {
                    int size = this.d.size();
                    LongSparseArray longSparseArray = this.d;
                    if (i < size) {
                        Iterator it = ((List) this.d.get(longSparseArray.keyAt(i))).iterator();
                        while (it.hasNext()) {
                            ((o0r0) ((rdv) it.next())).a();
                        }
                        i++;
                    } else {
                        longSparseArray.clear();
                        this.c.clear();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(rdv rdvVar) {
        synchronized (this.a) {
            Image image = ((o0r0) rdvVar).b;
            LongSparseArray longSparseArray = this.d;
            long timestamp = image.getTimestamp();
            List list = (List) longSparseArray.get(timestamp);
            if (list == null) {
                list = new ArrayList();
                longSparseArray.put(timestamp, list);
            }
            list.add(rdvVar);
        }
        d();
    }

    public final void d() {
        c48 c48Var;
        rdv rdvVar;
        TotalCaptureResult totalCaptureResult;
        Integer num;
        synchronized (this.a) {
            try {
                int size = this.b.size() - 1;
                while (true) {
                    c48Var = null;
                    if (size < 0) {
                        rdvVar = null;
                        totalCaptureResult = null;
                        break;
                    }
                    List list = (List) this.b.valueAt(size);
                    if (!list.isEmpty()) {
                        totalCaptureResult = (TotalCaptureResult) list.get(0);
                        Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
                        long longValue = l != null ? l.longValue() : -1L;
                        d6z.y(null, longValue == this.b.keyAt(size));
                        List list2 = (List) this.d.get(longValue);
                        if (list2 != null && !list2.isEmpty()) {
                            rdvVar = (rdv) list2.get(0);
                            LongSparseArray longSparseArray = this.d;
                            List list3 = (List) longSparseArray.get(longValue);
                            if (list3 != null) {
                                list3.remove(rdvVar);
                                if (list3.isEmpty()) {
                                    longSparseArray.remove(longValue);
                                }
                            }
                            list.remove(totalCaptureResult);
                            if (list.isEmpty()) {
                                this.b.removeAt(size);
                            }
                        }
                    }
                    size--;
                }
                e();
            } finally {
            }
        }
        if (rdvVar == null || totalCaptureResult == null) {
            return;
        }
        synchronized (this.a) {
            try {
                c48 c48Var2 = this.e;
                if (c48Var2 != null) {
                    num = (Integer) this.c.get(totalCaptureResult);
                    c48Var = c48Var2;
                } else {
                    ((o0r0) rdvVar).a();
                    num = null;
                }
            } finally {
            }
        }
        if (c48Var != null) {
            c48Var.a(rdvVar, totalCaptureResult, num.intValue());
        }
    }

    public final void e() {
        synchronized (this.a) {
            try {
                if (this.d.size() != 0 && this.b.size() != 0) {
                    long keyAt = this.d.keyAt(0);
                    Long valueOf = Long.valueOf(keyAt);
                    long keyAt2 = this.b.keyAt(0);
                    d6z.n(!Long.valueOf(keyAt2).equals(valueOf));
                    if (keyAt2 > keyAt) {
                        for (int size = this.d.size() - 1; size >= 0; size--) {
                            if (this.d.keyAt(size) < keyAt2) {
                                Iterator it = ((List) this.d.valueAt(size)).iterator();
                                while (it.hasNext()) {
                                    ((o0r0) ((rdv) it.next())).a();
                                }
                                this.d.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.b.size() - 1; size2 >= 0; size2--) {
                            if (this.b.keyAt(size2) < keyAt) {
                                this.b.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }
}
