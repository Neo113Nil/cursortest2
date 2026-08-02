package yads;

import java.io.IOException;

/* loaded from: classes10.dex */
public class pc2 extends IOException {
    public final boolean b;
    public final int c;

    public pc2(String str, Exception exc, boolean z, int i) {
        super(str, exc);
        this.b = z;
        this.c = i;
    }

    public static pc2 a(String str) {
        return new pc2(str, null, true, 1);
    }

    public static pc2 b(String str) {
        return new pc2(str, null, false, 1);
    }
}
