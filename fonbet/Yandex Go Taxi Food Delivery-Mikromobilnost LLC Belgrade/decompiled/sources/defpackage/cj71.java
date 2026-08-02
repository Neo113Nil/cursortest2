package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import yads.t31;
import yads.w31;
import yads.wk2;

/* loaded from: classes7.dex */
public final class cj71 implements cq61, mr81 {
    public static final wk2 n = t31.n(4800000L, 3100000L, 2100000L, 1500000L, 800000L);
    public static final wk2 o = t31.n(1500000L, 1000000L, 730000L, 440000L, 170000L);
    public static final wk2 p = t31.n(2200000L, 1400000L, 1100000L, 910000L, 620000L);
    public static final wk2 q = t31.n(3000000L, 1900000L, 1400000L, 1000000L, 660000L);
    public static final wk2 r = t31.n(6000000L, 4100000L, 3200000L, 1800000L, 1000000L);
    public static final wk2 s = t31.n(2800000L, 2400000L, 1600000L, 1100000L, 950000L);
    public static cj71 t;
    public final w31 a;
    public final xb71 d;
    public int f;
    public long g;
    public long h;
    public int i;
    public long j;
    public long k;
    public long l;
    public long m;
    public final pi61 b = new pi61();
    public final d271 c = new d271();
    public final boolean e = true;

    public cj71(Context context, HashMap hashMap, xb71 xb71Var) {
        this.a = w31.a(hashMap);
        this.d = xb71Var;
        if (context == null) {
            this.i = 0;
            this.l = a(0);
            return;
        }
        hl61 b = hl61.b(context);
        int a = b.a();
        this.i = a;
        this.l = a(a);
        bj71 bj71Var = new bj71(this);
        CopyOnWriteArrayList copyOnWriteArrayList = b.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(bj71Var));
        b.a.post(new bo31(20, b, bj71Var));
    }

    public final long a(int i) {
        Integer valueOf = Integer.valueOf(i);
        w31 w31Var = this.a;
        Long l = (Long) w31Var.get(valueOf);
        if (l == null) {
            l = (Long) w31Var.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }
}
