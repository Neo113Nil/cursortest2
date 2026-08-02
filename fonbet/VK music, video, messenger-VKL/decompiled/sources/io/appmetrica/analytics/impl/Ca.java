package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class Ca extends O2 {
    public final Fa b;

    public Ca(int i) {
        this(i, null);
    }

    public int b(@Nullable Object obj) {
        return 0;
    }

    public Ca(int i, @Nullable Fa fa) {
        super(i);
        this.b = fa;
    }

    @Override // io.appmetrica.analytics.impl.O2, io.appmetrica.analytics.impl.Fa
    @NonNull
    public final Wn a(@Nullable List<Object> list) {
        int i;
        int i2 = 0;
        if (list == null || (list.size() <= this.a && this.b == null)) {
            i = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            i = 0;
            int i3 = 0;
            for (Object obj : list) {
                if (i3 < this.a) {
                    Fa fa = this.b;
                    if (fa != null) {
                        Wn a = fa.a(obj);
                        Object obj2 = a.a;
                        i += a.b.getBytesTruncated();
                        vo.a(obj, a.a);
                        obj = obj2;
                    }
                    arrayList.add(obj);
                } else {
                    i2++;
                    i += b(obj);
                }
                i3++;
            }
            list = arrayList;
        }
        return new Wn(list, new C5336z4(i2, i));
    }

    @Nullable
    public final Fa b() {
        return this.b;
    }
}
