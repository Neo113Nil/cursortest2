package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.collections.a;
import kotlin.collections.b;

/* loaded from: classes.dex */
public abstract class cy4 implements v66 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public View d;

    public static a76 f(int i, Map map) {
        if (map.size() == 1) {
            return (a76) a.O(map.values());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(((z66) it.next()).b());
        }
        return new z66(i, linkedHashSet);
    }

    public static String g(Map map) {
        return a.X(map.keySet(), null, null, null, null, 63);
    }

    @Override // defpackage.v66
    public void b(View view) {
        if (jl40.l(view, this.d)) {
            return;
        }
        detach();
        this.d = view;
        e(this.c, view);
    }

    @Override // defpackage.v66
    public final void d(tls tlsVar, String str) {
        LinkedHashMap linkedHashMap = this.a;
        a76 a76Var = (a76) linkedHashMap.get(str);
        Integer valueOf = a76Var != null ? Integer.valueOf(a76Var.a()) : null;
        a76 a76Var2 = (a76) tlsVar.invoke(a76Var);
        if (jl40.l(a76Var2, a76Var)) {
            return;
        }
        boolean z = a76Var2 instanceof z66;
        LinkedHashMap linkedHashMap2 = this.c;
        if (z) {
            linkedHashMap.put(str, a76Var2);
            linkedHashMap2.remove(str);
            z66 z66Var = (z66) a76Var2;
            int a = z66Var.a();
            if (valueOf == null || a != valueOf.intValue()) {
                h(valueOf, str);
            }
            Integer valueOf2 = Integer.valueOf(z66Var.a());
            LinkedHashMap linkedHashMap3 = this.b;
            Object obj = linkedHashMap3.get(valueOf2);
            if (obj == null) {
                obj = new LinkedHashMap();
                linkedHashMap3.put(valueOf2, obj);
            }
            Map map = (Map) obj;
            if (!map.isEmpty() && !map.containsKey(str)) {
                linkedHashMap2.remove(g(map));
            }
            map.put(str, z66Var);
            linkedHashMap2.put(g(map), f(z66Var.a(), map));
        } else if (a76Var2 instanceof y66) {
            linkedHashMap.put(str, a76Var2);
            h(valueOf, str);
            linkedHashMap2.put(str, a76Var2);
        } else if (a76Var2 != null) {
            w511.b();
            return;
        } else {
            linkedHashMap.remove(str);
            h(valueOf, str);
            linkedHashMap2.remove(str);
        }
        View view = this.d;
        if (view != null) {
            e(linkedHashMap2, view);
        }
    }

    @Override // defpackage.v66
    public final void detach() {
        View view = this.d;
        this.d = null;
        if (view != null) {
            e(b.f(), view);
        }
    }

    public abstract void e(Map map, View view);

    public final void h(Integer num, String str) {
        if (num == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.b;
        Map map = (Map) linkedHashMap.get(num);
        if (map != null && map.containsKey(str)) {
            String g = g(map);
            LinkedHashMap linkedHashMap2 = this.c;
            linkedHashMap2.remove(g);
            map.remove(str);
            if (map.isEmpty()) {
                linkedHashMap.remove(num);
            } else {
                linkedHashMap2.put(g(map), f(num.intValue(), map));
            }
        }
    }
}
