package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class d4r {
    public b a;
    public a b;

    public static final class a {
        public long a;
        public long b;
        public boolean c;
    }

    public static final class b {
        public int a;
        public int b;
        public int c;
        public int d;
        public boolean e;
    }

    public final String[] a() {
        a aVar = this.b;
        if (aVar == null) {
            aVar = null;
        }
        Long valueOf = Long.valueOf(aVar.a);
        a aVar2 = this.b;
        Long[] lArr = {valueOf, Long.valueOf((aVar2 != null ? aVar2 : null).b)};
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            arrayList.add(String.valueOf(lArr[i].longValue()));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final String[] b() {
        b bVar = this.a;
        if (bVar == null) {
            bVar = null;
        }
        Integer valueOf = Integer.valueOf(bVar.a);
        b bVar2 = this.a;
        if (bVar2 == null) {
            bVar2 = null;
        }
        Integer valueOf2 = Integer.valueOf(bVar2.b);
        b bVar3 = this.a;
        if (bVar3 == null) {
            bVar3 = null;
        }
        Integer valueOf3 = Integer.valueOf(bVar3.c);
        b bVar4 = this.a;
        List d0 = j73.d0(new Integer[]{valueOf, valueOf2, valueOf3, Integer.valueOf((bVar4 != null ? bVar4 : null).d)});
        ArrayList arrayList = new ArrayList(tcc.n(d0, 10));
        Iterator it = d0.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
