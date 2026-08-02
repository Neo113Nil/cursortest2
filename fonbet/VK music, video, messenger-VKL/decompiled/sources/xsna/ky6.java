package xsna;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ky6;

/* compiled from: BgApplyPreferences.kt */
/* loaded from: classes.dex */
public final class ky6 implements SharedPreferences {
    public static final /* synthetic */ qcy<Object>[] k;
    public static final AtomicInteger l;
    public final gzs<SharedPreferences> a;
    public final Lock b;
    public final gzs<ExecutorService> c;
    public boolean e;
    public b g;
    public final ReentrantReadWriteLock d = new ReentrantReadWriteLock();
    public final LinkedHashMap f = new LinkedHashMap();
    public final eyc0 h = new eyc0(new hy6(this, 0), new iy6(this, 0));
    public final LinkedHashSet i = new LinkedHashSet();
    public final ly6 j = new ly6(this);

    /* compiled from: BgApplyPreferences.kt */
    public static final class a implements SharedPreferences.Editor {
        public final SharedPreferences.Editor a;
        public final Lock b;
        public final InterfaceC3212a c;
        public final gzs<ExecutorService> d;
        public boolean e;
        public final LinkedHashMap f = new LinkedHashMap();

        /* compiled from: BgApplyPreferences.kt */
        /* renamed from: xsna.ky6$a$a, reason: collision with other inner class name */
        public interface InterfaceC3212a {
            void a(d dVar);

            void b(d dVar);
        }

        public a(SharedPreferences.Editor editor, Lock lock, ly6 ly6Var, gzs gzsVar) {
            this.a = editor;
            this.b = lock;
            this.c = ly6Var;
            this.d = gzsVar;
        }

        public final synchronized Future<?> a() {
            Map hashMap;
            final d dVar;
            try {
                int incrementAndGet = ky6.l.incrementAndGet();
                boolean z = this.e;
                if (this.f.size() == 1) {
                    Map.Entry entry = (Map.Entry) j5g.X(this.f.entrySet());
                    hashMap = Collections.singletonMap(entry.getKey(), entry.getValue());
                } else {
                    hashMap = new HashMap(this.f);
                }
                dVar = new d(incrementAndGet, hashMap, z);
                this.e = false;
                this.f.clear();
                this.c.b(dVar);
            } catch (Throwable th) {
                throw th;
            }
            return this.d.invoke().submit(new Runnable() { // from class: xsna.jy6
                @Override // java.lang.Runnable
                public final void run() {
                    ky6.a aVar = ky6.a.this;
                    ky6.a.InterfaceC3212a interfaceC3212a = aVar.c;
                    Lock lock = aVar.b;
                    ky6.d dVar2 = dVar;
                    try {
                        lock.lock();
                        aVar.a.commit();
                    } finally {
                        interfaceC3212a.a(dVar2);
                        lock.unlock();
                    }
                }
            });
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            a();
        }

