package xsna;

import java.util.List;
import xsna.xry;

/* compiled from: LazyGridMeasuredLineProvider.kt */
/* loaded from: classes11.dex */
public abstract class pry {
    public final boolean a;
    public final ury b;
    public final int c;
    public final int d;
    public final gry e;
    public final xry f;

    public pry(boolean z, ury uryVar, int i, int i2, gry gryVar, xry xryVar) {
        this.a = z;
        this.b = uryVar;
        this.c = i;
        this.d = i2;
        this.e = gryVar;
        this.f = xryVar;
    }

    public final long a(int i, int i2) {
        int i3;
        ury uryVar = this.b;
        int[] iArr = uryVar.a;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = uryVar.b;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (this.a) {
            if (i3 < 0) {
                wzw.a("width must be >= 0");
            }
            return s6j.h(i3, i3, 0, Integer.MAX_VALUE);
        }
        if (i3 < 0) {
            wzw.a("height must be >= 0");
        }
        return s6j.h(0, Integer.MAX_VALUE, i3, i3);
    }

    public abstract ory b(int i, nry[] nryVarArr, List<tfu> list, int i2);

    public final ory c(int i) {
        xry.c b = this.f.b(i);
        int i2 = b.a;
        List<tfu> list = b.b;
        int size = list.size();
        int i3 = (size == 0 || i2 + size == this.c) ? 0 : this.d;
        nry[] nryVarArr = new nry[size];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = (int) list.get(i5).a;
            nry w0 = this.e.w0(i2 + i5, i4, i6, i3, a(i4, i6));
            i4 += i6;
            s3q0 s3q0Var = s3q0.a;
            nryVarArr[i5] = w0;
        }
        return b(i, nryVarArr, list, i3);
    }
}
