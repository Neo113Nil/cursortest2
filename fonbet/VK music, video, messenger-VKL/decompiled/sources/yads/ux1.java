package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.c5g;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class ux1 implements ga2 {
    public final Context a;
    public final da2 b;
    public final o42 c;
    public final String d;
    public final va e;
    public final za f;
    public final hx2 g;
    public final o83 h;
    public final h93 i;
    public g61 j;
    public boolean k;
    public boolean l;
    public final ArrayList m = new ArrayList();

    public ux1(Context context, da2 da2Var, o42 o42Var, String str, va vaVar, za zaVar, hx2 hx2Var, o83 o83Var, h93 h93Var) {
        this.a = context;
        this.b = da2Var;
        this.c = o42Var;
        this.d = str;
        this.e = vaVar;
        this.f = zaVar;
        this.g = hx2Var;
        this.h = o83Var;
        this.i = h93Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(List list) {
        uz2 uz2Var;
        uz2 uz2Var2;
        try {
            this.m.clear();
            h93 h93Var = this.i;
            va vaVar = this.e;
            h93Var.getClass();
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((tz2) it.next()).d);
            }
            Set S0 = j5g.S0(arrayList);
            int ordinal = vaVar.ordinal();
            if (ordinal == 0) {
                if (!(S0 instanceof Collection) || !S0.isEmpty()) {
                    Iterator it2 = S0.iterator();
                    while (it2.hasNext()) {
                        if (((uz2) it2.next()) == uz2.c) {
                            uz2Var = null;
                            break;
                        }
                    }
                }
                uz2Var = uz2.b;
            } else if (ordinal == 1) {
                uz2Var = uz2.c;
            } else {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                uz2Var = uz2.b;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list) {
                if (((tz2) obj).b != null) {
                    arrayList3.add(obj);
                }
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                tz2 tz2Var = (tz2) it3.next();
                String str = tz2Var.b;
                long j = tz2Var.a;
                int i = tz2Var.c;
                uz2 uz2Var3 = tz2Var.d;
                if (uz2Var3 == uz2.d && uz2Var != null) {
                    uz2Var2 = uz2Var;
                    if (str == null) {
                        arrayList2.add(new g93(i, j, uz2Var2, str));
                    }
                }
                uz2Var2 = uz2Var3;
                if (str == null) {
                }
            }
            this.m.addAll(arrayList2);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        this.h.b();
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((g93) it.next()).e = null;
        }
    }

    public final xc3 b(g93 g93Var) {
        xc3 b = this.c.b(g93Var.a());
        Objects.toString(b);
        return b;
    }

    public final synchronized void a(sd2 sd2Var, boolean z) {
        try {
            Objects.toString(sd2Var);
            int ordinal = sd2Var.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    b();
                } else if (ordinal != 2) {
                }
            }
            if (z) {
                a();
            }
        } finally {
        }
    }

    public final synchronized void a() {
        if (xd2.h.a(this.a).a() && !this.m.isEmpty() && !this.h.a()) {
            this.h.a(this);
        }
    }

    public final synchronized void a(g93 g93Var, vc3 vc3Var) {
        try {
            za.a(this.f, g93Var.a, o93.h);
            if (!this.k) {
                this.k = true;
                g61 g61Var = this.j;
                if (g61Var != null) {
                    g61Var.c();
                }
            }
            if (!this.l && this.m.isEmpty()) {
                this.l = true;
                g61 g61Var2 = this.j;
                if (g61Var2 != null) {
                    g61Var2.g();
                }
            }
            this.b.a(g93Var.d, vc3Var);
            da2 da2Var = this.b;
            uz2 uz2Var = g93Var.d;
            ArrayList arrayList = this.m;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((g93) it.next()).d);
            }
            da2Var.a(uz2Var, arrayList2, vc3Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(v9 v9Var, List list) {
        this.b.a(v9Var);
        this.m.clear();
        this.b.invalidate();
        this.l = false;
        b();
        a(list);
    }

    public final xc3 a(g93 g93Var) {
        xc3 a;
        qu2 a2 = this.g.a(this.a);
        if (a2 != null && a2.g()) {
            a = this.c.b(g93Var.a());
        } else {
            a = this.c.a(g93Var.a());
        }
        Objects.toString(a);
        return a;
    }
}
