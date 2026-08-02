package xsna;

import java.util.List;

/* compiled from: LazyGridMeasuredLine.kt */
/* loaded from: classes11.dex */
public final class ory {
    public final int a;
    public final nry[] b;
    public final ury c;
    public final List<tfu> d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;

    public ory(int i, nry[] nryVarArr, ury uryVar, List<tfu> list, boolean z, int i2) {
        this.a = i;
        this.b = nryVarArr;
        this.c = uryVar;
        this.d = list;
        this.e = z;
        this.f = i2;
        int i3 = 0;
        for (nry nryVar : nryVarArr) {
            i3 = Math.max(i3, nryVar.o);
        }
        this.g = i3;
        int i4 = i3 + this.f;
        this.h = i4 >= 0 ? i4 : 0;
    }

    public final nry[] a(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        nry[] nryVarArr = this.b;
        int length = nryVarArr.length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < length) {
            nry nryVar = nryVarArr[i8];
            int i11 = i9 + 1;
            int i12 = (int) this.d.get(i9).a;
            int i13 = this.c.b[i10];
            int i14 = this.a;
            boolean z = this.e;
            int i15 = z ? i14 : i10;
            if (z) {
                i4 = i10;
                i7 = i;
                i5 = i2;
                i6 = i3;
            } else {
                i4 = i14;
                i5 = i2;
                i6 = i3;
                i7 = i;
            }
            nryVar.r(i7, i13, i5, i6, i15, i4);
            s3q0 s3q0Var = s3q0.a;
            i10 += i12;
            i8++;
            i9 = i11;
        }
        return nryVarArr;
    }
}
