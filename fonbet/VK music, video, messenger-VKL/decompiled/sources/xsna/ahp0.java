package xsna;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: TrackSelectionParameters.java */
/* loaded from: classes12.dex */
public class ahp0 {
    public static final ahp0 y = new ahp0(new b());
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final ImmutableList<String> i;
    public final ImmutableList<String> j;
    public final ImmutableList<String> k;
    public final ImmutableList<String> l;
    public final ImmutableList<String> m;
    public final int n;
    public final int o;
    public final ImmutableList<String> p;
    public final a q;
    public final ImmutableList<String> r;
    public final ImmutableList<String> s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final ImmutableMap<pfp0, zgp0> w;
    public final ImmutableSet<Integer> x;

    /* compiled from: TrackSelectionParameters.java */
    public static final class a {
        public static final a a = new a();

        static {
            y2r0.L(1);
            y2r0.L(2);
            y2r0.L(3);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return 29791;
        }
    }

    /* compiled from: TrackSelectionParameters.java */
    public static class b {
        public int a = Integer.MAX_VALUE;
        public int b = Integer.MAX_VALUE;
        public int c = Integer.MAX_VALUE;
        public int d = Integer.MAX_VALUE;
        public int e = Integer.MAX_VALUE;
        public int f = Integer.MAX_VALUE;
        public boolean g = true;
        public boolean h = true;
        public ImmutableList<String> i;
        public ImmutableList<String> j;
        public ImmutableList<String> k;
        public ImmutableList<String> l;
        public ImmutableList<String> m;
        public int n;
        public int o;
        public ImmutableList<String> p;
        public a q;
        public ImmutableList<String> r;
        public boolean s;
        public ImmutableList<String> t;
        public boolean u;
        public boolean v;
        public HashMap<pfp0, zgp0> w;
        public HashSet<Integer> x;

        public b() {
            ImmutableList.b bVar = ImmutableList.c;
            com.google.common.collect.g gVar = com.google.common.collect.g.f;
            this.i = gVar;
            this.j = gVar;
            this.k = gVar;
            this.l = gVar;
            this.m = gVar;
            this.n = Integer.MAX_VALUE;
            this.o = Integer.MAX_VALUE;
            this.p = gVar;
            this.q = a.a;
            this.r = gVar;
            this.s = true;
            this.t = gVar;
            this.u = false;
            this.v = false;
            this.w = new HashMap<>();
            this.x = new HashSet<>();
        }

        public static com.google.common.collect.g d(String[] strArr) {
            ImmutableList.b bVar = ImmutableList.c;
            ImmutableList.a aVar = new ImmutableList.a();
            for (String str : strArr) {
                str.getClass();
                aVar.c(y2r0.T(str));
            }
            return aVar.g();
        }

        public ahp0 a() {
            return new ahp0(this);
        }

        public void b(int i) {
            Iterator<zgp0> it = this.w.values().iterator();
            while (it.hasNext()) {
                if (it.next().a.c == i) {
                    it.remove();
                }
            }
        }

        public final void c(ahp0 ahp0Var) {
            this.a = ahp0Var.a;
            this.b = ahp0Var.b;
            this.c = ahp0Var.c;
            this.d = ahp0Var.d;
            this.e = ahp0Var.e;
            this.f = ahp0Var.f;
            this.g = ahp0Var.g;
            this.h = ahp0Var.h;
            this.j = ahp0Var.j;
            this.i = ahp0Var.i;
            this.k = ahp0Var.k;
            this.l = ahp0Var.l;
            this.m = ahp0Var.m;
            this.n = ahp0Var.n;
            this.o = ahp0Var.o;
            this.p = ahp0Var.p;
            this.q = ahp0Var.q;
            this.r = ahp0Var.r;
            this.s = ahp0Var.t;
            this.t = ahp0Var.s;
            this.u = ahp0Var.u;
            this.v = ahp0Var.v;
            this.x = new HashSet<>(ahp0Var.x);
            this.w = new HashMap<>(ahp0Var.w);
        }

        public b e(Set<Integer> set) {
            this.x.clear();
            this.x.addAll(set);
            return this;
        }

        public b f(zgp0 zgp0Var) {
            b(zgp0Var.a.c);
            this.w.put(zgp0Var.a, zgp0Var);
            return this;
        }

        public b g(String... strArr) {
            this.r = d(strArr);
            this.s = false;
            return this;
        }

        public void h(int i, boolean z) {
            if (z) {
                this.x.add(Integer.valueOf(i));
            } else {
                this.x.remove(Integer.valueOf(i));
            }
        }
    }

