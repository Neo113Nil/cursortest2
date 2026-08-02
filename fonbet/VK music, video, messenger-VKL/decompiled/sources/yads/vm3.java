package yads;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class vm3 implements ge1 {
    public final boolean b;

    public vm3(boolean z) {
        this.b = z;
    }

    @Override // yads.ge1
    public final String a() {
        return String.format("viewable: %s", Arrays.copyOf(new Object[]{Boolean.valueOf(this.b)}, 1));
    }
}
