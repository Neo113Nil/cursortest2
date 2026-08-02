package yads;

import java.io.IOException;

/* loaded from: classes10.dex */
public final class fh1 extends IOException {
    public fh1(Throwable th) {
        super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
    }
}
