package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.List;
import kotlin.collections.b;

/* loaded from: classes12.dex */
public final class n4p implements z910 {
    public final /* synthetic */ float a;
    public final /* synthetic */ m3u0 b;

    public n4p(float f, m3u0 m3u0Var) {
        this.a = f;
        this.b = m3u0Var;
    }

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        int w0 = (int) kVar.w0(this.a);
        int V = ((x910) list.get(0)).V(n8e.i(j)) - w0;
        if (V < 0) {
            V = 0;
        }
        int floatValue = (int) (((Number) this.b.getValue()).floatValue() * V);
        o l0 = ((x910) list.get(1)).l0(p8e.j(0, -floatValue, j, 1));
        x910 x910Var = (x910) list.get(0);
        int i = l0.a;
        o l02 = x910Var.l0(n8e.a(i, i, 0, w0 + floatValue));
        return kVar.w(Math.max(l02.a, l0.a), y6i0.d(l0.b + floatValue, n8e.j(j), n8e.h(j)), b.f(), new m4p(floatValue, l02, l0));
    }
}
