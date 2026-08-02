package xsna;

import java.util.Arrays;
import java.util.List;

/* compiled from: DiscoverMediaBlockHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class t2n extends ol60 {
    public final List<ol60> h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int[] l;
    public final int[] m;
    public final int[] n;
    public final int[] o;
    public final int p;

    public t2n(List list, boolean z, int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i3) {
        super(233, 0, 0, 0, null);
        this.h = list;
        this.i = z;
        this.j = i;
        this.k = i2;
        this.l = iArr;
        this.m = iArr2;
        this.n = iArr3;
        this.o = iArr4;
        this.p = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t2n.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        t2n t2nVar = (t2n) obj;
        if (this.i == t2nVar.i && this.j == t2nVar.j && this.k == t2nVar.k && this.p == t2nVar.p && Arrays.equals(this.l, t2nVar.l) && Arrays.equals(this.m, t2nVar.m) && Arrays.equals(this.n, t2nVar.n) && Arrays.equals(this.o, t2nVar.o)) {
            return epx.f(this.h, t2nVar.h);
        }
        return false;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.o) + dq.d(dq.d(dq.d((((((fw3.a(Boolean.hashCode(this.i) * 31, 31, this.h) + this.j) * 31) + this.k) * 31) + this.p) * 961, 31, this.l), 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverMediaBlockHolderUiDto(uiDtos=");
        sb.append(this.h);
        sb.append(", withBackground=");
        sb.append(this.i);
        sb.append(", rows=");
        sb.append(this.j);
        sb.append(", columns=");
        sb.append(this.k);
        sb.append(", itemRowAt=");
        mq.f(this.l, sb, ", itemColumnAt=");
        mq.f(this.m, sb, ", itemUsedRows=");
        mq.f(this.n, sb, ", itemUsedColumns=");
        mq.f(this.o, sb, ", autoPlayPosition=");
        return h5s.c(this.p, ", seqId=0)", sb);
    }
}
