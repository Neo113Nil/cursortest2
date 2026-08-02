package yads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class yg2 extends e {
    public final int f;
    public final int g;
    public final int[] h;
    public final int[] i;
    public final w73[] j;
    public final Object[] k;
    public final HashMap l;

    public yg2(List list, wz2 wz2Var) {
        super(wz2Var);
        int size = list.size();
        this.h = new int[size];
        this.i = new int[size];
        this.j = new w73[size];
        this.k = new Object[size];
        this.l = new HashMap();
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            eo1 eo1Var = (eo1) it.next();
            this.j[i3] = eo1Var.a();
            this.i[i3] = i;
            this.h[i3] = i2;
            i += this.j[i3].b();
            i2 += this.j[i3].a();
            this.k[i3] = eo1Var.getUid();
            this.l.put(this.k[i3], Integer.valueOf(i3));
            i3++;
        }
        this.f = i;
        this.g = i2;
    }

    @Override // yads.w73
    public final int a() {
        return this.g;
    }

    @Override // yads.w73
    public final int b() {
        return this.f;
    }
}
