package defpackage;

import java.util.Arrays;

/* loaded from: classes7.dex */
public final class gv71 extends ui81 {
    public final float b;

    public gv71(float f) {
        cha1.c("percent must be in the range of [0, 100]", f >= 0.0f && f <= 100.0f);
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gv71) {
            return this.b == ((gv71) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.b)});
    }

    public gv71() {
        this.b = -1.0f;
    }
}
