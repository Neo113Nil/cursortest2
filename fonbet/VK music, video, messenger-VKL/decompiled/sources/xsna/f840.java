package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.im.engine.internal.sync.longpoll.LongPollStateComposingPolicy;
import com.vk.im.engine.internal.sync.longpoll.LongPollSyncManager$InitialSyncState;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.models.LongPollType;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import xsna.fxv;

/* compiled from: MultipleLongPollSyncManagerImpl.kt */
/* loaded from: classes2.dex */
public final class f840 {
    public final w2w a;
    public final HashSet b;
    public final LongPollStateComposingPolicy c;
    public final fxv.a d;
    public final ArrayList<a500> e;
    public final LinkedHashMap f;
    public final ny6 g;
    public final r4k h;
    public final jx5 i;
    public final d500 j;
    public final Object k;
    public final Object l;
    public final io.reactivex.rxjava3.disposables.b m;
    public final io.reactivex.rxjava3.subjects.d<LongPollSyncManager$InitialSyncState> n;

    /* compiled from: MultipleLongPollSyncManagerImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LongPollType.values().length];
            try {
                iArr[LongPollType.MESSAGES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LongPollType.CHANNELS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public f840(w2w w2wVar, HashSet hashSet, LongPollStateComposingPolicy longPollStateComposingPolicy, y400 y400Var, nt8 nt8Var, fxv.a aVar) {
        this.a = w2wVar;
        this.b = hashSet;
        this.c = longPollStateComposingPolicy;
        this.d = aVar;
        this.e = new ArrayList<>(hashSet.size());
        int e = on00.e(c5g.u(hashSet, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (Object obj : hashSet) {
            linkedHashMap.put(obj, new qy6());
        }
        this.f = linkedHashMap;
        oy6 oy6Var = new oy6(linkedHashMap, this.c, (esp) nt8Var.b);
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(((py6) entry.getValue()).getState().U(new e7(new d7((LongPollType) entry.getKey(), 8), 4)));
        }
        int i = 5;
        oy6Var.c.b(io.reactivex.rxjava3.kotlin.c.f(2, io.reactivex.rxjava3.core.q.n(arrayList, new g7(new rf(5), i)), null, new oa(6), new fm0(oy6Var, i)));
        this.g = oy6Var;
        r4k r4kVar = new r4k();
        this.h = r4kVar;
        jx5 jx5Var = new jx5();
        this.i = jx5Var;
        this.j = new d500(r4kVar, jx5Var);
        ie3 ie3Var = new ie3(18, this, y400Var);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.k = msy.a(lazyThreadSafetyMode, ie3Var);
        this.l = msy.a(lazyThreadSafetyMode, new qg1(15, this, y400Var));
        this.m = new io.reactivex.rxjava3.disposables.b();
        this.n = io.reactivex.rxjava3.subjects.d.O0(LongPollSyncManager$InitialSyncState.STOPPED);
    }

    public final void a(boolean z, LongPollType longPollType) {
        Object failure;
        Throwable cause;
        py6 py6Var = (py6) this.f.get(longPollType);
        if (py6Var == null) {
            L l = L.a;
            l.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l, L.LogType.w, new Object[]{"No long poll started for type " + longPollType});
            return;
        }
        io.reactivex.rxjava3.subjects.d<ImBgSyncState> state = py6Var.getState();
        lp0 lp0Var = new lp0(new tnd(z, this, 2), 29);
        state.getClass();
        try {
            failure = (ImBgSyncState) new io.reactivex.rxjava3.internal.operators.observable.i0(state, lp0Var).a();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            RuntimeException runtimeException = a2 instanceof RuntimeException ? (RuntimeException) a2 : null;
            if (runtimeException != null && (cause = runtimeException.getCause()) != null) {
                throw cause;
            }
        }
    }

    public final void b(ArrayList arrayList) {
        io.reactivex.rxjava3.disposables.b bVar = this.m;
        bVar.e();
        LongPollSyncManager$InitialSyncState longPollSyncManager$InitialSyncState = LongPollSyncManager$InitialSyncState.STOPPED;
        io.reactivex.rxjava3.subjects.d<LongPollSyncManager$InitialSyncState> dVar = this.n;
        dVar.onNext(longPollSyncManager$InitialSyncState);
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((a500) it.next()).m);
        }
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(3, io.reactivex.rxjava3.core.q.n(arrayList2, new xa4(16)), null, null, new n9b(dVar, 6)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void c(Long l) {
        kx5 kx5Var = (kx5) this.l.getValue();
        jx5 jx5Var = kx5Var.d;
        qk qkVar = new qk(1, kx5Var, l);
        ReentrantLock reentrantLock = jx5Var.a;
        reentrantLock.lock();
        try {
            jx5Var.d = false;
            jx5Var.c = (a400) qkVar.invoke();
            jx5Var.d = true;
            jx5Var.b.signalAll();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final LongPollSyncManager$InitialSyncState d() {
        return this.n.P0();
    }

    public final io.reactivex.rxjava3.internal.operators.observable.y e() {
        io.reactivex.rxjava3.subjects.d<LongPollSyncManager$InitialSyncState> dVar = this.n;
        dVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }

    public final ArrayList f() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.b) {
            int i = a.$EnumSwitchMapping$0[((LongPollType) obj).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!BuildInfo.s()) {
                    this.a.getExperiments().getClass();
                }
            }
            arrayList.add(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            LongPollType longPollType = (LongPollType) next;
            ArrayList<a500> arrayList3 = this.e;
            if (arrayList3 == null || !arrayList3.isEmpty()) {
                Iterator<a500> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (it2.next().b == longPollType) {
                        break;
                    }
                }
            }
            arrayList2.add(next);
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    public final synchronized void g(String str) {
        try {
            ArrayList f = f();
            if (f.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList(f.size());
            Iterator it = f.iterator();
            while (it.hasNext()) {
                LongPollType longPollType = (LongPollType) it.next();
                arrayList.add(((b500) this.k.getValue()).a(longPollType, (py6) this.f.get(longPollType), this.d, str));
            }
            b(arrayList);
            this.e.addAll(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((a500) it2.next()).start();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void h(String str) {
        ArrayList<a500> arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : this.b) {
            int i = a.$EnumSwitchMapping$0[((LongPollType) obj).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!BuildInfo.s()) {
                    this.a.getExperiments().getClass();
                }
            }
            arrayList2.add(obj);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = this.e;
            if (!hasNext) {
                break;
            }
            Object next = it.next();
            LongPollType longPollType = (LongPollType) next;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator<a500> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (it2.next().b == longPollType) {
                        break;
                    }
                }
            }
            arrayList3.add(next);
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            LongPollType longPollType2 = (LongPollType) it3.next();
            arrayList4.add(((b500) this.k.getValue()).a(longPollType2, (py6) this.f.get(longPollType2), this.d, str));
        }
        b(arrayList4);
        arrayList.addAll(arrayList4);
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            ((a500) it4.next()).start();
        }
    }

    public final synchronized a540 i(boolean z) {
        ArrayList arrayList;
        tmy tmyVar;
        String str;
        try {
            ArrayList<a500> arrayList2 = this.e;
            arrayList = new ArrayList(c5g.u(arrayList2, 10));
            Iterator<a500> it = arrayList2.iterator();
            while (it.hasNext()) {
                a500 next = it.next();
                next.interrupt();
                CountDownLatch countDownLatch = next.l;
                int i = a.$EnumSwitchMapping$0[next.b.ordinal()];
                if (i == 1) {
                    str = "LongPollSyncManager";
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "LongPollSyncChannelsManager";
                }
                arrayList.add(new wwj(str, countDownLatch));
            }
            this.e.clear();
            tmyVar = new tmy("MultipleLongPollSyncManagerDestroy", new s810(z, this, 1));
            ((io.reactivex.rxjava3.disposables.g) this.h.b).dispose();
        } catch (Throwable th) {
            throw th;
        }
        return new a540(j5g.u0(arrayList, Collections.singletonList(tmyVar)));
    }
}
