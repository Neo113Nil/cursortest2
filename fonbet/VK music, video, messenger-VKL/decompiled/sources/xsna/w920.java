package xsna;

import android.util.ArraySet;
import com.vk.dto.common.Direction;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.exceptions.ApiAccessDeniedException;
import com.vk.im.engine.models.messages.Msg;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.q8v;
import xsna.v8v;
import xsna.w8v;

/* compiled from: MessageHistoryLoaderImpl.kt */
/* loaded from: classes13.dex */
public final class w920 implements r920 {
    public static final /* synthetic */ qcy<Object>[] v;
    public final xuz a;
    public final l8v b;
    public final h8v c;
    public final r8v d;
    public final int e;
    public final int f;
    public final f9w g;
    public final izs<Throwable, Boolean> h;
    public final boolean i;
    public final biu j = new biu(new gj30(0));
    public final io.reactivex.rxjava3.disposables.b k;
    public final io.reactivex.rxjava3.subjects.f<q8v> l;
    public final io.reactivex.rxjava3.internal.operators.observable.c0 m;
    public final pfl n;
    public final io.reactivex.rxjava3.disposables.c o;
    public final AtomicBoolean p;
    public final AtomicBoolean q;
    public final AtomicReference<Direction> r;
    public boolean s;
    public final ReentrantReadWriteLock t;
    public final io.reactivex.rxjava3.disposables.b u;

