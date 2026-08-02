package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class ek00 implements bfx {
    public Object a;
    public boolean b;
    public final ArrayList c = new ArrayList();

    public static Object a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj2 != null) {
            if (obj instanceof List) {
                if (!(obj2 instanceof List)) {
                    xfo.m("Cannot merge ", obj, " with ", obj2);
                    return null;
                }
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list.size() != list2.size()) {
                    xfo.m("Cannot merge ", obj, " with ", obj2);
                    return null;
                }
                d6w e = scc.e((Collection) obj);
                ArrayList arrayList = new ArrayList(tcc.n(e, 10));
                c6w it = e.iterator();
                while (it.c) {
                    int nextInt = it.nextInt();
                    arrayList.add(a(list.get(nextInt), list2.get(nextInt)));
                }
                return arrayList;
            }
            if (obj instanceof Map) {
                if (!(obj2 instanceof Map)) {
                    xfo.m("Cannot merge ", obj, " with ", obj2);
                    return null;
                }
                Map map = (Map) obj;
                Map map2 = (Map) obj2;
                LinkedHashSet<String> h = v4r0.h(map.keySet(), map2.keySet());
                ArrayList arrayList2 = new ArrayList(tcc.n(h, 10));
                for (String str : h) {
                    arrayList2.add(new Pair(str, a(map.get(str), map2.get(str))));
                }
                return b.s(arrayList2);
            }
            if (!obj.equals(obj2)) {
                ak00.e("Cannot merge ", obj, " with ", obj2);
                return null;
            }
        }
        return obj;
    }

    @Override // defpackage.bfx
    public final bfx A1(String str) {
        dk00 dk00Var = (dk00) a.Z(this.c);
        if (!(dk00Var instanceof ck00)) {
            ny61.r("Check failed.");
            return null;
        }
        ck00 ck00Var = (ck00) dk00Var;
        if (ck00Var.b == null) {
            ck00Var.b = str;
            return this;
        }
        ny61.r("Check failed.");
        return null;
    }

    @Override // defpackage.bfx
    public final bfx X0(long j) {
        d(Long.valueOf(j));
        return this;
    }

    @Override // defpackage.bfx
    public final bfx Y0(int i) {
        d(Integer.valueOf(i));
        return this;
    }

    @Override // defpackage.bfx
    public final bfx Z0(double d) {
        d(Double.valueOf(d));
        return this;
    }

    public final Object c() {
        if (this.b) {
            return this.a;
        }
        ny61.r("Check failed.");
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void d(Object obj) {
        dk00 dk00Var = (dk00) a.b0(this.c);
        if (!(dk00Var instanceof ck00)) {
            if (dk00Var instanceof bk00) {
                ((bk00) dk00Var).a.add(obj);
                return;
            } else {
                this.a = obj;
                this.b = true;
                return;
            }
        }
        ck00 ck00Var = (ck00) dk00Var;
        LinkedHashMap linkedHashMap = ck00Var.a;
        String str = ck00Var.b;
        if (str == null) {
            ny61.r("Check failed.");
            return;
        }
        if (linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, a(linkedHashMap.get(str), obj));
        } else {
            linkedHashMap.put(str, obj);
        }
        ck00Var.b = null;
    }

    @Override // defpackage.bfx
    public final String getPath() {
        String str;
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dk00 dk00Var = (dk00) it.next();
            if (dk00Var instanceof bk00) {
                str = String.valueOf(((bk00) dk00Var).a.size());
            } else {
                if (!(dk00Var instanceof ck00)) {
                    w511.b();
                    return null;
                }
                str = ((ck00) dk00Var).b;
                if (str == null) {
                    str = "?";
                }
            }
            arrayList2.add(str);
        }
        return a.X(arrayList2, Extension.DOT_CHAR, null, null, null, 62);
    }

    @Override // defpackage.bfx
    public final bfx j() {
        dk00 dk00Var = (dk00) this.c.remove(r0.size() - 1);
        if (dk00Var instanceof bk00) {
            d(((bk00) dk00Var).a);
            return this;
        }
        ny61.r("Check failed.");
        return null;
    }

    @Override // defpackage.bfx
    public final bfx k2() {
        d(null);
        return this;
    }

    @Override // defpackage.bfx
    public final bfx l() {
        this.c.add(new bk00(new ArrayList()));
        return this;
    }

    @Override // defpackage.bfx
    public final bfx n1(boolean z) {
        d(Boolean.valueOf(z));
        return this;
    }

    @Override // defpackage.bfx
    public final bfx o0(hdx hdxVar) {
        d(hdxVar);
        return this;
    }

    @Override // defpackage.bfx
    public final bfx r0(String str) {
        d(str);
        return this;
    }

    @Override // defpackage.bfx
    public final bfx u() {
        this.c.add(new ck00(new LinkedHashMap()));
        return this;
    }

    @Override // defpackage.bfx
    public final bfx value() {
        d(null);
        return this;
    }

    @Override // defpackage.bfx
    public final bfx y() {
        dk00 dk00Var = (dk00) this.c.remove(r0.size() - 1);
        if (dk00Var instanceof ck00) {
            d(((ck00) dk00Var).a);
            return this;
        }
        ny61.r("Check failed.");
        return null;
    }
}
