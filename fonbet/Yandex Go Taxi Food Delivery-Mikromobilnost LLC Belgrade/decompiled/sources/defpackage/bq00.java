package defpackage;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes15.dex */
public final class bq00 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();

    public final void a(String str, String str2) {
        HashMap hashMap = this.c;
        Object obj = hashMap.get(str);
        if (obj == null) {
            obj = new LinkedHashSet();
            hashMap.put(str, obj);
        }
        ((Set) obj).add(str2);
    }

    public final void b(String str, String str2) {
        Set set = (Set) this.c.get(str);
        if (set != null) {
            set.remove(str2);
        }
    }

    public final nav c(String str) {
        return (nav) this.b.get(str);
    }

    public final jv00 d(String str) {
        return (jv00) this.a.get(str);
    }

    public final void e(jv00 jv00Var) {
        String str = jv00Var.a;
        this.a.put(str, jv00Var);
        String str2 = jv00Var.e;
        if (str2 != null) {
            a(str2, str);
        }
        String str3 = jv00Var.g;
        if (str3 != null) {
            a(str3, str);
        }
    }
}
