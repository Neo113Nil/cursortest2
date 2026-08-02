package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes5.dex */
public final class hk11 implements z910 {
    public final /* synthetic */ int a;

    public hk11(int i) {
        this.a = i;
    }

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        Pair pair;
        int i;
        int i2;
        int a;
        int i3 = n8e.i(j);
        int i4 = this.a;
        if (i3 > i4) {
            i3 = i4;
        }
        int k0 = ((x910) list.get(0)).k0(n8e.h(j));
        if (k0 > i3) {
            k0 = i3;
        }
        int k02 = ((x910) list.get(1)).k0(n8e.h(j));
        if (k02 <= i3) {
            i3 = k02;
        }
        int f0 = (k0 <= 0 || i3 <= 0) ? 0 : kVar.f0(12.0f);
        int i5 = k0 > (Integer.MAX_VALUE - i3) - f0 ? Integer.MAX_VALUE : k0 + i3 + f0;
        int i6 = n8e.e(j) ? n8e.i(j) : i5;
        if (i5 > i6) {
            int max = Math.max(0, i6 - f0);
            int i7 = max > 0 ? max / 2 : 0;
            if (k0 < i7) {
                pair = new Pair(Integer.valueOf(k0), Integer.valueOf(Math.max(0, max - k0)));
            } else if (i3 < i7) {
                pair = new Pair(Integer.valueOf(Math.max(0, max - i3)), Integer.valueOf(i3));
            } else {
                if (i5 - f0 <= 0 || i5 == Integer.MAX_VALUE) {
                    i = max / 2;
                    i2 = max - i;
                } else {
                    double d = i6 * (k0 / r2);
                    if (i6 > 1073741823) {
                        if (d > 2.147483647E9d) {
                            d = 2.147483647E9d;
                        }
                        a = (int) d;
                    } else {
                        a = m810.a(d);
                    }
                    i = Math.max(0, a - (f0 / 2));
                    i2 = Math.max(0, max - i);
                }
                pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
            }
        } else {
            pair = new Pair(Integer.valueOf(k0), Integer.valueOf(i3));
        }
        int intValue = ((Number) pair.getFirst()).intValue();
        int max2 = Math.max(0, ((Number) pair.getSecond()).intValue());
        int max3 = Math.max(0, intValue);
        int max4 = Math.max(0, i6 - max2);
        o l0 = ((x910) list.get(0)).l0(n8e.b(max3, j, max3, 0, 0, 12));
        o l02 = ((x910) list.get(1)).l0(n8e.b(max2, j, max2, 0, 0, 12));
        int max5 = Math.max(l02.b, l0.b);
        return kVar.w(i6, max5, b.f(), new h1u(l0, max5, l02, max4));
    }
}