        @Override // android.content.SharedPreferences.Editor
        public final synchronized SharedPreferences.Editor clear() {
            this.a.clear();
            this.e = true;
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            try {
                a().get();
                return true;
            } catch (Throwable th) {
                if (!(th instanceof InterruptedException)) {
                    return false;
                }
                Thread.currentThread().interrupt();
                return false;
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final synchronized SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.f.put(str, new c.b(Boolean.valueOf(z)));
            this.a.putBoolean(str, z);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final synchronized SharedPreferences.Editor putFloat(String str, float f) {
            this.f.put(str, new c.b(Float.valueOf(f)));
            this.a.putFloat(str, f);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final synchronized SharedPreferences.Editor putInt(String str, int i) {
            this.f.put(str, new c.b(Integer.valueOf(i)));
            this.a.putInt(str, i);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final synchronized SharedPreferences.Editor putLong(String str, long j) {
            this.f.put(str, new c.b(Long.valueOf(j)));
            this.a.putLong(str, j);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final synchronized SharedPreferences.Editor putString(String str, String str2) {
            this.f.put(str, new c.b(str2));
            this.a.putString(str, str2);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final synchronized SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            this.f.put(str, new c.b(set));
            this.a.putStringSet(str, set);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final synchronized SharedPreferences.Editor remove(String str) {
            try {
                LinkedHashMap linkedHashMap = this.f;
                if (linkedHashMap.get(str) == null) {
                    linkedHashMap.put(str, c.C3213c.a);
                }
                this.a.remove(str);
            } catch (Throwable th) {
                throw th;
            }
            return this;
        }
    }

    /* compiled from: BgApplyPreferences.kt */
    public static final class b {
        public final int a;
        public final c b;

        public b(int i, c cVar) {
            this.a = i;
            this.b = cVar;
        }
    }

    /* compiled from: BgApplyPreferences.kt */
    public static abstract class c {

        /* compiled from: BgApplyPreferences.kt */
        public static final class a extends c {
            public static final a a = new a();
        }

        /* compiled from: BgApplyPreferences.kt */
        public static final class b extends c {
            public final Object a;

            public b(Object obj) {
                this.a = obj;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                Object obj = this.a;
                if (obj == null) {
                    return 0;
                }
                return obj.hashCode();
            }

            public final String toString() {
                return k73.c(new StringBuilder("PutOp(value="), this.a, ')');
            }
        }

        /* compiled from: BgApplyPreferences.kt */
        /* renamed from: xsna.ky6$c$c, reason: collision with other inner class name */
        public static final class C3213c extends c {
            public static final C3213c a = new C3213c();
        }
    }

    /* compiled from: BgApplyPreferences.kt */
    public static final class d {
        public final int a;
        public final Map<String, c> b;
        public final boolean c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(int i, Map<String, ? extends c> map, boolean z) {
            this.a = i;
            this.b = map;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && epx.f(this.b, dVar.b) && this.c == dVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + v11.a(Integer.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PendingOperationsView(id=");
            sb.append(this.a);
            sb.append(", pendingOperations=");
            sb.append(this.b);
            sb.append(", cleared=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ky6.class, "delegated", "getDelegated()Landroid/content/SharedPreferences;", 0);
        fpf0.a.getClass();
        k = new qcy[]{propertyReference1Impl};
        l = new AtomicInteger();
    }

    public ky6(gzs gzsVar, ReentrantLock reentrantLock, gzs gzsVar2) {
        this.a = gzsVar;
        this.b = reentrantLock;
        this.c = gzsVar2;
    }

    public final SharedPreferences a() {
        qcy<Object> qcyVar = k[0];
        eyc0 eyc0Var = this.h;
        SharedPreferences sharedPreferences = (SharedPreferences) eyc0Var.b.invoke();
        SharedPreferences sharedPreferences2 = eyc0Var.d;
        if (sharedPreferences2 != sharedPreferences) {
            eyc0Var.d = sharedPreferences;
            eyc0Var.c.invoke(sharedPreferences2, sharedPreferences);
        }
        return eyc0Var.d;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        ReentrantReadWriteLock.ReadLock readLock = this.d.readLock();
        readLock.lock();
        try {
            boolean contains = a().contains(str);
            if (this.e) {
                if (this.g != null) {
                    contains = false;
                }
                b bVar = (b) this.f.get(str);
                if (bVar != null) {
                    c cVar = bVar.b;
                    if (!(cVar instanceof c.C3213c)) {
                        if (cVar instanceof c.b) {
                            if (((c.b) cVar).a != null) {
                                contains = true;
                            }
                        }
                    }
                    contains = false;
                }
            }
            return contains;
        } finally {
            readLock.unlock();
        }
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new a(a().edit(), this.b, this.j, this.c);
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        ReentrantReadWriteLock.ReadLock readLock = this.d.readLock();
        readLock.lock();
        try {
            HashMap hashMap = new HashMap(a().getAll());
            if (this.e) {
                if (this.g != null) {
                    hashMap.clear();
                }
                for (Map.Entry entry : this.f.entrySet()) {
                    String str = (String) entry.getKey();
                    c cVar = ((b) entry.getValue()).b;
                    if (cVar instanceof c.C3213c) {
                        hashMap.remove(str);
                    } else if (cVar instanceof c.b) {
                        hashMap.put(str, ((c.b) cVar).a);
                    }
                }
            }
            readLock.unlock();
            return hashMap;
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        ReentrantReadWriteLock.ReadLock readLock = this.d.readLock();
        readLock.lock();
        try {
            Boolean valueOf2 = Boolean.valueOf(a().getBoolean(str, z));
            if (this.e) {
                if (this.g != null) {
                    valueOf2 = valueOf;
                }
                b bVar = (b) this.f.get(str);
                if (bVar != null) {
                    c cVar = bVar.b;
                    if (!(cVar instanceof c.C3213c)) {
                        if (cVar instanceof c.b) {
                            Object obj = ((c.b) cVar).a;
                            if (!(obj instanceof Boolean)) {
                                obj = null;
                            }
                            Boolean bool = (Boolean) obj;
                            if (bool != null) {
                                valueOf = bool;
                            }
                        }
                    }
                    readLock.unlock();
                    return valueOf.booleanValue();
                }
            }
            valueOf = valueOf2;
            readLock.unlock();
            return valueOf.booleanValue();
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Float valueOf = Float.valueOf(f);
        ReentrantReadWriteLock.ReadLock readLock = this.d.readLock();
        readLock.lock();
        try {
            Float valueOf2 = Float.valueOf(a().getFloat(str, f));
            if (this.e) {
                if (this.g != null) {
                    valueOf2 = valueOf;
                }
                b bVar = (b) this.f.get(str);
                if (bVar != null) {
                    c cVar = bVar.b;
                    if (!(cVar instanceof c.C3213c)) {
                        if (cVar instanceof c.b) {
                            Object obj = ((c.b) cVar).a;
                            if (!(obj instanceof Float)) {
                                obj = null;
                            }
                            Float f2 = (Float) obj;
                            if (f2 != null) {
                                valueOf = f2;
                            }
                        }
                    }
                    readLock.unlock();
                    return valueOf.floatValue();
                }
            }
            valueOf = valueOf2;
            readLock.unlock();
            return valueOf.floatValue();
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Integer valueOf = Integer.valueOf(i);
        ReentrantReadWriteLock.ReadLock readLock = this.d.readLock();
        readLock.lock();
        try {
            Integer valueOf2 = Integer.valueOf(a().getInt(str, i));
            if (this.e) {
                if (this.g != null) {
                    valueOf2 = valueOf;
                }
                b bVar = (b) this.f.get(str);
                if (bVar != null) {
                    c cVar = bVar.b;
                    if (!(cVar instanceof c.C3213c)) {
                        if (cVar instanceof c.b) {
                            Object obj = ((c.b) cVar).a;
                            if (!(obj instanceof Integer)) {
                                obj = null;
                            }
                            Integer num = (Integer) obj;
                            if (num != null) {
                                valueOf = num;
                            }
                        }
                    }
                    readLock.unlock();
                    return valueOf.intValue();
                }
            }
            valueOf = valueOf2;
            readLock.unlock();
            return valueOf.intValue();
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Long valueOf = Long.valueOf(j);
        ReentrantReadWriteLock.ReadLock readLock = this.d.readLock();
        readLock.lock();
        try {
            Long valueOf2 = Long.valueOf(a().getLong(str, j));
            if (this.e) {
                if (this.g != null) {
                    valueOf2 = valueOf;
                }
                b bVar = (b) this.f.get(str);
                if (bVar != null) {
                    c cVar = bVar.b;
                    if (!(cVar instanceof c.C3213c)) {
                        if (cVar instanceof c.b) {
                            Object obj = ((c.b) cVar).a;
                            if (!(obj instanceof Long)) {
                                obj = null;
                            }
                            Long l2 = (Long) obj;
                            if (l2 != null) {
                                valueOf = l2;
                            }
                        }
                    }
                    readLock.unlock();
                    return valueOf.longValue();
                }
            }
            valueOf = valueOf2;
            readLock.unlock();
            return valueOf.longValue();
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        ReentrantReadWriteLock.ReadLock readLock = this.d.readLock();
        readLock.lock();
        try {
            String string = a().getString(str, str2);
            if (this.e) {
                if (this.g != null) {
                    string = str2;
                }
                b bVar = (b) this.f.get(str);
                if (bVar != null) {
                    c cVar = bVar.b;
                    if (!(cVar instanceof c.C3213c)) {
                        if (cVar instanceof c.b) {
                            Object obj = ((c.b) cVar).a;
                            if (!(obj instanceof String)) {
                                obj = null;
                            }
                            String str3 = (String) obj;
                            if (str3 != null) {
                                str2 = str3;
                            }
                        }
                    }
                    return str2;
                }
            }
            str2 = string;
            return str2;
        } finally {
            readLock.unlock();
        }
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
        ReentrantReadWriteLock.ReadLock readLock = this.d.readLock();
        readLock.lock();
        try {
            Set<String> stringSet = a().getStringSet(str, set);
            if (this.e) {
                if (this.g != null) {
                    stringSet = set;
                }
                b bVar = (b) this.f.get(str);
                if (bVar != null) {
                    c cVar = bVar.b;
                    if (!(cVar instanceof c.C3213c)) {
                        if (cVar instanceof c.b) {
                            Object obj = ((c.b) cVar).a;
                            if (!(obj instanceof Set)) {
                                obj = null;
                            }
                            Set<String> set2 = (Set) obj;
                            if (set2 != null) {
                                set = set2;
                            }
                        }
                    }
                    return set;
                }
            }
            set = stringSet;
            return set;
        } finally {
            readLock.unlock();
        }
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.d) {
            this.i.add(onSharedPreferenceChangeListener);
            a().registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.d) {
            this.i.remove(onSharedPreferenceChangeListener);
            a().unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
