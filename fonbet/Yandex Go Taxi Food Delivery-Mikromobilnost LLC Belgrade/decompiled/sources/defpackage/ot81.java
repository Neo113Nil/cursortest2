package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.a;
import kotlin.collections.b;
import yads.eb2;
import yads.p9;
import yads.q53;
import yads.q63;
import yads.yw2;

/* loaded from: classes7.dex */
public final class ot81 {
    public final Context a;
    public final yx71 b;
    public final nr41 c;
    public final p9 d;
    public final pb81 e;
    public final a081 f;
    public final q53 g;
    public final ji71 h;
    public bl61 i;
    public boolean j;
    public boolean k;
    public final ArrayList l;

    public ot81(Context context, fe81 fe81Var, v981 v981Var, yx71 yx71Var, nr41 nr41Var, String str, p9 p9Var) {
        a081 a081Var;
        pb81 pb81Var = new pb81(context, fe81Var, v981Var);
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        q53 q53Var = new q53(yx71Var);
        ji71 ji71Var = new ji71();
        this.a = context;
        this.b = yx71Var;
        this.c = nr41Var;
        this.d = p9Var;
        this.e = pb81Var;
        this.f = a081Var2;
        this.g = q53Var;
        this.h = ji71Var;
        this.l = new ArrayList();
    }

    public final synchronized void a(kf71 kf71Var, f881 f881Var) {
        q63 q63Var;
        try {
            int ordinal = kf71Var.d.ordinal();
            if (ordinal == 0) {
                q63Var = q63.e;
            } else if (ordinal == 1) {
                q63Var = q63.f;
            } else {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                q63Var = q63.k;
            }
            pb81 pb81Var = this.e;
            String str = kf71Var.a;
            ExecutorService executorService = pb81.d;
            pb81Var.a(str, q63Var, b.f());
            if (!this.j) {
                this.j = true;
                bl61 bl61Var = this.i;
                if (bl61Var != null) {
                    bl61Var.c();
                }
            }
            if (!this.k && this.l.isEmpty()) {
                this.k = true;
                bl61 bl61Var2 = this.i;
                if (bl61Var2 != null) {
                    bl61Var2.g();
                }
            }
            this.b.b(kf71Var.d, f881Var);
            yx71 yx71Var = this.b;
            yw2 yw2Var = kf71Var.d;
            ArrayList arrayList = this.l;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((kf71) it.next()).d);
            }
            yx71Var.d(yw2Var, arrayList2, f881Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(ArrayList arrayList) {
        yw2 yw2Var;
        yw2 yw2Var2;
        try {
            this.l.clear();
            ji71 ji71Var = this.h;
            p9 p9Var = this.d;
            ji71Var.getClass();
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((qt81) it.next()).d);
            }
            Set N0 = a.N0(arrayList2);
            int ordinal = p9Var.ordinal();
            if (ordinal == 0) {
                if (!(N0 instanceof Collection) || !N0.isEmpty()) {
                    Iterator it2 = N0.iterator();
                    while (it2.hasNext()) {
                        if (((yw2) it2.next()) == yw2.c) {
                            yw2Var = null;
                            break;
                        }
                    }
                }
                yw2Var = yw2.b;
            } else if (ordinal == 1) {
                yw2Var = yw2.c;
            } else {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                yw2Var = yw2.b;
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                String str = ((qt81) next).b;
                arrayList4.add(next);
            }
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                qt81 qt81Var = (qt81) it4.next();
                String str2 = qt81Var.b;
                long j = qt81Var.a;
                int i = qt81Var.c;
                yw2 yw2Var3 = qt81Var.d;
                if (yw2Var3 == yw2.d && yw2Var != null) {
                    yw2Var2 = yw2Var;
                    arrayList3.add(new kf71(i, j, str2, yw2Var2));
                }
                yw2Var2 = yw2Var3;
                arrayList3.add(new kf71(i, j, str2, yw2Var2));
            }
            this.l.addAll(arrayList3);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        if (eb2.h.a(this.a).a() && !this.l.isEmpty() && !this.g.a()) {
            this.g.a(this);
        }
    }

    public final synchronized void d() {
        this.g.b();
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((kf71) it.next()).e = null;
        }
    }
}
