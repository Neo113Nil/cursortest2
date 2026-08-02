package defpackage;

import com.yandex.div.core.expression.variables.a;
import java.util.Set;

/* loaded from: classes13.dex */
public final class dac0 {
    public final bac0 a;
    public final g8c0 b;
    public final f8c0 c;
    public final a d;
    public final yvf0 e;
    public final i9c0 f;

    public dac0(bac0 bac0Var, g8c0 g8c0Var, f8c0 f8c0Var, a aVar, yvf0 yvf0Var, i9c0 i9c0Var) {
        this.a = bac0Var;
        this.b = g8c0Var;
        this.c = f8c0Var;
        this.d = aVar;
        this.e = yvf0Var;
        this.f = i9c0Var;
    }

    public static c9c0 a(dac0 dac0Var, y7c0 y7c0Var, k8c0 k8c0Var, ffe ffeVar, Set set, x8c0 x8c0Var, r7c0 r7c0Var, c8c0 c8c0Var, Set set2, String str, a aVar, int i) {
        boolean z = (i & 512) != 0;
        a aVar2 = (i & 1024) != 0 ? null : aVar;
        bac0 bac0Var = dac0Var.a;
        g8c0 g8c0Var = dac0Var.b;
        f8c0 f8c0Var = dac0Var.c;
        if (aVar2 == null) {
            aVar2 = dac0Var.d;
        }
        return bac0Var.a(y7c0Var, k8c0Var, ffeVar, set, x8c0Var, r7c0Var, g8c0Var, f8c0Var, c8c0Var, set2, z, aVar2, (o9c0) dac0Var.e.get(), str, dac0Var.f);
    }
}
