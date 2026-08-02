package defpackage;

import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class ptj0 implements iog, fog {
    public volatile p430 A;
    public File B;
    public qtj0 C;
    public final b a;
    public final uxg b;
    public int c;
    public int w = -1;
    public khx x;
    public List y;
    public int z;

    public ptj0(uxg uxgVar, b bVar) {
        this.b = uxgVar;
        this.a = bVar;
    }

    @Override // defpackage.iog
    public final boolean a() {
        List list;
        ArrayList e;
        ArrayList a = this.b.a();
        boolean z = false;
        if (!a.isEmpty()) {
            uxg uxgVar = this.b;
            Registry registry = uxgVar.c.getRegistry();
            Class<?> cls = uxgVar.d.getClass();
            Class cls2 = uxgVar.g;
            Class cls3 = uxgVar.k;
            x430 x430Var = registry.h;
            cl40 cl40Var = (cl40) x430Var.a.getAndSet(null);
            if (cl40Var == null) {
                cl40Var = new cl40(cls, cls2, cls3);
            } else {
                cl40Var.a = cls;
                cl40Var.b = cls2;
                cl40Var.c = cls3;
            }
            synchronized (x430Var.b) {
                list = (List) x430Var.b.get(cl40Var);
            }
            x430Var.a.set(cl40Var);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                t430 t430Var = registry.a;
                synchronized (t430Var) {
                    e = t430Var.a.e(cls);
                }
                Iterator it = e.iterator();
                while (it.hasNext()) {
                    Iterator it2 = registry.c.b((Class) it.next(), cls2).iterator();
                    while (it2.hasNext()) {
                        Class cls4 = (Class) it2.next();
                        if (!registry.f.a(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                x430 x430Var2 = registry.h;
                List unmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (x430Var2.b) {
                    x430Var2.b.put(new cl40(cls, cls2, cls3), unmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.y;
                    if (list3 != null && this.z < list3.size()) {
                        this.A = null;
                        while (!z && this.z < this.y.size()) {
                            List list4 = this.y;
                            int i = this.z;
                            this.z = i + 1;
                            q430 q430Var = (q430) list4.get(i);
                            File file = this.B;
                            uxg uxgVar2 = this.b;
                            this.A = q430Var.a(file, uxgVar2.e, uxgVar2.f, uxgVar2.i);
                            if (this.A != null && this.b.c(this.A.c.a()) != null) {
                                this.A.c.b(this.b.o, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                    int i2 = this.w + 1;
                    this.w = i2;
                    if (i2 >= list2.size()) {
                        int i3 = this.c + 1;
                        this.c = i3;
                        if (i3 >= a.size()) {
                            break;
                        }
                        this.w = 0;
                    }
                    khx khxVar = (khx) a.get(this.c);
                    Class cls5 = (Class) list2.get(this.w);
                    nw01 e2 = this.b.e(cls5);
                    g63 arrayPool = this.b.c.getArrayPool();
                    uxg uxgVar3 = this.b;
                    this.C = new qtj0(arrayPool, khxVar, uxgVar3.n, uxgVar3.e, uxgVar3.f, e2, cls5, uxgVar3.i);
                    File c = uxgVar3.h.a().c(this.C);
                    this.B = c;
                    if (c != null) {
                        this.x = khxVar;
                        this.y = this.b.c.getRegistry().f(c);
                        this.z = 0;
                    }
                }
            } else if (!File.class.equals(this.b.k)) {
                StringBuilder sb = new StringBuilder("Failed to find any load path from ");
                sb.append(this.b.d.getClass());
                kbs.q(sb, " to ", this.b.k);
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.iog
    public final void cancel() {
        p430 p430Var = this.A;
        if (p430Var != null) {
            p430Var.c.cancel();
        }
    }

    @Override // defpackage.fog
    public final void d(Object obj) {
        this.a.b(this.x, obj, this.A.c, DataSource.RESOURCE_DISK_CACHE, this.C);
    }

    @Override // defpackage.fog
    public final void e(Exception exc) {
        this.a.c(this.C, exc, this.A.c, DataSource.RESOURCE_DISK_CACHE);
    }
}
