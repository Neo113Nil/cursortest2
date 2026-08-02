package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public final class ge71 {
    public static final Object e = new Object();
    public final a441 a;
    public final boolean b;
    public final Executor c;
    public final i3y d;

    public ge71(a441 a441Var, i3y i3yVar, boolean z) {
        mp71 mp71Var;
        mp71 mp71Var2 = mp71.e;
        if (mp71Var2 == null) {
            synchronized (mp71.d) {
                mp71Var = mp71.e;
                if (mp71Var == null) {
                    mp71Var = new mp71();
                    mp71.e = mp71Var;
                }
            }
            mp71Var2 = mp71Var;
        }
        Executor a = mp71Var2.a();
        this.a = a441Var;
        this.b = z;
        this.c = a;
        this.d = i3yVar;
    }

    public static void a(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(hashMap.size()));
        for (Map.Entry entry : hashMap.entrySet()) {
            Object key = entry.getKey();
            Object[] objArr = {entry.getValue()};
            StringBuilder sb = new StringBuilder(7);
            d73.c(objArr, sb, new ArrayList());
            linkedHashMap.put(key, sb.toString());
        }
        linkedHashMap.toString();
    }

    public static void b(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), j73.d0((Object[]) entry.getValue()));
        }
        linkedHashMap.toString();
    }

    public final void c(zj71 zj71Var) {
        if (this.a != null) {
            this.c.execute(new bo31(28, this, zj71Var));
        }
    }

    public final void d(String str, Throwable th) {
        if (!this.b || this.a == null) {
            return;
        }
        this.c.execute(new nk61(4, (Object) this, (Object) th, str));
    }
}
