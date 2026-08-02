package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class l6o implements eg90 {
    public final omk c;
    public final Object d = new Object();
    public final br60 e = new br60();
    public final ArrayList f = new ArrayList();
    public List g = EmptyList.a;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public boolean j = true;

    public l6o(omk omkVar, zmk zmkVar) {
        this.c = omkVar;
    }

    @Override // defpackage.eg90
    public final void a(Exception exc) {
        e(exc);
    }

    public final void c() {
        List list;
        synchronized (this.d) {
            try {
                omk omkVar = this.c;
                if (omkVar != null) {
                    list = omkVar.h;
                    if (list == null) {
                    }
                    this.g = list;
                    g();
                }
                list = EmptyList.a;
                this.g = list;
                g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.d) {
            this.h.clear();
            this.f.clear();
            g();
        }
    }

    public final void e(Throwable th) {
        synchronized (this.d) {
            this.f.add(th);
            g();
        }
    }

    public final void f(Throwable th) {
        synchronized (this.d) {
            this.h.add(th);
            g();
        }
    }

    public final void g() {
        synchronized (this.d) {
            this.j = false;
            if (this.e.c == 0) {
                return;
            }
            h();
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((wls) it.next()).invoke(this.i, this.h);
            }
        }
    }

    public final void h() {
        if (this.j) {
            return;
        }
        ArrayList arrayList = this.i;
        arrayList.clear();
        arrayList.addAll(this.g);
        arrayList.addAll(this.f);
        this.j = true;
    }
}
