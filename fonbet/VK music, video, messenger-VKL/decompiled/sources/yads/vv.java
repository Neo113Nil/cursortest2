package yads;

import java.io.IOException;

/* loaded from: classes10.dex */
public final class vv extends IOException {
    public vv(int i) {
        super("Illegal clipping: ".concat(a(i)));
    }

    public static String a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
    }
}