    static {
        cq.h(1, 2, 3, 4, 5);
        cq.h(6, 7, 8, 9, 10);
        cq.h(11, 12, 13, 14, 15);
        cq.h(16, 17, 18, 19, 20);
        cq.h(21, 22, 23, 24, 25);
        cq.h(26, 27, 28, 29, 30);
        cq.h(31, 32, 33, 34, 35);
        y2r0.L(36);
        y2r0.L(37);
        y2r0.L(38);
    }

    public ahp0(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
        this.n = bVar.n;
        this.m = bVar.m;
        this.o = bVar.o;
        this.p = bVar.p;
        this.q = bVar.q;
        this.r = bVar.r;
        this.t = bVar.s;
        this.s = bVar.t;
        this.u = bVar.u;
        this.v = bVar.v;
        this.w = ImmutableMap.a(bVar.w);
        this.x = ImmutableSet.n(bVar.x);
    }

    public b a() {
        b bVar = new b();
        bVar.c(this);
        return bVar;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ahp0 ahp0Var = (ahp0) obj;
        if (this.a != ahp0Var.a || this.b != ahp0Var.b || this.c != ahp0Var.c || this.d != ahp0Var.d || this.h != ahp0Var.h || this.e != ahp0Var.e || this.f != ahp0Var.f || this.g != ahp0Var.g) {
            return false;
        }
        ImmutableList<String> immutableList = ahp0Var.i;
        ImmutableList<String> immutableList2 = this.i;
        immutableList2.getClass();
        if (!qhz.a(immutableList2, immutableList)) {
            return false;
        }
        ImmutableList<String> immutableList3 = ahp0Var.j;
        ImmutableList<String> immutableList4 = this.j;
        immutableList4.getClass();
        if (!qhz.a(immutableList4, immutableList3)) {
            return false;
        }
        ImmutableList<String> immutableList5 = ahp0Var.k;
        ImmutableList<String> immutableList6 = this.k;
        immutableList6.getClass();
        if (!qhz.a(immutableList6, immutableList5)) {
            return false;
        }
        ImmutableList<String> immutableList7 = ahp0Var.l;
        ImmutableList<String> immutableList8 = this.l;
        immutableList8.getClass();
        if (!qhz.a(immutableList8, immutableList7) || this.n != ahp0Var.n) {
            return false;
        }
        ImmutableList<String> immutableList9 = ahp0Var.m;
        ImmutableList<String> immutableList10 = this.m;
        immutableList10.getClass();
        if (!qhz.a(immutableList10, immutableList9) || this.o != ahp0Var.o) {
            return false;
        }
        ImmutableList<String> immutableList11 = ahp0Var.p;
        ImmutableList<String> immutableList12 = this.p;
        immutableList12.getClass();
        if (!qhz.a(immutableList12, immutableList11) || !this.q.equals(ahp0Var.q)) {
            return false;
        }
        ImmutableList<String> immutableList13 = ahp0Var.s;
        ImmutableList<String> immutableList14 = this.s;
        immutableList14.getClass();
        if (!qhz.a(immutableList14, immutableList13)) {
            return false;
        }
        ImmutableList<String> immutableList15 = ahp0Var.r;
        ImmutableList<String> immutableList16 = this.r;
        immutableList16.getClass();
        if (!qhz.a(immutableList16, immutableList15) || this.t != ahp0Var.t || this.u != ahp0Var.u || this.v != ahp0Var.v) {
            return false;
        }
        ImmutableMap<pfp0, zgp0> immutableMap = ahp0Var.w;
        ImmutableMap<pfp0, zgp0> immutableMap2 = this.w;
        immutableMap2.getClass();
        return com.google.common.collect.e.b(immutableMap, immutableMap2) && this.x.equals(ahp0Var.x);
    }

    public int hashCode() {
        int hashCode = (this.p.hashCode() + ((((this.m.hashCode() + ((((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 28629151) + (this.h ? 1 : 0)) * 31) + this.e) * 31) + this.f) * 31) + (this.g ? 1 : 0)) * 31)) * 31)) * 31)) * 961)) * 961) + this.n) * 31)) * 31) + this.o) * 31)) * 31;
        this.q.getClass();
        return this.x.hashCode() + ((this.w.hashCode() + ((((((this.s.hashCode() + ((((this.r.hashCode() + ((hashCode + 29791) * 961)) * 961) + (this.t ? 1 : 0)) * 31)) * 961) + (this.u ? 1 : 0)) * 29791) + (this.v ? 1 : 0)) * 31)) * 31);
    }
}
