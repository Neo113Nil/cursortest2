package com.yandex.div.core.state;

import defpackage.evu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.scc;
import defpackage.sls;
import defpackage.unr0;
import defpackage.ycc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class b {
    public final long a;
    public final List b;
    public final List c;
    public final boolean d;
    public final i3y e;
    public final i3y f;

    public b(long j, List list, List list2, boolean z) {
        this.a = j;
        this.b = list;
        this.c = list2;
        this.d = z;
        this.e = kotlin.a.a(new sls() { // from class: com.yandex.div.core.state.DivStatePath$fullPath$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return kotlin.collections.a.X(b.this.c, "/", null, null, null, 62);
            }
        });
        this.f = kotlin.a.a(new sls() { // from class: com.yandex.div.core.state.DivStatePath$statesString$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                boolean isEmpty = b.this.b.isEmpty();
                b bVar = b.this;
                if (isEmpty) {
                    return String.valueOf(bVar.a);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(bVar.a);
                sb.append('/');
                List<Pair> list3 = b.this.b;
                ArrayList arrayList = new ArrayList();
                for (Pair pair : list3) {
                    ycc.r(scc.g((String) pair.c(), (String) pair.f()), arrayList);
                }
                sb.append(kotlin.collections.a.X(arrayList, "/", null, null, null, 62));
                return sb.toString();
            }
        });
    }

    public final b a(String str) {
        List list = this.c;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(str);
        return new b(this.a, this.b, arrayList, 8);
    }

    public final String b() {
        return (String) this.e.getValue();
    }

    public final String c() {
        List list = this.b;
        if (list.isEmpty()) {
            return null;
        }
        return (String) ((Pair) kotlin.collections.a.Z(list)).f();
    }

    public final String d() {
        List list = this.b;
        if (list.isEmpty()) {
            return null;
        }
        return new b(this.a, list.subList(0, list.size() - 1), this.c, 8).e() + '/' + ((String) ((Pair) kotlin.collections.a.Z(list)).c());
    }

    public final String e() {
        return (String) this.f.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && jl40.l(this.b, bVar.b) && jl40.l(this.c, bVar.c) && this.d == bVar.d;
    }

    public final b f() {
        int i;
        int i2;
        int intValue;
        List list = this.b;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list);
            Pair pair = (Pair) arrayList.remove(scc.f(arrayList));
            List list2 = this.c;
            ListIterator listIterator = list2.listIterator(list2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i = -1;
                    break;
                }
                if (jl40.l((String) listIterator.previous(), (String) pair.c())) {
                    i = listIterator.nextIndex();
                    break;
                }
            }
            Integer valueOf = Integer.valueOf(i);
            if (i == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                intValue = valueOf.intValue();
            } else {
                ListIterator listIterator2 = list2.listIterator(list2.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        i2 = -1;
                        break;
                    }
                    String str = (String) listIterator2.previous();
                    if (evu0.h0('#', str, str).equals((String) pair.c())) {
                        i2 = listIterator2.nextIndex();
                        break;
                    }
                }
                Integer valueOf2 = Integer.valueOf(i2);
                if (i2 == -1) {
                    valueOf2 = null;
                }
                if (valueOf2 != null) {
                    intValue = valueOf2.intValue();
                } else {
                    String str2 = (String) kotlin.collections.a.P(list2);
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.a);
                    sb.append(':');
                    Integer num = evu0.Q(sb.toString(), str2).equals((String) pair.c()) ? 0 : null;
                    if (num != null) {
                        intValue = num.intValue();
                    }
                }
            }
            return new b(this.a, arrayList, list2.subList(0, intValue + 1), this.d);
        }
        return this;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.c(unr0.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return b();
    }

    public b(long j, List list, List list2, int i) {
        this(j, list, (i & 4) != 0 ? Collections.singletonList(String.valueOf(j)) : list2, false);
    }
}
