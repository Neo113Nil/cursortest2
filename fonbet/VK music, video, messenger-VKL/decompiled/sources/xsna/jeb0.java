package xsna;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PlaylistTimeline.java */
/* loaded from: classes12.dex */
public final class jeb0 extends ud {
    public final int e;
    public final int f;
    public final int[] g;
    public final int[] h;
    public final ewo0[] i;
    public final Object[] j;
    public final HashMap<Object, Integer> k;

    public jeb0(ewo0[] ewo0VarArr, Object[] objArr, androidx.media3.exoplayer.source.r rVar) {
        super(rVar);
        int length = ewo0VarArr.length;
        this.i = ewo0VarArr;
        this.g = new int[length];
        this.h = new int[length];
        this.j = objArr;
        this.k = new HashMap<>();
        int length2 = ewo0VarArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length2) {
            ewo0 ewo0Var = ewo0VarArr[i];
            this.i[i4] = ewo0Var;
            this.h[i4] = i2;
            this.g[i4] = i3;
            i2 += ewo0Var.o();
            i3 += this.i[i4].h();
            this.k.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.e = i2;
        this.f = i3;
    }

    @Override // xsna.ewo0
    public final int h() {
        return this.f;
    }

    @Override // xsna.ewo0
    public final int o() {
        return this.e;
    }

    @Override // xsna.ud
    public final int q(Object obj) {
        Integer num = this.k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // xsna.ud
    public final int r(int i) {
        return y2r0.e(this.g, i + 1, false, false);
    }

    @Override // xsna.ud
    public final int s(int i) {
        return y2r0.e(this.h, i + 1, false, false);
    }

    @Override // xsna.ud
    public final Object t(int i) {
        return this.j[i];
    }

    @Override // xsna.ud
    public final int u(int i) {
        return this.g[i];
    }

    @Override // xsna.ud
    public final int v(int i) {
        return this.h[i];
    }

    @Override // xsna.ud
    public final ewo0 x(int i) {
        return this.i[i];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jeb0(ArrayList arrayList, androidx.media3.exoplayer.source.r rVar) {
        this(r0, r1, rVar);
        ewo0[] ewo0VarArr = new ewo0[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            ewo0VarArr[i2] = ((ty10) it.next()).a();
            i2++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((ty10) it2.next()).getUid();
            i++;
        }
    }
}
