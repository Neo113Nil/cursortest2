package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.List;
import kotlin.collections.b;

/* loaded from: classes12.dex */
public final class lk11 implements z910 {
    public final /* synthetic */ float a;
    public final /* synthetic */ to5 b;
    public final /* synthetic */ to5 c;

    public lk11(float f, to5 to5Var, to5 to5Var2) {
        this.a = f;
        this.b = to5Var;
        this.c = to5Var2;
    }

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        int k0 = ((x910) list.get(0)).k0(n8e.h(j));
        int k02 = ((x910) list.get(1)).k0(n8e.h(j));
        int f0 = kVar.f0(this.a);
        int i = k0 + k02 + f0;
        int i2 = n8e.e(j) ? n8e.i(j) : i;
        if (i > i2) {
            int i3 = i2 - f0;
            int i4 = i3 / 2;
            if (k0 >= i4) {
                if (k02 < i4) {
                    k0 = i3 - k02;
                } else {
                    k0 = m810.b(i2 * (k0 / (i - f0))) - (f0 / 2);
                }
            }
            k02 = i3 - k0;
        }
        int i5 = k0;
        o l0 = ((x910) list.get(0)).l0(n8e.b(i5, j, i5, 0, 0, 12));
        o l02 = ((x910) list.get(1)).l0(n8e.b(k02, j, k02, 0, 0, 12));
        int max = Math.max(l02.b, l0.b);
        return kVar.w(i2, max, b.f(), new kk11(l0, this.b, max, l02, i2 - k02, this.c, 0));
    }
}
