package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class jg10 {
    public final vyc0 a;
    public final ig10 e;
    public final b32 h;
    public final a3x0 i;
    public boolean k;
    public cj01 l;
    public las0 j = new kas0();
    public final IdentityHashMap c = new IdentityHashMap();
    public final HashMap d = new HashMap();
    public final ArrayList b = new ArrayList();
    public final HashMap f = new HashMap();
    public final HashSet g = new HashSet();

    public jg10(ig10 ig10Var, b32 b32Var, a3x0 a3x0Var, vyc0 vyc0Var) {
        this.a = vyc0Var;
        this.e = ig10Var;
        this.h = b32Var;
        this.i = a3x0Var;
    }

    public final a9z0 a(int i, List list, las0 las0Var) {
        if (!list.isEmpty()) {
            this.j = las0Var;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                hg10 hg10Var = (hg10) list.get(i2 - i);
                ArrayList arrayList = this.b;
                if (i2 > 0) {
                    hg10 hg10Var2 = (hg10) arrayList.get(i2 - 1);
                    hg10Var.d = hg10Var2.a.H.b.p() + hg10Var2.d;
                    hg10Var.e = false;
                    hg10Var.c.clear();
                } else {
                    hg10Var.d = 0;
                    hg10Var.e = false;
                    hg10Var.c.clear();
                }
                int p = hg10Var.a.H.b.p();
                for (int i3 = i2; i3 < arrayList.size(); i3++) {
                    ((hg10) arrayList.get(i3)).d += p;
                }
                arrayList.add(i2, hg10Var);
                this.d.put(hg10Var.b, hg10Var);
                if (this.k) {
                    e(hg10Var);
                    if (this.c.isEmpty()) {
                        this.g.add(hg10Var);
                    } else {
                        gg10 gg10Var = (gg10) this.f.get(hg10Var);
                        if (gg10Var != null) {
                            gg10Var.a.disable(gg10Var.b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final a9z0 b() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return a9z0.a;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            hg10 hg10Var = (hg10) arrayList.get(i2);
            hg10Var.d = i;
            i += hg10Var.a.H.b.p();
        }
        return new kzc0(arrayList, this.j);
    }

    public final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            hg10 hg10Var = (hg10) it.next();
            if (hg10Var.c.isEmpty()) {
                gg10 gg10Var = (gg10) this.f.get(hg10Var);
                if (gg10Var != null) {
                    gg10Var.a.disable(gg10Var.b);
                }
                it.remove();
            }
        }
    }

    public final void d(hg10 hg10Var) {
        if (hg10Var.e && hg10Var.c.isEmpty()) {
            gg10 gg10Var = (gg10) this.f.remove(hg10Var);
            gg10Var.getClass();
            fg10 fg10Var = gg10Var.c;
            uf10 uf10Var = gg10Var.a;
            uf10Var.releaseSource(gg10Var.b);
            uf10Var.removeEventListener(fg10Var);
            uf10Var.removeDrmEventListener(fg10Var);
            this.g.remove(hg10Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [ag10, tf10] */
    public final void e(hg10 hg10Var) {
        ry00 ry00Var = hg10Var.a;
        ?? r1 = new tf10() { // from class: ag10
            @Override // defpackage.tf10
            public final void onSourceInfoRefreshed(uf10 uf10Var, a9z0 a9z0Var) {
                jg10.this.e.onPlaylistUpdateRequested();
            }
        };
        fg10 fg10Var = new fg10(this, hg10Var);
        this.f.put(hg10Var, new gg10(ry00Var, r1, fg10Var));
        ry00Var.addEventListener(tw21.o(null), fg10Var);
        ry00Var.addDrmEventListener(tw21.o(null), fg10Var);
        ry00Var.prepareSource(r1, this.l, this.a);
    }

    public final void f(xe10 xe10Var) {
        IdentityHashMap identityHashMap = this.c;
        hg10 hg10Var = (hg10) identityHashMap.remove(xe10Var);
        hg10Var.getClass();
        hg10Var.a.releasePeriod(xe10Var);
        hg10Var.c.remove(((oy00) xe10Var).a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(hg10Var);
    }

    public final void g(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = this.b;
            hg10 hg10Var = (hg10) arrayList.remove(i3);
            this.d.remove(hg10Var.b);
            int i4 = -hg10Var.a.H.b.p();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((hg10) arrayList.get(i5)).d += i4;
            }
            hg10Var.e = true;
            if (this.k) {
                d(hg10Var);
            }
        }
    }
}
