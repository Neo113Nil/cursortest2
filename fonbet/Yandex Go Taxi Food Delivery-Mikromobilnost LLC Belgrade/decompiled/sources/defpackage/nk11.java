package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.List;
import kotlin.collections.b;

/* loaded from: classes12.dex */
public final class nk11 implements z910 {
    public final /* synthetic */ float a;
    public final /* synthetic */ to5 b;
    public final /* synthetic */ to5 c;

    public nk11(float f, to5 to5Var, to5 to5Var2) {
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
            int i3 = i2;
            o l0 = ((x910) list.get(0)).l0(n8e.b(0, j, i3, 0, 0, 12));
            o l02 = ((x910) list.get(1)).l0(n8e.b(0, j, i3, 0, 0, 12));
            return kVar.w(i3, l0.b + l02.b + f0, b.f(), new m4p(l0, l02, f0));
        }
        int i4 = i2;
        o l03 = ((x910) list.get(0)).l0(n8e.b(k0, j, k0, 0, 0, 12));
        o l04 = ((x910) list.get(1)).l0(n8e.b(k02, j, k02, 0, 0, 12));
        int max = Math.max(l04.b, l03.b);
        return kVar.w(i4, max, b.f(), new kk11(l03, this.b, max, l04, Math.max(k0 + f0, i4 - k02), this.c, 1));
    }
}
