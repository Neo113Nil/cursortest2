package xsna;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.core.serialize.Serializer;
import io.reactivex.rxjava3.internal.functions.a;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.InitializedLazyImpl;
import kotlin.collections.EmptyList;
import xsna.hov;
import xsna.wmi0;

/* compiled from: SerializerCache.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class wmi0 implements hov {
    public static final wmi0 a = new wmi0();
    public static final ReentrantReadWriteLock b;
    public static Context c;
    public static a d;
    public static ConcurrentHashMap e;
    public static b f;
    public static q7y0 g;
    public static l03 h;
    public static boolean i;
    public static Object j;
    public static final bpn0 k;

    /* compiled from: SerializerCache.kt */
    public static final class a extends SQLiteOpenHelper {
        public final Context b;
        public final bpn0 c;

        public a(Context context, int i) {
            super(context, "SerializerDatabaseCache", (SQLiteDatabase.CursorFactory) null, i);
            this.b = context;
            this.c = new bpn0(new c5o(this, 6));
        }

        public final void b(ArrayList arrayList) {
            wmi0 wmi0Var = wmi0.a;
            m().beginTransaction();
            try {
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        m().delete("SerializerDatabaseCache", "key=?", new String[]{(String) it.next()});
                    }
                    m().setTransactionSuccessful();
                } catch (Exception e) {
                    b bVar = wmi0.f;
                    if (bVar == null) {
                        bVar = null;
                    }
                    bVar.a(e);
                }
                m().endTransaction();
            } catch (Throwable th) {
                m().endTransaction();
                throw th;
            }
        }

        public final SQLiteDatabase m() {
            return (SQLiteDatabase) this.c.getValue();
        }

        public final ArrayList n(String str) {
            ArrayList arrayList;
            wmi0 wmi0Var = wmi0.a;
            Cursor query = m().query("SerializerDatabaseCache", new String[]{"compressed", "data"}, "key=?", new String[]{str}, null, null, "_id");
            b bVar = null;
            ArrayList arrayList2 = null;
            if (query == null) {
                return null;
            }
            try {
                try {
                } catch (Exception e) {
                    e = e;
                    arrayList = null;
                }
                if (query.moveToFirst()) {
                    arrayList = new ArrayList(query.getCount());
                    do {
                        try {
                            boolean z = query.getInt(0) == 1;
                            byte[] blob = query.getBlob(1);
                            if (z) {
                                q7y0 q7y0Var = wmi0.g;
                                if (q7y0Var == null) {
                                    q7y0Var = null;
                                }
                                blob = q7y0Var.b(blob);
                            }
                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                            Serializer.StreamParcelable a = Serializer.b.a(blob, Serializer.StreamParcelable.class.getClassLoader());
                            if (a != null) {
                                arrayList.add(a);
                            }
                        } catch (Exception e2) {
                            e = e2;
                            String arrays = Arrays.toString(query.getColumnNames());
                            b bVar2 = wmi0.f;
                            if (bVar2 != null) {
                                bVar = bVar2;
                            }
                            bVar.a(new IllegalStateException("Incorrect cursor key=" + str + " rowCount=" + query.getCount() + ", colCount=" + query.getColumnCount() + ", colls=" + arrays, e));
                            arrayList2 = arrayList;
                            s3q0 s3q0Var = s3q0.a;
                            query.close();
                            return arrayList2;
                        }
                    } while (query.moveToNext());
                    arrayList2 = arrayList;
                }
                s3q0 s3q0Var2 = s3q0.a;
                query.close();
                return arrayList2;
            } finally {
            }
        }

        public final <T extends Serializer.StreamParcelable> void o(String str, List<? extends T> list) {
            wmi0 wmi0Var = wmi0.a;
            m().beginTransaction();
            b bVar = null;
            try {
                try {
                    m().delete("SerializerDatabaseCache", "key=?", new String[]{str});
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            Serializer.StreamParcelable streamParcelable = (Serializer.StreamParcelable) it.next();
                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                            byte[] e = Serializer.b.e(streamParcelable);
                            int i = e.length > 128 ? 1 : 0;
                            if (i != 0) {
                                q7y0 q7y0Var = wmi0.g;
                                if (q7y0Var == null) {
                                    q7y0Var = null;
                                }
                                e = q7y0Var.a(e);
                            }
                            wmi0.d(e.length, str);
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("compressed", Integer.valueOf(i));
                            contentValues.put("key", str);
                            contentValues.put("data", e);
                            m().insert("SerializerDatabaseCache", null, contentValues);
                        }
                    }
                    m().setTransactionSuccessful();
                } catch (Exception e2) {
                    b bVar2 = wmi0.f;
                    if (bVar2 != null) {
                        bVar = bVar2;
                    }
                    bVar.a(e2);
                }
                m().endTransaction();
            } catch (Throwable th) {
                m().endTransaction();
                throw th;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE SerializerDatabaseCache (\n                        _id INTEGER PRIMARY KEY AUTOINCREMENT, \n                        key TEXT,\n                        data BLOB,\n                        compressed INTEGER NOT NULL DEFAULT 0\n                    )");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS SerializerDatabaseCache");
            onCreate(sQLiteDatabase);
            b bVar = wmi0.f;
            if (bVar == null) {
                bVar = null;
            }
            bVar.a(new SQLiteException(String.format(Locale.US, "Trying to downgrade db version from %d to %d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2))));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS SerializerDatabaseCache");
            onCreate(sQLiteDatabase);
        }
    }

    /* compiled from: SerializerCache.kt */
    public interface b {
        void a(Throwable th);
    }

    static {
        new Handler(Looper.getMainLooper());
        b = new ReentrantReadWriteLock();
        j = new InitializedLazyImpl(0L);
        k = new bpn0(new sq6(13));
    }

    public static final void d(int i2, String str) {
        if (i2 > 786432) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(iq.a(i2, "Size limit of 786432 exceeded for the key:", str, ". Size is ", ". Please use another serialization strategy to avoid db crashes!"));
            b bVar = f;
            if (bVar == null) {
                bVar = null;
            }
            bVar.a(illegalArgumentException);
        }
    }

    public static io.reactivex.rxjava3.core.w g() {
        return (io.reactivex.rxjava3.core.w) k.getValue();
    }

    public static void o(io.reactivex.rxjava3.internal.operators.single.f0 f0Var) {
        lnd lndVar = new lnd();
        b bVar = f;
        if (bVar == null) {
            bVar = null;
        }
        f0Var.subscribe(lndVar, new c2y(new ymi0(bVar), 27));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    public static String p(String str) {
        if (!i || ((Number) j.getValue()).longValue() == 0) {
            return str;
        }
        StringBuilder e2 = fw3.e(str);
        e2.append(BundleUtil.UNDERLINE_TAG + ((Number) j.getValue()).longValue());
        return e2.toString();
    }

    @Override // xsna.hov
    public final <T extends Serializer.StreamParcelable> void a(String str, T t) {
        String p = p(str);
        ConcurrentHashMap concurrentHashMap = e;
        if (concurrentHashMap == null) {
            concurrentHashMap = null;
        }
        concurrentHashMap.put(p, new SoftReference(t));
        io.reactivex.rxjava3.internal.operators.observable.l2 r0 = new io.reactivex.rxjava3.internal.operators.observable.s0(new tpa(2, t, p)).r0(g());
        xmb xmbVar = new xmb(2);
        b bVar = f;
        r0.subscribe(xmbVar, new amt(new xmi0(bVar != null ? bVar : null), 29));
    }

    @Override // xsna.hov
    public final io.reactivex.rxjava3.core.q b(String str, io.reactivex.rxjava3.core.w wVar) {
        return j(str, true, wVar);
    }

    @Override // xsna.hov
    public final void c(String... strArr) {
        List u0 = rl3.u0(strArr);
        ArrayList arrayList = new ArrayList(c5g.u(u0, 10));
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            arrayList.add(p((String) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = e;
        if (concurrentHashMap == null) {
            concurrentHashMap = null;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            concurrentHashMap.remove((String) it2.next());
        }
        o(new io.reactivex.rxjava3.internal.operators.single.v(new iq40(arrayList, 2)).q(g()));
    }

    public final <T extends Serializer.StreamParcelable> io.reactivex.rxjava3.core.q<List<T>> e(String str) {
        return f(str, io.reactivex.rxjava3.android.schedulers.a.b());
    }

    public final io.reactivex.rxjava3.core.q f(String str, io.reactivex.rxjava3.core.w wVar) {
        Object obj;
        final String p = p(str);
        ConcurrentHashMap concurrentHashMap = e;
        if (concurrentHashMap == null) {
            concurrentHashMap = null;
        }
        SoftReference softReference = (SoftReference) concurrentHashMap.get(p);
        return (softReference == null || (obj = softReference.get()) == null) ? new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.umi0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Collection collection;
                Object obj2;
                ConcurrentHashMap concurrentHashMap2 = wmi0.e;
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = null;
                }
                String str2 = p;
                SoftReference softReference2 = (SoftReference) concurrentHashMap2.get(str2);
                if (softReference2 == null || (obj2 = softReference2.get()) == null) {
                    ReentrantReadWriteLock.ReadLock readLock = wmi0.b.readLock();
                    readLock.lock();
                    try {
                        wmi0.a aVar = wmi0.d;
                        if (aVar == null) {
                            aVar = null;
                        }
                        ArrayList n = aVar.n(str2);
                        collection = n == null ? EmptyList.b : n;
                    } finally {
                        readLock.unlock();
                    }
                } else {
                    collection = (List) obj2;
                }
                if (!collection.isEmpty()) {
                    ConcurrentHashMap concurrentHashMap3 = wmi0.e;
                    (concurrentHashMap3 != null ? concurrentHashMap3 : null).put(str2, new SoftReference(collection));
                }
                return collection;
            }
        }).r0(g()).a0(wVar) : io.reactivex.rxjava3.core.q.T((List) obj).a0(wVar);
    }

    public final <T extends Serializer.StreamParcelable> io.reactivex.rxjava3.core.q<T> h(String str) {
        return j(str, true, io.reactivex.rxjava3.android.schedulers.a.b());
    }

    public final <T extends Serializer.StreamParcelable> io.reactivex.rxjava3.core.q<T> i(String str, boolean z) {
        return j(str, z, io.reactivex.rxjava3.android.schedulers.a.b());
    }

    public final io.reactivex.rxjava3.core.q j(String str, boolean z, io.reactivex.rxjava3.core.w wVar) {
        Object obj;
        final String p = p(str);
        ConcurrentHashMap concurrentHashMap = e;
        if (concurrentHashMap == null) {
            concurrentHashMap = null;
        }
        SoftReference softReference = (SoftReference) concurrentHashMap.get(p);
        if (softReference != null && (obj = softReference.get()) != null) {
            io.reactivex.rxjava3.internal.operators.observable.g1 T = io.reactivex.rxjava3.core.q.T((Serializer.StreamParcelable) obj);
            return wVar != null ? T.a0(wVar) : T;
        }
        io.reactivex.rxjava3.internal.operators.observable.l2 r0 = new io.reactivex.rxjava3.internal.operators.observable.q(new io.reactivex.rxjava3.core.s() { // from class: xsna.smi0
            @Override // io.reactivex.rxjava3.core.s
            public final void subscribe(io.reactivex.rxjava3.core.r rVar) {
                String str2 = p;
                try {
                    ReentrantReadWriteLock.ReadLock readLock = wmi0.b.readLock();
                    readLock.lock();
                    try {
                        wmi0.a aVar = wmi0.d;
                        if (aVar == null) {
                            aVar = null;
                        }
                        ArrayList n = aVar.n(str2);
                        Serializer.StreamParcelable streamParcelable = n != null ? (Serializer.StreamParcelable) n.get(0) : null;
                        readLock.unlock();
                        if (rVar.h()) {
                            return;
                        }
                        if (streamParcelable == null) {
                            rVar.onComplete();
                        } else {
                            rVar.onNext(streamParcelable);
                            rVar.onComplete();
                        }
                    } catch (Throwable th) {
                        readLock.unlock();
                        throw th;
                    }
                } catch (Exception unused) {
                    if (rVar.h()) {
                        return;
                    }
                    rVar.onComplete();
                }
            }
        }).r0(g());
        w1w w1wVar = new w1w(new tmi0(z, p), 1);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.observable.b0 E = r0.E(w1wVar, lVar, kVar, kVar);
        return wVar != null ? E.a0(wVar) : E;
    }

    public final <T extends Serializer.StreamParcelable> T k(String str) {
        ReentrantReadWriteLock.ReadLock readLock = b.readLock();
        readLock.lock();
        try {
            a aVar = d;
            if (aVar == null) {
                aVar = null;
            }
            ArrayList n = aVar.n(p(str));
            return n != null ? (T) j5g.b0(0, n) : null;
        } finally {
            readLock.unlock();
        }
    }

    public final io.reactivex.rxjava3.core.q l(String str, io.reactivex.rxjava3.core.w wVar) {
        Object obj;
        String p = p(str);
        ConcurrentHashMap concurrentHashMap = e;
        if (concurrentHashMap == null) {
            concurrentHashMap = null;
        }
        SoftReference softReference = (SoftReference) concurrentHashMap.get(p);
        if (softReference != null && (obj = softReference.get()) != null) {
            return io.reactivex.rxjava3.core.q.T(new hov.a((Serializer.StreamParcelable) obj)).a0(wVar);
        }
        io.reactivex.rxjava3.internal.operators.observable.l2 r0 = new io.reactivex.rxjava3.internal.operators.observable.q(new o58(p)).r0(g());
        int i2 = 2;
        q58 q58Var = new q58(new ob60(p, i2), i2);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return r0.E(q58Var, lVar, kVar, kVar).a0(wVar);
    }

    public final <T extends Serializer.StreamParcelable> void m(String str, List<? extends T> list) {
        String p = p(str);
        ArrayList arrayList = new ArrayList(list);
        ConcurrentHashMap concurrentHashMap = e;
        if (concurrentHashMap == null) {
            concurrentHashMap = null;
        }
        concurrentHashMap.put(p, new SoftReference(arrayList));
        o(new io.reactivex.rxjava3.internal.operators.single.v(new qsg0(1, p, arrayList)).q(g()));
    }

    public final <T extends Serializer.StreamParcelable> void n(String str, T t) {
        List<? extends T> singletonList = Collections.singletonList(t);
        ReentrantReadWriteLock reentrantReadWriteLock = b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i3 = 0; i3 < readHoldCount; i3++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            a aVar = d;
            if (aVar == null) {
                aVar = null;
            }
            aVar.o(p(str), singletonList);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            while (i2 < readHoldCount) {
                readLock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }
}
