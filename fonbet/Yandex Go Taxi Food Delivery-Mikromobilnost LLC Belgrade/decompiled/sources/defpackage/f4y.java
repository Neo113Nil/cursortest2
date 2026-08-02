package defpackage;

import java.util.List;

/* loaded from: classes10.dex */
public final class f4y {
    public final zjn a;
    public final int b;
    public final int c;
    public final e4y d;
    public final s1n e;
    public final /* synthetic */ zjn f;

    public f4y(zjn zjnVar, int i, int i2, e4y e4yVar, s1n s1nVar) {
        this.f = zjnVar;
        this.a = zjnVar;
        this.b = i;
        this.c = i2;
        this.d = e4yVar;
        this.e = s1nVar;
    }

    public final long a(int i, int i2) {
        int i3;
        zjn zjnVar = this.a;
        int[] iArr = zjnVar.a;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = zjnVar.b;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 < 0) {
            kxv.a("width must be >= 0");
        }
        return p8e.h(i3, i3, 0, Integer.MAX_VALUE);
    }

    public final k4y b(int i) {
        nzr i2 = this.e.i(i);
        int i3 = i2.a;
        int size = i2.b.size();
        int i4 = 0;
        j4y[] j4yVarArr = new j4y[size];
        int i5 = 0;
        int i6 = (size == 0 || i3 + size == this.b) ? 0 : this.c;
        while (true) {
            List list = i2.b;
            if (i4 >= size) {
                return new k4y(i, j4yVarArr, this.f, list, i6);
            }
            int i7 = (int) ((a1u) list.get(i4)).a;
            int i8 = i6;
            j4y c = this.d.c(i3 + i4, i5, i7, i8, a(i5, i7));
            i6 = i8;
            i5 += i7;
            j4yVarArr[i4] = c;
            i4++;
        }
    }
}
