package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes10.dex */
public abstract class c45 implements uf10 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final xf10 c = new xf10();
    public final mmm w = new mmm();
    public Looper x;
    public a9z0 y;
    public vyc0 z;

    public final xf10 a(sf10 sf10Var) {
        return new xf10(this.c.c, 0, sf10Var);
    }

    @Override // defpackage.uf10
    public final void addDrmEventListener(Handler handler, nmm nmmVar) {
        handler.getClass();
        nmmVar.getClass();
        mmm mmmVar = this.w;
        mmmVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = mmmVar.c;
        lmm lmmVar = new lmm();
        lmmVar.a = handler;
        lmmVar.b = nmmVar;
        copyOnWriteArrayList.add(lmmVar);
    }

    @Override // defpackage.uf10
    public final void addEventListener(Handler handler, yf10 yf10Var) {
        handler.getClass();
        yf10Var.getClass();
        xf10 xf10Var = this.c;
        xf10Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = xf10Var.c;
        wf10 wf10Var = new wf10();
        wf10Var.a = handler;
        wf10Var.b = yf10Var;
        copyOnWriteArrayList.add(wf10Var);
    }

    public void b() {
    }

    public void c() {
    }

    @Override // defpackage.uf10
    public final void disable(tf10 tf10Var) {
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(tf10Var);
        if (isEmpty || !hashSet.isEmpty()) {
            return;
        }
        b();
    }

    public abstract void e(cj01 cj01Var);

    @Override // defpackage.uf10
    public final void enable(tf10 tf10Var) {
        this.x.getClass();
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(tf10Var);
        if (isEmpty) {
            c();
        }
    }

    public final void f(a9z0 a9z0Var) {
        this.y = a9z0Var;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((tf10) it.next()).onSourceInfoRefreshed(this, a9z0Var);
        }
    }

    public abstract void g();

    @Override // defpackage.uf10
    public final void prepareSource(tf10 tf10Var, cj01 cj01Var, vyc0 vyc0Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.x;
        d6z.l(looper == null || looper == myLooper);
        this.z = vyc0Var;
        a9z0 a9z0Var = this.y;
        this.a.add(tf10Var);
        if (this.x == null) {
            this.x = myLooper;
            this.b.add(tf10Var);
            e(cj01Var);
        } else if (a9z0Var != null) {
            enable(tf10Var);
            tf10Var.onSourceInfoRefreshed(this, a9z0Var);
        }
    }

    @Override // defpackage.uf10
    public final void releaseSource(tf10 tf10Var) {
        ArrayList arrayList = this.a;
        arrayList.remove(tf10Var);
        if (!arrayList.isEmpty()) {
            disable(tf10Var);
            return;
        }
        this.x = null;
        this.y = null;
        this.z = null;
        this.b.clear();
        g();
    }

    @Override // defpackage.uf10
    public final void removeDrmEventListener(nmm nmmVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.w.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            lmm lmmVar = (lmm) it.next();
            if (lmmVar.b == nmmVar) {
                copyOnWriteArrayList.remove(lmmVar);
            }
        }
    }

    @Override // defpackage.uf10
    public final void removeEventListener(yf10 yf10Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            wf10 wf10Var = (wf10) it.next();
            if (wf10Var.b == yf10Var) {
                copyOnWriteArrayList.remove(wf10Var);
            }
        }
    }

    @Override // defpackage.uf10
    public final void prepareSource(tf10 tf10Var, cj01 cj01Var) {
        prepareSource(tf10Var, cj01Var, vyc0.d);
    }
}
