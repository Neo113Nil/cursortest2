package yads;

import java.util.Arrays;
import java.util.Locale;
import xsna.epx;

/* loaded from: classes10.dex */
public final class l4 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    public l4(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj;
        return this.a == l4Var.a && epx.f(this.b, l4Var.b) && epx.f(this.c, l4Var.c) && epx.f(this.d, l4Var.d);
    }

    public final int hashCode() {
        int a = k4.a(this.c, k4.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        String str = this.d;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return String.format(Locale.US, "AdFetchRequestError (code: %d, description: %s, adUnitId: %s, display_message: %s)", Arrays.copyOf(new Object[]{Integer.valueOf(this.a), this.b, this.d, this.c}, 4));
    }
}
