package yads;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class ab3 implements v53 {
    public final wa3 b;
    public final long[] c;
    public final Map d;
    public final Map e;
    public final Map f;

    public ab3(wa3 wa3Var, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.b = wa3Var;
        this.e = hashMap2;
        this.f = hashMap3;
        this.d = Collections.unmodifiableMap(hashMap);
        this.c = wa3Var.a();
    }

    @Override // yads.v53
    public final long a(int i) {
        return this.c[i];
    }

    @Override // yads.v53
    public final List b(long j) {
        return this.b.a(j, this.d, this.e, this.f);
    }

    @Override // yads.v53
    public final int a() {
        return this.c.length;
    }

    @Override // yads.v53
    public final int a(long j) {
        int a = mc3.a(this.c, j, false);
        if (a < this.c.length) {
            return a;
        }
        return -1;
    }
}
