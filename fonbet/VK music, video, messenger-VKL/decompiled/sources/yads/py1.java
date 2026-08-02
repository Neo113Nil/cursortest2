package yads;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class py1 implements c63, Serializable {
    public final int b;

    public py1(int i) {
        this.b = kx.a(i, "expectedValuesPerKey");
    }

    @Override // yads.c63
    public final Object get() {
        return new ArrayList(this.b);
    }
}
