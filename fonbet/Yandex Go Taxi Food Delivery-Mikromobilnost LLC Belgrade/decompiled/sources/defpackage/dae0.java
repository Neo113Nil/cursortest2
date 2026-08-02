package defpackage;

import com.yandex.go.analytics.realtime.a;
import com.yandex.go.analytics.realtime.event.CreativeType;
import com.yandex.go.top_modal.api.priority.PopupPriorityLauncher$PopupType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

/* loaded from: classes8.dex */
public final class dae0 implements bae0 {
    public final yo40 a;
    public final xzq0 b;
    public final Stack c = new Stack();
    public final PriorityQueue d = new PriorityQueue(new yu4(new yk(20), 1));
    public final Set e = Collections.singleton("superapp_main");
    public final LinkedHashMap f = new LinkedHashMap();
    public ArrayList g = new ArrayList();

    public dae0(yo40 yo40Var, xzq0 xzq0Var) {
        this.a = yo40Var;
        this.b = xzq0Var;
    }

    public final synchronized boolean b(cae0 cae0Var) {
        Object obj;
        boolean isEmpty = this.d.isEmpty();
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((cae0) obj).c(), cae0Var.c())) {
                break;
            }
        }
        if (obj != null) {
            return isEmpty;
        }
        this.d.add(cae0Var);
        hst hstVar = jst.e;
        PopupPriorityLauncher$PopupType e = cae0Var.e();
        PriorityQueue priorityQueue = this.d;
        ArrayList arrayList = new ArrayList(tcc.n(priorityQueue, 10));
        Iterator it2 = priorityQueue.iterator();
        while (it2.hasNext()) {
            arrayList.add(((cae0) it2.next()).e());
        }
        Objects.toString(e);
        arrayList.toString();
        hstVar.getClass();
        return isEmpty;
    }

    public final void c(String str, PopupPriorityLauncher$PopupType popupPriorityLauncher$PopupType, qez qezVar, aae0 aae0Var, int i, sls slsVar) {
        q5r q5rVar;
        cae0 cae0Var = new cae0(str, popupPriorityLauncher$PopupType, qezVar, i, aae0Var, new zoi(slsVar, qezVar, this, popupPriorityLauncher$PopupType, aae0Var, str));
        boolean equals = qezVar.equals(z9e0.b);
        LinkedHashMap linkedHashMap = this.f;
        if (equals) {
            f(cae0Var, true);
            q5r q5rVar2 = new q5r(str, popupPriorityLauncher$PopupType, aae0Var != null ? aae0Var.a() : null);
            linkedHashMap.put("superapp_main", q5rVar2);
            g("superapp_main", null, q5rVar2);
            return;
        }
        if (!(qezVar instanceof v9e0)) {
            if (qezVar.equals(x9e0.b)) {
                f(cae0Var, true);
                return;
            }
            if (qezVar.equals(w9e0.b)) {
                f(cae0Var, true);
                return;
            } else if (qezVar.equals(y9e0.b)) {
                f(cae0Var, true);
                return;
            } else {
                w511.b();
                return;
            }
        }
        String a = ((v9e0) qezVar).a();
        if (!linkedHashMap.containsKey(a)) {
            a = null;
        }
        if (a == null || (q5rVar = (q5r) linkedHashMap.get(a)) == null) {
            f(cae0Var, this.g.isEmpty());
            return;
        }
        String c = cae0Var.c();
        PopupPriorityLauncher$PopupType e = cae0Var.e();
        aae0 b = cae0Var.b();
        Map a2 = b != null ? b.a() : null;
        dei0 dei0Var = (dei0) this.a.a;
        CreativeType m = yo40.m(e);
        r5r r5rVar = new r5r(q5rVar.a(), yo40.m(q5rVar.b()));
        if (a2 == null) {
            return;
        }
        ((a) dei0Var).d(new kei0(m, c, r5rVar, a2));
    }

    public final void d(String str) {
        Object obj;
        Object obj2;
        cae0 cae0Var;
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((cae0) obj).c(), str)) {
                    break;
                }
            }
        }
        cae0 cae0Var2 = (cae0) obj;
        qez f = cae0Var2 != null ? cae0Var2.f() : null;
        if (jl40.l(f, w9e0.b)) {
            this.g.remove(cae0Var2.c());
        } else if (jl40.l(f, x9e0.b)) {
            this.g.remove(cae0Var2.c());
        }
        this.c.removeIf(new md3(15, new brd(str, 10)));
        synchronized (this) {
            try {
                Iterator it2 = this.d.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it2.next();
                        if (jl40.l(((cae0) obj2).c(), str)) {
                            break;
                        }
                    }
                }
                cae0 cae0Var3 = (cae0) obj2;
                if (cae0Var3 != null) {
                    this.d.remove(cae0Var3);
                }
                cae0Var = (cae0) this.d.peek();
                hst hstVar = jst.e;
                PriorityQueue priorityQueue = this.d;
                ArrayList arrayList = new ArrayList(tcc.n(priorityQueue, 10));
                Iterator it3 = priorityQueue.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((cae0) it3.next()).e());
                }
                arrayList.toString();
                hstVar.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.g.isEmpty()) {
            e();
            return;
        }
        boolean isEmpty = this.c.isEmpty();
        if ((!((cae0Var2 != null ? cae0Var2.f() : null) instanceof z9e0) || isEmpty) && !this.c.contains(cae0Var)) {
            if (((cae0Var != null ? cae0Var.f() : null) instanceof w9e0) || this.g.isEmpty()) {
                e();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039 A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000d, B:10:0x0017, B:12:0x001f, B:14:0x0027, B:16:0x0039, B:19:0x0040, B:20:0x0061, B:22:0x0067, B:24:0x0075), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[Catch: all -> 0x003e, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000d, B:10:0x0017, B:12:0x001f, B:14:0x0027, B:16:0x0039, B:19:0x0040, B:20:0x0061, B:22:0x0067, B:24:0x0075), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void e() {
        boolean z;
        if (((cae0) kotlin.collections.a.b0(this.c)) != null) {
            return;
        }
        cae0 cae0Var = (cae0) this.d.poll();
        if (cae0Var != null) {
            qez f = cae0Var.f();
            if (f instanceof v9e0) {
                v9e0 v9e0Var = (v9e0) f;
                if (v9e0Var.a() != null) {
                    z = jl40.l(v9e0Var.a(), this.b.m());
                    if (z) {
                        e();
                        return;
                    }
                    ((zoi) cae0Var.d()).invoke();
                    this.c.push(cae0Var);
                    hst hstVar = jst.e;
                    Stack stack = this.c;
                    ArrayList arrayList = new ArrayList(tcc.n(stack, 10));
                    Iterator it = stack.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((cae0) it.next()).e());
                    }
                    arrayList.toString();
                    hstVar.getClass();
                }
            }
            z = true;
            if (z) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[Catch: all -> 0x0087, TRY_ENTER, TryCatch #0 {all -> 0x0087, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x0012, B:12:0x0026, B:17:0x0036, B:20:0x0052, B:21:0x0073, B:23:0x0079, B:25:0x0089), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void f(cae0 cae0Var, boolean z) {
        boolean z2;
        try {
            qez f = cae0Var.f();
            boolean z3 = true;
            if (f instanceof v9e0) {
                v9e0 v9e0Var = (v9e0) f;
                if (v9e0Var.a() != null) {
                    z2 = jl40.l(v9e0Var.a(), this.b.m());
                    if (z2) {
                        return;
                    }
                    boolean b = b(cae0Var);
                    boolean isEmpty = this.c.isEmpty();
                    if (!b && !isEmpty) {
                        z3 = false;
                    }
                    boolean equals = cae0Var.f().equals(z9e0.b);
                    boolean equals2 = cae0Var.f().equals(x9e0.b);
                    if ((z3 && z) || equals || equals2) {
                        ((zoi) cae0Var.d()).invoke();
                        this.c.push(cae0Var);
                        hst hstVar = jst.e;
                        Stack stack = this.c;
                        ArrayList arrayList = new ArrayList(tcc.n(stack, 10));
                        Iterator it = stack.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((cae0) it.next()).e());
                        }
                        arrayList.toString();
                        hstVar.getClass();
                    }
                    return;
                }
            }
            z2 = true;
            if (z2) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g(String str, String str2, q5r q5rVar) {
        try {
            try {
                PriorityQueue priorityQueue = this.d;
                priorityQueue.removeIf(new sdc(24, new vqy(this, str, str2, q5rVar, 19)));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
