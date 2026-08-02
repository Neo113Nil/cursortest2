package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.log.L;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.usi0;

/* compiled from: SessionDataSourceImpl.kt */
/* loaded from: classes11.dex */
public final class cti0 {
    public final gzs<Executor> a;
    public final gzs<Executor> b;
    public final zxi0 c;
    public final lvl d;
    public final mxi0 e;
    public final x570 f;
    public final ujp g;
    public final gzs<Boolean> h;
    public final CopyOnWriteArraySet<usi0> i = new CopyOnWriteArraySet<>();
    public final ReentrantReadWriteLock j = new ReentrantReadWriteLock();
    public final CountDownLatch k = new CountDownLatch(1);
    public volatile Boolean l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SessionDataSourceImpl.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a DATABASE;
        public static final a NON_ENCRYPTED_PREFS;
        public static final a STABLE_ENCRYPTED_PREFS;

        static {
            a aVar = new a("DATABASE", 0);
            DATABASE = aVar;
            a aVar2 = new a("STABLE_ENCRYPTED_PREFS", 1);
            STABLE_ENCRYPTED_PREFS = aVar2;
            a aVar3 = new a("NON_ENCRYPTED_PREFS", 2);
            NON_ENCRYPTED_PREFS = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cti0(gzs<? extends Executor> gzsVar, gzs<? extends Executor> gzsVar2, zxi0 zxi0Var, lvl lvlVar, mxi0 mxi0Var, x570 x570Var, ujp ujpVar, gzs<Boolean> gzsVar3) {
        this.a = gzsVar;
        this.b = gzsVar2;
        this.c = zxi0Var;
        this.d = lvlVar;
        this.e = mxi0Var;
        this.f = x570Var;
        this.g = ujpVar;
        this.h = gzsVar3;
    }

    public final List<usi0> a() {
        CountDownLatch countDownLatch = this.k;
        long count = countDownLatch.getCount();
        CopyOnWriteArraySet<usi0> copyOnWriteArraySet = this.i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.j;
        if (count == 0) {
            reentrantReadWriteLock.readLock().lock();
            try {
                return j5g.O0(copyOnWriteArraySet);
            } finally {
            }
        }
        try {
            countDownLatch.await();
        } catch (Throwable th) {
            L.i(th);
            this.e.a(pn00.k(new Pair("action", "warm_up_sessions"), new Pair("stacktrace", rte0.w(th))));
        }
        reentrantReadWriteLock.readLock().lock();
        try {
            return j5g.O0(copyOnWriteArraySet);
        } finally {
        }
    }

    public final boolean b() {
        Boolean bool = this.l;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean invoke = this.h.invoke();
        invoke.booleanValue();
        this.l = invoke;
        return invoke.booleanValue();
    }

    /* JADX WARN: Finally extract failed */
    public final boolean c(usi0 usi0Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.j;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            boolean remove = this.i.remove(usi0Var);
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
            this.b.invoke().execute(new ls2(8, usi0Var, this));
            return remove;
        } catch (Throwable th) {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void d(ArrayList arrayList) {
        CopyOnWriteArraySet<usi0> copyOnWriteArraySet = this.i;
        ReentrantReadWriteLock reentrantReadWriteLock = this.j;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            copyOnWriteArraySet.clear();
            copyOnWriteArraySet.addAll(arrayList);
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
            this.b.invoke().execute(new z(7, arrayList, this));
        } catch (Throwable th) {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    public final void e() {
        boolean b;
        a aVar;
        List<usi0.a> a2;
        List<usi0.a> a3;
        EmptyList emptyList;
        boolean b2 = b();
        int i = 0;
        if (((SharedPreferences) this.f.d.getValue()).getBoolean("migration", false)) {
            aVar = a.NON_ENCRYPTED_PREFS;
        } else {
            ujp ujpVar = this.g;
            synchronized (ujpVar) {
                b = ujpVar.a.b();
            }
            aVar = b ? a.STABLE_ENCRYPTED_PREFS : a.DATABASE;
        }
        if (aVar == a.DATABASE) {
            xxi0 xxi0Var = this.c.a;
            xxi0Var.b.g(3000L);
            try {
                ArrayList a4 = xxi0Var.a();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(a4);
                emptyList = arrayList;
            } catch (Throwable th) {
                L.i(th);
                xxi0Var.c.a(pn00.k(new Pair("action", "read_all"), new Pair("stacktrace", rte0.w(th))));
                emptyList = EmptyList.b;
            }
            CopyOnWriteArraySet<usi0> copyOnWriteArraySet = this.i;
            ReentrantReadWriteLock reentrantReadWriteLock = this.j;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                readLock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                copyOnWriteArraySet.addAll(emptyList);
                for (int i3 = 0; i3 < readHoldCount; i3++) {
                    readLock.lock();
                }
                writeLock.unlock();
                this.k.countDown();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : emptyList) {
                    if (obj instanceof usi0.a) {
                        arrayList2.add(obj);
                    }
                }
                ujp ujpVar2 = this.g;
                synchronized (ujpVar2) {
                    ujpVar2.a.d(arrayList2);
                    ujpVar2.a.e();
                }
                if (!b2) {
                    x570 x570Var = this.f;
                    x570Var.b(arrayList2);
                    tdj.b((SharedPreferences) x570Var.d.getValue(), "migration", true);
                }
            } catch (Throwable th2) {
                while (i < readHoldCount) {
                    readLock.lock();
                    i++;
                }
                writeLock.unlock();
                throw th2;
            }
        }
        if (aVar == a.STABLE_ENCRYPTED_PREFS || b2) {
            ujp ujpVar3 = this.g;
            synchronized (ujpVar3) {
                a2 = ujpVar3.a.a();
            }
            if (this.k.getCount() != 0) {
                CopyOnWriteArraySet<usi0> copyOnWriteArraySet2 = this.i;
                ReentrantReadWriteLock reentrantReadWriteLock2 = this.j;
                ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock2.readLock();
                int readHoldCount2 = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
                for (int i4 = 0; i4 < readHoldCount2; i4++) {
                    readLock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock2.writeLock();
                writeLock2.lock();
                try {
                    copyOnWriteArraySet2.addAll(a2);
                    for (int i5 = 0; i5 < readHoldCount2; i5++) {
                        readLock2.lock();
                    }
                    writeLock2.unlock();
                    this.k.countDown();
                } catch (Throwable th3) {
                    while (i < readHoldCount2) {
                        readLock2.lock();
                        i++;
                    }
                    writeLock2.unlock();
                    throw th3;
                }
            }
            if (!b2) {
                x570 x570Var2 = this.f;
                x570Var2.b(a2);
                tdj.b((SharedPreferences) x570Var2.d.getValue(), "migration", true);
            }
        }
        if (this.k.getCount() != 0 && ((SharedPreferences) this.f.d.getValue()).getBoolean("migration", false)) {
            List<usi0.a> a5 = this.f.a();
            CopyOnWriteArraySet<usi0> copyOnWriteArraySet3 = this.i;
            ReentrantReadWriteLock reentrantReadWriteLock3 = this.j;
            ReentrantReadWriteLock.ReadLock readLock3 = reentrantReadWriteLock3.readLock();
            int readHoldCount3 = reentrantReadWriteLock3.getWriteHoldCount() == 0 ? reentrantReadWriteLock3.getReadHoldCount() : 0;
            for (int i6 = 0; i6 < readHoldCount3; i6++) {
                readLock3.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock3 = reentrantReadWriteLock3.writeLock();
            writeLock3.lock();
            try {
                copyOnWriteArraySet3.addAll(a5);
                for (int i7 = 0; i7 < readHoldCount3; i7++) {
                    readLock3.lock();
                }
                writeLock3.unlock();
                this.k.countDown();
            } catch (Throwable th4) {
                while (i < readHoldCount3) {
                    readLock3.lock();
                    i++;
                }
                writeLock3.unlock();
                throw th4;
            }
        }
        if (this.k.getCount() != 0) {
            ujp ujpVar4 = this.g;
            synchronized (ujpVar4) {
                a3 = ujpVar4.a.a();
            }
            CopyOnWriteArraySet<usi0> copyOnWriteArraySet4 = this.i;
            ReentrantReadWriteLock reentrantReadWriteLock4 = this.j;
            ReentrantReadWriteLock.ReadLock readLock4 = reentrantReadWriteLock4.readLock();
            int readHoldCount4 = reentrantReadWriteLock4.getWriteHoldCount() == 0 ? reentrantReadWriteLock4.getReadHoldCount() : 0;
            for (int i8 = 0; i8 < readHoldCount4; i8++) {
                readLock4.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock4 = reentrantReadWriteLock4.writeLock();
            writeLock4.lock();
            try {
                copyOnWriteArraySet4.addAll(a3);
                for (int i9 = 0; i9 < readHoldCount4; i9++) {
                    readLock4.lock();
                }
                writeLock4.unlock();
                this.k.countDown();
            } catch (Throwable th5) {
                while (i < readHoldCount4) {
                    readLock4.lock();
                    i++;
                }
                writeLock4.unlock();
                throw th5;
            }
        }
        if (b2) {
            x570 x570Var3 = this.f;
            ReentrantReadWriteLock reentrantReadWriteLock5 = x570Var3.c;
            ReentrantReadWriteLock.ReadLock readLock5 = reentrantReadWriteLock5.readLock();
            int readHoldCount5 = reentrantReadWriteLock5.getWriteHoldCount() == 0 ? reentrantReadWriteLock5.getReadHoldCount() : 0;
            for (int i10 = 0; i10 < readHoldCount5; i10++) {
                readLock5.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock5 = reentrantReadWriteLock5.writeLock();
            writeLock5.lock();
            try {
                ((SharedPreferences) x570Var3.d.getValue()).edit().clear().apply();
                s3q0 s3q0Var = s3q0.a;
                while (i < readHoldCount5) {
                    readLock5.lock();
                    i++;
                }
                writeLock5.unlock();
            } catch (Throwable th6) {
                while (i < readHoldCount5) {
                    readLock5.lock();
                    i++;
                }
                writeLock5.unlock();
                throw th6;
            }
        }
        Context context = this.d.a;
        try {
            context.deleteDatabase("Sessions.db");
        } catch (Throwable unused) {
        }
        try {
            context.deleteDatabase("keystorage.vk.db");
        } catch (Throwable unused2) {
        }
        try {
            context.deleteSharedPreferences("session_management_anonymous");
        } catch (Throwable unused3) {
        }
        try {
            context.deleteSharedPreferences("session_management_lite_v2");
        } catch (Throwable unused4) {
        }
        try {
            context.deleteSharedPreferences("encrypted_file_meta");
        } catch (Throwable unused5) {
        }
        try {
            new File(context.getFilesDir(), "encrypted_authorized_sessions.json").delete();
        } catch (Throwable unused6) {
        }
        try {
            new File(context.getFilesDir(), "encrypted_authorized_sessions.txt").delete();
        } catch (Throwable unused7) {
        }
    }
}
