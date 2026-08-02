package androidx.room;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Looper;
import defpackage.ate0;
import defpackage.bhe0;
import defpackage.bvf0;
import defpackage.cvu0;
import defpackage.dsq0;
import defpackage.fse;
import defpackage.g0c;
import defpackage.gw00;
import defpackage.gwk0;
import defpackage.he01;
import defpackage.hkw0;
import defpackage.ike;
import defpackage.iwk0;
import defpackage.jse;
import defpackage.k4c;
import defpackage.k4o;
import defpackage.l8x;
import defpackage.lfx;
import defpackage.lkw0;
import defpackage.nq60;
import defpackage.nqh;
import defpackage.ny61;
import defpackage.oll0;
import defpackage.ooc;
import defpackage.p2l;
import defpackage.qhw0;
import defpackage.qoi0;
import defpackage.qv10;
import defpackage.seu;
import defpackage.sls;
import defpackage.sp3;
import defpackage.syj;
import defpackage.tcc;
import defpackage.ull0;
import defpackage.vez0;
import defpackage.vg10;
import defpackage.wls;
import defpackage.x4c;
import defpackage.yci0;
import defpackage.yko;
import defpackage.zg20;
import defpackage.zzb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public abstract class RoomDatabase {
    public ike a;
    public fse b;
    public Executor c;
    public dsq0 d;
    public i e;
    public d f;
    public boolean h;
    public final k4c g = new k4c(new RoomDatabase$closeBarrier$1(0, this, RoomDatabase.class, "onClosed", "onClosed()V", 0));
    public final ThreadLocal i = new ThreadLocal();
    public final LinkedHashMap j = new LinkedHashMap();
    public boolean k = true;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/RoomDatabase$JournalMode;", "", "AUTOMATIC", "TRUNCATE", "WRITE_AHEAD_LOGGING", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class JournalMode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ JournalMode[] $VALUES;
        public static final JournalMode AUTOMATIC;
        public static final JournalMode TRUNCATE;
        public static final JournalMode WRITE_AHEAD_LOGGING;

        static {
            JournalMode journalMode = new JournalMode("AUTOMATIC", 0);
            AUTOMATIC = journalMode;
            JournalMode journalMode2 = new JournalMode("TRUNCATE", 1);
            TRUNCATE = journalMode2;
            JournalMode journalMode3 = new JournalMode("WRITE_AHEAD_LOGGING", 2);
            WRITE_AHEAD_LOGGING = journalMode3;
            JournalMode[] journalModeArr = {journalMode, journalMode2, journalMode3};
            $VALUES = journalModeArr;
            $ENTRIES = kotlin.enums.a.a(journalModeArr);
        }

        public static JournalMode valueOf(String str) {
            return (JournalMode) Enum.valueOf(JournalMode.class, str);
        }

        public static JournalMode[] values() {
            return (JournalMode[]) $VALUES.clone();
        }
    }

    public static abstract class a {
        public void a(hkw0 hkw0Var) {
        }

        public void b(hkw0 hkw0Var) {
        }

        public void c(hkw0 hkw0Var) {
        }
    }

    public static class b {
        public final LinkedHashMap a = new LinkedHashMap();

        public final void a(zg20 zg20Var) {
            int i = zg20Var.a;
            int i2 = zg20Var.b;
            Integer valueOf = Integer.valueOf(i);
            LinkedHashMap linkedHashMap = this.a;
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                linkedHashMap.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            if (treeMap.containsKey(Integer.valueOf(i2))) {
                Objects.toString(treeMap.get(Integer.valueOf(i2)));
                zg20Var.toString();
            }
            treeMap.put(Integer.valueOf(i2), zg20Var);
        }
    }

    public static abstract class c {
    }

    public lkw0 A0(androidx.room.c cVar) {
        throw new NotImplementedError(0);
    }

    public void B0() {
        D0().getWritableDatabase().t();
        if (J0()) {
            return;
        }
        d dVar = this.f;
        if (dVar == null) {
            dVar = null;
        }
        dVar.c.e(dVar.f, dVar.g);
    }

    public List C0() {
        return EmptyList.a;
    }

    public final lkw0 D0() {
        i iVar = this.e;
        if (iVar == null) {
            iVar = null;
        }
        lkw0 lkw0Var = iVar.g;
        if (lkw0Var != null) {
            return lkw0Var;
        }
        ny61.r("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public Set E0() {
        Set F0 = F0();
        ArrayList arrayList = new ArrayList(tcc.n(F0, 10));
        Iterator it = F0.iterator();
        while (it.hasNext()) {
            arrayList.add(qoi0.a((Class) it.next()));
        }
        return kotlin.collections.a.N0(arrayList);
    }

    public Set F0() {
        return EmptySet.a;
    }

    public LinkedHashMap G0() {
        Set<Map.Entry> entrySet = H0().entrySet();
        int d = gw00.d(tcc.n(entrySet, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Map.Entry entry : entrySet) {
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            g0c a2 = qoi0.a(cls);
            List list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(qoi0.a((Class) it.next()));
            }
            Pair pair = new Pair(a2, arrayList);
            linkedHashMap.put(pair.c(), pair.f());
        }
        return linkedHashMap;
    }

    public Map H0() {
        return kotlin.collections.b.f();
    }

    public final boolean I0() {
        i iVar = this.e;
        if (iVar == null) {
            iVar = null;
        }
        return iVar.g != null;
    }

    public final boolean J0() {
        return N0() && D0().getWritableDatabase().A();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c1, code lost:
    
        defpackage.ny61.g("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c6, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0267 A[LOOP:8: B:127:0x0267->B:131:0x0270, LOOP_START, PHI: r0
      0x0267: PHI (r0v32 lkw0) = (r0v31 lkw0), (r0v34 lkw0) binds: [B:112:0x0263, B:131:0x0270] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016b A[LOOP:5: B:60:0x013b->B:72:0x016b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0175 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void K0(androidx.room.c cVar) {
        p2l p2lVar;
        RoomDatabase roomDatabase;
        i iVar;
        i iVar2;
        lkw0 lkw0Var;
        Intent intent;
        Executor syjVar;
        fse fseVar;
        boolean z;
        fse fseVar2 = cVar.v;
        this.k = cVar.w;
        try {
            p2lVar = z0();
        } catch (NotImplementedError unused) {
            p2lVar = null;
        }
        if (p2lVar == null) {
            iVar = new i(cVar, new ate0(8, this), new RoomDatabase$createConnectionManager$2(2, this, gwk0.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1));
            roomDatabase = this;
        } else {
            roomDatabase = this;
            iVar = new i(cVar, p2lVar, new RoomDatabase$createConnectionManager$3(2, roomDatabase, gwk0.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1));
        }
        roomDatabase.e = iVar;
        roomDatabase.f = roomDatabase.y0();
        b bVar = cVar.d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set E0 = roomDatabase.E0();
        List list = cVar.s;
        int size = list.size();
        boolean[] zArr = new boolean[size];
        Iterator it = E0.iterator();
        while (true) {
            int i = -1;
            if (it.hasNext()) {
                lfx lfxVar = (lfx) it.next();
                int size2 = list.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i2 = size2 - 1;
                        if (((g0c) lfxVar).e(list.get(size2))) {
                            zArr[size2] = true;
                            i = size2;
                            break;
                        } else if (i2 < 0) {
                            break;
                        } else {
                            size2 = i2;
                        }
                    }
                }
                if (i < 0) {
                    yci0.x("A required auto migration spec (", ((g0c) lfxVar).c(), ") is missing in the database configuration.");
                    return;
                }
                linkedHashMap.put(lfxVar, list.get(i));
            } else {
                int size3 = list.size() - 1;
                if (size3 >= 0) {
                    while (true) {
                        int i3 = size3 - 1;
                        if (size3 >= size || !zArr[size3]) {
                            break;
                        } else if (i3 < 0) {
                            break;
                        } else {
                            size3 = i3;
                        }
                    }
                }
                for (zg20 zg20Var : roomDatabase.x0(linkedHashMap)) {
                    int i4 = zg20Var.a;
                    int i5 = zg20Var.b;
                    LinkedHashMap linkedHashMap2 = bVar.a;
                    if (linkedHashMap2.containsKey(Integer.valueOf(i4))) {
                        Map map = (Map) linkedHashMap2.get(Integer.valueOf(i4));
                        if (map == null) {
                            map = kotlin.collections.b.f();
                        }
                        z = map.containsKey(Integer.valueOf(i5));
                    } else {
                        z = false;
                    }
                    if (!z) {
                        bVar.a(zg20Var);
                    }
                }
                LinkedHashMap G0 = roomDatabase.G0();
                List list2 = cVar.r;
                boolean[] zArr2 = new boolean[list2.size()];
                for (Map.Entry entry : G0.entrySet()) {
                    lfx lfxVar2 = (lfx) entry.getKey();
                    for (lfx lfxVar3 : (List) entry.getValue()) {
                        int size4 = list2.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i6 = size4 - 1;
                                if (((g0c) lfxVar3).e(list2.get(size4))) {
                                    zArr2[size4] = true;
                                    break;
                                } else if (i6 < 0) {
                                    break;
                                } else {
                                    size4 = i6;
                                }
                            }
                            if (size4 >= 0) {
                                vg10.q("A required type converter (", ((g0c) lfxVar3).c(), ") for ", ((g0c) lfxVar2).c(), " is missing in the database configuration.");
                                return;
                            }
                            roomDatabase.j.put(lfxVar3, list2.get(size4));
                        }
                        size4 = -1;
                        if (size4 >= 0) {
                        }
                    }
                }
                int size5 = list2.size() - 1;
                if (size5 >= 0) {
                    while (true) {
                        int i7 = size5 - 1;
                        if (!zArr2[size5]) {
                            ny61.g(qv10.p("Unexpected type converter ", ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.", list2.get(size5)));
                            return;
                        } else if (i7 < 0) {
                            break;
                        } else {
                            size5 = i7;
                        }
                    }
                }
                if (fseVar2 != null) {
                    jse jseVar = (jse) fseVar2.get(x4c.K);
                    yko ykoVar = jseVar instanceof yko ? (yko) jseVar : null;
                    if (ykoVar == null || (syjVar = ykoVar.R()) == null) {
                        syjVar = new syj(jseVar);
                    }
                    roomDatabase.c = syjVar;
                    roomDatabase.d = new dsq0(syjVar, 1);
                    roomDatabase.a = bvf0.a(fseVar2.plus(new qhw0((l8x) fseVar2.get(seu.C))));
                    boolean I0 = roomDatabase.I0();
                    ike ikeVar = roomDatabase.a;
                    if (I0) {
                        if (ikeVar == null) {
                            ikeVar = null;
                        }
                        fseVar = ikeVar.a.plus(jseVar.P(1));
                    } else {
                        if (ikeVar == null) {
                            ikeVar = null;
                        }
                        fseVar = ikeVar.a;
                    }
                    roomDatabase.b = fseVar;
                } else {
                    roomDatabase.c = cVar.h;
                    roomDatabase.d = new dsq0(cVar.i, 1);
                    Executor executor = roomDatabase.c;
                    if (executor == null) {
                        executor = null;
                    }
                    ike e = qv10.e(ooc.o(executor));
                    roomDatabase.a = e;
                    fse fseVar3 = e.a;
                    dsq0 dsq0Var = roomDatabase.d;
                    if (dsq0Var == null) {
                        dsq0Var = null;
                    }
                    roomDatabase.b = fseVar3.plus(ooc.o(dsq0Var));
                }
                roomDatabase.h = cVar.f;
                i iVar3 = roomDatabase.e;
                if (iVar3 == null) {
                    iVar3 = null;
                }
                lkw0 lkw0Var2 = iVar3.g;
                if (lkw0Var2 != null) {
                    while (!(lkw0Var2 instanceof bhe0)) {
                        if (lkw0Var2 instanceof nqh) {
                            lkw0Var2 = ((nqh) lkw0Var2).a();
                        }
                    }
                    iVar2 = roomDatabase.e;
                    if (iVar2 == null) {
                        iVar2 = null;
                    }
                    lkw0Var = iVar2.g;
                    if (lkw0Var != null) {
                        while (!(lkw0Var instanceof sp3)) {
                            if (lkw0Var instanceof nqh) {
                                lkw0Var = ((nqh) lkw0Var).a();
                            }
                        }
                        intent = cVar.j;
                        if (intent != null) {
                            String str = cVar.b;
                            if (str == null) {
                                ny61.g("Required value was null.");
                                return;
                            }
                            d dVar = roomDatabase.f;
                            d dVar2 = dVar == null ? null : dVar;
                            Context context = cVar.a;
                            dVar2.h = intent;
                            dVar2.i = new f(context, str, dVar2);
                            return;
                        }
                        return;
                    }
                    lkw0Var = null;
                    intent = cVar.j;
                    if (intent != null) {
                    }
                }
                lkw0Var2 = null;
                iVar2 = roomDatabase.e;
                if (iVar2 == null) {
                }
                lkw0Var = iVar2.g;
                if (lkw0Var != null) {
                }
                lkw0Var = null;
                intent = cVar.j;
                if (intent != null) {
                }
            }
        }
    }

    public final void L0(oll0 oll0Var) {
        d dVar = this.f;
        if (dVar == null) {
            dVar = null;
        }
        o oVar = dVar.c;
        oVar.getClass();
        ull0 T0 = oll0Var.T0("PRAGMA query_only");
        try {
            T0.q();
            boolean Q1 = T0.Q1();
            gwk0.m(T0, null);
            if (!Q1) {
                vez0.s(oll0Var, "PRAGMA temp_store = MEMORY");
                vez0.s(oll0Var, "PRAGMA recursive_triggers = 1");
                vez0.s(oll0Var, "DROP TABLE IF EXISTS room_table_modification_log");
                if (oVar.d) {
                    vez0.s(oll0Var, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    vez0.s(oll0Var, cvu0.v("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false));
                }
                nq60 nq60Var = oVar.h;
                ReentrantLock reentrantLock = nq60Var.a;
                reentrantLock.lock();
                try {
                    nq60Var.d = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (dVar.j) {
                try {
                    f fVar = dVar.i;
                    if (fVar != null) {
                        Intent intent = dVar.h;
                        if (intent == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        fVar.b(intent);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
        }
    }

    public final boolean M0() {
        i iVar = this.e;
        if (iVar == null) {
            iVar = null;
        }
        hkw0 hkw0Var = iVar.h;
        if (hkw0Var != null) {
            return hkw0Var.isOpen();
        }
        return false;
    }

    public final boolean N0() {
        i iVar = this.e;
        if (iVar == null) {
            iVar = null;
        }
        hkw0 hkw0Var = iVar.h;
        if (hkw0Var != null) {
            return hkw0Var.isOpen();
        }
        return false;
    }

    public Cursor O0(iwk0 iwk0Var) {
        t0();
        u0();
        return D0().getWritableDatabase().U0(iwk0Var);
    }

    public final Object P0(sls slsVar) {
        if (!I0()) {
            return androidx.room.util.a.b(this, false, true, new ate0(9, slsVar));
        }
        v0();
        try {
            Object invoke = slsVar.invoke();
            Q0();
            return invoke;
        } finally {
            B0();
        }
    }

    public void Q0() {
        D0().getWritableDatabase().s();
    }

    public final Object R0(boolean z, wls wlsVar, ContinuationImpl continuationImpl) {
        i iVar = this.e;
        if (iVar == null) {
            iVar = null;
        }
        return iVar.f.c0(z, wlsVar, continuationImpl);
    }

    public boolean q0() {
        return M0();
    }

    public final void t0() {
        if (this.h) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            ny61.r("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void u0() {
        if (!I0() || J0()) {
            return;
        }
        fse fseVar = (fse) this.i.get();
        if ((fseVar != null ? (he01) fseVar.get(he01.b) : null) == null) {
            return;
        }
        ny61.r("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }

    public void v0() {
        t0();
        t0();
        hkw0 writableDatabase = D0().getWritableDatabase();
        if (!writableDatabase.A()) {
            d dVar = this.f;
            if (dVar == null) {
                dVar = null;
            }
            dVar.getClass();
            androidx.room.coroutines.g.a(new InvalidationTracker$syncBlocking$1(dVar, null));
        }
        if (writableDatabase.j2()) {
            writableDatabase.N();
        } else {
            writableDatabase.i();
        }
    }

    public void w0() {
        k4c k4cVar = this.g;
        synchronized (k4cVar) {
            if (k4cVar.c.compareAndSet(false, true)) {
                while (k4cVar.b.get() != 0) {
                }
                ((RoomDatabase$closeBarrier$1) k4cVar.a).invoke();
            }
        }
    }

    public List x0(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(((zzb) ((lfx) entry.getKey())).a(), entry.getValue());
        }
        return C0();
    }

    public abstract d y0();

    public p2l z0() {
        throw new NotImplementedError(0);
    }
}
