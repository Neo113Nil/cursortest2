package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes7.dex */
public final class dl61 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    public dl61(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl61)) {
            return false;
        }
        dl61 dl61Var = (dl61) obj;
        return this.a == dl61Var.a && jl40.l(this.b, dl61Var.b) && jl40.l(this.c, dl61Var.c) && jl40.l(this.d, dl61Var.d);
    }

    public final int hashCode() {
        int a = z2a1.a(z2a1.a(Integer.hashCode(this.a) * 31, this.b), this.c);
        String str = this.d;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return String.format(Locale.US, "AdFetchRequestError (code: %d, description: %s, adUnitId: %s, display_message: %s)", Arrays.copyOf(new Object[]{Integer.valueOf(this.a), this.b, this.d, this.c}, 4));
    }
}
