package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class k43 implements v53 {
    public final List b;
    public final List c;

    public k43(ArrayList arrayList, ArrayList arrayList2) {
        this.b = arrayList;
        this.c = arrayList2;
    }

    @Override // yads.v53
    public final long a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i < this.c.size()) {
            return ((Long) this.c.get(i)).longValue();
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.v53
    public final List b(long j) {
        int a = mc3.a(this.c, Long.valueOf(j), false);
        return a == -1 ? Collections.EMPTY_LIST : (List) this.b.get(a);
    }

    @Override // yads.v53
    public final int a() {
        return this.c.size();
    }

    @Override // yads.v53
    public final int a(long j) {
        int i;
        List list = this.c;
        Long valueOf = Long.valueOf(j);
        int i2 = mc3.a;
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            i = ~binarySearch;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (((Comparable) list.get(binarySearch)).compareTo(valueOf) == 0);
            i = binarySearch;
        }
        if (i < this.c.size()) {
            return i;
        }
        return -1;
    }
}
