package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes10.dex */
public final class izz implements g63 {
    public final u1n a;
    public final hzz b;
    public final HashMap c;
    public final HashMap d;
    public final int e;
    public int f;

    public izz() {
        this.a = new u1n(27);
        this.b = new hzz(0);
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = SelfTester_JCP.ENCRYPT_CBC;
    }

    public final void a(int i, Class cls) {
        NavigableMap f = f(cls);
        Integer num = (Integer) f.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                f.remove(Integer.valueOf(i));
                return;
            } else {
                f.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public final void b(int i) {
        while (this.f > i) {
            Object o = this.a.o();
            z2a1.d(o);
            m43 d = d(o.getClass());
            this.f -= d.b() * d.a(o);
            a(d.a(o), o.getClass());
            if (Log.isLoggable(d.getTag(), 2)) {
                d.a(o);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b A[Catch: all -> 0x0046, TRY_ENTER, TryCatch #0 {all -> 0x0046, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0015, B:10:0x001c, B:16:0x002b, B:18:0x003b, B:19:0x003f, B:20:0x005e, B:25:0x0048, B:27:0x0054, B:28:0x0058), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0015, B:10:0x001c, B:16:0x002b, B:18:0x003b, B:19:0x003f, B:20:0x005e, B:25:0x0048, B:27:0x0054, B:28:0x0058), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Object c(int i, Class cls) {
        boolean z;
        gzz gzzVar;
        int i2;
        try {
            Integer num = (Integer) f(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i2 = this.f) != 0 && this.e / i2 < 2 && num.intValue() > i * 8)) {
                z = false;
                hzz hzzVar = this.b;
                if (z) {
                    c6e0 c6e0Var = (c6e0) ((ArrayDeque) hzzVar.b).poll();
                    if (c6e0Var == null) {
                        c6e0Var = hzzVar.Ug();
                    }
                    gzzVar = (gzz) c6e0Var;
                    gzzVar.b = i;
                    gzzVar.c = cls;
                } else {
                    int intValue = num.intValue();
                    c6e0 c6e0Var2 = (c6e0) ((ArrayDeque) hzzVar.b).poll();
                    if (c6e0Var2 == null) {
                        c6e0Var2 = hzzVar.Ug();
                    }
                    gzzVar = (gzz) c6e0Var2;
                    gzzVar.b = intValue;
                    gzzVar.c = cls;
                }
            }
            z = true;
            hzz hzzVar2 = this.b;
            if (z) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return e(gzzVar, cls);
    }

    public final m43 d(Class cls) {
        m43 e67Var;
        HashMap hashMap = this.d;
        m43 m43Var = (m43) hashMap.get(cls);
        if (m43Var != null) {
            return m43Var;
        }
        if (cls.equals(int[].class)) {
            e67Var = new q6w();
        } else {
            if (!cls.equals(byte[].class)) {
                ny61.g("No array pool found for: ".concat(cls.getSimpleName()));
                return null;
            }
            e67Var = new e67();
        }
        hashMap.put(cls, e67Var);
        return e67Var;
    }

    public final Object e(gzz gzzVar, Class cls) {
        m43 d = d(cls);
        Object f = this.a.f(gzzVar);
        if (f != null) {
            this.f -= d.b() * d.a(f);
            a(d.a(f), cls);
        }
        if (f != null) {
            return f;
        }
        Log.isLoggable(d.getTag(), 2);
        return d.newArray(gzzVar.b);
    }

    public final NavigableMap f(Class cls) {
        HashMap hashMap = this.c;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized void g(Object obj) {
        Class<?> cls = obj.getClass();
        m43 d = d(cls);
        int a = d.a(obj);
        int b = d.b() * a;
        if (b <= this.e / 2) {
            hzz hzzVar = this.b;
            c6e0 c6e0Var = (c6e0) ((ArrayDeque) hzzVar.b).poll();
            if (c6e0Var == null) {
                c6e0Var = hzzVar.Ug();
            }
            gzz gzzVar = (gzz) c6e0Var;
            gzzVar.b = a;
            gzzVar.c = cls;
            this.a.n(gzzVar, obj);
            NavigableMap f = f(cls);
            Integer num = (Integer) f.get(Integer.valueOf(gzzVar.b));
            Integer valueOf = Integer.valueOf(gzzVar.b);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            f.put(valueOf, Integer.valueOf(i));
            this.f += b;
            b(this.e);
        }
    }

    public izz(int i) {
        this.a = new u1n(27);
        this.b = new hzz(0);
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = i;
    }
}
