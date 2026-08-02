package yads;

import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.TimeUtils;
import xsna.epx;

/* loaded from: classes10.dex */
public final class lj2 {
    public final long a;
    public final int b;
    public final aq0 c;
    public final bq0 d;
    public final ArrayList e;

    public /* synthetic */ lj2() {
        this(TimeUtils.MILLISECONDS_PER_DAY, 5, new aq0(), new bq0());
    }

    public final synchronized void a(oy0 oy0Var, Object obj) {
        a();
        if (this.e.size() < this.b) {
            ArrayList arrayList = this.e;
            bq0 bq0Var = this.d;
            long j = this.a;
            bq0Var.getClass();
            arrayList.add(new kj2(oy0Var, obj, System.currentTimeMillis() + j));
        }
    }

    public final synchronized boolean b() {
        a();
        return this.e.size() < this.b;
    }

    public lj2(long j, int i, aq0 aq0Var, bq0 bq0Var) {
        this.a = j;
        this.b = i;
        this.c = aq0Var;
        this.d = bq0Var;
        this.e = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.e;
        aq0 aq0Var = this.c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            aq0Var.getClass();
            if (System.currentTimeMillis() > ((kj2) ((zp0) next)).c) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.e.remove((kj2) it2.next());
        }
    }

    public final synchronized Object a(oy0 oy0Var) {
        Object obj;
        Object obj2;
        Object obj3;
        try {
            a();
            Iterator it = this.e.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (epx.f(((kj2) obj2).a, oy0Var)) {
                    break;
                }
            }
            kj2 kj2Var = (kj2) obj2;
            if (kj2Var != null && (obj3 = kj2Var.b) != null) {
                this.e.remove(kj2Var);
                obj = obj3;
            }
        } catch (Throwable th) {
            throw th;
        }
        return obj;
    }
}
