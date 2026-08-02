package androidx.compose.runtime;

import androidx.compose.runtime.internal.AtomicInt;
import defpackage.aii0;
import defpackage.am2;
import defpackage.ate0;
import defpackage.bl6;
import defpackage.bts;
import defpackage.bud;
import defpackage.bvf0;
import defpackage.c760;
import defpackage.cc4;
import defpackage.cii0;
import defpackage.cmm0;
import defpackage.d5s0;
import defpackage.dii0;
import defpackage.dmm0;
import defpackage.dn50;
import defpackage.do40;
import defpackage.fse;
import defpackage.hz40;
import defpackage.i18;
import defpackage.i2t0;
import defpackage.ib30;
import defpackage.iz40;
import defpackage.j18;
import defpackage.j2t0;
import defpackage.jb30;
import defpackage.jl40;
import defpackage.kb30;
import defpackage.kn2;
import defpackage.l2z;
import defpackage.l8x;
import defpackage.lid;
import defpackage.m991;
import defpackage.mp60;
import defpackage.mz40;
import defpackage.np60;
import defpackage.ny61;
import defpackage.o13;
import defpackage.o2b0;
import defpackage.p3t0;
import defpackage.q2t0;
import defpackage.rtd;
import defpackage.s8x;
import defpackage.seu;
import defpackage.sls;
import defpackage.sms;
import defpackage.t18;
import defpackage.tje;
import defpackage.ttd;
import defpackage.uh6;
import defpackage.wls;
import defpackage.wz40;
import defpackage.xy40;
import defpackage.zm50;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class j extends ttd {
    public final bl6 a;
    public final am2 b;
    public final Object c;
    public l8x d;
    public Throwable e;
    public final ArrayList f;
    public List g;
    public iz40 h;
    public final wz40 i;
    public final ArrayList j;
    public final ArrayList k;
    public final hz40 l;
    public final zm50 m;
    public final hz40 n;
    public final hz40 o;
    public ArrayList p;
    public iz40 q;
    public j18 r;
    public final r0 s;
    public boolean t;
    public final r0 u;
    public final p3t0 v;
    public final s8x w;
    public final fse x;
    public final sms y;
    public static final r0 z = bvf0.c(o2b0.w);
    public static final AtomicReference A = new AtomicReference(Boolean.FALSE);

    public j(fse fseVar) {
        bl6 bl6Var = new bl6(new cii0(this, 0));
        this.a = bl6Var;
        cii0 cii0Var = new cii0(this, 1);
        am2 am2Var = new am2();
        am2Var.a = new AtomicInt(0);
        am2Var.b = new cc4();
        int i = 6;
        am2Var.c = new l2z(i, am2Var, cii0Var);
        this.b = am2Var;
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new iz40((Object) null);
        this.i = new wz40(new bud[16]);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = do40.b();
        this.m = new zm50();
        this.n = cmm0.b();
        this.o = do40.b();
        this.s = bvf0.c(null);
        this.u = bvf0.c(Recomposer$State.Inactive);
        this.v = new p3t0();
        s8x s8xVar = new s8x((l8x) fseVar.get(seu.C));
        s8xVar.w(new ate0(i, this));
        this.w = s8xVar;
        this.x = fseVar.plus(bl6Var).plus(s8xVar);
        this.y = new sms(8);
    }

    public static final void B(j jVar, kb30 kb30Var, kb30 kb30Var2) {
        List e = kb30Var2.e();
        if (e != null) {
            int size = e.size();
            for (int i = 0; i < size; i++) {
                kb30 kb30Var3 = (kb30) e.get(i);
                zm50 zm50Var = jVar.m;
                ib30 c = kb30Var3.c();
                dn50 dn50Var = new dn50(kb30Var3, kb30Var);
                do40.a(zm50Var.a, c, dn50Var);
                do40.a(zm50Var.b, dn50Var.a(), c);
                B(jVar, kb30Var, kb30Var3);
            }
        }
    }

    public static final void L(ArrayList arrayList, j jVar, bud budVar) {
        arrayList.clear();
        synchronized (jVar.c) {
            Iterator it = jVar.k.iterator();
            while (it.hasNext()) {
                kb30 kb30Var = (kb30) it.next();
                if (jl40.l(kb30Var.b(), budVar)) {
                    arrayList.add(kb30Var);
                    it.remove();
                }
            }
        }
    }

    public static void z(mz40 mz40Var) {
        try {
            if (mz40Var.w() instanceof j2t0) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            mz40Var.c();
        }
    }

    public final void A() {
        synchronized (this.c) {
            if (((Recomposer$State) this.u.getValue()).compareTo(Recomposer$State.Idle) >= 0) {
                this.u.l(Recomposer$State.ShuttingDown);
            }
        }
        this.w.a(null);
    }

    public final i18 C() {
        Recomposer$State recomposer$State;
        r0 r0Var = this.u;
        int compareTo = ((Recomposer$State) r0Var.getValue()).compareTo(Recomposer$State.ShuttingDown);
        r0 r0Var2 = this.s;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        wz40 wz40Var = this.i;
        if (compareTo > 0) {
            if (r0Var2.getValue() != null) {
                recomposer$State = Recomposer$State.Inactive;
            } else if (this.d == null) {
                this.h = new iz40((Object) null);
                wz40Var.g();
                recomposer$State = (D() || F()) ? Recomposer$State.InactivePendingWork : Recomposer$State.Inactive;
            } else {
                recomposer$State = (wz40Var.c != 0 || this.h.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || D() || F() || this.l.g()) ? Recomposer$State.PendingWork : Recomposer$State.Idle;
            }
            r0Var.l(recomposer$State);
            if (recomposer$State != Recomposer$State.PendingWork) {
                return null;
            }
            j18 j18Var = this.r;
            this.r = null;
            return j18Var;
        }
        List I = I();
        int size = I.size();
        for (int i = 0; i < size; i++) {
        }
        this.f.clear();
        this.g = EmptyList.a;
        this.h = new iz40((Object) null);
        wz40Var.g();
        arrayList2.clear();
        arrayList.clear();
        this.p = null;
        j18 j18Var2 = this.r;
        if (j18Var2 != null) {
            j18Var2.b(null);
        }
        this.r = null;
        r0Var2.l(null);
        return null;
    }

    public final boolean D() {
        return !this.t && (this.a.b.c.get() & 134217727) > 0;
    }

    public final boolean E() {
        return this.i.c != 0 || D() || F() || this.l.g();
    }

    public final boolean F() {
        return !this.t && (((cc4) this.b.b).c.get() & 134217727) > 0;
    }

    public final boolean G() {
        boolean z2;
        synchronized (this.c) {
            if (!this.h.h() && this.i.c == 0 && !D()) {
                z2 = F();
            }
        }
        return z2;
    }

    public final Object H(Continuation continuation) {
        Object x = kotlinx.coroutines.flow.e.x(this.u, new Recomposer$join$2(2, null), continuation);
        return x == CoroutineSingletons.COROUTINE_SUSPENDED ? x : zy11.a;
    }

    public final List I() {
        List list = this.g;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.f;
        List arrayList2 = arrayList.isEmpty() ? EmptyList.a : new ArrayList(arrayList);
        this.g = arrayList2;
        return arrayList2;
    }

    public final void J() {
        i18 C;
        synchronized (this.c) {
            C = C();
            if (((Recomposer$State) this.u.getValue()).compareTo(Recomposer$State.ShuttingDown) <= 0) {
                throw uh6.b("Recomposer shutdown; frame clock awaiter will never resume", this.e);
            }
        }
        if (C != null) {
            ((j18) C).resumeWith(zy11.a);
        }
    }

    public final void K(bud budVar) {
        synchronized (this.c) {
            ArrayList arrayList = this.k;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (jl40.l(((kb30) arrayList.get(i)).b(), budVar)) {
                    ArrayList arrayList2 = new ArrayList();
                    L(arrayList2, this, budVar);
                    while (!arrayList2.isEmpty()) {
                        M(arrayList2, null);
                        L(arrayList2, this, budVar);
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x016e, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0173, code lost:
    
        if (r4 >= r3) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017f, code lost:
    
        if (((kotlin.Pair) r10.get(r4)).f() == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0181, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0184, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0192, code lost:
    
        if (r8 >= r4) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0194, code lost:
    
        r11 = (kotlin.Pair) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019e, code lost:
    
        if (r11.f() != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a0, code lost:
    
        r11 = (defpackage.kb30) r11.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ab, code lost:
    
        if (r11 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ad, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b0, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a9, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b3, code lost:
    
        r4 = r16.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b5, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b6, code lost:
    
        defpackage.ycc.r(r3, r16.k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01bb, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01bc, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ca, code lost:
    
        if (r8 >= r4) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cc, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d7, code lost:
    
        if (((kotlin.Pair) r11).f() == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d9, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01dc, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01df, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List M(List list, iz40 iz40Var) {
        mz40 C;
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            bud b = ((kb30) obj).b();
            Object obj2 = hashMap.get(b);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(b, obj2);
            }
            ((ArrayList) obj2).add(obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            bud budVar = (bud) entry.getKey();
            List list2 = (List) entry.getValue();
            if (budVar.O.F) {
                lid.a("Check failed");
            }
            ate0 ate0Var = new ate0(5, budVar);
            kn2 kn2Var = new kn2(22, budVar, iz40Var);
            i2t0 j = q2t0.j();
            mz40 mz40Var = j instanceof mz40 ? (mz40) j : null;
            if (mz40Var == null || (C = mz40Var.C(ate0Var, kn2Var)) == null) {
                ny61.r("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                i2t0 j2 = C.j();
                try {
                    synchronized (this.c) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                kb30 kb30Var = (kb30) list2.get(i2);
                                Object c = do40.c(this.l, kb30Var.c());
                                kb30 kb30Var2 = (kb30) c;
                                if (kb30Var2 != null) {
                                    this.m.a(kb30Var2);
                                }
                                arrayList.add(new Pair(kb30Var, c));
                            }
                            int size3 = arrayList.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size3) {
                                    break;
                                }
                                Pair pair = (Pair) arrayList.get(i3);
                                if (pair.f() == null) {
                                    if (this.m.a.a(((kb30) pair.c()).c())) {
                                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            Pair pair2 = (Pair) arrayList.get(i4);
                                            if (pair2.f() == null) {
                                                zm50 zm50Var = this.m;
                                                ib30 c2 = ((kb30) pair2.c()).c();
                                                hz40 hz40Var = zm50Var.a;
                                                dn50 dn50Var = (dn50) do40.c(hz40Var, c2);
                                                if (hz40Var.f()) {
                                                    zm50Var.b.h();
                                                }
                                                if (dn50Var != null) {
                                                    kb30 b2 = dn50Var.b();
                                                    do40.a(this.o, dn50Var.a(), b2);
                                                    pair2 = new Pair(pair2.c(), b2);
                                                }
                                            }
                                            arrayList2.add(pair2);
                                        }
                                        arrayList = arrayList2;
                                    }
                                }
                                i3++;
                            }
                        } finally {
                        }
                    }
                    int size5 = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size5) {
                            break;
                        }
                        if (((Pair) arrayList.get(i5)).f() != null) {
                            break;
                        }
                        i5++;
                    }
                    budVar.t(arrayList);
                    i2t0.q(j2);
                } catch (Throwable th) {
                    i2t0.q(j2);
                    throw th;
                }
            } finally {
                z(C);
            }
        }
        return kotlin.collections.a.J0(hashMap.keySet());
    }

    public final bud N(bud budVar, iz40 iz40Var) {
        mz40 C;
        if (budVar.O.F || budVar.P == 3) {
            return null;
        }
        iz40 iz40Var2 = this.q;
        if (iz40Var2 == null || !iz40Var2.c(budVar)) {
            ate0 ate0Var = new ate0(5, budVar);
            kn2 kn2Var = new kn2(22, budVar, iz40Var);
            i2t0 j = q2t0.j();
            mz40 mz40Var = j instanceof mz40 ? (mz40) j : null;
            if (mz40Var == null || (C = mz40Var.C(ate0Var, kn2Var)) == null) {
                ny61.r("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    i2t0 j2 = C.j();
                    if (iz40Var != null) {
                        try {
                            if (iz40Var.h()) {
                                l2z l2zVar = new l2z(24, iz40Var, budVar);
                                bts btsVar = budVar.O;
                                if (btsVar.F) {
                                    lid.a("Preparing a composition while composing is not supported");
                                }
                                btsVar.F = true;
                                try {
                                    l2zVar.invoke();
                                    btsVar.F = false;
                                } catch (Throwable th) {
                                    btsVar.F = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            i2t0.q(j2);
                            throw th2;
                        }
                    }
                    boolean x = budVar.x();
                    i2t0.q(j2);
                    if (x) {
                        return budVar;
                    }
                } finally {
                    z(C);
                }
            }
        }
        return null;
    }

    public final void O(Throwable th, bud budVar) {
        if (!((Boolean) A.get()).booleanValue() || (th instanceof ComposeRuntimeError)) {
            synchronized (this.c) {
                m991.b("Error was captured in composition.", th);
                dii0 dii0Var = (dii0) this.s.getValue();
                if (dii0Var != null) {
                    throw dii0Var.a();
                }
                r0 r0Var = this.s;
                dii0 dii0Var2 = new dii0(th);
                r0Var.getClass();
                r0Var.m(null, dii0Var2);
            }
            throw th;
        }
        synchronized (this.c) {
            try {
                m991.b("Error was captured in composition while live edit was enabled.", th);
                this.j.clear();
                this.i.g();
                this.h = new iz40((Object) null);
                this.k.clear();
                this.l.h();
                this.n.h();
                r0 r0Var2 = this.s;
                dii0 dii0Var3 = new dii0(th);
                r0Var2.getClass();
                r0Var2.m(null, dii0Var3);
                if (budVar != null) {
                    Q(budVar);
                }
                if (C() != null) {
                    lid.a("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean P() {
        boolean E;
        synchronized (this.c) {
            if (this.h.g()) {
                return E();
            }
            List I = I();
            androidx.compose.runtime.collection.a aVar = new androidx.compose.runtime.collection.a(this.h);
            this.h = new iz40((Object) null);
            try {
                int size = I.size();
                for (int i = 0; i < size; i++) {
                    ((bud) I.get(i)).y(aVar);
                    if (((Recomposer$State) this.u.getValue()).compareTo(Recomposer$State.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (C() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    E = E();
                }
                return E;
            } catch (Throwable th) {
                synchronized (this.c) {
                    iz40 iz40Var = this.h;
                    int i2 = iz40Var.d;
                    Iterator<E> it = aVar.iterator();
                    while (it.hasNext()) {
                        iz40Var.k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void Q(bud budVar) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(budVar)) {
            arrayList.add(budVar);
        }
        if (this.f.remove(budVar)) {
            this.g = null;
        }
    }

    public final Object R(Continuation continuation) {
        Object k0 = tje.k0(this.a, new Recomposer$recompositionRunner$2(this, new Recomposer$runRecomposeAndApplyChanges$2(this, null), jl40.z(continuation.get_context()), null), continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        zy11 zy11Var = zy11.a;
        if (k0 != coroutineSingletons) {
            k0 = zy11Var;
        }
        return k0 == coroutineSingletons ? k0 : zy11Var;
    }

    @Override // defpackage.ttd
    public final void a(bud budVar, wls wlsVar) {
        Recomposer$State recomposer$State;
        boolean contains;
        mz40 C;
        boolean z2 = budVar.O.F;
        synchronized (this.c) {
            Recomposer$State recomposer$State2 = (Recomposer$State) this.u.getValue();
            recomposer$State = Recomposer$State.ShuttingDown;
            contains = recomposer$State2.compareTo(recomposer$State) > 0 ? true ^ I().contains(budVar) : true;
        }
        try {
            ate0 ate0Var = new ate0(5, budVar);
            kn2 kn2Var = new kn2(22, budVar, (Object) null);
            i2t0 j = q2t0.j();
            mz40 mz40Var = j instanceof mz40 ? (mz40) j : null;
            if (mz40Var == null || (C = mz40Var.C(ate0Var, kn2Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                i2t0 j2 = C.j();
                try {
                    budVar.m(wlsVar);
                    synchronized (this.c) {
                        if (((Recomposer$State) this.u.getValue()).compareTo(recomposer$State) > 0 && !I().contains(budVar)) {
                            this.f.add(budVar);
                            this.g = null;
                        }
                    }
                    if (!z2) {
                        q2t0.j().m();
                    }
                    try {
                        K(budVar);
                        try {
                            budVar.g();
                            budVar.i();
                            if (z2) {
                                return;
                            }
                            q2t0.j().m();
                        } catch (Throwable th) {
                            O(th, null);
                        }
                    } catch (Throwable th2) {
                        O(th2, budVar);
                    }
                } finally {
                    i2t0.q(j2);
                }
            } finally {
                z(C);
            }
        } catch (Throwable th3) {
            if (contains) {
                synchronized (this.c) {
                }
            }
            O(th3, budVar);
        }
    }

    @Override // defpackage.ttd
    public final iz40 b(bud budVar, d5s0 d5s0Var, wls wlsVar) {
        p3t0 p3t0Var = this.v;
        try {
            d5s0 d5s0Var2 = budVar.I;
            budVar.I = d5s0Var;
            try {
                a(budVar, wlsVar);
                iz40 iz40Var = (iz40) p3t0Var.a();
                if (iz40Var == null) {
                    iz40Var = dmm0.a;
                }
                return iz40Var;
            } finally {
                budVar.I = d5s0Var2;
            }
        } finally {
            p3t0Var.b(null);
        }
    }

    @Override // defpackage.ttd
    public final void c(kb30 kb30Var) {
        i18 C;
        synchronized (this.c) {
            try {
                do40.a(this.l, kb30Var.c(), kb30Var);
                if (kb30Var.e() != null) {
                    B(this, kb30Var, kb30Var);
                }
                C = C();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (C != null) {
            ((j18) C).resumeWith(zy11.a);
        }
    }

    @Override // defpackage.ttd
    public final boolean e() {
        return ((Boolean) A.get()).booleanValue();
    }

    @Override // defpackage.ttd
    public final boolean f() {
        return false;
    }

    @Override // defpackage.ttd
    public final boolean g() {
        return false;
    }

    @Override // defpackage.ttd
    public final long h() {
        return 1000L;
    }

    @Override // defpackage.ttd
    public final rtd i() {
        return null;
    }

    @Override // defpackage.ttd
    public final fse k() {
        return this.x;
    }

    @Override // defpackage.ttd
    public final boolean l() {
        return false;
    }

    @Override // defpackage.ttd
    public final void m(kb30 kb30Var) {
        i18 C;
        synchronized (this.c) {
            this.k.add(kb30Var);
            C = C();
        }
        if (C != null) {
            ((j18) C).resumeWith(zy11.a);
        }
    }

    @Override // defpackage.ttd
    public final void n(bud budVar) {
        i18 i18Var;
        synchronized (this.c) {
            if (this.i.h(budVar)) {
                i18Var = null;
            } else {
                this.i.b(budVar);
                i18Var = C();
            }
        }
        if (i18Var != null) {
            ((j18) i18Var).resumeWith(zy11.a);
        }
    }

    @Override // defpackage.ttd
    public final void o(kb30 kb30Var, jb30 jb30Var, o13 o13Var) {
        mp60 mp60Var;
        synchronized (this.c) {
            this.n.o(kb30Var, jb30Var);
            Object d = this.o.d(kb30Var);
            if (d == null) {
                mp60Var = np60.b;
            } else if (d instanceof xy40) {
                mp60Var = (mp60) d;
            } else {
                Object[] objArr = np60.a;
                xy40 xy40Var = new xy40(1);
                xy40Var.g(d);
                mp60Var = xy40Var;
            }
            if (mp60Var.e()) {
                hz40 e = jb30Var.a().e(o13Var, mp60Var);
                Object[] objArr2 = e.b;
                Object[] objArr3 = e.c;
                long[] jArr = e.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj = objArr2[i4];
                                    this.n.o((kb30) obj, (jb30) objArr3[i4]);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.ttd
    public final jb30 p(kb30 kb30Var) {
        jb30 jb30Var;
        synchronized (this.c) {
            jb30Var = (jb30) this.n.m(kb30Var);
        }
        return jb30Var;
    }

    @Override // defpackage.ttd
    public final iz40 q(bud budVar, d5s0 d5s0Var, iz40 iz40Var) {
        p3t0 p3t0Var = this.v;
        try {
            P();
            budVar.y(new androidx.compose.runtime.collection.a(iz40Var));
            d5s0 d5s0Var2 = budVar.I;
            budVar.I = d5s0Var;
            try {
                bud N = N(budVar, null);
                if (N != null) {
                    K(budVar);
                    N.g();
                    N.i();
                }
                iz40 iz40Var2 = (iz40) p3t0Var.a();
                if (iz40Var2 == null) {
                    iz40Var2 = dmm0.a;
                }
                return iz40Var2;
            } finally {
                budVar.I = d5s0Var2;
            }
        } finally {
            p3t0Var.b(null);
        }
    }

    @Override // defpackage.ttd
    public final void r(Set set) {
    }

    @Override // defpackage.ttd
    public final void t(aii0 aii0Var) {
        p3t0 p3t0Var = this.v;
        iz40 iz40Var = (iz40) p3t0Var.a();
        if (iz40Var == null) {
            iz40Var = dmm0.a();
            p3t0Var.b(iz40Var);
        }
        iz40Var.a(aii0Var);
    }

    @Override // defpackage.ttd
    public final void u(bud budVar) {
        synchronized (this.c) {
            try {
                iz40 iz40Var = this.q;
                if (iz40Var == null) {
                    iz40Var = dmm0.a();
                    this.q = iz40Var;
                }
                iz40Var.a(budVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ttd
    public final t18 v(sls slsVar) {
        am2 am2Var = this.b;
        return ((cc4) am2Var.b).a(new c760(slsVar), (l2z) am2Var.c);
    }

    @Override // defpackage.ttd
    public final void y(bud budVar) {
        synchronized (this.c) {
            if (this.f.remove(budVar)) {
                this.g = null;
            }
            this.i.j(budVar);
            this.j.remove(budVar);
        }
    }
}
