package defpackage;

import java.util.List;

/* loaded from: classes10.dex */
public final class k4y {
    public final int a;
    public final j4y[] b;
    public final zjn c;
    public final List d;
    public final int e;
    public final int f;
    public final int g;

    public k4y(int i, j4y[] j4yVarArr, zjn zjnVar, List list, int i2) {
        this.a = i;
        this.b = j4yVarArr;
        this.c = zjnVar;
        this.d = list;
        this.e = i2;
        int i3 = 0;
        for (j4y j4yVar : j4yVarArr) {
            i3 = Math.max(i3, j4yVar.n);
        }
        this.f = i3;
        int i4 = i3 + this.e;
        this.g = i4 >= 0 ? i4 : 0;
    }

    public final j4y[] a(int i, int i2, int i3) {
        j4y[] j4yVarArr = this.b;
        int length = j4yVarArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            j4y j4yVar = j4yVarArr[i4];
            int i7 = i5 + 1;
            int i8 = (int) ((a1u) this.d.get(i5)).a;
            j4yVar.b(i, this.c.b[i6], i2, i3, this.a, i6);
            i6 += i8;
            i4++;
            i5 = i7;
        }
        return j4yVarArr;
    }
}
