package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import xsna.dt1;

/* compiled from: MeasuredPage.kt */
/* loaded from: classes11.dex */
public final class kp10 implements e990 {
    public final int a;
    public final List<tra0> b;
    public final long c;
    public final Object d;
    public final dt1.b e;
    public final dt1.c f;
    public final LayoutDirection g;
    public final boolean h;
    public final int i;
    public final int[] j;
    public int k;
    public int l;

    public kp10() {
        throw null;
    }

    public kp10(int i, int i2, List list, long j, Object obj, Orientation orientation, dt1.b bVar, dt1.c cVar, LayoutDirection layoutDirection) {
        this.a = i;
        this.b = list;
        this.c = j;
        this.d = obj;
        this.e = bVar;
        this.f = cVar;
        this.g = layoutDirection;
        this.h = orientation == Orientation.Vertical;
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            tra0 tra0Var = (tra0) list.get(i4);
            i3 = Math.max(i3, !this.h ? tra0Var.c : tra0Var.b);
        }
        this.i = i3;
        this.j = new int[this.b.size() * 2];
        this.l = Integer.MIN_VALUE;
    }

    public final void a(int i) {
        this.k += i;
        int[] iArr = this.j;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.h;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final void b(int i, int i2, int i3) {
        int i4;
        this.k = i;
        boolean z = this.h;
        this.l = z ? i3 : i2;
        List<tra0> list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            tra0 tra0Var = list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.j;
            if (z) {
                dt1.b bVar = this.e;
                if (bVar == null) {
                    throw jq.f("null horizontalAlignment");
                }
                iArr[i6] = bVar.a(tra0Var.b, i2, this.g);
                iArr[i6 + 1] = i;
                i4 = tra0Var.c;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                dt1.c cVar = this.f;
                if (cVar == null) {
                    throw jq.f("null verticalAlignment");
                }
                iArr[i7] = cVar.a(tra0Var.c, i3);
                i4 = tra0Var.b;
            }
            i += i4;
        }
    }

    @Override // xsna.e990
    public final int getIndex() {
        return this.a;
    }

    @Override // xsna.e990
    public final int getOffset() {
        return this.k;
    }
}
