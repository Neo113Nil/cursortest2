package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes10.dex */
public final class mty {
    public final ArrayDeque a;

    public mty(int i) {
        this.a = new ArrayDeque(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.a.offer(new lty());
        }
    }
}
