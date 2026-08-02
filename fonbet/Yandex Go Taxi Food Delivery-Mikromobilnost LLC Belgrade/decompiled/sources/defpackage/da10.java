package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;

/* loaded from: classes10.dex */
public final class da10 implements c790 {
    public final int a;
    public final List b;
    public final long c;
    public final Object d;
    public final to5 e;
    public final LayoutDirection f;
    public final boolean g;
    public final int h;
    public final int[] i;
    public int j;
    public int k;

    public da10(int i, int i2, List list, long j, Object obj, Orientation orientation, to5 to5Var, LayoutDirection layoutDirection) {
        this.a = i;
        this.b = list;
        this.c = j;
        this.d = obj;
        this.e = to5Var;
        this.f = layoutDirection;
        this.g = orientation == Orientation.Vertical;
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            o oVar = (o) list.get(i4);
            i3 = Math.max(i3, !this.g ? oVar.b : oVar.a);
        }
        this.h = i3;
        this.i = new int[this.b.size() * 2];
        this.k = Integer.MIN_VALUE;
    }

    public final void a(int i) {
        this.j += i;
        int[] iArr = this.i;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.g;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final void b(int i, int i2, int i3) {
        int i4;
        this.j = i;
        boolean z = this.g;
        this.k = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            o oVar = (o) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.i;
            if (z) {
                iArr[i6] = Math.round((1.0f + (this.f != LayoutDirection.Ltr ? 0.0f * (-1.0f) : 0.0f)) * ((i2 - oVar.a) / 2.0f));
                iArr[i6 + 1] = i;
                i4 = oVar.b;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                to5 to5Var = this.e;
                if (to5Var == null) {
                    throw nzs.g("null verticalAlignment");
                }
                iArr[i7] = to5Var.a(oVar.b, i3);
                i4 = oVar.a;
            }
            i += i4;
        }
    }
}
