package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.a;

/* loaded from: classes15.dex */
public final class ph9 {
    public final meb a;
    public final x8b b;
    public final ikw0 c;
    public HashSet d;
    public rnz e;
    public final i3y f = a.a(new ju8(18, this));
    public HashSet g;
    public HashSet h;
    public HashSet i;
    public rnz j;
    public rnz k;
    public rnz l;
    public rnz m;
    public rnz n;
    public HashSet o;
    public HashSet p;
    public HashSet q;
    public HashSet r;
    public HashSet s;
    public Object t;
    public Boolean u;
    public HashSet v;
    public AtomicLong w;
    public HashSet x;
    public qi1 y;

    public ph9(meb mebVar, x8b x8bVar, ikw0 ikw0Var) {
        this.a = mebVar;
        this.b = x8bVar;
        this.c = ikw0Var;
    }

    public final void a(long j) {
        rnz rnzVar = this.e;
        if (rnzVar == null) {
            rnzVar = new rnz((Object) null);
            this.e = rnzVar;
        }
        rnzVar.h(j, this);
    }

    public final void b(long j) {
        HashSet hashSet = this.r;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.r = hashSet;
            this.c.d(e9h0.payload_chats_inserted, hashSet);
        }
        hashSet.add(Long.valueOf(j));
    }

    public final void c(String str) {
        HashSet hashSet = this.o;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.o = hashSet;
            this.c.d(e9h0.payload_chat_view_changed, hashSet);
        }
        hashSet.add(str);
    }

    public final void d(Set set, Set set2) {
        qi1 qi1Var = this.y;
        if (qi1Var == null) {
            qi1Var = new qi1(0);
            this.y = qi1Var;
            this.c.d(e9h0.payload_folders_changed, qi1Var);
        }
        qi1Var.a.addAll(set);
        qi1Var.b.addAll(set2);
    }

    public final void e(long j, long j2) {
        rnz rnzVar = this.k;
        if (rnzVar == null) {
            rnzVar = new rnz((Object) null);
            this.k = rnzVar;
            this.c.d(e9h0.payload_message_changed, rnzVar);
        }
        Set set = (Set) rnzVar.c(j);
        if (set == null) {
            set = new LinkedHashSet();
            rnzVar.h(j, set);
        }
        set.add(Long.valueOf(j2));
    }

    public final void f(String str) {
        HashSet hashSet = this.p;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.p = hashSet;
        }
        hashSet.add(str);
    }

    public final baz0 g(long j) {
        rnz rnzVar = this.j;
        if (rnzVar == null) {
            rnzVar = new rnz((Object) null);
            this.j = rnzVar;
            this.c.d(e9h0.payload_timeline_changed, rnzVar);
        }
        baz0 baz0Var = (baz0) rnzVar.c(j);
        if (baz0Var == null) {
            baz0Var = new baz0();
            rnzVar.h(j, baz0Var);
        }
        baz0Var.b = this.t;
        return baz0Var;
    }

    public final void h(long j, haz0 haz0Var) {
        baz0 g = g(j);
        if (haz0Var != null) {
            g.a.a(haz0Var);
        }
    }

    public final void i(long j, List list) {
        baz0 g = g(j);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g.a.a((haz0) it.next());
        }
    }

    public final void j(String str) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
            this.c.d(e9h0.payload_users_changed, hashSet);
        }
        hashSet.add(str);
    }
}
