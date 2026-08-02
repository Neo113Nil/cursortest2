package xsna;

import java.util.List;

/* compiled from: LazyStaggeredGridMeasure.kt */
/* loaded from: classes11.dex */
public abstract class kxy extends z46 {
    public final boolean d;
    public final uwy e;
    public final qty f;
    public final sxy g;

    public kxy(boolean z, uwy uwyVar, qty qtyVar, sxy sxyVar) {
        super(3);
        this.d = z;
        this.e = uwyVar;
        this.f = qtyVar;
        this.g = sxyVar;
    }

    public final nxy L0(int i, long j) {
        int i2;
        long h;
        uwy uwyVar = this.e;
        Object h2 = uwyVar.h(i);
        Object g = uwyVar.g(i);
        sxy sxyVar = this.g;
        int[] iArr = (int[]) sxyVar.b;
        int length = iArr.length;
        int i3 = (int) (j >> 32);
        int i4 = length - 1;
        if (i3 <= i4) {
            i4 = i3;
        }
        int i5 = ((int) (j & 4294967295L)) - i3;
        int i6 = length - i4;
        if (i5 > i6) {
            i5 = i6;
        }
        if (i5 == 1) {
            i2 = iArr[i4];
        } else {
            int[] iArr2 = (int[]) sxyVar.a;
            int i7 = (i4 + i5) - 1;
            i2 = (iArr2[i7] + iArr[i7]) - iArr2[i4];
        }
        if (this.d) {
            if (i2 < 0) {
                wzw.a("width must be >= 0");
            }
            h = s6j.h(i2, i2, 0, Integer.MAX_VALUE);
        } else {
            if (i2 < 0) {
                wzw.a("height must be >= 0");
            }
            h = s6j.h(0, Integer.MAX_VALUE, i2, i2);
        }
        long j2 = h;
        return w0(i, i4, i5, h2, g, F(this.f, i, j2), j2);
    }

    public abstract nxy w0(int i, int i2, int i3, Object obj, Object obj2, List<? extends tra0> list, long j);

    @Override // xsna.z46
    public final rty x(int i, int i2, int i3, long j) {
        uwy uwyVar = this.e;
        return w0(i, i2, i3, uwyVar.h(i), uwyVar.g(i), F(this.f, i, j), j);
    }
}
