package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.j5g;
import xsna.jgp;
import xsna.s5a;

/* loaded from: classes10.dex */
public final class xe3 {
    public final boolean a;
    public final oh3 b;
    public mq3 c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public sm3 i;
    public Integer j;
    public String k;
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();
    public final LinkedHashMap n = new LinkedHashMap();
    public hf3 o = new hf3();

    public xe3(boolean z, oh3 oh3Var) {
        this.a = z;
        this.b = oh3Var;
    }

    public final xe3 a(Map map) {
        if (map == null) {
            map = jgp.b;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Iterable iterable = (List) entry.getValue();
            if (iterable == null) {
                iterable = EmptyList.b;
            }
            Iterator it = ((ArrayList) j5g.V(iterable)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                LinkedHashMap linkedHashMap = this.n;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = s5a.a(str, linkedHashMap);
                }
                ((List) obj).add(str2);
            }
        }
        return this;
    }

    public final ye3 a() {
        LinkedHashMap linkedHashMap;
        oh3 oh3Var = this.b;
        LinkedHashMap linkedHashMap2 = this.n;
        sm3 sm3Var = this.i;
        oh3Var.getClass();
        qu2 a = gx2.a().a(oh3Var.a);
        if (a == null || !a.l) {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
            List list = sm3Var != null ? sm3Var.a : null;
            List list2 = (List) linkedHashMap3.get("impression");
            if (list != null) {
                linkedHashMap3.put("impression", list);
            } else {
                linkedHashMap3.remove("impression");
            }
            if (list2 != null) {
                linkedHashMap3.put("render_impression", list2);
            } else {
                linkedHashMap3.remove("render_impression");
            }
            linkedHashMap = linkedHashMap3;
        } else {
            linkedHashMap = linkedHashMap2;
        }
        return new ye3(this.a, this.l, this.n, this.o, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.c, this.m, linkedHashMap);
    }
}
