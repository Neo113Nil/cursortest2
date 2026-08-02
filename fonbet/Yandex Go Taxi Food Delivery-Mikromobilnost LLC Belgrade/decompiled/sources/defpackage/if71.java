package defpackage;

import java.util.Arrays;

/* loaded from: classes7.dex */
public final class if71 extends ui81 {
    public final boolean b;
    public final boolean c;

    public if71() {
        this.b = false;
        this.c = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof if71)) {
            return false;
        }
        if71 if71Var = (if71) obj;
        return this.c == if71Var.c && this.b == if71Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public if71(boolean z) {
        this.b = true;
        this.c = z;
    }
}