    /* compiled from: MessageHistoryLoaderImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.AFTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.BEFORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MessageHistoryLoaderImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<w8v, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(w8v w8vVar) {
            w920 w920Var = (w920) this.receiver;
            w920Var.g.debug(new sim(w920Var, 18));
            w920Var.l.onNext(new q8v.c(w8vVar));
            w920Var.j();
            return s3q0.a;
        }
    }

    /* compiled from: MessageHistoryLoaderImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            w920.f((w920) this.receiver, th);
            return s3q0.a;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(w920.class, "history", "getHistory()Lcom/vk/im/engine/models/messages/MsgHistory;", 0);
        fpf0.a.getClass();
        v = new qcy[]{mutablePropertyReference1Impl};
    }

    public w920(xuz xuzVar, l8v l8vVar, h8v h8vVar, r8v r8vVar, int i, int i2, n8v n8vVar, f9w f9wVar, izs izsVar, boolean z) {
        this.a = xuzVar;
        this.b = l8vVar;
        this.c = h8vVar;
        this.d = r8vVar;
        this.e = i;
        this.f = i2;
        this.g = f9wVar;
        this.h = izsVar;
        this.i = z;
        io.reactivex.rxjava3.core.w c2 = asu0.a.c();
        this.k = new io.reactivex.rxjava3.disposables.b();
        io.reactivex.rxjava3.subjects.f<q8v> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.l = fVar;
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = fVar.a0(c2);
        tf tfVar = new tf(new bjk(this, 18), 29);
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.m = new io.reactivex.rxjava3.internal.operators.observable.c0(a0, tfVar, kVar);
        this.n = new pfl(c2);
        this.p = new AtomicBoolean(false);
        this.q = new AtomicBoolean(false);
        this.r = new AtomicReference<>();
        this.t = new ReentrantReadWriteLock();
        this.u = new io.reactivex.rxjava3.disposables.b();
        int i3 = 28;
        int i4 = 25;
        this.o = new io.reactivex.rxjava3.internal.operators.observable.i0(n8vVar, new yi2(new c2u(this, 11), i3)).E(new jz(new ire(this, i3), i4), io.reactivex.rxjava3.internal.functions.a.d, kVar, kVar).subscribe(new ir0(new igh(this, 29), i4));
    }

    public static final void f(w920 w920Var, Throwable th) {
        w920Var.g.c(new tx(18, th, w920Var));
        if (!(th instanceof ApiAccessDeniedException)) {
            w920Var.l.onNext(new q8v.b(th));
        }
        if (w920Var.h.invoke(th).booleanValue()) {
            w920Var.j();
        }
    }

    public static gj30 o(gj30 gj30Var, gj30 gj30Var2) {
        List list;
        List list2;
        gkx0 gkx0Var = gj30Var2.k().size() == 0 ? gkx0.d : ((Msg) j5g.Y(gj30Var2.k())).p;
        gkx0 gkx0Var2 = gj30Var2.k().isEmpty() ? gkx0.e : ((Msg) j5g.i0(gj30Var2.k())).p;
        if (!gj30Var.k().isEmpty()) {
            gkx0 gkx0Var3 = ((Msg) j5g.Y(gj30Var.k())).p;
            gkx0 gkx0Var4 = ((Msg) j5g.i0(gj30Var.k())).p;
            if (gkx0Var.compareTo(gkx0Var3) > 0 || gkx0Var2.compareTo(gkx0Var4) < 0) {
                if (!gj30Var.k().isEmpty()) {
                    gkx0 gkx0Var5 = ((Msg) j5g.Y(gj30Var.k())).p;
                    gkx0 gkx0Var6 = ((Msg) j5g.i0(gj30Var.k())).p;
                    if (gkx0Var.compareTo(gkx0Var5) <= 0 && gkx0Var2.compareTo(gkx0Var6) < 0) {
                        if (!gj30Var2.e || !gj30Var2.d) {
                            return new gj30(gj30Var2);
                        }
                        ArraySet g = kn4.g(gj30Var2);
                        List<Msg> k = gj30Var.k();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : k) {
                            Msg msg = (Msg) obj;
                            if (msg.p.compareTo(gkx0Var2) > 0 && !g.contains(Integer.valueOf(msg.b))) {
                                arrayList.add(obj);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return new gj30(gj30Var2);
                        }
                        gj30 gj30Var3 = new gj30(gj30Var2);
                        gj30Var3.k().addAll(arrayList);
                        kn4.m(gj30Var3, gj30Var, arrayList);
                        gj30Var3.e = gj30Var.e;
                        gj30Var3.d = gj30Var.d;
                        return gj30Var3;
                    }
                }
                if (!gj30Var.k().isEmpty()) {
                    gkx0 gkx0Var7 = ((Msg) j5g.Y(gj30Var.k())).p;
                    gkx0 gkx0Var8 = ((Msg) j5g.i0(gj30Var.k())).p;
                    if (gkx0Var.compareTo(gkx0Var7) > 0 && gkx0Var2.compareTo(gkx0Var8) >= 0) {
                        if (!gj30Var2.c || !gj30Var2.b) {
                            return new gj30(gj30Var2);
                        }
                        ArraySet g2 = kn4.g(gj30Var2);
                        List<Msg> k2 = gj30Var.k();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : k2) {
                            Msg msg2 = (Msg) obj2;
                            if (msg2.p.compareTo(gkx0Var) < 0 && !g2.contains(Integer.valueOf(msg2.b))) {
                                arrayList2.add(obj2);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            return new gj30(gj30Var2);
                        }
                        gj30 gj30Var4 = new gj30(gj30Var2);
                        gj30Var4.k().addAll(0, arrayList2);
                        kn4.m(gj30Var4, gj30Var, arrayList2);
                        gj30Var4.c = gj30Var.c;
                        gj30Var4.b = gj30Var.b;
                        return gj30Var4;
                    }
                }
                if (!gj30Var.k().isEmpty()) {
                    gkx0 gkx0Var9 = ((Msg) j5g.Y(gj30Var.k())).p;
                    gkx0 gkx0Var10 = ((Msg) j5g.i0(gj30Var.k())).p;
                    if (gkx0Var.compareTo(gkx0Var9) > 0 && gkx0Var2.compareTo(gkx0Var10) < 0) {
                        boolean z = true;
                        boolean z2 = (gj30Var2.c && gj30Var2.b) ? false : true;
                        boolean z3 = (gj30Var2.e && gj30Var2.d) ? false : true;
                        if (z2 && z3) {
                            return new gj30(gj30Var2);
                        }
                        ArraySet g3 = kn4.g(gj30Var2);
                        if (z2) {
                            list = EmptyList.b;
                        } else {
                            List<Msg> k3 = gj30Var.k();
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj3 : k3) {
                                Msg msg3 = (Msg) obj3;
                                if (msg3.p.compareTo(gkx0Var) < 0 && !g3.contains(Integer.valueOf(msg3.b))) {
                                    arrayList3.add(obj3);
                                }
                            }
                            list = arrayList3;
                        }
                        if (z3) {
                            list2 = EmptyList.b;
                        } else {
                            List<Msg> k4 = gj30Var.k();
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj4 : k4) {
                                Msg msg4 = (Msg) obj4;
                                if (msg4.p.compareTo(gkx0Var2) > 0 && !g3.contains(Integer.valueOf(msg4.b))) {
                                    arrayList4.add(obj4);
                                }
                            }
                            list2 = arrayList4;
                        }
                        boolean z4 = z2 || list.isEmpty();
                        if (!z3 && !list2.isEmpty()) {
                            z = false;
                        }
                        gj30 gj30Var5 = new gj30(gj30Var2);
                        gj30Var5.k().addAll(0, list);
                        gj30Var5.k().addAll(list2);
                        kn4.m(gj30Var5, gj30Var, list);
                        kn4.m(gj30Var5, gj30Var, list2);
                        gj30Var5.c = z4 ? gj30Var2.c : gj30Var.c;
                        gj30Var5.b = z4 ? gj30Var2.b : gj30Var.b;
                        gj30Var5.e = z ? gj30Var2.e : gj30Var.e;
                        gj30Var5.d = z ? gj30Var2.d : gj30Var.d;
                        return gj30Var5;
                    }
                }
                return new gj30(gj30Var2);
            }
        }
        return new gj30(gj30Var2);
    }

    public static void p(w920 w920Var, io.reactivex.rxjava3.core.x xVar) {
        pw4 pw4Var = new pw4(1, w920Var, w920.class, "onHistoryUpdate", "onHistoryUpdate(Lcom/im/history/api/HistoryUpdate;)V", 0, 5);
        int i = 1;
        Class<w920> cls = w920.class;
        String str = "onHistoryError";
        String str2 = "onHistoryError(Ljava/lang/Throwable;)V";
        io.reactivex.rxjava3.kotlin.c.e(xVar, new q60(i, w920Var, cls, str, str2, 0, 8), new k8(22, new f2s(w920Var, 21), pw4Var));
    }

    @Override // xsna.r920
    public final io.reactivex.rxjava3.internal.operators.observable.c0 a() {
        return this.m;
    }

    @Override // xsna.r920
    public final void b(Direction direction) {
        Direction direction2;
        boolean z;
        if (this.i) {
            return;
        }
        final boolean compareAndSet = this.q.compareAndSet(false, true);
        f9w f9wVar = this.g;
        if (compareAndSet) {
            f9wVar.debug(new gzs() { // from class: xsna.s920
                @Override // xsna.gzs
                public final Object invoke() {
                    return zhy0.a("loadNext: canStartLoading=", compareAndSet);
                }
            });
            m(direction);
            return;
        }
        int i = a.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == 1) {
            direction2 = Direction.BEFORE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            direction2 = Direction.AFTER;
        }
        while (true) {
            AtomicReference<Direction> atomicReference = this.r;
            if (atomicReference.compareAndSet(direction2, direction)) {
                z = true;
                break;
            } else if (atomicReference.get() != direction2) {
                z = false;
                break;
            }
        }
        boolean z2 = c().size() >= this.e / 2;
        if (z && z2) {
            f9wVar.debug(new mk(14, direction, this));
            i();
            m(direction);
        }
    }

    @Override // xsna.r920
    public final gj30 c() {
        return (gj30) this.j.getValue(this, v[0]);
    }

    @Override // xsna.r920
    public final void d(de deVar) {
        n(deVar, this.e);
    }

    @Override // xsna.r920
    public final boolean e() {
        return this.p.get();
    }

    public final void g(gj30 gj30Var, Source source) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.t;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            gj30 c2 = c();
            c2.getClass();
            h(o(new gj30(c2), gj30Var));
            if (source == Source.CACHE) {
                this.d.a(gj30Var);
            }
            s3q0 s3q0Var = s3q0.a;
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public final void h(gj30 gj30Var) {
        if (this.i) {
            List<Msg> k = gj30Var.k();
            if (k.size() > 1) {
                g5g.L(k, new hj30(0));
            }
        }
        this.j.setValue(this, v[0], gj30Var);
    }

    public final void i() {
        this.u.e();
    }

    public final void j() {
        AtomicBoolean atomicBoolean = this.p;
        boolean compareAndSet = atomicBoolean.compareAndSet(false, true);
        f9w f9wVar = this.g;
        if (!compareAndSet) {
            f9wVar.debug(new cu1(20));
            return;
        }
        if (this.q.get()) {
            atomicBoolean.compareAndSet(true, false);
            f9wVar.debug(new kr6(14));
            return;
        }
        ReentrantReadWriteLock.ReadLock readLock = this.t.readLock();
        readLock.lock();
        try {
            x8v o = zq70.o(c());
            this.l.onNext(new q8v.a(o != null));
            if (o == null) {
                atomicBoolean.compareAndSet(true, false);
                f9wVar.debug(new d4(21));
            } else {
                f9wVar.debug(new w8q(o, 21));
                hc1 hc1Var = new hc1(15, this, o);
                pfl pflVar = this.n;
                p(this, new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.k(new io.reactivex.rxjava3.internal.operators.single.p(pflVar.c((io.reactivex.rxjava3.core.w) pflVar.c, hc1Var), new g66(this, 4)), new w6w(this, 2)), new nex(new ugm(this, 18), 3)).h(new tf1(new yhu(this, 7), 28)));
            }
        } finally {
            readLock.unlock();
        }
    }

    public final void k() {
        gj30 gj30Var = new gj30(0);
        this.j.setValue(this, v[0], gj30Var);
        ((io.reactivex.rxjava3.disposables.b) this.n.d).e();
        i();
        this.q.set(false);
        this.p.set(false);
        this.s = false;
    }

    public final String l() {
        StringBuilder sb = new StringBuilder();
        sb.append("localDataSource=" + this.a + ", ");
        sb.append("remoteDataSource=" + this.b + ", ");
        StringBuilder sb2 = new StringBuilder("historyBoundDataSource=");
        sb2.append(this.c);
        sb.append(sb2.toString());
        return sb.toString();
    }

    public final void m(Direction direction) {
        this.q.set(true);
        this.r.set(direction);
        cy0 cy0Var = new cy0(17, this, direction);
        pfl pflVar = this.n;
        pflVar.getClass();
        p(this, new io.reactivex.rxjava3.internal.operators.single.k(new io.reactivex.rxjava3.internal.operators.single.p(new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.n(new io.reactivex.rxjava3.internal.operators.single.v(new ofl(cy0Var, 0)).q((io.reactivex.rxjava3.core.w) pflVar.b), new np3(new n6f(pflVar, 10), 15)), new g7(new qpj(this, 29), 24)), new gsa(this, 5)), new o0s(this, 2)));
    }

    public final void n(final de deVar, final int i) {
        k();
        this.q.compareAndSet(false, true);
        gzs gzsVar = new gzs() { // from class: xsna.t920
            @Override // xsna.gzs
            public final Object invoke() {
                w920 w920Var = w920.this;
                xuz xuzVar = w920Var.a;
                de deVar2 = deVar;
                int i2 = i;
                gj30 b2 = xuzVar.b(deVar2, i2);
                gj30 c2 = w920Var.c();
                c2.getClass();
                gj30 gj30Var = new gj30(c2);
                if (w920Var.c.a().a(b2, deVar2)) {
                    w920Var.g(b2, Source.CACHE);
                } else {
                    w920Var.g(w920Var.b.b(deVar2, i2), Source.NETWORK);
                }
                w920Var.s = true;
                gj30 c3 = w920Var.c();
                c3.getClass();
                return new v8v.a(new w8v.b(gj30Var, new gj30(c3), deVar2));
            }
        };
        pfl pflVar = this.n;
        this.u.b(new io.reactivex.rxjava3.internal.operators.single.k(new io.reactivex.rxjava3.internal.operators.single.p(pflVar.c((io.reactivex.rxjava3.core.w) pflVar.b, gzsVar).l(new a.i(v8v.a.class)).l(new eq0(new x50(28), 18)), new bpk(this, 2)), new cm4(this, 6)).subscribe(new b0y(new b(1, this, w920.class, "onHistoryUpdate", "onHistoryUpdate(Lcom/im/history/api/HistoryUpdate;)V", 0), 5), new n1r(new c(1, this, w920.class, "onHistoryError", "onHistoryError(Ljava/lang/Throwable;)V", 0), 4)));
    }

    @Override // xsna.r920
    public final void onDestroy() {
        k();
        this.u.dispose();
        this.k.dispose();
        io.reactivex.rxjava3.disposables.c cVar = this.o;
        if (cVar != null && !cVar.h()) {
            try {
                cVar.dispose();
            } catch (Exception unused) {
            }
        }
        pfl pflVar = this.n;
        ((io.reactivex.rxjava3.disposables.b) pflVar.d).dispose();
        ((io.reactivex.rxjava3.core.w) pflVar.b).f();
        ((io.reactivex.rxjava3.core.w) pflVar.c).f();
    }

    public final void q(final Collection<Integer> collection, final boolean z) {
        if (collection.isEmpty()) {
            return;
        }
        i();
        gzs gzsVar = new gzs() { // from class: xsna.v920
            /* JADX WARN: Removed duplicated region for block: B:28:0x0127 A[LOOP:1: B:27:0x0125->B:28:0x0127, LOOP_END] */
            @Override // xsna.gzs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                int i;
                boolean z2;
                Collection<Integer> collection2 = collection;
                w920 w920Var = w920.this;
                ReentrantReadWriteLock reentrantReadWriteLock = w920Var.t;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    readLock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    Collection<Msg> a2 = w920Var.a.a(collection2);
                    gj30 c2 = w920Var.c();
                    c2.getClass();
                    gj30 gj30Var = new gj30(c2);
                    boolean z3 = gj30Var.e;
                    boolean isEmpty = gj30Var.isEmpty();
                    Collection<Msg> collection3 = a2;
                    boolean z4 = true;
                    if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                        Iterator<T> it = collection3.iterator();
                        while (it.hasNext()) {
                            if (((Msg) it.next()).i) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z2 = false;
                    Collection<Msg> collection4 = a2;
                    if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                        Iterator<T> it2 = collection4.iterator();
                        while (it2.hasNext()) {
                            if (!((Msg) it2.next()).i) {
                                break;
                            }
                        }
                    }
                    z4 = false;
                    gj30 gj30Var2 = new gj30(gj30Var);
                    boolean z5 = z;
                    if (isEmpty || !z3 || !z5) {
                        if ((a2 instanceof List) && (a2 instanceof RandomAccess)) {
                            List list = (List) a2;
                            int size = list.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                gj30Var2.u((Msg) list.get(i3));
                            }
                        } else {
                            Iterator<T> it3 = a2.iterator();
                            while (it3.hasNext()) {
                                gj30Var2.u((Msg) it3.next());
                            }
                        }
                        if (z5) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : a2) {
                                if (!gj30Var2.r(MsgIdType.LOCAL_ID, ((Msg) obj).b)) {
                                    arrayList.add(obj);
                                }
                            }
                            gj30Var2.k().addAll(arrayList);
                            g5g.K(gj30Var2.k());
                        }
                        if (isEmpty) {
                            i = 0;
                            try {
                                gj30Var2.e = false;
                                gj30Var2.d = false;
                                w920Var.h(gj30Var2);
                                v8v.a aVar = new v8v.a(new w8v.g(gj30Var, gj30Var2, z2, z4, z5));
                                while (i < readHoldCount) {
                                    readLock.lock();
                                    i++;
                                }
                                writeLock.unlock();
                                return aVar;
                            } catch (Throwable th) {
                                th = th;
                                while (i < readHoldCount) {
                                    readLock.lock();
                                    i++;
                                }
                                writeLock.unlock();
                                throw th;
                            }
                        }
                    }
                    i = 0;
                    w920Var.h(gj30Var2);
                    v8v.a aVar2 = new v8v.a(new w8v.g(gj30Var, gj30Var2, z2, z4, z5));
                    while (i < readHoldCount) {
                    }
                    writeLock.unlock();
                    return aVar2;
                } catch (Throwable th2) {
                    th = th2;
                    i = 0;
                }
            }
        };
        pfl pflVar = this.n;
        p(this, pflVar.c((io.reactivex.rxjava3.core.w) pflVar.b, gzsVar));
    }
}
