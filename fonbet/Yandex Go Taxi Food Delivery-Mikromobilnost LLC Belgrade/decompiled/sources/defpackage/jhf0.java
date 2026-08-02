package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class jhf0 {
    public final a a = new a();
    public final a b = new a();
    public final w53 c = new w53();

    public static final class a {
        public long a;
        public int b;
    }

    public final void a() {
        a aVar = this.a;
        aVar.a = 0L;
        aVar.b = 0;
        a aVar2 = this.b;
        aVar2.a = 0L;
        aVar2.b = 0;
        Iterator it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            a aVar3 = (a) ((Map.Entry) it.next()).getValue();
            aVar3.a = 0L;
            aVar3.b = 0;
        }
    }

    public final void b() {
        HashMap hashMap = new HashMap();
        a aVar = this.a;
        hashMap.put("view obtaining - total count", Integer.valueOf(aVar.b));
        hashMap.put("view obtaining - total time (µs)", Long.valueOf(m7a1.d(aVar.a / 1000)));
        Iterator it = this.c.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            a aVar2 = (a) entry.getValue();
            if (aVar2.b > 0) {
                hashMap.put(oyr.p("blocking view obtaining for ", str, " - count"), Integer.valueOf(aVar2.b));
                String str2 = "blocking view obtaining for " + str + " - avg time (µs)";
                int i = aVar2.b;
                hashMap.put(str2, Long.valueOf(m7a1.d((i != 0 ? aVar2.a / i : 0L) / 1000)));
            }
        }
        a aVar3 = this.b;
        int i2 = aVar3.b;
        if (i2 > 0) {
            hashMap.put("long view requests - count", Integer.valueOf(i2));
            int i3 = aVar3.b;
            hashMap.put("long view requests - avg time (µs)", Long.valueOf(m7a1.d((i3 != 0 ? aVar3.a / i3 : 0L) / 1000)));
        }
    }

    public final void c(long j, String str) {
        a aVar = this.a;
        aVar.a += j;
        aVar.b++;
        w53 w53Var = this.c;
        Object obj = w53Var.get(str);
        if (obj == null) {
            obj = new a();
            w53Var.put(str, obj);
        }
        a aVar2 = (a) obj;
        aVar2.a += j;
        aVar2.b++;
    }

    public final void d(long j) {
        a aVar = this.a;
        aVar.a += j;
        aVar.b++;
    }

    public final void e(long j) {
        this.a.a += j;
        if (j >= 1000000) {
            a aVar = this.b;
            aVar.a += j;
            aVar.b++;
        }
    }
}
