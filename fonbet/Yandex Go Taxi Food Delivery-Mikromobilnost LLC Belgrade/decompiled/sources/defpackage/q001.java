package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes10.dex */
public class q001 {
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int e = Integer.MAX_VALUE;
    public int f = Integer.MAX_VALUE;
    public boolean g = true;
    public boolean h = true;
    public ImmutableList i = ImmutableList.p();
    public ImmutableList j = ImmutableList.p();
    public ImmutableList k = ImmutableList.p();
    public int l = Integer.MAX_VALUE;
    public int m = Integer.MAX_VALUE;
    public ImmutableList n = ImmutableList.p();
    public p001 o = p001.a;
    public ImmutableList p = ImmutableList.p();
    public boolean q = true;
    public int r = 0;
    public boolean s = false;
    public HashMap t = new HashMap();
    public HashSet u = new HashSet();

    public static ImmutableList d(String[] strArr) {
        piv pivVar = ImmutableList.b;
        ImmutableList.a aVar = new ImmutableList.a();
        for (String str : strArr) {
            str.getClass();
            aVar.a(tw21.X(str));
        }
        return aVar.g();
    }

    public r001 a() {
        return new r001(this);
    }

    public q001 b(int i) {
        Iterator it = this.t.values().iterator();
        while (it.hasNext()) {
            if (((n001) it.next()).a.c == i) {
                it.remove();
            }
        }
        return this;
    }

    public final void c(r001 r001Var) {
        this.a = r001Var.a;
        this.b = r001Var.b;
        this.c = r001Var.c;
        this.d = r001Var.d;
        this.e = r001Var.e;
        this.f = r001Var.f;
        this.g = r001Var.g;
        this.h = r001Var.h;
        this.i = r001Var.i;
        this.j = r001Var.j;
        this.k = r001Var.k;
        this.l = r001Var.l;
        this.m = r001Var.m;
        this.n = r001Var.n;
        this.o = r001Var.o;
        this.p = r001Var.p;
        this.q = r001Var.q;
        this.r = r001Var.r;
        this.s = r001Var.s;
        this.u = new HashSet(r001Var.u);
        this.t = new HashMap(r001Var.t);
    }

    public q001 e() {
        this.r = -3;
        return this;
    }

    public q001 f(n001 n001Var) {
        xzz0 xzz0Var = n001Var.a;
        b(xzz0Var.c);
        this.t.put(xzz0Var, n001Var);
        return this;
    }

    public q001 g(String str) {
        return str == null ? h(new String[0]) : h(str);
    }

    public q001 h(String... strArr) {
        this.p = d(strArr);
        this.q = false;
        return this;
    }

    public q001 i() {
        this.q = false;
        return this;
    }

    public q001 j(int i) {
        this.u.remove(Integer.valueOf(i));
        return this;
    }
}
