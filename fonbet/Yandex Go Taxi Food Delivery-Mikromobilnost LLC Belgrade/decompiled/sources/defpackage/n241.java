package defpackage;

import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class n241 {
    public final tse a;
    public final y141 b;
    public final cne0 c;
    public final r0 d;
    public final gci0 e;
    public final r0 f;
    public final gci0 g;

    public n241(tse tseVar, y141 y141Var, dne0 dne0Var) {
        this.a = tseVar;
        this.b = y141Var;
        cne0 a = dne0Var.a("walk_nav_guidance_route_timestamps_storage");
        this.c = a;
        long j = a.j("route_start_timestamp", -1L);
        r0 c = bvf0.c(j == -1 ? null : Long.valueOf(j));
        this.d = c;
        this.e = e.d(c);
        r0 c2 = bvf0.c(null);
        this.f = c2;
        this.g = e.d(c2);
    }
}
