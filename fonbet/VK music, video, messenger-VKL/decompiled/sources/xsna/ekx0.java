package xsna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import xsna.rkk;

/* compiled from: WebvttSubtitle.java */
/* loaded from: classes12.dex */
public final class ekx0 implements m0n0 {
    public final List<xjx0> b;
    public final long[] c;
    public final long[] d;

    public ekx0(ArrayList arrayList) {
        this.b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.c = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            xjx0 xjx0Var = (xjx0) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = this.c;
            jArr[i2] = xjx0Var.b;
            jArr[i2 + 1] = xjx0Var.c;
        }
        long[] jArr2 = this.c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // xsna.m0n0
    public final List<rkk> getCues(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List<xjx0> list = this.b;
            if (i >= list.size()) {
                break;
            }
            int i2 = i * 2;
            long[] jArr = this.c;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                xjx0 xjx0Var = list.get(i);
                rkk rkkVar = xjx0Var.a;
                if (rkkVar.e == -3.4028235E38f) {
                    arrayList2.add(xjx0Var);
                } else {
                    arrayList.add(rkkVar);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new dkx0());
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            rkk.a a = ((xjx0) arrayList2.get(i3)).a.a();
            a.e = (-1) - i3;
            a.f = 1;
            arrayList.add(a.a());
        }
        return arrayList;
    }

    @Override // xsna.m0n0
    public final long getEventTime(int i) {
        fxc0.p(i >= 0);
        long[] jArr = this.d;
        fxc0.p(i < jArr.length);
        return jArr[i];
    }

    @Override // xsna.m0n0
    public final int getEventTimeCount() {
        return this.d.length;
    }

    @Override // xsna.m0n0
    public final int getNextEventTimeIndex(long j) {
        long[] jArr = this.d;
        int b = y2r0.b(jArr, j, false);
        if (b < jArr.length) {
            return b;
        }
        return -1;
    }
}
