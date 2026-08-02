package yads;

import android.text.TextUtils;

/* loaded from: classes10.dex */
public final class rl1 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public rl1(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == rl1.class) {
            rl1 rl1Var = (rl1) obj;
            if (TextUtils.equals(this.a, rl1Var.a) && this.b == rl1Var.b && this.c == rl1Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((k4.a(this.a, 31, 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
