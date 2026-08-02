package yads;

import android.os.Bundle;
import java.util.Arrays;
import xsna.vga0;

/* loaded from: classes10.dex */
public final class i73 extends rm2 {
    public static final wq e = new vga0(11);
    public final boolean c;
    public final boolean d;

    public i73() {
        this.c = false;
        this.d = false;
    }

    public static i73 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) == 3) {
            return bundle.getBoolean(Integer.toString(1, 36), false) ? new i73(bundle.getBoolean(Integer.toString(2, 36), false)) : new i73();
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i73)) {
            return false;
        }
        i73 i73Var = (i73) obj;
        return this.d == i73Var.d && this.c == i73Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    public i73(boolean z) {
        this.c = true;
        this.d = z;
    }
}
