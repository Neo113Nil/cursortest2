package xsna;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Period.java */
/* loaded from: classes12.dex */
public final class jx90 {

    @Nullable
    public final String a;
    public final long b;
    public final List<cj0> c;
    public final List<r0q> d;

    public jx90() {
        throw null;
    }

    public jx90(@Nullable String str, long j, ArrayList arrayList, List list) {
        this.a = str;
        this.b = j;
        this.c = Collections.unmodifiableList(arrayList);
        this.d = Collections.unmodifiableList(list);
    }

    public final int a(int i) {
        List<cj0> list = this.c;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).b == i) {
                return i2;
            }
        }
        return -1;
    }
}
