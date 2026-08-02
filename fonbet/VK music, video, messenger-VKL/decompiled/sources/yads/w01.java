package yads;

import android.os.Bundle;
import java.util.Arrays;
import xsna.g7r0;

/* loaded from: classes10.dex */
public final class w01 extends rm2 {
    public static final wq e = new g7r0(7);
    public final boolean c;
    public final boolean d;

    public w01() {
        this.c = false;
        this.d = false;
    }

    public static w01 b(Bundle bundle) {
        if (bundle.getInt(Integer.toString(0, 36), -1) == 0) {
            return bundle.getBoolean(Integer.toString(1, 36), false) ? new w01(bundle.getBoolean(Integer.toString(2, 36), false)) : new w01();
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w01)) {
            return false;
        }
        w01 w01Var = (w01) obj;
        return this.d == w01Var.d && this.c == w01Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    public w01(boolean z) {
        this.c = true;
        this.d = z;
    }
}
