package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.List;
import kotlin.collections.b;

/* loaded from: classes11.dex */
public final class gbc implements z910 {
    public final /* synthetic */ qor a;
    public final /* synthetic */ rbn b;

    public gbc(qor qorVar, rbn rbnVar) {
        this.a = qorVar;
        this.b = rbnVar;
    }

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        aa10 w;
        x910 x910Var = (x910) list.get(0);
        x910 x910Var2 = (x910) list.get(1);
        int V = x910Var2.V(n8e.i(j));
        int V2 = x910Var.V(n8e.i(j));
        qor qorVar = this.a;
        int e = cjb1.e(V2, V, 1.0f - qorVar.getFloatValue());
        o l0 = x910Var.l0(j);
        o l02 = x910Var2.l0(n8e.b(0, j, 0, 0, e, 7));
        w = kVar.w(Math.max(l0.a, l02.a), Math.max(l0.b, l02.b), b.f(), new lc0(l02, l0, qorVar, this.b, 10));
        return w;
    }
}
