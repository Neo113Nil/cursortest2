package yads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class cb3 implements v53 {
    public static final cb3 c = new cb3();
    public final List b;

    public cb3() {
        this.b = Collections.EMPTY_LIST;
    }

    @Override // yads.v53
    public final int a() {
        return 1;
    }

    @Override // yads.v53
    public final List b(long j) {
        return j >= 0 ? this.b : Collections.EMPTY_LIST;
    }

    @Override // yads.v53
    public final int a(long j) {
        return j < 0 ? 0 : -1;
    }

    public cb3(o20 o20Var) {
        this.b = Collections.singletonList(o20Var);
    }

    @Override // yads.v53
    public final long a(int i) {
        if (i == 0) {
            return 0L;
        }
        throw new IllegalArgumentException();
    }
}
